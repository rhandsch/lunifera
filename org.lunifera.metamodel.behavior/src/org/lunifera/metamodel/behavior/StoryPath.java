/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Story Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.StoryPath#getPath <em>Path</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.StoryPath#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.StoryPath#getGivenStories <em>Given Stories</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStoryPath()
 * @model
 * @generated
 */
public interface StoryPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStoryPath_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.StoryPath#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStoryPath_Parameters()
	 * @model
	 * @generated
	 */
	EList<String> getParameters();

	/**
	 * Returns the value of the '<em><b>Given Stories</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.behavior.GivenStories#getStoryPaths <em>Story Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given Stories</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given Stories</em>' container reference.
	 * @see #setGivenStories(GivenStories)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStoryPath_GivenStories()
	 * @see org.lunifera.metamodel.behavior.GivenStories#getStoryPaths
	 * @model opposite="storyPaths" required="true" transient="false"
	 * @generated
	 */
	GivenStories getGivenStories();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.StoryPath#getGivenStories <em>Given Stories</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Stories</em>' container reference.
	 * @see #getGivenStories()
	 * @generated
	 */
	void setGivenStories(GivenStories value);

} // StoryPath
