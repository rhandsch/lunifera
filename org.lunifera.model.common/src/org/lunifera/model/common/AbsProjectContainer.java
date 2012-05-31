/**
 */
package org.lunifera.model.common;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abs Project Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.model.common.AbsProjectContainer#getImports <em>Imports</em>}</li>
 *   <li>{@link org.lunifera.model.common.AbsProjectContainer#getJdtURI <em>Jdt URI</em>}</li>
 *   <li>{@link org.lunifera.model.common.AbsProjectContainer#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.lunifera.model.common.AbsProjectContainer#getKnowledgeContainers <em>Knowledge Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.model.common.CommonPackage#getAbsProjectContainer()
 * @model abstract="true"
 * @generated
 */
public interface AbsProjectContainer extends AbsDescribedClass {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.model.common.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.lunifera.model.common.CommonPackage#getAbsProjectContainer_Imports()
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
	 * @see org.lunifera.model.common.CommonPackage#getAbsProjectContainer_JdtURI()
	 * @model
	 * @generated
	 */
	String getJdtURI();

	/**
	 * Sets the value of the '{@link org.lunifera.model.common.AbsProjectContainer#getJdtURI <em>Jdt URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdt URI</em>' attribute.
	 * @see #getJdtURI()
	 * @generated
	 */
	void setJdtURI(String value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' attribute.
	 * @see #setCreatedBy(String)
	 * @see org.lunifera.model.common.CommonPackage#getAbsProjectContainer_CreatedBy()
	 * @model unique="false"
	 * @generated
	 */
	String getCreatedBy();

	/**
	 * Sets the value of the '{@link org.lunifera.model.common.AbsProjectContainer#getCreatedBy <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' attribute.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(String value);

	/**
	 * Returns the value of the '<em><b>Knowledge Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.model.common.AbsKnowledgeContainer}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.model.common.AbsKnowledgeContainer#getProjectContainer <em>Project Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowledge Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Containers</em>' containment reference list.
	 * @see org.lunifera.model.common.CommonPackage#getAbsProjectContainer_KnowledgeContainers()
	 * @see org.lunifera.model.common.AbsKnowledgeContainer#getProjectContainer
	 * @model opposite="projectContainer" containment="true"
	 * @generated
	 */
	EList<AbsKnowledgeContainer> getKnowledgeContainers();

} // AbsProjectContainer
