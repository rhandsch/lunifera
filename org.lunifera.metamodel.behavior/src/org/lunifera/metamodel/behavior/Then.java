/**
 */
package org.lunifera.metamodel.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Then</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.Then#getExpectedOutcome <em>Expected Outcome</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getThen()
 * @model
 * @generated
 */
public interface Then extends Step {
	/**
	 * Returns the value of the '<em><b>Expected Outcome</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Outcome</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Outcome</em>' reference.
	 * @see #setExpectedOutcome(Expectation)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getThen_ExpectedOutcome()
	 * @model
	 * @generated
	 */
	Expectation getExpectedOutcome();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Then#getExpectedOutcome <em>Expected Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Outcome</em>' reference.
	 * @see #getExpectedOutcome()
	 * @generated
	 */
	void setExpectedOutcome(Expectation value);

} // Then
