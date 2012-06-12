/**
 */
package org.lunifera.metamodel.dsl.entity.entity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entity.Property#getVarType <em>Var Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.entity.EntityPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Feature
{
  /**
   * Returns the value of the '<em><b>Var Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Type</em>' attribute.
   * @see #setVarType(String)
   * @see org.lunifera.metamodel.dsl.entity.entity.EntityPackage#getProperty_VarType()
   * @model
   * @generated
   */
  String getVarType();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entity.Property#getVarType <em>Var Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Type</em>' attribute.
   * @see #getVarType()
   * @generated
   */
  void setVarType(String value);

} // Property
