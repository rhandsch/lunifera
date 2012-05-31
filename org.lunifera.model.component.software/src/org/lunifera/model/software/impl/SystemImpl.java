/**
 */
package org.lunifera.model.software.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.model.software.NotificationStrategy;
import org.lunifera.model.software.SoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.model.software.impl.SystemImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.lunifera.model.software.impl.SystemImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.lunifera.model.software.impl.SystemImpl#getNotificationStrategy <em>Notification Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends AbstractSoftwareComponentImpl implements org.lunifera.model.software.System {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected org.lunifera.model.software.System parent;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotificationStrategy() <em>Notification Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationStrategy()
	 * @generated
	 * @ordered
	 */
	protected NotificationStrategy notificationStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.lunifera.model.software.System getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (org.lunifera.model.software.System)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwarePackage.SYSTEM__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.lunifera.model.software.System basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(org.lunifera.model.software.System newParent) {
		org.lunifera.model.software.System oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.SYSTEM__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.SYSTEM__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationStrategy getNotificationStrategy() {
		return notificationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotificationStrategy(NotificationStrategy newNotificationStrategy, NotificationChain msgs) {
		NotificationStrategy oldNotificationStrategy = notificationStrategy;
		notificationStrategy = newNotificationStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwarePackage.SYSTEM__NOTIFICATION_STRATEGY, oldNotificationStrategy, newNotificationStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationStrategy(NotificationStrategy newNotificationStrategy) {
		if (newNotificationStrategy != notificationStrategy) {
			NotificationChain msgs = null;
			if (notificationStrategy != null)
				msgs = ((InternalEObject)notificationStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwarePackage.SYSTEM__NOTIFICATION_STRATEGY, null, msgs);
			if (newNotificationStrategy != null)
				msgs = ((InternalEObject)newNotificationStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwarePackage.SYSTEM__NOTIFICATION_STRATEGY, null, msgs);
			msgs = basicSetNotificationStrategy(newNotificationStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.SYSTEM__NOTIFICATION_STRATEGY, newNotificationStrategy, newNotificationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwarePackage.SYSTEM__NOTIFICATION_STRATEGY:
				return basicSetNotificationStrategy(null, msgs);
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
			case SoftwarePackage.SYSTEM__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case SoftwarePackage.SYSTEM__CODE:
				return getCode();
			case SoftwarePackage.SYSTEM__NOTIFICATION_STRATEGY:
				return getNotificationStrategy();
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
			case SoftwarePackage.SYSTEM__PARENT:
				setParent((org.lunifera.model.software.System)newValue);
				return;
			case SoftwarePackage.SYSTEM__CODE:
				setCode((String)newValue);
				return;
			case SoftwarePackage.SYSTEM__NOTIFICATION_STRATEGY:
				setNotificationStrategy((NotificationStrategy)newValue);
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
			case SoftwarePackage.SYSTEM__PARENT:
				setParent((org.lunifera.model.software.System)null);
				return;
			case SoftwarePackage.SYSTEM__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case SoftwarePackage.SYSTEM__NOTIFICATION_STRATEGY:
				setNotificationStrategy((NotificationStrategy)null);
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
			case SoftwarePackage.SYSTEM__PARENT:
				return parent != null;
			case SoftwarePackage.SYSTEM__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case SoftwarePackage.SYSTEM__NOTIFICATION_STRATEGY:
				return notificationStrategy != null;
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
		result.append(" (code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
