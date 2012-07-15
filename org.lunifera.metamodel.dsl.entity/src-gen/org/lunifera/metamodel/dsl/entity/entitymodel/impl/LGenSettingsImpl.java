/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage;
import org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LGen Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LGenSettingsImpl#isLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LGenSettingsImpl#isPropertyChangeSupport <em>Property Change Support</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LGenSettingsImpl extends MinimalEObjectImpl.Container implements LGenSettings
{
  /**
   * The default value of the '{@link #isLifecycle() <em>Lifecycle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLifecycle()
   * @generated
   * @ordered
   */
  protected static final boolean LIFECYCLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLifecycle() <em>Lifecycle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLifecycle()
   * @generated
   * @ordered
   */
  protected boolean lifecycle = LIFECYCLE_EDEFAULT;

  /**
   * The default value of the '{@link #isPropertyChangeSupport() <em>Property Change Support</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPropertyChangeSupport()
   * @generated
   * @ordered
   */
  protected static final boolean PROPERTY_CHANGE_SUPPORT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPropertyChangeSupport() <em>Property Change Support</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPropertyChangeSupport()
   * @generated
   * @ordered
   */
  protected boolean propertyChangeSupport = PROPERTY_CHANGE_SUPPORT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LGenSettingsImpl()
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
    return EntitymodelPackage.Literals.LGEN_SETTINGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLifecycle()
  {
    return lifecycle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLifecycle(boolean newLifecycle)
  {
    boolean oldLifecycle = lifecycle;
    lifecycle = newLifecycle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LGEN_SETTINGS__LIFECYCLE, oldLifecycle, lifecycle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPropertyChangeSupport()
  {
    return propertyChangeSupport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyChangeSupport(boolean newPropertyChangeSupport)
  {
    boolean oldPropertyChangeSupport = propertyChangeSupport;
    propertyChangeSupport = newPropertyChangeSupport;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LGEN_SETTINGS__PROPERTY_CHANGE_SUPPORT, oldPropertyChangeSupport, propertyChangeSupport));
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
      case EntitymodelPackage.LGEN_SETTINGS__LIFECYCLE:
        return isLifecycle();
      case EntitymodelPackage.LGEN_SETTINGS__PROPERTY_CHANGE_SUPPORT:
        return isPropertyChangeSupport();
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
      case EntitymodelPackage.LGEN_SETTINGS__LIFECYCLE:
        setLifecycle((Boolean)newValue);
        return;
      case EntitymodelPackage.LGEN_SETTINGS__PROPERTY_CHANGE_SUPPORT:
        setPropertyChangeSupport((Boolean)newValue);
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
      case EntitymodelPackage.LGEN_SETTINGS__LIFECYCLE:
        setLifecycle(LIFECYCLE_EDEFAULT);
        return;
      case EntitymodelPackage.LGEN_SETTINGS__PROPERTY_CHANGE_SUPPORT:
        setPropertyChangeSupport(PROPERTY_CHANGE_SUPPORT_EDEFAULT);
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
      case EntitymodelPackage.LGEN_SETTINGS__LIFECYCLE:
        return lifecycle != LIFECYCLE_EDEFAULT;
      case EntitymodelPackage.LGEN_SETTINGS__PROPERTY_CHANGE_SUPPORT:
        return propertyChangeSupport != PROPERTY_CHANGE_SUPPORT_EDEFAULT;
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
    result.append(" (lifecycle: ");
    result.append(lifecycle);
    result.append(", propertyChangeSupport: ");
    result.append(propertyChangeSupport);
    result.append(')');
    return result.toString();
  }

} //LGenSettingsImpl
