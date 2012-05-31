/**
 */
package org.lunifera.model.common;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abs Knowledge Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.model.common.AbsKnowledgeContainer#getLastModification <em>Last Modification</em>}</li>
 *   <li>{@link org.lunifera.model.common.AbsKnowledgeContainer#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.lunifera.model.common.AbsKnowledgeContainer#getProjectContainer <em>Project Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.model.common.CommonPackage#getAbsKnowledgeContainer()
 * @model abstract="true"
 * @generated
 */
public interface AbsKnowledgeContainer extends AbsDescribedClass {
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
	 * @see org.lunifera.model.common.CommonPackage#getAbsKnowledgeContainer_LastModification()
	 * @model unique="false"
	 * @generated
	 */
	Date getLastModification();

	/**
	 * Sets the value of the '{@link org.lunifera.model.common.AbsKnowledgeContainer#getLastModification <em>Last Modification</em>}' attribute.
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
	 * @see org.lunifera.model.common.CommonPackage#getAbsKnowledgeContainer_CreationDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.lunifera.model.common.AbsKnowledgeContainer#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Project Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.model.common.AbsProjectContainer#getKnowledgeContainers <em>Knowledge Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Container</em>' container reference.
	 * @see #setProjectContainer(AbsProjectContainer)
	 * @see org.lunifera.model.common.CommonPackage#getAbsKnowledgeContainer_ProjectContainer()
	 * @see org.lunifera.model.common.AbsProjectContainer#getKnowledgeContainers
	 * @model opposite="knowledgeContainers" required="true" transient="false"
	 * @generated
	 */
	AbsProjectContainer getProjectContainer();

	/**
	 * Sets the value of the '{@link org.lunifera.model.common.AbsKnowledgeContainer#getProjectContainer <em>Project Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Container</em>' container reference.
	 * @see #getProjectContainer()
	 * @generated
	 */
	void setProjectContainer(AbsProjectContainer value);

} // AbsKnowledgeContainer
