/**
 */
package org.lunifera.metamodel.rule.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.lunifera.metamodel.common.CommonPackage;

import org.lunifera.metamodel.knowledge.KnowledgePackage;

import org.lunifera.metamodel.rule.BusinessRule;
import org.lunifera.metamodel.rule.KnowledgeContainerBusinessRule;
import org.lunifera.metamodel.rule.RuleFactory;
import org.lunifera.metamodel.rule.RuleLanguage;
import org.lunifera.metamodel.rule.RulePackage;
import org.lunifera.metamodel.rule.RuleServerSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulePackageImpl extends EPackageImpl implements RulePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeContainerBusinessRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleServerSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ruleLanguageEEnum = null;

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
	 * @see org.lunifera.metamodel.rule.RulePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulePackageImpl() {
		super(eNS_URI, RuleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RulePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RulePackage init() {
		if (isInited) return (RulePackage)EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI);

		// Obtain or create and register package
		RulePackageImpl theRulePackage = (RulePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RulePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RulePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		KnowledgePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRulePackage.createPackageContents();

		// Initialize created meta-data
		theRulePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulePackage.eNS_URI, theRulePackage);
		return theRulePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeContainerBusinessRule() {
		return knowledgeContainerBusinessRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeContainerBusinessRule_Rules() {
		return (EReference)knowledgeContainerBusinessRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeContainerBusinessRule_Settings() {
		return (EReference)knowledgeContainerBusinessRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessRule() {
		return businessRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessRule_RuleId() {
		return (EAttribute)businessRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessRule_Summary() {
		return (EAttribute)businessRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessRule_Body() {
		return (EAttribute)businessRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessRule_Language() {
		return (EAttribute)businessRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessRule_ServerURI() {
		return (EAttribute)businessRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleServerSettings() {
		return ruleServerSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleServerSettings_GuvnorURI() {
		return (EAttribute)ruleServerSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRuleLanguage() {
		return ruleLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleFactory getRuleFactory() {
		return (RuleFactory)getEFactoryInstance();
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
		knowledgeContainerBusinessRuleEClass = createEClass(KNOWLEDGE_CONTAINER_BUSINESS_RULE);
		createEReference(knowledgeContainerBusinessRuleEClass, KNOWLEDGE_CONTAINER_BUSINESS_RULE__RULES);
		createEReference(knowledgeContainerBusinessRuleEClass, KNOWLEDGE_CONTAINER_BUSINESS_RULE__SETTINGS);

		businessRuleEClass = createEClass(BUSINESS_RULE);
		createEAttribute(businessRuleEClass, BUSINESS_RULE__RULE_ID);
		createEAttribute(businessRuleEClass, BUSINESS_RULE__SUMMARY);
		createEAttribute(businessRuleEClass, BUSINESS_RULE__BODY);
		createEAttribute(businessRuleEClass, BUSINESS_RULE__LANGUAGE);
		createEAttribute(businessRuleEClass, BUSINESS_RULE__SERVER_URI);

		ruleServerSettingsEClass = createEClass(RULE_SERVER_SETTINGS);
		createEAttribute(ruleServerSettingsEClass, RULE_SERVER_SETTINGS__GUVNOR_URI);

		// Create enums
		ruleLanguageEEnum = createEEnum(RULE_LANGUAGE);
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
		knowledgeContainerBusinessRuleEClass.getESuperTypes().add(theKnowledgePackage.getAbstractKnowledgeContainer());
		businessRuleEClass.getESuperTypes().add(theCommonPackage.getAbstractNamedClass());
		ruleServerSettingsEClass.getESuperTypes().add(theCommonPackage.getAbstractNamedClass());

		// Initialize classes and features; add operations and parameters
		initEClass(knowledgeContainerBusinessRuleEClass, KnowledgeContainerBusinessRule.class, "KnowledgeContainerBusinessRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgeContainerBusinessRule_Rules(), this.getBusinessRule(), null, "rules", null, 0, -1, KnowledgeContainerBusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeContainerBusinessRule_Settings(), this.getRuleServerSettings(), null, "settings", null, 0, 1, KnowledgeContainerBusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessRuleEClass, BusinessRule.class, "BusinessRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessRule_RuleId(), ecorePackage.getEString(), "ruleId", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessRule_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessRule_Body(), ecorePackage.getEString(), "body", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessRule_Language(), this.getRuleLanguage(), "language", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessRule_ServerURI(), ecorePackage.getEString(), "serverURI", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleServerSettingsEClass, RuleServerSettings.class, "RuleServerSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleServerSettings_GuvnorURI(), ecorePackage.getEString(), "guvnorURI", null, 0, 1, RuleServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ruleLanguageEEnum, RuleLanguage.class, "RuleLanguage");
		addEEnumLiteral(ruleLanguageEEnum, RuleLanguage.JAVA);
		addEEnumLiteral(ruleLanguageEEnum, RuleLanguage.MVEL);

		// Create resource
		createResource(eNS_URI);
	}

} //RulePackageImpl
