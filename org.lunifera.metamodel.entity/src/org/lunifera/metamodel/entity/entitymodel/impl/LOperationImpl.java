/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Sources generated by Xtext  
 * 
 * Contributors:
 *  		Hans Georg Glöckler - Initial implementation
 *  		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.entity.entitymodel.impl;

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
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage;
import org.lunifera.metamodel.entity.entitymodel.LModifier;
import org.lunifera.metamodel.entity.entitymodel.LOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.impl.LOperationImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.impl.LOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.impl.LOperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.impl.LOperationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.impl.LOperationImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LOperationImpl extends LEntityMemberImpl implements LOperation {
	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected LModifier modifier;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference type;

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
	protected LOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitymodelPackage.Literals.LOPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LModifier getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifier(LModifier newModifier, NotificationChain msgs) {
		LModifier oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LOPERATION__MODIFIER, oldModifier, newModifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(LModifier newModifier) {
		if (newModifier != modifier) {
			NotificationChain msgs = null;
			if (modifier != null)
				msgs = ((InternalEObject)modifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LOPERATION__MODIFIER, null, msgs);
			if (newModifier != null)
				msgs = ((InternalEObject)newModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LOPERATION__MODIFIER, null, msgs);
			msgs = basicSetModifier(newModifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LOPERATION__MODIFIER, newModifier, newModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LOPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(JvmTypeReference newType, NotificationChain msgs) {
		JvmTypeReference oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LOPERATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(JvmTypeReference newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LOPERATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LOPERATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LOPERATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JvmFormalParameter> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<JvmFormalParameter>(JvmFormalParameter.class, this, EntitymodelPackage.LOPERATION__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(XExpression newBody, NotificationChain msgs) {
		XExpression oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LOPERATION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(XExpression newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LOPERATION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LOPERATION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LOPERATION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntitymodelPackage.LOPERATION__MODIFIER:
				return basicSetModifier(null, msgs);
			case EntitymodelPackage.LOPERATION__TYPE:
				return basicSetType(null, msgs);
			case EntitymodelPackage.LOPERATION__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
			case EntitymodelPackage.LOPERATION__BODY:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntitymodelPackage.LOPERATION__MODIFIER:
				return getModifier();
			case EntitymodelPackage.LOPERATION__NAME:
				return getName();
			case EntitymodelPackage.LOPERATION__TYPE:
				return getType();
			case EntitymodelPackage.LOPERATION__PARAMS:
				return getParams();
			case EntitymodelPackage.LOPERATION__BODY:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntitymodelPackage.LOPERATION__MODIFIER:
				setModifier((LModifier)newValue);
				return;
			case EntitymodelPackage.LOPERATION__NAME:
				setName((String)newValue);
				return;
			case EntitymodelPackage.LOPERATION__TYPE:
				setType((JvmTypeReference)newValue);
				return;
			case EntitymodelPackage.LOPERATION__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends JvmFormalParameter>)newValue);
				return;
			case EntitymodelPackage.LOPERATION__BODY:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EntitymodelPackage.LOPERATION__MODIFIER:
				setModifier((LModifier)null);
				return;
			case EntitymodelPackage.LOPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EntitymodelPackage.LOPERATION__TYPE:
				setType((JvmTypeReference)null);
				return;
			case EntitymodelPackage.LOPERATION__PARAMS:
				getParams().clear();
				return;
			case EntitymodelPackage.LOPERATION__BODY:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EntitymodelPackage.LOPERATION__MODIFIER:
				return modifier != null;
			case EntitymodelPackage.LOPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EntitymodelPackage.LOPERATION__TYPE:
				return type != null;
			case EntitymodelPackage.LOPERATION__PARAMS:
				return params != null && !params.isEmpty();
			case EntitymodelPackage.LOPERATION__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LOperationImpl
