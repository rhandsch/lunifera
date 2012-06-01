/**
 */
package org.lunifera.metamodel.behavior.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.behavior.BehaviorPackage;
import org.lunifera.metamodel.behavior.Expectation;
import org.lunifera.metamodel.behavior.Then;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Then</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.ThenImpl#getExpectedOutcome <em>Expected Outcome</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThenImpl extends StepImpl implements Then {
	/**
	 * The cached value of the '{@link #getExpectedOutcome() <em>Expected Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedOutcome()
	 * @generated
	 * @ordered
	 */
	protected Expectation expectedOutcome;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.THEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expectation getExpectedOutcome() {
		if (expectedOutcome != null && expectedOutcome.eIsProxy()) {
			InternalEObject oldExpectedOutcome = (InternalEObject)expectedOutcome;
			expectedOutcome = (Expectation)eResolveProxy(oldExpectedOutcome);
			if (expectedOutcome != oldExpectedOutcome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.THEN__EXPECTED_OUTCOME, oldExpectedOutcome, expectedOutcome));
			}
		}
		return expectedOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expectation basicGetExpectedOutcome() {
		return expectedOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedOutcome(Expectation newExpectedOutcome) {
		Expectation oldExpectedOutcome = expectedOutcome;
		expectedOutcome = newExpectedOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.THEN__EXPECTED_OUTCOME, oldExpectedOutcome, expectedOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.THEN__EXPECTED_OUTCOME:
				if (resolve) return getExpectedOutcome();
				return basicGetExpectedOutcome();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviorPackage.THEN__EXPECTED_OUTCOME:
				setExpectedOutcome((Expectation)newValue);
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
			case BehaviorPackage.THEN__EXPECTED_OUTCOME:
				setExpectedOutcome((Expectation)null);
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
			case BehaviorPackage.THEN__EXPECTED_OUTCOME:
				return expectedOutcome != null;
		}
		return super.eIsSet(featureID);
	}

} //ThenImpl
