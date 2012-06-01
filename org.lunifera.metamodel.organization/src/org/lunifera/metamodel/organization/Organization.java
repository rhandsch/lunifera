/**
 */
package org.lunifera.metamodel.organization;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.common.AbstractDescribedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.organization.Organization#getUnits <em>Units</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.Organization#getPersons <em>Persons</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.Organization#getWorkers <em>Workers</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.Organization#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.Organization#getPartners <em>Partners</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.Organization#getMainContact <em>Main Contact</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.Organization#getUnitTypes <em>Unit Types</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.Organization#getSecurityRealms <em>Security Realms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.organization.OrganizationPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends AbstractDescribedClass {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.organization.Unit}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.organization.Unit#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getOrganization_Units()
	 * @see org.lunifera.metamodel.organization.Unit#getOrganization
	 * @model opposite="organization" containment="true"
	 * @generated
	 */
	EList<Unit> getUnits();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.organization.Person}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.organization.Person#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getOrganization_Persons()
	 * @see org.lunifera.metamodel.organization.Person#getOrganization
	 * @model opposite="organization" containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Workers</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.organization.Worker}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.organization.Worker#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workers</em>' containment reference list.
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getOrganization_Workers()
	 * @see org.lunifera.metamodel.organization.Worker#getOrganization
	 * @model opposite="organization" containment="true"
	 * @generated
	 */
	EList<Worker> getWorkers();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.organization.BusinessRole}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.organization.BusinessRole#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getOrganization_Roles()
	 * @see org.lunifera.metamodel.organization.BusinessRole#getOrganization
	 * @model opposite="organization" containment="true"
	 * @generated
	 */
	EList<BusinessRole> getRoles();

	/**
	 * Returns the value of the '<em><b>Partners</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.organization.Organization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partners</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partners</em>' reference list.
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getOrganization_Partners()
	 * @model
	 * @generated
	 */
	EList<Organization> getPartners();

	/**
	 * Returns the value of the '<em><b>Main Contact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Contact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Contact</em>' reference.
	 * @see #setMainContact(Person)
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getOrganization_MainContact()
	 * @model
	 * @generated
	 */
	Person getMainContact();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.organization.Organization#getMainContact <em>Main Contact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Contact</em>' reference.
	 * @see #getMainContact()
	 * @generated
	 */
	void setMainContact(Person value);

	/**
	 * Returns the value of the '<em><b>Unit Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.organization.UnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Types</em>' containment reference list.
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getOrganization_UnitTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnitType> getUnitTypes();

	/**
	 * Returns the value of the '<em><b>Security Realms</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.organization.SecurityRealm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Realms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Realms</em>' containment reference list.
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getOrganization_SecurityRealms()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityRealm> getSecurityRealms();

} // Organization
