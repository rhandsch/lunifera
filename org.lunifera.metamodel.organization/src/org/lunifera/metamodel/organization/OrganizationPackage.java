/**
 */
package org.lunifera.metamodel.organization;

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
 * @see org.lunifera.metamodel.organization.OrganizationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.lunifera.metamodel'"
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
	String eNS_URI = "http://lunifera.org/metamodel/1.0/Organization";

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
	OrganizationPackage eINSTANCE = org.lunifera.metamodel.organization.impl.OrganizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.organization.impl.KnowledgeContainerOrganizationImpl <em>Knowledge Container Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.organization.impl.KnowledgeContainerOrganizationImpl
	 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getKnowledgeContainerOrganization()
	 * @generated
	 */
	int KNOWLEDGE_CONTAINER_ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_ORGANIZATION__ORGANIZATIONS = 0;

	/**
	 * The number of structural features of the '<em>Knowledge Container Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_ORGANIZATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.organization.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.organization.impl.OrganizationImpl
	 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__UNITS = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PERSONS = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Workers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__WORKERS = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ROLES = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Partners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PARTNERS = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Main Contact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MAIN_CONTACT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unit Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__UNIT_TYPES = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Security Realms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__SECURITY_REALMS = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.organization.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.organization.impl.UnitImpl
	 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = CommonPackage.ABSTRACT_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__ORGANIZATION = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__PARENT_UNIT = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__SUB_UNITS = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__UNIT_TYPE = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.organization.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.organization.impl.PersonImpl
	 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = CommonPackage.ABSTRACT_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ORGANIZATION = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = CommonPackage.ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.organization.impl.WorkerImpl <em>Worker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.organization.impl.WorkerImpl
	 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getWorker()
	 * @generated
	 */
	int WORKER = 4;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__ORGANIZATION = CommonPackage.ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__PERSON = CommonPackage.ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allocation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__ALLOCATION_UNIT = CommonPackage.ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__ROLES = CommonPackage.ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Worker Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__WORKER_TYPE = CommonPackage.ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Worker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_FEATURE_COUNT = CommonPackage.ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.organization.impl.WorkerTypeImpl <em>Worker Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.organization.impl.WorkerTypeImpl
	 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getWorkerType()
	 * @generated
	 */
	int WORKER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_TYPE__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_TYPE__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Worker Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_TYPE_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.organization.impl.UnitTypeImpl <em>Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.organization.impl.UnitTypeImpl
	 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.organization.impl.BusinessRoleImpl <em>Business Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.organization.impl.BusinessRoleImpl
	 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getBusinessRole()
	 * @generated
	 */
	int BUSINESS_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__ORGANIZATION = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__WORKERS = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__PERMISSIONS = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Business Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.organization.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.organization.impl.PermissionImpl
	 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__ORGANIZATION = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__WORKERS = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.organization.impl.SecurityRealmImpl <em>Security Realm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.organization.impl.SecurityRealmImpl
	 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getSecurityRealm()
	 * @generated
	 */
	int SECURITY_REALM = 9;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REALM__PERMISSIONS = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REALM__ACTIVE = 1;

	/**
	 * The number of structural features of the '<em>Security Realm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REALM_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.organization.KnowledgeContainerOrganization <em>Knowledge Container Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Container Organization</em>'.
	 * @see org.lunifera.metamodel.organization.KnowledgeContainerOrganization
	 * @generated
	 */
	EClass getKnowledgeContainerOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.organization.KnowledgeContainerOrganization#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizations</em>'.
	 * @see org.lunifera.metamodel.organization.KnowledgeContainerOrganization#getOrganizations()
	 * @see #getKnowledgeContainerOrganization()
	 * @generated
	 */
	EReference getKnowledgeContainerOrganization_Organizations();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.organization.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.lunifera.metamodel.organization.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.organization.Organization#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see org.lunifera.metamodel.organization.Organization#getUnits()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Units();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.organization.Organization#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see org.lunifera.metamodel.organization.Organization#getPersons()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Persons();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.organization.Organization#getWorkers <em>Workers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workers</em>'.
	 * @see org.lunifera.metamodel.organization.Organization#getWorkers()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Workers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.organization.Organization#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.lunifera.metamodel.organization.Organization#getRoles()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Roles();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.metamodel.organization.Organization#getPartners <em>Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Partners</em>'.
	 * @see org.lunifera.metamodel.organization.Organization#getPartners()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Partners();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.organization.Organization#getMainContact <em>Main Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Contact</em>'.
	 * @see org.lunifera.metamodel.organization.Organization#getMainContact()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_MainContact();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.organization.Organization#getUnitTypes <em>Unit Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Types</em>'.
	 * @see org.lunifera.metamodel.organization.Organization#getUnitTypes()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_UnitTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.organization.Organization#getSecurityRealms <em>Security Realms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Realms</em>'.
	 * @see org.lunifera.metamodel.organization.Organization#getSecurityRealms()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_SecurityRealms();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.organization.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see org.lunifera.metamodel.organization.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.metamodel.organization.Unit#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
	 * @see org.lunifera.metamodel.organization.Unit#getOrganization()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Organization();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.metamodel.organization.Unit#getParentUnit <em>Parent Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Unit</em>'.
	 * @see org.lunifera.metamodel.organization.Unit#getParentUnit()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_ParentUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.organization.Unit#getSubUnits <em>Sub Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Units</em>'.
	 * @see org.lunifera.metamodel.organization.Unit#getSubUnits()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_SubUnits();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.organization.Unit#getUnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit Type</em>'.
	 * @see org.lunifera.metamodel.organization.Unit#getUnitType()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_UnitType();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.organization.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.lunifera.metamodel.organization.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.metamodel.organization.Person#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
	 * @see org.lunifera.metamodel.organization.Person#getOrganization()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Organization();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.organization.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.lunifera.metamodel.organization.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.organization.Worker <em>Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worker</em>'.
	 * @see org.lunifera.metamodel.organization.Worker
	 * @generated
	 */
	EClass getWorker();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.metamodel.organization.Worker#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
	 * @see org.lunifera.metamodel.organization.Worker#getOrganization()
	 * @see #getWorker()
	 * @generated
	 */
	EReference getWorker_Organization();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.organization.Worker#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see org.lunifera.metamodel.organization.Worker#getPerson()
	 * @see #getWorker()
	 * @generated
	 */
	EReference getWorker_Person();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.organization.Worker#getAllocationUnit <em>Allocation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation Unit</em>'.
	 * @see org.lunifera.metamodel.organization.Worker#getAllocationUnit()
	 * @see #getWorker()
	 * @generated
	 */
	EReference getWorker_AllocationUnit();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.metamodel.organization.Worker#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see org.lunifera.metamodel.organization.Worker#getRoles()
	 * @see #getWorker()
	 * @generated
	 */
	EReference getWorker_Roles();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.organization.Worker#getWorkerType <em>Worker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Worker Type</em>'.
	 * @see org.lunifera.metamodel.organization.Worker#getWorkerType()
	 * @see #getWorker()
	 * @generated
	 */
	EReference getWorker_WorkerType();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.organization.WorkerType <em>Worker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worker Type</em>'.
	 * @see org.lunifera.metamodel.organization.WorkerType
	 * @generated
	 */
	EClass getWorkerType();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.organization.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Type</em>'.
	 * @see org.lunifera.metamodel.organization.UnitType
	 * @generated
	 */
	EClass getUnitType();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.organization.BusinessRole <em>Business Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Role</em>'.
	 * @see org.lunifera.metamodel.organization.BusinessRole
	 * @generated
	 */
	EClass getBusinessRole();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.metamodel.organization.BusinessRole#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
	 * @see org.lunifera.metamodel.organization.BusinessRole#getOrganization()
	 * @see #getBusinessRole()
	 * @generated
	 */
	EReference getBusinessRole_Organization();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.metamodel.organization.BusinessRole#getWorkers <em>Workers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workers</em>'.
	 * @see org.lunifera.metamodel.organization.BusinessRole#getWorkers()
	 * @see #getBusinessRole()
	 * @generated
	 */
	EReference getBusinessRole_Workers();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.metamodel.organization.BusinessRole#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permissions</em>'.
	 * @see org.lunifera.metamodel.organization.BusinessRole#getPermissions()
	 * @see #getBusinessRole()
	 * @generated
	 */
	EReference getBusinessRole_Permissions();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.organization.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see org.lunifera.metamodel.organization.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.organization.Permission#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization</em>'.
	 * @see org.lunifera.metamodel.organization.Permission#getOrganization()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Organization();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.metamodel.organization.Permission#getWorkers <em>Workers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workers</em>'.
	 * @see org.lunifera.metamodel.organization.Permission#getWorkers()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Workers();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.organization.SecurityRealm <em>Security Realm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Realm</em>'.
	 * @see org.lunifera.metamodel.organization.SecurityRealm
	 * @generated
	 */
	EClass getSecurityRealm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.organization.SecurityRealm#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see org.lunifera.metamodel.organization.SecurityRealm#getPermissions()
	 * @see #getSecurityRealm()
	 * @generated
	 */
	EReference getSecurityRealm_Permissions();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.organization.SecurityRealm#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.lunifera.metamodel.organization.SecurityRealm#isActive()
	 * @see #getSecurityRealm()
	 * @generated
	 */
	EAttribute getSecurityRealm_Active();

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
		 * The meta object literal for the '{@link org.lunifera.metamodel.organization.impl.KnowledgeContainerOrganizationImpl <em>Knowledge Container Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.organization.impl.KnowledgeContainerOrganizationImpl
		 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getKnowledgeContainerOrganization()
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
		 * The meta object literal for the '{@link org.lunifera.metamodel.organization.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.organization.impl.OrganizationImpl
		 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getOrganization()
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
		 * The meta object literal for the '<em><b>Main Contact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__MAIN_CONTACT = eINSTANCE.getOrganization_MainContact();

		/**
		 * The meta object literal for the '<em><b>Unit Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__UNIT_TYPES = eINSTANCE.getOrganization_UnitTypes();

		/**
		 * The meta object literal for the '<em><b>Security Realms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__SECURITY_REALMS = eINSTANCE.getOrganization_SecurityRealms();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.organization.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.organization.impl.UnitImpl
		 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getUnit()
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
		 * The meta object literal for the '{@link org.lunifera.metamodel.organization.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.organization.impl.PersonImpl
		 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getPerson()
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
		 * The meta object literal for the '{@link org.lunifera.metamodel.organization.impl.WorkerImpl <em>Worker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.organization.impl.WorkerImpl
		 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getWorker()
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
		 * The meta object literal for the '<em><b>Worker Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER__WORKER_TYPE = eINSTANCE.getWorker_WorkerType();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.organization.impl.WorkerTypeImpl <em>Worker Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.organization.impl.WorkerTypeImpl
		 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getWorkerType()
		 * @generated
		 */
		EClass WORKER_TYPE = eINSTANCE.getWorkerType();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.organization.impl.UnitTypeImpl <em>Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.organization.impl.UnitTypeImpl
		 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getUnitType()
		 * @generated
		 */
		EClass UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.organization.impl.BusinessRoleImpl <em>Business Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.organization.impl.BusinessRoleImpl
		 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getBusinessRole()
		 * @generated
		 */
		EClass BUSINESS_ROLE = eINSTANCE.getBusinessRole();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ROLE__ORGANIZATION = eINSTANCE.getBusinessRole_Organization();

		/**
		 * The meta object literal for the '<em><b>Workers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ROLE__WORKERS = eINSTANCE.getBusinessRole_Workers();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ROLE__PERMISSIONS = eINSTANCE.getBusinessRole_Permissions();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.organization.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.organization.impl.PermissionImpl
		 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__ORGANIZATION = eINSTANCE.getPermission_Organization();

		/**
		 * The meta object literal for the '<em><b>Workers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__WORKERS = eINSTANCE.getPermission_Workers();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.organization.impl.SecurityRealmImpl <em>Security Realm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.organization.impl.SecurityRealmImpl
		 * @see org.lunifera.metamodel.organization.impl.OrganizationPackageImpl#getSecurityRealm()
		 * @generated
		 */
		EClass SECURITY_REALM = eINSTANCE.getSecurityRealm();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_REALM__PERMISSIONS = eINSTANCE.getSecurityRealm_Permissions();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_REALM__ACTIVE = eINSTANCE.getSecurityRealm_Active();

	}

} //OrganizationPackage
