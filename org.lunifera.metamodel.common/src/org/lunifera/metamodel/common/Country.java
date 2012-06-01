/**
 */
package org.lunifera.metamodel.common;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.common.Country#getStates <em>States</em>}</li>
 *   <li>{@link org.lunifera.metamodel.common.Country#getPhoneCode <em>Phone Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.common.CommonPackage#getCountry()
 * @model
 * @generated
 */
public interface Country extends AbstractNamedClass {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.common.State}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.common.State#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.lunifera.metamodel.common.CommonPackage#getCountry_States()
	 * @see org.lunifera.metamodel.common.State#getCountry
	 * @model opposite="country" containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Phone Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Code</em>' attribute.
	 * @see #setPhoneCode(int)
	 * @see org.lunifera.metamodel.common.CommonPackage#getCountry_PhoneCode()
	 * @model required="true"
	 * @generated
	 */
	int getPhoneCode();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.common.Country#getPhoneCode <em>Phone Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Code</em>' attribute.
	 * @see #getPhoneCode()
	 * @generated
	 */
	void setPhoneCode(int value);

} // Country
