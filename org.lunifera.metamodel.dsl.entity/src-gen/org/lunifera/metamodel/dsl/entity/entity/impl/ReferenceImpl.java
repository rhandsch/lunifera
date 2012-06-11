/**
 * <copyright>
 * </copyright>
 *

 */
package org.lunifera.metamodel.dsl.entity.entity.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.dsl.entity.entity.EntityPackage;
import org.lunifera.metamodel.dsl.entity.entity.RefType;
import org.lunifera.metamodel.dsl.entity.entity.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entity.impl.ReferenceImpl#getRefType <em>Ref Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceImpl extends FeatureImpl implements Reference
{
  /**
   * The default value of the '{@link #getRefType() <em>Ref Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefType()
   * @generated
   * @ordered
   */
  protected static final RefType REF_TYPE_EDEFAULT = RefType.CONTAIN;

  /**
   * The cached value of the '{@link #getRefType() <em>Ref Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefType()
   * @generated
   * @ordered
   */
  protected RefType refType = REF_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceImpl()
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
    return EntityPackage.Literals.REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefType getRefType()
  {
    return refType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefType(RefType newRefType)
  {
    RefType oldRefType = refType;
    refType = newRefType == null ? REF_TYPE_EDEFAULT : newRefType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.REFERENCE__REF_TYPE, oldRefType, refType));
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
      case EntityPackage.REFERENCE__REF_TYPE:
        return getRefType();
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
      case EntityPackage.REFERENCE__REF_TYPE:
        setRefType((RefType)newValue);
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
      case EntityPackage.REFERENCE__REF_TYPE:
        setRefType(REF_TYPE_EDEFAULT);
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
      case EntityPackage.REFERENCE__REF_TYPE:
        return refType != REF_TYPE_EDEFAULT;
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
    result.append(" (refType: ");
    result.append(refType);
    result.append(')');
    return result.toString();
  }

} //ReferenceImpl
