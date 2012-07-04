/**
 */
package org.lunifera.metamodel.dsl.entity.lentity;

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
 * @see org.lunifera.metamodel.dsl.entity.lentity.LentityFactory
 * @model kind="package"
 * @generated
 */
public interface LentityPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lentity";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lunifera.org/metamodel/dsl/entity/Entity";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lentity";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LentityPackage eINSTANCE = org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl.init();

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LEntityModelImpl <em>LEntity Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LEntityModelImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLEntityModel()
   * @generated
   */
  int LENTITY_MODEL = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY_MODEL__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY_MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY_MODEL__ENTITY = 2;

  /**
   * The number of structural features of the '<em>LEntity Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LPackageImpl <em>LPackage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LPackageImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLPackage()
   * @generated
   */
  int LPACKAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPACKAGE__NAME = 0;

  /**
   * The number of structural features of the '<em>LPackage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPACKAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LImportImpl <em>LImport</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LImportImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLImport()
   * @generated
   */
  int LIMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>LImport</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LEntityImpl <em>LEntity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LEntityImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLEntity()
   * @generated
   */
  int LENTITY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY__SUPER_TYPE = 1;

  /**
   * The feature id for the '<em><b>Entity Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY__ENTITY_MEMBERS = 2;

  /**
   * The number of structural features of the '<em>LEntity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LEntityMemberImpl <em>LEntity Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LEntityMemberImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLEntityMember()
   * @generated
   */
  int LENTITY_MEMBER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY_MEMBER__NAME = 0;

  /**
   * The number of structural features of the '<em>LEntity Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY_MEMBER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LReferenceImpl <em>LReference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LReferenceImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLReference()
   * @generated
   */
  int LREFERENCE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERENCE__NAME = LENTITY_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERENCE__TYPE = LENTITY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERENCE__MULTIPLICITY = LENTITY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>LReference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERENCE_FEATURE_COUNT = LENTITY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LReferenceJVMImpl <em>LReference JVM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LReferenceJVMImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLReferenceJVM()
   * @generated
   */
  int LREFERENCE_JVM = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERENCE_JVM__NAME = LENTITY_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERENCE_JVM__TYPE = LENTITY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERENCE_JVM__MULTIPLICITY = LENTITY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>LReference JVM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERENCE_JVM_FEATURE_COUNT = LENTITY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LPropertyImpl <em>LProperty</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LPropertyImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLProperty()
   * @generated
   */
  int LPROPERTY = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPROPERTY__NAME = LENTITY_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPROPERTY__TYPE = LENTITY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPROPERTY__DEFAULT_VALUE_LITERAL = LENTITY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>LProperty</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPROPERTY_FEATURE_COUNT = LENTITY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LRefersImpl <em>LRefers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LRefersImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLRefers()
   * @generated
   */
  int LREFERS = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERS__NAME = LREFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERS__TYPE = LREFERENCE__TYPE;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERS__MULTIPLICITY = LREFERENCE__MULTIPLICITY;

  /**
   * The number of structural features of the '<em>LRefers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERS_FEATURE_COUNT = LREFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LContainsImpl <em>LContains</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LContainsImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLContains()
   * @generated
   */
  int LCONTAINS = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINS__NAME = LREFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINS__TYPE = LREFERENCE__TYPE;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINS__MULTIPLICITY = LREFERENCE__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINS__OPPOSITE = LREFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LContains</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINS_FEATURE_COUNT = LREFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LContainerImpl <em>LContainer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LContainerImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLContainer()
   * @generated
   */
  int LCONTAINER = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINER__NAME = LREFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINER__TYPE = LREFERENCE__TYPE;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINER__MULTIPLICITY = LREFERENCE__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINER__OPPOSITE = LREFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LContainer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINER_FEATURE_COUNT = LREFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LRefersJVMImpl <em>LRefers JVM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LRefersJVMImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLRefersJVM()
   * @generated
   */
  int LREFERS_JVM = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERS_JVM__NAME = LREFERENCE_JVM__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERS_JVM__TYPE = LREFERENCE_JVM__TYPE;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERS_JVM__MULTIPLICITY = LREFERENCE_JVM__MULTIPLICITY;

  /**
   * The number of structural features of the '<em>LRefers JVM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LREFERS_JVM_FEATURE_COUNT = LREFERENCE_JVM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LContainsJVMImpl <em>LContains JVM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LContainsJVMImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLContainsJVM()
   * @generated
   */
  int LCONTAINS_JVM = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINS_JVM__NAME = LREFERENCE_JVM__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINS_JVM__TYPE = LREFERENCE_JVM__TYPE;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINS_JVM__MULTIPLICITY = LREFERENCE_JVM__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINS_JVM__OPPOSITE = LREFERENCE_JVM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LContains JVM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCONTAINS_JVM_FEATURE_COUNT = LREFERENCE_JVM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LEmbeddsImpl <em>LEmbedds</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LEmbeddsImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLEmbedds()
   * @generated
   */
  int LEMBEDDS = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEMBEDDS__NAME = LENTITY_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEMBEDDS__TYPE = LENTITY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LEmbedds</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEMBEDDS_FEATURE_COUNT = LENTITY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LOperationImpl <em>LOperation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LOperationImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLOperation()
   * @generated
   */
  int LOPERATION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOPERATION__NAME = LENTITY_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Operation Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOPERATION__OPERATION_ANNOTATION = LENTITY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOPERATION__MODIFIER = LENTITY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOPERATION__TYPE = LENTITY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOPERATION__PARAMS = LENTITY_MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOPERATION__BODY = LENTITY_MEMBER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>LOperation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOPERATION_FEATURE_COUNT = LENTITY_MEMBER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LModifierImpl <em>LModifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LModifierImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLModifier()
   * @generated
   */
  int LMODIFIER = 15;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LMODIFIER__FINAL = 0;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LMODIFIER__STATIC = 1;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LMODIFIER__VISIBILITY = 2;

  /**
   * The number of structural features of the '<em>LModifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LMODIFIER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LMultiplicityImpl <em>LMultiplicity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LMultiplicityImpl
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLMultiplicity()
   * @generated
   */
  int LMULTIPLICITY = 16;

  /**
   * The number of structural features of the '<em>LMultiplicity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LMULTIPLICITY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.lentity.LVisibility <em>LVisibility</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.lentity.LVisibility
   * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLVisibility()
   * @generated
   */
  int LVISIBILITY = 17;


  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntityModel <em>LEntity Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LEntity Model</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEntityModel
   * @generated
   */
  EClass getLEntityModel();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntityModel#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEntityModel#getPackage()
   * @see #getLEntityModel()
   * @generated
   */
  EReference getLEntityModel_Package();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntityModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEntityModel#getImports()
   * @see #getLEntityModel()
   * @generated
   */
  EReference getLEntityModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntityModel#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entity</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEntityModel#getEntity()
   * @see #getLEntityModel()
   * @generated
   */
  EReference getLEntityModel_Entity();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LPackage <em>LPackage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LPackage</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LPackage
   * @generated
   */
  EClass getLPackage();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.lentity.LPackage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LPackage#getName()
   * @see #getLPackage()
   * @generated
   */
  EAttribute getLPackage_Name();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LImport <em>LImport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LImport</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LImport
   * @generated
   */
  EClass getLImport();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.lentity.LImport#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LImport#getImportedNamespace()
   * @see #getLImport()
   * @generated
   */
  EAttribute getLImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntity <em>LEntity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LEntity</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEntity
   * @generated
   */
  EClass getLEntity();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEntity#getName()
   * @see #getLEntity()
   * @generated
   */
  EAttribute getLEntity_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEntity#getSuperType()
   * @see #getLEntity()
   * @generated
   */
  EReference getLEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntity#getEntityMembers <em>Entity Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entity Members</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEntity#getEntityMembers()
   * @see #getLEntity()
   * @generated
   */
  EReference getLEntity_EntityMembers();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntityMember <em>LEntity Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LEntity Member</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEntityMember
   * @generated
   */
  EClass getLEntityMember();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntityMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEntityMember#getName()
   * @see #getLEntityMember()
   * @generated
   */
  EAttribute getLEntityMember_Name();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LReference <em>LReference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LReference</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LReference
   * @generated
   */
  EClass getLReference();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.metamodel.dsl.entity.lentity.LReference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LReference#getType()
   * @see #getLReference()
   * @generated
   */
  EReference getLReference_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.lentity.LReference#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LReference#getMultiplicity()
   * @see #getLReference()
   * @generated
   */
  EReference getLReference_Multiplicity();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LReferenceJVM <em>LReference JVM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LReference JVM</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LReferenceJVM
   * @generated
   */
  EClass getLReferenceJVM();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.lentity.LReferenceJVM#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LReferenceJVM#getType()
   * @see #getLReferenceJVM()
   * @generated
   */
  EReference getLReferenceJVM_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.lentity.LReferenceJVM#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LReferenceJVM#getMultiplicity()
   * @see #getLReferenceJVM()
   * @generated
   */
  EReference getLReferenceJVM_Multiplicity();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LProperty <em>LProperty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LProperty</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LProperty
   * @generated
   */
  EClass getLProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.lentity.LProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LProperty#getType()
   * @see #getLProperty()
   * @generated
   */
  EReference getLProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.lentity.LProperty#getDefaultValueLiteral <em>Default Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value Literal</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LProperty#getDefaultValueLiteral()
   * @see #getLProperty()
   * @generated
   */
  EAttribute getLProperty_DefaultValueLiteral();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LRefers <em>LRefers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LRefers</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LRefers
   * @generated
   */
  EClass getLRefers();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LContains <em>LContains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LContains</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LContains
   * @generated
   */
  EClass getLContains();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.metamodel.dsl.entity.lentity.LContains#getOpposite <em>Opposite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opposite</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LContains#getOpposite()
   * @see #getLContains()
   * @generated
   */
  EReference getLContains_Opposite();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LContainer <em>LContainer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LContainer</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LContainer
   * @generated
   */
  EClass getLContainer();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.metamodel.dsl.entity.lentity.LContainer#getOpposite <em>Opposite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opposite</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LContainer#getOpposite()
   * @see #getLContainer()
   * @generated
   */
  EReference getLContainer_Opposite();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LRefersJVM <em>LRefers JVM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LRefers JVM</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LRefersJVM
   * @generated
   */
  EClass getLRefersJVM();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LContainsJVM <em>LContains JVM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LContains JVM</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LContainsJVM
   * @generated
   */
  EClass getLContainsJVM();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.metamodel.dsl.entity.lentity.LContainsJVM#getOpposite <em>Opposite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opposite</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LContainsJVM#getOpposite()
   * @see #getLContainsJVM()
   * @generated
   */
  EReference getLContainsJVM_Opposite();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LEmbedds <em>LEmbedds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LEmbedds</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEmbedds
   * @generated
   */
  EClass getLEmbedds();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.lentity.LEmbedds#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEmbedds#getType()
   * @see #getLEmbedds()
   * @generated
   */
  EReference getLEmbedds_Type();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LOperation <em>LOperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LOperation</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LOperation
   * @generated
   */
  EClass getLOperation();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.lentity.LOperation#getOperationAnnotation <em>Operation Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operation Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LOperation#getOperationAnnotation()
   * @see #getLOperation()
   * @generated
   */
  EReference getLOperation_OperationAnnotation();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.lentity.LOperation#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LOperation#getModifier()
   * @see #getLOperation()
   * @generated
   */
  EReference getLOperation_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.lentity.LOperation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LOperation#getType()
   * @see #getLOperation()
   * @generated
   */
  EReference getLOperation_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.lentity.LOperation#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LOperation#getParams()
   * @see #getLOperation()
   * @generated
   */
  EReference getLOperation_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.lentity.LOperation#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LOperation#getBody()
   * @see #getLOperation()
   * @generated
   */
  EReference getLOperation_Body();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LModifier <em>LModifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LModifier</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LModifier
   * @generated
   */
  EClass getLModifier();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.lentity.LModifier#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LModifier#isFinal()
   * @see #getLModifier()
   * @generated
   */
  EAttribute getLModifier_Final();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.lentity.LModifier#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LModifier#isStatic()
   * @see #getLModifier()
   * @generated
   */
  EAttribute getLModifier_Static();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.lentity.LModifier#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LModifier#getVisibility()
   * @see #getLModifier()
   * @generated
   */
  EAttribute getLModifier_Visibility();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.lentity.LMultiplicity <em>LMultiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LMultiplicity</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LMultiplicity
   * @generated
   */
  EClass getLMultiplicity();

  /**
   * Returns the meta object for enum '{@link org.lunifera.metamodel.dsl.entity.lentity.LVisibility <em>LVisibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>LVisibility</em>'.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LVisibility
   * @generated
   */
  EEnum getLVisibility();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LentityFactory getLentityFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LEntityModelImpl <em>LEntity Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LEntityModelImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLEntityModel()
     * @generated
     */
    EClass LENTITY_MODEL = eINSTANCE.getLEntityModel();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LENTITY_MODEL__PACKAGE = eINSTANCE.getLEntityModel_Package();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LENTITY_MODEL__IMPORTS = eINSTANCE.getLEntityModel_Imports();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LENTITY_MODEL__ENTITY = eINSTANCE.getLEntityModel_Entity();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LPackageImpl <em>LPackage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LPackageImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLPackage()
     * @generated
     */
    EClass LPACKAGE = eINSTANCE.getLPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LPACKAGE__NAME = eINSTANCE.getLPackage_Name();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LImportImpl <em>LImport</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LImportImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLImport()
     * @generated
     */
    EClass LIMPORT = eINSTANCE.getLImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIMPORT__IMPORTED_NAMESPACE = eINSTANCE.getLImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LEntityImpl <em>LEntity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LEntityImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLEntity()
     * @generated
     */
    EClass LENTITY = eINSTANCE.getLEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENTITY__NAME = eINSTANCE.getLEntity_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LENTITY__SUPER_TYPE = eINSTANCE.getLEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Entity Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LENTITY__ENTITY_MEMBERS = eINSTANCE.getLEntity_EntityMembers();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LEntityMemberImpl <em>LEntity Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LEntityMemberImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLEntityMember()
     * @generated
     */
    EClass LENTITY_MEMBER = eINSTANCE.getLEntityMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENTITY_MEMBER__NAME = eINSTANCE.getLEntityMember_Name();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LReferenceImpl <em>LReference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LReferenceImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLReference()
     * @generated
     */
    EClass LREFERENCE = eINSTANCE.getLReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LREFERENCE__TYPE = eINSTANCE.getLReference_Type();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LREFERENCE__MULTIPLICITY = eINSTANCE.getLReference_Multiplicity();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LReferenceJVMImpl <em>LReference JVM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LReferenceJVMImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLReferenceJVM()
     * @generated
     */
    EClass LREFERENCE_JVM = eINSTANCE.getLReferenceJVM();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LREFERENCE_JVM__TYPE = eINSTANCE.getLReferenceJVM_Type();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LREFERENCE_JVM__MULTIPLICITY = eINSTANCE.getLReferenceJVM_Multiplicity();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LPropertyImpl <em>LProperty</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LPropertyImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLProperty()
     * @generated
     */
    EClass LPROPERTY = eINSTANCE.getLProperty();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LPROPERTY__TYPE = eINSTANCE.getLProperty_Type();

    /**
     * The meta object literal for the '<em><b>Default Value Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LPROPERTY__DEFAULT_VALUE_LITERAL = eINSTANCE.getLProperty_DefaultValueLiteral();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LRefersImpl <em>LRefers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LRefersImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLRefers()
     * @generated
     */
    EClass LREFERS = eINSTANCE.getLRefers();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LContainsImpl <em>LContains</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LContainsImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLContains()
     * @generated
     */
    EClass LCONTAINS = eINSTANCE.getLContains();

    /**
     * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LCONTAINS__OPPOSITE = eINSTANCE.getLContains_Opposite();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LContainerImpl <em>LContainer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LContainerImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLContainer()
     * @generated
     */
    EClass LCONTAINER = eINSTANCE.getLContainer();

    /**
     * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LCONTAINER__OPPOSITE = eINSTANCE.getLContainer_Opposite();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LRefersJVMImpl <em>LRefers JVM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LRefersJVMImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLRefersJVM()
     * @generated
     */
    EClass LREFERS_JVM = eINSTANCE.getLRefersJVM();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LContainsJVMImpl <em>LContains JVM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LContainsJVMImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLContainsJVM()
     * @generated
     */
    EClass LCONTAINS_JVM = eINSTANCE.getLContainsJVM();

    /**
     * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LCONTAINS_JVM__OPPOSITE = eINSTANCE.getLContainsJVM_Opposite();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LEmbeddsImpl <em>LEmbedds</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LEmbeddsImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLEmbedds()
     * @generated
     */
    EClass LEMBEDDS = eINSTANCE.getLEmbedds();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEMBEDDS__TYPE = eINSTANCE.getLEmbedds_Type();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LOperationImpl <em>LOperation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LOperationImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLOperation()
     * @generated
     */
    EClass LOPERATION = eINSTANCE.getLOperation();

    /**
     * The meta object literal for the '<em><b>Operation Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOPERATION__OPERATION_ANNOTATION = eINSTANCE.getLOperation_OperationAnnotation();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOPERATION__MODIFIER = eINSTANCE.getLOperation_Modifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOPERATION__TYPE = eINSTANCE.getLOperation_Type();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOPERATION__PARAMS = eINSTANCE.getLOperation_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOPERATION__BODY = eINSTANCE.getLOperation_Body();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LModifierImpl <em>LModifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LModifierImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLModifier()
     * @generated
     */
    EClass LMODIFIER = eINSTANCE.getLModifier();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LMODIFIER__FINAL = eINSTANCE.getLModifier_Final();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LMODIFIER__STATIC = eINSTANCE.getLModifier_Static();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LMODIFIER__VISIBILITY = eINSTANCE.getLModifier_Visibility();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.impl.LMultiplicityImpl <em>LMultiplicity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LMultiplicityImpl
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLMultiplicity()
     * @generated
     */
    EClass LMULTIPLICITY = eINSTANCE.getLMultiplicity();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.lentity.LVisibility <em>LVisibility</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.lentity.LVisibility
     * @see org.lunifera.metamodel.dsl.entity.lentity.impl.LentityPackageImpl#getLVisibility()
     * @generated
     */
    EEnum LVISIBILITY = eINSTANCE.getLVisibility();

  }

} //LentityPackage
