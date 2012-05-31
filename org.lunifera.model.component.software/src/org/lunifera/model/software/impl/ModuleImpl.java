/**
 */
package org.lunifera.model.software.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.lunifera.model.software.Feature;
import org.lunifera.model.software.ImplementationTechnology;
import org.lunifera.model.software.Module;
import org.lunifera.model.software.SoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.model.software.impl.ModuleImpl#getParentSystem <em>Parent System</em>}</li>
 *   <li>{@link org.lunifera.model.software.impl.ModuleImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.lunifera.model.software.impl.ModuleImpl#getTechnologys <em>Technologys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends AbstractSoftwareComponentImpl implements Module {
	/**
	 * The cached value of the '{@link #getParentSystem() <em>Parent System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentSystem()
	 * @generated
	 * @ordered
	 */
	protected org.lunifera.model.software.System parentSystem;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getTechnologys() <em>Technologys</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologys()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationTechnology> technologys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.lunifera.model.software.System getParentSystem() {
		if (parentSystem != null && parentSystem.eIsProxy()) {
			InternalEObject oldParentSystem = (InternalEObject)parentSystem;
			parentSystem = (org.lunifera.model.software.System)eResolveProxy(oldParentSystem);
			if (parentSystem != oldParentSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwarePackage.MODULE__PARENT_SYSTEM, oldParentSystem, parentSystem));
			}
		}
		return parentSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.lunifera.model.software.System basicGetParentSystem() {
		return parentSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentSystem(org.lunifera.model.software.System newParentSystem) {
		org.lunifera.model.software.System oldParentSystem = parentSystem;
		parentSystem = newParentSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.MODULE__PARENT_SYSTEM, oldParentSystem, parentSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<Feature>(Feature.class, this, SoftwarePackage.MODULE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationTechnology> getTechnologys() {
		if (technologys == null) {
			technologys = new EDataTypeUniqueEList<ImplementationTechnology>(ImplementationTechnology.class, this, SoftwarePackage.MODULE__TECHNOLOGYS);
		}
		return technologys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.MODULE__PARENT_SYSTEM:
				if (resolve) return getParentSystem();
				return basicGetParentSystem();
			case SoftwarePackage.MODULE__FEATURES:
				return getFeatures();
			case SoftwarePackage.MODULE__TECHNOLOGYS:
				return getTechnologys();
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
			case SoftwarePackage.MODULE__PARENT_SYSTEM:
				setParentSystem((org.lunifera.model.software.System)newValue);
				return;
			case SoftwarePackage.MODULE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case SoftwarePackage.MODULE__TECHNOLOGYS:
				getTechnologys().clear();
				getTechnologys().addAll((Collection<? extends ImplementationTechnology>)newValue);
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
			case SoftwarePackage.MODULE__PARENT_SYSTEM:
				setParentSystem((org.lunifera.model.software.System)null);
				return;
			case SoftwarePackage.MODULE__FEATURES:
				getFeatures().clear();
				return;
			case SoftwarePackage.MODULE__TECHNOLOGYS:
				getTechnologys().clear();
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
			case SoftwarePackage.MODULE__PARENT_SYSTEM:
				return parentSystem != null;
			case SoftwarePackage.MODULE__FEATURES:
				return features != null && !features.isEmpty();
			case SoftwarePackage.MODULE__TECHNOLOGYS:
				return technologys != null && !technologys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (technologys: ");
		result.append(technologys);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
