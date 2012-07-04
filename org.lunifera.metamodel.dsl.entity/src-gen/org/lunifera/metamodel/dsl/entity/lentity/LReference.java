/**
 */
package org.lunifera.metamodel.dsl.entity.lentity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.lentity.LReference#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.lentity.LReference#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#getLReference()
 * @model
 * @generated
 */
public interface LReference extends LEntityMember
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(LEntity)
   * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#getLReference_Type()
   * @model
   * @generated
   */
  LEntity getType();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.lentity.LReference#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(LEntity value);

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
   * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#getLReference_Multiplicity()
   * @model containment="true"
   * @generated
   */
  LMultiplicity getMultiplicity();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.lentity.LReference#getMultiplicity <em>Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' containment reference.
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(LMultiplicity value);

} // LReference
