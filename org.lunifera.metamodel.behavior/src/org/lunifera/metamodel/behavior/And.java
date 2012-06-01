/**
 */
package org.lunifera.metamodel.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.And#getStepOne <em>Step One</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getAnd()
 * @model
 * @generated
 */
public interface And extends Step {
	/**
	 * Returns the value of the '<em><b>Step One</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step One</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step One</em>' reference.
	 * @see #setStepOne(Step)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getAnd_StepOne()
	 * @model
	 * @generated
	 */
	Step getStepOne();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.And#getStepOne <em>Step One</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step One</em>' reference.
	 * @see #getStepOne()
	 * @generated
	 */
	void setStepOne(Step value);

} // And
