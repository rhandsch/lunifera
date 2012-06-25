/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.metamodel.dsl.entity.entity.EntityModel;

import org.lunifera.metamodel.dsl.jpa.jpa.JModel;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JModelImpl#getJmodel <em>Jmodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JModelImpl extends MinimalEObjectImpl.Container implements JModel
{
  /**
   * The cached value of the '{@link #getJmodel() <em>Jmodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJmodel()
   * @generated
   * @ordered
   */
  protected EntityModel jmodel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JModelImpl()
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
    return JpaPackage.Literals.JMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityModel getJmodel()
  {
    return jmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJmodel(EntityModel newJmodel, NotificationChain msgs)
  {
    EntityModel oldJmodel = jmodel;
    jmodel = newJmodel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpaPackage.JMODEL__JMODEL, oldJmodel, newJmodel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJmodel(EntityModel newJmodel)
  {
    if (newJmodel != jmodel)
    {
      NotificationChain msgs = null;
      if (jmodel != null)
        msgs = ((InternalEObject)jmodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpaPackage.JMODEL__JMODEL, null, msgs);
      if (newJmodel != null)
        msgs = ((InternalEObject)newJmodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpaPackage.JMODEL__JMODEL, null, msgs);
      msgs = basicSetJmodel(newJmodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.JMODEL__JMODEL, newJmodel, newJmodel));
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
      case JpaPackage.JMODEL__JMODEL:
        return basicSetJmodel(null, msgs);
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
      case JpaPackage.JMODEL__JMODEL:
        return getJmodel();
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
      case JpaPackage.JMODEL__JMODEL:
        setJmodel((EntityModel)newValue);
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
      case JpaPackage.JMODEL__JMODEL:
        setJmodel((EntityModel)null);
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
      case JpaPackage.JMODEL__JMODEL:
        return jmodel != null;
    }
    return super.eIsSet(featureID);
  }

} //JModelImpl
