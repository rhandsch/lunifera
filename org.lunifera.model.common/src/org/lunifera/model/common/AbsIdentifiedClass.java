/**
 */
package org.lunifera.model.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abs Identified Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the base class for all Hawkdev classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.model.common.AbsIdentifiedClass#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.model.common.CommonPackage#getAbsIdentifiedClass()
 * @model abstract="true"
 * @generated
 */
public interface AbsIdentifiedClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.lunifera.model.common.CommonPackage#getAbsIdentifiedClass_Id()
	 * @model id="true" required="true"
	 *        extendedMetaData="name='id' namespace='http://c4biz.com/hawkdev/model/1.0'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.lunifera.model.common.AbsIdentifiedClass#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // AbsIdentifiedClass
