/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LGen Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings#isNoSource <em>No Source</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings#isLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings#isPropertyChangeSupport <em>Property Change Support</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLGenSettings()
 * @model
 * @generated
 */
public interface LGenSettings extends EObject
{
  /**
   * Returns the value of the '<em><b>No Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Source</em>' attribute.
   * @see #setNoSource(boolean)
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLGenSettings_NoSource()
   * @model
   * @generated
   */
  boolean isNoSource();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings#isNoSource <em>No Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No Source</em>' attribute.
   * @see #isNoSource()
   * @generated
   */
  void setNoSource(boolean value);

  /**
   * Returns the value of the '<em><b>Lifecycle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lifecycle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lifecycle</em>' attribute.
   * @see #setLifecycle(boolean)
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLGenSettings_Lifecycle()
   * @model
   * @generated
   */
  boolean isLifecycle();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings#isLifecycle <em>Lifecycle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lifecycle</em>' attribute.
   * @see #isLifecycle()
   * @generated
   */
  void setLifecycle(boolean value);

  /**
   * Returns the value of the '<em><b>Property Change Support</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Change Support</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Change Support</em>' attribute.
   * @see #setPropertyChangeSupport(boolean)
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLGenSettings_PropertyChangeSupport()
   * @model
   * @generated
   */
  boolean isPropertyChangeSupport();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings#isPropertyChangeSupport <em>Property Change Support</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Change Support</em>' attribute.
   * @see #isPropertyChangeSupport()
   * @generated
   */
  void setPropertyChangeSupport(boolean value);

} // LGenSettings
