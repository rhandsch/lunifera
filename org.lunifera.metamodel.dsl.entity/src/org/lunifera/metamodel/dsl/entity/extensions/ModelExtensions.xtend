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
package org.lunifera.metamodel.dsl.entity.extensions
 
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.lunifera.metamodel.entity.entitymodel.EntitymodelFactory
import org.lunifera.metamodel.entity.entitymodel.LCompilerType
import org.lunifera.metamodel.entity.entitymodel.LContainer
import org.lunifera.metamodel.entity.entitymodel.LContains
import org.lunifera.metamodel.entity.entitymodel.LEmbedds
import org.lunifera.metamodel.entity.entitymodel.LEntity
import org.lunifera.metamodel.entity.entitymodel.LEntityMember
import org.lunifera.metamodel.entity.entitymodel.LEntityModel
import org.lunifera.metamodel.entity.entitymodel.LGenSettings
import org.lunifera.metamodel.entity.entitymodel.LMultiplicity
import org.lunifera.metamodel.entity.entitymodel.LProperty
import org.lunifera.metamodel.entity.entitymodel.LReference
import org.lunifera.metamodel.entity.entitymodel.LRefers
 
class ModelExtensions { 
	
	@Inject extension IQualifiedNameProvider
	
	def EntityBounds getEntityBounds(LEntityMember ref){
		EntityBounds::createFor(ref.mulitiplicity_dispatch)
	}
	
	def LMultiplicity getMulitiplicitySetting(LEntityMember ref){
		ref.mulitiplicity_dispatch
	} 
	
	def dispatch LMultiplicity getMulitiplicity_dispatch(LContainer ref){
		return null;
	}
	
	def dispatch LMultiplicity getMulitiplicity_dispatch(LContains ref){
		return ref.multiplicity
	}
	
	def dispatch LMultiplicity getMulitiplicity_dispatch(LRefers ref){
		return ref.multiplicity
	}
	
	def dispatch LMultiplicity getMulitiplicity_dispatch(LEmbedds embedds){
		return null
	}
	
	def dispatch LMultiplicity getMulitiplicity_dispatch(LProperty prop){
		return prop.multiplicity
	}
	
	def boolean isToMany(LEntityMember ref){
		ref.entityBounds.toMany
	}
	
	def boolean isRequired(LEntityMember ref){
		ref.entityBounds.required
	}
	
	def boolean isOptional(LEntityMember ref){
		ref.entityBounds.optional
	}
	
	/** 
	 * Returns the property name that is used for method signatures.
	 */
	def String toMethodParamName(LReference sourceElement) {
		return sourceElement.toMethodParamName_dispatch
	}
	
	/** 
	 * Returns the property name that is used for method signatures.
	 */
	def String toMethodParamName(LProperty sourceElement) {
		if(sourceElement.toMany && sourceElement.singularName != null){
			return sourceElement.singularName.toMethodParamName;
		}else{
			return sourceElement.toGeneratorDefaultMethodParamName;
		}
	}
	
	/** 
	 * Returns the property name that is used for method signatures.
	 */
	def dispatch String toMethodParamName_dispatch(LRefers sourceElement) {
		if(sourceElement.toMany && sourceElement.singularName != null){
			return sourceElement.singularName.toMethodParamName;
		} else{
			return sourceElement.toGeneratorDefaultMethodParamName;
		}
	}
	
	/** 
	 * Returns the property name that is used for method signatures.
	 */
	def dispatch String toMethodParamName_dispatch(LContains sourceElement) {
		if(sourceElement.toMany && sourceElement.singularName != null){
			sourceElement.singularName.toMethodParamName;
		}else{
			return sourceElement.toGeneratorDefaultMethodParamName;
		}
	}
	
	/**
	 * Returns the property name that is used for method signatures.
	 */
	def dispatch String toMethodParamName_dispatch(LContainer sourceElement) {
		return sourceElement.toGeneratorDefaultMethodParamName;
	}
	
