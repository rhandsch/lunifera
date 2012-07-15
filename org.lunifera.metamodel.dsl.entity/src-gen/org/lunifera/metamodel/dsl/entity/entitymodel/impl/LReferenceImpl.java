/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LReferenceImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LReferenceImpl extends LEntityMemberImpl implements LReference
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected LEntity type;

  /**
   * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected LMultiplicity multiplicity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LReferenceImpl()
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
    return EntitymodelPackage.Literals.LREFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEntity getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (LEntity)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntitymodelPackage.LREFERENCE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEntity basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(LEntity newType)
  {
    LEntity oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LREFERENCE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LMultiplicity getMultiplicity()
  {
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMultiplicity(LMultiplicity newMultiplicity, NotificationChain msgs)
  {
    LMultiplicity oldMultiplicity = multiplicity;
    multiplicity = newMultiplicity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LREFERENCE__MULTIPLICITY, oldMultiplicity, newMultiplicity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplicity(LMultiplicity newMultiplicity)
  {
    if (newMultiplicity != multiplicity)
    {
      NotificationChain msgs = null;
      if (multiplicity != null)
        msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LREFERENCE__MULTIPLICITY, null, msgs);
      if (newMultiplicity != null)
        msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LREFERENCE__MULTIPLICITY, null, msgs);
      msgs = basicSetMultiplicity(newMultiplicity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LREFERENCE__MULTIPLICITY, newMultiplicity, newMultiplicity));
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
      case EntitymodelPackage.LREFERENCE__MULTIPLICITY:
        return basicSetMultiplicity(null, msgs);
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
      case EntitymodelPackage.LREFERENCE__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case EntitymodelPackage.LREFERENCE__MULTIPLICITY:
        return getMultiplicity();
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
      case EntitymodelPackage.LREFERENCE__TYPE:
        setType((LEntity)newValue);
        return;
      case EntitymodelPackage.LREFERENCE__MULTIPLICITY:
        setMultiplicity((LMultiplicity)newValue);
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
      case EntitymodelPackage.LREFERENCE__TYPE:
        setType((LEntity)null);
        return;
      case EntitymodelPackage.LREFERENCE__MULTIPLICITY:
        setMultiplicity((LMultiplicity)null);
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
      case EntitymodelPackage.LREFERENCE__TYPE:
        return type != null;
      case EntitymodelPackage.LREFERENCE__MULTIPLICITY:
        return multiplicity != null;
    }
    return super.eIsSet(featureID);
  }

} //LReferenceImpl
