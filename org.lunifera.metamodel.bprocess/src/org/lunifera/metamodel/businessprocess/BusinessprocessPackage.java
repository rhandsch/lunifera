/**
 */
package org.lunifera.metamodel.businessprocess;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.lunifera.metamodel.businessprocess.BusinessprocessFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.lunifera.metamodel'"
 * @generated
 */
public interface BusinessprocessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "businessprocess";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lunifera.org/metamodel/1.0/BusinessProcess";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "businessprocess";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessprocessPackage eINSTANCE = org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.businessprocess.impl.KnowledgeContainerBusinessProcessImpl <em>Knowledge Container Business Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.businessprocess.impl.KnowledgeContainerBusinessProcessImpl
	 * @see org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl#getKnowledgeContainerBusinessProcess()
	 * @generated
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__NAME = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__DESCRIPTION = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Last Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__LAST_MODIFICATION = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__LAST_MODIFICATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__CREATION_DATE = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Project Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__PROJECT_CONTAINER = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Tech Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__TECH_OWNER = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__TECH_OWNER;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__PROCESSES = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Knowledge Container Business Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BUSINESS_PROCESS_FEATURE_COUNT = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.businessprocess.impl.ActivityDefinitionImpl <em>Activity Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.businessprocess.impl.ActivityDefinitionImpl
	 * @see org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl#getActivityDefinition()
	 * @generated
	 */
	int ACTIVITY_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEFINITION__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEFINITION__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Bpmn Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEFINITION__BPMN_ACTIVITY = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEFINITION_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.businessprocess.impl.BusinessProcessDefinitionImpl <em>Business Process Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.businessprocess.impl.BusinessProcessDefinitionImpl
	 * @see org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl#getBusinessProcessDefinition()
	 * @generated
	 */
	int BUSINESS_PROCESS_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_DEFINITION__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_DEFINITION__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_DEFINITION__PROCESS_ID = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_DEFINITION__SUMMARY = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Detail Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_DEFINITION__DETAIL_DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_DEFINITION__CREATION_DATE = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bpmn Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_DEFINITION__BPMN_PROCESS = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Business Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_DEFINITION_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.businessprocess.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.businessprocess.impl.ActorImpl
	 * @see org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ROLES = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.businessprocess.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.businessprocess.impl.RoleImpl
	 * @see org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.businessprocess.impl.RulesServerImpl <em>Rules Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.businessprocess.impl.RulesServerImpl
	 * @see org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl#getRulesServer()
	 * @generated
	 */
	int RULES_SERVER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_SERVER__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_SERVER__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Rules Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_SERVER_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.businessprocess.impl.HumanTaskServerImpl <em>Human Task Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.businessprocess.impl.HumanTaskServerImpl
	 * @see org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl#getHumanTaskServer()
	 * @generated
	 */
	int HUMAN_TASK_SERVER = 6;

	/**
	 * The number of structural features of the '<em>Human Task Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_TASK_SERVER_FEATURE_COUNT = CommonPackage.ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.businessprocess.KnowledgeContainerBusinessProcess <em>Knowledge Container Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Container Business Process</em>'.
	 * @see org.lunifera.metamodel.businessprocess.KnowledgeContainerBusinessProcess
	 * @generated
	 */
	EClass getKnowledgeContainerBusinessProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.businessprocess.KnowledgeContainerBusinessProcess#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see org.lunifera.metamodel.businessprocess.KnowledgeContainerBusinessProcess#getProcesses()
	 * @see #getKnowledgeContainerBusinessProcess()
	 * @generated
	 */
	EReference getKnowledgeContainerBusinessProcess_Processes();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.businessprocess.ActivityDefinition <em>Activity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Definition</em>'.
	 * @see org.lunifera.metamodel.businessprocess.ActivityDefinition
	 * @generated
	 */
	EClass getActivityDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.businessprocess.ActivityDefinition#getBpmnActivity <em>Bpmn Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bpmn Activity</em>'.
	 * @see org.lunifera.metamodel.businessprocess.ActivityDefinition#getBpmnActivity()
	 * @see #getActivityDefinition()
	 * @generated
	 */
	EReference getActivityDefinition_BpmnActivity();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition <em>Business Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Process Definition</em>'.
	 * @see org.lunifera.metamodel.businessprocess.BusinessProcessDefinition
	 * @generated
	 */
	EClass getBusinessProcessDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getProcessId <em>Process Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Id</em>'.
	 * @see org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getProcessId()
	 * @see #getBusinessProcessDefinition()
	 * @generated
	 */
	EAttribute getBusinessProcessDefinition_ProcessId();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getSummary()
	 * @see #getBusinessProcessDefinition()
	 * @generated
	 */
	EAttribute getBusinessProcessDefinition_Summary();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getDetailDescription <em>Detail Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail Description</em>'.
	 * @see org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getDetailDescription()
	 * @see #getBusinessProcessDefinition()
	 * @generated
	 */
	EAttribute getBusinessProcessDefinition_DetailDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getCreationDate()
	 * @see #getBusinessProcessDefinition()
	 * @generated
	 */
	EAttribute getBusinessProcessDefinition_CreationDate();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getBpmnProcess <em>Bpmn Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bpmn Process</em>'.
	 * @see org.lunifera.metamodel.businessprocess.BusinessProcessDefinition#getBpmnProcess()
	 * @see #getBusinessProcessDefinition()
	 * @generated
	 */
	EReference getBusinessProcessDefinition_BpmnProcess();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.businessprocess.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see org.lunifera.metamodel.businessprocess.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.metamodel.businessprocess.Actor#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see org.lunifera.metamodel.businessprocess.Actor#getRoles()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Roles();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.businessprocess.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.lunifera.metamodel.businessprocess.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.businessprocess.RulesServer <em>Rules Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rules Server</em>'.
	 * @see org.lunifera.metamodel.businessprocess.RulesServer
	 * @generated
	 */
	EClass getRulesServer();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.businessprocess.HumanTaskServer <em>Human Task Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Task Server</em>'.
	 * @see org.lunifera.metamodel.businessprocess.HumanTaskServer
	 * @generated
	 */
	EClass getHumanTaskServer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BusinessprocessFactory getBusinessprocessFactory();

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
		 * The meta object literal for the '{@link org.lunifera.metamodel.businessprocess.impl.KnowledgeContainerBusinessProcessImpl <em>Knowledge Container Business Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.businessprocess.impl.KnowledgeContainerBusinessProcessImpl
		 * @see org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl#getKnowledgeContainerBusinessProcess()
		 * @generated
		 */
		EClass KNOWLEDGE_CONTAINER_BUSINESS_PROCESS = eINSTANCE.getKnowledgeContainerBusinessProcess();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_CONTAINER_BUSINESS_PROCESS__PROCESSES = eINSTANCE.getKnowledgeContainerBusinessProcess_Processes();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.businessprocess.impl.ActivityDefinitionImpl <em>Activity Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.businessprocess.impl.ActivityDefinitionImpl
		 * @see org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl#getActivityDefinition()
		 * @generated
		 */
		EClass ACTIVITY_DEFINITION = eINSTANCE.getActivityDefinition();

		/**
		 * The meta object literal for the '<em><b>Bpmn Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEFINITION__BPMN_ACTIVITY = eINSTANCE.getActivityDefinition_BpmnActivity();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.businessprocess.impl.BusinessProcessDefinitionImpl <em>Business Process Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.businessprocess.impl.BusinessProcessDefinitionImpl
		 * @see org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl#getBusinessProcessDefinition()
		 * @generated
		 */
		EClass BUSINESS_PROCESS_DEFINITION = eINSTANCE.getBusinessProcessDefinition();

		/**
		 * The meta object literal for the '<em><b>Process Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_PROCESS_DEFINITION__PROCESS_ID = eINSTANCE.getBusinessProcessDefinition_ProcessId();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_PROCESS_DEFINITION__SUMMARY = eINSTANCE.getBusinessProcessDefinition_Summary();

		/**
		 * The meta object literal for the '<em><b>Detail Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_PROCESS_DEFINITION__DETAIL_DESCRIPTION = eINSTANCE.getBusinessProcessDefinition_DetailDescription();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_PROCESS_DEFINITION__CREATION_DATE = eINSTANCE.getBusinessProcessDefinition_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Bpmn Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_DEFINITION__BPMN_PROCESS = eINSTANCE.getBusinessProcessDefinition_BpmnProcess();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.businessprocess.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.businessprocess.impl.ActorImpl
		 * @see org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ROLES = eINSTANCE.getActor_Roles();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.businessprocess.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.businessprocess.impl.RoleImpl
		 * @see org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.businessprocess.impl.RulesServerImpl <em>Rules Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.businessprocess.impl.RulesServerImpl
		 * @see org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl#getRulesServer()
		 * @generated
		 */
		EClass RULES_SERVER = eINSTANCE.getRulesServer();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.businessprocess.impl.HumanTaskServerImpl <em>Human Task Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.businessprocess.impl.HumanTaskServerImpl
		 * @see org.lunifera.metamodel.businessprocess.impl.BusinessprocessPackageImpl#getHumanTaskServer()
		 * @generated
		 */
		EClass HUMAN_TASK_SERVER = eINSTANCE.getHumanTaskServer();

	}

} //BusinessprocessPackage
