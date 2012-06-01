/**
 */
package org.lunifera.metamodel.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.When#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getWhen()
 * @model
 * @generated
 */
public interface When extends Step {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(ActionSentence)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getWhen_Action()
	 * @model
	 * @generated
	 */
	ActionSentence getAction();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.When#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionSentence value);

} // When
