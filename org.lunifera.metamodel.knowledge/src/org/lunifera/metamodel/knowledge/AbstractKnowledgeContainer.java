/**
 */
package org.lunifera.metamodel.knowledge;

import java.util.Date;

import org.lunifera.metamodel.common.AbstractDescribedClass;

import org.lunifera.metamodel.organization.Worker;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Knowledge Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getLastModification <em>Last Modification</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getProjectContainer <em>Project Container</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getTechOwner <em>Tech Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getAbstractKnowledgeContainer()
 * @model abstract="true"
 * @generated
 */
public interface AbstractKnowledgeContainer extends AbstractDescribedClass {
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
	 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getAbstractKnowledgeContainer_LastModification()
	 * @model unique="false"
	 * @generated
	 */
	Date getLastModification();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getLastModification <em>Last Modification</em>}' attribute.
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
	 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getAbstractKnowledgeContainer_CreationDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Project Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.knowledge.ModelingProject#getKnowledgeContainers <em>Knowledge Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Container</em>' container reference.
	 * @see #setProjectContainer(ModelingProject)
	 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getAbstractKnowledgeContainer_ProjectContainer()
	 * @see org.lunifera.metamodel.knowledge.ModelingProject#getKnowledgeContainers
	 * @model opposite="knowledgeContainers" required="true" transient="false"
	 * @generated
	 */
	ModelingProject getProjectContainer();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getProjectContainer <em>Project Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Container</em>' container reference.
	 * @see #getProjectContainer()
	 * @generated
	 */
	void setProjectContainer(ModelingProject value);

	/**
	 * Returns the value of the '<em><b>Tech Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tech Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tech Owner</em>' reference.
	 * @see #setTechOwner(Worker)
	 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#getAbstractKnowledgeContainer_TechOwner()
	 * @model
	 * @generated
	 */
	Worker getTechOwner();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getTechOwner <em>Tech Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tech Owner</em>' reference.
	 * @see #getTechOwner()
	 * @generated
	 */
	void setTechOwner(Worker value);

} // AbstractKnowledgeContainer
