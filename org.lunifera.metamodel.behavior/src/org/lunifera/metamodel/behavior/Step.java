/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.Step#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Step#getSentence <em>Sentence</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Step#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Step#getAnds <em>Ands</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStep_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentence</em>' containment reference.
	 * @see #setSentence(StepSentence)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStep_Sentence()
	 * @model containment="true"
	 * @generated
	 */
	StepSentence getSentence();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Step#getSentence <em>Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sentence</em>' containment reference.
	 * @see #getSentence()
	 * @generated
	 */
	void setSentence(StepSentence value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.StepParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStep_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<StepParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Ands</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ands</em>' containment reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStep_Ands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getAnds();

} // Step
