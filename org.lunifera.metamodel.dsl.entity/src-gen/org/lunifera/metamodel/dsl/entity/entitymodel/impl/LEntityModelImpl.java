/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel;
import org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings;
import org.lunifera.metamodel.dsl.entity.entitymodel.LImport;
import org.lunifera.metamodel.dsl.entity.entitymodel.LPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEntity Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityModelImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityModelImpl#getGenSettings <em>Gen Settings</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityModelImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LEntityModelImpl extends MinimalEObjectImpl.Container implements LEntityModel
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected LPackage package_;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<LImport> imports;

  /**
   * The cached value of the '{@link #getGenSettings() <em>Gen Settings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenSettings()
   * @generated
   * @ordered
   */
  protected LGenSettings genSettings;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected EList<LEntity> entity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LEntityModelImpl()
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
    return EntitymodelPackage.Literals.LENTITY_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LPackage getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackage(LPackage newPackage, NotificationChain msgs)
  {
    LPackage oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LENTITY_MODEL__PACKAGE, oldPackage, newPackage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(LPackage newPackage)
  {
    if (newPackage != package_)
    {
      NotificationChain msgs = null;
      if (package_ != null)
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LENTITY_MODEL__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LENTITY_MODEL__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LENTITY_MODEL__PACKAGE, newPackage, newPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LImport> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<LImport>(LImport.class, this, EntitymodelPackage.LENTITY_MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LGenSettings getGenSettings()
  {
    return genSettings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenSettings(LGenSettings newGenSettings, NotificationChain msgs)
  {
    LGenSettings oldGenSettings = genSettings;
    genSettings = newGenSettings;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LENTITY_MODEL__GEN_SETTINGS, oldGenSettings, newGenSettings);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenSettings(LGenSettings newGenSettings)
  {
    if (newGenSettings != genSettings)
    {
      NotificationChain msgs = null;
      if (genSettings != null)
        msgs = ((InternalEObject)genSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LENTITY_MODEL__GEN_SETTINGS, null, msgs);
      if (newGenSettings != null)
        msgs = ((InternalEObject)newGenSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LENTITY_MODEL__GEN_SETTINGS, null, msgs);
      msgs = basicSetGenSettings(newGenSettings, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LENTITY_MODEL__GEN_SETTINGS, newGenSettings, newGenSettings));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LEntity> getEntity()
  {
    if (entity == null)
    {
      entity = new EObjectContainmentEList<LEntity>(LEntity.class, this, EntitymodelPackage.LENTITY_MODEL__ENTITY);
    }
    return entity;
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
      case EntitymodelPackage.LENTITY_MODEL__PACKAGE:
        return basicSetPackage(null, msgs);
      case EntitymodelPackage.LENTITY_MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case EntitymodelPackage.LENTITY_MODEL__GEN_SETTINGS:
        return basicSetGenSettings(null, msgs);
      case EntitymodelPackage.LENTITY_MODEL__ENTITY:
        return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
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
      case EntitymodelPackage.LENTITY_MODEL__PACKAGE:
        return getPackage();
      case EntitymodelPackage.LENTITY_MODEL__IMPORTS:
        return getImports();
      case EntitymodelPackage.LENTITY_MODEL__GEN_SETTINGS:
        return getGenSettings();
      case EntitymodelPackage.LENTITY_MODEL__ENTITY:
        return getEntity();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EntitymodelPackage.LENTITY_MODEL__PACKAGE:
        setPackage((LPackage)newValue);
        return;
      case EntitymodelPackage.LENTITY_MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends LImport>)newValue);
        return;
      case EntitymodelPackage.LENTITY_MODEL__GEN_SETTINGS:
        setGenSettings((LGenSettings)newValue);
        return;
      case EntitymodelPackage.LENTITY_MODEL__ENTITY:
        getEntity().clear();
        getEntity().addAll((Collection<? extends LEntity>)newValue);
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
      case EntitymodelPackage.LENTITY_MODEL__PACKAGE:
        setPackage((LPackage)null);
        return;
      case EntitymodelPackage.LENTITY_MODEL__IMPORTS:
        getImports().clear();
        return;
      case EntitymodelPackage.LENTITY_MODEL__GEN_SETTINGS:
        setGenSettings((LGenSettings)null);
        return;
      case EntitymodelPackage.LENTITY_MODEL__ENTITY:
        getEntity().clear();
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
      case EntitymodelPackage.LENTITY_MODEL__PACKAGE:
        return package_ != null;
      case EntitymodelPackage.LENTITY_MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case EntitymodelPackage.LENTITY_MODEL__GEN_SETTINGS:
        return genSettings != null;
      case EntitymodelPackage.LENTITY_MODEL__ENTITY:
        return entity != null && !entity.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LEntityModelImpl
