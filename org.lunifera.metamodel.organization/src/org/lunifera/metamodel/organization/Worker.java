/**
 */
package org.lunifera.metamodel.organization;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.common.AbstractIdentifiedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.organization.Worker#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.Worker#getPerson <em>Person</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.Worker#getAllocationUnit <em>Allocation Unit</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.Worker#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.Worker#getWorkerType <em>Worker Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.organization.OrganizationPackage#getWorker()
 * @model
 * @generated
 */
public interface Worker extends AbstractIdentifiedClass {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.organization.Organization#getWorkers <em>Workers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see #setOrganization(Organization)
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getWorker_Organization()
	 * @see org.lunifera.metamodel.organization.Organization#getWorkers
	 * @model opposite="workers" required="true" transient="false"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.organization.Worker#getOrganization <em>Organization</em>}' container reference.
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
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getWorker_Person()
	 * @model required="true"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.organization.Worker#getPerson <em>Person</em>}' reference.
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
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getWorker_AllocationUnit()
	 * @model
	 * @generated
	 */
	Unit getAllocationUnit();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.organization.Worker#getAllocationUnit <em>Allocation Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Unit</em>' reference.
	 * @see #getAllocationUnit()
	 * @generated
	 */
	void setAllocationUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.organization.BusinessRole}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.organization.BusinessRole#getWorkers <em>Workers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getWorker_Roles()
	 * @see org.lunifera.metamodel.organization.BusinessRole#getWorkers
	 * @model opposite="workers"
	 * @generated
	 */
	EList<BusinessRole> getRoles();

	/**
	 * Returns the value of the '<em><b>Worker Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker Type</em>' reference.
	 * @see #setWorkerType(WorkerType)
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getWorker_WorkerType()
	 * @model
	 * @generated
	 */
	WorkerType getWorkerType();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.organization.Worker#getWorkerType <em>Worker Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker Type</em>' reference.
	 * @see #getWorkerType()
	 * @generated
	 */
	void setWorkerType(WorkerType value);

} // Worker
