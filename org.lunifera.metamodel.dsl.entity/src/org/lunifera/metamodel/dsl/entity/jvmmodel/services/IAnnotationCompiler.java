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
package org.lunifera.metamodel.dsl.entity.jvmmodel.services;

import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.lunifera.metamodel.entity.entitymodel.LCompilerType;
import org.lunifera.metamodel.entity.entitymodel.LEntity;
import org.lunifera.metamodel.entity.entitymodel.LEntityMember;
import org.lunifera.metamodel.entity.entitymodel.LGenSettings;

/**
 * Implementations of that interface have to provide annotations.
 */
public interface IAnnotationCompiler {

	/**
	 * Is responsible to decide whether the compiler should be used
	 * 
	 * @param compilerType
	 * @return
	 */
	boolean isResponsible(LCompilerType compilerType);

	/**
	 * This method can be used to add annotations to the given jvmType.
	 * 
	 * @param lEntity
	 * @param jvmType
	 * @param setting
	 * @return
	 */
	void processAnnotation(LEntity lEntity, JvmGenericType jvmType,
			LGenSettings setting);

	/**
	 * This method can be used to add annotations to the given jvmField.
	 * 
	 * @param member
	 * @param jvmField
	 * @param setting
	 * @return
	 */
	void processAnnotation(LEntityMember member, JvmField jvmField,
			LGenSettings setting);
	
	/**
	 * This method can be used to add annotations to the given jvmField.
	 * 
	 * @param member
	 * @param jvmField
	 * @param setting
	 * @return
	 */
	void processAnnotation(LEntityMember member, JvmOperation jvmOperation,
			LGenSettings setting);

}
