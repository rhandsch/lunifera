/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage;
import org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LowerBound;
import org.lunifera.metamodel.dsl.entity.entitymodel.UpperBound;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LMultiplicity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LMultiplicityImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LMultiplicityImpl#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LMultiplicityImpl extends MinimalEObjectImpl.Container implements LMultiplicity
{
  /**
   * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected static final LowerBound LOWER_EDEFAULT = LowerBound.MANY;

  /**
   * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected LowerBound lower = LOWER_EDEFAULT;

  /**
   * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper()
   * @generated
   * @ordered
   */
  protected static final UpperBound UPPER_EDEFAULT = UpperBound.MANY;

  /**
   * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper()
   * @generated
   * @ordered
   */
  protected UpperBound upper = UPPER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LMultiplicityImpl()
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
    return EntitymodelPackage.Literals.LMULTIPLICITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LowerBound getLower()
  {
    return lower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLower(LowerBound newLower)
  {
    LowerBound oldLower = lower;
    lower = newLower == null ? LOWER_EDEFAULT : newLower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LMULTIPLICITY__LOWER, oldLower, lower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpperBound getUpper()
  {
    return upper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpper(UpperBound newUpper)
  {
    UpperBound oldUpper = upper;
    upper = newUpper == null ? UPPER_EDEFAULT : newUpper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LMULTIPLICITY__UPPER, oldUpper, upper));
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
      case EntitymodelPackage.LMULTIPLICITY__LOWER:
        return getLower();
      case EntitymodelPackage.LMULTIPLICITY__UPPER:
        return getUpper();
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
      case EntitymodelPackage.LMULTIPLICITY__LOWER:
        setLower((LowerBound)newValue);
        return;
      case EntitymodelPackage.LMULTIPLICITY__UPPER:
        setUpper((UpperBound)newValue);
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
      case EntitymodelPackage.LMULTIPLICITY__LOWER:
        setLower(LOWER_EDEFAULT);
        return;
      case EntitymodelPackage.LMULTIPLICITY__UPPER:
        setUpper(UPPER_EDEFAULT);
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
      case EntitymodelPackage.LMULTIPLICITY__LOWER:
        return lower != LOWER_EDEFAULT;
      case EntitymodelPackage.LMULTIPLICITY__UPPER:
        return upper != UPPER_EDEFAULT;
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
    result.append(" (lower: ");
    result.append(lower);
    result.append(", upper: ");
    result.append(upper);
    result.append(')');
    return result.toString();
  }

} //LMultiplicityImpl
