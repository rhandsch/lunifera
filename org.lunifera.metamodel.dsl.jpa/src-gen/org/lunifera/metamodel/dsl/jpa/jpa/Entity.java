/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.Entity#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends org.lunifera.metamodel.dsl.entity.entity.Entity
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.metamodel.dsl.jpa.jpa.JpaEntityAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getEntity_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<JpaEntityAnnotation> getAnnotations();

} // Entity
