/**
 */
package org.lunifera.model.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phone Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.model.common.PhoneCompany#getCode <em>Code</em>}</li>
 *   <li>{@link org.lunifera.model.common.PhoneCompany#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.model.common.CommonPackage#getPhoneCompany()
 * @model
 * @generated
 */
public interface PhoneCompany extends AbsNamedClass {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see org.lunifera.model.common.CommonPackage#getPhoneCompany_Code()
	 * @model required="true"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link org.lunifera.model.common.PhoneCompany#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(Country)
	 * @see org.lunifera.model.common.CommonPackage#getPhoneCompany_Country()
	 * @model required="true"
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link org.lunifera.model.common.PhoneCompany#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

} // PhoneCompany
