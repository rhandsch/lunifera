/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.dsl.entity.jvmmodel.services.jpa

import com.google.inject.Inject
import com.google.inject.name.Named
import javax.persistence.Cacheable
import javax.persistence.CascadeType
import javax.persistence.Embeddable
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.OneToOne
import javax.persistence.Transient
import javax.persistence.Version
import org.eclipse.xtext.common.types.JvmAnnotationReference
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.lunifera.metamodel.dsl.entity.entitymodel.LCompilerType
import org.lunifera.metamodel.dsl.entity.entitymodel.LContainer
import org.lunifera.metamodel.dsl.entity.entitymodel.LContains
import org.lunifera.metamodel.dsl.entity.entitymodel.LEmbedds
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntity
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntityMember
import org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings
import org.lunifera.metamodel.dsl.entity.entitymodel.LProperty
import org.lunifera.metamodel.dsl.entity.entitymodel.LRefers
import org.lunifera.metamodel.dsl.entity.extensions.AnnotationExtension
import org.lunifera.metamodel.dsl.entity.extensions.Constants
import org.lunifera.metamodel.dsl.entity.extensions.EntityBounds
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.IAnnotationCompiler
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.entity.EntityTypesBuilder
import org.eclipse.xtext.common.types.JvmOperation

/** 
 * This class is responsible to generate the Annotations defined in the entity model
 */
class JPAAnnotationCompiler implements IAnnotationCompiler {
	
	@Inject extension EntityTypesBuilder
	@Inject extension AnnotationExtension
 	@Inject 
 	@Named(Constants::ENTITY_COMPILER_TYPE)  
 	IAnnotationCompiler entityAnnotationCompiler
 
 
	override isResponsible(LCompilerType lCompilerType) {
		lCompilerType != null && Constants::JPA_COMPILER_TYPE.equals(lCompilerType.name)
	}
	
	override processAnnotation(LEntity lEntity, JvmGenericType jvmType, LGenSettings setting) {
		// use the entity annotation compiler that compiles the annotations specified in the model
		entityAnnotationCompiler.processAnnotation(lEntity,  jvmType, setting)
		
		if(!lEntity.entityAnnoExcluded && !jvmType.isEntityAnnoCreated(lEntity)) {
			jvmType.annotations += lEntity.toAnnotation(typeof(Entity))
		}
 
		if(lEntity.cachable && !lEntity.cachableAnnoExcluded && !jvmType.isCacheableAnnoCreated(lEntity)){
			jvmType.annotations += lEntity.toAnnotation(typeof(Cacheable))
		}
		if(lEntity.embeddable && !lEntity.embeddableAnnoExcluded && !jvmType.isEmbeddableAnnoCreated(lEntity)){
			jvmType.annotations += lEntity.toAnnotation(typeof(Embeddable))
		}
	}
	
	override processAnnotation(LEntityMember member, JvmOperation jvmOperation, LGenSettings setting) {
		// use the entity annotation compiler that compiles the annotations specified in the model
		entityAnnotationCompiler.processAnnotation(member,  jvmOperation, setting)
	}
	 
	override processAnnotation(LEntityMember member, JvmField jvmField, LGenSettings setting) {
		// use the entity annotation compiler that compiles the annotations specified in the model
		entityAnnotationCompiler.processAnnotation(member,  jvmField,  setting)
		
		processAnnotation_dispatch(member, jvmField, setting)
	}

	def dispatch void processAnnotation_dispatch(LProperty lProp, JvmField jvmField, LGenSettings setting) {
		if(lProp.id){
			if(!lProp.idAnnoExcluded && !jvmField.isIdAnnoCreated(lProp)){
				// there is no redefine
				jvmField.annotations += lProp.toAnnotation(typeof(Id))
			}
			// do not generate this annotation 
//			if(!lProp.isGeneratedValueAnnoExcluded() && !jvmField.generatedValueAnnoCreated){
//				jvmField.annotations += lProp.toAnnotation(typeof(GeneratedValue))
//			}
		}
		if(lProp.version && !lProp.versionAnnoExcluded && !jvmField.isVersionAnnoCreated(lProp)){
			jvmField.annotations += lProp.toAnnotation(typeof(Version))
		}
		if(lProp.transient && !lProp.transientAnnoExcluded && !jvmField.isTransientAnnoCreated(lProp)){
			jvmField.annotations += lProp.toAnnotation(typeof(Transient))
		}
	}
	
