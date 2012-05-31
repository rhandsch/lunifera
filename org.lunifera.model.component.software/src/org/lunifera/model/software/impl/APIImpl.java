/**
 */
package org.lunifera.model.software.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.model.software.API;
import org.lunifera.model.software.Bundle;
import org.lunifera.model.software.SoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.model.software.impl.APIImpl#getBundles <em>Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class APIImpl extends AbstractSoftwareComponentImpl implements API {
	/**
	 * The cached value of the '{@link #getBundles() <em>Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> bundles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bundle> getBundles() {
		if (bundles == null) {
			bundles = new EObjectContainmentEList<Bundle>(Bundle.class, this, SoftwarePackage.API__BUNDLES);
		}
		return bundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwarePackage.API__BUNDLES:
				return ((InternalEList<?>)getBundles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.API__BUNDLES:
				return getBundles();
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
			case SoftwarePackage.API__BUNDLES:
				getBundles().clear();
				getBundles().addAll((Collection<? extends Bundle>)newValue);
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
			case SoftwarePackage.API__BUNDLES:
				getBundles().clear();
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
			case SoftwarePackage.API__BUNDLES:
				return bundles != null && !bundles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APIImpl
