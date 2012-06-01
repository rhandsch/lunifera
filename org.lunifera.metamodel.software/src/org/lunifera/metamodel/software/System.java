/**
 */
package org.lunifera.metamodel.software;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.lunifera.metamodel.software.System#getCode <em>Code</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.System#getNotificationStrategy <em>Notification Strategy</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.System#getModules <em>Modules</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.System#getRelatedSystems <em>Related Systems</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.software.SoftwarePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends AbstractSoftwareComponent {
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
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getSystem_Code()
	 * @model unique="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.software.System#getCode <em>Code</em>}' attribute.
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
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getSystem_NotificationStrategy()
	 * @model containment="true"
	 * @generated
	 */
	NotificationStrategy getNotificationStrategy();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.software.System#getNotificationStrategy <em>Notification Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Strategy</em>' containment reference.
	 * @see #getNotificationStrategy()
	 * @generated
	 */
	void setNotificationStrategy(NotificationStrategy value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.software.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getSystem_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Related Systems</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.software.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Systems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Systems</em>' reference list.
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getSystem_RelatedSystems()
	 * @model
	 * @generated
	 */
	EList<System> getRelatedSystems();

} // System
