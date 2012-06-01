/**
 */
package org.lunifera.metamodel.businessprocess.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.lunifera.metamodel.businessprocess.*;

import org.lunifera.metamodel.common.AbstractDescribedClass;
import org.lunifera.metamodel.common.AbstractIdentifiedClass;
import org.lunifera.metamodel.common.AbstractNamedClass;

import org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage
 * @generated
 */
public class BusinessprocessSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BusinessprocessPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessprocessSwitch() {
		if (modelPackage == null) {
			modelPackage = BusinessprocessPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BusinessprocessPackage.KNOWLEDGE_CONTAINER_BUSINESS_PROCESS: {
				KnowledgeContainerBusinessProcess knowledgeContainerBusinessProcess = (KnowledgeContainerBusinessProcess)theEObject;
				T result = caseKnowledgeContainerBusinessProcess(knowledgeContainerBusinessProcess);
				if (result == null) result = caseAbstractKnowledgeContainer(knowledgeContainerBusinessProcess);
				if (result == null) result = caseAbstractDescribedClass(knowledgeContainerBusinessProcess);
				if (result == null) result = caseAbstractNamedClass(knowledgeContainerBusinessProcess);
				if (result == null) result = caseAbstractIdentifiedClass(knowledgeContainerBusinessProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessprocessPackage.ACTIVITY_DEFINITION: {
				ActivityDefinition activityDefinition = (ActivityDefinition)theEObject;
				T result = caseActivityDefinition(activityDefinition);
				if (result == null) result = caseAbstractDescribedClass(activityDefinition);
				if (result == null) result = caseAbstractNamedClass(activityDefinition);
				if (result == null) result = caseAbstractIdentifiedClass(activityDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION: {
				BusinessProcessDefinition businessProcessDefinition = (BusinessProcessDefinition)theEObject;
				T result = caseBusinessProcessDefinition(businessProcessDefinition);
				if (result == null) result = caseAbstractDescribedClass(businessProcessDefinition);
				if (result == null) result = caseAbstractNamedClass(businessProcessDefinition);
				if (result == null) result = caseAbstractIdentifiedClass(businessProcessDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessprocessPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseAbstractDescribedClass(actor);
				if (result == null) result = caseAbstractNamedClass(actor);
				if (result == null) result = caseAbstractIdentifiedClass(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessprocessPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseAbstractDescribedClass(role);
				if (result == null) result = caseAbstractNamedClass(role);
				if (result == null) result = caseAbstractIdentifiedClass(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessprocessPackage.RULES_SERVER: {
				RulesServer rulesServer = (RulesServer)theEObject;
				T result = caseRulesServer(rulesServer);
				if (result == null) result = caseAbstractDescribedClass(rulesServer);
				if (result == null) result = caseAbstractNamedClass(rulesServer);
				if (result == null) result = caseAbstractIdentifiedClass(rulesServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessprocessPackage.HUMAN_TASK_SERVER: {
				HumanTaskServer humanTaskServer = (HumanTaskServer)theEObject;
				T result = caseHumanTaskServer(humanTaskServer);
				if (result == null) result = caseAbstractIdentifiedClass(humanTaskServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge Container Business Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge Container Business Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowledgeContainerBusinessProcess(KnowledgeContainerBusinessProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDefinition(ActivityDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Process Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Process Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessProcessDefinition(BusinessProcessDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rules Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rules Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRulesServer(RulesServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Task Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Task Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanTaskServer(HumanTaskServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Identified Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Identified Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractIdentifiedClass(AbstractIdentifiedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Named Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Named Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNamedClass(AbstractNamedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Described Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Described Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDescribedClass(AbstractDescribedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Knowledge Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Knowledge Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractKnowledgeContainer(AbstractKnowledgeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BusinessprocessSwitch
