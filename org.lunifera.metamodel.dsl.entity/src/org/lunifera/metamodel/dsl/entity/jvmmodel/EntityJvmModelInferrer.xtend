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
package org.lunifera.metamodel.dsl.entity.jvmmodel

import com.google.inject.Inject
import com.google.inject.name.Named
import java.util.List
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.lunifera.metamodel.entity.entitymodel.LCompilerType
import org.lunifera.metamodel.entity.entitymodel.LEntity
import org.lunifera.metamodel.entity.entitymodel.LEntityModel
import org.lunifera.metamodel.entity.entitymodel.LEnum
import org.lunifera.metamodel.dsl.entity.extensions.Constants
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.IEntityJvmModelInferrerDelegate
import org.lunifera.metamodel.entity.entitymodel.LPackage

class EntityJvmModelInferrer extends AbstractModelInferrer {
	
	@Inject 
	@Named(Constants::ENTITY_COMPILER_TYPE)
	IEntityJvmModelInferrerDelegate entityModelInferrer
	
	@Inject 
	@Named(Constants::JPA_COMPILER_TYPE)
	IEntityJvmModelInferrerDelegate jpaModelInferrer
	 
	List<IEntityJvmModelInferrerDelegate> delegates;
	
	def isResponsible(LCompilerType lCompilerType) {
		return true
	}
	
	def dispatch infer(LEntity e, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		val LPackage pkg = e.eContainer as LPackage;
		val LEntityModel model = pkg.eContainer as LEntityModel;
		if(model == null){
			return;
		}
		
		if(model.genSettings == null || model.genSettings.compilerType == null){
			entityModelInferrer.infer(e, acceptor, isPrelinkingPhase)
		} else if(jpaModelInferrer.isResponsible(model.genSettings.compilerType)){
			jpaModelInferrer.infer(e, acceptor, isPrelinkingPhase)
		} else if(entityModelInferrer.isResponsible(model.genSettings.compilerType)){
			entityModelInferrer.infer(e, acceptor, isPrelinkingPhase)
		}
	}
	
	def dispatch infer(LEnum e, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		val LPackage pkg = e.eContainer as LPackage;
		val LEntityModel model = pkg.eContainer as LEntityModel;
		if(model == null){
			return;
		}
		
		if(model.genSettings == null || model.genSettings.compilerType == null){
			entityModelInferrer.infer(e, acceptor, isPrelinkingPhase)
		} else if(jpaModelInferrer.isResponsible(model.genSettings.compilerType)){
			jpaModelInferrer.infer(e, acceptor, isPrelinkingPhase)
		} else if(entityModelInferrer.isResponsible(model.genSettings.compilerType)){
			entityModelInferrer.infer(e, acceptor, isPrelinkingPhase)
		}
	}
	
	def IEntityJvmModelInferrerDelegate findDelegate(LEntityModel model){
		if(delegates == null){
			delegates = newArrayList
			delegates.add(entityModelInferrer)
			delegates.add(jpaModelInferrer)
		} 
		
		return delegates.findFirst([
			var LCompilerType compilerType;
			if(model == null || model.genSettings == null ){
				compilerType = null;
			} else {
				compilerType = model.genSettings.compilerType
			}
			return isResponsible(compilerType)
		])
	}
	
}