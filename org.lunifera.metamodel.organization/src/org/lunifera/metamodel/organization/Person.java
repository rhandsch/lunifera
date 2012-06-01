/**
 */
package org.lunifera.metamodel.organization;

import org.lunifera.metamodel.common.AbstractNamedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.organization.Person#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.Person#getEmail <em>Email</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.organization.OrganizationPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends AbstractNamedClass {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.organization.Organization#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see #setOrganization(Organization)
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getPerson_Organization()
	 * @see org.lunifera.metamodel.organization.Organization#getPersons
	 * @model opposite="persons" transient="false"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.organization.Person#getOrganization <em>Organization</em>}' container reference.
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
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getPerson_Email()
	 * @model unique="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.organization.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // Person
