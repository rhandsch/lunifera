/**
 */
package com.c4biz.hawdev.model.organization;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.lunifera.model.common.CommonPackage;

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
 * @see com.c4biz.hawdev.model.organization.OrganizationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='com.c4biz.hawdev.model'"
 * @generated
 */
public interface OrganizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "organization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lunifera.org/model/1.0/Organization";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "organization";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrganizationPackage eINSTANCE = com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.c4biz.hawdev.model.organization.impl.KnowledgeContainerOrganizationImpl <em>Knowledge Container Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.c4biz.hawdev.model.organization.impl.KnowledgeContainerOrganizationImpl
	 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getKnowledgeContainerOrganization()
	 * @generated
	 */
	int KNOWLEDGE_CONTAINER_ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_ORGANIZATION__ID = CommonPackage.ABS_KNOWLEDGE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_ORGANIZATION__NAME = CommonPackage.ABS_KNOWLEDGE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_ORGANIZATION__DESCRIPTION = CommonPackage.ABS_KNOWLEDGE_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Last Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_ORGANIZATION__LAST_MODIFICATION = CommonPackage.ABS_KNOWLEDGE_CONTAINER__LAST_MODIFICATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_ORGANIZATION__CREATION_DATE = CommonPackage.ABS_KNOWLEDGE_CONTAINER__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Project Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_ORGANIZATION__PROJECT_CONTAINER = CommonPackage.ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_ORGANIZATION__ORGANIZATIONS = CommonPackage.ABS_KNOWLEDGE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Knowledge Container Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_ORGANIZATION_FEATURE_COUNT = CommonPackage.ABS_KNOWLEDGE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.c4biz.hawdev.model.organization.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.c4biz.hawdev.model.organization.impl.OrganizationImpl
	 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ID = CommonPackage.ABS_DESCRIBED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = CommonPackage.ABS_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DESCRIPTION = CommonPackage.ABS_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__UNITS = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PERSONS = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Workers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__WORKERS = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ROLES = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Partners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PARTNERS = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CONTACT = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unit Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__UNIT_TYPES = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.c4biz.hawdev.model.organization.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.c4biz.hawdev.model.organization.impl.UnitImpl
	 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__ID = CommonPackage.ABS_NAMED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = CommonPackage.ABS_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__ORGANIZATION = CommonPackage.ABS_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__PARENT_UNIT = CommonPackage.ABS_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__SUB_UNITS = CommonPackage.ABS_NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__UNIT_TYPE = CommonPackage.ABS_NAMED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = CommonPackage.ABS_NAMED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.c4biz.hawdev.model.organization.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.c4biz.hawdev.model.organization.impl.PersonImpl
	 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = CommonPackage.ABS_NAMED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = CommonPackage.ABS_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ORGANIZATION = CommonPackage.ABS_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = CommonPackage.ABS_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = CommonPackage.ABS_NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.c4biz.hawdev.model.organization.impl.WorkerImpl <em>Worker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.c4biz.hawdev.model.organization.impl.WorkerImpl
	 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getWorker()
	 * @generated
	 */
	int WORKER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__ID = CommonPackage.ABS_IDENTIFIED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__ORGANIZATION = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__PERSON = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allocation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__ALLOCATION_UNIT = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__ROLES = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Worker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_FEATURE_COUNT = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.c4biz.hawdev.model.organization.impl.UnitTypeImpl <em>Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.c4biz.hawdev.model.organization.impl.UnitTypeImpl
	 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__ID = CommonPackage.ABS_DESCRIBED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__NAME = CommonPackage.ABS_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__DESCRIPTION = CommonPackage.ABS_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_FEATURE_COUNT = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.c4biz.hawdev.model.organization.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.c4biz.hawdev.model.organization.impl.RoleImpl
	 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = CommonPackage.ABS_DESCRIBED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = CommonPackage.ABS_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = CommonPackage.ABS_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ORGANIZATION = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.c4biz.hawdev.model.organization.impl.PhoneImpl <em>Phone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.c4biz.hawdev.model.organization.impl.PhoneImpl
	 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getPhone()
	 * @generated
	 */
	int PHONE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__ID = CommonPackage.ABS_IDENTIFIED_CLASS__ID;

	/**
	 * The number of structural features of the '<em>Phone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FEATURE_COUNT = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.c4biz.hawdev.model.organization.PhoneType <em>Phone Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.c4biz.hawdev.model.organization.PhoneType
	 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getPhoneType()
	 * @generated
	 */
	int PHONE_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link com.c4biz.hawdev.model.organization.KnowledgeContainerOrganization <em>Knowledge Container Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Container Organization</em>'.
	 * @see com.c4biz.hawdev.model.organization.KnowledgeContainerOrganization
	 * @generated
	 */
	EClass getKnowledgeContainerOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link com.c4biz.hawdev.model.organization.KnowledgeContainerOrganization#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizations</em>'.
	 * @see com.c4biz.hawdev.model.organization.KnowledgeContainerOrganization#getOrganizations()
	 * @see #getKnowledgeContainerOrganization()
	 * @generated
	 */
	EReference getKnowledgeContainerOrganization_Organizations();

	/**
	 * Returns the meta object for class '{@link com.c4biz.hawdev.model.organization.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see com.c4biz.hawdev.model.organization.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link com.c4biz.hawdev.model.organization.Organization#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see com.c4biz.hawdev.model.organization.Organization#getUnits()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Units();

	/**
	 * Returns the meta object for the containment reference list '{@link com.c4biz.hawdev.model.organization.Organization#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see com.c4biz.hawdev.model.organization.Organization#getPersons()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Persons();

	/**
	 * Returns the meta object for the containment reference list '{@link com.c4biz.hawdev.model.organization.Organization#getWorkers <em>Workers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workers</em>'.
	 * @see com.c4biz.hawdev.model.organization.Organization#getWorkers()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Workers();

	/**
	 * Returns the meta object for the containment reference list '{@link com.c4biz.hawdev.model.organization.Organization#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see com.c4biz.hawdev.model.organization.Organization#getRoles()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Roles();

	/**
	 * Returns the meta object for the reference list '{@link com.c4biz.hawdev.model.organization.Organization#getPartners <em>Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Partners</em>'.
	 * @see com.c4biz.hawdev.model.organization.Organization#getPartners()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Partners();

	/**
	 * Returns the meta object for the reference '{@link com.c4biz.hawdev.model.organization.Organization#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact</em>'.
	 * @see com.c4biz.hawdev.model.organization.Organization#getContact()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Contact();

	/**
	 * Returns the meta object for the containment reference list '{@link com.c4biz.hawdev.model.organization.Organization#getUnitTypes <em>Unit Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Types</em>'.
	 * @see com.c4biz.hawdev.model.organization.Organization#getUnitTypes()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_UnitTypes();

	/**
	 * Returns the meta object for class '{@link com.c4biz.hawdev.model.organization.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see com.c4biz.hawdev.model.organization.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the container reference '{@link com.c4biz.hawdev.model.organization.Unit#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
	 * @see com.c4biz.hawdev.model.organization.Unit#getOrganization()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Organization();

	/**
	 * Returns the meta object for the container reference '{@link com.c4biz.hawdev.model.organization.Unit#getParentUnit <em>Parent Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Unit</em>'.
	 * @see com.c4biz.hawdev.model.organization.Unit#getParentUnit()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_ParentUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.c4biz.hawdev.model.organization.Unit#getSubUnits <em>Sub Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Units</em>'.
	 * @see com.c4biz.hawdev.model.organization.Unit#getSubUnits()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_SubUnits();

	/**
	 * Returns the meta object for the reference '{@link com.c4biz.hawdev.model.organization.Unit#getUnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit Type</em>'.
	 * @see com.c4biz.hawdev.model.organization.Unit#getUnitType()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_UnitType();

	/**
	 * Returns the meta object for class '{@link com.c4biz.hawdev.model.organization.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see com.c4biz.hawdev.model.organization.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the container reference '{@link com.c4biz.hawdev.model.organization.Person#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
	 * @see com.c4biz.hawdev.model.organization.Person#getOrganization()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Organization();

	/**
	 * Returns the meta object for the attribute '{@link com.c4biz.hawdev.model.organization.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see com.c4biz.hawdev.model.organization.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for class '{@link com.c4biz.hawdev.model.organization.Worker <em>Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worker</em>'.
	 * @see com.c4biz.hawdev.model.organization.Worker
	 * @generated
	 */
	EClass getWorker();

	/**
	 * Returns the meta object for the container reference '{@link com.c4biz.hawdev.model.organization.Worker#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
	 * @see com.c4biz.hawdev.model.organization.Worker#getOrganization()
	 * @see #getWorker()
	 * @generated
	 */
	EReference getWorker_Organization();

	/**
	 * Returns the meta object for the reference '{@link com.c4biz.hawdev.model.organization.Worker#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see com.c4biz.hawdev.model.organization.Worker#getPerson()
	 * @see #getWorker()
	 * @generated
	 */
	EReference getWorker_Person();

	/**
	 * Returns the meta object for the reference '{@link com.c4biz.hawdev.model.organization.Worker#getAllocationUnit <em>Allocation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation Unit</em>'.
	 * @see com.c4biz.hawdev.model.organization.Worker#getAllocationUnit()
	 * @see #getWorker()
	 * @generated
	 */
	EReference getWorker_AllocationUnit();

	/**
	 * Returns the meta object for the reference list '{@link com.c4biz.hawdev.model.organization.Worker#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see com.c4biz.hawdev.model.organization.Worker#getRoles()
	 * @see #getWorker()
	 * @generated
	 */
	EReference getWorker_Roles();

	/**
	 * Returns the meta object for class '{@link com.c4biz.hawdev.model.organization.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Type</em>'.
	 * @see com.c4biz.hawdev.model.organization.UnitType
	 * @generated
	 */
	EClass getUnitType();

	/**
	 * Returns the meta object for class '{@link com.c4biz.hawdev.model.organization.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see com.c4biz.hawdev.model.organization.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the container reference '{@link com.c4biz.hawdev.model.organization.Role#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
	 * @see com.c4biz.hawdev.model.organization.Role#getOrganization()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Organization();

	/**
	 * Returns the meta object for class '{@link com.c4biz.hawdev.model.organization.Phone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone</em>'.
	 * @see com.c4biz.hawdev.model.organization.Phone
	 * @generated
	 */
	EClass getPhone();

	/**
	 * Returns the meta object for enum '{@link com.c4biz.hawdev.model.organization.PhoneType <em>Phone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Phone Type</em>'.
	 * @see com.c4biz.hawdev.model.organization.PhoneType
	 * @generated
	 */
	EEnum getPhoneType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrganizationFactory getOrganizationFactory();

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
		 * The meta object literal for the '{@link com.c4biz.hawdev.model.organization.impl.KnowledgeContainerOrganizationImpl <em>Knowledge Container Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.c4biz.hawdev.model.organization.impl.KnowledgeContainerOrganizationImpl
		 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getKnowledgeContainerOrganization()
		 * @generated
		 */
		EClass KNOWLEDGE_CONTAINER_ORGANIZATION = eINSTANCE.getKnowledgeContainerOrganization();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_CONTAINER_ORGANIZATION__ORGANIZATIONS = eINSTANCE.getKnowledgeContainerOrganization_Organizations();

		/**
		 * The meta object literal for the '{@link com.c4biz.hawdev.model.organization.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.c4biz.hawdev.model.organization.impl.OrganizationImpl
		 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__UNITS = eINSTANCE.getOrganization_Units();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__PERSONS = eINSTANCE.getOrganization_Persons();

		/**
		 * The meta object literal for the '<em><b>Workers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__WORKERS = eINSTANCE.getOrganization_Workers();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__ROLES = eINSTANCE.getOrganization_Roles();

		/**
		 * The meta object literal for the '<em><b>Partners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__PARTNERS = eINSTANCE.getOrganization_Partners();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__CONTACT = eINSTANCE.getOrganization_Contact();

		/**
		 * The meta object literal for the '<em><b>Unit Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__UNIT_TYPES = eINSTANCE.getOrganization_UnitTypes();

		/**
		 * The meta object literal for the '{@link com.c4biz.hawdev.model.organization.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.c4biz.hawdev.model.organization.impl.UnitImpl
		 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__ORGANIZATION = eINSTANCE.getUnit_Organization();

		/**
		 * The meta object literal for the '<em><b>Parent Unit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__PARENT_UNIT = eINSTANCE.getUnit_ParentUnit();

		/**
		 * The meta object literal for the '<em><b>Sub Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__SUB_UNITS = eINSTANCE.getUnit_SubUnits();

		/**
		 * The meta object literal for the '<em><b>Unit Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__UNIT_TYPE = eINSTANCE.getUnit_UnitType();

		/**
		 * The meta object literal for the '{@link com.c4biz.hawdev.model.organization.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.c4biz.hawdev.model.organization.impl.PersonImpl
		 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ORGANIZATION = eINSTANCE.getPerson_Organization();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '{@link com.c4biz.hawdev.model.organization.impl.WorkerImpl <em>Worker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.c4biz.hawdev.model.organization.impl.WorkerImpl
		 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getWorker()
		 * @generated
		 */
		EClass WORKER = eINSTANCE.getWorker();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER__ORGANIZATION = eINSTANCE.getWorker_Organization();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER__PERSON = eINSTANCE.getWorker_Person();

		/**
		 * The meta object literal for the '<em><b>Allocation Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER__ALLOCATION_UNIT = eINSTANCE.getWorker_AllocationUnit();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER__ROLES = eINSTANCE.getWorker_Roles();

		/**
		 * The meta object literal for the '{@link com.c4biz.hawdev.model.organization.impl.UnitTypeImpl <em>Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.c4biz.hawdev.model.organization.impl.UnitTypeImpl
		 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getUnitType()
		 * @generated
		 */
		EClass UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '{@link com.c4biz.hawdev.model.organization.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.c4biz.hawdev.model.organization.impl.RoleImpl
		 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ORGANIZATION = eINSTANCE.getRole_Organization();

		/**
		 * The meta object literal for the '{@link com.c4biz.hawdev.model.organization.impl.PhoneImpl <em>Phone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.c4biz.hawdev.model.organization.impl.PhoneImpl
		 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getPhone()
		 * @generated
		 */
		EClass PHONE = eINSTANCE.getPhone();

		/**
		 * The meta object literal for the '{@link com.c4biz.hawdev.model.organization.PhoneType <em>Phone Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.c4biz.hawdev.model.organization.PhoneType
		 * @see com.c4biz.hawdev.model.organization.impl.OrganizationPackageImpl#getPhoneType()
		 * @generated
		 */
		EEnum PHONE_TYPE = eINSTANCE.getPhoneType();

	}

} //OrganizationPackage
