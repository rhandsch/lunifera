/**
 */
package org.lunifera.model.software.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.model.software.SoftwarePackage;
import org.lunifera.model.software.ThirdAPI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Third API</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.model.software.impl.ThirdAPIImpl#getWebPage <em>Web Page</em>}</li>
 *   <li>{@link org.lunifera.model.software.impl.ThirdAPIImpl#getSupportPage <em>Support Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThirdAPIImpl extends APIImpl implements ThirdAPI {
	/**
	 * The default value of the '{@link #getWebPage() <em>Web Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPage()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebPage() <em>Web Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPage()
	 * @generated
	 * @ordered
	 */
	protected String webPage = WEB_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportPage() <em>Support Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportPage()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORT_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportPage() <em>Support Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportPage()
	 * @generated
	 * @ordered
	 */
	protected String supportPage = SUPPORT_PAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThirdAPIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.THIRD_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebPage() {
		return webPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebPage(String newWebPage) {
		String oldWebPage = webPage;
		webPage = newWebPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.THIRD_API__WEB_PAGE, oldWebPage, webPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupportPage() {
		return supportPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportPage(String newSupportPage) {
		String oldSupportPage = supportPage;
		supportPage = newSupportPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.THIRD_API__SUPPORT_PAGE, oldSupportPage, supportPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.THIRD_API__WEB_PAGE:
				return getWebPage();
			case SoftwarePackage.THIRD_API__SUPPORT_PAGE:
				return getSupportPage();
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
			case SoftwarePackage.THIRD_API__WEB_PAGE:
				setWebPage((String)newValue);
				return;
			case SoftwarePackage.THIRD_API__SUPPORT_PAGE:
				setSupportPage((String)newValue);
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
			case SoftwarePackage.THIRD_API__WEB_PAGE:
				setWebPage(WEB_PAGE_EDEFAULT);
				return;
			case SoftwarePackage.THIRD_API__SUPPORT_PAGE:
				setSupportPage(SUPPORT_PAGE_EDEFAULT);
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
			case SoftwarePackage.THIRD_API__WEB_PAGE:
				return WEB_PAGE_EDEFAULT == null ? webPage != null : !WEB_PAGE_EDEFAULT.equals(webPage);
			case SoftwarePackage.THIRD_API__SUPPORT_PAGE:
				return SUPPORT_PAGE_EDEFAULT == null ? supportPage != null : !SUPPORT_PAGE_EDEFAULT.equals(supportPage);
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
		result.append(" (webPage: ");
		result.append(webPage);
		result.append(", supportPage: ");
		result.append(supportPage);
		result.append(')');
		return result.toString();
	}

} //ThirdAPIImpl
