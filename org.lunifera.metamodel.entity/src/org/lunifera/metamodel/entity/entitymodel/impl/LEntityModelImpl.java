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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage;
import org.lunifera.metamodel.entity.entitymodel.LEntityModel;
import org.lunifera.metamodel.entity.entitymodel.LGenSettings;
import org.lunifera.metamodel.entity.entitymodel.LPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEntity Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.impl.LEntityModelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.impl.LEntityModelImpl#getGenSettings <em>Gen Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LEntityModelImpl extends MinimalEObjectImpl.Container implements LEntityModel {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<LPackage> packages;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEntityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitymodelPackage.Literals.LENTITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPackage> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<LPackage>(LPackage.class, this, EntitymodelPackage.LENTITY_MODEL__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LGenSettings getGenSettings() {
		return genSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenSettings(LGenSettings newGenSettings, NotificationChain msgs) {
		LGenSettings oldGenSettings = genSettings;
		genSettings = newGenSettings;
		if (eNotificationRequired()) {
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
	public void setGenSettings(LGenSettings newGenSettings) {
		if (newGenSettings != genSettings) {
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntitymodelPackage.LENTITY_MODEL__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case EntitymodelPackage.LENTITY_MODEL__GEN_SETTINGS:
				return basicSetGenSettings(null, msgs);
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
			case EntitymodelPackage.LENTITY_MODEL__PACKAGES:
				return getPackages();
			case EntitymodelPackage.LENTITY_MODEL__GEN_SETTINGS:
				return getGenSettings();
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
			case EntitymodelPackage.LENTITY_MODEL__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends LPackage>)newValue);
				return;
			case EntitymodelPackage.LENTITY_MODEL__GEN_SETTINGS:
				setGenSettings((LGenSettings)newValue);
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
			case EntitymodelPackage.LENTITY_MODEL__PACKAGES:
				getPackages().clear();
				return;
			case EntitymodelPackage.LENTITY_MODEL__GEN_SETTINGS:
				setGenSettings((LGenSettings)null);
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
			case EntitymodelPackage.LENTITY_MODEL__PACKAGES:
				return packages != null && !packages.isEmpty();
			case EntitymodelPackage.LENTITY_MODEL__GEN_SETTINGS:
				return genSettings != null;
		}
		return super.eIsSet(featureID);
	}

} //LEntityModelImpl
