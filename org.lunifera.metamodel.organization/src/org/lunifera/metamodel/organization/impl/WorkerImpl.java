/**
 */
package org.lunifera.metamodel.organization.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.common.impl.AbstractIdentifiedClassImpl;

import org.lunifera.metamodel.organization.BusinessRole;
import org.lunifera.metamodel.organization.Organization;
import org.lunifera.metamodel.organization.OrganizationPackage;
import org.lunifera.metamodel.organization.Person;
import org.lunifera.metamodel.organization.Unit;
import org.lunifera.metamodel.organization.Worker;
import org.lunifera.metamodel.organization.WorkerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.organization.impl.WorkerImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.WorkerImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.WorkerImpl#getAllocationUnit <em>Allocation Unit</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.WorkerImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.WorkerImpl#getWorkerType <em>Worker Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkerImpl extends AbstractIdentifiedClassImpl implements Worker {
	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * The cached value of the '{@link #getAllocationUnit() <em>Allocation Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit allocationUnit;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessRole> roles;

	/**
	 * The cached value of the '{@link #getWorkerType() <em>Worker Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerType()
	 * @generated
	 * @ordered
	 */
	protected WorkerType workerType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationPackage.Literals.WORKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (eContainerFeatureID() != OrganizationPackage.WORKER__ORGANIZATION) return null;
		return (Organization)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrganization, OrganizationPackage.WORKER__ORGANIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		if (newOrganization != eInternalContainer() || (eContainerFeatureID() != OrganizationPackage.WORKER__ORGANIZATION && newOrganization != null)) {
			if (EcoreUtil.isAncestor(this, newOrganization))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, OrganizationPackage.ORGANIZATION__WORKERS, Organization.class, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.WORKER__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (Person)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationPackage.WORKER__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.WORKER__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getAllocationUnit() {
		if (allocationUnit != null && allocationUnit.eIsProxy()) {
			InternalEObject oldAllocationUnit = (InternalEObject)allocationUnit;
			allocationUnit = (Unit)eResolveProxy(oldAllocationUnit);
			if (allocationUnit != oldAllocationUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationPackage.WORKER__ALLOCATION_UNIT, oldAllocationUnit, allocationUnit));
			}
		}
		return allocationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetAllocationUnit() {
		return allocationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationUnit(Unit newAllocationUnit) {
		Unit oldAllocationUnit = allocationUnit;
		allocationUnit = newAllocationUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.WORKER__ALLOCATION_UNIT, oldAllocationUnit, allocationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessRole> getRoles() {
		if (roles == null) {
			roles = new EObjectWithInverseResolvingEList.ManyInverse<BusinessRole>(BusinessRole.class, this, OrganizationPackage.WORKER__ROLES, OrganizationPackage.BUSINESS_ROLE__WORKERS);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkerType getWorkerType() {
		if (workerType != null && workerType.eIsProxy()) {
			InternalEObject oldWorkerType = (InternalEObject)workerType;
			workerType = (WorkerType)eResolveProxy(oldWorkerType);
			if (workerType != oldWorkerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationPackage.WORKER__WORKER_TYPE, oldWorkerType, workerType));
			}
		}
		return workerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkerType basicGetWorkerType() {
		return workerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkerType(WorkerType newWorkerType) {
		WorkerType oldWorkerType = workerType;
		workerType = newWorkerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.WORKER__WORKER_TYPE, oldWorkerType, workerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrganizationPackage.WORKER__ORGANIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrganization((Organization)otherEnd, msgs);
			case OrganizationPackage.WORKER__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrganizationPackage.WORKER__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case OrganizationPackage.WORKER__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OrganizationPackage.WORKER__ORGANIZATION:
				return eInternalContainer().eInverseRemove(this, OrganizationPackage.ORGANIZATION__WORKERS, Organization.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrganizationPackage.WORKER__ORGANIZATION:
				return getOrganization();
			case OrganizationPackage.WORKER__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case OrganizationPackage.WORKER__ALLOCATION_UNIT:
				if (resolve) return getAllocationUnit();
				return basicGetAllocationUnit();
			case OrganizationPackage.WORKER__ROLES:
				return getRoles();
			case OrganizationPackage.WORKER__WORKER_TYPE:
				if (resolve) return getWorkerType();
				return basicGetWorkerType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrganizationPackage.WORKER__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case OrganizationPackage.WORKER__PERSON:
				setPerson((Person)newValue);
				return;
			case OrganizationPackage.WORKER__ALLOCATION_UNIT:
				setAllocationUnit((Unit)newValue);
				return;
			case OrganizationPackage.WORKER__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends BusinessRole>)newValue);
				return;
			case OrganizationPackage.WORKER__WORKER_TYPE:
				setWorkerType((WorkerType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrganizationPackage.WORKER__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case OrganizationPackage.WORKER__PERSON:
				setPerson((Person)null);
				return;
			case OrganizationPackage.WORKER__ALLOCATION_UNIT:
				setAllocationUnit((Unit)null);
				return;
			case OrganizationPackage.WORKER__ROLES:
				getRoles().clear();
				return;
			case OrganizationPackage.WORKER__WORKER_TYPE:
				setWorkerType((WorkerType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrganizationPackage.WORKER__ORGANIZATION:
				return getOrganization() != null;
			case OrganizationPackage.WORKER__PERSON:
				return person != null;
			case OrganizationPackage.WORKER__ALLOCATION_UNIT:
				return allocationUnit != null;
			case OrganizationPackage.WORKER__ROLES:
				return roles != null && !roles.isEmpty();
			case OrganizationPackage.WORKER__WORKER_TYPE:
				return workerType != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkerImpl
