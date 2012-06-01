/**
 */
package org.lunifera.metamodel.organization;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.common.AbstractDescribedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.organization.BusinessRole#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.BusinessRole#getWorkers <em>Workers</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.BusinessRole#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.organization.OrganizationPackage#getBusinessRole()
 * @model
 * @generated
 */
public interface BusinessRole extends AbstractDescribedClass {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.organization.Organization#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see #setOrganization(Organization)
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getBusinessRole_Organization()
	 * @see org.lunifera.metamodel.organization.Organization#getRoles
	 * @model opposite="roles" transient="false"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.organization.BusinessRole#getOrganization <em>Organization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' container reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Workers</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.organization.Worker}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.organization.Worker#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workers</em>' reference list.
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getBusinessRole_Workers()
	 * @see org.lunifera.metamodel.organization.Worker#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<Worker> getWorkers();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.organization.Permission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference list.
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getBusinessRole_Permissions()
	 * @model
	 * @generated
	 */
	EList<Permission> getPermissions();

} // BusinessRole
