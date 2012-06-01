/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.common.AbstractDescribedClass;

import org.lunifera.metamodel.software.AbstractSoftwareComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.BehaviorBook#getRelatedSoftwareComponent <em>Related Software Component</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.BehaviorBook#getStories <em>Stories</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getBehaviorBook()
 * @model
 * @generated
 */
public interface BehaviorBook extends AbstractDescribedClass {
	/**
	 * Returns the value of the '<em><b>Related Software Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Software Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Software Component</em>' reference.
	 * @see #setRelatedSoftwareComponent(AbstractSoftwareComponent)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getBehaviorBook_RelatedSoftwareComponent()
	 * @model
	 * @generated
	 */
	AbstractSoftwareComponent getRelatedSoftwareComponent();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.BehaviorBook#getRelatedSoftwareComponent <em>Related Software Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Software Component</em>' reference.
	 * @see #getRelatedSoftwareComponent()
	 * @generated
	 */
	void setRelatedSoftwareComponent(AbstractSoftwareComponent value);

	/**
	 * Returns the value of the '<em><b>Stories</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.Story}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stories</em>' containment reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getBehaviorBook_Stories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Story> getStories();

} // BehaviorBook
