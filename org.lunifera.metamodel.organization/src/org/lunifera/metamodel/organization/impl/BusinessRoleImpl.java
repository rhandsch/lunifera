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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.common.impl.AbstractDescribedClassImpl;

import org.lunifera.metamodel.organization.BusinessRole;
import org.lunifera.metamodel.organization.Organization;
import org.lunifera.metamodel.organization.OrganizationPackage;
import org.lunifera.metamodel.organization.Permission;
import org.lunifera.metamodel.organization.Worker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.organization.impl.BusinessRoleImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.BusinessRoleImpl#getWorkers <em>Workers</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.BusinessRoleImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessRoleImpl extends AbstractDescribedClassImpl implements BusinessRole {
	/**
	 * The cached value of the '{@link #getWorkers() <em>Workers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkers()
	 * @generated
	 * @ordered
	 */
	protected EList<Worker> workers;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> permissions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationPackage.Literals.BUSINESS_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (eContainerFeatureID() != OrganizationPackage.BUSINESS_ROLE__ORGANIZATION) return null;
		return (Organization)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrganization, OrganizationPackage.BUSINESS_ROLE__ORGANIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		if (newOrganization != eInternalContainer() || (eContainerFeatureID() != OrganizationPackage.BUSINESS_ROLE__ORGANIZATION && newOrganization != null)) {
			if (EcoreUtil.isAncestor(this, newOrganization))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, OrganizationPackage.ORGANIZATION__ROLES, Organization.class, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.BUSINESS_ROLE__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Worker> getWorkers() {
		if (workers == null) {
			workers = new EObjectWithInverseResolvingEList.ManyInverse<Worker>(Worker.class, this, OrganizationPackage.BUSINESS_ROLE__WORKERS, OrganizationPackage.WORKER__ROLES);
		}
		return workers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getPermissions() {
		if (permissions == null) {
			permissions = new EObjectResolvingEList<Permission>(Permission.class, this, OrganizationPackage.BUSINESS_ROLE__PERMISSIONS);
		}
		return permissions;
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
			case OrganizationPackage.BUSINESS_ROLE__ORGANIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrganization((Organization)otherEnd, msgs);
			case OrganizationPackage.BUSINESS_ROLE__WORKERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkers()).basicAdd(otherEnd, msgs);
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
			case OrganizationPackage.BUSINESS_ROLE__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case OrganizationPackage.BUSINESS_ROLE__WORKERS:
				return ((InternalEList<?>)getWorkers()).basicRemove(otherEnd, msgs);
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
			case OrganizationPackage.BUSINESS_ROLE__ORGANIZATION:
				return eInternalContainer().eInverseRemove(this, OrganizationPackage.ORGANIZATION__ROLES, Organization.class, msgs);
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
			case OrganizationPackage.BUSINESS_ROLE__ORGANIZATION:
				return getOrganization();
			case OrganizationPackage.BUSINESS_ROLE__WORKERS:
				return getWorkers();
			case OrganizationPackage.BUSINESS_ROLE__PERMISSIONS:
				return getPermissions();
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
			case OrganizationPackage.BUSINESS_ROLE__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case OrganizationPackage.BUSINESS_ROLE__WORKERS:
				getWorkers().clear();
				getWorkers().addAll((Collection<? extends Worker>)newValue);
				return;
			case OrganizationPackage.BUSINESS_ROLE__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends Permission>)newValue);
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
			case OrganizationPackage.BUSINESS_ROLE__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case OrganizationPackage.BUSINESS_ROLE__WORKERS:
				getWorkers().clear();
				return;
			case OrganizationPackage.BUSINESS_ROLE__PERMISSIONS:
				getPermissions().clear();
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
			case OrganizationPackage.BUSINESS_ROLE__ORGANIZATION:
				return getOrganization() != null;
			case OrganizationPackage.BUSINESS_ROLE__WORKERS:
				return workers != null && !workers.isEmpty();
			case OrganizationPackage.BUSINESS_ROLE__PERMISSIONS:
				return permissions != null && !permissions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessRoleImpl
