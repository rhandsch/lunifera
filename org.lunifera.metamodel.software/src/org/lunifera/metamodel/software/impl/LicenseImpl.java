/**
 */
package org.lunifera.metamodel.software.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.common.impl.AbstractIdentifiedClassImpl;

import org.lunifera.metamodel.software.License;
import org.lunifera.metamodel.software.SoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>License</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.software.impl.LicenseImpl#isFree <em>Free</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.impl.LicenseImpl#isOpenSource <em>Open Source</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.impl.LicenseImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LicenseImpl extends AbstractIdentifiedClassImpl implements License {
	/**
	 * The default value of the '{@link #isFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFree()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FREE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFree()
	 * @generated
	 * @ordered
	 */
	protected boolean free = FREE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOpenSource() <em>Open Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpenSource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPEN_SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOpenSource() <em>Open Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpenSource()
	 * @generated
	 * @ordered
	 */
	protected boolean openSource = OPEN_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LicenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.LICENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFree() {
		return free;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFree(boolean newFree) {
		boolean oldFree = free;
		free = newFree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.LICENSE__FREE, oldFree, free));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpenSource() {
		return openSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenSource(boolean newOpenSource) {
		boolean oldOpenSource = openSource;
		openSource = newOpenSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.LICENSE__OPEN_SOURCE, oldOpenSource, openSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.LICENSE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.LICENSE__FREE:
				return isFree();
			case SoftwarePackage.LICENSE__OPEN_SOURCE:
				return isOpenSource();
			case SoftwarePackage.LICENSE__URI:
				return getUri();
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
			case SoftwarePackage.LICENSE__FREE:
				setFree((Boolean)newValue);
				return;
			case SoftwarePackage.LICENSE__OPEN_SOURCE:
				setOpenSource((Boolean)newValue);
				return;
			case SoftwarePackage.LICENSE__URI:
				setUri((String)newValue);
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
			case SoftwarePackage.LICENSE__FREE:
				setFree(FREE_EDEFAULT);
				return;
			case SoftwarePackage.LICENSE__OPEN_SOURCE:
				setOpenSource(OPEN_SOURCE_EDEFAULT);
				return;
			case SoftwarePackage.LICENSE__URI:
				setUri(URI_EDEFAULT);
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
			case SoftwarePackage.LICENSE__FREE:
				return free != FREE_EDEFAULT;
			case SoftwarePackage.LICENSE__OPEN_SOURCE:
				return openSource != OPEN_SOURCE_EDEFAULT;
			case SoftwarePackage.LICENSE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
		result.append(" (free: ");
		result.append(free);
		result.append(", openSource: ");
		result.append(openSource);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //LicenseImpl
