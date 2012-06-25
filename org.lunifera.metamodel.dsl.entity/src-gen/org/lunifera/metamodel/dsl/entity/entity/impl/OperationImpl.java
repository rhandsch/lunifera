/**
 */
package org.lunifera.metamodel.dsl.entity.entity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmFormalParameter;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

import org.lunifera.metamodel.dsl.entity.entity.EntityPackage;
import org.lunifera.metamodel.dsl.entity.entity.Modifier;
import org.lunifera.metamodel.dsl.entity.entity.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entity.impl.OperationImpl#getOperationAnnotation <em>Operation Annotation</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entity.impl.OperationImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entity.impl.OperationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entity.impl.OperationImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends AbstractFeatureImpl implements Operation
{
  /**
   * The cached value of the '{@link #getOperationAnnotation() <em>Operation Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationAnnotation()
   * @generated
   * @ordered
   */
  protected XAnnotation operationAnnotation;

  /**
   * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected Modifier modifier;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<JvmFormalParameter> params;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected XExpression body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return EntityPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XAnnotation getOperationAnnotation()
  {
    return operationAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperationAnnotation(XAnnotation newOperationAnnotation, NotificationChain msgs)
  {
    XAnnotation oldOperationAnnotation = operationAnnotation;
    operationAnnotation = newOperationAnnotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityPackage.OPERATION__OPERATION_ANNOTATION, oldOperationAnnotation, newOperationAnnotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperationAnnotation(XAnnotation newOperationAnnotation)
  {
    if (newOperationAnnotation != operationAnnotation)
    {
      NotificationChain msgs = null;
      if (operationAnnotation != null)
        msgs = ((InternalEObject)operationAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityPackage.OPERATION__OPERATION_ANNOTATION, null, msgs);
      if (newOperationAnnotation != null)
        msgs = ((InternalEObject)newOperationAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityPackage.OPERATION__OPERATION_ANNOTATION, null, msgs);
      msgs = basicSetOperationAnnotation(newOperationAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.OPERATION__OPERATION_ANNOTATION, newOperationAnnotation, newOperationAnnotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modifier getModifier()
  {
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModifier(Modifier newModifier, NotificationChain msgs)
  {
    Modifier oldModifier = modifier;
    modifier = newModifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityPackage.OPERATION__MODIFIER, oldModifier, newModifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifier(Modifier newModifier)
  {
    if (newModifier != modifier)
    {
      NotificationChain msgs = null;
      if (modifier != null)
        msgs = ((InternalEObject)modifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityPackage.OPERATION__MODIFIER, null, msgs);
      if (newModifier != null)
        msgs = ((InternalEObject)newModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityPackage.OPERATION__MODIFIER, null, msgs);
      msgs = basicSetModifier(newModifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.OPERATION__MODIFIER, newModifier, newModifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JvmFormalParameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<JvmFormalParameter>(JvmFormalParameter.class, this, EntityPackage.OPERATION__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(XExpression newBody, NotificationChain msgs)
  {
    XExpression oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityPackage.OPERATION__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(XExpression newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityPackage.OPERATION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityPackage.OPERATION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.OPERATION__BODY, newBody, newBody));
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
      case EntityPackage.OPERATION__OPERATION_ANNOTATION:
        return basicSetOperationAnnotation(null, msgs);
      case EntityPackage.OPERATION__MODIFIER:
        return basicSetModifier(null, msgs);
      case EntityPackage.OPERATION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case EntityPackage.OPERATION__BODY:
        return basicSetBody(null, msgs);
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
      case EntityPackage.OPERATION__OPERATION_ANNOTATION:
        return getOperationAnnotation();
      case EntityPackage.OPERATION__MODIFIER:
        return getModifier();
      case EntityPackage.OPERATION__PARAMS:
        return getParams();
      case EntityPackage.OPERATION__BODY:
        return getBody();
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
      case EntityPackage.OPERATION__OPERATION_ANNOTATION:
        setOperationAnnotation((XAnnotation)newValue);
        return;
      case EntityPackage.OPERATION__MODIFIER:
        setModifier((Modifier)newValue);
        return;
      case EntityPackage.OPERATION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends JvmFormalParameter>)newValue);
        return;
      case EntityPackage.OPERATION__BODY:
        setBody((XExpression)newValue);
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
      case EntityPackage.OPERATION__OPERATION_ANNOTATION:
        setOperationAnnotation((XAnnotation)null);
        return;
      case EntityPackage.OPERATION__MODIFIER:
        setModifier((Modifier)null);
        return;
      case EntityPackage.OPERATION__PARAMS:
        getParams().clear();
        return;
      case EntityPackage.OPERATION__BODY:
        setBody((XExpression)null);
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
      case EntityPackage.OPERATION__OPERATION_ANNOTATION:
        return operationAnnotation != null;
      case EntityPackage.OPERATION__MODIFIER:
        return modifier != null;
      case EntityPackage.OPERATION__PARAMS:
        return params != null && !params.isEmpty();
      case EntityPackage.OPERATION__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

} //OperationImpl
