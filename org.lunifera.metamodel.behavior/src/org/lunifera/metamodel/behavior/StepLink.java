/**
 */
package org.lunifera.metamodel.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.StepLink#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStepLink()
 * @model
 * @generated
 */
public interface StepLink extends Step {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Step)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStepLink_Link()
	 * @model
	 * @generated
	 */
	Step getLink();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.StepLink#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Step value);

} // StepLink
