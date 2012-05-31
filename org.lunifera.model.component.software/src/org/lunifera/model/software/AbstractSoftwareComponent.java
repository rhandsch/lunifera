/**
 */
package org.lunifera.model.software;

import org.eclipse.emf.common.util.EList;

import org.lunifera.model.common.AbsDescribedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Software Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.model.software.AbstractSoftwareComponent#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.lunifera.model.software.AbstractSoftwareComponent#getStatus <em>Status</em>}</li>
 *   <li>{@link org.lunifera.model.software.AbstractSoftwareComponent#getLicense <em>License</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.model.software.SoftwarePackage#getAbstractSoftwareComponent()
 * @model abstract="true"
 * @generated
 */
public interface AbstractSoftwareComponent extends AbsDescribedClass {
	/**
	 * Returns the value of the '<em><b>Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' attribute list.
	 * @see org.lunifera.model.software.SoftwarePackage#getAbstractSoftwareComponent_Versions()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getVersions();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link org.lunifera.model.software.SoftwareStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.lunifera.model.software.SoftwareStatus
	 * @see #setStatus(SoftwareStatus)
	 * @see org.lunifera.model.software.SoftwarePackage#getAbstractSoftwareComponent_Status()
	 * @model default="0" unique="false"
	 * @generated
	 */
	SoftwareStatus getStatus();

	/**
	 * Sets the value of the '{@link org.lunifera.model.software.AbstractSoftwareComponent#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.lunifera.model.software.SoftwareStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SoftwareStatus value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' reference.
	 * @see #setLicense(License)
	 * @see org.lunifera.model.software.SoftwarePackage#getAbstractSoftwareComponent_License()
	 * @model
	 * @generated
	 */
	License getLicense();

	/**
	 * Sets the value of the '{@link org.lunifera.model.software.AbstractSoftwareComponent#getLicense <em>License</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' reference.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(License value);

} // AbstractSoftwareComponent
