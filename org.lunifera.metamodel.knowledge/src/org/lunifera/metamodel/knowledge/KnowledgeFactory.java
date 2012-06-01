/**
 */
package org.lunifera.metamodel.knowledge;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.knowledge.KnowledgePackage
 * @generated
 */
public interface KnowledgeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KnowledgeFactory eINSTANCE = org.lunifera.metamodel.knowledge.impl.KnowledgeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workspace Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workspace Repository</em>'.
	 * @generated
	 */
	WorkspaceRepository createWorkspaceRepository();

	/**
	 * Returns a new object of class '<em>Modeling Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modeling Project</em>'.
	 * @generated
	 */
	ModelingProject createModelingProject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KnowledgePackage getKnowledgePackage();

} //KnowledgeFactory
