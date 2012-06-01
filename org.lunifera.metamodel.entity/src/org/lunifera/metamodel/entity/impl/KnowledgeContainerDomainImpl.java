/**
 */
package org.lunifera.metamodel.entity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.entity.AbstractElement;
import org.lunifera.metamodel.entity.EntityPackage;
import org.lunifera.metamodel.entity.KnowledgeContainerDomain;

import org.lunifera.metamodel.knowledge.impl.AbstractKnowledgeContainerImpl;

import org.lunifera.metamodel.software.AbstractSoftwareComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge Container Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.entity.impl.KnowledgeContainerDomainImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.impl.KnowledgeContainerDomainImpl#getRelatedSoftwares <em>Related Softwares</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KnowledgeContainerDomainImpl extends AbstractKnowledgeContainerImpl implements KnowledgeContainerDomain {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractElement> elements;

	/**
	 * The cached value of the '{@link #getRelatedSoftwares() <em>Related Softwares</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedSoftwares()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractSoftwareComponent> relatedSoftwares;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeContainerDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.KNOWLEDGE_CONTAINER_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<AbstractElement>(AbstractElement.class, this, EntityPackage.KNOWLEDGE_CONTAINER_DOMAIN__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSoftwareComponent> getRelatedSoftwares() {
		if (relatedSoftwares == null) {
			relatedSoftwares = new EObjectResolvingEList<AbstractSoftwareComponent>(AbstractSoftwareComponent.class, this, EntityPackage.KNOWLEDGE_CONTAINER_DOMAIN__RELATED_SOFTWARES);
		}
		return relatedSoftwares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityPackage.KNOWLEDGE_CONTAINER_DOMAIN__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case EntityPackage.KNOWLEDGE_CONTAINER_DOMAIN__ELEMENTS:
				return getElements();
			case EntityPackage.KNOWLEDGE_CONTAINER_DOMAIN__RELATED_SOFTWARES:
				return getRelatedSoftwares();
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
			case EntityPackage.KNOWLEDGE_CONTAINER_DOMAIN__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends AbstractElement>)newValue);
				return;
			case EntityPackage.KNOWLEDGE_CONTAINER_DOMAIN__RELATED_SOFTWARES:
				getRelatedSoftwares().clear();
				getRelatedSoftwares().addAll((Collection<? extends AbstractSoftwareComponent>)newValue);
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
			case EntityPackage.KNOWLEDGE_CONTAINER_DOMAIN__ELEMENTS:
				getElements().clear();
				return;
			case EntityPackage.KNOWLEDGE_CONTAINER_DOMAIN__RELATED_SOFTWARES:
				getRelatedSoftwares().clear();
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
			case EntityPackage.KNOWLEDGE_CONTAINER_DOMAIN__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case EntityPackage.KNOWLEDGE_CONTAINER_DOMAIN__RELATED_SOFTWARES:
				return relatedSoftwares != null && !relatedSoftwares.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KnowledgeContainerDomainImpl
