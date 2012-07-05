/**
 */
package org.lunifera.metamodel.dsl.entity.lentity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEntity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.lentity.LEntity#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.lentity.LEntity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.lentity.LEntity#getEntityMembers <em>Entity Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#getLEntity()
 * @model
 * @generated
 */
public interface LEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#getLEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' containment reference.
   * @see #setSuperType(JvmTypeReference)
   * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#getLEntity_SuperType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getSuperType();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntity#getSuperType <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' containment reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Entity Members</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.metamodel.dsl.entity.lentity.LEntityMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Members</em>' containment reference list.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#getLEntity_EntityMembers()
   * @model containment="true"
   * @generated
   */
  EList<LEntityMember> getEntityMembers();

} // LEntity
