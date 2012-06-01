/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.Scenario#getStory <em>Story</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Scenario#getTitle <em>Title</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Scenario#getGivenStories <em>Given Stories</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Scenario#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Scenario#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Story</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.behavior.Story#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Story</em>' container reference.
	 * @see #setStory(Story)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getScenario_Story()
	 * @see org.lunifera.metamodel.behavior.Story#getScenarios
	 * @model opposite="scenarios" transient="false"
	 * @generated
	 */
	Story getStory();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Scenario#getStory <em>Story</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Story</em>' container reference.
	 * @see #getStory()
	 * @generated
	 */
	void setStory(Story value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getScenario_Title()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Scenario#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Given Stories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given Stories</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given Stories</em>' containment reference.
	 * @see #setGivenStories(GivenStories)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getScenario_GivenStories()
	 * @model containment="true"
	 * @generated
	 */
	GivenStories getGivenStories();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Scenario#getGivenStories <em>Given Stories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Stories</em>' containment reference.
	 * @see #getGivenStories()
	 * @generated
	 */
	void setGivenStories(GivenStories value);

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examples</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' containment reference.
	 * @see #setExamples(ExamplesTable)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getScenario_Examples()
	 * @model containment="true"
	 * @generated
	 */
	ExamplesTable getExamples();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Scenario#getExamples <em>Examples</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Examples</em>' containment reference.
	 * @see #getExamples()
	 * @generated
	 */
	void setExamples(ExamplesTable value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getScenario_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

} // Scenario
