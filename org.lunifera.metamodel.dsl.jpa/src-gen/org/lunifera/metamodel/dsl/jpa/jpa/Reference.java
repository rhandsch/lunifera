/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.Reference#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends org.lunifera.metamodel.dsl.entity.entity.Reference
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.metamodel.dsl.jpa.jpa.ReferenceAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getReference_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<ReferenceAnnotation> getAnnotations();

} // Reference
