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
import org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot;
import org.lunifera.metamodel.dsl.jpa.jpa.booleanType;
import org.lunifera.metamodel.dsl.jpa.jpa.classSuffix;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One To One Annot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToOneAnnotImpl#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToOneAnnotImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToOneAnnotImpl#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToOneAnnotImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToOneAnnotImpl#getOrphanRemoval <em>Orphan Removal</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToOneAnnotImpl#getFetch <em>Fetch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OneToOneAnnotImpl extends ReferenceAnnotationImpl implements OneToOneAnnot
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
   * The default value of the '{@link #getOrphanRemoval() <em>Orphan Removal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrphanRemoval()
   * @generated
   * @ordered
   */
  protected static final booleanType ORPHAN_REMOVAL_EDEFAULT = booleanType.TRUE;

  /**
   * The cached value of the '{@link #getOrphanRemoval() <em>Orphan Removal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrphanRemoval()
   * @generated
   * @ordered
   */
  protected booleanType orphanRemoval = ORPHAN_REMOVAL_EDEFAULT;

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
  protected OneToOneAnnotImpl()
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
    return JpaPackage.Literals.ONE_TO_ONE_ANNOT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_ONE_ANNOT__TARGET_ENTITY, oldTargetEntity, newTargetEntity);
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
        msgs = ((InternalEObject)targetEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpaPackage.ONE_TO_ONE_ANNOT__TARGET_ENTITY, null, msgs);
      if (newTargetEntity != null)
        msgs = ((InternalEObject)newTargetEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpaPackage.ONE_TO_ONE_ANNOT__TARGET_ENTITY, null, msgs);
      msgs = basicSetTargetEntity(newTargetEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_ONE_ANNOT__TARGET_ENTITY, newTargetEntity, newTargetEntity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_ONE_ANNOT__CLASS, oldClass, class_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_ONE_ANNOT__MAPPED_BY, oldMappedBy, mappedBy));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_ONE_ANNOT__CASCADE, oldCascade, cascade));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public booleanType getOrphanRemoval()
  {
    return orphanRemoval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrphanRemoval(booleanType newOrphanRemoval)
  {
    booleanType oldOrphanRemoval = orphanRemoval;
    orphanRemoval = newOrphanRemoval == null ? ORPHAN_REMOVAL_EDEFAULT : newOrphanRemoval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_ONE_ANNOT__ORPHAN_REMOVAL, oldOrphanRemoval, orphanRemoval));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.ONE_TO_ONE_ANNOT__FETCH, oldFetch, fetch));
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
      case JpaPackage.ONE_TO_ONE_ANNOT__TARGET_ENTITY:
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
      case JpaPackage.ONE_TO_ONE_ANNOT__TARGET_ENTITY:
        return getTargetEntity();
      case JpaPackage.ONE_TO_ONE_ANNOT__CLASS:
        return getClass_();
      case JpaPackage.ONE_TO_ONE_ANNOT__MAPPED_BY:
        return getMappedBy();
      case JpaPackage.ONE_TO_ONE_ANNOT__CASCADE:
        return getCascade();
      case JpaPackage.ONE_TO_ONE_ANNOT__ORPHAN_REMOVAL:
        return getOrphanRemoval();
      case JpaPackage.ONE_TO_ONE_ANNOT__FETCH:
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
      case JpaPackage.ONE_TO_ONE_ANNOT__TARGET_ENTITY:
        setTargetEntity((JvmParameterizedTypeReference)newValue);
        return;
      case JpaPackage.ONE_TO_ONE_ANNOT__CLASS:
        setClass((classSuffix)newValue);
        return;
      case JpaPackage.ONE_TO_ONE_ANNOT__MAPPED_BY:
        setMappedBy((String)newValue);
        return;
      case JpaPackage.ONE_TO_ONE_ANNOT__CASCADE:
        setCascade((CascadeType)newValue);
        return;
      case JpaPackage.ONE_TO_ONE_ANNOT__ORPHAN_REMOVAL:
        setOrphanRemoval((booleanType)newValue);
        return;
      case JpaPackage.ONE_TO_ONE_ANNOT__FETCH:
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
      case JpaPackage.ONE_TO_ONE_ANNOT__TARGET_ENTITY:
        setTargetEntity((JvmParameterizedTypeReference)null);
        return;
      case JpaPackage.ONE_TO_ONE_ANNOT__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case JpaPackage.ONE_TO_ONE_ANNOT__MAPPED_BY:
        setMappedBy(MAPPED_BY_EDEFAULT);
        return;
      case JpaPackage.ONE_TO_ONE_ANNOT__CASCADE:
        setCascade(CASCADE_EDEFAULT);
        return;
      case JpaPackage.ONE_TO_ONE_ANNOT__ORPHAN_REMOVAL:
        setOrphanRemoval(ORPHAN_REMOVAL_EDEFAULT);
        return;
      case JpaPackage.ONE_TO_ONE_ANNOT__FETCH:
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
      case JpaPackage.ONE_TO_ONE_ANNOT__TARGET_ENTITY:
        return targetEntity != null;
      case JpaPackage.ONE_TO_ONE_ANNOT__CLASS:
        return class_ != CLASS_EDEFAULT;
      case JpaPackage.ONE_TO_ONE_ANNOT__MAPPED_BY:
        return MAPPED_BY_EDEFAULT == null ? mappedBy != null : !MAPPED_BY_EDEFAULT.equals(mappedBy);
      case JpaPackage.ONE_TO_ONE_ANNOT__CASCADE:
        return cascade != CASCADE_EDEFAULT;
      case JpaPackage.ONE_TO_ONE_ANNOT__ORPHAN_REMOVAL:
        return orphanRemoval != ORPHAN_REMOVAL_EDEFAULT;
      case JpaPackage.ONE_TO_ONE_ANNOT__FETCH:
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
    result.append(" (class: ");
    result.append(class_);
    result.append(", mappedBy: ");
    result.append(mappedBy);
    result.append(", cascade: ");
    result.append(cascade);
    result.append(", orphanRemoval: ");
    result.append(orphanRemoval);
    result.append(", fetch: ");
    result.append(fetch);
    result.append(')');
    return result.toString();
  }

} //OneToOneAnnotImpl
