/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage;
import org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity;
import org.lunifera.metamodel.dsl.jpa.jpa.classSuffix;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Target Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamTargetEntityImpl#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamTargetEntityImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamTargetEntityImpl extends MinimalEObjectImpl.Container implements ParamTargetEntity
{
  /**
   * The cached value of the '{@link #getTargetEntity() <em>Target Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetEntity()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference targetEntity;

  /**
   * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected static final classSuffix CLASS_EDEFAULT = classSuffix.CLASS;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected classSuffix class_ = CLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamTargetEntityImpl()
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
    return JpaPackage.Literals.PARAM_TARGET_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getTargetEntity()
  {
    return targetEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetEntity(JvmParameterizedTypeReference newTargetEntity, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldTargetEntity = targetEntity;
    targetEntity = newTargetEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpaPackage.PARAM_TARGET_ENTITY__TARGET_ENTITY, oldTargetEntity, newTargetEntity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetEntity(JvmParameterizedTypeReference newTargetEntity)
  {
    if (newTargetEntity != targetEntity)
    {
      NotificationChain msgs = null;
      if (targetEntity != null)
        msgs = ((InternalEObject)targetEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpaPackage.PARAM_TARGET_ENTITY__TARGET_ENTITY, null, msgs);
      if (newTargetEntity != null)
        msgs = ((InternalEObject)newTargetEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpaPackage.PARAM_TARGET_ENTITY__TARGET_ENTITY, null, msgs);
      msgs = basicSetTargetEntity(newTargetEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.PARAM_TARGET_ENTITY__TARGET_ENTITY, newTargetEntity, newTargetEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public classSuffix getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(classSuffix newClass)
  {
    classSuffix oldClass = class_;
    class_ = newClass == null ? CLASS_EDEFAULT : newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.PARAM_TARGET_ENTITY__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JpaPackage.PARAM_TARGET_ENTITY__TARGET_ENTITY:
        return basicSetTargetEntity(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case JpaPackage.PARAM_TARGET_ENTITY__TARGET_ENTITY:
        return getTargetEntity();
      case JpaPackage.PARAM_TARGET_ENTITY__CLASS:
        return getClass_();
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
      case JpaPackage.PARAM_TARGET_ENTITY__TARGET_ENTITY:
        setTargetEntity((JvmParameterizedTypeReference)newValue);
        return;
      case JpaPackage.PARAM_TARGET_ENTITY__CLASS:
        setClass((classSuffix)newValue);
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
      case JpaPackage.PARAM_TARGET_ENTITY__TARGET_ENTITY:
        setTargetEntity((JvmParameterizedTypeReference)null);
        return;
      case JpaPackage.PARAM_TARGET_ENTITY__CLASS:
        setClass(CLASS_EDEFAULT);
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
      case JpaPackage.PARAM_TARGET_ENTITY__TARGET_ENTITY:
        return targetEntity != null;
      case JpaPackage.PARAM_TARGET_ENTITY__CLASS:
        return class_ != CLASS_EDEFAULT;
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
    result.append(" (class: ");
    result.append(class_);
    result.append(')');
    return result.toString();
  }

} //ParamTargetEntityImpl
