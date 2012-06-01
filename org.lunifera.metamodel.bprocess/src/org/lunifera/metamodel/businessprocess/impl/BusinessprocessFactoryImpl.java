/**
 */
package org.lunifera.metamodel.businessprocess.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.metamodel.businessprocess.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessprocessFactoryImpl extends EFactoryImpl implements BusinessprocessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BusinessprocessFactory init() {
		try {
			BusinessprocessFactory theBusinessprocessFactory = (BusinessprocessFactory)EPackage.Registry.INSTANCE.getEFactory("http://lunifera.org/metamodel/1.0/BusinessProcess"); 
			if (theBusinessprocessFactory != null) {
				return theBusinessprocessFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BusinessprocessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessprocessFactoryImpl() {
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
			case BusinessprocessPackage.KNOWLEDGE_CONTAINER_BUSINESS_PROCESS: return createKnowledgeContainerBusinessProcess();
			case BusinessprocessPackage.ACTIVITY_DEFINITION: return createActivityDefinition();
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION: return createBusinessProcessDefinition();
			case BusinessprocessPackage.ACTOR: return createActor();
			case BusinessprocessPackage.ROLE: return createRole();
			case BusinessprocessPackage.RULES_SERVER: return createRulesServer();
			case BusinessprocessPackage.HUMAN_TASK_SERVER: return createHumanTaskServer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeContainerBusinessProcess createKnowledgeContainerBusinessProcess() {
		KnowledgeContainerBusinessProcessImpl knowledgeContainerBusinessProcess = new KnowledgeContainerBusinessProcessImpl();
		return knowledgeContainerBusinessProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinition createActivityDefinition() {
		ActivityDefinitionImpl activityDefinition = new ActivityDefinitionImpl();
		return activityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcessDefinition createBusinessProcessDefinition() {
		BusinessProcessDefinitionImpl businessProcessDefinition = new BusinessProcessDefinitionImpl();
		return businessProcessDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesServer createRulesServer() {
		RulesServerImpl rulesServer = new RulesServerImpl();
		return rulesServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanTaskServer createHumanTaskServer() {
		HumanTaskServerImpl humanTaskServer = new HumanTaskServerImpl();
		return humanTaskServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessprocessPackage getBusinessprocessPackage() {
		return (BusinessprocessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BusinessprocessPackage getPackage() {
		return BusinessprocessPackage.eINSTANCE;
	}

} //BusinessprocessFactoryImpl
