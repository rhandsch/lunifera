/**
 */
package org.lunifera.model.common.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.lunifera.model.common.*;

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
 * @see org.lunifera.model.common.CommonPackage
 * @generated
 */
public class CommonSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonSwitch() {
		if (modelPackage == null) {
			modelPackage = CommonPackage.eINSTANCE;
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
			case CommonPackage.ABS_IDENTIFIED_CLASS: {
				AbsIdentifiedClass absIdentifiedClass = (AbsIdentifiedClass)theEObject;
				T result = caseAbsIdentifiedClass(absIdentifiedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ABS_NAMED_CLASS: {
				AbsNamedClass absNamedClass = (AbsNamedClass)theEObject;
				T result = caseAbsNamedClass(absNamedClass);
				if (result == null) result = caseAbsIdentifiedClass(absNamedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ABS_DESCRIBED_CLASS: {
				AbsDescribedClass absDescribedClass = (AbsDescribedClass)theEObject;
				T result = caseAbsDescribedClass(absDescribedClass);
				if (result == null) result = caseAbsNamedClass(absDescribedClass);
				if (result == null) result = caseAbsIdentifiedClass(absDescribedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ABS_PROJECT_CONTAINER: {
				AbsProjectContainer absProjectContainer = (AbsProjectContainer)theEObject;
				T result = caseAbsProjectContainer(absProjectContainer);
				if (result == null) result = caseAbsDescribedClass(absProjectContainer);
				if (result == null) result = caseAbsNamedClass(absProjectContainer);
				if (result == null) result = caseAbsIdentifiedClass(absProjectContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER: {
				AbsKnowledgeContainer absKnowledgeContainer = (AbsKnowledgeContainer)theEObject;
				T result = caseAbsKnowledgeContainer(absKnowledgeContainer);
				if (result == null) result = caseAbsDescribedClass(absKnowledgeContainer);
				if (result == null) result = caseAbsNamedClass(absKnowledgeContainer);
				if (result == null) result = caseAbsIdentifiedClass(absKnowledgeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseAbsIdentifiedClass(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.EMAIL: {
				Email email = (Email)theEObject;
				T result = caseEmail(email);
				if (result == null) result = caseAbsIdentifiedClass(email);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.PHONE: {
				Phone phone = (Phone)theEObject;
				T result = casePhone(phone);
				if (result == null) result = caseAbsIdentifiedClass(phone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.PHONE_COMPANY: {
				PhoneCompany phoneCompany = (PhoneCompany)theEObject;
				T result = casePhoneCompany(phoneCompany);
				if (result == null) result = caseAbsNamedClass(phoneCompany);
				if (result == null) result = caseAbsIdentifiedClass(phoneCompany);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.COUNTRY: {
				Country country = (Country)theEObject;
				T result = caseCountry(country);
				if (result == null) result = caseAbsNamedClass(country);
				if (result == null) result = caseAbsIdentifiedClass(country);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.CITY: {
				City city = (City)theEObject;
				T result = caseCity(city);
				if (result == null) result = caseAbsNamedClass(city);
				if (result == null) result = caseAbsIdentifiedClass(city);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseAbsNamedClass(state);
				if (result == null) result = caseAbsIdentifiedClass(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ADDRESS: {
				Address address = (Address)theEObject;
				T result = caseAddress(address);
				if (result == null) result = caseAbsNamedClass(address);
				if (result == null) result = caseAbsIdentifiedClass(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Abs Project Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Project Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsProjectContainer(AbsProjectContainer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmail(Email object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Phone Company</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phone Company</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhoneCompany(PhoneCompany object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountry(Country object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>City</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCity(City object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
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

} //CommonSwitch
