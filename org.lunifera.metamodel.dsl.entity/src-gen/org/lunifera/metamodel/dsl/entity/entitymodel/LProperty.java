/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LProperty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LProperty#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLProperty()
 * @model
 * @generated
 */
public interface LProperty extends LEntityMember
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
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLProperty_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LProperty#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Default Value Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value Literal</em>' attribute.
   * @see #setDefaultValueLiteral(String)
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLProperty_DefaultValueLiteral()
   * @model
   * @generated
   */
  String getDefaultValueLiteral();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LProperty#getDefaultValueLiteral <em>Default Value Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value Literal</em>' attribute.
   * @see #getDefaultValueLiteral()
   * @generated
   */
  void setDefaultValueLiteral(String value);

} // LProperty
