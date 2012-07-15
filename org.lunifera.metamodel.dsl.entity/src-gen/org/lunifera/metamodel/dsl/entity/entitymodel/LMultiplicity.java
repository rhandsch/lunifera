/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LMultiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity#getLower <em>Lower</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLMultiplicity()
 * @model
 * @generated
 */
public interface LMultiplicity extends EObject
{
  /**
   * Returns the value of the '<em><b>Lower</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.metamodel.dsl.entity.entitymodel.LowerBound}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower</em>' attribute.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LowerBound
   * @see #setLower(LowerBound)
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLMultiplicity_Lower()
   * @model
   * @generated
   */
  LowerBound getLower();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity#getLower <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' attribute.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LowerBound
   * @see #getLower()
   * @generated
   */
  void setLower(LowerBound value);

  /**
   * Returns the value of the '<em><b>Upper</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.metamodel.dsl.entity.entitymodel.UpperBound}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper</em>' attribute.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.UpperBound
   * @see #setUpper(UpperBound)
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLMultiplicity_Upper()
   * @model
   * @generated
   */
  UpperBound getUpper();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity#getUpper <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' attribute.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.UpperBound
   * @see #getUpper()
   * @generated
   */
  void setUpper(UpperBound value);

} // LMultiplicity
