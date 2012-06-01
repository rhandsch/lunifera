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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.behavior.BehaviorPackage;
import org.lunifera.metamodel.behavior.ExamplesTable;
import org.lunifera.metamodel.behavior.GivenStories;
import org.lunifera.metamodel.behavior.Scenario;
import org.lunifera.metamodel.behavior.Step;
import org.lunifera.metamodel.behavior.Story;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.ScenarioImpl#getStory <em>Story</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.ScenarioImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.ScenarioImpl#getGivenStories <em>Given Stories</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.ScenarioImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.ScenarioImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends EObjectImpl implements Scenario {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGivenStories() <em>Given Stories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenStories()
	 * @generated
	 * @ordered
	 */
	protected GivenStories givenStories;

	/**
	 * The cached value of the '{@link #getExamples() <em>Examples</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected ExamplesTable examples;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Story getStory() {
		if (eContainerFeatureID() != BehaviorPackage.SCENARIO__STORY) return null;
		return (Story)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStory(Story newStory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStory, BehaviorPackage.SCENARIO__STORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStory(Story newStory) {
		if (newStory != eInternalContainer() || (eContainerFeatureID() != BehaviorPackage.SCENARIO__STORY && newStory != null)) {
			if (EcoreUtil.isAncestor(this, newStory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStory != null)
				msgs = ((InternalEObject)newStory).eInverseAdd(this, BehaviorPackage.STORY__SCENARIOS, Story.class, msgs);
			msgs = basicSetStory(newStory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCENARIO__STORY, newStory, newStory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCENARIO__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GivenStories getGivenStories() {
		return givenStories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGivenStories(GivenStories newGivenStories, NotificationChain msgs) {
		GivenStories oldGivenStories = givenStories;
		givenStories = newGivenStories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCENARIO__GIVEN_STORIES, oldGivenStories, newGivenStories);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGivenStories(GivenStories newGivenStories) {
		if (newGivenStories != givenStories) {
			NotificationChain msgs = null;
			if (givenStories != null)
				msgs = ((InternalEObject)givenStories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SCENARIO__GIVEN_STORIES, null, msgs);
			if (newGivenStories != null)
				msgs = ((InternalEObject)newGivenStories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SCENARIO__GIVEN_STORIES, null, msgs);
			msgs = basicSetGivenStories(newGivenStories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCENARIO__GIVEN_STORIES, newGivenStories, newGivenStories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamplesTable getExamples() {
		return examples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExamples(ExamplesTable newExamples, NotificationChain msgs) {
		ExamplesTable oldExamples = examples;
		examples = newExamples;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCENARIO__EXAMPLES, oldExamples, newExamples);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExamples(ExamplesTable newExamples) {
		if (newExamples != examples) {
			NotificationChain msgs = null;
			if (examples != null)
				msgs = ((InternalEObject)examples).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SCENARIO__EXAMPLES, null, msgs);
			if (newExamples != null)
				msgs = ((InternalEObject)newExamples).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SCENARIO__EXAMPLES, null, msgs);
			msgs = basicSetExamples(newExamples, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCENARIO__EXAMPLES, newExamples, newExamples));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this, BehaviorPackage.SCENARIO__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.SCENARIO__STORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStory((Story)otherEnd, msgs);
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
			case BehaviorPackage.SCENARIO__STORY:
				return basicSetStory(null, msgs);
			case BehaviorPackage.SCENARIO__GIVEN_STORIES:
				return basicSetGivenStories(null, msgs);
			case BehaviorPackage.SCENARIO__EXAMPLES:
				return basicSetExamples(null, msgs);
			case BehaviorPackage.SCENARIO__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BehaviorPackage.SCENARIO__STORY:
				return eInternalContainer().eInverseRemove(this, BehaviorPackage.STORY__SCENARIOS, Story.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SCENARIO__STORY:
				return getStory();
			case BehaviorPackage.SCENARIO__TITLE:
				return getTitle();
			case BehaviorPackage.SCENARIO__GIVEN_STORIES:
				return getGivenStories();
			case BehaviorPackage.SCENARIO__EXAMPLES:
				return getExamples();
			case BehaviorPackage.SCENARIO__STEPS:
				return getSteps();
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
			case BehaviorPackage.SCENARIO__STORY:
				setStory((Story)newValue);
				return;
			case BehaviorPackage.SCENARIO__TITLE:
				setTitle((String)newValue);
				return;
			case BehaviorPackage.SCENARIO__GIVEN_STORIES:
				setGivenStories((GivenStories)newValue);
				return;
			case BehaviorPackage.SCENARIO__EXAMPLES:
				setExamples((ExamplesTable)newValue);
				return;
			case BehaviorPackage.SCENARIO__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Step>)newValue);
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
			case BehaviorPackage.SCENARIO__STORY:
				setStory((Story)null);
				return;
			case BehaviorPackage.SCENARIO__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case BehaviorPackage.SCENARIO__GIVEN_STORIES:
				setGivenStories((GivenStories)null);
				return;
			case BehaviorPackage.SCENARIO__EXAMPLES:
				setExamples((ExamplesTable)null);
				return;
			case BehaviorPackage.SCENARIO__STEPS:
				getSteps().clear();
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
			case BehaviorPackage.SCENARIO__STORY:
				return getStory() != null;
			case BehaviorPackage.SCENARIO__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case BehaviorPackage.SCENARIO__GIVEN_STORIES:
				return givenStories != null;
			case BehaviorPackage.SCENARIO__EXAMPLES:
				return examples != null;
			case BehaviorPackage.SCENARIO__STEPS:
				return steps != null && !steps.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
