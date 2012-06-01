/**
 */
package org.lunifera.metamodel.businessprocess;

import java.util.Date;

import org.lunifera.metamodel.common.AbstractDescribedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Process Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getProcessId <em>Process Id</em>}</li>
 *   <li>{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getDetailDescription <em>Detail Description</em>}</li>
 *   <li>{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getBpmnProcess <em>Bpmn Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage#getBusinessProcessDefinition()
 * @model
 * @generated
 */
public interface BusinessProcessDefinition extends AbstractDescribedClass {
	/**
	 * Returns the value of the '<em><b>Process Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Id</em>' attribute.
	 * @see #setProcessId(String)
	 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage#getBusinessProcessDefinition_ProcessId()
	 * @model unique="false"
	 * @generated
	 */
	String getProcessId();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getProcessId <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Id</em>' attribute.
	 * @see #getProcessId()
	 * @generated
	 */
	void setProcessId(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage#getBusinessProcessDefinition_Summary()
	 * @model unique="false"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Detail Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Description</em>' attribute.
	 * @see #setDetailDescription(String)
	 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage#getBusinessProcessDefinition_DetailDescription()
	 * @model unique="false"
	 * @generated
	 */
	String getDetailDescription();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getDetailDescription <em>Detail Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Description</em>' attribute.
	 * @see #getDetailDescription()
	 * @generated
	 */
	void setDetailDescription(String value);

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
	 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage#getBusinessProcessDefinition_CreationDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Bpmn Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bpmn Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpmn Process</em>' reference.
	 * @see #setBpmnProcess(org.eclipse.bpmn2.Process)
	 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage#getBusinessProcessDefinition_BpmnProcess()
	 * @model
	 * @generated
	 */
	org.eclipse.bpmn2.Process getBpmnProcess();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getBpmnProcess <em>Bpmn Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpmn Process</em>' reference.
	 * @see #getBpmnProcess()
	 * @generated
	 */
	void setBpmnProcess(org.eclipse.bpmn2.Process value);

} // BusinessProcessDefinition
