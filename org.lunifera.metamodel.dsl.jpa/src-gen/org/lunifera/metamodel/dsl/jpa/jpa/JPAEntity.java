/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.lunifera.metamodel.dsl.entity.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JPA Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.JPAEntity#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getJPAEntity()
 * @model
 * @generated
 */
public interface JPAEntity extends JPAModel
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Entity)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getJPAEntity_Name()
   * @model containment="true"
   * @generated
   */
  Entity getName();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.JPAEntity#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Entity value);

} // JPAEntity
