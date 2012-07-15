/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEntity Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel#getPackage <em>Package</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel#getImports <em>Imports</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLEntityModel()
 * @model
 * @generated
 */
public interface LEntityModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' containment reference.
   * @see #setPackage(LPackage)
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLEntityModel_Package()
   * @model containment="true"
   * @generated
   */
  LPackage getPackage();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel#getPackage <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' containment reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(LPackage value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.metamodel.dsl.entity.entitymodel.LImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLEntityModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<LImport> getImports();

  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference list.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLEntityModel_Entity()
   * @model containment="true"
   * @generated
   */
  EList<LEntity> getEntity();

} // LEntityModel
