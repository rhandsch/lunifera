/**
 */
package com.c4biz.hawdev.model.organization;

import org.lunifera.model.common.AbsNamedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the base class for all Hawkdev classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.c4biz.hawdev.model.organization.Person#getOrganization <em>Organization</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.Person#getEmail <em>Email</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends AbsNamedClass {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.c4biz.hawdev.model.organization.Organization#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see #setOrganization(Organization)
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getPerson_Organization()
	 * @see com.c4biz.hawdev.model.organization.Organization#getPersons
	 * @model opposite="persons" transient="false"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link com.c4biz.hawdev.model.organization.Person#getOrganization <em>Organization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' container reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getPerson_Email()
	 * @model unique="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link com.c4biz.hawdev.model.organization.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // Person
