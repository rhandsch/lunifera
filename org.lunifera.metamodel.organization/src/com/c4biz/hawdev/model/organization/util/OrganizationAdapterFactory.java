/**
 */
package com.c4biz.hawdev.model.organization.util;

import com.c4biz.hawdev.model.organization.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.model.common.AbsDescribedClass;
import org.lunifera.model.common.AbsIdentifiedClass;
import org.lunifera.model.common.AbsKnowledgeContainer;
import org.lunifera.model.common.AbsNamedClass;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.c4biz.hawdev.model.organization.OrganizationPackage
 * @generated
 */
public class OrganizationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrganizationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OrganizationPackage.eINSTANCE;
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
	protected OrganizationSwitch<Adapter> modelSwitch =
		new OrganizationSwitch<Adapter>() {
			@Override
			public Adapter caseKnowledgeContainerOrganization(KnowledgeContainerOrganization object) {
				return createKnowledgeContainerOrganizationAdapter();
			}
			@Override
			public Adapter caseOrganization(Organization object) {
				return createOrganizationAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseWorker(Worker object) {
				return createWorkerAdapter();
			}
			@Override
			public Adapter caseUnitType(UnitType object) {
				return createUnitTypeAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter casePhone(Phone object) {
				return createPhoneAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.c4biz.hawdev.model.organization.KnowledgeContainerOrganization <em>Knowledge Container Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.c4biz.hawdev.model.organization.KnowledgeContainerOrganization
	 * @generated
	 */
	public Adapter createKnowledgeContainerOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.c4biz.hawdev.model.organization.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.c4biz.hawdev.model.organization.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.c4biz.hawdev.model.organization.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.c4biz.hawdev.model.organization.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.c4biz.hawdev.model.organization.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.c4biz.hawdev.model.organization.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.c4biz.hawdev.model.organization.Worker <em>Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.c4biz.hawdev.model.organization.Worker
	 * @generated
	 */
	public Adapter createWorkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.c4biz.hawdev.model.organization.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.c4biz.hawdev.model.organization.UnitType
	 * @generated
	 */
	public Adapter createUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.c4biz.hawdev.model.organization.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.c4biz.hawdev.model.organization.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.c4biz.hawdev.model.organization.Phone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.c4biz.hawdev.model.organization.Phone
	 * @generated
	 */
	public Adapter createPhoneAdapter() {
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

} //OrganizationAdapterFactory
