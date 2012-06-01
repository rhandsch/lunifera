/**
 */
package org.lunifera.metamodel.organization.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.lunifera.metamodel.common.impl.AbstractDescribedClassImpl;

import org.lunifera.metamodel.organization.Organization;
import org.lunifera.metamodel.organization.OrganizationPackage;
import org.lunifera.metamodel.organization.Permission;
import org.lunifera.metamodel.organization.Worker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.organization.impl.PermissionImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.PermissionImpl#getWorkers <em>Workers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PermissionImpl extends AbstractDescribedClassImpl implements Permission {
	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization organization;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationPackage.Literals.PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (organization != null && organization.eIsProxy()) {
			InternalEObject oldOrganization = (InternalEObject)organization;
			organization = (Organization)eResolveProxy(oldOrganization);
			if (organization != oldOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationPackage.PERMISSION__ORGANIZATION, oldOrganization, organization));
			}
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		Organization oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.PERMISSION__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Worker> getWorkers() {
		if (workers == null) {
			workers = new EObjectResolvingEList<Worker>(Worker.class, this, OrganizationPackage.PERMISSION__WORKERS);
		}
		return workers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrganizationPackage.PERMISSION__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case OrganizationPackage.PERMISSION__WORKERS:
				return getWorkers();
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
			case OrganizationPackage.PERMISSION__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case OrganizationPackage.PERMISSION__WORKERS:
				getWorkers().clear();
				getWorkers().addAll((Collection<? extends Worker>)newValue);
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
			case OrganizationPackage.PERMISSION__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case OrganizationPackage.PERMISSION__WORKERS:
				getWorkers().clear();
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
			case OrganizationPackage.PERMISSION__ORGANIZATION:
				return organization != null;
			case OrganizationPackage.PERMISSION__WORKERS:
				return workers != null && !workers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PermissionImpl
