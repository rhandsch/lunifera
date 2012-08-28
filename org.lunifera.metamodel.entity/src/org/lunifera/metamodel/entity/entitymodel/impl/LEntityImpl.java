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

import org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage;
import org.lunifera.metamodel.entity.entitymodel.LAnnotationDef;
import org.lunifera.metamodel.entity.entitymodel.LEntity;
import org.lunifera.metamodel.entity.entitymodel.LEntityMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEntity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.impl.LEntityImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.impl.LEntityImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.impl.LEntityImpl#isCachable <em>Cachable</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.impl.LEntityImpl#isEmbeddable <em>Embeddable</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.impl.LEntityImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.impl.LEntityImpl#getEntityMembers <em>Entity Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LEntityImpl extends LTypeImpl implements LEntity {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<LAnnotationDef> annotations;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCachable() <em>Cachable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCachable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CACHABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCachable() <em>Cachable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCachable()
	 * @generated
	 * @ordered
	 */
	protected boolean cachable = CACHABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEmbeddable() <em>Embeddable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbeddable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBEDDABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmbeddable() <em>Embeddable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbeddable()
	 * @generated
	 * @ordered
	 */
	protected boolean embeddable = EMBEDDABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected LEntity superType;

	/**
	 * The cached value of the '{@link #getEntityMembers() <em>Entity Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<LEntityMember> entityMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitymodelPackage.Literals.LENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LAnnotationDef> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<LAnnotationDef>(LAnnotationDef.class, this, EntitymodelPackage.LENTITY__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LENTITY__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCachable() {
		return cachable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCachable(boolean newCachable) {
		boolean oldCachable = cachable;
		cachable = newCachable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LENTITY__CACHABLE, oldCachable, cachable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmbeddable() {
		return embeddable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddable(boolean newEmbeddable) {
		boolean oldEmbeddable = embeddable;
		embeddable = newEmbeddable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LENTITY__EMBEDDABLE, oldEmbeddable, embeddable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEntity getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (LEntity)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntitymodelPackage.LENTITY__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEntity basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(LEntity newSuperType) {
		LEntity oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LENTITY__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LEntityMember> getEntityMembers() {
		if (entityMembers == null) {
			entityMembers = new EObjectContainmentEList<LEntityMember>(LEntityMember.class, this, EntitymodelPackage.LENTITY__ENTITY_MEMBERS);
		}
		return entityMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntitymodelPackage.LENTITY__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case EntitymodelPackage.LENTITY__ENTITY_MEMBERS:
				return ((InternalEList<?>)getEntityMembers()).basicRemove(otherEnd, msgs);
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
			case EntitymodelPackage.LENTITY__ANNOTATIONS:
				return getAnnotations();
			case EntitymodelPackage.LENTITY__ABSTRACT:
				return isAbstract();
			case EntitymodelPackage.LENTITY__CACHABLE:
				return isCachable();
			case EntitymodelPackage.LENTITY__EMBEDDABLE:
				return isEmbeddable();
			case EntitymodelPackage.LENTITY__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case EntitymodelPackage.LENTITY__ENTITY_MEMBERS:
				return getEntityMembers();
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
			case EntitymodelPackage.LENTITY__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends LAnnotationDef>)newValue);
				return;
			case EntitymodelPackage.LENTITY__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case EntitymodelPackage.LENTITY__CACHABLE:
				setCachable((Boolean)newValue);
				return;
			case EntitymodelPackage.LENTITY__EMBEDDABLE:
				setEmbeddable((Boolean)newValue);
				return;
			case EntitymodelPackage.LENTITY__SUPER_TYPE:
				setSuperType((LEntity)newValue);
				return;
			case EntitymodelPackage.LENTITY__ENTITY_MEMBERS:
				getEntityMembers().clear();
				getEntityMembers().addAll((Collection<? extends LEntityMember>)newValue);
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
			case EntitymodelPackage.LENTITY__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case EntitymodelPackage.LENTITY__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case EntitymodelPackage.LENTITY__CACHABLE:
				setCachable(CACHABLE_EDEFAULT);
				return;
			case EntitymodelPackage.LENTITY__EMBEDDABLE:
				setEmbeddable(EMBEDDABLE_EDEFAULT);
				return;
			case EntitymodelPackage.LENTITY__SUPER_TYPE:
				setSuperType((LEntity)null);
				return;
			case EntitymodelPackage.LENTITY__ENTITY_MEMBERS:
				getEntityMembers().clear();
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
			case EntitymodelPackage.LENTITY__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case EntitymodelPackage.LENTITY__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case EntitymodelPackage.LENTITY__CACHABLE:
				return cachable != CACHABLE_EDEFAULT;
			case EntitymodelPackage.LENTITY__EMBEDDABLE:
				return embeddable != EMBEDDABLE_EDEFAULT;
			case EntitymodelPackage.LENTITY__SUPER_TYPE:
				return superType != null;
			case EntitymodelPackage.LENTITY__ENTITY_MEMBERS:
				return entityMembers != null && !entityMembers.isEmpty();
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", cachable: ");
		result.append(cachable);
		result.append(", embeddable: ");
		result.append(embeddable);
		result.append(')');
		return result.toString();
	}

} //LEntityImpl
