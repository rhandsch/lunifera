/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Cascade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamCascade#getCascade <em>Cascade</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getParamCascade()
 * @model
 * @generated
 */
public interface ParamCascade extends EObject
{
  /**
   * Returns the value of the '<em><b>Cascade</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.metamodel.dsl.jpa.jpa.CascadeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cascade</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cascade</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.CascadeType
   * @see #setCascade(CascadeType)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getParamCascade_Cascade()
   * @model
   * @generated
   */
  CascadeType getCascade();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamCascade#getCascade <em>Cascade</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cascade</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.CascadeType
   * @see #getCascade()
   * @generated
   */
  void setCascade(CascadeType value);

} // ParamCascade
