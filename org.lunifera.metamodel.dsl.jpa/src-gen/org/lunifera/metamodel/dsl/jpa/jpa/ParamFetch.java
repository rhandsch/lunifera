/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Fetch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamFetch#getFetch <em>Fetch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getParamFetch()
 * @model
 * @generated
 */
public interface ParamFetch extends EObject
{
  /**
   * Returns the value of the '<em><b>Fetch</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.metamodel.dsl.jpa.jpa.FetchType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fetch</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fetch</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.FetchType
   * @see #setFetch(FetchType)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getParamFetch_Fetch()
   * @model
   * @generated
   */
  FetchType getFetch();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamFetch#getFetch <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fetch</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.FetchType
   * @see #getFetch()
   * @generated
   */
  void setFetch(FetchType value);

} // ParamFetch
