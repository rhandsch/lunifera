/**
 */
package org.lunifera.model.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abs Named Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.model.common.AbsNamedClass#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.model.common.CommonPackage#getAbsNamedClass()
 * @model abstract="true"
 * @generated
 */
public interface AbsNamedClass extends AbsIdentifiedClass {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.lunifera.model.common.CommonPackage#getAbsNamedClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.model.common.AbsNamedClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbsNamedClass
