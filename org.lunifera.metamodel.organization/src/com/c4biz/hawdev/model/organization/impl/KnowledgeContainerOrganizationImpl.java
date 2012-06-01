/**
 */
package com.c4biz.hawdev.model.organization.impl;

import com.c4biz.hawdev.model.organization.KnowledgeContainerOrganization;
import com.c4biz.hawdev.model.organization.Organization;
import com.c4biz.hawdev.model.organization.OrganizationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.model.common.impl.AbsKnowledgeContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge Container Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.c4biz.hawdev.model.organization.impl.KnowledgeContainerOrganizationImpl#getOrganizations <em>Organizations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KnowledgeContainerOrganizationImpl extends AbsKnowledgeContainerImpl implements KnowledgeContainerOrganization {
	/**
	 * The cached value of the '{@link #getOrganizations() <em>Organizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> organizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeContainerOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationPackage.Literals.KNOWLEDGE_CONTAINER_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organization> getOrganizations() {
		if (organizations == null) {
			organizations = new EObjectContainmentEList<Organization>(Organization.class, this, OrganizationPackage.KNOWLEDGE_CONTAINER_ORGANIZATION__ORGANIZATIONS);
		}
		return organizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrganizationPackage.KNOWLEDGE_CONTAINER_ORGANIZATION__ORGANIZATIONS:
				return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
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
			case OrganizationPackage.KNOWLEDGE_CONTAINER_ORGANIZATION__ORGANIZATIONS:
				return getOrganizations();
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
			case OrganizationPackage.KNOWLEDGE_CONTAINER_ORGANIZATION__ORGANIZATIONS:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends Organization>)newValue);
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
			case OrganizationPackage.KNOWLEDGE_CONTAINER_ORGANIZATION__ORGANIZATIONS:
				getOrganizations().clear();
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
			case OrganizationPackage.KNOWLEDGE_CONTAINER_ORGANIZATION__ORGANIZATIONS:
				return organizations != null && !organizations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KnowledgeContainerOrganizationImpl
