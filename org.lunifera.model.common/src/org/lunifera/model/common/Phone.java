/**
 */
package org.lunifera.model.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.model.common.Phone#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.model.common.Phone#getNumber <em>Number</em>}</li>
 *   <li>{@link org.lunifera.model.common.Phone#getCompany <em>Company</em>}</li>
 *   <li>{@link org.lunifera.model.common.Phone#getRegionCode <em>Region Code</em>}</li>
 *   <li>{@link org.lunifera.model.common.Phone#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.model.common.CommonPackage#getPhone()
 * @model
 * @generated
 */
public interface Phone extends AbsIdentifiedClass {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.model.common.PhoneType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.lunifera.model.common.PhoneType
	 * @see #setType(PhoneType)
	 * @see org.lunifera.model.common.CommonPackage#getPhone_Type()
	 * @model required="true"
	 * @generated
	 */
	PhoneType getType();

	/**
	 * Sets the value of the '{@link org.lunifera.model.common.Phone#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.lunifera.model.common.PhoneType
	 * @see #getType()
	 * @generated
	 */
	void setType(PhoneType value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see org.lunifera.model.common.CommonPackage#getPhone_Number()
	 * @model required="true"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link org.lunifera.model.common.Phone#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Company</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' reference.
	 * @see #setCompany(PhoneCompany)
	 * @see org.lunifera.model.common.CommonPackage#getPhone_Company()
	 * @model
	 * @generated
	 */
	PhoneCompany getCompany();

	/**
	 * Sets the value of the '{@link org.lunifera.model.common.Phone#getCompany <em>Company</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' reference.
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(PhoneCompany value);

	/**
	 * Returns the value of the '<em><b>Region Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Code</em>' attribute.
	 * @see #setRegionCode(int)
	 * @see org.lunifera.model.common.CommonPackage#getPhone_RegionCode()
	 * @model required="true"
	 * @generated
	 */
	int getRegionCode();

	/**
	 * Sets the value of the '{@link org.lunifera.model.common.Phone#getRegionCode <em>Region Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Code</em>' attribute.
	 * @see #getRegionCode()
	 * @generated
	 */
	void setRegionCode(int value);

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
	 * @see org.lunifera.model.common.CommonPackage#getPhone_Country()
	 * @model required="true"
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link org.lunifera.model.common.Phone#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

} // Phone
