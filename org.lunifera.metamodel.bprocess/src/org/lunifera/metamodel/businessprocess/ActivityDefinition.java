/**
 */
package org.lunifera.metamodel.businessprocess;

import org.eclipse.bpmn2.Activity;

import org.lunifera.metamodel.common.AbstractDescribedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.businessprocess.ActivityDefinition#getBpmnActivity <em>Bpmn Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage#getActivityDefinition()
 * @model
 * @generated
 */
public interface ActivityDefinition extends AbstractDescribedClass {
	/**
	 * Returns the value of the '<em><b>Bpmn Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bpmn Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpmn Activity</em>' reference.
	 * @see #setBpmnActivity(Activity)
	 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage#getActivityDefinition_BpmnActivity()
	 * @model
	 * @generated
	 */
	Activity getBpmnActivity();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.businessprocess.ActivityDefinition#getBpmnActivity <em>Bpmn Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpmn Activity</em>' reference.
	 * @see #getBpmnActivity()
	 * @generated
	 */
	void setBpmnActivity(Activity value);

} // ActivityDefinition
