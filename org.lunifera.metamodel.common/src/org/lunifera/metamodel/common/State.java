/**
 */
package org.lunifera.metamodel.common;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.common.State#getCountry <em>Country</em>}</li>
 *   <li>{@link org.lunifera.metamodel.common.State#getCities <em>Cities</em>}</li>
 *   <li>{@link org.lunifera.metamodel.common.State#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.common.CommonPackage#getState()
 * @model
 * @generated
 */
public interface State extends AbstractNamedClass {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.common.Country#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' container reference.
	 * @see #setCountry(Country)
	 * @see org.lunifera.metamodel.common.CommonPackage#getState_Country()
	 * @see org.lunifera.metamodel.common.Country#getStates
	 * @model opposite="states" required="true" transient="false"
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.common.State#getCountry <em>Country</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' container reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

	/**
	 * Returns the value of the '<em><b>Cities</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.common.City}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.common.City#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cities</em>' containment reference list.
	 * @see org.lunifera.metamodel.common.CommonPackage#getState_Cities()
	 * @see org.lunifera.metamodel.common.City#getState
	 * @model opposite="state" containment="true"
	 * @generated
	 */
	EList<City> getCities();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.lunifera.metamodel.common.CommonPackage#getState_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.common.State#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // State
