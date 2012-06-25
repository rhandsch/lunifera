/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.Property#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends org.lunifera.metamodel.dsl.entity.entity.Property
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.metamodel.dsl.jpa.jpa.JpaPropertyAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getProperty_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<JpaPropertyAnnotation> getAnnotations();

} // Property
