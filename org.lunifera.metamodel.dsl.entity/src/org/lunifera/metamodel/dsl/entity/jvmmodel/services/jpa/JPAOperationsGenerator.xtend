/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Sources generated by Xtext  
 * 
 * Contributors:
 *  		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.dsl.entity.jvmmodel.services.jpa

import org.lunifera.metamodel.dsl.entity.jvmmodel.services.entity.EntityOperationsGenerator
import org.lunifera.metamodel.entity.entitymodel.LEmbedds
import org.lunifera.metamodel.entity.entitymodel.LGenSettings
import org.eclipse.xtext.common.types.JvmTypeReference
import org.lunifera.metamodel.entity.entitymodel.LCompilerType
import org.lunifera.metamodel.dsl.entity.extensions.Constants

class JPAOperationsGenerator extends EntityOperationsGenerator{
	
	override isResponsible(LCompilerType lCompilerType) {
		lCompilerType != null && Constants::JPA_COMPILER_TYPE.equals(lCompilerType.name)
	}
	
	override get_toOne_Embedds_Documentantion(LEmbedds embedds, String fieldName, LGenSettings setting) '''
	Returns the «fieldName» reference or <code>null</code> if not present.
	@return «fieldName»'''
	
	override get_toOne_Embedds_OperationContent(LEmbedds embedds, String fieldName, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»
	return this.«fieldName»;'''
	
	override set_toOne_Embedds_Documentantion(LEmbedds embedds, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	Sets the «localVarName» property to this instance.

	@param «localVarName»'''
	
	override set_toOne_Embedds_OperationContent(LEmbedds embedds, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»
	this.«fieldName» = «localVarName»;'''
}