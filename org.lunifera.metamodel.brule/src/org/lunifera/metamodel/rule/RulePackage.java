/**
 */
package org.lunifera.metamodel.rule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.lunifera.metamodel.common.CommonPackage;

import org.lunifera.metamodel.knowledge.KnowledgePackage;

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
 * @see org.lunifera.metamodel.rule.RuleFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.lunifera.metamodel'"
 * @generated
 */
public interface RulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lunifera.org/metamodel/1.0/Rule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulePackage eINSTANCE = org.lunifera.metamodel.rule.impl.RulePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.rule.impl.KnowledgeContainerBusinessRuleImpl <em>Knowledge Container Business Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.rule.impl.KnowledgeContainerBusinessRuleImpl
	 * @see org.lunifera.metamodel.rule.impl.RulePackageImpl#getKnowledgeContainerBusinessRule()
	 * @generated
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_RULE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_RULE__NAME = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_RULE__DESCRIPTION = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Last Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_RULE__LAST_MODIFICATION = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__LAST_MODIFICATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_RULE__CREATION_DATE = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Project Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_RULE__PROJECT_CONTAINER = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Tech Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_RULE__TECH_OWNER = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__TECH_OWNER;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_RULE__RULES = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_RULE__SETTINGS = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Knowledge Container Business Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_RULE_FEATURE_COUNT = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.rule.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.rule.impl.BusinessRuleImpl
	 * @see org.lunifera.metamodel.rule.impl.RulePackageImpl#getBusinessRule()
	 * @generated
	 */
	int BUSINESS_RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__NAME = CommonPackage.ABSTRACT_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__RULE_ID = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__SUMMARY = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__BODY = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__LANGUAGE = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Server URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__SERVER_URI = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Business Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_FEATURE_COUNT = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.rule.impl.RuleServerSettingsImpl <em>Server Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.rule.impl.RuleServerSettingsImpl
	 * @see org.lunifera.metamodel.rule.impl.RulePackageImpl#getRuleServerSettings()
	 * @generated
	 */
	int RULE_SERVER_SETTINGS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SERVER_SETTINGS__NAME = CommonPackage.ABSTRACT_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Guvnor URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SERVER_SETTINGS__GUVNOR_URI = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Server Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SERVER_SETTINGS_FEATURE_COUNT = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.rule.RuleLanguage <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.rule.RuleLanguage
	 * @see org.lunifera.metamodel.rule.impl.RulePackageImpl#getRuleLanguage()
	 * @generated
	 */
	int RULE_LANGUAGE = 3;


	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.rule.KnowledgeContainerBusinessRule <em>Knowledge Container Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Container Business Rule</em>'.
	 * @see org.lunifera.metamodel.rule.KnowledgeContainerBusinessRule
	 * @generated
	 */
	EClass getKnowledgeContainerBusinessRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.rule.KnowledgeContainerBusinessRule#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.lunifera.metamodel.rule.KnowledgeContainerBusinessRule#getRules()
	 * @see #getKnowledgeContainerBusinessRule()
	 * @generated
	 */
	EReference getKnowledgeContainerBusinessRule_Rules();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.rule.KnowledgeContainerBusinessRule#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see org.lunifera.metamodel.rule.KnowledgeContainerBusinessRule#getSettings()
	 * @see #getKnowledgeContainerBusinessRule()
	 * @generated
	 */
	EReference getKnowledgeContainerBusinessRule_Settings();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.rule.BusinessRule <em>Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Rule</em>'.
	 * @see org.lunifera.metamodel.rule.BusinessRule
	 * @generated
	 */
	EClass getBusinessRule();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.rule.BusinessRule#getRuleId <em>Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Id</em>'.
	 * @see org.lunifera.metamodel.rule.BusinessRule#getRuleId()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EAttribute getBusinessRule_RuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.rule.BusinessRule#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.lunifera.metamodel.rule.BusinessRule#getSummary()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EAttribute getBusinessRule_Summary();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.rule.BusinessRule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.lunifera.metamodel.rule.BusinessRule#getBody()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EAttribute getBusinessRule_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.rule.BusinessRule#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.lunifera.metamodel.rule.BusinessRule#getLanguage()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EAttribute getBusinessRule_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.rule.BusinessRule#getServerURI <em>Server URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server URI</em>'.
	 * @see org.lunifera.metamodel.rule.BusinessRule#getServerURI()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EAttribute getBusinessRule_ServerURI();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.rule.RuleServerSettings <em>Server Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Settings</em>'.
	 * @see org.lunifera.metamodel.rule.RuleServerSettings
	 * @generated
	 */
	EClass getRuleServerSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.rule.RuleServerSettings#getGuvnorURI <em>Guvnor URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guvnor URI</em>'.
	 * @see org.lunifera.metamodel.rule.RuleServerSettings#getGuvnorURI()
	 * @see #getRuleServerSettings()
	 * @generated
	 */
	EAttribute getRuleServerSettings_GuvnorURI();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.metamodel.rule.RuleLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see org.lunifera.metamodel.rule.RuleLanguage
	 * @generated
	 */
	EEnum getRuleLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RuleFactory getRuleFactory();

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
		 * The meta object literal for the '{@link org.lunifera.metamodel.rule.impl.KnowledgeContainerBusinessRuleImpl <em>Knowledge Container Business Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.rule.impl.KnowledgeContainerBusinessRuleImpl
		 * @see org.lunifera.metamodel.rule.impl.RulePackageImpl#getKnowledgeContainerBusinessRule()
		 * @generated
		 */
		EClass KNOWLEDGE_CONTAINER_BUSINESS_RULE = eINSTANCE.getKnowledgeContainerBusinessRule();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_CONTAINER_BUSINESS_RULE__RULES = eINSTANCE.getKnowledgeContainerBusinessRule_Rules();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_CONTAINER_BUSINESS_RULE__SETTINGS = eINSTANCE.getKnowledgeContainerBusinessRule_Settings();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.rule.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.rule.impl.BusinessRuleImpl
		 * @see org.lunifera.metamodel.rule.impl.RulePackageImpl#getBusinessRule()
		 * @generated
		 */
		EClass BUSINESS_RULE = eINSTANCE.getBusinessRule();

		/**
		 * The meta object literal for the '<em><b>Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_RULE__RULE_ID = eINSTANCE.getBusinessRule_RuleId();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_RULE__SUMMARY = eINSTANCE.getBusinessRule_Summary();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_RULE__BODY = eINSTANCE.getBusinessRule_Body();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_RULE__LANGUAGE = eINSTANCE.getBusinessRule_Language();

		/**
		 * The meta object literal for the '<em><b>Server URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_RULE__SERVER_URI = eINSTANCE.getBusinessRule_ServerURI();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.rule.impl.RuleServerSettingsImpl <em>Server Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.rule.impl.RuleServerSettingsImpl
		 * @see org.lunifera.metamodel.rule.impl.RulePackageImpl#getRuleServerSettings()
		 * @generated
		 */
		EClass RULE_SERVER_SETTINGS = eINSTANCE.getRuleServerSettings();

		/**
		 * The meta object literal for the '<em><b>Guvnor URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_SERVER_SETTINGS__GUVNOR_URI = eINSTANCE.getRuleServerSettings_GuvnorURI();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.rule.RuleLanguage <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.rule.RuleLanguage
		 * @see org.lunifera.metamodel.rule.impl.RulePackageImpl#getRuleLanguage()
		 * @generated
		 */
		EEnum RULE_LANGUAGE = eINSTANCE.getRuleLanguage();

	}

} //RulePackage
