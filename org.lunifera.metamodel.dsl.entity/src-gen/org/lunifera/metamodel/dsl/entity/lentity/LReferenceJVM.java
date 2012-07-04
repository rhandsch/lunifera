/**
 */
package org.lunifera.metamodel.dsl.entity.lentity;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LReference JVM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.lentity.LReferenceJVM#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.lentity.LReferenceJVM#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#getLReferenceJVM()
 * @model
 * @generated
 */
public interface LReferenceJVM extends LEntityMember
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#getLReferenceJVM_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.lentity.LReferenceJVM#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' containment reference.
   * @see #setMultiplicity(LMultiplicity)
   * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#getLReferenceJVM_Multiplicity()
   * @model containment="true"
   * @generated
   */
  LMultiplicity getMultiplicity();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.lentity.LReferenceJVM#getMultiplicity <em>Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' containment reference.
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(LMultiplicity value);

} // LReferenceJVM
