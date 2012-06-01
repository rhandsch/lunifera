/**
 */
package org.lunifera.metamodel.behavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.behavior.BehaviorPackage;
import org.lunifera.metamodel.behavior.GivenStories;
import org.lunifera.metamodel.behavior.StoryPath;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Given Stories</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.GivenStoriesImpl#getStoryPaths <em>Story Paths</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GivenStoriesImpl extends EObjectImpl implements GivenStories {
	/**
	 * The cached value of the '{@link #getStoryPaths() <em>Story Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoryPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<StoryPath> storyPaths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GivenStoriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.GIVEN_STORIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StoryPath> getStoryPaths() {
		if (storyPaths == null) {
			storyPaths = new EObjectContainmentWithInverseEList<StoryPath>(StoryPath.class, this, BehaviorPackage.GIVEN_STORIES__STORY_PATHS, BehaviorPackage.STORY_PATH__GIVEN_STORIES);
		}
		return storyPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.GIVEN_STORIES__STORY_PATHS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStoryPaths()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.GIVEN_STORIES__STORY_PATHS:
				return ((InternalEList<?>)getStoryPaths()).basicRemove(otherEnd, msgs);
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
			case BehaviorPackage.GIVEN_STORIES__STORY_PATHS:
				return getStoryPaths();
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
			case BehaviorPackage.GIVEN_STORIES__STORY_PATHS:
				getStoryPaths().clear();
				getStoryPaths().addAll((Collection<? extends StoryPath>)newValue);
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
			case BehaviorPackage.GIVEN_STORIES__STORY_PATHS:
				getStoryPaths().clear();
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
			case BehaviorPackage.GIVEN_STORIES__STORY_PATHS:
				return storyPaths != null && !storyPaths.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GivenStoriesImpl
