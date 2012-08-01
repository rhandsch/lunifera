/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEntity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntity#getEntityMembers <em>Entity Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLEntity()
 * @model
 * @generated
 */
public interface LEntity extends LType
{
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
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLEntity_SuperType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getSuperType();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntity#getSuperType <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' containment reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Entity Members</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntityMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Members</em>' containment reference list.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLEntity_EntityMembers()
   * @model containment="true"
   * @generated
   */
  EList<LEntityMember> getEntityMembers();

} // LEntity
