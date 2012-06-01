/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Narrative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.Narrative#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Narrative#getAsA <em>As A</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Narrative#getIWantTo <em>IWant To</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Narrative#getInOrderTo <em>In Order To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getNarrative()
 * @model
 * @generated
 */
public interface Narrative extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getNarrative_Id()
	 * @model id="true"
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Narrative#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

	/**
	 * Returns the value of the '<em><b>As A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As A</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As A</em>' containment reference.
	 * @see #setAsA(AsA)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getNarrative_AsA()
	 * @model containment="true"
	 * @generated
	 */
	AsA getAsA();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Narrative#getAsA <em>As A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As A</em>' containment reference.
	 * @see #getAsA()
	 * @generated
	 */
	void setAsA(AsA value);

	/**
	 * Returns the value of the '<em><b>IWant To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IWant To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IWant To</em>' containment reference.
	 * @see #setIWantTo(IWantTo)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getNarrative_IWantTo()
	 * @model containment="true"
	 * @generated
	 */
	IWantTo getIWantTo();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Narrative#getIWantTo <em>IWant To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IWant To</em>' containment reference.
	 * @see #getIWantTo()
	 * @generated
	 */
	void setIWantTo(IWantTo value);

	/**
	 * Returns the value of the '<em><b>In Order To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Order To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Order To</em>' containment reference.
	 * @see #setInOrderTo(InOrderTo)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getNarrative_InOrderTo()
	 * @model containment="true"
	 * @generated
	 */
	InOrderTo getInOrderTo();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Narrative#getInOrderTo <em>In Order To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Order To</em>' containment reference.
	 * @see #getInOrderTo()
	 * @generated
	 */
	void setInOrderTo(InOrderTo value);

} // Narrative
