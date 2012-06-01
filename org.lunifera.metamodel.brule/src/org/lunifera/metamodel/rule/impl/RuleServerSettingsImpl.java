/**
 */
package org.lunifera.metamodel.rule.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.common.impl.AbstractNamedClassImpl;

import org.lunifera.metamodel.rule.RulePackage;
import org.lunifera.metamodel.rule.RuleServerSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.rule.impl.RuleServerSettingsImpl#getGuvnorURI <em>Guvnor URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleServerSettingsImpl extends AbstractNamedClassImpl implements RuleServerSettings {
	/**
	 * The default value of the '{@link #getGuvnorURI() <em>Guvnor URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuvnorURI()
	 * @generated
	 * @ordered
	 */
	protected static final String GUVNOR_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuvnorURI() <em>Guvnor URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuvnorURI()
	 * @generated
	 * @ordered
	 */
	protected String guvnorURI = GUVNOR_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleServerSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulePackage.Literals.RULE_SERVER_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuvnorURI() {
		return guvnorURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuvnorURI(String newGuvnorURI) {
		String oldGuvnorURI = guvnorURI;
		guvnorURI = newGuvnorURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulePackage.RULE_SERVER_SETTINGS__GUVNOR_URI, oldGuvnorURI, guvnorURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RulePackage.RULE_SERVER_SETTINGS__GUVNOR_URI:
				return getGuvnorURI();
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
			case RulePackage.RULE_SERVER_SETTINGS__GUVNOR_URI:
				setGuvnorURI((String)newValue);
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
			case RulePackage.RULE_SERVER_SETTINGS__GUVNOR_URI:
				setGuvnorURI(GUVNOR_URI_EDEFAULT);
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
			case RulePackage.RULE_SERVER_SETTINGS__GUVNOR_URI:
				return GUVNOR_URI_EDEFAULT == null ? guvnorURI != null : !GUVNOR_URI_EDEFAULT.equals(guvnorURI);
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
		result.append(" (guvnorURI: ");
		result.append(guvnorURI);
		result.append(')');
		return result.toString();
	}

} //RuleServerSettingsImpl
