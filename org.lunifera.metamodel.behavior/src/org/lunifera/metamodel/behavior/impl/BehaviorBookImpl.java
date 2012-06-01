/**
 */
package org.lunifera.metamodel.behavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.behavior.BehaviorBook;
import org.lunifera.metamodel.behavior.BehaviorPackage;
import org.lunifera.metamodel.behavior.Story;

import org.lunifera.metamodel.common.impl.AbstractDescribedClassImpl;

import org.lunifera.metamodel.software.AbstractSoftwareComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.BehaviorBookImpl#getRelatedSoftwareComponent <em>Related Software Component</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.BehaviorBookImpl#getStories <em>Stories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorBookImpl extends AbstractDescribedClassImpl implements BehaviorBook {
	/**
	 * The cached value of the '{@link #getRelatedSoftwareComponent() <em>Related Software Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedSoftwareComponent()
	 * @generated
	 * @ordered
	 */
	protected AbstractSoftwareComponent relatedSoftwareComponent;

	/**
	 * The cached value of the '{@link #getStories() <em>Stories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStories()
	 * @generated
	 * @ordered
	 */
	protected EList<Story> stories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorBookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.BEHAVIOR_BOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSoftwareComponent getRelatedSoftwareComponent() {
		if (relatedSoftwareComponent != null && relatedSoftwareComponent.eIsProxy()) {
			InternalEObject oldRelatedSoftwareComponent = (InternalEObject)relatedSoftwareComponent;
			relatedSoftwareComponent = (AbstractSoftwareComponent)eResolveProxy(oldRelatedSoftwareComponent);
			if (relatedSoftwareComponent != oldRelatedSoftwareComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.BEHAVIOR_BOOK__RELATED_SOFTWARE_COMPONENT, oldRelatedSoftwareComponent, relatedSoftwareComponent));
			}
		}
		return relatedSoftwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSoftwareComponent basicGetRelatedSoftwareComponent() {
		return relatedSoftwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedSoftwareComponent(AbstractSoftwareComponent newRelatedSoftwareComponent) {
		AbstractSoftwareComponent oldRelatedSoftwareComponent = relatedSoftwareComponent;
		relatedSoftwareComponent = newRelatedSoftwareComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR_BOOK__RELATED_SOFTWARE_COMPONENT, oldRelatedSoftwareComponent, relatedSoftwareComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Story> getStories() {
		if (stories == null) {
			stories = new EObjectContainmentEList<Story>(Story.class, this, BehaviorPackage.BEHAVIOR_BOOK__STORIES);
		}
		return stories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.BEHAVIOR_BOOK__STORIES:
				return ((InternalEList<?>)getStories()).basicRemove(otherEnd, msgs);
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
			case BehaviorPackage.BEHAVIOR_BOOK__RELATED_SOFTWARE_COMPONENT:
				if (resolve) return getRelatedSoftwareComponent();
				return basicGetRelatedSoftwareComponent();
			case BehaviorPackage.BEHAVIOR_BOOK__STORIES:
				return getStories();
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
			case BehaviorPackage.BEHAVIOR_BOOK__RELATED_SOFTWARE_COMPONENT:
				setRelatedSoftwareComponent((AbstractSoftwareComponent)newValue);
				return;
			case BehaviorPackage.BEHAVIOR_BOOK__STORIES:
				getStories().clear();
				getStories().addAll((Collection<? extends Story>)newValue);
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
			case BehaviorPackage.BEHAVIOR_BOOK__RELATED_SOFTWARE_COMPONENT:
				setRelatedSoftwareComponent((AbstractSoftwareComponent)null);
				return;
			case BehaviorPackage.BEHAVIOR_BOOK__STORIES:
				getStories().clear();
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
			case BehaviorPackage.BEHAVIOR_BOOK__RELATED_SOFTWARE_COMPONENT:
				return relatedSoftwareComponent != null;
			case BehaviorPackage.BEHAVIOR_BOOK__STORIES:
				return stories != null && !stories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorBookImpl
