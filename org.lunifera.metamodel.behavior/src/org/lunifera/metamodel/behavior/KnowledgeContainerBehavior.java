/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge Container Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.KnowledgeContainerBehavior#getStepsLibraries <em>Steps Libraries</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.KnowledgeContainerBehavior#getEmbedders <em>Embedders</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.KnowledgeContainerBehavior#getBehaviorBooks <em>Behavior Books</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getKnowledgeContainerBehavior()
 * @model
 * @generated
 */
public interface KnowledgeContainerBehavior extends AbstractKnowledgeContainer {
	/**
	 * Returns the value of the '<em><b>Steps Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.StepsLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps Libraries</em>' containment reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getKnowledgeContainerBehavior_StepsLibraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<StepsLibrary> getStepsLibraries();

	/**
	 * Returns the value of the '<em><b>Embedders</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.EmbedderDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedders</em>' containment reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getKnowledgeContainerBehavior_Embedders()
	 * @model containment="true"
	 * @generated
	 */
	EList<EmbedderDefinition> getEmbedders();

	/**
	 * Returns the value of the '<em><b>Behavior Books</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.BehaviorBook}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Books</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Books</em>' containment reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getKnowledgeContainerBehavior_BehaviorBooks()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehaviorBook> getBehaviorBooks();

} // KnowledgeContainerBehavior
