/**
 */
package org.lunifera.metamodel.dsl.entity.lentity;

import org.eclipse.xtext.common.types.JvmField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LContains JVM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.lentity.LContainsJVM#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#getLContainsJVM()
 * @model
 * @generated
 */
public interface LContainsJVM extends LReferenceJVM
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
   * @see #setOpposite(JvmField)
   * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#getLContainsJVM_Opposite()
   * @model
   * @generated
   */
  JvmField getOpposite();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.lentity.LContainsJVM#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(JvmField value);

} // LContainsJVM
