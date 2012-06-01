/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.AsA#getBusinessRoles <em>Business Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getAsA()
 * @model
 * @generated
 */
public interface AsA extends EObject {
	/**
	 * Returns the value of the '<em><b>Business Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Roles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Roles</em>' attribute list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getAsA_BusinessRoles()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getBusinessRoles();

} // AsA
