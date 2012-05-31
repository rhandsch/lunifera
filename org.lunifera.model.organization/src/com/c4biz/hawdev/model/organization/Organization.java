/**
 */
package com.c4biz.hawdev.model.organization;

import org.eclipse.emf.common.util.EList;

import org.lunifera.model.common.AbsDescribedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the base class for all Hawkdev classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.c4biz.hawdev.model.organization.Organization#getUnits <em>Units</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.Organization#getPersons <em>Persons</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.Organization#getWorkers <em>Workers</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.Organization#getRoles <em>Roles</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.Organization#getPartners <em>Partners</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.Organization#getContact <em>Contact</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.Organization#getUnitTypes <em>Unit Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends AbsDescribedClass {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link com.c4biz.hawdev.model.organization.Unit}.
	 * It is bidirectional and its opposite is '{@link com.c4biz.hawdev.model.organization.Unit#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getOrganization_Units()
	 * @see com.c4biz.hawdev.model.organization.Unit#getOrganization
	 * @model opposite="organization" containment="true"
	 * @generated
	 */
	EList<Unit> getUnits();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link com.c4biz.hawdev.model.organization.Person}.
	 * It is bidirectional and its opposite is '{@link com.c4biz.hawdev.model.organization.Person#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getOrganization_Persons()
	 * @see com.c4biz.hawdev.model.organization.Person#getOrganization
	 * @model opposite="organization" containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Workers</b></em>' containment reference list.
	 * The list contents are of type {@link com.c4biz.hawdev.model.organization.Worker}.
	 * It is bidirectional and its opposite is '{@link com.c4biz.hawdev.model.organization.Worker#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workers</em>' containment reference list.
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getOrganization_Workers()
	 * @see com.c4biz.hawdev.model.organization.Worker#getOrganization
	 * @model opposite="organization" containment="true"
	 * @generated
	 */
	EList<Worker> getWorkers();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link com.c4biz.hawdev.model.organization.Role}.
	 * It is bidirectional and its opposite is '{@link com.c4biz.hawdev.model.organization.Role#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getOrganization_Roles()
	 * @see com.c4biz.hawdev.model.organization.Role#getOrganization
	 * @model opposite="organization" containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Partners</b></em>' reference list.
	 * The list contents are of type {@link com.c4biz.hawdev.model.organization.Organization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partners</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partners</em>' reference list.
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getOrganization_Partners()
	 * @model
	 * @generated
	 */
	EList<Organization> getPartners();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' reference.
	 * @see #setContact(Person)
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getOrganization_Contact()
	 * @model
	 * @generated
	 */
	Person getContact();

	/**
	 * Sets the value of the '{@link com.c4biz.hawdev.model.organization.Organization#getContact <em>Contact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' reference.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(Person value);

	/**
	 * Returns the value of the '<em><b>Unit Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.c4biz.hawdev.model.organization.UnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Types</em>' containment reference list.
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getOrganization_UnitTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnitType> getUnitTypes();

} // Organization
