/**
 */
package org.lunifera.metamodel.knowledge;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.common.AbstractDescribedClass;
import org.lunifera.metamodel.common.Import;

import org.lunifera.metamodel.organization.Organization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.knowledge.ModelingProject#getWorkspace <em>Workspace</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.ModelingProject#getImports <em>Imports</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.ModelingProject#getJdtURI <em>Jdt URI</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.ModelingProject#getKnowledgeContainers <em>Knowledge Containers</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.ModelingProject#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getModelingProject()
 * @model
 * @generated
 */
public interface ModelingProject extends AbstractDescribedClass {
	/**
	 * Returns the value of the '<em><b>Workspace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workspace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workspace</em>' reference.
	 * @see #setWorkspace(WorkspaceRepository)
	 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getModelingProject_Workspace()
	 * @model required="true"
	 * @generated
	 */
	WorkspaceRepository getWorkspace();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.knowledge.ModelingProject#getWorkspace <em>Workspace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workspace</em>' reference.
	 * @see #getWorkspace()
	 * @generated
	 */
	void setWorkspace(WorkspaceRepository value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.common.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getModelingProject_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Jdt URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdt URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdt URI</em>' attribute.
	 * @see #setJdtURI(String)
	 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getModelingProject_JdtURI()
	 * @model
	 * @generated
	 */
	String getJdtURI();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.knowledge.ModelingProject#getJdtURI <em>Jdt URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdt URI</em>' attribute.
	 * @see #getJdtURI()
	 * @generated
	 */
	void setJdtURI(String value);

	/**
	 * Returns the value of the '<em><b>Knowledge Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getProjectContainer <em>Project Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowledge Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Containers</em>' containment reference list.
	 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getModelingProject_KnowledgeContainers()
	 * @see org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getProjectContainer
	 * @model opposite="projectContainer" containment="true"
	 * @generated
	 */
	EList<AbstractKnowledgeContainer> getKnowledgeContainers();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Organization)
	 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getModelingProject_Owner()
	 * @model
	 * @generated
	 */
	Organization getOwner();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.knowledge.ModelingProject#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Organization value);

} // ModelingProject
