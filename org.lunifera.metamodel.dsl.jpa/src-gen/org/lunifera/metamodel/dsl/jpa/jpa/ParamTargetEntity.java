/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Target Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getParamTargetEntity()
 * @model
 * @generated
 */
public interface ParamTargetEntity extends EObject
{
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
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getParamTargetEntity_TargetEntity()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getTargetEntity();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity#getTargetEntity <em>Target Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Entity</em>' containment reference.
   * @see #getTargetEntity()
   * @generated
   */
  void setTargetEntity(JvmParameterizedTypeReference value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.metamodel.dsl.jpa.jpa.classSuffix}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.classSuffix
   * @see #setClass(classSuffix)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getParamTargetEntity_Class()
   * @model
   * @generated
   */
  classSuffix getClass_();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.classSuffix
   * @see #getClass_()
   * @generated
   */
  void setClass(classSuffix value);

} // ParamTargetEntity
