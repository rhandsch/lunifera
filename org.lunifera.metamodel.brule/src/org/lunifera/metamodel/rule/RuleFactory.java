/**
 */
package org.lunifera.metamodel.rule;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.rule.RulePackage
 * @generated
 */
public interface RuleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuleFactory eINSTANCE = org.lunifera.metamodel.rule.impl.RuleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Knowledge Container Business Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knowledge Container Business Rule</em>'.
	 * @generated
	 */
	KnowledgeContainerBusinessRule createKnowledgeContainerBusinessRule();

	/**
	 * Returns a new object of class '<em>Business Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Rule</em>'.
	 * @generated
	 */
	BusinessRule createBusinessRule();

	/**
	 * Returns a new object of class '<em>Server Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Settings</em>'.
	 * @generated
	 */
	RuleServerSettings createRuleServerSettings();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulePackage getRulePackage();

} //RuleFactory
