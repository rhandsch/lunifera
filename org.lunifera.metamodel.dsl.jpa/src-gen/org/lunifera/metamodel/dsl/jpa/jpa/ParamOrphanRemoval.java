/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Orphan Removal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamOrphanRemoval#getOrphanRemoval <em>Orphan Removal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getParamOrphanRemoval()
 * @model
 * @generated
 */
public interface ParamOrphanRemoval extends EObject
{
  /**
   * Returns the value of the '<em><b>Orphan Removal</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.metamodel.dsl.jpa.jpa.booleanType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orphan Removal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orphan Removal</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.booleanType
   * @see #setOrphanRemoval(booleanType)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getParamOrphanRemoval_OrphanRemoval()
   * @model
   * @generated
   */
  booleanType getOrphanRemoval();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamOrphanRemoval#getOrphanRemoval <em>Orphan Removal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orphan Removal</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.booleanType
   * @see #getOrphanRemoval()
   * @generated
   */
  void setOrphanRemoval(booleanType value);

} // ParamOrphanRemoval
