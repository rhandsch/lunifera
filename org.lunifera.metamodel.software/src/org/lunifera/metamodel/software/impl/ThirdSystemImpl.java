/**
 */
package org.lunifera.metamodel.software.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.software.SoftwarePackage;
import org.lunifera.metamodel.software.ThirdSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Third System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.software.impl.ThirdSystemImpl#getWebpage <em>Webpage</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.impl.ThirdSystemImpl#getSupportPage <em>Support Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThirdSystemImpl extends SystemImpl implements ThirdSystem {
	/**
	 * The default value of the '{@link #getWebpage() <em>Webpage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebpage()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBPAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebpage() <em>Webpage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebpage()
	 * @generated
	 * @ordered
	 */
	protected String webpage = WEBPAGE_EDEFAULT;

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
	protected ThirdSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.THIRD_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebpage() {
		return webpage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebpage(String newWebpage) {
		String oldWebpage = webpage;
		webpage = newWebpage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.THIRD_SYSTEM__WEBPAGE, oldWebpage, webpage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.THIRD_SYSTEM__SUPPORT_PAGE, oldSupportPage, supportPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.THIRD_SYSTEM__WEBPAGE:
				return getWebpage();
			case SoftwarePackage.THIRD_SYSTEM__SUPPORT_PAGE:
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
			case SoftwarePackage.THIRD_SYSTEM__WEBPAGE:
				setWebpage((String)newValue);
				return;
			case SoftwarePackage.THIRD_SYSTEM__SUPPORT_PAGE:
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
			case SoftwarePackage.THIRD_SYSTEM__WEBPAGE:
				setWebpage(WEBPAGE_EDEFAULT);
				return;
			case SoftwarePackage.THIRD_SYSTEM__SUPPORT_PAGE:
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
			case SoftwarePackage.THIRD_SYSTEM__WEBPAGE:
				return WEBPAGE_EDEFAULT == null ? webpage != null : !WEBPAGE_EDEFAULT.equals(webpage);
			case SoftwarePackage.THIRD_SYSTEM__SUPPORT_PAGE:
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
		result.append(" (webpage: ");
		result.append(webpage);
		result.append(", supportPage: ");
		result.append(supportPage);
		result.append(')');
		return result.toString();
	}

} //ThirdSystemImpl
