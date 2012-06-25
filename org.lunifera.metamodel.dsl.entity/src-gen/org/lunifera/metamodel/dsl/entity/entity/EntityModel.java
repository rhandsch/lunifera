/**
 */
package org.lunifera.metamodel.dsl.entity.entity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entity.EntityModel#getPackage <em>Package</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entity.EntityModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.entity.EntityPackage#getEntityModel()
 * @model
 * @generated
 */
public interface EntityModel extends EObject
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
   * @see #setPackage(org.lunifera.metamodel.dsl.entity.entity.Package)
   * @see org.lunifera.metamodel.dsl.entity.entity.EntityPackage#getEntityModel_Package()
   * @model containment="true"
   * @generated
   */
  org.lunifera.metamodel.dsl.entity.entity.Package getPackage();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entity.EntityModel#getPackage <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' containment reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(org.lunifera.metamodel.dsl.entity.entity.Package value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.metamodel.dsl.entity.entity.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.lunifera.metamodel.dsl.entity.entity.EntityPackage#getEntityModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // EntityModel
