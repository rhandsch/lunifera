/**
 */
package org.lunifera.metamodel.businessprocess.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.businessprocess.BusinessProcessDefinition;
import org.lunifera.metamodel.businessprocess.BusinessprocessPackage;
import org.lunifera.metamodel.businessprocess.KnowledgeContainerBusinessProcess;

import org.lunifera.metamodel.knowledge.impl.AbstractKnowledgeContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge Container Business Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.businessprocess.impl.KnowledgeContainerBusinessProcessImpl#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KnowledgeContainerBusinessProcessImpl extends AbstractKnowledgeContainerImpl implements KnowledgeContainerBusinessProcess {
	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessProcessDefinition> processes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeContainerBusinessProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessprocessPackage.Literals.KNOWLEDGE_CONTAINER_BUSINESS_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessProcessDefinition> getProcesses() {
		if (processes == null) {
			processes = new EObjectContainmentEList<BusinessProcessDefinition>(BusinessProcessDefinition.class, this, BusinessprocessPackage.KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__PROCESSES);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusinessprocessPackage.KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
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
			case BusinessprocessPackage.KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__PROCESSES:
				return getProcesses();
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
			case BusinessprocessPackage.KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends BusinessProcessDefinition>)newValue);
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
			case BusinessprocessPackage.KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__PROCESSES:
				getProcesses().clear();
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
			case BusinessprocessPackage.KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__PROCESSES:
				return processes != null && !processes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KnowledgeContainerBusinessProcessImpl
