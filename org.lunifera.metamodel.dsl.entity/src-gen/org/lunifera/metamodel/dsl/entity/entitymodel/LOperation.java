/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getOperationAnnotation <em>Operation Annotation</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getParams <em>Params</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLOperation()
 * @model
 * @generated
 */
public interface LOperation extends LEntityMember
{
  /**
   * Returns the value of the '<em><b>Operation Annotation</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Annotation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Annotation</em>' containment reference list.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLOperation_OperationAnnotation()
   * @model containment="true"
   * @generated
   */
  EList<XAnnotation> getOperationAnnotation();

  /**
   * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' containment reference.
   * @see #setModifier(LModifier)
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLOperation_Modifier()
   * @model containment="true"
   * @generated
   */
  LModifier getModifier();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getModifier <em>Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' containment reference.
   * @see #getModifier()
   * @generated
   */
  void setModifier(LModifier value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLOperation_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmFormalParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLOperation_Params()
   * @model containment="true"
   * @generated
   */
  EList<JvmFormalParameter> getParams();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(XExpression)
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLOperation_Body()
   * @model containment="true"
   * @generated
   */
  XExpression getBody();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(XExpression value);

} // LOperation