/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.common.AbstractDescribedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steps Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.StepsLibrary#getImplementationClasses <em>Implementation Classes</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.StepsLibrary#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStepsLibrary()
 * @model
 * @generated
 */
public interface StepsLibrary extends AbstractDescribedClass {
	/**
	 * Returns the value of the '<em><b>Implementation Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.StepsImplementationClass}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Classes</em>' containment reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStepsLibrary_ImplementationClasses()
	 * @see org.lunifera.metamodel.behavior.StepsImplementationClass#getLibrary
	 * @model opposite="library" containment="true" keys="id"
	 * @generated
	 */
	EList<StepsImplementationClass> getImplementationClasses();

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
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStepsLibrary_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

} // StepsLibrary
