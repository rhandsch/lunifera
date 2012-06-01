/**
 */
package org.lunifera.metamodel.businessprocess;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage
 * @generated
 */
public interface BusinessprocessFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessprocessFactory eINSTANCE = org.lunifera.metamodel.businessprocess.impl.BusinessprocessFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Knowledge Container Business Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knowledge Container Business Process</em>'.
	 * @generated
	 */
	KnowledgeContainerBusinessProcess createKnowledgeContainerBusinessProcess();

	/**
	 * Returns a new object of class '<em>Activity Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Definition</em>'.
	 * @generated
	 */
	ActivityDefinition createActivityDefinition();

	/**
	 * Returns a new object of class '<em>Business Process Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Process Definition</em>'.
	 * @generated
	 */
	BusinessProcessDefinition createBusinessProcessDefinition();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Rules Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rules Server</em>'.
	 * @generated
	 */
	RulesServer createRulesServer();

	/**
	 * Returns a new object of class '<em>Human Task Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human Task Server</em>'.
	 * @generated
	 */
	HumanTaskServer createHumanTaskServer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BusinessprocessPackage getBusinessprocessPackage();

} //BusinessprocessFactory
