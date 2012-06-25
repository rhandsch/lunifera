/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.metamodel.dsl.entity.entity.EntityModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.JModel#getJmodel <em>Jmodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getJModel()
 * @model
 * @generated
 */
public interface JModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Jmodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jmodel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jmodel</em>' containment reference.
   * @see #setJmodel(EntityModel)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getJModel_Jmodel()
   * @model containment="true"
   * @generated
   */
  EntityModel getJmodel();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.JModel#getJmodel <em>Jmodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jmodel</em>' containment reference.
   * @see #getJmodel()
   * @generated
   */
  void setJmodel(EntityModel value);

} // JModel
