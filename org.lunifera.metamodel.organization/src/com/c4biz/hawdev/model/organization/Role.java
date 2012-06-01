/**
 */
package com.c4biz.hawdev.model.organization;

import org.lunifera.model.common.AbsDescribedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the base class for all Hawkdev classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.c4biz.hawdev.model.organization.Role#getOrganization <em>Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends AbsDescribedClass {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.c4biz.hawdev.model.organization.Organization#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see #setOrganization(Organization)
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getRole_Organization()
	 * @see com.c4biz.hawdev.model.organization.Organization#getRoles
	 * @model opposite="roles" transient="false"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link com.c4biz.hawdev.model.organization.Role#getOrganization <em>Organization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' container reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

} // Role
