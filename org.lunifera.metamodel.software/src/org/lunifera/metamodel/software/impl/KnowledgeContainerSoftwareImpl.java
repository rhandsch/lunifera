/**
 */
package org.lunifera.metamodel.software.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.knowledge.impl.AbstractKnowledgeContainerImpl;

import org.lunifera.metamodel.software.AbstractSoftwareComponent;
import org.lunifera.metamodel.software.KnowledgeContainerSoftware;
import org.lunifera.metamodel.software.SoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge Container Software</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.software.impl.KnowledgeContainerSoftwareImpl#getSoftwareComponents <em>Software Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KnowledgeContainerSoftwareImpl extends AbstractKnowledgeContainerImpl implements KnowledgeContainerSoftware {
	/**
	 * The cached value of the '{@link #getSoftwareComponents() <em>Software Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractSoftwareComponent> softwareComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeContainerSoftwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.KNOWLEDGE_CONTAINER_SOFTWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSoftwareComponent> getSoftwareComponents() {
		if (softwareComponents == null) {
			softwareComponents = new EObjectContainmentEList<AbstractSoftwareComponent>(AbstractSoftwareComponent.class, this, SoftwarePackage.KNOWLEDGE_CONTAINER_SOFTWARE__SOFTWARE_COMPONENTS);
		}
		return softwareComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwarePackage.KNOWLEDGE_CONTAINER_SOFTWARE__SOFTWARE_COMPONENTS:
				return ((InternalEList<?>)getSoftwareComponents()).basicRemove(otherEnd, msgs);
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
			case SoftwarePackage.KNOWLEDGE_CONTAINER_SOFTWARE__SOFTWARE_COMPONENTS:
				return getSoftwareComponents();
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
			case SoftwarePackage.KNOWLEDGE_CONTAINER_SOFTWARE__SOFTWARE_COMPONENTS:
				getSoftwareComponents().clear();
				getSoftwareComponents().addAll((Collection<? extends AbstractSoftwareComponent>)newValue);
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
			case SoftwarePackage.KNOWLEDGE_CONTAINER_SOFTWARE__SOFTWARE_COMPONENTS:
				getSoftwareComponents().clear();
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
			case SoftwarePackage.KNOWLEDGE_CONTAINER_SOFTWARE__SOFTWARE_COMPONENTS:
				return softwareComponents != null && !softwareComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KnowledgeContainerSoftwareImpl
