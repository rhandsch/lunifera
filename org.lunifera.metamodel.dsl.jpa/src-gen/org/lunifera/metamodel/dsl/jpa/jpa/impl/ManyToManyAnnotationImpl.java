/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage;
import org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many To Many Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToManyAnnotationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToManyAnnotationImpl#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToManyAnnotationImpl#getMappedBy <em>Mapped By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManyToManyAnnotationImpl extends JpaReferenceAnnotationImpl implements ManyToManyAnnotation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ManyToManyAnnotationImpl()
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
    return JpaPackage.Literals.MANY_TO_MANY_ANNOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.MANY_TO_MANY_ANNOTATION__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JpaPackage.MANY_TO_MANY_ANNOTATION__TARGET_ENTITY, oldTargetEntity, newTargetEntity);
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
        msgs = ((InternalEObject)targetEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JpaPackage.MANY_TO_MANY_ANNOTATION__TARGET_ENTITY, null, msgs);
      if (newTargetEntity != null)
        msgs = ((InternalEObject)newTargetEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JpaPackage.MANY_TO_MANY_ANNOTATION__TARGET_ENTITY, null, msgs);
      msgs = basicSetTargetEntity(newTargetEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.MANY_TO_MANY_ANNOTATION__TARGET_ENTITY, newTargetEntity, newTargetEntity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JpaPackage.MANY_TO_MANY_ANNOTATION__MAPPED_BY, oldMappedBy, mappedBy));
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
      case JpaPackage.MANY_TO_MANY_ANNOTATION__TARGET_ENTITY:
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
      case JpaPackage.MANY_TO_MANY_ANNOTATION__NAME:
        return getName();
      case JpaPackage.MANY_TO_MANY_ANNOTATION__TARGET_ENTITY:
        return getTargetEntity();
      case JpaPackage.MANY_TO_MANY_ANNOTATION__MAPPED_BY:
        return getMappedBy();
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
      case JpaPackage.MANY_TO_MANY_ANNOTATION__NAME:
        setName((String)newValue);
        return;
      case JpaPackage.MANY_TO_MANY_ANNOTATION__TARGET_ENTITY:
        setTargetEntity((JvmParameterizedTypeReference)newValue);
        return;
      case JpaPackage.MANY_TO_MANY_ANNOTATION__MAPPED_BY:
        setMappedBy((String)newValue);
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
      case JpaPackage.MANY_TO_MANY_ANNOTATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JpaPackage.MANY_TO_MANY_ANNOTATION__TARGET_ENTITY:
        setTargetEntity((JvmParameterizedTypeReference)null);
        return;
      case JpaPackage.MANY_TO_MANY_ANNOTATION__MAPPED_BY:
        setMappedBy(MAPPED_BY_EDEFAULT);
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
      case JpaPackage.MANY_TO_MANY_ANNOTATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JpaPackage.MANY_TO_MANY_ANNOTATION__TARGET_ENTITY:
        return targetEntity != null;
      case JpaPackage.MANY_TO_MANY_ANNOTATION__MAPPED_BY:
        return MAPPED_BY_EDEFAULT == null ? mappedBy != null : !MAPPED_BY_EDEFAULT.equals(mappedBy);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", mappedBy: ");
    result.append(mappedBy);
    result.append(')');
    return result.toString();
  }

} //ManyToManyAnnotationImpl
