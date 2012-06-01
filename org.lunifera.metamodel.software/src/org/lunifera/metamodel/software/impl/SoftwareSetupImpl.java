/**
 */
package org.lunifera.metamodel.software.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.common.impl.AbstractIdentifiedClassImpl;

import org.lunifera.metamodel.software.AccessMode;
import org.lunifera.metamodel.software.AccessType;
import org.lunifera.metamodel.software.SoftwarePackage;
import org.lunifera.metamodel.software.SoftwareSetup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.software.impl.SoftwareSetupImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.impl.SoftwareSetupImpl#getAccessMode <em>Access Mode</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.impl.SoftwareSetupImpl#getAccessURL <em>Access URL</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.impl.SoftwareSetupImpl#getAccessTimeout <em>Access Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareSetupImpl extends AbstractIdentifiedClassImpl implements SoftwareSetup {
	/**
	 * The default value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected static final AccessType ACCESS_TYPE_EDEFAULT = AccessType.WEB_SERVICE;

	/**
	 * The cached value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected AccessType accessType = ACCESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessMode() <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMode()
	 * @generated
	 * @ordered
	 */
	protected static final AccessMode ACCESS_MODE_EDEFAULT = AccessMode.SYNCHRONOUS;

	/**
	 * The cached value of the '{@link #getAccessMode() <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMode()
	 * @generated
	 * @ordered
	 */
	protected AccessMode accessMode = ACCESS_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessURL() <em>Access URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessURL()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessURL() <em>Access URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessURL()
	 * @generated
	 * @ordered
	 */
	protected String accessURL = ACCESS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessTimeout() <em>Access Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessTimeout() <em>Access Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTimeout()
	 * @generated
	 * @ordered
	 */
	protected Integer accessTimeout = ACCESS_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareSetupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.SOFTWARE_SETUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType getAccessType() {
		return accessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessType(AccessType newAccessType) {
		AccessType oldAccessType = accessType;
		accessType = newAccessType == null ? ACCESS_TYPE_EDEFAULT : newAccessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.SOFTWARE_SETUP__ACCESS_TYPE, oldAccessType, accessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMode getAccessMode() {
		return accessMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessMode(AccessMode newAccessMode) {
		AccessMode oldAccessMode = accessMode;
		accessMode = newAccessMode == null ? ACCESS_MODE_EDEFAULT : newAccessMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.SOFTWARE_SETUP__ACCESS_MODE, oldAccessMode, accessMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessURL() {
		return accessURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessURL(String newAccessURL) {
		String oldAccessURL = accessURL;
		accessURL = newAccessURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.SOFTWARE_SETUP__ACCESS_URL, oldAccessURL, accessURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAccessTimeout() {
		return accessTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessTimeout(Integer newAccessTimeout) {
		Integer oldAccessTimeout = accessTimeout;
		accessTimeout = newAccessTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.SOFTWARE_SETUP__ACCESS_TIMEOUT, oldAccessTimeout, accessTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_TYPE:
				return getAccessType();
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_MODE:
				return getAccessMode();
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_URL:
				return getAccessURL();
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_TIMEOUT:
				return getAccessTimeout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_TYPE:
				setAccessType((AccessType)newValue);
				return;
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_MODE:
				setAccessMode((AccessMode)newValue);
				return;
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_URL:
				setAccessURL((String)newValue);
				return;
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_TIMEOUT:
				setAccessTimeout((Integer)newValue);
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
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_TYPE:
				setAccessType(ACCESS_TYPE_EDEFAULT);
				return;
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_MODE:
				setAccessMode(ACCESS_MODE_EDEFAULT);
				return;
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_URL:
				setAccessURL(ACCESS_URL_EDEFAULT);
				return;
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_TIMEOUT:
				setAccessTimeout(ACCESS_TIMEOUT_EDEFAULT);
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
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_TYPE:
				return accessType != ACCESS_TYPE_EDEFAULT;
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_MODE:
				return accessMode != ACCESS_MODE_EDEFAULT;
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_URL:
				return ACCESS_URL_EDEFAULT == null ? accessURL != null : !ACCESS_URL_EDEFAULT.equals(accessURL);
			case SoftwarePackage.SOFTWARE_SETUP__ACCESS_TIMEOUT:
				return ACCESS_TIMEOUT_EDEFAULT == null ? accessTimeout != null : !ACCESS_TIMEOUT_EDEFAULT.equals(accessTimeout);
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
		result.append(" (accessType: ");
		result.append(accessType);
		result.append(", accessMode: ");
		result.append(accessMode);
		result.append(", accessURL: ");
		result.append(accessURL);
		result.append(", accessTimeout: ");
		result.append(accessTimeout);
		result.append(')');
		return result.toString();
	}

} //SoftwareSetupImpl
