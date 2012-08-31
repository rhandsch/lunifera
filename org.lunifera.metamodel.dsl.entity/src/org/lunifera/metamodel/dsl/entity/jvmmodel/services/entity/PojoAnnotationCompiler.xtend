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
package org.lunifera.metamodel.dsl.entity.jvmmodel.services.entity

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.lunifera.metamodel.entity.entitymodel.LCompilerType
import org.lunifera.metamodel.entity.entitymodel.LEntity
import org.lunifera.metamodel.entity.entitymodel.LEntityMember
import org.lunifera.metamodel.entity.entitymodel.LGenSettings
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.IAnnotationCompiler
import org.eclipse.xtext.common.types.JvmOperation
import org.lunifera.metamodel.dsl.entity.extensions.ModelExtensions

/** 
 * This class is responsible to generate the JPAAnnotations
 */
class PojoAnnotationCompiler implements IAnnotationCompiler {

	@Inject extension ModelExtensions
	@Inject extension EntityTypesBuilder
	
	override isResponsible(LCompilerType lCompilerType) {
		lCompilerType == null || lCompilerType.compilesToPojoModel
	}
	 
	override processAnnotation(LEntity lEntity, JvmGenericType jvmType, LGenSettings setting) {
		lEntity.annotations.filter([!exclude]).map([annotation]).translateAnnotationsTo(jvmType);
	}
	 
	override processAnnotation(LEntityMember member, JvmField jvmField, LGenSettings setting) {
		member.annotations.filter([!exclude]).map([annotation]).translateAnnotationsTo(jvmField);
	}
	
	override processAnnotation(LEntityMember member, JvmOperation jvmOperation, LGenSettings setting) {
		member.annotations.filter([!exclude]).map([annotation]).translateAnnotationsTo(jvmOperation);
	}

}



