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
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.behavior.BehaviorPackage;
import org.lunifera.metamodel.behavior.Step;
import org.lunifera.metamodel.behavior.StepParameter;
import org.lunifera.metamodel.behavior.StepSentence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StepImpl#getSentence <em>Sentence</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StepImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StepImpl#getAnds <em>Ands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StepImpl extends EObjectImpl implements Step {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSentence() <em>Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentence()
	 * @generated
	 * @ordered
	 */
	protected StepSentence sentence;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<StepParameter> parameters;

	/**
	 * The cached value of the '{@link #getAnds() <em>Ands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnds()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> ands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepSentence getSentence() {
		return sentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSentence(StepSentence newSentence, NotificationChain msgs) {
		StepSentence oldSentence = sentence;
		sentence = newSentence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.STEP__SENTENCE, oldSentence, newSentence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSentence(StepSentence newSentence) {
		if (newSentence != sentence) {
			NotificationChain msgs = null;
			if (sentence != null)
				msgs = ((InternalEObject)sentence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.STEP__SENTENCE, null, msgs);
			if (newSentence != null)
				msgs = ((InternalEObject)newSentence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.STEP__SENTENCE, null, msgs);
			msgs = basicSetSentence(newSentence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.STEP__SENTENCE, newSentence, newSentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<StepParameter>(StepParameter.class, this, BehaviorPackage.STEP__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getAnds() {
		if (ands == null) {
			ands = new EObjectContainmentEList<Step>(Step.class, this, BehaviorPackage.STEP__ANDS);
		}
		return ands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.STEP__SENTENCE:
				return basicSetSentence(null, msgs);
			case BehaviorPackage.STEP__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.STEP__ANDS:
				return ((InternalEList<?>)getAnds()).basicRemove(otherEnd, msgs);
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
			case BehaviorPackage.STEP__NAME:
				return getName();
			case BehaviorPackage.STEP__SENTENCE:
				return getSentence();
			case BehaviorPackage.STEP__PARAMETERS:
				return getParameters();
			case BehaviorPackage.STEP__ANDS:
				return getAnds();
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
			case BehaviorPackage.STEP__NAME:
				setName((String)newValue);
				return;
			case BehaviorPackage.STEP__SENTENCE:
				setSentence((StepSentence)newValue);
				return;
			case BehaviorPackage.STEP__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends StepParameter>)newValue);
				return;
			case BehaviorPackage.STEP__ANDS:
				getAnds().clear();
				getAnds().addAll((Collection<? extends Step>)newValue);
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
			case BehaviorPackage.STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BehaviorPackage.STEP__SENTENCE:
				setSentence((StepSentence)null);
				return;
			case BehaviorPackage.STEP__PARAMETERS:
				getParameters().clear();
				return;
			case BehaviorPackage.STEP__ANDS:
				getAnds().clear();
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
			case BehaviorPackage.STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BehaviorPackage.STEP__SENTENCE:
				return sentence != null;
			case BehaviorPackage.STEP__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case BehaviorPackage.STEP__ANDS:
				return ands != null && !ands.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StepImpl