	def dispatch void processAnnotation_dispatch(LRefers refers, JvmField jvmField, LGenSettings setting) {
		val bounds = EntityBounds::createFor(refers.multiplicity)
		if(bounds.toMany){
			if(!refers.oneToManyAnnoExcluded && !jvmField.isOneToManyValueAnnoCreated(refers)){
				val JvmAnnotationReference annRef = refers.toAnnotation(typeof(OneToMany))
				jvmField.annotations+=annRef
				if(refers.lazy){
					annRef.addEnumAnnotationValue(refers, "fetch", FetchType::LAZY)
				}
			}
		}else{
			if(!refers.oneToOneAnnoRedefined && !jvmField.isOneToOneAnnoCreated(refers)){
				val JvmAnnotationReference annRef = refers.toAnnotation(typeof(OneToOne))
				jvmField.annotations+=annRef
				if(refers.lazy){
					annRef.addEnumAnnotationValue(refers, "fetch", FetchType::LAZY)
				}
				if(refers.notnull){
					annRef.addBooleanAnnotationValue(refers, "optional", false)
				}
			}
		}
	}
	
	def dispatch void processAnnotation_dispatch(LEmbedds embedds, JvmField jvmField, LGenSettings setting) {
		if(!embedds.isEmbeddedAnnoExcluded() && !jvmField.isEmbeddedAnnoCreated(embedds)) {
			val JvmAnnotationReference annRef = embedds.toAnnotation(typeof(Embedded))
			jvmField.annotations+=annRef
		}
	}
	
	def dispatch void processAnnotation_dispatch(LContains contains, JvmField jvmField, LGenSettings setting) {
		val bounds = EntityBounds::createFor(contains.multiplicity)
		if(bounds.toMany){
			if(!contains.oneToManyAnnoExcluded && !jvmField.isOneToManyValueAnnoCreated(contains)){
				val JvmAnnotationReference annRef = contains.toAnnotation(typeof(OneToMany))
				annRef.addEnumAnnotationValue(contains, "cascade", CascadeType::ALL)
				
				jvmField.annotations+=annRef
				if(contains.lazy){
					annRef.addEnumAnnotationValue(contains, "fetch", FetchType::LAZY)
				}
				if(contains.opposite != null){
					val LContainer container = contains.opposite
					annRef.addStringAnnotationValue(contains, "mappedBy", container.name)
				}
			}
		}else{
			if(!contains.oneToOneAnnoExcluded && !jvmField.isOneToOneAnnoCreated(contains)){
				val JvmAnnotationReference annRef = contains.toAnnotation(typeof(OneToOne))
				annRef.addEnumAnnotationValue(contains, "cascade", CascadeType::ALL)
				
				jvmField.annotations+=annRef
				if(contains.lazy){
					annRef.addEnumAnnotationValue(contains, "fetch", FetchType::LAZY)
				}
				if(contains.notnull){
					annRef.addBooleanAnnotationValue(contains, "optional", false)
				}
				
				if(contains.opposite != null){
					val LContainer container = contains.opposite
					annRef.addStringAnnotationValue(contains, "mappedBy", container.name)
				}
			}
		}
	}
	
	def dispatch void processAnnotation_dispatch(LContainer container, JvmField jvmField, LGenSettings setting) {
		val opposite = container.opposite
		if(opposite == null){
			// nothing to generate
		} else {
			val oppositeBounds = EntityBounds::createFor(opposite.multiplicity)
			if(oppositeBounds.toMany){
				if(!container.oneToOneAnnoExcluded && !jvmField.isOneToOneAnnoCreated(container)){
					val JvmAnnotationReference annRef = container.toAnnotation(typeof(ManyToOne))
					annRef.addBooleanAnnotationValue(container, "optional", false)
				}
			}else{
				if(!container.oneToOneAnnoExcluded && !jvmField.isOneToOneAnnoCreated(container)){
					val JvmAnnotationReference annRef = container.toAnnotation(typeof(OneToOne))
					annRef.addBooleanAnnotationValue(container, "optional", false)
				}
			}
		}
	}
}






