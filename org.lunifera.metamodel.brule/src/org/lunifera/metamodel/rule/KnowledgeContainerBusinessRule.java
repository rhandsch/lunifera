/**
 */
package org.lunifera.metamodel.rule;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge Container Business Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.rule.KnowledgeContainerBusinessRule#getRules <em>Rules</em>}</li>
 *   <li>{@link org.lunifera.metamodel.rule.KnowledgeContainerBusinessRule#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.rule.RulePackage#getKnowledgeContainerBusinessRule()
 * @model
 * @generated
 */
public interface KnowledgeContainerBusinessRule extends AbstractKnowledgeContainer {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.rule.BusinessRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.lunifera.metamodel.rule.RulePackage#getKnowledgeContainerBusinessRule_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessRule> getRules();

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference.
	 * @see #setSettings(RuleServerSettings)
	 * @see org.lunifera.metamodel.rule.RulePackage#getKnowledgeContainerBusinessRule_Settings()
	 * @model containment="true"
	 * @generated
	 */
	RuleServerSettings getSettings();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.rule.KnowledgeContainerBusinessRule#getSettings <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' containment reference.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(RuleServerSettings value);

} // KnowledgeContainerBusinessRule
