/**
 */
package org.lunifera.model.software.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.lunifera.model.common.AbsDescribedClass;
import org.lunifera.model.common.AbsIdentifiedClass;
import org.lunifera.model.common.AbsKnowledgeContainer;
import org.lunifera.model.common.AbsNamedClass;

import org.lunifera.model.software.API;
import org.lunifera.model.software.AbstractSoftwareComponent;
import org.lunifera.model.software.Application;
import org.lunifera.model.software.Bundle;
import org.lunifera.model.software.Composite;
import org.lunifera.model.software.Feature;
import org.lunifera.model.software.KnowledgeContainerSoftware;
import org.lunifera.model.software.License;
import org.lunifera.model.software.Module;
import org.lunifera.model.software.NotificationStrategy;
import org.lunifera.model.software.SoftwarePackage;
import org.lunifera.model.software.SoftwareSetup;
import org.lunifera.model.software.ThirdAPI;
import org.lunifera.model.software.ThirdSystem;

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
 * @see org.lunifera.model.software.SoftwarePackage
 * @generated
 */
public class SoftwareSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SoftwarePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSwitch() {
		if (modelPackage == null) {
			modelPackage = SoftwarePackage.eINSTANCE;
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
			case SoftwarePackage.KNOWLEDGE_CONTAINER_SOFTWARE: {
				KnowledgeContainerSoftware knowledgeContainerSoftware = (KnowledgeContainerSoftware)theEObject;
				T result = caseKnowledgeContainerSoftware(knowledgeContainerSoftware);
				if (result == null) result = caseAbsKnowledgeContainer(knowledgeContainerSoftware);
				if (result == null) result = caseAbsDescribedClass(knowledgeContainerSoftware);
				if (result == null) result = caseAbsNamedClass(knowledgeContainerSoftware);
				if (result == null) result = caseAbsIdentifiedClass(knowledgeContainerSoftware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.ABSTRACT_SOFTWARE_COMPONENT: {
				AbstractSoftwareComponent abstractSoftwareComponent = (AbstractSoftwareComponent)theEObject;
				T result = caseAbstractSoftwareComponent(abstractSoftwareComponent);
				if (result == null) result = caseAbsDescribedClass(abstractSoftwareComponent);
				if (result == null) result = caseAbsNamedClass(abstractSoftwareComponent);
				if (result == null) result = caseAbsIdentifiedClass(abstractSoftwareComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.SYSTEM: {
				org.lunifera.model.software.System system = (org.lunifera.model.software.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseAbstractSoftwareComponent(system);
				if (result == null) result = caseAbsDescribedClass(system);
				if (result == null) result = caseAbsNamedClass(system);
				if (result == null) result = caseAbsIdentifiedClass(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = caseAbstractSoftwareComponent(application);
				if (result == null) result = caseAbsDescribedClass(application);
				if (result == null) result = caseAbsNamedClass(application);
				if (result == null) result = caseAbsIdentifiedClass(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseAbstractSoftwareComponent(composite);
				if (result == null) result = caseAbsDescribedClass(composite);
				if (result == null) result = caseAbsNamedClass(composite);
				if (result == null) result = caseAbsIdentifiedClass(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseAbstractSoftwareComponent(module);
				if (result == null) result = caseAbsDescribedClass(module);
				if (result == null) result = caseAbsNamedClass(module);
				if (result == null) result = caseAbsIdentifiedClass(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseAbstractSoftwareComponent(feature);
				if (result == null) result = caseAbsDescribedClass(feature);
				if (result == null) result = caseAbsNamedClass(feature);
				if (result == null) result = caseAbsIdentifiedClass(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.BUNDLE: {
				Bundle bundle = (Bundle)theEObject;
				T result = caseBundle(bundle);
				if (result == null) result = caseAbstractSoftwareComponent(bundle);
				if (result == null) result = caseAbsDescribedClass(bundle);
				if (result == null) result = caseAbsNamedClass(bundle);
				if (result == null) result = caseAbsIdentifiedClass(bundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.THIRD_SYSTEM: {
				ThirdSystem thirdSystem = (ThirdSystem)theEObject;
				T result = caseThirdSystem(thirdSystem);
				if (result == null) result = caseSystem(thirdSystem);
				if (result == null) result = caseAbstractSoftwareComponent(thirdSystem);
				if (result == null) result = caseAbsDescribedClass(thirdSystem);
				if (result == null) result = caseAbsNamedClass(thirdSystem);
				if (result == null) result = caseAbsIdentifiedClass(thirdSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.API: {
				API api = (API)theEObject;
				T result = caseAPI(api);
				if (result == null) result = caseAbstractSoftwareComponent(api);
				if (result == null) result = caseAbsDescribedClass(api);
				if (result == null) result = caseAbsNamedClass(api);
				if (result == null) result = caseAbsIdentifiedClass(api);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.THIRD_API: {
				ThirdAPI thirdAPI = (ThirdAPI)theEObject;
				T result = caseThirdAPI(thirdAPI);
				if (result == null) result = caseAPI(thirdAPI);
				if (result == null) result = caseAbstractSoftwareComponent(thirdAPI);
				if (result == null) result = caseAbsDescribedClass(thirdAPI);
				if (result == null) result = caseAbsNamedClass(thirdAPI);
				if (result == null) result = caseAbsIdentifiedClass(thirdAPI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.SOFTWARE_SETUP: {
				SoftwareSetup softwareSetup = (SoftwareSetup)theEObject;
				T result = caseSoftwareSetup(softwareSetup);
				if (result == null) result = caseAbsIdentifiedClass(softwareSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.NOTIFICATION_STRATEGY: {
				NotificationStrategy notificationStrategy = (NotificationStrategy)theEObject;
				T result = caseNotificationStrategy(notificationStrategy);
				if (result == null) result = caseAbsIdentifiedClass(notificationStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.LICENSE: {
				License license = (License)theEObject;
				T result = caseLicense(license);
				if (result == null) result = caseAbsIdentifiedClass(license);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge Container Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge Container Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowledgeContainerSoftware(KnowledgeContainerSoftware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Software Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Software Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSoftwareComponent(AbstractSoftwareComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(org.lunifera.model.software.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundle(Bundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Third System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Third System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThirdSystem(ThirdSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPI(API object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Third API</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Third API</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThirdAPI(ThirdAPI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareSetup(SoftwareSetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificationStrategy(NotificationStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>License</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>License</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicense(License object) {
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

} //SoftwareSwitch
