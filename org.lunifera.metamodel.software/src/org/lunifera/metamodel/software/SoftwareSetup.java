/**
 */
package org.lunifera.metamodel.software;

import org.lunifera.metamodel.common.AbstractIdentifiedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.software.SoftwareSetup#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.SoftwareSetup#getAccessMode <em>Access Mode</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.SoftwareSetup#getAccessURL <em>Access URL</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.SoftwareSetup#getAccessTimeout <em>Access Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.software.SoftwarePackage#getSoftwareSetup()
 * @model
 * @generated
 */
public interface SoftwareSetup extends AbstractIdentifiedClass {
	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.metamodel.software.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see org.lunifera.metamodel.software.AccessType
	 * @see #setAccessType(AccessType)
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getSoftwareSetup_AccessType()
	 * @model unique="false" required="true"
	 * @generated
	 */
	AccessType getAccessType();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.software.SoftwareSetup#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see org.lunifera.metamodel.software.AccessType
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(AccessType value);

	/**
	 * Returns the value of the '<em><b>Access Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.metamodel.software.AccessMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Mode</em>' attribute.
	 * @see org.lunifera.metamodel.software.AccessMode
	 * @see #setAccessMode(AccessMode)
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getSoftwareSetup_AccessMode()
	 * @model unique="false" required="true"
	 * @generated
	 */
	AccessMode getAccessMode();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.software.SoftwareSetup#getAccessMode <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Mode</em>' attribute.
	 * @see org.lunifera.metamodel.software.AccessMode
	 * @see #getAccessMode()
	 * @generated
	 */
	void setAccessMode(AccessMode value);

	/**
	 * Returns the value of the '<em><b>Access URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access URL</em>' attribute.
	 * @see #setAccessURL(String)
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getSoftwareSetup_AccessURL()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getAccessURL();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.software.SoftwareSetup#getAccessURL <em>Access URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access URL</em>' attribute.
	 * @see #getAccessURL()
	 * @generated
	 */
	void setAccessURL(String value);

	/**
	 * Returns the value of the '<em><b>Access Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Timeout</em>' attribute.
	 * @see #setAccessTimeout(Integer)
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getSoftwareSetup_AccessTimeout()
	 * @model unique="false"
	 * @generated
	 */
	Integer getAccessTimeout();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.software.SoftwareSetup#getAccessTimeout <em>Access Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Timeout</em>' attribute.
	 * @see #getAccessTimeout()
	 * @generated
	 */
	void setAccessTimeout(Integer value);

} // SoftwareSetup
