/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.lunifera.metamodel.dsl.jpa.jpa.CascadeType;
import org.lunifera.metamodel.dsl.jpa.jpa.FetchType;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage;
import org.lunifera.metamodel.dsl.jpa.jpa.ManyToOneAnnot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many To One Annot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToOneAnnotImpl#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToOneAnnotImpl#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToOneAnnotImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToOneAnnotImpl#getFetch <em>Fetch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManyToOneAnnotImpl extends ReferenceAnnotationImpl implements ManyToOneAnnot
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
   * The default value of the '{@link #getMappedBy() <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedBy()
   * @generated
   * @ordered
   */
  protected static final String MAPPED_BY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMappedBy() <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedBy()
   * @generated
   * @ordered
   */
  protected String mappedBy = MAPPED_BY_EDEFAULT;

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
   * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFetch()
   * @generated
   * @ordered
   */
  protected static final FetchType FETCH_EDEFAULT = FetchType.LAZY;

  /**
   * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFetch()
   * @generated
   * @ordered
   */
  protected FetchType fetch = FETCH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ManyToOneAnnotImpl()
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
    return JpaPackage.Literals.MANY_TO_ONE_ANNOT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpaPackage.MANY_TO_ONE_ANNOT__TARGET_ENTITY, oldTargetEntity, newTargetEntity);
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
        msgs = ((InternalEObject)targetEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpaPackage.MANY_TO_ONE_ANNOT__TARGET_ENTITY, null, msgs);
      if (newTargetEntity != null)
        msgs = ((InternalEObject)newTargetEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpaPackage.MANY_TO_ONE_ANNOT__TARGET_ENTITY, null, msgs);
      msgs = basicSetTargetEntity(newTargetEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.MANY_TO_ONE_ANNOT__TARGET_ENTITY, newTargetEntity, newTargetEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMappedBy()
  {
    return mappedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappedBy(String newMappedBy)
  {
    String oldMappedBy = mappedBy;
    mappedBy = newMappedBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.MANY_TO_ONE_ANNOT__MAPPED_BY, oldMappedBy, mappedBy));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.MANY_TO_ONE_ANNOT__CASCADE, oldCascade, cascade));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetchType getFetch()
  {
    return fetch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFetch(FetchType newFetch)
  {
    FetchType oldFetch = fetch;
    fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.MANY_TO_ONE_ANNOT__FETCH, oldFetch, fetch));
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
      case JpaPackage.MANY_TO_ONE_ANNOT__TARGET_ENTITY:
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
      case JpaPackage.MANY_TO_ONE_ANNOT__TARGET_ENTITY:
        return getTargetEntity();
      case JpaPackage.MANY_TO_ONE_ANNOT__MAPPED_BY:
        return getMappedBy();
      case JpaPackage.MANY_TO_ONE_ANNOT__CASCADE:
        return getCascade();
      case JpaPackage.MANY_TO_ONE_ANNOT__FETCH:
        return getFetch();
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
      case JpaPackage.MANY_TO_ONE_ANNOT__TARGET_ENTITY:
        setTargetEntity((JvmParameterizedTypeReference)newValue);
        return;
      case JpaPackage.MANY_TO_ONE_ANNOT__MAPPED_BY:
        setMappedBy((String)newValue);
        return;
      case JpaPackage.MANY_TO_ONE_ANNOT__CASCADE:
        setCascade((CascadeType)newValue);
        return;
      case JpaPackage.MANY_TO_ONE_ANNOT__FETCH:
        setFetch((FetchType)newValue);
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
      case JpaPackage.MANY_TO_ONE_ANNOT__TARGET_ENTITY:
        setTargetEntity((JvmParameterizedTypeReference)null);
        return;
      case JpaPackage.MANY_TO_ONE_ANNOT__MAPPED_BY:
        setMappedBy(MAPPED_BY_EDEFAULT);
        return;
      case JpaPackage.MANY_TO_ONE_ANNOT__CASCADE:
        setCascade(CASCADE_EDEFAULT);
        return;
      case JpaPackage.MANY_TO_ONE_ANNOT__FETCH:
        setFetch(FETCH_EDEFAULT);
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
      case JpaPackage.MANY_TO_ONE_ANNOT__TARGET_ENTITY:
        return targetEntity != null;
      case JpaPackage.MANY_TO_ONE_ANNOT__MAPPED_BY:
        return MAPPED_BY_EDEFAULT == null ? mappedBy != null : !MAPPED_BY_EDEFAULT.equals(mappedBy);
      case JpaPackage.MANY_TO_ONE_ANNOT__CASCADE:
        return cascade != CASCADE_EDEFAULT;
      case JpaPackage.MANY_TO_ONE_ANNOT__FETCH:
        return fetch != FETCH_EDEFAULT;
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
    result.append(" (mappedBy: ");
    result.append(mappedBy);
    result.append(", cascade: ");
    result.append(cascade);
    result.append(", fetch: ");
    result.append(fetch);
    result.append(')');
    return result.toString();
  }

} //ManyToOneAnnotImpl
