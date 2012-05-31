/**
 */
package com.c4biz.hawdev.model.organization;

import org.eclipse.emf.common.util.EList;

import org.lunifera.model.common.AbsIdentifiedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the base class for all Hawkdev classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.c4biz.hawdev.model.organization.Worker#getOrganization <em>Organization</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.Worker#getPerson <em>Person</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.Worker#getAllocationUnit <em>Allocation Unit</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.Worker#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getWorker()
 * @model
 * @generated
 */
public interface Worker extends AbsIdentifiedClass {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.c4biz.hawdev.model.organization.Organization#getWorkers <em>Workers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see #setOrganization(Organization)
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getWorker_Organization()
	 * @see com.c4biz.hawdev.model.organization.Organization#getWorkers
	 * @model opposite="workers" required="true" transient="false"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link com.c4biz.hawdev.model.organization.Worker#getOrganization <em>Organization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' container reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getWorker_Person()
	 * @model required="true"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link com.c4biz.hawdev.model.organization.Worker#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Allocation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Unit</em>' reference.
	 * @see #setAllocationUnit(Unit)
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getWorker_AllocationUnit()
	 * @model
	 * @generated
	 */
	Unit getAllocationUnit();

	/**
	 * Sets the value of the '{@link com.c4biz.hawdev.model.organization.Worker#getAllocationUnit <em>Allocation Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Unit</em>' reference.
	 * @see #getAllocationUnit()
	 * @generated
	 */
	void setAllocationUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link com.c4biz.hawdev.model.organization.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getWorker_Roles()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles();

} // Worker
