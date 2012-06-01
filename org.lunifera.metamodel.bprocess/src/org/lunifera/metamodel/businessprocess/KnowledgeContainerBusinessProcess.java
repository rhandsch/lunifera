/**
 */
package org.lunifera.metamodel.businessprocess;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge Container Business Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.businessprocess.KnowledgeContainerBusinessProcess#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage#getKnowledgeContainerBusinessProcess()
 * @model
 * @generated
 */
public interface KnowledgeContainerBusinessProcess extends AbstractKnowledgeContainer {
	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage#getKnowledgeContainerBusinessProcess_Processes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessProcessDefinition> getProcesses();

} // KnowledgeContainerBusinessProcess
