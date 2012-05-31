/**
 */
package org.lunifera.model.software.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.lunifera.model.common.impl.AbsIdentifiedClassImpl;

import org.lunifera.model.software.NotificationEvent;
import org.lunifera.model.software.NotificationStrategy;
import org.lunifera.model.software.NotificationType;
import org.lunifera.model.software.SoftwarePackage;
import org.lunifera.model.software.SoftwareSetup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.model.software.impl.NotificationStrategyImpl#getComponentSetup <em>Component Setup</em>}</li>
 *   <li>{@link org.lunifera.model.software.impl.NotificationStrategyImpl#getNotificationEvent <em>Notification Event</em>}</li>
 *   <li>{@link org.lunifera.model.software.impl.NotificationStrategyImpl#getNotificationType <em>Notification Type</em>}</li>
 *   <li>{@link org.lunifera.model.software.impl.NotificationStrategyImpl#getPeopleToBeNotified <em>People To Be Notified</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotificationStrategyImpl extends AbsIdentifiedClassImpl implements NotificationStrategy {
	/**
	 * The cached value of the '{@link #getComponentSetup() <em>Component Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSetup()
	 * @generated
	 * @ordered
	 */
	protected SoftwareSetup componentSetup;

	/**
	 * The default value of the '{@link #getNotificationEvent() <em>Notification Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationEvent()
	 * @generated
	 * @ordered
	 */
	protected static final NotificationEvent NOTIFICATION_EVENT_EDEFAULT = NotificationEvent.ON_ERROR;

	/**
	 * The cached value of the '{@link #getNotificationEvent() <em>Notification Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationEvent()
	 * @generated
	 * @ordered
	 */
	protected NotificationEvent notificationEvent = NOTIFICATION_EVENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotificationType() <em>Notification Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationType()
	 * @generated
	 * @ordered
	 */
	protected EList<NotificationType> notificationType;

	/**
	 * The cached value of the '{@link #getPeopleToBeNotified() <em>People To Be Notified</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeopleToBeNotified()
	 * @generated
	 * @ordered
	 */
	protected EList<String> peopleToBeNotified;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.NOTIFICATION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSetup getComponentSetup() {
		return componentSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentSetup(SoftwareSetup newComponentSetup, NotificationChain msgs) {
		SoftwareSetup oldComponentSetup = componentSetup;
		componentSetup = newComponentSetup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwarePackage.NOTIFICATION_STRATEGY__COMPONENT_SETUP, oldComponentSetup, newComponentSetup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentSetup(SoftwareSetup newComponentSetup) {
		if (newComponentSetup != componentSetup) {
			NotificationChain msgs = null;
			if (componentSetup != null)
				msgs = ((InternalEObject)componentSetup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwarePackage.NOTIFICATION_STRATEGY__COMPONENT_SETUP, null, msgs);
			if (newComponentSetup != null)
				msgs = ((InternalEObject)newComponentSetup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwarePackage.NOTIFICATION_STRATEGY__COMPONENT_SETUP, null, msgs);
			msgs = basicSetComponentSetup(newComponentSetup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.NOTIFICATION_STRATEGY__COMPONENT_SETUP, newComponentSetup, newComponentSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationEvent getNotificationEvent() {
		return notificationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationEvent(NotificationEvent newNotificationEvent) {
		NotificationEvent oldNotificationEvent = notificationEvent;
		notificationEvent = newNotificationEvent == null ? NOTIFICATION_EVENT_EDEFAULT : newNotificationEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.NOTIFICATION_STRATEGY__NOTIFICATION_EVENT, oldNotificationEvent, notificationEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotificationType> getNotificationType() {
		if (notificationType == null) {
			notificationType = new EDataTypeEList<NotificationType>(NotificationType.class, this, SoftwarePackage.NOTIFICATION_STRATEGY__NOTIFICATION_TYPE);
		}
		return notificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPeopleToBeNotified() {
		if (peopleToBeNotified == null) {
			peopleToBeNotified = new EDataTypeEList<String>(String.class, this, SoftwarePackage.NOTIFICATION_STRATEGY__PEOPLE_TO_BE_NOTIFIED);
		}
		return peopleToBeNotified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwarePackage.NOTIFICATION_STRATEGY__COMPONENT_SETUP:
				return basicSetComponentSetup(null, msgs);
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
			case SoftwarePackage.NOTIFICATION_STRATEGY__COMPONENT_SETUP:
				return getComponentSetup();
			case SoftwarePackage.NOTIFICATION_STRATEGY__NOTIFICATION_EVENT:
				return getNotificationEvent();
			case SoftwarePackage.NOTIFICATION_STRATEGY__NOTIFICATION_TYPE:
				return getNotificationType();
			case SoftwarePackage.NOTIFICATION_STRATEGY__PEOPLE_TO_BE_NOTIFIED:
				return getPeopleToBeNotified();
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
			case SoftwarePackage.NOTIFICATION_STRATEGY__COMPONENT_SETUP:
				setComponentSetup((SoftwareSetup)newValue);
				return;
			case SoftwarePackage.NOTIFICATION_STRATEGY__NOTIFICATION_EVENT:
				setNotificationEvent((NotificationEvent)newValue);
				return;
			case SoftwarePackage.NOTIFICATION_STRATEGY__NOTIFICATION_TYPE:
				getNotificationType().clear();
				getNotificationType().addAll((Collection<? extends NotificationType>)newValue);
				return;
			case SoftwarePackage.NOTIFICATION_STRATEGY__PEOPLE_TO_BE_NOTIFIED:
				getPeopleToBeNotified().clear();
				getPeopleToBeNotified().addAll((Collection<? extends String>)newValue);
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
			case SoftwarePackage.NOTIFICATION_STRATEGY__COMPONENT_SETUP:
				setComponentSetup((SoftwareSetup)null);
				return;
			case SoftwarePackage.NOTIFICATION_STRATEGY__NOTIFICATION_EVENT:
				setNotificationEvent(NOTIFICATION_EVENT_EDEFAULT);
				return;
			case SoftwarePackage.NOTIFICATION_STRATEGY__NOTIFICATION_TYPE:
				getNotificationType().clear();
				return;
			case SoftwarePackage.NOTIFICATION_STRATEGY__PEOPLE_TO_BE_NOTIFIED:
				getPeopleToBeNotified().clear();
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
			case SoftwarePackage.NOTIFICATION_STRATEGY__COMPONENT_SETUP:
				return componentSetup != null;
			case SoftwarePackage.NOTIFICATION_STRATEGY__NOTIFICATION_EVENT:
				return notificationEvent != NOTIFICATION_EVENT_EDEFAULT;
			case SoftwarePackage.NOTIFICATION_STRATEGY__NOTIFICATION_TYPE:
				return notificationType != null && !notificationType.isEmpty();
			case SoftwarePackage.NOTIFICATION_STRATEGY__PEOPLE_TO_BE_NOTIFIED:
				return peopleToBeNotified != null && !peopleToBeNotified.isEmpty();
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
		result.append(" (notificationEvent: ");
		result.append(notificationEvent);
		result.append(", notificationType: ");
		result.append(notificationType);
		result.append(", peopleToBeNotified: ");
		result.append(peopleToBeNotified);
		result.append(')');
		return result.toString();
	}

} //NotificationStrategyImpl
