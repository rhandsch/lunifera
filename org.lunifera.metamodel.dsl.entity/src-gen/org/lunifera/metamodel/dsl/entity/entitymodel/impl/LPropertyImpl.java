/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage;
import org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LProperty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LPropertyImpl extends LEntityMemberImpl implements LProperty
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference type;

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
   * The default value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValueLiteral()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_VALUE_LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValueLiteral()
   * @generated
   * @ordered
   */
  protected String defaultValueLiteral = DEFAULT_VALUE_LITERAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LPropertyImpl()
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
    return EntitymodelPackage.Literals.LPROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JvmTypeReference newType, NotificationChain msgs)
  {
    JvmTypeReference oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JvmTypeReference newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LPROPERTY__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LPROPERTY__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__TYPE, newType, newType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__MULTIPLICITY, oldMultiplicity, newMultiplicity);
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
        msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LPROPERTY__MULTIPLICITY, null, msgs);
      if (newMultiplicity != null)
        msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LPROPERTY__MULTIPLICITY, null, msgs);
      msgs = basicSetMultiplicity(newMultiplicity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__MULTIPLICITY, newMultiplicity, newMultiplicity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultValueLiteral()
  {
    return defaultValueLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValueLiteral(String newDefaultValueLiteral)
  {
    String oldDefaultValueLiteral = defaultValueLiteral;
    defaultValueLiteral = newDefaultValueLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__DEFAULT_VALUE_LITERAL, oldDefaultValueLiteral, defaultValueLiteral));
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
      case EntitymodelPackage.LPROPERTY__TYPE:
        return basicSetType(null, msgs);
      case EntitymodelPackage.LPROPERTY__MULTIPLICITY:
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
      case EntitymodelPackage.LPROPERTY__TYPE:
        return getType();
      case EntitymodelPackage.LPROPERTY__MULTIPLICITY:
        return getMultiplicity();
      case EntitymodelPackage.LPROPERTY__DEFAULT_VALUE_LITERAL:
        return getDefaultValueLiteral();
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
      case EntitymodelPackage.LPROPERTY__TYPE:
        setType((JvmTypeReference)newValue);
        return;
      case EntitymodelPackage.LPROPERTY__MULTIPLICITY:
        setMultiplicity((LMultiplicity)newValue);
        return;
      case EntitymodelPackage.LPROPERTY__DEFAULT_VALUE_LITERAL:
        setDefaultValueLiteral((String)newValue);
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
      case EntitymodelPackage.LPROPERTY__TYPE:
        setType((JvmTypeReference)null);
        return;
      case EntitymodelPackage.LPROPERTY__MULTIPLICITY:
        setMultiplicity((LMultiplicity)null);
        return;
      case EntitymodelPackage.LPROPERTY__DEFAULT_VALUE_LITERAL:
        setDefaultValueLiteral(DEFAULT_VALUE_LITERAL_EDEFAULT);
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
      case EntitymodelPackage.LPROPERTY__TYPE:
        return type != null;
      case EntitymodelPackage.LPROPERTY__MULTIPLICITY:
        return multiplicity != null;
      case EntitymodelPackage.LPROPERTY__DEFAULT_VALUE_LITERAL:
        return DEFAULT_VALUE_LITERAL_EDEFAULT == null ? defaultValueLiteral != null : !DEFAULT_VALUE_LITERAL_EDEFAULT.equals(defaultValueLiteral);
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
    result.append(" (defaultValueLiteral: ");
    result.append(defaultValueLiteral);
    result.append(')');
    return result.toString();
  }

} //LPropertyImpl
