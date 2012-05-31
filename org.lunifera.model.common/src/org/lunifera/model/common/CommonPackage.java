/**
 */
package org.lunifera.model.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.lunifera.model.common.CommonFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.lunifera.model'"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lunifera.org/model/1.0/Common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = org.lunifera.model.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.impl.AbsIdentifiedClassImpl <em>Abs Identified Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.impl.AbsIdentifiedClassImpl
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getAbsIdentifiedClass()
	 * @generated
	 */
	int ABS_IDENTIFIED_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_IDENTIFIED_CLASS__ID = 0;

	/**
	 * The number of structural features of the '<em>Abs Identified Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_IDENTIFIED_CLASS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.impl.AbsNamedClassImpl <em>Abs Named Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.impl.AbsNamedClassImpl
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getAbsNamedClass()
	 * @generated
	 */
	int ABS_NAMED_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_NAMED_CLASS__ID = ABS_IDENTIFIED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_NAMED_CLASS__NAME = ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abs Named Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_NAMED_CLASS_FEATURE_COUNT = ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.impl.AbsDescribedClassImpl <em>Abs Described Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.impl.AbsDescribedClassImpl
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getAbsDescribedClass()
	 * @generated
	 */
	int ABS_DESCRIBED_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_DESCRIBED_CLASS__ID = ABS_NAMED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_DESCRIBED_CLASS__NAME = ABS_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_DESCRIBED_CLASS__DESCRIPTION = ABS_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abs Described Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_DESCRIBED_CLASS_FEATURE_COUNT = ABS_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.impl.AbsProjectContainerImpl <em>Abs Project Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.impl.AbsProjectContainerImpl
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getAbsProjectContainer()
	 * @generated
	 */
	int ABS_PROJECT_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_PROJECT_CONTAINER__ID = ABS_DESCRIBED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_PROJECT_CONTAINER__NAME = ABS_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_PROJECT_CONTAINER__DESCRIPTION = ABS_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_PROJECT_CONTAINER__IMPORTS = ABS_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jdt URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_PROJECT_CONTAINER__JDT_URI = ABS_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_PROJECT_CONTAINER__CREATED_BY = ABS_DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Knowledge Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_PROJECT_CONTAINER__KNOWLEDGE_CONTAINERS = ABS_DESCRIBED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abs Project Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_PROJECT_CONTAINER_FEATURE_COUNT = ABS_DESCRIBED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.impl.AbsKnowledgeContainerImpl <em>Abs Knowledge Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.impl.AbsKnowledgeContainerImpl
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getAbsKnowledgeContainer()
	 * @generated
	 */
	int ABS_KNOWLEDGE_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_KNOWLEDGE_CONTAINER__ID = ABS_DESCRIBED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_KNOWLEDGE_CONTAINER__NAME = ABS_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_KNOWLEDGE_CONTAINER__DESCRIPTION = ABS_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Last Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_KNOWLEDGE_CONTAINER__LAST_MODIFICATION = ABS_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_KNOWLEDGE_CONTAINER__CREATION_DATE = ABS_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Project Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER = ABS_DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abs Knowledge Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_KNOWLEDGE_CONTAINER_FEATURE_COUNT = ABS_DESCRIBED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.impl.ImportImpl
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ID = ABS_IDENTIFIED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Import Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_TEXT = ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.impl.EmailImpl <em>Email</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.impl.EmailImpl
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getEmail()
	 * @generated
	 */
	int EMAIL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__ID = ABS_IDENTIFIED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__EMAIL = ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__TYPE = ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FEATURE_COUNT = ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.impl.PhoneImpl <em>Phone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.impl.PhoneImpl
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getPhone()
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
	int PHONE__ID = ABS_IDENTIFIED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__TYPE = ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__NUMBER = ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Company</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__COMPANY = ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__REGION_CODE = ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__COUNTRY = ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Phone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FEATURE_COUNT = ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.impl.PhoneCompanyImpl <em>Phone Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.impl.PhoneCompanyImpl
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getPhoneCompany()
	 * @generated
	 */
	int PHONE_COMPANY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_COMPANY__ID = ABS_NAMED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_COMPANY__NAME = ABS_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_COMPANY__CODE = ABS_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_COMPANY__COUNTRY = ABS_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Phone Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_COMPANY_FEATURE_COUNT = ABS_NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.impl.CountryImpl
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__ID = ABS_NAMED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = ABS_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__STATES = ABS_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phone Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__PHONE_CODE = ABS_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = ABS_NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.impl.CityImpl
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__ID = ABS_NAMED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = ABS_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__STATE = ABS_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = ABS_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.impl.StateImpl
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getState()
	 * @generated
	 */
	int STATE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = ABS_NAMED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = ABS_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Country</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__COUNTRY = ABS_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CITIES = ABS_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CODE = ABS_NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = ABS_NAMED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.impl.AddressImpl
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ID = ABS_NAMED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__NAME = ABS_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = ABS_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = ABS_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STATE = ABS_NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = ABS_NAMED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__NUMBER = ABS_NAMED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Complements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COMPLEMENTS = ABS_NAMED_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TYPE = ABS_NAMED_CLASS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = ABS_NAMED_CLASS_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.EmailType <em>Email Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.EmailType
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getEmailType()
	 * @generated
	 */
	int EMAIL_TYPE = 13;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.PhoneType <em>Phone Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.PhoneType
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getPhoneType()
	 * @generated
	 */
	int PHONE_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.lunifera.model.common.AddressType <em>Address Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.common.AddressType
	 * @see org.lunifera.model.common.impl.CommonPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link org.lunifera.model.common.AbsIdentifiedClass <em>Abs Identified Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs Identified Class</em>'.
	 * @see org.lunifera.model.common.AbsIdentifiedClass
	 * @generated
	 */
	EClass getAbsIdentifiedClass();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.AbsIdentifiedClass#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.lunifera.model.common.AbsIdentifiedClass#getId()
	 * @see #getAbsIdentifiedClass()
	 * @generated
	 */
	EAttribute getAbsIdentifiedClass_Id();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.common.AbsNamedClass <em>Abs Named Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs Named Class</em>'.
	 * @see org.lunifera.model.common.AbsNamedClass
	 * @generated
	 */
	EClass getAbsNamedClass();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.AbsNamedClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.model.common.AbsNamedClass#getName()
	 * @see #getAbsNamedClass()
	 * @generated
	 */
	EAttribute getAbsNamedClass_Name();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.common.AbsDescribedClass <em>Abs Described Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs Described Class</em>'.
	 * @see org.lunifera.model.common.AbsDescribedClass
	 * @generated
	 */
	EClass getAbsDescribedClass();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.AbsDescribedClass#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.lunifera.model.common.AbsDescribedClass#getDescription()
	 * @see #getAbsDescribedClass()
	 * @generated
	 */
	EAttribute getAbsDescribedClass_Description();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.common.AbsProjectContainer <em>Abs Project Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs Project Container</em>'.
	 * @see org.lunifera.model.common.AbsProjectContainer
	 * @generated
	 */
	EClass getAbsProjectContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.model.common.AbsProjectContainer#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.lunifera.model.common.AbsProjectContainer#getImports()
	 * @see #getAbsProjectContainer()
	 * @generated
	 */
	EReference getAbsProjectContainer_Imports();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.AbsProjectContainer#getJdtURI <em>Jdt URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdt URI</em>'.
	 * @see org.lunifera.model.common.AbsProjectContainer#getJdtURI()
	 * @see #getAbsProjectContainer()
	 * @generated
	 */
	EAttribute getAbsProjectContainer_JdtURI();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.AbsProjectContainer#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By</em>'.
	 * @see org.lunifera.model.common.AbsProjectContainer#getCreatedBy()
	 * @see #getAbsProjectContainer()
	 * @generated
	 */
	EAttribute getAbsProjectContainer_CreatedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.model.common.AbsProjectContainer#getKnowledgeContainers <em>Knowledge Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Knowledge Containers</em>'.
	 * @see org.lunifera.model.common.AbsProjectContainer#getKnowledgeContainers()
	 * @see #getAbsProjectContainer()
	 * @generated
	 */
	EReference getAbsProjectContainer_KnowledgeContainers();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.common.AbsKnowledgeContainer <em>Abs Knowledge Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs Knowledge Container</em>'.
	 * @see org.lunifera.model.common.AbsKnowledgeContainer
	 * @generated
	 */
	EClass getAbsKnowledgeContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.AbsKnowledgeContainer#getLastModification <em>Last Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modification</em>'.
	 * @see org.lunifera.model.common.AbsKnowledgeContainer#getLastModification()
	 * @see #getAbsKnowledgeContainer()
	 * @generated
	 */
	EAttribute getAbsKnowledgeContainer_LastModification();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.AbsKnowledgeContainer#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.lunifera.model.common.AbsKnowledgeContainer#getCreationDate()
	 * @see #getAbsKnowledgeContainer()
	 * @generated
	 */
	EAttribute getAbsKnowledgeContainer_CreationDate();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.model.common.AbsKnowledgeContainer#getProjectContainer <em>Project Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project Container</em>'.
	 * @see org.lunifera.model.common.AbsKnowledgeContainer#getProjectContainer()
	 * @see #getAbsKnowledgeContainer()
	 * @generated
	 */
	EReference getAbsKnowledgeContainer_ProjectContainer();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.common.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.lunifera.model.common.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.Import#getImportText <em>Import Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Text</em>'.
	 * @see org.lunifera.model.common.Import#getImportText()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportText();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.common.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email</em>'.
	 * @see org.lunifera.model.common.Email
	 * @generated
	 */
	EClass getEmail();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.Email#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.lunifera.model.common.Email#getEmail()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.Email#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.model.common.Email#getType()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Type();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.common.Phone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone</em>'.
	 * @see org.lunifera.model.common.Phone
	 * @generated
	 */
	EClass getPhone();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.Phone#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.model.common.Phone#getType()
	 * @see #getPhone()
	 * @generated
	 */
	EAttribute getPhone_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.Phone#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.lunifera.model.common.Phone#getNumber()
	 * @see #getPhone()
	 * @generated
	 */
	EAttribute getPhone_Number();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.model.common.Phone#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Company</em>'.
	 * @see org.lunifera.model.common.Phone#getCompany()
	 * @see #getPhone()
	 * @generated
	 */
	EReference getPhone_Company();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.Phone#getRegionCode <em>Region Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Code</em>'.
	 * @see org.lunifera.model.common.Phone#getRegionCode()
	 * @see #getPhone()
	 * @generated
	 */
	EAttribute getPhone_RegionCode();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.model.common.Phone#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see org.lunifera.model.common.Phone#getCountry()
	 * @see #getPhone()
	 * @generated
	 */
	EReference getPhone_Country();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.common.PhoneCompany <em>Phone Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone Company</em>'.
	 * @see org.lunifera.model.common.PhoneCompany
	 * @generated
	 */
	EClass getPhoneCompany();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.PhoneCompany#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.lunifera.model.common.PhoneCompany#getCode()
	 * @see #getPhoneCompany()
	 * @generated
	 */
	EAttribute getPhoneCompany_Code();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.model.common.PhoneCompany#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see org.lunifera.model.common.PhoneCompany#getCountry()
	 * @see #getPhoneCompany()
	 * @generated
	 */
	EReference getPhoneCompany_Country();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.common.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see org.lunifera.model.common.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.model.common.Country#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.lunifera.model.common.Country#getStates()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_States();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.Country#getPhoneCode <em>Phone Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Code</em>'.
	 * @see org.lunifera.model.common.Country#getPhoneCode()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_PhoneCode();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.common.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see org.lunifera.model.common.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.model.common.City#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see org.lunifera.model.common.City#getState()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_State();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.common.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.lunifera.model.common.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.model.common.State#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Country</em>'.
	 * @see org.lunifera.model.common.State#getCountry()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Country();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.model.common.State#getCities <em>Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cities</em>'.
	 * @see org.lunifera.model.common.State#getCities()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Cities();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.State#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.lunifera.model.common.State#getCode()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Code();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.common.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.lunifera.model.common.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.lunifera.model.common.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.model.common.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City</em>'.
	 * @see org.lunifera.model.common.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_City();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.model.common.Address#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.lunifera.model.common.Address#getState()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_State();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.model.common.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see org.lunifera.model.common.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.Address#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.lunifera.model.common.Address#getNumber()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.Address#getComplements <em>Complements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complements</em>'.
	 * @see org.lunifera.model.common.Address#getComplements()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Complements();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.common.Address#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.model.common.Address#getType()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Type();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.model.common.EmailType <em>Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Email Type</em>'.
	 * @see org.lunifera.model.common.EmailType
	 * @generated
	 */
	EEnum getEmailType();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.model.common.PhoneType <em>Phone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Phone Type</em>'.
	 * @see org.lunifera.model.common.PhoneType
	 * @generated
	 */
	EEnum getPhoneType();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.model.common.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Address Type</em>'.
	 * @see org.lunifera.model.common.AddressType
	 * @generated
	 */
	EEnum getAddressType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

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
		 * The meta object literal for the '{@link org.lunifera.model.common.impl.AbsIdentifiedClassImpl <em>Abs Identified Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.impl.AbsIdentifiedClassImpl
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getAbsIdentifiedClass()
		 * @generated
		 */
		EClass ABS_IDENTIFIED_CLASS = eINSTANCE.getAbsIdentifiedClass();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABS_IDENTIFIED_CLASS__ID = eINSTANCE.getAbsIdentifiedClass_Id();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.impl.AbsNamedClassImpl <em>Abs Named Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.impl.AbsNamedClassImpl
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getAbsNamedClass()
		 * @generated
		 */
		EClass ABS_NAMED_CLASS = eINSTANCE.getAbsNamedClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABS_NAMED_CLASS__NAME = eINSTANCE.getAbsNamedClass_Name();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.impl.AbsDescribedClassImpl <em>Abs Described Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.impl.AbsDescribedClassImpl
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getAbsDescribedClass()
		 * @generated
		 */
		EClass ABS_DESCRIBED_CLASS = eINSTANCE.getAbsDescribedClass();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABS_DESCRIBED_CLASS__DESCRIPTION = eINSTANCE.getAbsDescribedClass_Description();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.impl.AbsProjectContainerImpl <em>Abs Project Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.impl.AbsProjectContainerImpl
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getAbsProjectContainer()
		 * @generated
		 */
		EClass ABS_PROJECT_CONTAINER = eINSTANCE.getAbsProjectContainer();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_PROJECT_CONTAINER__IMPORTS = eINSTANCE.getAbsProjectContainer_Imports();

		/**
		 * The meta object literal for the '<em><b>Jdt URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABS_PROJECT_CONTAINER__JDT_URI = eINSTANCE.getAbsProjectContainer_JdtURI();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABS_PROJECT_CONTAINER__CREATED_BY = eINSTANCE.getAbsProjectContainer_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Knowledge Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_PROJECT_CONTAINER__KNOWLEDGE_CONTAINERS = eINSTANCE.getAbsProjectContainer_KnowledgeContainers();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.impl.AbsKnowledgeContainerImpl <em>Abs Knowledge Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.impl.AbsKnowledgeContainerImpl
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getAbsKnowledgeContainer()
		 * @generated
		 */
		EClass ABS_KNOWLEDGE_CONTAINER = eINSTANCE.getAbsKnowledgeContainer();

		/**
		 * The meta object literal for the '<em><b>Last Modification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABS_KNOWLEDGE_CONTAINER__LAST_MODIFICATION = eINSTANCE.getAbsKnowledgeContainer_LastModification();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABS_KNOWLEDGE_CONTAINER__CREATION_DATE = eINSTANCE.getAbsKnowledgeContainer_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Project Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER = eINSTANCE.getAbsKnowledgeContainer_ProjectContainer();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.impl.ImportImpl
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_TEXT = eINSTANCE.getImport_ImportText();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.impl.EmailImpl <em>Email</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.impl.EmailImpl
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getEmail()
		 * @generated
		 */
		EClass EMAIL = eINSTANCE.getEmail();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__EMAIL = eINSTANCE.getEmail_Email();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__TYPE = eINSTANCE.getEmail_Type();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.impl.PhoneImpl <em>Phone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.impl.PhoneImpl
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getPhone()
		 * @generated
		 */
		EClass PHONE = eINSTANCE.getPhone();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE__TYPE = eINSTANCE.getPhone_Type();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE__NUMBER = eINSTANCE.getPhone_Number();

		/**
		 * The meta object literal for the '<em><b>Company</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHONE__COMPANY = eINSTANCE.getPhone_Company();

		/**
		 * The meta object literal for the '<em><b>Region Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE__REGION_CODE = eINSTANCE.getPhone_RegionCode();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHONE__COUNTRY = eINSTANCE.getPhone_Country();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.impl.PhoneCompanyImpl <em>Phone Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.impl.PhoneCompanyImpl
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getPhoneCompany()
		 * @generated
		 */
		EClass PHONE_COMPANY = eINSTANCE.getPhoneCompany();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE_COMPANY__CODE = eINSTANCE.getPhoneCompany_Code();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHONE_COMPANY__COUNTRY = eINSTANCE.getPhoneCompany_Country();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.impl.CountryImpl
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__STATES = eINSTANCE.getCountry_States();

		/**
		 * The meta object literal for the '<em><b>Phone Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__PHONE_CODE = eINSTANCE.getCountry_PhoneCode();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.impl.CityImpl
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__STATE = eINSTANCE.getCity_State();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.impl.StateImpl
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__COUNTRY = eINSTANCE.getState_Country();

		/**
		 * The meta object literal for the '<em><b>Cities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CITIES = eINSTANCE.getState_Cities();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__CODE = eINSTANCE.getState_Code();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.impl.AddressImpl
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__STATE = eINSTANCE.getAddress_State();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__NUMBER = eINSTANCE.getAddress_Number();

		/**
		 * The meta object literal for the '<em><b>Complements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__COMPLEMENTS = eINSTANCE.getAddress_Complements();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__TYPE = eINSTANCE.getAddress_Type();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.EmailType <em>Email Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.EmailType
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getEmailType()
		 * @generated
		 */
		EEnum EMAIL_TYPE = eINSTANCE.getEmailType();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.PhoneType <em>Phone Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.PhoneType
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getPhoneType()
		 * @generated
		 */
		EEnum PHONE_TYPE = eINSTANCE.getPhoneType();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.common.AddressType <em>Address Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.common.AddressType
		 * @see org.lunifera.model.common.impl.CommonPackageImpl#getAddressType()
		 * @generated
		 */
		EEnum ADDRESS_TYPE = eINSTANCE.getAddressType();

	}

} //CommonPackage
