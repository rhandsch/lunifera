/**
 */
package org.lunifera.metamodel.knowledge.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.lunifera.metamodel.common.CommonPackage;

import org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer;
import org.lunifera.metamodel.knowledge.KnowledgeFactory;
import org.lunifera.metamodel.knowledge.KnowledgePackage;
import org.lunifera.metamodel.knowledge.ModelingProject;
import org.lunifera.metamodel.knowledge.WorkspaceRepository;

import org.lunifera.metamodel.organization.OrganizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnowledgePackageImpl extends EPackageImpl implements KnowledgePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workspaceRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelingProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractKnowledgeContainerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.lunifera.metamodel.knowledge.KnowledgePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KnowledgePackageImpl() {
		super(eNS_URI, KnowledgeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link KnowledgePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KnowledgePackage init() {
		if (isInited) return (KnowledgePackage)EPackage.Registry.INSTANCE.getEPackage(KnowledgePackage.eNS_URI);

		// Obtain or create and register package
		KnowledgePackageImpl theKnowledgePackage = (KnowledgePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KnowledgePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KnowledgePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OrganizationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theKnowledgePackage.createPackageContents();

		// Initialize created meta-data
		theKnowledgePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKnowledgePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KnowledgePackage.eNS_URI, theKnowledgePackage);
		return theKnowledgePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkspaceRepository() {
		return workspaceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkspaceRepository_Uri() {
		return (EAttribute)workspaceRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkspaceRepository_LastModification() {
		return (EAttribute)workspaceRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkspaceRepository_CreationDate() {
		return (EAttribute)workspaceRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkspaceRepository_ProjectContainers() {
		return (EReference)workspaceRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelingProject() {
		return modelingProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingProject_Workspace() {
		return (EReference)modelingProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingProject_Imports() {
		return (EReference)modelingProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelingProject_JdtURI() {
		return (EAttribute)modelingProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingProject_KnowledgeContainers() {
		return (EReference)modelingProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingProject_Owner() {
		return (EReference)modelingProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingProject_OrganizationKnowledgeContainers() {
		return (EReference)modelingProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractKnowledgeContainer() {
		return abstractKnowledgeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractKnowledgeContainer_LastModification() {
		return (EAttribute)abstractKnowledgeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractKnowledgeContainer_CreationDate() {
		return (EAttribute)abstractKnowledgeContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractKnowledgeContainer_ProjectContainer() {
		return (EReference)abstractKnowledgeContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractKnowledgeContainer_TechOwner() {
		return (EReference)abstractKnowledgeContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeFactory getKnowledgeFactory() {
		return (KnowledgeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		workspaceRepositoryEClass = createEClass(WORKSPACE_REPOSITORY);
		createEAttribute(workspaceRepositoryEClass, WORKSPACE_REPOSITORY__URI);
		createEAttribute(workspaceRepositoryEClass, WORKSPACE_REPOSITORY__LAST_MODIFICATION);
		createEAttribute(workspaceRepositoryEClass, WORKSPACE_REPOSITORY__CREATION_DATE);
		createEReference(workspaceRepositoryEClass, WORKSPACE_REPOSITORY__PROJECT_CONTAINERS);

		modelingProjectEClass = createEClass(MODELING_PROJECT);
		createEReference(modelingProjectEClass, MODELING_PROJECT__WORKSPACE);
		createEReference(modelingProjectEClass, MODELING_PROJECT__IMPORTS);
		createEAttribute(modelingProjectEClass, MODELING_PROJECT__JDT_URI);
		createEReference(modelingProjectEClass, MODELING_PROJECT__KNOWLEDGE_CONTAINERS);
		createEReference(modelingProjectEClass, MODELING_PROJECT__OWNER);
		createEReference(modelingProjectEClass, MODELING_PROJECT__ORGANIZATION_KNOWLEDGE_CONTAINERS);

		abstractKnowledgeContainerEClass = createEClass(ABSTRACT_KNOWLEDGE_CONTAINER);
		createEAttribute(abstractKnowledgeContainerEClass, ABSTRACT_KNOWLEDGE_CONTAINER__LAST_MODIFICATION);
		createEAttribute(abstractKnowledgeContainerEClass, ABSTRACT_KNOWLEDGE_CONTAINER__CREATION_DATE);
		createEReference(abstractKnowledgeContainerEClass, ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER);
		createEReference(abstractKnowledgeContainerEClass, ABSTRACT_KNOWLEDGE_CONTAINER__TECH_OWNER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		OrganizationPackage theOrganizationPackage = (OrganizationPackage)EPackage.Registry.INSTANCE.getEPackage(OrganizationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workspaceRepositoryEClass.getESuperTypes().add(theCommonPackage.getAbstractDescribedClass());
		modelingProjectEClass.getESuperTypes().add(theCommonPackage.getAbstractDescribedClass());
		abstractKnowledgeContainerEClass.getESuperTypes().add(theCommonPackage.getAbstractDescribedClass());

		// Initialize classes and features; add operations and parameters
		initEClass(workspaceRepositoryEClass, WorkspaceRepository.class, "WorkspaceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkspaceRepository_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, WorkspaceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkspaceRepository_LastModification(), ecorePackage.getEDate(), "lastModification", null, 0, 1, WorkspaceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkspaceRepository_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, WorkspaceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkspaceRepository_ProjectContainers(), this.getModelingProject(), null, "projectContainers", null, 0, -1, WorkspaceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelingProjectEClass, ModelingProject.class, "ModelingProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelingProject_Workspace(), this.getWorkspaceRepository(), null, "workspace", null, 1, 1, ModelingProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingProject_Imports(), theCommonPackage.getImport(), null, "imports", null, 0, -1, ModelingProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelingProject_JdtURI(), ecorePackage.getEString(), "jdtURI", null, 0, 1, ModelingProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingProject_KnowledgeContainers(), this.getAbstractKnowledgeContainer(), this.getAbstractKnowledgeContainer_ProjectContainer(), "knowledgeContainers", null, 0, -1, ModelingProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingProject_Owner(), theOrganizationPackage.getOrganization(), null, "owner", null, 0, 1, ModelingProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingProject_OrganizationKnowledgeContainers(), theOrganizationPackage.getKnowledgeContainerOrganization(), null, "organizationKnowledgeContainers", null, 1, -1, ModelingProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractKnowledgeContainerEClass, AbstractKnowledgeContainer.class, "AbstractKnowledgeContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractKnowledgeContainer_LastModification(), ecorePackage.getEDate(), "lastModification", null, 0, 1, AbstractKnowledgeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractKnowledgeContainer_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, AbstractKnowledgeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractKnowledgeContainer_ProjectContainer(), this.getModelingProject(), this.getModelingProject_KnowledgeContainers(), "projectContainer", null, 1, 1, AbstractKnowledgeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractKnowledgeContainer_TechOwner(), theOrganizationPackage.getWorker(), null, "techOwner", null, 0, 1, AbstractKnowledgeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //KnowledgePackageImpl
