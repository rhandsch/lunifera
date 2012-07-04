/**
 */
package org.lunifera.metamodel.dsl.entity.lentity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LContainer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.lentity.LContainer#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#getLContainer()
 * @model
 * @generated
 */
public interface LContainer extends LReference
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
   * @see #setOpposite(LReference)
   * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#getLContainer_Opposite()
   * @model
   * @generated
   */
  LReference getOpposite();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.lentity.LContainer#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(LReference value);

} // LContainer
