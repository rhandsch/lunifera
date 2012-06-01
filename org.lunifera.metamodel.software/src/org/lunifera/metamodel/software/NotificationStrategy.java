/**
 */
package org.lunifera.metamodel.software;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.common.AbstractIdentifiedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.software.NotificationStrategy#getComponentSetup <em>Component Setup</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.NotificationStrategy#getNotificationEvent <em>Notification Event</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.NotificationStrategy#getNotificationType <em>Notification Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.NotificationStrategy#getPeopleToBeNotified <em>People To Be Notified</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.software.SoftwarePackage#getNotificationStrategy()
 * @model
 * @generated
 */
public interface NotificationStrategy extends AbstractIdentifiedClass {
	/**
	 * Returns the value of the '<em><b>Component Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Setup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Setup</em>' containment reference.
	 * @see #setComponentSetup(SoftwareSetup)
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getNotificationStrategy_ComponentSetup()
	 * @model containment="true"
	 * @generated
	 */
	SoftwareSetup getComponentSetup();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.software.NotificationStrategy#getComponentSetup <em>Component Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Setup</em>' containment reference.
	 * @see #getComponentSetup()
	 * @generated
	 */
	void setComponentSetup(SoftwareSetup value);

	/**
	 * Returns the value of the '<em><b>Notification Event</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.metamodel.software.NotificationEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Event</em>' attribute.
	 * @see org.lunifera.metamodel.software.NotificationEvent
	 * @see #setNotificationEvent(NotificationEvent)
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getNotificationStrategy_NotificationEvent()
	 * @model unique="false"
	 * @generated
	 */
	NotificationEvent getNotificationEvent();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.software.NotificationStrategy#getNotificationEvent <em>Notification Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Event</em>' attribute.
	 * @see org.lunifera.metamodel.software.NotificationEvent
	 * @see #getNotificationEvent()
	 * @generated
	 */
	void setNotificationEvent(NotificationEvent value);

	/**
	 * Returns the value of the '<em><b>Notification Type</b></em>' attribute list.
	 * The list contents are of type {@link org.lunifera.metamodel.software.NotificationType}.
	 * The literals are from the enumeration {@link org.lunifera.metamodel.software.NotificationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Type</em>' attribute list.
	 * @see org.lunifera.metamodel.software.NotificationType
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getNotificationStrategy_NotificationType()
	 * @model unique="false"
	 * @generated
	 */
	EList<NotificationType> getNotificationType();

	/**
	 * Returns the value of the '<em><b>People To Be Notified</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>People To Be Notified</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People To Be Notified</em>' attribute list.
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getNotificationStrategy_PeopleToBeNotified()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getPeopleToBeNotified();

} // NotificationStrategy
