/**
 */
package org.lunifera.metamodel.software.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.software.Module;
import org.lunifera.metamodel.software.NotificationStrategy;
import org.lunifera.metamodel.software.SoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.software.impl.SystemImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.impl.SystemImpl#getNotificationStrategy <em>Notification Strategy</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.impl.SystemImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.impl.SystemImpl#getRelatedSystems <em>Related Systems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends AbstractSoftwareComponentImpl implements org.lunifera.metamodel.software.System {
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
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> modules;

	/**
	 * The cached value of the '{@link #getRelatedSystems() <em>Related Systems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<org.lunifera.metamodel.software.System> relatedSystems;

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
	public EList<Module> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<Module>(Module.class, this, SoftwarePackage.SYSTEM__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.lunifera.metamodel.software.System> getRelatedSystems() {
		if (relatedSystems == null) {
			relatedSystems = new EObjectResolvingEList<org.lunifera.metamodel.software.System>(org.lunifera.metamodel.software.System.class, this, SoftwarePackage.SYSTEM__RELATED_SYSTEMS);
		}
		return relatedSystems;
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
			case SoftwarePackage.SYSTEM__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
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
			case SoftwarePackage.SYSTEM__CODE:
				return getCode();
			case SoftwarePackage.SYSTEM__NOTIFICATION_STRATEGY:
				return getNotificationStrategy();
			case SoftwarePackage.SYSTEM__MODULES:
				return getModules();
			case SoftwarePackage.SYSTEM__RELATED_SYSTEMS:
				return getRelatedSystems();
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
			case SoftwarePackage.SYSTEM__CODE:
				setCode((String)newValue);
				return;
			case SoftwarePackage.SYSTEM__NOTIFICATION_STRATEGY:
				setNotificationStrategy((NotificationStrategy)newValue);
				return;
			case SoftwarePackage.SYSTEM__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Module>)newValue);
				return;
			case SoftwarePackage.SYSTEM__RELATED_SYSTEMS:
				getRelatedSystems().clear();
				getRelatedSystems().addAll((Collection<? extends org.lunifera.metamodel.software.System>)newValue);
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
			case SoftwarePackage.SYSTEM__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case SoftwarePackage.SYSTEM__NOTIFICATION_STRATEGY:
				setNotificationStrategy((NotificationStrategy)null);
				return;
			case SoftwarePackage.SYSTEM__MODULES:
				getModules().clear();
				return;
			case SoftwarePackage.SYSTEM__RELATED_SYSTEMS:
				getRelatedSystems().clear();
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
			case SoftwarePackage.SYSTEM__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case SoftwarePackage.SYSTEM__NOTIFICATION_STRATEGY:
				return notificationStrategy != null;
			case SoftwarePackage.SYSTEM__MODULES:
				return modules != null && !modules.isEmpty();
			case SoftwarePackage.SYSTEM__RELATED_SYSTEMS:
				return relatedSystems != null && !relatedSystems.isEmpty();
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
