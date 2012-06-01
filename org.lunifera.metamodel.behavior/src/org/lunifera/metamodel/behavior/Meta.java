/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.Meta#getMetaItems <em>Meta Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getMeta()
 * @model
 * @generated
 */
public interface Meta extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.MetaProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Items</em>' containment reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getMeta_MetaItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaProperty> getMetaItems();

} // Meta
