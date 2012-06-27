/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage;
import org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot;
import org.lunifera.metamodel.dsl.jpa.jpa.ParamCascade;
import org.lunifera.metamodel.dsl.jpa.jpa.ParamFetch;
import org.lunifera.metamodel.dsl.jpa.jpa.ParamMappedBy;
import org.lunifera.metamodel.dsl.jpa.jpa.ParamOrphanRemoval;
import org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One To Many Annot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToManyAnnotImpl#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToManyAnnotImpl#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToManyAnnotImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToManyAnnotImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToManyAnnotImpl#getOrphanRemoval <em>Orphan Removal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OneToManyAnnotImpl extends ReferenceAnnotationImpl implements OneToManyAnnot
{
  /**
   * The cached value of the '{@link #getTargetEntity() <em>Target Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetEntity()
   * @generated
   * @ordered
   */
  protected ParamTargetEntity targetEntity;

  /**
   * The cached value of the '{@link #getMappedBy() <em>Mapped By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedBy()
   * @generated
   * @ordered
   */
  protected ParamMappedBy mappedBy;

  /**
   * The cached value of the '{@link #getCascade() <em>Cascade</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCascade()
   * @generated
   * @ordered
   */
  protected ParamCascade cascade;

  /**
   * The cached value of the '{@link #getFetch() <em>Fetch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFetch()
   * @generated
   * @ordered
   */
  protected ParamFetch fetch;

  /**
   * The cached value of the '{@link #getOrphanRemoval() <em>Orphan Removal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrphanRemoval()
   * @generated
   * @ordered
   */
  protected ParamOrphanRemoval orphanRemoval;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OneToManyAnnotImpl()
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
    return JpaPackage.Literals.ONE_TO_MANY_ANNOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamTargetEntity getTargetEntity()
  {
    return targetEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetEntity(ParamTargetEntity newTargetEntity, NotificationChain msgs)
  {
    ParamTargetEntity oldTargetEntity = targetEntity;
    targetEntity = newTargetEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_MANY_ANNOT__TARGET_ENTITY, oldTargetEntity, newTargetEntity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetEntity(ParamTargetEntity newTargetEntity)
  {
    if (newTargetEntity != targetEntity)
    {
      NotificationChain msgs = null;
      if (targetEntity != null)
        msgs = ((InternalEObject)targetEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpaPackage.ONE_TO_MANY_ANNOT__TARGET_ENTITY, null, msgs);
      if (newTargetEntity != null)
        msgs = ((InternalEObject)newTargetEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpaPackage.ONE_TO_MANY_ANNOT__TARGET_ENTITY, null, msgs);
      msgs = basicSetTargetEntity(newTargetEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_MANY_ANNOT__TARGET_ENTITY, newTargetEntity, newTargetEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamMappedBy getMappedBy()
  {
    return mappedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMappedBy(ParamMappedBy newMappedBy, NotificationChain msgs)
  {
    ParamMappedBy oldMappedBy = mappedBy;
    mappedBy = newMappedBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_MANY_ANNOT__MAPPED_BY, oldMappedBy, newMappedBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappedBy(ParamMappedBy newMappedBy)
  {
    if (newMappedBy != mappedBy)
    {
      NotificationChain msgs = null;
      if (mappedBy != null)
        msgs = ((InternalEObject)mappedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpaPackage.ONE_TO_MANY_ANNOT__MAPPED_BY, null, msgs);
      if (newMappedBy != null)
        msgs = ((InternalEObject)newMappedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpaPackage.ONE_TO_MANY_ANNOT__MAPPED_BY, null, msgs);
      msgs = basicSetMappedBy(newMappedBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_MANY_ANNOT__MAPPED_BY, newMappedBy, newMappedBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamCascade getCascade()
  {
    return cascade;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCascade(ParamCascade newCascade, NotificationChain msgs)
  {
    ParamCascade oldCascade = cascade;
    cascade = newCascade;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_MANY_ANNOT__CASCADE, oldCascade, newCascade);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCascade(ParamCascade newCascade)
  {
    if (newCascade != cascade)
    {
      NotificationChain msgs = null;
      if (cascade != null)
        msgs = ((InternalEObject)cascade).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpaPackage.ONE_TO_MANY_ANNOT__CASCADE, null, msgs);
      if (newCascade != null)
        msgs = ((InternalEObject)newCascade).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpaPackage.ONE_TO_MANY_ANNOT__CASCADE, null, msgs);
      msgs = basicSetCascade(newCascade, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_MANY_ANNOT__CASCADE, newCascade, newCascade));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamFetch getFetch()
  {
    return fetch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFetch(ParamFetch newFetch, NotificationChain msgs)
  {
    ParamFetch oldFetch = fetch;
    fetch = newFetch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_MANY_ANNOT__FETCH, oldFetch, newFetch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFetch(ParamFetch newFetch)
  {
    if (newFetch != fetch)
    {
      NotificationChain msgs = null;
      if (fetch != null)
        msgs = ((InternalEObject)fetch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpaPackage.ONE_TO_MANY_ANNOT__FETCH, null, msgs);
      if (newFetch != null)
        msgs = ((InternalEObject)newFetch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpaPackage.ONE_TO_MANY_ANNOT__FETCH, null, msgs);
      msgs = basicSetFetch(newFetch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_MANY_ANNOT__FETCH, newFetch, newFetch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamOrphanRemoval getOrphanRemoval()
  {
    return orphanRemoval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrphanRemoval(ParamOrphanRemoval newOrphanRemoval, NotificationChain msgs)
  {
    ParamOrphanRemoval oldOrphanRemoval = orphanRemoval;
    orphanRemoval = newOrphanRemoval;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_MANY_ANNOT__ORPHAN_REMOVAL, oldOrphanRemoval, newOrphanRemoval);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrphanRemoval(ParamOrphanRemoval newOrphanRemoval)
  {
    if (newOrphanRemoval != orphanRemoval)
    {
      NotificationChain msgs = null;
      if (orphanRemoval != null)
        msgs = ((InternalEObject)orphanRemoval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpaPackage.ONE_TO_MANY_ANNOT__ORPHAN_REMOVAL, null, msgs);
      if (newOrphanRemoval != null)
        msgs = ((InternalEObject)newOrphanRemoval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpaPackage.ONE_TO_MANY_ANNOT__ORPHAN_REMOVAL, null, msgs);
      msgs = basicSetOrphanRemoval(newOrphanRemoval, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_MANY_ANNOT__ORPHAN_REMOVAL, newOrphanRemoval, newOrphanRemoval));
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
      case JpaPackage.ONE_TO_MANY_ANNOT__TARGET_ENTITY:
        return basicSetTargetEntity(null, msgs);
      case JpaPackage.ONE_TO_MANY_ANNOT__MAPPED_BY:
        return basicSetMappedBy(null, msgs);
      case JpaPackage.ONE_TO_MANY_ANNOT__CASCADE:
        return basicSetCascade(null, msgs);
      case JpaPackage.ONE_TO_MANY_ANNOT__FETCH:
        return basicSetFetch(null, msgs);
      case JpaPackage.ONE_TO_MANY_ANNOT__ORPHAN_REMOVAL:
        return basicSetOrphanRemoval(null, msgs);
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
      case JpaPackage.ONE_TO_MANY_ANNOT__TARGET_ENTITY:
        return getTargetEntity();
      case JpaPackage.ONE_TO_MANY_ANNOT__MAPPED_BY:
        return getMappedBy();
      case JpaPackage.ONE_TO_MANY_ANNOT__CASCADE:
        return getCascade();
      case JpaPackage.ONE_TO_MANY_ANNOT__FETCH:
        return getFetch();
      case JpaPackage.ONE_TO_MANY_ANNOT__ORPHAN_REMOVAL:
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
      case JpaPackage.ONE_TO_MANY_ANNOT__TARGET_ENTITY:
        setTargetEntity((ParamTargetEntity)newValue);
        return;
      case JpaPackage.ONE_TO_MANY_ANNOT__MAPPED_BY:
        setMappedBy((ParamMappedBy)newValue);
        return;
      case JpaPackage.ONE_TO_MANY_ANNOT__CASCADE:
        setCascade((ParamCascade)newValue);
        return;
      case JpaPackage.ONE_TO_MANY_ANNOT__FETCH:
        setFetch((ParamFetch)newValue);
        return;
      case JpaPackage.ONE_TO_MANY_ANNOT__ORPHAN_REMOVAL:
        setOrphanRemoval((ParamOrphanRemoval)newValue);
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
      case JpaPackage.ONE_TO_MANY_ANNOT__TARGET_ENTITY:
        setTargetEntity((ParamTargetEntity)null);
        return;
      case JpaPackage.ONE_TO_MANY_ANNOT__MAPPED_BY:
        setMappedBy((ParamMappedBy)null);
        return;
      case JpaPackage.ONE_TO_MANY_ANNOT__CASCADE:
        setCascade((ParamCascade)null);
        return;
      case JpaPackage.ONE_TO_MANY_ANNOT__FETCH:
        setFetch((ParamFetch)null);
        return;
      case JpaPackage.ONE_TO_MANY_ANNOT__ORPHAN_REMOVAL:
        setOrphanRemoval((ParamOrphanRemoval)null);
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
      case JpaPackage.ONE_TO_MANY_ANNOT__TARGET_ENTITY:
        return targetEntity != null;
      case JpaPackage.ONE_TO_MANY_ANNOT__MAPPED_BY:
        return mappedBy != null;
      case JpaPackage.ONE_TO_MANY_ANNOT__CASCADE:
        return cascade != null;
      case JpaPackage.ONE_TO_MANY_ANNOT__FETCH:
        return fetch != null;
      case JpaPackage.ONE_TO_MANY_ANNOT__ORPHAN_REMOVAL:
        return orphanRemoval != null;
    }
    return super.eIsSet(featureID);
  }

} //OneToManyAnnotImpl
