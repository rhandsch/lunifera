/**
 */
package org.lunifera.metamodel.businessprocess.impl;

import org.eclipse.bpmn2.Activity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.businessprocess.ActivityDefinition;
import org.lunifera.metamodel.businessprocess.BusinessprocessPackage;

import org.lunifera.metamodel.common.impl.AbstractDescribedClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.businessprocess.impl.ActivityDefinitionImpl#getBpmnActivity <em>Bpmn Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityDefinitionImpl extends AbstractDescribedClassImpl implements ActivityDefinition {
	/**
	 * The cached value of the '{@link #getBpmnActivity() <em>Bpmn Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpmnActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity bpmnActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessprocessPackage.Literals.ACTIVITY_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getBpmnActivity() {
		if (bpmnActivity != null && bpmnActivity.eIsProxy()) {
			InternalEObject oldBpmnActivity = (InternalEObject)bpmnActivity;
			bpmnActivity = (Activity)eResolveProxy(oldBpmnActivity);
			if (bpmnActivity != oldBpmnActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessprocessPackage.ACTIVITY_DEFINITION__BPMN_ACTIVITY, oldBpmnActivity, bpmnActivity));
			}
		}
		return bpmnActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetBpmnActivity() {
		return bpmnActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpmnActivity(Activity newBpmnActivity) {
		Activity oldBpmnActivity = bpmnActivity;
		bpmnActivity = newBpmnActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessprocessPackage.ACTIVITY_DEFINITION__BPMN_ACTIVITY, oldBpmnActivity, bpmnActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusinessprocessPackage.ACTIVITY_DEFINITION__BPMN_ACTIVITY:
				if (resolve) return getBpmnActivity();
				return basicGetBpmnActivity();
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
			case BusinessprocessPackage.ACTIVITY_DEFINITION__BPMN_ACTIVITY:
				setBpmnActivity((Activity)newValue);
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
			case BusinessprocessPackage.ACTIVITY_DEFINITION__BPMN_ACTIVITY:
				setBpmnActivity((Activity)null);
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
			case BusinessprocessPackage.ACTIVITY_DEFINITION__BPMN_ACTIVITY:
				return bpmnActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityDefinitionImpl
