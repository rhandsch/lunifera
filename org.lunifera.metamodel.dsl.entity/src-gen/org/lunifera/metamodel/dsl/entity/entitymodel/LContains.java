/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LContains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LContains#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLContains()
 * @model
 * @generated
 */
public interface LContains extends LReference
{
  /**
   * Returns the value of the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opposite</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opposite</em>' reference.
   * @see #setOpposite(LContainer)
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLContains_Opposite()
   * @model
   * @generated
   */
  LContainer getOpposite();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LContains#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(LContainer value);

} // LContains
