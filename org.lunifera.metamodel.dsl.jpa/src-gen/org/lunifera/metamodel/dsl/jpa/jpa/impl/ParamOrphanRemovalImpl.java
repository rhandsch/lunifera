/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage;
import org.lunifera.metamodel.dsl.jpa.jpa.ParamOrphanRemoval;
import org.lunifera.metamodel.dsl.jpa.jpa.booleanType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Orphan Removal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamOrphanRemovalImpl#getOrphanRemoval <em>Orphan Removal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamOrphanRemovalImpl extends MinimalEObjectImpl.Container implements ParamOrphanRemoval
{
  /**
   * The default value of the '{@link #getOrphanRemoval() <em>Orphan Removal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrphanRemoval()
   * @generated
   * @ordered
   */
  protected static final booleanType ORPHAN_REMOVAL_EDEFAULT = booleanType.TRUE;

  /**
   * The cached value of the '{@link #getOrphanRemoval() <em>Orphan Removal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrphanRemoval()
   * @generated
   * @ordered
   */
  protected booleanType orphanRemoval = ORPHAN_REMOVAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamOrphanRemovalImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JpaPackage.Literals.PARAM_ORPHAN_REMOVAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public booleanType getOrphanRemoval()
  {
    return orphanRemoval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrphanRemoval(booleanType newOrphanRemoval)
  {
    booleanType oldOrphanRemoval = orphanRemoval;
    orphanRemoval = newOrphanRemoval == null ? ORPHAN_REMOVAL_EDEFAULT : newOrphanRemoval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.PARAM_ORPHAN_REMOVAL__ORPHAN_REMOVAL, oldOrphanRemoval, orphanRemoval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JpaPackage.PARAM_ORPHAN_REMOVAL__ORPHAN_REMOVAL:
        return getOrphanRemoval();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JpaPackage.PARAM_ORPHAN_REMOVAL__ORPHAN_REMOVAL:
        setOrphanRemoval((booleanType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JpaPackage.PARAM_ORPHAN_REMOVAL__ORPHAN_REMOVAL:
        setOrphanRemoval(ORPHAN_REMOVAL_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JpaPackage.PARAM_ORPHAN_REMOVAL__ORPHAN_REMOVAL:
        return orphanRemoval != ORPHAN_REMOVAL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (orphanRemoval: ");
    result.append(orphanRemoval);
    result.append(')');
    return result.toString();
  }

} //ParamOrphanRemovalImpl
