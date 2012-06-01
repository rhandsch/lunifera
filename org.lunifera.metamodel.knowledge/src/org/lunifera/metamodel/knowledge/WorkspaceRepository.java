/**
 */
package org.lunifera.metamodel.knowledge;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.common.AbstractDescribedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.knowledge.WorkspaceRepository#getUri <em>Uri</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.WorkspaceRepository#getLastModification <em>Last Modification</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.WorkspaceRepository#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.WorkspaceRepository#getProjectContainers <em>Project Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getWorkspaceRepository()
 * @model
 * @generated
 */
public interface WorkspaceRepository extends AbstractDescribedClass {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getWorkspaceRepository_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.knowledge.WorkspaceRepository#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Last Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modification</em>' attribute.
	 * @see #setLastModification(Date)
	 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getWorkspaceRepository_LastModification()
	 * @model unique="false"
	 * @generated
	 */
	Date getLastModification();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.knowledge.WorkspaceRepository#getLastModification <em>Last Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modification</em>' attribute.
	 * @see #getLastModification()
	 * @generated
	 */
	void setLastModification(Date value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getWorkspaceRepository_CreationDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.knowledge.WorkspaceRepository#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Project Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.knowledge.ModelingProject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Containers</em>' containment reference list.
	 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getWorkspaceRepository_ProjectContainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelingProject> getProjectContainers();

} // WorkspaceRepository
