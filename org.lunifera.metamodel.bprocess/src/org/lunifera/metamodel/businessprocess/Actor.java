/**
 */
package org.lunifera.metamodel.businessprocess;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.common.AbstractDescribedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.businessprocess.Actor#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends AbstractDescribedClass {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.businessprocess.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage#getActor_Roles()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles();

} // Actor
