/**
 */
package org.lunifera.metamodel.knowledge;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.lunifera.metamodel.common.CommonPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.knowledge.KnowledgeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.lunifera.metamodel' editDirectory='/org.lunifera.metamodel.knowledge.edit/src' editorDirectory='/org.lunifera.metamodel.knowledge.editor/src' resource='XMI' forceOverwrite='true' extensibleProviderFactory='true'"
 * @generated
 */
public interface KnowledgePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "knowledge";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lunifera/metamodel/1.0/Knowledge";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "knowledge";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KnowledgePackage eINSTANCE = org.lunifera.metamodel.knowledge.impl.KnowledgePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.knowledge.impl.WorkspaceRepositoryImpl <em>Workspace Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.knowledge.impl.WorkspaceRepositoryImpl
	 * @see org.lunifera.metamodel.knowledge.impl.KnowledgePackageImpl#getWorkspaceRepository()
	 * @generated
	 */
	int WORKSPACE_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_REPOSITORY__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_REPOSITORY__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_REPOSITORY__URI = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_REPOSITORY__LAST_MODIFICATION = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_REPOSITORY__CREATION_DATE = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Project Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_REPOSITORY__PROJECT_CONTAINERS = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Organization Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_REPOSITORY__ORGANIZATION_MODEL = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Workspace Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_REPOSITORY_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.knowledge.impl.ModelingProjectImpl <em>Modeling Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.knowledge.impl.ModelingProjectImpl
	 * @see org.lunifera.metamodel.knowledge.impl.KnowledgePackageImpl#getModelingProject()
	 * @generated
	 */
	int MODELING_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_PROJECT__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_PROJECT__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Workspace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_PROJECT__WORKSPACE = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_PROJECT__IMPORTS = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jdt URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_PROJECT__JDT_URI = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Knowledge Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_PROJECT__KNOWLEDGE_CONTAINERS = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_PROJECT__OWNER = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Modeling Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_PROJECT_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.knowledge.impl.AbstractKnowledgeContainerImpl <em>Abstract Knowledge Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.knowledge.impl.AbstractKnowledgeContainerImpl
	 * @see org.lunifera.metamodel.knowledge.impl.KnowledgePackageImpl#getAbstractKnowledgeContainer()
	 * @generated
	 */
	int ABSTRACT_KNOWLEDGE_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KNOWLEDGE_CONTAINER__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KNOWLEDGE_CONTAINER__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Last Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KNOWLEDGE_CONTAINER__LAST_MODIFICATION = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KNOWLEDGE_CONTAINER__CREATION_DATE = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Project Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tech Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KNOWLEDGE_CONTAINER__TECH_OWNER = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Knowledge Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KNOWLEDGE_CONTAINER_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.knowledge.WorkspaceRepository <em>Workspace Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace Repository</em>'.
	 * @see org.lunifera.metamodel.knowledge.WorkspaceRepository
	 * @generated
	 */
	EClass getWorkspaceRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.knowledge.WorkspaceRepository#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.lunifera.metamodel.knowledge.WorkspaceRepository#getUri()
	 * @see #getWorkspaceRepository()
	 * @generated
	 */
	EAttribute getWorkspaceRepository_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.knowledge.WorkspaceRepository#getLastModification <em>Last Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modification</em>'.
	 * @see org.lunifera.metamodel.knowledge.WorkspaceRepository#getLastModification()
	 * @see #getWorkspaceRepository()
	 * @generated
	 */
	EAttribute getWorkspaceRepository_LastModification();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.knowledge.WorkspaceRepository#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.lunifera.metamodel.knowledge.WorkspaceRepository#getCreationDate()
	 * @see #getWorkspaceRepository()
	 * @generated
	 */
	EAttribute getWorkspaceRepository_CreationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.knowledge.WorkspaceRepository#getProjectContainers <em>Project Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project Containers</em>'.
	 * @see org.lunifera.metamodel.knowledge.WorkspaceRepository#getProjectContainers()
	 * @see #getWorkspaceRepository()
	 * @generated
	 */
	EReference getWorkspaceRepository_ProjectContainers();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.knowledge.WorkspaceRepository#getOrganizationModel <em>Organization Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Model</em>'.
	 * @see org.lunifera.metamodel.knowledge.WorkspaceRepository#getOrganizationModel()
	 * @see #getWorkspaceRepository()
	 * @generated
	 */
	EReference getWorkspaceRepository_OrganizationModel();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.knowledge.ModelingProject <em>Modeling Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeling Project</em>'.
	 * @see org.lunifera.metamodel.knowledge.ModelingProject
	 * @generated
	 */
	EClass getModelingProject();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.knowledge.ModelingProject#getWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workspace</em>'.
	 * @see org.lunifera.metamodel.knowledge.ModelingProject#getWorkspace()
	 * @see #getModelingProject()
	 * @generated
	 */
	EReference getModelingProject_Workspace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.knowledge.ModelingProject#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.lunifera.metamodel.knowledge.ModelingProject#getImports()
	 * @see #getModelingProject()
	 * @generated
	 */
	EReference getModelingProject_Imports();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.knowledge.ModelingProject#getJdtURI <em>Jdt URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdt URI</em>'.
	 * @see org.lunifera.metamodel.knowledge.ModelingProject#getJdtURI()
	 * @see #getModelingProject()
	 * @generated
	 */
	EAttribute getModelingProject_JdtURI();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.knowledge.ModelingProject#getKnowledgeContainers <em>Knowledge Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Knowledge Containers</em>'.
	 * @see org.lunifera.metamodel.knowledge.ModelingProject#getKnowledgeContainers()
	 * @see #getModelingProject()
	 * @generated
	 */
	EReference getModelingProject_KnowledgeContainers();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.knowledge.ModelingProject#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.lunifera.metamodel.knowledge.ModelingProject#getOwner()
	 * @see #getModelingProject()
	 * @generated
	 */
	EReference getModelingProject_Owner();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer <em>Abstract Knowledge Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Knowledge Container</em>'.
	 * @see org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer
	 * @generated
	 */
	EClass getAbstractKnowledgeContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getLastModification <em>Last Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modification</em>'.
	 * @see org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getLastModification()
	 * @see #getAbstractKnowledgeContainer()
	 * @generated
	 */
	EAttribute getAbstractKnowledgeContainer_LastModification();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getCreationDate()
	 * @see #getAbstractKnowledgeContainer()
	 * @generated
	 */
	EAttribute getAbstractKnowledgeContainer_CreationDate();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getProjectContainer <em>Project Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project Container</em>'.
	 * @see org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getProjectContainer()
	 * @see #getAbstractKnowledgeContainer()
	 * @generated
	 */
	EReference getAbstractKnowledgeContainer_ProjectContainer();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getTechOwner <em>Tech Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tech Owner</em>'.
	 * @see org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer#getTechOwner()
	 * @see #getAbstractKnowledgeContainer()
	 * @generated
	 */
	EReference getAbstractKnowledgeContainer_TechOwner();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KnowledgeFactory getKnowledgeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.knowledge.impl.WorkspaceRepositoryImpl <em>Workspace Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.knowledge.impl.WorkspaceRepositoryImpl
		 * @see org.lunifera.metamodel.knowledge.impl.KnowledgePackageImpl#getWorkspaceRepository()
		 * @generated
		 */
		EClass WORKSPACE_REPOSITORY = eINSTANCE.getWorkspaceRepository();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSPACE_REPOSITORY__URI = eINSTANCE.getWorkspaceRepository_Uri();

		/**
		 * The meta object literal for the '<em><b>Last Modification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSPACE_REPOSITORY__LAST_MODIFICATION = eINSTANCE.getWorkspaceRepository_LastModification();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSPACE_REPOSITORY__CREATION_DATE = eINSTANCE.getWorkspaceRepository_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Project Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE_REPOSITORY__PROJECT_CONTAINERS = eINSTANCE.getWorkspaceRepository_ProjectContainers();

		/**
		 * The meta object literal for the '<em><b>Organization Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE_REPOSITORY__ORGANIZATION_MODEL = eINSTANCE.getWorkspaceRepository_OrganizationModel();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.knowledge.impl.ModelingProjectImpl <em>Modeling Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.knowledge.impl.ModelingProjectImpl
		 * @see org.lunifera.metamodel.knowledge.impl.KnowledgePackageImpl#getModelingProject()
		 * @generated
		 */
		EClass MODELING_PROJECT = eINSTANCE.getModelingProject();

		/**
		 * The meta object literal for the '<em><b>Workspace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELING_PROJECT__WORKSPACE = eINSTANCE.getModelingProject_Workspace();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELING_PROJECT__IMPORTS = eINSTANCE.getModelingProject_Imports();

		/**
		 * The meta object literal for the '<em><b>Jdt URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELING_PROJECT__JDT_URI = eINSTANCE.getModelingProject_JdtURI();

		/**
		 * The meta object literal for the '<em><b>Knowledge Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELING_PROJECT__KNOWLEDGE_CONTAINERS = eINSTANCE.getModelingProject_KnowledgeContainers();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELING_PROJECT__OWNER = eINSTANCE.getModelingProject_Owner();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.knowledge.impl.AbstractKnowledgeContainerImpl <em>Abstract Knowledge Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.knowledge.impl.AbstractKnowledgeContainerImpl
		 * @see org.lunifera.metamodel.knowledge.impl.KnowledgePackageImpl#getAbstractKnowledgeContainer()
		 * @generated
		 */
		EClass ABSTRACT_KNOWLEDGE_CONTAINER = eINSTANCE.getAbstractKnowledgeContainer();

		/**
		 * The meta object literal for the '<em><b>Last Modification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_KNOWLEDGE_CONTAINER__LAST_MODIFICATION = eINSTANCE.getAbstractKnowledgeContainer_LastModification();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_KNOWLEDGE_CONTAINER__CREATION_DATE = eINSTANCE.getAbstractKnowledgeContainer_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Project Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER = eINSTANCE.getAbstractKnowledgeContainer_ProjectContainer();

		/**
		 * The meta object literal for the '<em><b>Tech Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_KNOWLEDGE_CONTAINER__TECH_OWNER = eINSTANCE.getAbstractKnowledgeContainer_TechOwner();

	}

} //KnowledgePackage
