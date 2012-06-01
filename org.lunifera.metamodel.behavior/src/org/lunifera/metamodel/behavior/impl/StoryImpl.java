/**
 */
package org.lunifera.metamodel.behavior.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.behavior.BehaviorPackage;
import org.lunifera.metamodel.behavior.KnowledgeContainerBehavior;
import org.lunifera.metamodel.behavior.Meta;
import org.lunifera.metamodel.behavior.Narrative;
import org.lunifera.metamodel.behavior.Scenario;
import org.lunifera.metamodel.behavior.Story;
import org.lunifera.metamodel.behavior.StorySource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Story</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StoryImpl#getBehaviorModel <em>Behavior Model</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StoryImpl#getNarrative <em>Narrative</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StoryImpl#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StoryImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StoryImpl#getImportFrom <em>Import From</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StoryImpl#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoryImpl extends EObjectImpl implements Story {
	/**
	 * The cached value of the '{@link #getBehaviorModel() <em>Behavior Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorModel()
	 * @generated
	 * @ordered
	 */
	protected KnowledgeContainerBehavior behaviorModel;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNarrative() <em>Narrative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNarrative()
	 * @generated
	 * @ordered
	 */
	protected Narrative narrative;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

	/**
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta meta;

	/**
	 * The cached value of the '{@link #getImportFrom() <em>Import From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportFrom()
	 * @generated
	 * @ordered
	 */
	protected StorySource importFrom;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.STORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeContainerBehavior getBehaviorModel() {
		if (behaviorModel != null && behaviorModel.eIsProxy()) {
			InternalEObject oldBehaviorModel = (InternalEObject)behaviorModel;
			behaviorModel = (KnowledgeContainerBehavior)eResolveProxy(oldBehaviorModel);
			if (behaviorModel != oldBehaviorModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.STORY__BEHAVIOR_MODEL, oldBehaviorModel, behaviorModel));
			}
		}
		return behaviorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeContainerBehavior basicGetBehaviorModel() {
		return behaviorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviorModel(KnowledgeContainerBehavior newBehaviorModel) {
		KnowledgeContainerBehavior oldBehaviorModel = behaviorModel;
		behaviorModel = newBehaviorModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.STORY__BEHAVIOR_MODEL, oldBehaviorModel, behaviorModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.STORY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative getNarrative() {
		return narrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarrative(Narrative newNarrative, NotificationChain msgs) {
		Narrative oldNarrative = narrative;
		narrative = newNarrative;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.STORY__NARRATIVE, oldNarrative, newNarrative);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNarrative(Narrative newNarrative) {
		if (newNarrative != narrative) {
			NotificationChain msgs = null;
			if (narrative != null)
				msgs = ((InternalEObject)narrative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.STORY__NARRATIVE, null, msgs);
			if (newNarrative != null)
				msgs = ((InternalEObject)newNarrative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.STORY__NARRATIVE, null, msgs);
			msgs = basicSetNarrative(newNarrative, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.STORY__NARRATIVE, newNarrative, newNarrative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentWithInverseEList<Scenario>(Scenario.class, this, BehaviorPackage.STORY__SCENARIOS, BehaviorPackage.SCENARIO__STORY);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta getMeta() {
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeta(Meta newMeta, NotificationChain msgs) {
		Meta oldMeta = meta;
		meta = newMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.STORY__META, oldMeta, newMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeta(Meta newMeta) {
		if (newMeta != meta) {
			NotificationChain msgs = null;
			if (meta != null)
				msgs = ((InternalEObject)meta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.STORY__META, null, msgs);
			if (newMeta != null)
				msgs = ((InternalEObject)newMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.STORY__META, null, msgs);
			msgs = basicSetMeta(newMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.STORY__META, newMeta, newMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorySource getImportFrom() {
		if (importFrom != null && importFrom.eIsProxy()) {
			InternalEObject oldImportFrom = (InternalEObject)importFrom;
			importFrom = (StorySource)eResolveProxy(oldImportFrom);
			if (importFrom != oldImportFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.STORY__IMPORT_FROM, oldImportFrom, importFrom));
			}
		}
		return importFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorySource basicGetImportFrom() {
		return importFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportFrom(StorySource newImportFrom) {
		StorySource oldImportFrom = importFrom;
		importFrom = newImportFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.STORY__IMPORT_FROM, oldImportFrom, importFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.STORY__CREATION_DATE, oldCreationDate, creationDate));
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
			case BehaviorPackage.STORY__SCENARIOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScenarios()).basicAdd(otherEnd, msgs);
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
			case BehaviorPackage.STORY__NARRATIVE:
				return basicSetNarrative(null, msgs);
			case BehaviorPackage.STORY__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.STORY__META:
				return basicSetMeta(null, msgs);
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
			case BehaviorPackage.STORY__BEHAVIOR_MODEL:
				if (resolve) return getBehaviorModel();
				return basicGetBehaviorModel();
			case BehaviorPackage.STORY__DESCRIPTION:
				return getDescription();
			case BehaviorPackage.STORY__NARRATIVE:
				return getNarrative();
			case BehaviorPackage.STORY__SCENARIOS:
				return getScenarios();
			case BehaviorPackage.STORY__META:
				return getMeta();
			case BehaviorPackage.STORY__IMPORT_FROM:
				if (resolve) return getImportFrom();
				return basicGetImportFrom();
			case BehaviorPackage.STORY__CREATION_DATE:
				return getCreationDate();
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
			case BehaviorPackage.STORY__BEHAVIOR_MODEL:
				setBehaviorModel((KnowledgeContainerBehavior)newValue);
				return;
			case BehaviorPackage.STORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BehaviorPackage.STORY__NARRATIVE:
				setNarrative((Narrative)newValue);
				return;
			case BehaviorPackage.STORY__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends Scenario>)newValue);
				return;
			case BehaviorPackage.STORY__META:
				setMeta((Meta)newValue);
				return;
			case BehaviorPackage.STORY__IMPORT_FROM:
				setImportFrom((StorySource)newValue);
				return;
			case BehaviorPackage.STORY__CREATION_DATE:
				setCreationDate((Date)newValue);
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
			case BehaviorPackage.STORY__BEHAVIOR_MODEL:
				setBehaviorModel((KnowledgeContainerBehavior)null);
				return;
			case BehaviorPackage.STORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BehaviorPackage.STORY__NARRATIVE:
				setNarrative((Narrative)null);
				return;
			case BehaviorPackage.STORY__SCENARIOS:
				getScenarios().clear();
				return;
			case BehaviorPackage.STORY__META:
				setMeta((Meta)null);
				return;
			case BehaviorPackage.STORY__IMPORT_FROM:
				setImportFrom((StorySource)null);
				return;
			case BehaviorPackage.STORY__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
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
			case BehaviorPackage.STORY__BEHAVIOR_MODEL:
				return behaviorModel != null;
			case BehaviorPackage.STORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BehaviorPackage.STORY__NARRATIVE:
				return narrative != null;
			case BehaviorPackage.STORY__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
			case BehaviorPackage.STORY__META:
				return meta != null;
			case BehaviorPackage.STORY__IMPORT_FROM:
				return importFrom != null;
			case BehaviorPackage.STORY__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //StoryImpl
