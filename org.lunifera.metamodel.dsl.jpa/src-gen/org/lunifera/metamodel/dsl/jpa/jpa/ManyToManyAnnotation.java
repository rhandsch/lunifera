/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many To Many Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation#getMappedBy <em>Mapped By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getManyToManyAnnotation()
 * @model
 * @generated
 */
public interface ManyToManyAnnotation extends ReferenceAnnotation
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
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getManyToManyAnnotation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Entity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Entity</em>' containment reference.
   * @see #setTargetEntity(JvmParameterizedTypeReference)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getManyToManyAnnotation_TargetEntity()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getTargetEntity();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation#getTargetEntity <em>Target Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Entity</em>' containment reference.
   * @see #getTargetEntity()
   * @generated
   */
  void setTargetEntity(JvmParameterizedTypeReference value);

  /**
   * Returns the value of the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped By</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped By</em>' attribute.
   * @see #setMappedBy(String)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getManyToManyAnnotation_MappedBy()
   * @model
   * @generated
   */
  String getMappedBy();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation#getMappedBy <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped By</em>' attribute.
   * @see #getMappedBy()
   * @generated
   */
  void setMappedBy(String value);

} // ManyToManyAnnotation
