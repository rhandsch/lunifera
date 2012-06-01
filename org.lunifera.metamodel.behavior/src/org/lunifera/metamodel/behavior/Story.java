/**
 */
package org.lunifera.metamodel.behavior;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Story</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.Story#getBehaviorModel <em>Behavior Model</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Story#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Story#getNarrative <em>Narrative</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Story#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Story#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Story#getImportFrom <em>Import From</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.Story#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStory()
 * @model
 * @generated
 */
public interface Story extends EObject {
	/**
	 * Returns the value of the '<em><b>Behavior Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Model</em>' reference.
	 * @see #setBehaviorModel(KnowledgeContainerBehavior)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStory_BehaviorModel()
	 * @model required="true"
	 * @generated
	 */
	KnowledgeContainerBehavior getBehaviorModel();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Story#getBehaviorModel <em>Behavior Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Model</em>' reference.
	 * @see #getBehaviorModel()
	 * @generated
	 */
	void setBehaviorModel(KnowledgeContainerBehavior value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStory_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Story#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Narrative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Narrative</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Narrative</em>' containment reference.
	 * @see #setNarrative(Narrative)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStory_Narrative()
	 * @model containment="true"
	 * @generated
	 */
	Narrative getNarrative();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Story#getNarrative <em>Narrative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Narrative</em>' containment reference.
	 * @see #getNarrative()
	 * @generated
	 */
	void setNarrative(Narrative value);

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.Scenario}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.behavior.Scenario#getStory <em>Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStory_Scenarios()
	 * @see org.lunifera.metamodel.behavior.Scenario#getStory
	 * @model opposite="story" containment="true"
	 * @generated
	 */
	EList<Scenario> getScenarios();

	/**
	 * Returns the value of the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' containment reference.
	 * @see #setMeta(Meta)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStory_Meta()
	 * @model containment="true"
	 * @generated
	 */
	Meta getMeta();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Story#getMeta <em>Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta</em>' containment reference.
	 * @see #getMeta()
	 * @generated
	 */
	void setMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Import From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import From</em>' reference.
	 * @see #setImportFrom(StorySource)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStory_ImportFrom()
	 * @model
	 * @generated
	 */
	StorySource getImportFrom();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Story#getImportFrom <em>Import From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import From</em>' reference.
	 * @see #getImportFrom()
	 * @generated
	 */
	void setImportFrom(StorySource value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStory_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.Story#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

} // Story
