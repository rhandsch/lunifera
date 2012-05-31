/**
 */
package org.lunifera.model.software;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.model.software.System#getParent <em>Parent</em>}</li>
 *   <li>{@link org.lunifera.model.software.System#getCode <em>Code</em>}</li>
 *   <li>{@link org.lunifera.model.software.System#getNotificationStrategy <em>Notification Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.model.software.SoftwarePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends AbstractSoftwareComponent {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(System)
	 * @see org.lunifera.model.software.SoftwarePackage#getSystem_Parent()
	 * @model
	 * @generated
	 */
	System getParent();

	/**
	 * Sets the value of the '{@link org.lunifera.model.software.System#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(System value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.lunifera.model.software.SoftwarePackage#getSystem_Code()
	 * @model unique="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.lunifera.model.software.System#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Notification Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Strategy</em>' containment reference.
	 * @see #setNotificationStrategy(NotificationStrategy)
	 * @see org.lunifera.model.software.SoftwarePackage#getSystem_NotificationStrategy()
	 * @model containment="true"
	 * @generated
	 */
	NotificationStrategy getNotificationStrategy();

	/**
	 * Sets the value of the '{@link org.lunifera.model.software.System#getNotificationStrategy <em>Notification Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Strategy</em>' containment reference.
	 * @see #getNotificationStrategy()
	 * @generated
	 */
	void setNotificationStrategy(NotificationStrategy value);

} // System
