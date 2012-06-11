/**
 * <copyright>
 * </copyright>
 *

 */
package org.lunifera.metamodel.dsl.entity.entity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entity.Reference#getRefType <em>Ref Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.entity.EntityPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Feature
{
  /**
   * Returns the value of the '<em><b>Ref Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.metamodel.dsl.entity.entity.RefType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Type</em>' attribute.
   * @see org.lunifera.metamodel.dsl.entity.entity.RefType
   * @see #setRefType(RefType)
   * @see org.lunifera.metamodel.dsl.entity.entity.EntityPackage#getReference_RefType()
   * @model
   * @generated
   */
  RefType getRefType();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entity.Reference#getRefType <em>Ref Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Type</em>' attribute.
   * @see org.lunifera.metamodel.dsl.entity.entity.RefType
   * @see #getRefType()
   * @generated
   */
  void setRefType(RefType value);

} // Reference
