/**
 */
package org.lunifera.metamodel.software.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.lunifera.metamodel.common.impl.AbstractDescribedClassImpl;

import org.lunifera.metamodel.software.AbstractSoftwareComponent;
import org.lunifera.metamodel.software.License;
import org.lunifera.metamodel.software.SoftwarePackage;
import org.lunifera.metamodel.software.SoftwareStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Software Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.software.impl.AbstractSoftwareComponentImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.impl.AbstractSoftwareComponentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.impl.AbstractSoftwareComponentImpl#getLicense <em>License</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractSoftwareComponentImpl extends AbstractDescribedClassImpl implements AbstractSoftwareComponent {
	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> versions;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final SoftwareStatus STATUS_EDEFAULT = SoftwareStatus.DEVELOPMENT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected SoftwareStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected License license;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSoftwareComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.ABSTRACT_SOFTWARE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVersions() {
		if (versions == null) {
			versions = new EDataTypeEList<String>(String.class, this, SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__VERSIONS);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(SoftwareStatus newStatus) {
		SoftwareStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public License getLicense() {
		if (license != null && license.eIsProxy()) {
			InternalEObject oldLicense = (InternalEObject)license;
			license = (License)eResolveProxy(oldLicense);
			if (license != oldLicense) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__LICENSE, oldLicense, license));
			}
		}
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public License basicGetLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(License newLicense) {
		License oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__VERSIONS:
				return getVersions();
			case SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__STATUS:
				return getStatus();
			case SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__LICENSE:
				if (resolve) return getLicense();
				return basicGetLicense();
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
			case SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends String>)newValue);
				return;
			case SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__STATUS:
				setStatus((SoftwareStatus)newValue);
				return;
			case SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__LICENSE:
				setLicense((License)newValue);
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
			case SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__VERSIONS:
				getVersions().clear();
				return;
			case SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__LICENSE:
				setLicense((License)null);
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
			case SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__VERSIONS:
				return versions != null && !versions.isEmpty();
			case SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__STATUS:
				return status != STATUS_EDEFAULT;
			case SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT__LICENSE:
				return license != null;
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
		result.append(" (versions: ");
		result.append(versions);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //AbstractSoftwareComponentImpl
