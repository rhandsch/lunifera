/**
 */
package org.lunifera.metamodel.dsl.entity.entity.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.dsl.entity.entity.BoundLiteral;
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
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entity.impl.ReferenceImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entity.impl.ReferenceImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceImpl extends AbstractFeatureImpl implements Reference
{
  /**
   * The default value of the '{@link #getRefType() <em>Ref Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefType()
   * @generated
   * @ordered
   */
  protected static final RefType REF_TYPE_EDEFAULT = RefType.REFERS;

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
   * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected static final BoundLiteral LOWER_BOUND_EDEFAULT = BoundLiteral.ONE;

  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected BoundLiteral lowerBound = LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected static final BoundLiteral UPPER_BOUND_EDEFAULT = BoundLiteral.ONE;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected BoundLiteral upperBound = UPPER_BOUND_EDEFAULT;

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
  public BoundLiteral getLowerBound()
  {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(BoundLiteral newLowerBound)
  {
    BoundLiteral oldLowerBound = lowerBound;
    lowerBound = newLowerBound == null ? LOWER_BOUND_EDEFAULT : newLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.REFERENCE__LOWER_BOUND, oldLowerBound, lowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoundLiteral getUpperBound()
  {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBound(BoundLiteral newUpperBound)
  {
    BoundLiteral oldUpperBound = upperBound;
    upperBound = newUpperBound == null ? UPPER_BOUND_EDEFAULT : newUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.REFERENCE__UPPER_BOUND, oldUpperBound, upperBound));
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
      case EntityPackage.REFERENCE__LOWER_BOUND:
        return getLowerBound();
      case EntityPackage.REFERENCE__UPPER_BOUND:
        return getUpperBound();
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
      case EntityPackage.REFERENCE__LOWER_BOUND:
        setLowerBound((BoundLiteral)newValue);
        return;
      case EntityPackage.REFERENCE__UPPER_BOUND:
        setUpperBound((BoundLiteral)newValue);
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
      case EntityPackage.REFERENCE__LOWER_BOUND:
        setLowerBound(LOWER_BOUND_EDEFAULT);
        return;
      case EntityPackage.REFERENCE__UPPER_BOUND:
        setUpperBound(UPPER_BOUND_EDEFAULT);
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
      case EntityPackage.REFERENCE__LOWER_BOUND:
        return lowerBound != LOWER_BOUND_EDEFAULT;
      case EntityPackage.REFERENCE__UPPER_BOUND:
        return upperBound != UPPER_BOUND_EDEFAULT;
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
    result.append(", lowerBound: ");
    result.append(lowerBound);
    result.append(", upperBound: ");
    result.append(upperBound);
    result.append(')');
    return result.toString();
  }

} //ReferenceImpl
