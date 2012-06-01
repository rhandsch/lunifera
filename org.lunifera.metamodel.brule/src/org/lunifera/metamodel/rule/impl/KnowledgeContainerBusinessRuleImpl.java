/**
 */
package org.lunifera.metamodel.rule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.knowledge.impl.AbstractKnowledgeContainerImpl;

import org.lunifera.metamodel.rule.BusinessRule;
import org.lunifera.metamodel.rule.KnowledgeContainerBusinessRule;
import org.lunifera.metamodel.rule.RulePackage;
import org.lunifera.metamodel.rule.RuleServerSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge Container Business Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.rule.impl.KnowledgeContainerBusinessRuleImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.lunifera.metamodel.rule.impl.KnowledgeContainerBusinessRuleImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KnowledgeContainerBusinessRuleImpl extends AbstractKnowledgeContainerImpl implements KnowledgeContainerBusinessRule {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessRule> rules;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected RuleServerSettings settings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeContainerBusinessRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulePackage.Literals.KNOWLEDGE_CONTAINER_BUSINESS_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<BusinessRule>(BusinessRule.class, this, RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleServerSettings getSettings() {
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettings(RuleServerSettings newSettings, NotificationChain msgs) {
		RuleServerSettings oldSettings = settings;
		settings = newSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__SETTINGS, oldSettings, newSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettings(RuleServerSettings newSettings) {
		if (newSettings != settings) {
			NotificationChain msgs = null;
			if (settings != null)
				msgs = ((InternalEObject)settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__SETTINGS, null, msgs);
			if (newSettings != null)
				msgs = ((InternalEObject)newSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__SETTINGS, null, msgs);
			msgs = basicSetSettings(newSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__SETTINGS, newSettings, newSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__SETTINGS:
				return basicSetSettings(null, msgs);
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
			case RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__RULES:
				return getRules();
			case RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__SETTINGS:
				return getSettings();
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
			case RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends BusinessRule>)newValue);
				return;
			case RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__SETTINGS:
				setSettings((RuleServerSettings)newValue);
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
			case RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__RULES:
				getRules().clear();
				return;
			case RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__SETTINGS:
				setSettings((RuleServerSettings)null);
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
			case RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__RULES:
				return rules != null && !rules.isEmpty();
			case RulePackage.KNOWLEDGE_CONTAINER_BUSINESS_RULE__SETTINGS:
				return settings != null;
		}
		return super.eIsSet(featureID);
	}

} //KnowledgeContainerBusinessRuleImpl
