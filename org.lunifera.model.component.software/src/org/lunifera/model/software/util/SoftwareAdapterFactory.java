/**
 */
package org.lunifera.model.software.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.model.software.SoftwarePackage
 * @generated
 */
public class SoftwareAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SoftwarePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SoftwarePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareSwitch<Adapter> modelSwitch =
		new SoftwareSwitch<Adapter>() {
			@Override
			public Adapter caseKnowledgeContainerSoftware(KnowledgeContainerSoftware object) {
				return createKnowledgeContainerSoftwareAdapter();
			}
			@Override
			public Adapter caseAbstractSoftwareComponent(AbstractSoftwareComponent object) {
				return createAbstractSoftwareComponentAdapter();
			}
			@Override
			public Adapter caseSystem(org.lunifera.model.software.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseComposite(Composite object) {
				return createCompositeAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseBundle(Bundle object) {
				return createBundleAdapter();
			}
			@Override
			public Adapter caseThirdSystem(ThirdSystem object) {
				return createThirdSystemAdapter();
			}
			@Override
			public Adapter caseAPI(API object) {
				return createAPIAdapter();
			}
			@Override
			public Adapter caseThirdAPI(ThirdAPI object) {
				return createThirdAPIAdapter();
			}
			@Override
			public Adapter caseSoftwareSetup(SoftwareSetup object) {
				return createSoftwareSetupAdapter();
			}
			@Override
			public Adapter caseNotificationStrategy(NotificationStrategy object) {
				return createNotificationStrategyAdapter();
			}
			@Override
			public Adapter caseLicense(License object) {
				return createLicenseAdapter();
			}
			@Override
			public Adapter caseAbsIdentifiedClass(AbsIdentifiedClass object) {
				return createAbsIdentifiedClassAdapter();
			}
			@Override
			public Adapter caseAbsNamedClass(AbsNamedClass object) {
				return createAbsNamedClassAdapter();
			}
			@Override
			public Adapter caseAbsDescribedClass(AbsDescribedClass object) {
				return createAbsDescribedClassAdapter();
			}
			@Override
			public Adapter caseAbsKnowledgeContainer(AbsKnowledgeContainer object) {
				return createAbsKnowledgeContainerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.software.KnowledgeContainerSoftware <em>Knowledge Container Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.software.KnowledgeContainerSoftware
	 * @generated
	 */
	public Adapter createKnowledgeContainerSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.software.AbstractSoftwareComponent <em>Abstract Software Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.software.AbstractSoftwareComponent
	 * @generated
	 */
	public Adapter createAbstractSoftwareComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.software.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.software.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.software.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.software.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.software.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.software.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.software.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.software.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.software.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.software.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.software.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.software.Bundle
	 * @generated
	 */
	public Adapter createBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.software.ThirdSystem <em>Third System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.software.ThirdSystem
	 * @generated
	 */
	public Adapter createThirdSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.software.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.software.API
	 * @generated
	 */
	public Adapter createAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.software.ThirdAPI <em>Third API</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.software.ThirdAPI
	 * @generated
	 */
	public Adapter createThirdAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.software.SoftwareSetup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.software.SoftwareSetup
	 * @generated
	 */
	public Adapter createSoftwareSetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.software.NotificationStrategy <em>Notification Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.software.NotificationStrategy
	 * @generated
	 */
	public Adapter createNotificationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.software.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.software.License
	 * @generated
	 */
	public Adapter createLicenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.common.AbsIdentifiedClass <em>Abs Identified Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.common.AbsIdentifiedClass
	 * @generated
	 */
	public Adapter createAbsIdentifiedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.common.AbsNamedClass <em>Abs Named Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.common.AbsNamedClass
	 * @generated
	 */
	public Adapter createAbsNamedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.common.AbsDescribedClass <em>Abs Described Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.common.AbsDescribedClass
	 * @generated
	 */
	public Adapter createAbsDescribedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.model.common.AbsKnowledgeContainer <em>Abs Knowledge Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.model.common.AbsKnowledgeContainer
	 * @generated
	 */
	public Adapter createAbsKnowledgeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SoftwareAdapterFactory
