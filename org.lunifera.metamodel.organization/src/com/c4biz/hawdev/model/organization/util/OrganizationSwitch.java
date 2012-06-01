/**
 */
package com.c4biz.hawdev.model.organization.util;

import com.c4biz.hawdev.model.organization.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.lunifera.model.common.AbsDescribedClass;
import org.lunifera.model.common.AbsIdentifiedClass;
import org.lunifera.model.common.AbsKnowledgeContainer;
import org.lunifera.model.common.AbsNamedClass;

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
 * @see com.c4biz.hawdev.model.organization.OrganizationPackage
 * @generated
 */
public class OrganizationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrganizationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationSwitch() {
		if (modelPackage == null) {
			modelPackage = OrganizationPackage.eINSTANCE;
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
			case OrganizationPackage.KNOWLEDGE_CONTAINER_ORGANIZATION: {
				KnowledgeContainerOrganization knowledgeContainerOrganization = (KnowledgeContainerOrganization)theEObject;
				T result = caseKnowledgeContainerOrganization(knowledgeContainerOrganization);
				if (result == null) result = caseAbsKnowledgeContainer(knowledgeContainerOrganization);
				if (result == null) result = caseAbsDescribedClass(knowledgeContainerOrganization);
				if (result == null) result = caseAbsNamedClass(knowledgeContainerOrganization);
				if (result == null) result = caseAbsIdentifiedClass(knowledgeContainerOrganization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrganizationPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseAbsDescribedClass(organization);
				if (result == null) result = caseAbsNamedClass(organization);
				if (result == null) result = caseAbsIdentifiedClass(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrganizationPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseAbsNamedClass(unit);
				if (result == null) result = caseAbsIdentifiedClass(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrganizationPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseAbsNamedClass(person);
				if (result == null) result = caseAbsIdentifiedClass(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrganizationPackage.WORKER: {
				Worker worker = (Worker)theEObject;
				T result = caseWorker(worker);
				if (result == null) result = caseAbsIdentifiedClass(worker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrganizationPackage.UNIT_TYPE: {
				UnitType unitType = (UnitType)theEObject;
				T result = caseUnitType(unitType);
				if (result == null) result = caseAbsDescribedClass(unitType);
				if (result == null) result = caseAbsNamedClass(unitType);
				if (result == null) result = caseAbsIdentifiedClass(unitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrganizationPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseAbsDescribedClass(role);
				if (result == null) result = caseAbsNamedClass(role);
				if (result == null) result = caseAbsIdentifiedClass(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrganizationPackage.PHONE: {
				Phone phone = (Phone)theEObject;
				T result = casePhone(phone);
				if (result == null) result = caseAbsIdentifiedClass(phone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge Container Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge Container Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowledgeContainerOrganization(KnowledgeContainerOrganization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Worker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorker(Worker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitType(UnitType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Phone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhone(Phone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs Identified Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Identified Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsIdentifiedClass(AbsIdentifiedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs Named Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Named Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsNamedClass(AbsNamedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs Described Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Described Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsDescribedClass(AbsDescribedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs Knowledge Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Knowledge Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsKnowledgeContainer(AbsKnowledgeContainer object) {
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

} //OrganizationSwitch
