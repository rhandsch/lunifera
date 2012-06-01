/**
 */
package org.lunifera.metamodel.rule.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.common.impl.AbstractNamedClassImpl;

import org.lunifera.metamodel.rule.BusinessRule;
import org.lunifera.metamodel.rule.RuleLanguage;
import org.lunifera.metamodel.rule.RulePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.rule.impl.BusinessRuleImpl#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link org.lunifera.metamodel.rule.impl.BusinessRuleImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.lunifera.metamodel.rule.impl.BusinessRuleImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.lunifera.metamodel.rule.impl.BusinessRuleImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.lunifera.metamodel.rule.impl.BusinessRuleImpl#getServerURI <em>Server URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessRuleImpl extends AbstractNamedClassImpl implements BusinessRule {
	/**
	 * The default value of the '{@link #getRuleId() <em>Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleId()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleId() <em>Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleId()
	 * @generated
	 * @ordered
	 */
	protected String ruleId = RULE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final RuleLanguage LANGUAGE_EDEFAULT = RuleLanguage.JAVA;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected RuleLanguage language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerURI() <em>Server URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerURI()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerURI() <em>Server URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerURI()
	 * @generated
	 * @ordered
	 */
	protected String serverURI = SERVER_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulePackage.Literals.BUSINESS_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuleId() {
		return ruleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleId(String newRuleId) {
		String oldRuleId = ruleId;
		ruleId = newRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulePackage.BUSINESS_RULE__RULE_ID, oldRuleId, ruleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulePackage.BUSINESS_RULE__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulePackage.BUSINESS_RULE__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleLanguage getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(RuleLanguage newLanguage) {
		RuleLanguage oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulePackage.BUSINESS_RULE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerURI() {
		return serverURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerURI(String newServerURI) {
		String oldServerURI = serverURI;
		serverURI = newServerURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulePackage.BUSINESS_RULE__SERVER_URI, oldServerURI, serverURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RulePackage.BUSINESS_RULE__RULE_ID:
				return getRuleId();
			case RulePackage.BUSINESS_RULE__SUMMARY:
				return getSummary();
			case RulePackage.BUSINESS_RULE__BODY:
				return getBody();
			case RulePackage.BUSINESS_RULE__LANGUAGE:
				return getLanguage();
			case RulePackage.BUSINESS_RULE__SERVER_URI:
				return getServerURI();
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
			case RulePackage.BUSINESS_RULE__RULE_ID:
				setRuleId((String)newValue);
				return;
			case RulePackage.BUSINESS_RULE__SUMMARY:
				setSummary((String)newValue);
				return;
			case RulePackage.BUSINESS_RULE__BODY:
				setBody((String)newValue);
				return;
			case RulePackage.BUSINESS_RULE__LANGUAGE:
				setLanguage((RuleLanguage)newValue);
				return;
			case RulePackage.BUSINESS_RULE__SERVER_URI:
				setServerURI((String)newValue);
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
			case RulePackage.BUSINESS_RULE__RULE_ID:
				setRuleId(RULE_ID_EDEFAULT);
				return;
			case RulePackage.BUSINESS_RULE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case RulePackage.BUSINESS_RULE__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case RulePackage.BUSINESS_RULE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case RulePackage.BUSINESS_RULE__SERVER_URI:
				setServerURI(SERVER_URI_EDEFAULT);
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
			case RulePackage.BUSINESS_RULE__RULE_ID:
				return RULE_ID_EDEFAULT == null ? ruleId != null : !RULE_ID_EDEFAULT.equals(ruleId);
			case RulePackage.BUSINESS_RULE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case RulePackage.BUSINESS_RULE__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case RulePackage.BUSINESS_RULE__LANGUAGE:
				return language != LANGUAGE_EDEFAULT;
			case RulePackage.BUSINESS_RULE__SERVER_URI:
				return SERVER_URI_EDEFAULT == null ? serverURI != null : !SERVER_URI_EDEFAULT.equals(serverURI);
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
		result.append(" (ruleId: ");
		result.append(ruleId);
		result.append(", summary: ");
		result.append(summary);
		result.append(", body: ");
		result.append(body);
		result.append(", language: ");
		result.append(language);
		result.append(", serverURI: ");
		result.append(serverURI);
		result.append(')');
		return result.toString();
	}

} //BusinessRuleImpl
