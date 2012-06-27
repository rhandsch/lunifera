/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.metamodel.dsl.jpa.jpa.CascadeType;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage;
import org.lunifera.metamodel.dsl.jpa.jpa.ParamCascade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Cascade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamCascadeImpl#getCascade <em>Cascade</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamCascadeImpl extends MinimalEObjectImpl.Container implements ParamCascade
{
  /**
   * The default value of the '{@link #getCascade() <em>Cascade</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCascade()
   * @generated
   * @ordered
   */
  protected static final CascadeType CASCADE_EDEFAULT = CascadeType.ALL;

  /**
   * The cached value of the '{@link #getCascade() <em>Cascade</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCascade()
   * @generated
   * @ordered
   */
  protected CascadeType cascade = CASCADE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamCascadeImpl()
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
    return JpaPackage.Literals.PARAM_CASCADE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CascadeType getCascade()
  {
    return cascade;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCascade(CascadeType newCascade)
  {
    CascadeType oldCascade = cascade;
    cascade = newCascade == null ? CASCADE_EDEFAULT : newCascade;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.PARAM_CASCADE__CASCADE, oldCascade, cascade));
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
      case JpaPackage.PARAM_CASCADE__CASCADE:
        return getCascade();
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
      case JpaPackage.PARAM_CASCADE__CASCADE:
        setCascade((CascadeType)newValue);
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
      case JpaPackage.PARAM_CASCADE__CASCADE:
        setCascade(CASCADE_EDEFAULT);
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
      case JpaPackage.PARAM_CASCADE__CASCADE:
        return cascade != CASCADE_EDEFAULT;
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
    result.append(" (cascade: ");
    result.append(cascade);
    result.append(')');
    return result.toString();
  }

} //ParamCascadeImpl
