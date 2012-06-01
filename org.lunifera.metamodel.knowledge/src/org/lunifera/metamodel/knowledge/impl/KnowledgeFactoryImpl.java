/**
 */
package org.lunifera.metamodel.knowledge.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.metamodel.knowledge.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnowledgeFactoryImpl extends EFactoryImpl implements KnowledgeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KnowledgeFactory init() {
		try {
			KnowledgeFactory theKnowledgeFactory = (KnowledgeFactory)EPackage.Registry.INSTANCE.getEFactory("http://lunifera.org/metamodel/1.0/Knowledge"); 
			if (theKnowledgeFactory != null) {
				return theKnowledgeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KnowledgeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KnowledgePackage.WORKSPACE_REPOSITORY: return createWorkspaceRepository();
			case KnowledgePackage.MODELING_PROJECT: return createModelingProject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkspaceRepository createWorkspaceRepository() {
		WorkspaceRepositoryImpl workspaceRepository = new WorkspaceRepositoryImpl();
		return workspaceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingProject createModelingProject() {
		ModelingProjectImpl modelingProject = new ModelingProjectImpl();
		return modelingProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgePackage getKnowledgePackage() {
		return (KnowledgePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KnowledgePackage getPackage() {
		return KnowledgePackage.eINSTANCE;
	}

} //KnowledgeFactoryImpl
