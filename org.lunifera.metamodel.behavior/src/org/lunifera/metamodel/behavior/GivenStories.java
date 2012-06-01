/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Given Stories</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.GivenStories#getStoryPaths <em>Story Paths</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getGivenStories()
 * @model
 * @generated
 */
public interface GivenStories extends EObject {
	/**
	 * Returns the value of the '<em><b>Story Paths</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.StoryPath}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.behavior.StoryPath#getGivenStories <em>Given Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story Paths</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Story Paths</em>' containment reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getGivenStories_StoryPaths()
	 * @see org.lunifera.metamodel.behavior.StoryPath#getGivenStories
	 * @model opposite="givenStories" containment="true"
	 * @generated
	 */
	EList<StoryPath> getStoryPaths();

} // GivenStories
