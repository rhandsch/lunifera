/**
 */
package org.lunifera.metamodel.knowledge.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.metamodel.common.AbstractDescribedClass;
import org.lunifera.metamodel.common.AbstractIdentifiedClass;
import org.lunifera.metamodel.common.AbstractNamedClass;

import org.lunifera.metamodel.knowledge.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.knowledge.KnowledgePackage
 * @generated
 */
public class KnowledgeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KnowledgePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KnowledgePackage.eINSTANCE;
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
	protected KnowledgeSwitch<Adapter> modelSwitch =
		new KnowledgeSwitch<Adapter>() {
			@Override
			public Adapter caseWorkspaceRepository(WorkspaceRepository object) {
				return createWorkspaceRepositoryAdapter();
			}
			@Override
			public Adapter caseModelingProject(ModelingProject object) {
				return createModelingProjectAdapter();
			}
			@Override
			public Adapter caseAbstractKnowledgeContainer(AbstractKnowledgeContainer object) {
				return createAbstractKnowledgeContainerAdapter();
			}
			@Override
			public Adapter caseAbstractIdentifiedClass(AbstractIdentifiedClass object) {
				return createAbstractIdentifiedClassAdapter();
			}
			@Override
			public Adapter caseAbstractNamedClass(AbstractNamedClass object) {
				return createAbstractNamedClassAdapter();
			}
			@Override
			public Adapter caseAbstractDescribedClass(AbstractDescribedClass object) {
				return createAbstractDescribedClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.knowledge.WorkspaceRepository <em>Workspace Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.knowledge.WorkspaceRepository
	 * @generated
	 */
	public Adapter createWorkspaceRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.knowledge.ModelingProject <em>Modeling Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.knowledge.ModelingProject
	 * @generated
	 */
	public Adapter createModelingProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer <em>Abstract Knowledge Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer
	 * @generated
	 */
	public Adapter createAbstractKnowledgeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.common.AbstractIdentifiedClass <em>Abstract Identified Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.common.AbstractIdentifiedClass
	 * @generated
	 */
	public Adapter createAbstractIdentifiedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.common.AbstractNamedClass <em>Abstract Named Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.common.AbstractNamedClass
	 * @generated
	 */
	public Adapter createAbstractNamedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.common.AbstractDescribedClass <em>Abstract Described Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.common.AbstractDescribedClass
	 * @generated
	 */
	public Adapter createAbstractDescribedClassAdapter() {
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

} //KnowledgeAdapterFactory
