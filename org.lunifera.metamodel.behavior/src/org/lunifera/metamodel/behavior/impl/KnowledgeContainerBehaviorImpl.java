/**
 */
package org.lunifera.metamodel.behavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.behavior.BehaviorBook;
import org.lunifera.metamodel.behavior.BehaviorPackage;
import org.lunifera.metamodel.behavior.EmbedderDefinition;
import org.lunifera.metamodel.behavior.KnowledgeContainerBehavior;
import org.lunifera.metamodel.behavior.StepsLibrary;

import org.lunifera.metamodel.knowledge.impl.AbstractKnowledgeContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge Container Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.KnowledgeContainerBehaviorImpl#getStepsLibraries <em>Steps Libraries</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.KnowledgeContainerBehaviorImpl#getEmbedders <em>Embedders</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.KnowledgeContainerBehaviorImpl#getBehaviorBooks <em>Behavior Books</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KnowledgeContainerBehaviorImpl extends AbstractKnowledgeContainerImpl implements KnowledgeContainerBehavior {
	/**
	 * The cached value of the '{@link #getStepsLibraries() <em>Steps Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepsLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<StepsLibrary> stepsLibraries;

	/**
	 * The cached value of the '{@link #getEmbedders() <em>Embedders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbedders()
	 * @generated
	 * @ordered
	 */
	protected EList<EmbedderDefinition> embedders;

	/**
	 * The cached value of the '{@link #getBehaviorBooks() <em>Behavior Books</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorBooks()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorBook> behaviorBooks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeContainerBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.KNOWLEDGE_CONTAINER_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepsLibrary> getStepsLibraries() {
		if (stepsLibraries == null) {
			stepsLibraries = new EObjectContainmentEList<StepsLibrary>(StepsLibrary.class, this, BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__STEPS_LIBRARIES);
		}
		return stepsLibraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmbedderDefinition> getEmbedders() {
		if (embedders == null) {
			embedders = new EObjectContainmentEList<EmbedderDefinition>(EmbedderDefinition.class, this, BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__EMBEDDERS);
		}
		return embedders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorBook> getBehaviorBooks() {
		if (behaviorBooks == null) {
			behaviorBooks = new EObjectContainmentEList<BehaviorBook>(BehaviorBook.class, this, BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__BEHAVIOR_BOOKS);
		}
		return behaviorBooks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__STEPS_LIBRARIES:
				return ((InternalEList<?>)getStepsLibraries()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__EMBEDDERS:
				return ((InternalEList<?>)getEmbedders()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__BEHAVIOR_BOOKS:
				return ((InternalEList<?>)getBehaviorBooks()).basicRemove(otherEnd, msgs);
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
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__STEPS_LIBRARIES:
				return getStepsLibraries();
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__EMBEDDERS:
				return getEmbedders();
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__BEHAVIOR_BOOKS:
				return getBehaviorBooks();
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
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__STEPS_LIBRARIES:
				getStepsLibraries().clear();
				getStepsLibraries().addAll((Collection<? extends StepsLibrary>)newValue);
				return;
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__EMBEDDERS:
				getEmbedders().clear();
				getEmbedders().addAll((Collection<? extends EmbedderDefinition>)newValue);
				return;
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__BEHAVIOR_BOOKS:
				getBehaviorBooks().clear();
				getBehaviorBooks().addAll((Collection<? extends BehaviorBook>)newValue);
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
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__STEPS_LIBRARIES:
				getStepsLibraries().clear();
				return;
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__EMBEDDERS:
				getEmbedders().clear();
				return;
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__BEHAVIOR_BOOKS:
				getBehaviorBooks().clear();
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
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__STEPS_LIBRARIES:
				return stepsLibraries != null && !stepsLibraries.isEmpty();
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__EMBEDDERS:
				return embedders != null && !embedders.isEmpty();
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR__BEHAVIOR_BOOKS:
				return behaviorBooks != null && !behaviorBooks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KnowledgeContainerBehaviorImpl
