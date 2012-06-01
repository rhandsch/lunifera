/**
 */
package org.lunifera.metamodel.organization;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.common.AbstractDescribedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.organization.Permission#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.Permission#getWorkers <em>Workers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.organization.OrganizationPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends AbstractDescribedClass {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' reference.
	 * @see #setOrganization(Organization)
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getPermission_Organization()
	 * @model
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.organization.Permission#getOrganization <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Workers</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.organization.Worker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workers</em>' reference list.
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getPermission_Workers()
	 * @model
	 * @generated
	 */
	EList<Worker> getWorkers();

} // Permission
