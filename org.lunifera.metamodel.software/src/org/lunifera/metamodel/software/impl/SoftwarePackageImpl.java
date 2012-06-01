/**
 */
package org.lunifera.metamodel.software.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.lunifera.metamodel.common.CommonPackage;

import org.lunifera.metamodel.knowledge.KnowledgePackage;

import org.lunifera.metamodel.software.AbstractSoftwareComponent;
import org.lunifera.metamodel.software.AccessMode;
import org.lunifera.metamodel.software.AccessType;
import org.lunifera.metamodel.software.Application;
import org.lunifera.metamodel.software.Bundle;
import org.lunifera.metamodel.software.BundleType;
import org.lunifera.metamodel.software.Composite;
import org.lunifera.metamodel.software.Feature;
import org.lunifera.metamodel.software.ImplementationTechnology;
import org.lunifera.metamodel.software.KnowledgeContainerSoftware;
import org.lunifera.metamodel.software.License;
import org.lunifera.metamodel.software.Module;
import org.lunifera.metamodel.software.NotificationEvent;
import org.lunifera.metamodel.software.NotificationStrategy;
import org.lunifera.metamodel.software.NotificationType;
import org.lunifera.metamodel.software.Ownership;
import org.lunifera.metamodel.software.SoftwareFactory;
import org.lunifera.metamodel.software.SoftwarePackage;
import org.lunifera.metamodel.software.SoftwareSetup;
import org.lunifera.metamodel.software.SoftwareStatus;
import org.lunifera.metamodel.software.ThirdAPI;
import org.lunifera.metamodel.software.ThirdSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwarePackageImpl extends EPackageImpl implements SoftwarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeContainerSoftwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSoftwareComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thirdSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thirdAPIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum softwareStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notificationEventEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notificationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bundleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum implementationTechnologyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ownershipEEnum = null;

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
	 * @see org.lunifera.metamodel.software.SoftwarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SoftwarePackageImpl() {
		super(eNS_URI, SoftwareFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SoftwarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SoftwarePackage init() {
		if (isInited) return (SoftwarePackage)EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI);

		// Obtain or create and register package
		SoftwarePackageImpl theSoftwarePackage = (SoftwarePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SoftwarePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SoftwarePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		KnowledgePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSoftwarePackage.createPackageContents();

		// Initialize created meta-data
		theSoftwarePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSoftwarePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SoftwarePackage.eNS_URI, theSoftwarePackage);
		return theSoftwarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeContainerSoftware() {
		return knowledgeContainerSoftwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeContainerSoftware_SoftwareComponents() {
		return (EReference)knowledgeContainerSoftwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSoftwareComponent() {
		return abstractSoftwareComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSoftwareComponent_Versions() {
		return (EAttribute)abstractSoftwareComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSoftwareComponent_Status() {
		return (EAttribute)abstractSoftwareComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSoftwareComponent_License() {
		return (EReference)abstractSoftwareComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Code() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_NotificationStrategy() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Modules() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_RelatedSystems() {
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposite() {
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ParentSystem() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Features() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Technologys() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Bundles() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundle() {
		return bundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundle_Type() {
		return (EAttribute)bundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThirdSystem() {
		return thirdSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThirdSystem_Webpage() {
		return (EAttribute)thirdSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThirdSystem_SupportPage() {
		return (EAttribute)thirdSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPI() {
		return apiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPI_Bundles() {
		return (EReference)apiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThirdAPI() {
		return thirdAPIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThirdAPI_WebPage() {
		return (EAttribute)thirdAPIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThirdAPI_SupportPage() {
		return (EAttribute)thirdAPIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareSetup() {
		return softwareSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareSetup_AccessType() {
		return (EAttribute)softwareSetupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareSetup_AccessMode() {
		return (EAttribute)softwareSetupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareSetup_AccessURL() {
		return (EAttribute)softwareSetupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareSetup_AccessTimeout() {
		return (EAttribute)softwareSetupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationStrategy() {
		return notificationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationStrategy_ComponentSetup() {
		return (EReference)notificationStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationStrategy_NotificationEvent() {
		return (EAttribute)notificationStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationStrategy_NotificationType() {
		return (EAttribute)notificationStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationStrategy_PeopleToBeNotified() {
		return (EAttribute)notificationStrategyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLicense() {
		return licenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicense_Free() {
		return (EAttribute)licenseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicense_OpenSource() {
		return (EAttribute)licenseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicense_Uri() {
		return (EAttribute)licenseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSoftwareStatus() {
		return softwareStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessType() {
		return accessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessMode() {
		return accessModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNotificationEvent() {
		return notificationEventEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNotificationType() {
		return notificationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBundleType() {
		return bundleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImplementationTechnology() {
		return implementationTechnologyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOwnership() {
		return ownershipEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareFactory getSoftwareFactory() {
		return (SoftwareFactory)getEFactoryInstance();
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
		knowledgeContainerSoftwareEClass = createEClass(KNOWLEDGE_CONTAINER_SOFTWARE);
		createEReference(knowledgeContainerSoftwareEClass, KNOWLEDGE_CONTAINER_SOFTWARE__SOFTWARE_COMPONENTS);

		abstractSoftwareComponentEClass = createEClass(ABSTRACT_SOFTWARE_COMPONENT);
		createEAttribute(abstractSoftwareComponentEClass, ABSTRACT_SOFTWARE_COMPONENT__VERSIONS);
		createEAttribute(abstractSoftwareComponentEClass, ABSTRACT_SOFTWARE_COMPONENT__STATUS);
		createEReference(abstractSoftwareComponentEClass, ABSTRACT_SOFTWARE_COMPONENT__LICENSE);

		systemEClass = createEClass(SYSTEM);
		createEAttribute(systemEClass, SYSTEM__CODE);
		createEReference(systemEClass, SYSTEM__NOTIFICATION_STRATEGY);
		createEReference(systemEClass, SYSTEM__MODULES);
		createEReference(systemEClass, SYSTEM__RELATED_SYSTEMS);

		applicationEClass = createEClass(APPLICATION);

		compositeEClass = createEClass(COMPOSITE);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__PARENT_SYSTEM);
		createEReference(moduleEClass, MODULE__FEATURES);
		createEAttribute(moduleEClass, MODULE__TECHNOLOGYS);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__BUNDLES);

		bundleEClass = createEClass(BUNDLE);
		createEAttribute(bundleEClass, BUNDLE__TYPE);

		thirdSystemEClass = createEClass(THIRD_SYSTEM);
		createEAttribute(thirdSystemEClass, THIRD_SYSTEM__WEBPAGE);
		createEAttribute(thirdSystemEClass, THIRD_SYSTEM__SUPPORT_PAGE);

		apiEClass = createEClass(API);
		createEReference(apiEClass, API__BUNDLES);

		thirdAPIEClass = createEClass(THIRD_API);
		createEAttribute(thirdAPIEClass, THIRD_API__WEB_PAGE);
		createEAttribute(thirdAPIEClass, THIRD_API__SUPPORT_PAGE);

		softwareSetupEClass = createEClass(SOFTWARE_SETUP);
		createEAttribute(softwareSetupEClass, SOFTWARE_SETUP__ACCESS_TYPE);
		createEAttribute(softwareSetupEClass, SOFTWARE_SETUP__ACCESS_MODE);
		createEAttribute(softwareSetupEClass, SOFTWARE_SETUP__ACCESS_URL);
		createEAttribute(softwareSetupEClass, SOFTWARE_SETUP__ACCESS_TIMEOUT);

		notificationStrategyEClass = createEClass(NOTIFICATION_STRATEGY);
		createEReference(notificationStrategyEClass, NOTIFICATION_STRATEGY__COMPONENT_SETUP);
		createEAttribute(notificationStrategyEClass, NOTIFICATION_STRATEGY__NOTIFICATION_EVENT);
		createEAttribute(notificationStrategyEClass, NOTIFICATION_STRATEGY__NOTIFICATION_TYPE);
		createEAttribute(notificationStrategyEClass, NOTIFICATION_STRATEGY__PEOPLE_TO_BE_NOTIFIED);

		licenseEClass = createEClass(LICENSE);
		createEAttribute(licenseEClass, LICENSE__FREE);
		createEAttribute(licenseEClass, LICENSE__OPEN_SOURCE);
		createEAttribute(licenseEClass, LICENSE__URI);

		// Create enums
		softwareStatusEEnum = createEEnum(SOFTWARE_STATUS);
		accessTypeEEnum = createEEnum(ACCESS_TYPE);
		accessModeEEnum = createEEnum(ACCESS_MODE);
		notificationEventEEnum = createEEnum(NOTIFICATION_EVENT);
		notificationTypeEEnum = createEEnum(NOTIFICATION_TYPE);
		bundleTypeEEnum = createEEnum(BUNDLE_TYPE);
		implementationTechnologyEEnum = createEEnum(IMPLEMENTATION_TECHNOLOGY);
		ownershipEEnum = createEEnum(OWNERSHIP);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		knowledgeContainerSoftwareEClass.getESuperTypes().add(theKnowledgePackage.getAbstractKnowledgeContainer());
		abstractSoftwareComponentEClass.getESuperTypes().add(theCommonPackage.getAbstractDescribedClass());
		systemEClass.getESuperTypes().add(this.getAbstractSoftwareComponent());
		applicationEClass.getESuperTypes().add(this.getAbstractSoftwareComponent());
		compositeEClass.getESuperTypes().add(this.getAbstractSoftwareComponent());
		moduleEClass.getESuperTypes().add(this.getAbstractSoftwareComponent());
		featureEClass.getESuperTypes().add(this.getAbstractSoftwareComponent());
		bundleEClass.getESuperTypes().add(this.getAbstractSoftwareComponent());
		thirdSystemEClass.getESuperTypes().add(this.getSystem());
		apiEClass.getESuperTypes().add(this.getAbstractSoftwareComponent());
		thirdAPIEClass.getESuperTypes().add(this.getAPI());
		softwareSetupEClass.getESuperTypes().add(theCommonPackage.getAbstractIdentifiedClass());
		notificationStrategyEClass.getESuperTypes().add(theCommonPackage.getAbstractIdentifiedClass());
		licenseEClass.getESuperTypes().add(theCommonPackage.getAbstractIdentifiedClass());

		// Initialize classes and features; add operations and parameters
		initEClass(knowledgeContainerSoftwareEClass, KnowledgeContainerSoftware.class, "KnowledgeContainerSoftware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgeContainerSoftware_SoftwareComponents(), this.getAbstractSoftwareComponent(), null, "softwareComponents", null, 0, -1, KnowledgeContainerSoftware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractSoftwareComponentEClass, AbstractSoftwareComponent.class, "AbstractSoftwareComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractSoftwareComponent_Versions(), ecorePackage.getEString(), "versions", null, 0, -1, AbstractSoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractSoftwareComponent_Status(), this.getSoftwareStatus(), "status", "0", 0, 1, AbstractSoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractSoftwareComponent_License(), this.getLicense(), null, "license", null, 0, 1, AbstractSoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, org.lunifera.metamodel.software.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystem_Code(), ecorePackage.getEString(), "code", null, 0, 1, org.lunifera.metamodel.software.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_NotificationStrategy(), this.getNotificationStrategy(), null, "notificationStrategy", null, 0, 1, org.lunifera.metamodel.software.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Modules(), this.getModule(), null, "modules", null, 0, -1, org.lunifera.metamodel.software.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_RelatedSystems(), this.getSystem(), null, "relatedSystems", null, 0, -1, org.lunifera.metamodel.software.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeEClass, Composite.class, "Composite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_ParentSystem(), this.getSystem(), null, "parentSystem", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Features(), this.getFeature(), null, "features", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Technologys(), this.getImplementationTechnology(), "technologys", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_Bundles(), this.getBundle(), null, "bundles", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleEClass, Bundle.class, "Bundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundle_Type(), this.getBundleType(), "type", null, 1, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thirdSystemEClass, ThirdSystem.class, "ThirdSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThirdSystem_Webpage(), ecorePackage.getEString(), "webpage", null, 0, 1, ThirdSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThirdSystem_SupportPage(), ecorePackage.getEString(), "supportPage", null, 0, 1, ThirdSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiEClass, org.lunifera.metamodel.software.API.class, "API", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPI_Bundles(), this.getBundle(), null, "bundles", null, 0, -1, org.lunifera.metamodel.software.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thirdAPIEClass, ThirdAPI.class, "ThirdAPI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThirdAPI_WebPage(), ecorePackage.getEString(), "webPage", null, 0, 1, ThirdAPI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThirdAPI_SupportPage(), ecorePackage.getEString(), "supportPage", null, 0, 1, ThirdAPI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareSetupEClass, SoftwareSetup.class, "SoftwareSetup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareSetup_AccessType(), this.getAccessType(), "accessType", null, 1, 1, SoftwareSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareSetup_AccessMode(), this.getAccessMode(), "accessMode", null, 1, 1, SoftwareSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareSetup_AccessURL(), ecorePackage.getEString(), "accessURL", null, 1, 1, SoftwareSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareSetup_AccessTimeout(), ecorePackage.getEIntegerObject(), "accessTimeout", null, 0, 1, SoftwareSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationStrategyEClass, NotificationStrategy.class, "NotificationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotificationStrategy_ComponentSetup(), this.getSoftwareSetup(), null, "componentSetup", null, 0, 1, NotificationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationStrategy_NotificationEvent(), this.getNotificationEvent(), "notificationEvent", null, 0, 1, NotificationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationStrategy_NotificationType(), this.getNotificationType(), "notificationType", null, 0, -1, NotificationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationStrategy_PeopleToBeNotified(), ecorePackage.getEString(), "peopleToBeNotified", null, 0, -1, NotificationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(licenseEClass, License.class, "License", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLicense_Free(), ecorePackage.getEBoolean(), "free", null, 0, 1, License.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLicense_OpenSource(), ecorePackage.getEBoolean(), "openSource", null, 0, 1, License.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLicense_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, License.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(softwareStatusEEnum, SoftwareStatus.class, "SoftwareStatus");
		addEEnumLiteral(softwareStatusEEnum, SoftwareStatus.DEVELOPMENT);
		addEEnumLiteral(softwareStatusEEnum, SoftwareStatus.PRODUCTION);
		addEEnumLiteral(softwareStatusEEnum, SoftwareStatus.MAINTENANCE);
		addEEnumLiteral(softwareStatusEEnum, SoftwareStatus.INACTIVE);

		initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
		addEEnumLiteral(accessTypeEEnum, AccessType.WEB_SERVICE);
		addEEnumLiteral(accessTypeEEnum, AccessType.OS_GI_SERVICE);
		addEEnumLiteral(accessTypeEEnum, AccessType.RCP_CALL);

		initEEnum(accessModeEEnum, AccessMode.class, "AccessMode");
		addEEnumLiteral(accessModeEEnum, AccessMode.SYNCHRONOUS);
		addEEnumLiteral(accessModeEEnum, AccessMode.ASSYNCHRONOUS);

		initEEnum(notificationEventEEnum, NotificationEvent.class, "NotificationEvent");
		addEEnumLiteral(notificationEventEEnum, NotificationEvent.ON_ERROR);
		addEEnumLiteral(notificationEventEEnum, NotificationEvent.ON_SUCCESS);

		initEEnum(notificationTypeEEnum, NotificationType.class, "NotificationType");
		addEEnumLiteral(notificationTypeEEnum, NotificationType.EMAIL);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.SMS);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.TWEETER);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.PHONE_CALL);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.NONE);

		initEEnum(bundleTypeEEnum, BundleType.class, "BundleType");
		addEEnumLiteral(bundleTypeEEnum, BundleType.CONFIGURATION);
		addEEnumLiteral(bundleTypeEEnum, BundleType.PERSISTENCE);
		addEEnumLiteral(bundleTypeEEnum, BundleType.BUSINESSPROCESS);
		addEEnumLiteral(bundleTypeEEnum, BundleType.BUSINESSRULES);
		addEEnumLiteral(bundleTypeEEnum, BundleType.SERVICE);
		addEEnumLiteral(bundleTypeEEnum, BundleType.UI);

		initEEnum(implementationTechnologyEEnum, ImplementationTechnology.class, "ImplementationTechnology");
		addEEnumLiteral(implementationTechnologyEEnum, ImplementationTechnology.EQUINOX);
		addEEnumLiteral(implementationTechnologyEEnum, ImplementationTechnology.RCP);
		addEEnumLiteral(implementationTechnologyEEnum, ImplementationTechnology.VAADIN);
		addEEnumLiteral(implementationTechnologyEEnum, ImplementationTechnology.ANDROID);
		addEEnumLiteral(implementationTechnologyEEnum, ImplementationTechnology.IOS);

		initEEnum(ownershipEEnum, Ownership.class, "Ownership");
		addEEnumLiteral(ownershipEEnum, Ownership.INTERNAL);
		addEEnumLiteral(ownershipEEnum, Ownership.THIRD_MADE);
		addEEnumLiteral(ownershipEEnum, Ownership.THIRD_RENT);

		// Create resource
		createResource(eNS_URI);
	}

} //SoftwarePackageImpl
