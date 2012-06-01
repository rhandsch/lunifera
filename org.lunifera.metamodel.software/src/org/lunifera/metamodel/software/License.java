/**
 */
package org.lunifera.metamodel.software;

import org.lunifera.metamodel.common.AbstractIdentifiedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>License</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.software.License#isFree <em>Free</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.License#isOpenSource <em>Open Source</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.License#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.software.SoftwarePackage#getLicense()
 * @model
 * @generated
 */
public interface License extends AbstractIdentifiedClass {
	/**
	 * Returns the value of the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free</em>' attribute.
	 * @see #setFree(boolean)
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getLicense_Free()
	 * @model
	 * @generated
	 */
	boolean isFree();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.software.License#isFree <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free</em>' attribute.
	 * @see #isFree()
	 * @generated
	 */
	void setFree(boolean value);

	/**
	 * Returns the value of the '<em><b>Open Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Source</em>' attribute.
	 * @see #setOpenSource(boolean)
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getLicense_OpenSource()
	 * @model
	 * @generated
	 */
	boolean isOpenSource();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.software.License#isOpenSource <em>Open Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Source</em>' attribute.
	 * @see #isOpenSource()
	 * @generated
	 */
	void setOpenSource(boolean value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getLicense_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.software.License#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // License
