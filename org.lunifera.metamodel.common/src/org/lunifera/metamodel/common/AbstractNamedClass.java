/**
 */
package org.lunifera.metamodel.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Named Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.common.AbstractNamedClass#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.common.CommonPackage#getAbstractNamedClass()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNamedClass extends AbstractIdentifiedClass {
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
	 * @see org.lunifera.metamodel.common.CommonPackage#getAbstractNamedClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.common.AbstractNamedClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractNamedClass
