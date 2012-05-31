/**
 */
package org.lunifera.model.software;

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
 * @see org.lunifera.model.software.SoftwareFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.lunifera.model'"
 * @generated
 */
public interface SoftwarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "software";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lunifera.org/model/1.0/Software";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "software";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwarePackage eINSTANCE = org.lunifera.model.software.impl.SoftwarePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.impl.KnowledgeContainerSoftwareImpl <em>Knowledge Container Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.impl.KnowledgeContainerSoftwareImpl
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getKnowledgeContainerSoftware()
	 * @generated
	 */
	int KNOWLEDGE_CONTAINER_SOFTWARE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_SOFTWARE__ID = CommonPackage.ABS_KNOWLEDGE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_SOFTWARE__NAME = CommonPackage.ABS_KNOWLEDGE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_SOFTWARE__DESCRIPTION = CommonPackage.ABS_KNOWLEDGE_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Last Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_SOFTWARE__LAST_MODIFICATION = CommonPackage.ABS_KNOWLEDGE_CONTAINER__LAST_MODIFICATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_SOFTWARE__CREATION_DATE = CommonPackage.ABS_KNOWLEDGE_CONTAINER__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Project Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_SOFTWARE__PROJECT_CONTAINER = CommonPackage.ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Software Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_SOFTWARE__SOFTWARE_COMPONENTS = CommonPackage.ABS_KNOWLEDGE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Knowledge Container Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_SOFTWARE_FEATURE_COUNT = CommonPackage.ABS_KNOWLEDGE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.impl.AbstractSoftwareComponentImpl <em>Abstract Software Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.impl.AbstractSoftwareComponentImpl
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getAbstractSoftwareComponent()
	 * @generated
	 */
	int ABSTRACT_SOFTWARE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SOFTWARE_COMPONENT__ID = CommonPackage.ABS_DESCRIBED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SOFTWARE_COMPONENT__NAME = CommonPackage.ABS_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SOFTWARE_COMPONENT__DESCRIPTION = CommonPackage.ABS_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SOFTWARE_COMPONENT__VERSIONS = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SOFTWARE_COMPONENT__STATUS = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>License</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SOFTWARE_COMPONENT__LICENSE = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Software Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT = CommonPackage.ABS_DESCRIBED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.impl.SystemImpl
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = ABSTRACT_SOFTWARE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = ABSTRACT_SOFTWARE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DESCRIPTION = ABSTRACT_SOFTWARE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__VERSIONS = ABSTRACT_SOFTWARE_COMPONENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__STATUS = ABSTRACT_SOFTWARE_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>License</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LICENSE = ABSTRACT_SOFTWARE_COMPONENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CODE = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notification Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NOTIFICATION_STRATEGY = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MODULES = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Related Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__RELATED_SYSTEMS = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.impl.ApplicationImpl
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ID = ABSTRACT_SOFTWARE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = ABSTRACT_SOFTWARE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DESCRIPTION = ABSTRACT_SOFTWARE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VERSIONS = ABSTRACT_SOFTWARE_COMPONENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__STATUS = ABSTRACT_SOFTWARE_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>License</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LICENSE = ABSTRACT_SOFTWARE_COMPONENT__LICENSE;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.impl.CompositeImpl
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__ID = ABSTRACT_SOFTWARE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = ABSTRACT_SOFTWARE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__DESCRIPTION = ABSTRACT_SOFTWARE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__VERSIONS = ABSTRACT_SOFTWARE_COMPONENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__STATUS = ABSTRACT_SOFTWARE_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>License</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__LICENSE = ABSTRACT_SOFTWARE_COMPONENT__LICENSE;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.impl.ModuleImpl
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ID = ABSTRACT_SOFTWARE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = ABSTRACT_SOFTWARE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DESCRIPTION = ABSTRACT_SOFTWARE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__VERSIONS = ABSTRACT_SOFTWARE_COMPONENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__STATUS = ABSTRACT_SOFTWARE_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>License</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LICENSE = ABSTRACT_SOFTWARE_COMPONENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Parent System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PARENT_SYSTEM = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__FEATURES = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Technologys</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TECHNOLOGYS = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.impl.FeatureImpl
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = ABSTRACT_SOFTWARE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = ABSTRACT_SOFTWARE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = ABSTRACT_SOFTWARE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSIONS = ABSTRACT_SOFTWARE_COMPONENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__STATUS = ABSTRACT_SOFTWARE_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>License</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LICENSE = ABSTRACT_SOFTWARE_COMPONENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Bundles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BUNDLES = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.impl.BundleImpl <em>Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.impl.BundleImpl
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ID = ABSTRACT_SOFTWARE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__NAME = ABSTRACT_SOFTWARE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__DESCRIPTION = ABSTRACT_SOFTWARE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VERSIONS = ABSTRACT_SOFTWARE_COMPONENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__STATUS = ABSTRACT_SOFTWARE_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>License</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__LICENSE = ABSTRACT_SOFTWARE_COMPONENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__TYPE = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.impl.ThirdSystemImpl <em>Third System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.impl.ThirdSystemImpl
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getThirdSystem()
	 * @generated
	 */
	int THIRD_SYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_SYSTEM__ID = SYSTEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_SYSTEM__NAME = SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_SYSTEM__DESCRIPTION = SYSTEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_SYSTEM__VERSIONS = SYSTEM__VERSIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_SYSTEM__STATUS = SYSTEM__STATUS;

	/**
	 * The feature id for the '<em><b>License</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_SYSTEM__LICENSE = SYSTEM__LICENSE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_SYSTEM__CODE = SYSTEM__CODE;

	/**
	 * The feature id for the '<em><b>Notification Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_SYSTEM__NOTIFICATION_STRATEGY = SYSTEM__NOTIFICATION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_SYSTEM__MODULES = SYSTEM__MODULES;

	/**
	 * The feature id for the '<em><b>Related Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_SYSTEM__RELATED_SYSTEMS = SYSTEM__RELATED_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Webpage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_SYSTEM__WEBPAGE = SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Support Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_SYSTEM__SUPPORT_PAGE = SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Third System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_SYSTEM_FEATURE_COUNT = SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.impl.APIImpl <em>API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.impl.APIImpl
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getAPI()
	 * @generated
	 */
	int API = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__ID = ABSTRACT_SOFTWARE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__NAME = ABSTRACT_SOFTWARE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__DESCRIPTION = ABSTRACT_SOFTWARE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__VERSIONS = ABSTRACT_SOFTWARE_COMPONENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__STATUS = ABSTRACT_SOFTWARE_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>License</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__LICENSE = ABSTRACT_SOFTWARE_COMPONENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__BUNDLES = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = ABSTRACT_SOFTWARE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.impl.ThirdAPIImpl <em>Third API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.impl.ThirdAPIImpl
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getThirdAPI()
	 * @generated
	 */
	int THIRD_API = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_API__ID = API__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_API__NAME = API__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_API__DESCRIPTION = API__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_API__VERSIONS = API__VERSIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_API__STATUS = API__STATUS;

	/**
	 * The feature id for the '<em><b>License</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_API__LICENSE = API__LICENSE;

	/**
	 * The feature id for the '<em><b>Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_API__BUNDLES = API__BUNDLES;

	/**
	 * The feature id for the '<em><b>Web Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_API__WEB_PAGE = API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Support Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_API__SUPPORT_PAGE = API_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Third API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_API_FEATURE_COUNT = API_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.impl.SoftwareSetupImpl <em>Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.impl.SoftwareSetupImpl
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getSoftwareSetup()
	 * @generated
	 */
	int SOFTWARE_SETUP = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SETUP__ID = CommonPackage.ABS_IDENTIFIED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SETUP__ACCESS_TYPE = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SETUP__ACCESS_MODE = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SETUP__ACCESS_URL = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SETUP__ACCESS_TIMEOUT = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SETUP_FEATURE_COUNT = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.impl.NotificationStrategyImpl <em>Notification Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.impl.NotificationStrategyImpl
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getNotificationStrategy()
	 * @generated
	 */
	int NOTIFICATION_STRATEGY = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_STRATEGY__ID = CommonPackage.ABS_IDENTIFIED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Component Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_STRATEGY__COMPONENT_SETUP = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notification Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_STRATEGY__NOTIFICATION_EVENT = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Notification Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_STRATEGY__NOTIFICATION_TYPE = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>People To Be Notified</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_STRATEGY__PEOPLE_TO_BE_NOTIFIED = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Notification Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_STRATEGY_FEATURE_COUNT = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.impl.LicenseImpl <em>License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.impl.LicenseImpl
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getLicense()
	 * @generated
	 */
	int LICENSE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__ID = CommonPackage.ABS_IDENTIFIED_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__FREE = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Open Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__OPEN_SOURCE = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__URI = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_FEATURE_COUNT = CommonPackage.ABS_IDENTIFIED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.SoftwareStatus <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.SoftwareStatus
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getSoftwareStatus()
	 * @generated
	 */
	int SOFTWARE_STATUS = 14;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.AccessType
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.AccessMode <em>Access Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.AccessMode
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getAccessMode()
	 * @generated
	 */
	int ACCESS_MODE = 16;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.NotificationEvent <em>Notification Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.NotificationEvent
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getNotificationEvent()
	 * @generated
	 */
	int NOTIFICATION_EVENT = 17;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.NotificationType <em>Notification Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.NotificationType
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getNotificationType()
	 * @generated
	 */
	int NOTIFICATION_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.BundleType <em>Bundle Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.BundleType
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getBundleType()
	 * @generated
	 */
	int BUNDLE_TYPE = 19;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.ImplementationTechnology <em>Implementation Technology</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.ImplementationTechnology
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getImplementationTechnology()
	 * @generated
	 */
	int IMPLEMENTATION_TECHNOLOGY = 20;

	/**
	 * The meta object id for the '{@link org.lunifera.model.software.Ownership <em>Ownership</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.model.software.Ownership
	 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getOwnership()
	 * @generated
	 */
	int OWNERSHIP = 21;


	/**
	 * Returns the meta object for class '{@link org.lunifera.model.software.KnowledgeContainerSoftware <em>Knowledge Container Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Container Software</em>'.
	 * @see org.lunifera.model.software.KnowledgeContainerSoftware
	 * @generated
	 */
	EClass getKnowledgeContainerSoftware();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.model.software.KnowledgeContainerSoftware#getSoftwareComponents <em>Software Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Software Components</em>'.
	 * @see org.lunifera.model.software.KnowledgeContainerSoftware#getSoftwareComponents()
	 * @see #getKnowledgeContainerSoftware()
	 * @generated
	 */
	EReference getKnowledgeContainerSoftware_SoftwareComponents();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.software.AbstractSoftwareComponent <em>Abstract Software Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Software Component</em>'.
	 * @see org.lunifera.model.software.AbstractSoftwareComponent
	 * @generated
	 */
	EClass getAbstractSoftwareComponent();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.model.software.AbstractSoftwareComponent#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Versions</em>'.
	 * @see org.lunifera.model.software.AbstractSoftwareComponent#getVersions()
	 * @see #getAbstractSoftwareComponent()
	 * @generated
	 */
	EAttribute getAbstractSoftwareComponent_Versions();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.AbstractSoftwareComponent#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.lunifera.model.software.AbstractSoftwareComponent#getStatus()
	 * @see #getAbstractSoftwareComponent()
	 * @generated
	 */
	EAttribute getAbstractSoftwareComponent_Status();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.model.software.AbstractSoftwareComponent#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>License</em>'.
	 * @see org.lunifera.model.software.AbstractSoftwareComponent#getLicense()
	 * @see #getAbstractSoftwareComponent()
	 * @generated
	 */
	EReference getAbstractSoftwareComponent_License();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.software.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.lunifera.model.software.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.System#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.lunifera.model.software.System#getCode()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.model.software.System#getNotificationStrategy <em>Notification Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notification Strategy</em>'.
	 * @see org.lunifera.model.software.System#getNotificationStrategy()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_NotificationStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.model.software.System#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.lunifera.model.software.System#getModules()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Modules();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.model.software.System#getRelatedSystems <em>Related Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Systems</em>'.
	 * @see org.lunifera.model.software.System#getRelatedSystems()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_RelatedSystems();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.software.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.lunifera.model.software.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.software.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see org.lunifera.model.software.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.software.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.lunifera.model.software.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.model.software.Module#getParentSystem <em>Parent System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent System</em>'.
	 * @see org.lunifera.model.software.Module#getParentSystem()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ParentSystem();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.model.software.Module#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see org.lunifera.model.software.Module#getFeatures()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Features();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.model.software.Module#getTechnologys <em>Technologys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Technologys</em>'.
	 * @see org.lunifera.model.software.Module#getTechnologys()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Technologys();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.software.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.lunifera.model.software.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.model.software.Feature#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bundles</em>'.
	 * @see org.lunifera.model.software.Feature#getBundles()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Bundles();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.software.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see org.lunifera.model.software.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.Bundle#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.model.software.Bundle#getType()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Type();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.software.ThirdSystem <em>Third System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Third System</em>'.
	 * @see org.lunifera.model.software.ThirdSystem
	 * @generated
	 */
	EClass getThirdSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.ThirdSystem#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webpage</em>'.
	 * @see org.lunifera.model.software.ThirdSystem#getWebpage()
	 * @see #getThirdSystem()
	 * @generated
	 */
	EAttribute getThirdSystem_Webpage();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.ThirdSystem#getSupportPage <em>Support Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Support Page</em>'.
	 * @see org.lunifera.model.software.ThirdSystem#getSupportPage()
	 * @see #getThirdSystem()
	 * @generated
	 */
	EAttribute getThirdSystem_SupportPage();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.software.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API</em>'.
	 * @see org.lunifera.model.software.API
	 * @generated
	 */
	EClass getAPI();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.model.software.API#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundles</em>'.
	 * @see org.lunifera.model.software.API#getBundles()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Bundles();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.software.ThirdAPI <em>Third API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Third API</em>'.
	 * @see org.lunifera.model.software.ThirdAPI
	 * @generated
	 */
	EClass getThirdAPI();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.ThirdAPI#getWebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Page</em>'.
	 * @see org.lunifera.model.software.ThirdAPI#getWebPage()
	 * @see #getThirdAPI()
	 * @generated
	 */
	EAttribute getThirdAPI_WebPage();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.ThirdAPI#getSupportPage <em>Support Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Support Page</em>'.
	 * @see org.lunifera.model.software.ThirdAPI#getSupportPage()
	 * @see #getThirdAPI()
	 * @generated
	 */
	EAttribute getThirdAPI_SupportPage();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.software.SoftwareSetup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setup</em>'.
	 * @see org.lunifera.model.software.SoftwareSetup
	 * @generated
	 */
	EClass getSoftwareSetup();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.SoftwareSetup#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see org.lunifera.model.software.SoftwareSetup#getAccessType()
	 * @see #getSoftwareSetup()
	 * @generated
	 */
	EAttribute getSoftwareSetup_AccessType();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.SoftwareSetup#getAccessMode <em>Access Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Mode</em>'.
	 * @see org.lunifera.model.software.SoftwareSetup#getAccessMode()
	 * @see #getSoftwareSetup()
	 * @generated
	 */
	EAttribute getSoftwareSetup_AccessMode();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.SoftwareSetup#getAccessURL <em>Access URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access URL</em>'.
	 * @see org.lunifera.model.software.SoftwareSetup#getAccessURL()
	 * @see #getSoftwareSetup()
	 * @generated
	 */
	EAttribute getSoftwareSetup_AccessURL();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.SoftwareSetup#getAccessTimeout <em>Access Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Timeout</em>'.
	 * @see org.lunifera.model.software.SoftwareSetup#getAccessTimeout()
	 * @see #getSoftwareSetup()
	 * @generated
	 */
	EAttribute getSoftwareSetup_AccessTimeout();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.software.NotificationStrategy <em>Notification Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Strategy</em>'.
	 * @see org.lunifera.model.software.NotificationStrategy
	 * @generated
	 */
	EClass getNotificationStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.model.software.NotificationStrategy#getComponentSetup <em>Component Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Setup</em>'.
	 * @see org.lunifera.model.software.NotificationStrategy#getComponentSetup()
	 * @see #getNotificationStrategy()
	 * @generated
	 */
	EReference getNotificationStrategy_ComponentSetup();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.NotificationStrategy#getNotificationEvent <em>Notification Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Event</em>'.
	 * @see org.lunifera.model.software.NotificationStrategy#getNotificationEvent()
	 * @see #getNotificationStrategy()
	 * @generated
	 */
	EAttribute getNotificationStrategy_NotificationEvent();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.model.software.NotificationStrategy#getNotificationType <em>Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Notification Type</em>'.
	 * @see org.lunifera.model.software.NotificationStrategy#getNotificationType()
	 * @see #getNotificationStrategy()
	 * @generated
	 */
	EAttribute getNotificationStrategy_NotificationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.model.software.NotificationStrategy#getPeopleToBeNotified <em>People To Be Notified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>People To Be Notified</em>'.
	 * @see org.lunifera.model.software.NotificationStrategy#getPeopleToBeNotified()
	 * @see #getNotificationStrategy()
	 * @generated
	 */
	EAttribute getNotificationStrategy_PeopleToBeNotified();

	/**
	 * Returns the meta object for class '{@link org.lunifera.model.software.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License</em>'.
	 * @see org.lunifera.model.software.License
	 * @generated
	 */
	EClass getLicense();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.License#isFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see org.lunifera.model.software.License#isFree()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Free();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.License#isOpenSource <em>Open Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Source</em>'.
	 * @see org.lunifera.model.software.License#isOpenSource()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_OpenSource();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.model.software.License#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.lunifera.model.software.License#getUri()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Uri();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.model.software.SoftwareStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see org.lunifera.model.software.SoftwareStatus
	 * @generated
	 */
	EEnum getSoftwareStatus();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.model.software.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see org.lunifera.model.software.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.model.software.AccessMode <em>Access Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Mode</em>'.
	 * @see org.lunifera.model.software.AccessMode
	 * @generated
	 */
	EEnum getAccessMode();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.model.software.NotificationEvent <em>Notification Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notification Event</em>'.
	 * @see org.lunifera.model.software.NotificationEvent
	 * @generated
	 */
	EEnum getNotificationEvent();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.model.software.NotificationType <em>Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notification Type</em>'.
	 * @see org.lunifera.model.software.NotificationType
	 * @generated
	 */
	EEnum getNotificationType();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.model.software.BundleType <em>Bundle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bundle Type</em>'.
	 * @see org.lunifera.model.software.BundleType
	 * @generated
	 */
	EEnum getBundleType();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.model.software.ImplementationTechnology <em>Implementation Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Implementation Technology</em>'.
	 * @see org.lunifera.model.software.ImplementationTechnology
	 * @generated
	 */
	EEnum getImplementationTechnology();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.model.software.Ownership <em>Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ownership</em>'.
	 * @see org.lunifera.model.software.Ownership
	 * @generated
	 */
	EEnum getOwnership();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoftwareFactory getSoftwareFactory();

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
		 * The meta object literal for the '{@link org.lunifera.model.software.impl.KnowledgeContainerSoftwareImpl <em>Knowledge Container Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.impl.KnowledgeContainerSoftwareImpl
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getKnowledgeContainerSoftware()
		 * @generated
		 */
		EClass KNOWLEDGE_CONTAINER_SOFTWARE = eINSTANCE.getKnowledgeContainerSoftware();

		/**
		 * The meta object literal for the '<em><b>Software Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_CONTAINER_SOFTWARE__SOFTWARE_COMPONENTS = eINSTANCE.getKnowledgeContainerSoftware_SoftwareComponents();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.impl.AbstractSoftwareComponentImpl <em>Abstract Software Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.impl.AbstractSoftwareComponentImpl
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getAbstractSoftwareComponent()
		 * @generated
		 */
		EClass ABSTRACT_SOFTWARE_COMPONENT = eINSTANCE.getAbstractSoftwareComponent();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SOFTWARE_COMPONENT__VERSIONS = eINSTANCE.getAbstractSoftwareComponent_Versions();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SOFTWARE_COMPONENT__STATUS = eINSTANCE.getAbstractSoftwareComponent_Status();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SOFTWARE_COMPONENT__LICENSE = eINSTANCE.getAbstractSoftwareComponent_License();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.impl.SystemImpl
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__CODE = eINSTANCE.getSystem_Code();

		/**
		 * The meta object literal for the '<em><b>Notification Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__NOTIFICATION_STRATEGY = eINSTANCE.getSystem_NotificationStrategy();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__MODULES = eINSTANCE.getSystem_Modules();

		/**
		 * The meta object literal for the '<em><b>Related Systems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__RELATED_SYSTEMS = eINSTANCE.getSystem_RelatedSystems();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.impl.ApplicationImpl
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.impl.CompositeImpl
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.impl.ModuleImpl
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Parent System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PARENT_SYSTEM = eINSTANCE.getModule_ParentSystem();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__FEATURES = eINSTANCE.getModule_Features();

		/**
		 * The meta object literal for the '<em><b>Technologys</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__TECHNOLOGYS = eINSTANCE.getModule_Technologys();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.impl.FeatureImpl
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Bundles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__BUNDLES = eINSTANCE.getFeature_Bundles();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.impl.BundleImpl <em>Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.impl.BundleImpl
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__TYPE = eINSTANCE.getBundle_Type();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.impl.ThirdSystemImpl <em>Third System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.impl.ThirdSystemImpl
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getThirdSystem()
		 * @generated
		 */
		EClass THIRD_SYSTEM = eINSTANCE.getThirdSystem();

		/**
		 * The meta object literal for the '<em><b>Webpage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_SYSTEM__WEBPAGE = eINSTANCE.getThirdSystem_Webpage();

		/**
		 * The meta object literal for the '<em><b>Support Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_SYSTEM__SUPPORT_PAGE = eINSTANCE.getThirdSystem_SupportPage();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.impl.APIImpl <em>API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.impl.APIImpl
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getAPI()
		 * @generated
		 */
		EClass API = eINSTANCE.getAPI();

		/**
		 * The meta object literal for the '<em><b>Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__BUNDLES = eINSTANCE.getAPI_Bundles();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.impl.ThirdAPIImpl <em>Third API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.impl.ThirdAPIImpl
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getThirdAPI()
		 * @generated
		 */
		EClass THIRD_API = eINSTANCE.getThirdAPI();

		/**
		 * The meta object literal for the '<em><b>Web Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_API__WEB_PAGE = eINSTANCE.getThirdAPI_WebPage();

		/**
		 * The meta object literal for the '<em><b>Support Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_API__SUPPORT_PAGE = eINSTANCE.getThirdAPI_SupportPage();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.impl.SoftwareSetupImpl <em>Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.impl.SoftwareSetupImpl
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getSoftwareSetup()
		 * @generated
		 */
		EClass SOFTWARE_SETUP = eINSTANCE.getSoftwareSetup();

		/**
		 * The meta object literal for the '<em><b>Access Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_SETUP__ACCESS_TYPE = eINSTANCE.getSoftwareSetup_AccessType();

		/**
		 * The meta object literal for the '<em><b>Access Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_SETUP__ACCESS_MODE = eINSTANCE.getSoftwareSetup_AccessMode();

		/**
		 * The meta object literal for the '<em><b>Access URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_SETUP__ACCESS_URL = eINSTANCE.getSoftwareSetup_AccessURL();

		/**
		 * The meta object literal for the '<em><b>Access Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_SETUP__ACCESS_TIMEOUT = eINSTANCE.getSoftwareSetup_AccessTimeout();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.impl.NotificationStrategyImpl <em>Notification Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.impl.NotificationStrategyImpl
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getNotificationStrategy()
		 * @generated
		 */
		EClass NOTIFICATION_STRATEGY = eINSTANCE.getNotificationStrategy();

		/**
		 * The meta object literal for the '<em><b>Component Setup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_STRATEGY__COMPONENT_SETUP = eINSTANCE.getNotificationStrategy_ComponentSetup();

		/**
		 * The meta object literal for the '<em><b>Notification Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_STRATEGY__NOTIFICATION_EVENT = eINSTANCE.getNotificationStrategy_NotificationEvent();

		/**
		 * The meta object literal for the '<em><b>Notification Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_STRATEGY__NOTIFICATION_TYPE = eINSTANCE.getNotificationStrategy_NotificationType();

		/**
		 * The meta object literal for the '<em><b>People To Be Notified</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_STRATEGY__PEOPLE_TO_BE_NOTIFIED = eINSTANCE.getNotificationStrategy_PeopleToBeNotified();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.impl.LicenseImpl <em>License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.impl.LicenseImpl
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getLicense()
		 * @generated
		 */
		EClass LICENSE = eINSTANCE.getLicense();

		/**
		 * The meta object literal for the '<em><b>Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__FREE = eINSTANCE.getLicense_Free();

		/**
		 * The meta object literal for the '<em><b>Open Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__OPEN_SOURCE = eINSTANCE.getLicense_OpenSource();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__URI = eINSTANCE.getLicense_Uri();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.SoftwareStatus <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.SoftwareStatus
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getSoftwareStatus()
		 * @generated
		 */
		EEnum SOFTWARE_STATUS = eINSTANCE.getSoftwareStatus();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.AccessType <em>Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.AccessType
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getAccessType()
		 * @generated
		 */
		EEnum ACCESS_TYPE = eINSTANCE.getAccessType();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.AccessMode <em>Access Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.AccessMode
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getAccessMode()
		 * @generated
		 */
		EEnum ACCESS_MODE = eINSTANCE.getAccessMode();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.NotificationEvent <em>Notification Event</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.NotificationEvent
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getNotificationEvent()
		 * @generated
		 */
		EEnum NOTIFICATION_EVENT = eINSTANCE.getNotificationEvent();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.NotificationType <em>Notification Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.NotificationType
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getNotificationType()
		 * @generated
		 */
		EEnum NOTIFICATION_TYPE = eINSTANCE.getNotificationType();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.BundleType <em>Bundle Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.BundleType
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getBundleType()
		 * @generated
		 */
		EEnum BUNDLE_TYPE = eINSTANCE.getBundleType();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.ImplementationTechnology <em>Implementation Technology</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.ImplementationTechnology
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getImplementationTechnology()
		 * @generated
		 */
		EEnum IMPLEMENTATION_TECHNOLOGY = eINSTANCE.getImplementationTechnology();

		/**
		 * The meta object literal for the '{@link org.lunifera.model.software.Ownership <em>Ownership</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.model.software.Ownership
		 * @see org.lunifera.model.software.impl.SoftwarePackageImpl#getOwnership()
		 * @generated
		 */
		EEnum OWNERSHIP = eINSTANCE.getOwnership();

	}

} //SoftwarePackage
