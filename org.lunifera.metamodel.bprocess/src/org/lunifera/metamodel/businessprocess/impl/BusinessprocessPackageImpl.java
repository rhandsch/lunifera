/**
 */
package org.lunifera.metamodel.businessprocess.impl;

import org.eclipse.bpmn2.Bpmn2Package;

import org.eclipse.bpmn2.di.BpmnDiPackage;

import org.eclipse.dd.dc.DcPackage;

import org.eclipse.dd.di.DiPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.lunifera.metamodel.businessprocess.ActivityDefinition;
import org.lunifera.metamodel.businessprocess.Actor;
import org.lunifera.metamodel.businessprocess.BusinessProcessDefinition;
import org.lunifera.metamodel.businessprocess.BusinessprocessFactory;
import org.lunifera.metamodel.businessprocess.BusinessprocessPackage;
import org.lunifera.metamodel.businessprocess.HumanTaskServer;
import org.lunifera.metamodel.businessprocess.KnowledgeContainerBusinessProcess;
import org.lunifera.metamodel.businessprocess.Role;
import org.lunifera.metamodel.businessprocess.RulesServer;

import org.lunifera.metamodel.common.CommonPackage;

import org.lunifera.metamodel.knowledge.KnowledgePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessprocessPackageImpl extends EPackageImpl implements BusinessprocessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeContainerBusinessProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessProcessDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulesServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanTaskServerEClass = null;

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
	 * @see org.lunifera.metamodel.businessprocess.BusinessprocessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BusinessprocessPackageImpl() {
		super(eNS_URI, BusinessprocessFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BusinessprocessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BusinessprocessPackage init() {
		if (isInited) return (BusinessprocessPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessprocessPackage.eNS_URI);

		// Obtain or create and register package
		BusinessprocessPackageImpl theBusinessprocessPackage = (BusinessprocessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BusinessprocessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BusinessprocessPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Bpmn2Package.eINSTANCE.eClass();
		BpmnDiPackage.eINSTANCE.eClass();
		DiPackage.eINSTANCE.eClass();
		DcPackage.eINSTANCE.eClass();
		KnowledgePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBusinessprocessPackage.createPackageContents();

		// Initialize created meta-data
		theBusinessprocessPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBusinessprocessPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BusinessprocessPackage.eNS_URI, theBusinessprocessPackage);
		return theBusinessprocessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeContainerBusinessProcess() {
		return knowledgeContainerBusinessProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeContainerBusinessProcess_Processes() {
		return (EReference)knowledgeContainerBusinessProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityDefinition() {
		return activityDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_BpmnActivity() {
		return (EReference)activityDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessProcessDefinition() {
		return businessProcessDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessProcessDefinition_ProcessId() {
		return (EAttribute)businessProcessDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessProcessDefinition_Summary() {
		return (EAttribute)businessProcessDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessProcessDefinition_DetailDescription() {
		return (EAttribute)businessProcessDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessProcessDefinition_CreationDate() {
		return (EAttribute)businessProcessDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessDefinition_BpmnProcess() {
		return (EReference)businessProcessDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Roles() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRulesServer() {
		return rulesServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumanTaskServer() {
		return humanTaskServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessprocessFactory getBusinessprocessFactory() {
		return (BusinessprocessFactory)getEFactoryInstance();
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
		knowledgeContainerBusinessProcessEClass = createEClass(KNOWLEDGE_CONTAINER_BUSINESS_PROCESS);
		createEReference(knowledgeContainerBusinessProcessEClass, KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__PROCESSES);

		activityDefinitionEClass = createEClass(ACTIVITY_DEFINITION);
		createEReference(activityDefinitionEClass, ACTIVITY_DEFINITION__BPMN_ACTIVITY);

		businessProcessDefinitionEClass = createEClass(BUSINESS_PROCESS_DEFINITION);
		createEAttribute(businessProcessDefinitionEClass, BUSINESS_PROCESS_DEFINITION__PROCESS_ID);
		createEAttribute(businessProcessDefinitionEClass, BUSINESS_PROCESS_DEFINITION__SUMMARY);
		createEAttribute(businessProcessDefinitionEClass, BUSINESS_PROCESS_DEFINITION__DETAIL_DESCRIPTION);
		createEAttribute(businessProcessDefinitionEClass, BUSINESS_PROCESS_DEFINITION__CREATION_DATE);
		createEReference(businessProcessDefinitionEClass, BUSINESS_PROCESS_DEFINITION__BPMN_PROCESS);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__ROLES);

		roleEClass = createEClass(ROLE);

		rulesServerEClass = createEClass(RULES_SERVER);

		humanTaskServerEClass = createEClass(HUMAN_TASK_SERVER);
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
		KnowledgePackage theKnowledgePackage = (KnowledgePackage)EPackage.Registry.INSTANCE.getEPackage(KnowledgePackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		Bpmn2Package theBpmn2Package = (Bpmn2Package)EPackage.Registry.INSTANCE.getEPackage(Bpmn2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		knowledgeContainerBusinessProcessEClass.getESuperTypes().add(theKnowledgePackage.getAbstractKnowledgeContainer());
		activityDefinitionEClass.getESuperTypes().add(theCommonPackage.getAbstractDescribedClass());
		businessProcessDefinitionEClass.getESuperTypes().add(theCommonPackage.getAbstractDescribedClass());
		actorEClass.getESuperTypes().add(theCommonPackage.getAbstractDescribedClass());
		roleEClass.getESuperTypes().add(theCommonPackage.getAbstractDescribedClass());
		rulesServerEClass.getESuperTypes().add(theCommonPackage.getAbstractDescribedClass());
		humanTaskServerEClass.getESuperTypes().add(theCommonPackage.getAbstractIdentifiedClass());

		// Initialize classes and features; add operations and parameters
		initEClass(knowledgeContainerBusinessProcessEClass, KnowledgeContainerBusinessProcess.class, "KnowledgeContainerBusinessProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgeContainerBusinessProcess_Processes(), this.getBusinessProcessDefinition(), null, "processes", null, 0, -1, KnowledgeContainerBusinessProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityDefinitionEClass, ActivityDefinition.class, "ActivityDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityDefinition_BpmnActivity(), theBpmn2Package.getActivity(), null, "bpmnActivity", null, 0, 1, ActivityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessProcessDefinitionEClass, BusinessProcessDefinition.class, "BusinessProcessDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessProcessDefinition_ProcessId(), ecorePackage.getEString(), "processId", null, 0, 1, BusinessProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessProcessDefinition_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, BusinessProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessProcessDefinition_DetailDescription(), ecorePackage.getEString(), "detailDescription", null, 0, 1, BusinessProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessProcessDefinition_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, BusinessProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessProcessDefinition_BpmnProcess(), theBpmn2Package.getProcess(), null, "bpmnProcess", null, 0, 1, BusinessProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_Roles(), this.getRole(), null, "roles", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rulesServerEClass, RulesServer.class, "RulesServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humanTaskServerEClass, HumanTaskServer.class, "HumanTaskServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BusinessprocessPackageImpl
