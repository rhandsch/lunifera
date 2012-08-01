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
package org.lunifera.metamodel.dsl.entity.jvmmodel;

import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.lunifera.metamodel.dsl.entity.entitymodel.LContainer;
import org.lunifera.metamodel.dsl.entity.entitymodel.LContains;
import org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings;
import org.lunifera.metamodel.dsl.entity.entitymodel.LProperty;
import org.lunifera.metamodel.dsl.entity.entitymodel.LReference;
import org.lunifera.metamodel.dsl.entity.entitymodel.LRefers;

/**
 * Implementations of that interface can provide annotations for the different
 * kind of entity methods.
 */
public interface IAnnotationProvider {

	/**
	 * The getter for properties with an upper bound of 1.
	 * 
	 * @param jvmOperation
	 * @param property
	 * @param fieldName
	 * @param setting
	 * @return
	 */
	CharSequence method_get_toOne_Property(JvmOperation jvmOperation,
			LProperty property, String fieldName, LGenSettings setting);

	/**
	 * The getter for references with an upper bound of 1.
	 * 
	 * @param jvmOperation
	 * @param ref
	 * @param fieldName
	 * @param setting
	 * @return
	 */
	CharSequence method_get_toOne_Reference(JvmOperation jvmOperation,
			LRefers ref, String fieldName, LGenSettings setting);

	/**
	 * The getter for references with an upper bound of 1.
	 * 
	 * @param jvmOperation
	 * @param ref
	 * @param fieldName
	 * @param setting
	 * @return
	 */
	CharSequence method_get_toOne_Containment(JvmOperation jvmOperation,
			LContains ref, String fieldName, LGenSettings setting);

	/**
	 * The setter for properties with an upper bound of 1.
	 * 
	 * @param jvmOperation
	 * @param ref
	 * @param propertyName
	 * @param fieldName
	 * @param setting
	 * @return
	 */
	CharSequence method_set_toOne_Property(JvmOperation jvmOperation,
			LProperty ref, String propertyName, String fieldName,
			LGenSettings setting);

	/**
	 * The setter for references with upper bound 1.
	 * 
	 * @param jvmOperation
	 * @param ref
	 * @param propertyName
	 * @param fieldName
	 * @param typeRef
	 * @param setting
	 * @return
	 */
	CharSequence method_set_toOne_Refers(JvmOperation jvmOperation,
			LRefers ref, String propertyName, String fieldName,
			JvmTypeReference typeRef, LGenSettings setting);

	/**
	 * The setter for container references with upper bound 1.
	 * 
	 * @param jvmOperation
	 * @param ref
	 * @param propertyName
	 * @param fieldName
	 * @param typeRef
	 * @param setting
	 * @return
	 */
	CharSequence method_set_toOne_Container(JvmOperation jvmOperation,
			LContainer ref, String propertyName, String fieldName,
			JvmTypeReference typeRef, LGenSettings setting);

	/**
	 * The setter for containment references with upper bound 1.
	 * 
	 * @param jvmOperation
	 * @param ref
	 * @param propertyName
	 * @param fieldName
	 * @param typeRef
	 * @param setting
	 * @return
	 */
	CharSequence method_set_toOne_Containment(JvmOperation jvmOperation,
			LContains ref, String propertyName, String fieldName,
			JvmTypeReference typeRef, LGenSettings setting);

	/**
	 * The getter for references with upper bound of *.<br>
	 * Attention: The given reference can be of type {@link LRefers} or
	 * {@link LContains}.
	 * 
	 * @param jvmOperation
	 * @param ref
	 * @param fieldName
	 * @param typeRef
	 * @param setting
	 * @return
	 */
	CharSequence method_get_toMany_Reference(JvmOperation jvmOperation,
			LReference ref, String fieldName, JvmTypeReference typeRef,
			LGenSettings setting);

	/**
	 * The add method for refers references with upper bound of *.
	 * 
	 * @param jvmOperation
	 * @param ref
	 * @param propertyName
	 * @param fieldName
	 * @param typeRef
	 * @param setting
	 * @return
	 */
	CharSequence method_add_toMany_Refers(JvmOperation jvmOperation,
			LRefers ref, String propertyName, String fieldName,
			JvmTypeReference typeRef, LGenSettings setting);

	/**
	 * The remove method of refers references with upper bound of *.
	 * 
	 * @param jvmOperation
	 * @param ref
	 * @param propertyName
	 * @param fieldName
	 * @param typeRef
	 * @param setting
	 * @return
	 */
	CharSequence method_remove_toMany_Refers(JvmOperation jvmOperation,
			LRefers ref, String propertyName, String fieldName,
			JvmTypeReference typeRef, LGenSettings setting);

	/**
	 * The add method of containment references with upper bound of *.
	 * 
	 * @param jvmOperation
	 * @param ref
	 * @param propertyName
	 * @param fieldName
	 * @param typeRef
	 * @param setting
	 * @return
	 */
	CharSequence method_add_toMany_Containment(JvmOperation jvmOperation,
			LContains ref, String propertyName, String fieldName,
			JvmTypeReference typeRef, LGenSettings setting);

	/**
	 * The remove method of containment references with upper bound of *.
	 * 
	 * @param jvmOperation
	 * @param ref
	 * @param propertyName
	 * @param fieldName
	 * @param typeRef
	 * @param setting
	 * @return
	 */
	CharSequence method_remove_toMany_Containmant(JvmOperation jvmOperation,
			LContains ref, String propertyName, String fieldName,
			JvmTypeReference typeRef, LGenSettings setting);
}
