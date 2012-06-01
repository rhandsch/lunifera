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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.common.impl.AbstractNamedClassImpl;

import org.lunifera.metamodel.organization.Organization;
import org.lunifera.metamodel.organization.OrganizationPackage;
import org.lunifera.metamodel.organization.Unit;
import org.lunifera.metamodel.organization.UnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.organization.impl.UnitImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.UnitImpl#getParentUnit <em>Parent Unit</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.UnitImpl#getSubUnits <em>Sub Units</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.UnitImpl#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitImpl extends AbstractNamedClassImpl implements Unit {
	/**
	 * The cached value of the '{@link #getSubUnits() <em>Sub Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> subUnits;

	/**
	 * The cached value of the '{@link #getUnitType() <em>Unit Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitType()
	 * @generated
	 * @ordered
	 */
	protected UnitType unitType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationPackage.Literals.UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (eContainerFeatureID() != OrganizationPackage.UNIT__ORGANIZATION) return null;
		return (Organization)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrganization, OrganizationPackage.UNIT__ORGANIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		if (newOrganization != eInternalContainer() || (eContainerFeatureID() != OrganizationPackage.UNIT__ORGANIZATION && newOrganization != null)) {
			if (EcoreUtil.isAncestor(this, newOrganization))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, OrganizationPackage.ORGANIZATION__UNITS, Organization.class, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.UNIT__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getParentUnit() {
		if (eContainerFeatureID() != OrganizationPackage.UNIT__PARENT_UNIT) return null;
		return (Unit)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentUnit(Unit newParentUnit, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentUnit, OrganizationPackage.UNIT__PARENT_UNIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentUnit(Unit newParentUnit) {
		if (newParentUnit != eInternalContainer() || (eContainerFeatureID() != OrganizationPackage.UNIT__PARENT_UNIT && newParentUnit != null)) {
			if (EcoreUtil.isAncestor(this, newParentUnit))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentUnit != null)
				msgs = ((InternalEObject)newParentUnit).eInverseAdd(this, OrganizationPackage.UNIT__SUB_UNITS, Unit.class, msgs);
			msgs = basicSetParentUnit(newParentUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.UNIT__PARENT_UNIT, newParentUnit, newParentUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getSubUnits() {
		if (subUnits == null) {
			subUnits = new EObjectContainmentWithInverseEList<Unit>(Unit.class, this, OrganizationPackage.UNIT__SUB_UNITS, OrganizationPackage.UNIT__PARENT_UNIT);
		}
		return subUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType getUnitType() {
		if (unitType != null && unitType.eIsProxy()) {
			InternalEObject oldUnitType = (InternalEObject)unitType;
			unitType = (UnitType)eResolveProxy(oldUnitType);
			if (unitType != oldUnitType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationPackage.UNIT__UNIT_TYPE, oldUnitType, unitType));
			}
		}
		return unitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType basicGetUnitType() {
		return unitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitType(UnitType newUnitType) {
		UnitType oldUnitType = unitType;
		unitType = newUnitType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.UNIT__UNIT_TYPE, oldUnitType, unitType));
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
			case OrganizationPackage.UNIT__ORGANIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrganization((Organization)otherEnd, msgs);
			case OrganizationPackage.UNIT__PARENT_UNIT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentUnit((Unit)otherEnd, msgs);
			case OrganizationPackage.UNIT__SUB_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubUnits()).basicAdd(otherEnd, msgs);
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
			case OrganizationPackage.UNIT__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case OrganizationPackage.UNIT__PARENT_UNIT:
				return basicSetParentUnit(null, msgs);
			case OrganizationPackage.UNIT__SUB_UNITS:
				return ((InternalEList<?>)getSubUnits()).basicRemove(otherEnd, msgs);
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
			case OrganizationPackage.UNIT__ORGANIZATION:
				return eInternalContainer().eInverseRemove(this, OrganizationPackage.ORGANIZATION__UNITS, Organization.class, msgs);
			case OrganizationPackage.UNIT__PARENT_UNIT:
				return eInternalContainer().eInverseRemove(this, OrganizationPackage.UNIT__SUB_UNITS, Unit.class, msgs);
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
			case OrganizationPackage.UNIT__ORGANIZATION:
				return getOrganization();
			case OrganizationPackage.UNIT__PARENT_UNIT:
				return getParentUnit();
			case OrganizationPackage.UNIT__SUB_UNITS:
				return getSubUnits();
			case OrganizationPackage.UNIT__UNIT_TYPE:
				if (resolve) return getUnitType();
				return basicGetUnitType();
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
			case OrganizationPackage.UNIT__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case OrganizationPackage.UNIT__PARENT_UNIT:
				setParentUnit((Unit)newValue);
				return;
			case OrganizationPackage.UNIT__SUB_UNITS:
				getSubUnits().clear();
				getSubUnits().addAll((Collection<? extends Unit>)newValue);
				return;
			case OrganizationPackage.UNIT__UNIT_TYPE:
				setUnitType((UnitType)newValue);
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
			case OrganizationPackage.UNIT__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case OrganizationPackage.UNIT__PARENT_UNIT:
				setParentUnit((Unit)null);
				return;
			case OrganizationPackage.UNIT__SUB_UNITS:
				getSubUnits().clear();
				return;
			case OrganizationPackage.UNIT__UNIT_TYPE:
				setUnitType((UnitType)null);
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
			case OrganizationPackage.UNIT__ORGANIZATION:
				return getOrganization() != null;
			case OrganizationPackage.UNIT__PARENT_UNIT:
				return getParentUnit() != null;
			case OrganizationPackage.UNIT__SUB_UNITS:
				return subUnits != null && !subUnits.isEmpty();
			case OrganizationPackage.UNIT__UNIT_TYPE:
				return unitType != null;
		}
		return super.eIsSet(featureID);
	}

} //UnitImpl
