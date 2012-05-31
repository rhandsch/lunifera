/**
 */
package com.c4biz.hawdev.model.organization;

import org.eclipse.emf.common.util.EList;

import org.lunifera.model.common.AbsKnowledgeContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge Container Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the base class for all Hawkdev classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.c4biz.hawdev.model.organization.KnowledgeContainerOrganization#getOrganizations <em>Organizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getKnowledgeContainerOrganization()
 * @model
 * @generated
 */
public interface KnowledgeContainerOrganization extends AbsKnowledgeContainer {
	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' containment reference list.
	 * The list contents are of type {@link com.c4biz.hawdev.model.organization.Organization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations</em>' containment reference list.
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getKnowledgeContainerOrganization_Organizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Organization> getOrganizations();

} // KnowledgeContainerOrganization
