/**
 */
package org.lunifera.metamodel.organization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge Container Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.organization.KnowledgeContainerOrganization#getOrganizations <em>Organizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.organization.OrganizationPackage#getKnowledgeContainerOrganization()
 * @model
 * @generated
 */
public interface KnowledgeContainerOrganization extends EObject {
	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.organization.Organization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations</em>' containment reference list.
	 * @see org.lunifera.metamodel.organization.OrganizationPackage#getKnowledgeContainerOrganization_Organizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Organization> getOrganizations();

} // KnowledgeContainerOrganization