	/**
	 * Returns the generator default method param name.
	 * The SingularName definition is not included!
	 */
	def String toGeneratorDefaultMethodParamName(LReference sourceElement) {
		if(sourceElement.type != null) {
			return sourceElement.type.name.toFirstLower.toMethodParamName;
		}else{
			return sourceElement.name.toMethodParamName;
		}
	}
	
	/**
	 * Returns the generator default method param name.
	 * The SingularName definition is not included!
	 */
	def String toGeneratorDefaultMethodParamName(LProperty sourceElement) {
		return toMethodParamName(sourceElement.getName())
	}
	
	/** 
	 * Returns the property name that is used for method signatures.
	 */
	def String toMethodParamName(LEmbedds sourceElement) {
		return sourceElement.name.toMethodParamName;
	}
	
	/** 
	 * Returns the property name that is used for method signatures.
	 */
	def String toMethodParamName(String name) {
		return String::format("%s", name);
	}
	
	/**
	 * Returns the used compiler type of the given model element.
	 * If no compiler type was specified, the entity compiler type will be returned.
	 */
	def LCompilerType compilerType(EObject eObject){
		if(eObject == null){
			var result = EntitymodelFactory::eINSTANCE.createLCompilerType;
		 	result.name = Constants::ENTITY_COMPILER_TYPE
			return result
		}
		
		var LCompilerType result = null
		 if(eObject instanceof LEntityModel){
		 	val LEntityModel model = eObject as LEntityModel
				if(model == null || model.genSettings == null){
				 	result = EntitymodelFactory::eINSTANCE.createLCompilerType;
				 	result.name = Constants::ENTITY_COMPILER_TYPE
				} else {
				 	result = model.genSettings.compilerType
				}
			
			return result
		 } else {
		 	result = compilerType(eObject.eContainer)
		 }
	}
	
	/**
	 * Returns true, if the given eObject compiles to the entity model
	 */
	def boolean compilesToEntityModel(EObject eObject) {
		eObject.compilerType.name.equals(Constants::ENTITY_COMPILER_TYPE)
	}
	
	/**
	 * Returns true, if the given eObject compiles to the JPA model
	 */
	def boolean compilesToJPAModel(EObject eObject) {
		eObject.compilerType.name.equals(Constants::JPA_COMPILER_TYPE)
	}
	
   	def isLifecycleHandling(LGenSettings settings){
   		return settings != null && settings.lifecycle
   	}
   	
   	def dispatch String concatsEmbedds(LProperty m, String baseName){
   		return baseName + "_" + m.name
   	}
   	
   	def dispatch String concatsEmbedds(LRefers m, String baseName){
   		return baseName + "_" + m.name
   	}
   	
   	def dispatch String concatsEmbedds(LContains m, String baseName){
   		return baseName + "_" + m.name
   	}
   	
   	def dispatch String concatsEmbedds(LContainer m, String baseName){
   		return baseName + "_" + m.name
   	}
   	
   	def dispatch String concatsEmbedds(LEmbedds m, String baseName){
   		return baseName + "_" + m.name
   	}
   	
   	/**
   	 * Returns true, if toCheck can be cast to superType
   	 */
   	def boolean isCastable(LEntity toCheck, LEntity superType){
   		val String toCheckFqn = toCheck.fullyQualifiedName.toString
   		val String superTypeFqn = superType.fullyQualifiedName.toString
   		
   		if(toCheckFqn.equals(superTypeFqn)){
   			return true
   		} else {
   			val LEntity toCheckSuperType = toCheck.superType
   			if(toCheckSuperType != null){
   				return toCheckSuperType.isCastable(superType)
   			}else{
   				return false;
   			}
   		}
   	}
   	
 	/**
   	 * Returns true, if toCheck can be cast to superType
   	 */
   	def boolean nameEquals(LEntity toCheck, LEntity superType){
   		val String toCheckFqn = toCheck.fullyQualifiedName.toString
   		val String superTypeFqn = superType.fullyQualifiedName.toString
   		
   		return toCheckFqn.equals(superTypeFqn);
   	}
}