/**
 */
package org.lunifera.metamodel.common;

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
 * @see org.lunifera.metamodel.common.CommonFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.lunifera.metamodel' editDirectory='/org.lunifera.metamodel.knowledge.edit/src' editorDirectory='/org.lunifera.metamodel.knowledge.editor/src' resource='XMI' forceOverwrite='true' extensibleProviderFactory='true'"
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
	String eNS_URI = "http://lunifera.org/metamodel/1.0/Common";

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
	CommonPackage eINSTANCE = org.lunifera.metamodel.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.common.impl.AbstractIdentifiedClassImpl <em>Abstract Identified Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.common.impl.AbstractIdentifiedClassImpl
	 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getAbstractIdentifiedClass()
	 * @generated
	 */
	int ABSTRACT_IDENTIFIED_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Abstract Identified Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.common.impl.AbstractNamedClassImpl <em>Abstract Named Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.common.impl.AbstractNamedClassImpl
	 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getAbstractNamedClass()
	 * @generated
	 */
	int ABSTRACT_NAMED_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_CLASS__NAME = ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Named Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_CLASS_FEATURE_COUNT = ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.common.impl.AbstractDescribedClassImpl <em>Abstract Described Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.common.impl.AbstractDescribedClassImpl
	 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getAbstractDescribedClass()
	 * @generated
	 */
	int ABSTRACT_DESCRIBED_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DESCRIBED_CLASS__NAME = ABSTRACT_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DESCRIBED_CLASS__DESCRIPTION = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Described Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.common.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.common.impl.ImportImpl
	 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Import Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_TEXT = ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.common.impl.EmailImpl <em>Email</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.common.impl.EmailImpl
	 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getEmail()
	 * @generated
	 */
	int EMAIL = 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__EMAIL = ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__TYPE = ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FEATURE_COUNT = ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.common.impl.PhoneImpl <em>Phone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.common.impl.PhoneImpl
	 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getPhone()
	 * @generated
	 */
	int PHONE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__TYPE = ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__NUMBER = ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Company</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__COMPANY = ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__REGION_CODE = ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__COUNTRY = ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Phone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FEATURE_COUNT = ABSTRACT_IDENTIFIED_CLASS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.common.impl.PhoneCompanyImpl <em>Phone Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.common.impl.PhoneCompanyImpl
	 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getPhoneCompany()
	 * @generated
	 */
	int PHONE_COMPANY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_COMPANY__NAME = ABSTRACT_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_COMPANY__CODE = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_COMPANY__COUNTRY = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Phone Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_COMPANY_FEATURE_COUNT = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.common.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.common.impl.CountryImpl
	 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = ABSTRACT_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__STATES = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phone Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__PHONE_CODE = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.common.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.common.impl.CityImpl
	 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = ABSTRACT_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__STATE = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.common.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.common.impl.StateImpl
	 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getState()
	 * @generated
	 */
	int STATE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = ABSTRACT_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Country</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__COUNTRY = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CITIES = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CODE = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.common.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.common.impl.AddressImpl
	 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__NAME = ABSTRACT_NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STATE = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__NUMBER = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Complements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COMPLEMENTS = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TYPE = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = ABSTRACT_NAMED_CLASS_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.common.EmailType <em>Email Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.common.EmailType
	 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getEmailType()
	 * @generated
	 */
	int EMAIL_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.common.PhoneType <em>Phone Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.common.PhoneType
	 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getPhoneType()
	 * @generated
	 */
	int PHONE_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.common.AddressType <em>Address Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.common.AddressType
	 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.common.AbstractIdentifiedClass <em>Abstract Identified Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Identified Class</em>'.
	 * @see org.lunifera.metamodel.common.AbstractIdentifiedClass
	 * @generated
	 */
	EClass getAbstractIdentifiedClass();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.common.AbstractNamedClass <em>Abstract Named Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Named Class</em>'.
	 * @see org.lunifera.metamodel.common.AbstractNamedClass
	 * @generated
	 */
	EClass getAbstractNamedClass();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.AbstractNamedClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.metamodel.common.AbstractNamedClass#getName()
	 * @see #getAbstractNamedClass()
	 * @generated
	 */
	EAttribute getAbstractNamedClass_Name();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.common.AbstractDescribedClass <em>Abstract Described Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Described Class</em>'.
	 * @see org.lunifera.metamodel.common.AbstractDescribedClass
	 * @generated
	 */
	EClass getAbstractDescribedClass();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.AbstractDescribedClass#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.lunifera.metamodel.common.AbstractDescribedClass#getDescription()
	 * @see #getAbstractDescribedClass()
	 * @generated
	 */
	EAttribute getAbstractDescribedClass_Description();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.common.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.lunifera.metamodel.common.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.Import#getImportText <em>Import Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Text</em>'.
	 * @see org.lunifera.metamodel.common.Import#getImportText()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportText();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.common.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email</em>'.
	 * @see org.lunifera.metamodel.common.Email
	 * @generated
	 */
	EClass getEmail();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.Email#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.lunifera.metamodel.common.Email#getEmail()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.Email#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.metamodel.common.Email#getType()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Type();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.common.Phone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone</em>'.
	 * @see org.lunifera.metamodel.common.Phone
	 * @generated
	 */
	EClass getPhone();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.Phone#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.metamodel.common.Phone#getType()
	 * @see #getPhone()
	 * @generated
	 */
	EAttribute getPhone_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.Phone#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.lunifera.metamodel.common.Phone#getNumber()
	 * @see #getPhone()
	 * @generated
	 */
	EAttribute getPhone_Number();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.common.Phone#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Company</em>'.
	 * @see org.lunifera.metamodel.common.Phone#getCompany()
	 * @see #getPhone()
	 * @generated
	 */
	EReference getPhone_Company();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.Phone#getRegionCode <em>Region Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Code</em>'.
	 * @see org.lunifera.metamodel.common.Phone#getRegionCode()
	 * @see #getPhone()
	 * @generated
	 */
	EAttribute getPhone_RegionCode();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.common.Phone#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see org.lunifera.metamodel.common.Phone#getCountry()
	 * @see #getPhone()
	 * @generated
	 */
	EReference getPhone_Country();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.common.PhoneCompany <em>Phone Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone Company</em>'.
	 * @see org.lunifera.metamodel.common.PhoneCompany
	 * @generated
	 */
	EClass getPhoneCompany();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.PhoneCompany#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.lunifera.metamodel.common.PhoneCompany#getCode()
	 * @see #getPhoneCompany()
	 * @generated
	 */
	EAttribute getPhoneCompany_Code();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.common.PhoneCompany#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see org.lunifera.metamodel.common.PhoneCompany#getCountry()
	 * @see #getPhoneCompany()
	 * @generated
	 */
	EReference getPhoneCompany_Country();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.common.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see org.lunifera.metamodel.common.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.common.Country#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.lunifera.metamodel.common.Country#getStates()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_States();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.Country#getPhoneCode <em>Phone Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Code</em>'.
	 * @see org.lunifera.metamodel.common.Country#getPhoneCode()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_PhoneCode();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.common.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see org.lunifera.metamodel.common.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.metamodel.common.City#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see org.lunifera.metamodel.common.City#getState()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_State();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.common.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.lunifera.metamodel.common.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.metamodel.common.State#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Country</em>'.
	 * @see org.lunifera.metamodel.common.State#getCountry()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Country();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.common.State#getCities <em>Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cities</em>'.
	 * @see org.lunifera.metamodel.common.State#getCities()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Cities();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.State#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.lunifera.metamodel.common.State#getCode()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Code();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.common.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.lunifera.metamodel.common.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.lunifera.metamodel.common.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.common.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City</em>'.
	 * @see org.lunifera.metamodel.common.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_City();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.common.Address#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.lunifera.metamodel.common.Address#getState()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_State();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.common.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see org.lunifera.metamodel.common.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.Address#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.lunifera.metamodel.common.Address#getNumber()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.Address#getComplements <em>Complements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complements</em>'.
	 * @see org.lunifera.metamodel.common.Address#getComplements()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Complements();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.common.Address#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.metamodel.common.Address#getType()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Type();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.metamodel.common.EmailType <em>Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Email Type</em>'.
	 * @see org.lunifera.metamodel.common.EmailType
	 * @generated
	 */
	EEnum getEmailType();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.metamodel.common.PhoneType <em>Phone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Phone Type</em>'.
	 * @see org.lunifera.metamodel.common.PhoneType
	 * @generated
	 */
	EEnum getPhoneType();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.metamodel.common.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Address Type</em>'.
	 * @see org.lunifera.metamodel.common.AddressType
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
		 * The meta object literal for the '{@link org.lunifera.metamodel.common.impl.AbstractIdentifiedClassImpl <em>Abstract Identified Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.common.impl.AbstractIdentifiedClassImpl
		 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getAbstractIdentifiedClass()
		 * @generated
		 */
		EClass ABSTRACT_IDENTIFIED_CLASS = eINSTANCE.getAbstractIdentifiedClass();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.common.impl.AbstractNamedClassImpl <em>Abstract Named Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.common.impl.AbstractNamedClassImpl
		 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getAbstractNamedClass()
		 * @generated
		 */
		EClass ABSTRACT_NAMED_CLASS = eINSTANCE.getAbstractNamedClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAMED_CLASS__NAME = eINSTANCE.getAbstractNamedClass_Name();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.common.impl.AbstractDescribedClassImpl <em>Abstract Described Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.common.impl.AbstractDescribedClassImpl
		 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getAbstractDescribedClass()
		 * @generated
		 */
		EClass ABSTRACT_DESCRIBED_CLASS = eINSTANCE.getAbstractDescribedClass();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DESCRIBED_CLASS__DESCRIPTION = eINSTANCE.getAbstractDescribedClass_Description();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.common.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.common.impl.ImportImpl
		 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getImport()
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
		 * The meta object literal for the '{@link org.lunifera.metamodel.common.impl.EmailImpl <em>Email</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.common.impl.EmailImpl
		 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getEmail()
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
		 * The meta object literal for the '{@link org.lunifera.metamodel.common.impl.PhoneImpl <em>Phone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.common.impl.PhoneImpl
		 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getPhone()
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
		 * The meta object literal for the '{@link org.lunifera.metamodel.common.impl.PhoneCompanyImpl <em>Phone Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.common.impl.PhoneCompanyImpl
		 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getPhoneCompany()
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
		 * The meta object literal for the '{@link org.lunifera.metamodel.common.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.common.impl.CountryImpl
		 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getCountry()
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
		 * The meta object literal for the '{@link org.lunifera.metamodel.common.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.common.impl.CityImpl
		 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getCity()
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
		 * The meta object literal for the '{@link org.lunifera.metamodel.common.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.common.impl.StateImpl
		 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getState()
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
		 * The meta object literal for the '{@link org.lunifera.metamodel.common.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.common.impl.AddressImpl
		 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getAddress()
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
		 * The meta object literal for the '{@link org.lunifera.metamodel.common.EmailType <em>Email Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.common.EmailType
		 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getEmailType()
		 * @generated
		 */
		EEnum EMAIL_TYPE = eINSTANCE.getEmailType();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.common.PhoneType <em>Phone Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.common.PhoneType
		 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getPhoneType()
		 * @generated
		 */
		EEnum PHONE_TYPE = eINSTANCE.getPhoneType();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.common.AddressType <em>Address Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.common.AddressType
		 * @see org.lunifera.metamodel.common.impl.CommonPackageImpl#getAddressType()
		 * @generated
		 */
		EEnum ADDRESS_TYPE = eINSTANCE.getAddressType();

	}

} //CommonPackage
