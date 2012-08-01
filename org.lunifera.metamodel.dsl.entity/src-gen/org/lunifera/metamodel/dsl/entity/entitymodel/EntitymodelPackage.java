/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel;

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
 * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelFactory
 * @model kind="package"
 * @generated
 */
public interface EntitymodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "entitymodel";

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
  String eNS_PREFIX = "entitymodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EntitymodelPackage eINSTANCE = org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityModelImpl <em>LEntity Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityModelImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLEntityModel()
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
   * The feature id for the '<em><b>Gen Settings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY_MODEL__GEN_SETTINGS = 2;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY_MODEL__TYPES = 3;

  /**
   * The number of structural features of the '<em>LEntity Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY_MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPackageImpl <em>LPackage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPackageImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLPackage()
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
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LImportImpl <em>LImport</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LImportImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLImport()
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
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LGenSettingsImpl <em>LGen Settings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LGenSettingsImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLGenSettings()
   * @generated
   */
  int LGEN_SETTINGS = 3;

  /**
   * The feature id for the '<em><b>No Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LGEN_SETTINGS__NO_SOURCE = 0;

  /**
   * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LGEN_SETTINGS__LIFECYCLE = 1;

  /**
   * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LGEN_SETTINGS__PROPERTY_CHANGE_SUPPORT = 2;

  /**
   * The number of structural features of the '<em>LGen Settings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LGEN_SETTINGS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LTypeImpl <em>LType</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LTypeImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLType()
   * @generated
   */
  int LTYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LTYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>LType</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LTYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityImpl <em>LEntity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLEntity()
   * @generated
   */
  int LENTITY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY__NAME = LTYPE__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY__SUPER_TYPE = LTYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Entity Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY__ENTITY_MEMBERS = LTYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>LEntity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENTITY_FEATURE_COUNT = LTYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityMemberImpl <em>LEntity Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityMemberImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLEntityMember()
   * @generated
   */
  int LENTITY_MEMBER = 6;

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
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LReferenceImpl <em>LReference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LReferenceImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLReference()
   * @generated
   */
  int LREFERENCE = 7;

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
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl <em>LProperty</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLProperty()
   * @generated
   */
  int LPROPERTY = 8;

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
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPROPERTY__MULTIPLICITY = LENTITY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPROPERTY__DEFAULT_VALUE_LITERAL = LENTITY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>LProperty</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LPROPERTY_FEATURE_COUNT = LENTITY_MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LRefersImpl <em>LRefers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LRefersImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLRefers()
   * @generated
   */
  int LREFERS = 9;

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
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LContainsImpl <em>LContains</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LContainsImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLContains()
   * @generated
   */
  int LCONTAINS = 10;

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
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LContainerImpl <em>LContainer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LContainerImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLContainer()
   * @generated
   */
  int LCONTAINER = 11;

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
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEmbeddsImpl <em>LEmbedds</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEmbeddsImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLEmbedds()
   * @generated
   */
  int LEMBEDDS = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEMBEDDS__NAME = LENTITY_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
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
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LOperationImpl <em>LOperation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LOperationImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLOperation()
   * @generated
   */
  int LOPERATION = 13;

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
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LModifierImpl <em>LModifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LModifierImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLModifier()
   * @generated
   */
  int LMODIFIER = 14;

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
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEnumImpl <em>LEnum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEnumImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLEnum()
   * @generated
   */
  int LENUM = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENUM__NAME = LTYPE__NAME;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENUM__LITERALS = LTYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LEnum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENUM_FEATURE_COUNT = LTYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEnumLiteralImpl <em>LEnum Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEnumLiteralImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLEnumLiteral()
   * @generated
   */
  int LENUM_LITERAL = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENUM_LITERAL__NAME = 0;

  /**
   * The number of structural features of the '<em>LEnum Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENUM_LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LMultiplicityImpl <em>LMultiplicity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LMultiplicityImpl
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLMultiplicity()
   * @generated
   */
  int LMULTIPLICITY = 17;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LMULTIPLICITY__LOWER = 0;

  /**
   * The feature id for the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LMULTIPLICITY__UPPER = 1;

  /**
   * The number of structural features of the '<em>LMultiplicity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LMULTIPLICITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LVisibility <em>LVisibility</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LVisibility
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLVisibility()
   * @generated
   */
  int LVISIBILITY = 18;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LowerBound <em>Lower Bound</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LowerBound
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLowerBound()
   * @generated
   */
  int LOWER_BOUND = 19;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.UpperBound <em>Upper Bound</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.UpperBound
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getUpperBound()
   * @generated
   */
  int UPPER_BOUND = 20;


  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel <em>LEntity Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LEntity Model</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel
   * @generated
   */
  EClass getLEntityModel();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel#getPackage()
   * @see #getLEntityModel()
   * @generated
   */
  EReference getLEntityModel_Package();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel#getImports()
   * @see #getLEntityModel()
   * @generated
   */
  EReference getLEntityModel_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel#getGenSettings <em>Gen Settings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gen Settings</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel#getGenSettings()
   * @see #getLEntityModel()
   * @generated
   */
  EReference getLEntityModel_GenSettings();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel#getTypes()
   * @see #getLEntityModel()
   * @generated
   */
  EReference getLEntityModel_Types();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LPackage <em>LPackage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LPackage</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LPackage
   * @generated
   */
  EClass getLPackage();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LPackage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LPackage#getName()
   * @see #getLPackage()
   * @generated
   */
  EAttribute getLPackage_Name();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LImport <em>LImport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LImport</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LImport
   * @generated
   */
  EClass getLImport();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LImport#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LImport#getImportedNamespace()
   * @see #getLImport()
   * @generated
   */
  EAttribute getLImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings <em>LGen Settings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LGen Settings</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings
   * @generated
   */
  EClass getLGenSettings();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings#isNoSource <em>No Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No Source</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings#isNoSource()
   * @see #getLGenSettings()
   * @generated
   */
  EAttribute getLGenSettings_NoSource();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings#isLifecycle <em>Lifecycle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lifecycle</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings#isLifecycle()
   * @see #getLGenSettings()
   * @generated
   */
  EAttribute getLGenSettings_Lifecycle();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings#isPropertyChangeSupport <em>Property Change Support</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Change Support</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings#isPropertyChangeSupport()
   * @see #getLGenSettings()
   * @generated
   */
  EAttribute getLGenSettings_PropertyChangeSupport();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LType <em>LType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LType</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LType
   * @generated
   */
  EClass getLType();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LType#getName()
   * @see #getLType()
   * @generated
   */
  EAttribute getLType_Name();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntity <em>LEntity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LEntity</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEntity
   * @generated
   */
  EClass getLEntity();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEntity#getSuperType()
   * @see #getLEntity()
   * @generated
   */
  EReference getLEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntity#getEntityMembers <em>Entity Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entity Members</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEntity#getEntityMembers()
   * @see #getLEntity()
   * @generated
   */
  EReference getLEntity_EntityMembers();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntityMember <em>LEntity Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LEntity Member</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEntityMember
   * @generated
   */
  EClass getLEntityMember();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntityMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEntityMember#getName()
   * @see #getLEntityMember()
   * @generated
   */
  EAttribute getLEntityMember_Name();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LReference <em>LReference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LReference</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LReference
   * @generated
   */
  EClass getLReference();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LReference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LReference#getType()
   * @see #getLReference()
   * @generated
   */
  EReference getLReference_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LReference#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LReference#getMultiplicity()
   * @see #getLReference()
   * @generated
   */
  EReference getLReference_Multiplicity();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LProperty <em>LProperty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LProperty</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LProperty
   * @generated
   */
  EClass getLProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LProperty#getType()
   * @see #getLProperty()
   * @generated
   */
  EReference getLProperty_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LProperty#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LProperty#getMultiplicity()
   * @see #getLProperty()
   * @generated
   */
  EReference getLProperty_Multiplicity();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LProperty#getDefaultValueLiteral <em>Default Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value Literal</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LProperty#getDefaultValueLiteral()
   * @see #getLProperty()
   * @generated
   */
  EAttribute getLProperty_DefaultValueLiteral();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LRefers <em>LRefers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LRefers</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LRefers
   * @generated
   */
  EClass getLRefers();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LContains <em>LContains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LContains</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LContains
   * @generated
   */
  EClass getLContains();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LContains#getOpposite <em>Opposite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opposite</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LContains#getOpposite()
   * @see #getLContains()
   * @generated
   */
  EReference getLContains_Opposite();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LContainer <em>LContainer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LContainer</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LContainer
   * @generated
   */
  EClass getLContainer();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LContainer#getOpposite <em>Opposite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opposite</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LContainer#getOpposite()
   * @see #getLContainer()
   * @generated
   */
  EReference getLContainer_Opposite();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEmbedds <em>LEmbedds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LEmbedds</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEmbedds
   * @generated
   */
  EClass getLEmbedds();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEmbedds#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEmbedds#getType()
   * @see #getLEmbedds()
   * @generated
   */
  EReference getLEmbedds_Type();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation <em>LOperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LOperation</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LOperation
   * @generated
   */
  EClass getLOperation();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getOperationAnnotation <em>Operation Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operation Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getOperationAnnotation()
   * @see #getLOperation()
   * @generated
   */
  EReference getLOperation_OperationAnnotation();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getModifier()
   * @see #getLOperation()
   * @generated
   */
  EReference getLOperation_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getType()
   * @see #getLOperation()
   * @generated
   */
  EReference getLOperation_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getParams()
   * @see #getLOperation()
   * @generated
   */
  EReference getLOperation_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LOperation#getBody()
   * @see #getLOperation()
   * @generated
   */
  EReference getLOperation_Body();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LModifier <em>LModifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LModifier</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LModifier
   * @generated
   */
  EClass getLModifier();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LModifier#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LModifier#isFinal()
   * @see #getLModifier()
   * @generated
   */
  EAttribute getLModifier_Final();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LModifier#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LModifier#isStatic()
   * @see #getLModifier()
   * @generated
   */
  EAttribute getLModifier_Static();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LModifier#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LModifier#getVisibility()
   * @see #getLModifier()
   * @generated
   */
  EAttribute getLModifier_Visibility();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEnum <em>LEnum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LEnum</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEnum
   * @generated
   */
  EClass getLEnum();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEnum#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEnum#getLiterals()
   * @see #getLEnum()
   * @generated
   */
  EReference getLEnum_Literals();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEnumLiteral <em>LEnum Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LEnum Literal</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEnumLiteral
   * @generated
   */
  EClass getLEnumLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEnumLiteral#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEnumLiteral#getName()
   * @see #getLEnumLiteral()
   * @generated
   */
  EAttribute getLEnumLiteral_Name();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity <em>LMultiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LMultiplicity</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity
   * @generated
   */
  EClass getLMultiplicity();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity#getLower()
   * @see #getLMultiplicity()
   * @generated
   */
  EAttribute getLMultiplicity_Lower();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity#getUpper()
   * @see #getLMultiplicity()
   * @generated
   */
  EAttribute getLMultiplicity_Upper();

  /**
   * Returns the meta object for enum '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LVisibility <em>LVisibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>LVisibility</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LVisibility
   * @generated
   */
  EEnum getLVisibility();

  /**
   * Returns the meta object for enum '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Lower Bound</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LowerBound
   * @generated
   */
  EEnum getLowerBound();

  /**
   * Returns the meta object for enum '{@link org.lunifera.metamodel.dsl.entity.entitymodel.UpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Upper Bound</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.UpperBound
   * @generated
   */
  EEnum getUpperBound();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EntitymodelFactory getEntitymodelFactory();

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
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityModelImpl <em>LEntity Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityModelImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLEntityModel()
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
     * The meta object literal for the '<em><b>Gen Settings</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LENTITY_MODEL__GEN_SETTINGS = eINSTANCE.getLEntityModel_GenSettings();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LENTITY_MODEL__TYPES = eINSTANCE.getLEntityModel_Types();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPackageImpl <em>LPackage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPackageImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLPackage()
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
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LImportImpl <em>LImport</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LImportImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLImport()
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
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LGenSettingsImpl <em>LGen Settings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LGenSettingsImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLGenSettings()
     * @generated
     */
    EClass LGEN_SETTINGS = eINSTANCE.getLGenSettings();

    /**
     * The meta object literal for the '<em><b>No Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LGEN_SETTINGS__NO_SOURCE = eINSTANCE.getLGenSettings_NoSource();

    /**
     * The meta object literal for the '<em><b>Lifecycle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LGEN_SETTINGS__LIFECYCLE = eINSTANCE.getLGenSettings_Lifecycle();

    /**
     * The meta object literal for the '<em><b>Property Change Support</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LGEN_SETTINGS__PROPERTY_CHANGE_SUPPORT = eINSTANCE.getLGenSettings_PropertyChangeSupport();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LTypeImpl <em>LType</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LTypeImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLType()
     * @generated
     */
    EClass LTYPE = eINSTANCE.getLType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LTYPE__NAME = eINSTANCE.getLType_Name();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityImpl <em>LEntity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLEntity()
     * @generated
     */
    EClass LENTITY = eINSTANCE.getLEntity();

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
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityMemberImpl <em>LEntity Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEntityMemberImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLEntityMember()
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
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LReferenceImpl <em>LReference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LReferenceImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLReference()
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
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl <em>LProperty</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLProperty()
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
     * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LPROPERTY__MULTIPLICITY = eINSTANCE.getLProperty_Multiplicity();

    /**
     * The meta object literal for the '<em><b>Default Value Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LPROPERTY__DEFAULT_VALUE_LITERAL = eINSTANCE.getLProperty_DefaultValueLiteral();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LRefersImpl <em>LRefers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LRefersImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLRefers()
     * @generated
     */
    EClass LREFERS = eINSTANCE.getLRefers();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LContainsImpl <em>LContains</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LContainsImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLContains()
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
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LContainerImpl <em>LContainer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LContainerImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLContainer()
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
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEmbeddsImpl <em>LEmbedds</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEmbeddsImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLEmbedds()
     * @generated
     */
    EClass LEMBEDDS = eINSTANCE.getLEmbedds();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEMBEDDS__TYPE = eINSTANCE.getLEmbedds_Type();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LOperationImpl <em>LOperation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LOperationImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLOperation()
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
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LModifierImpl <em>LModifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LModifierImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLModifier()
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
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEnumImpl <em>LEnum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEnumImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLEnum()
     * @generated
     */
    EClass LENUM = eINSTANCE.getLEnum();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LENUM__LITERALS = eINSTANCE.getLEnum_Literals();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEnumLiteralImpl <em>LEnum Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LEnumLiteralImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLEnumLiteral()
     * @generated
     */
    EClass LENUM_LITERAL = eINSTANCE.getLEnumLiteral();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENUM_LITERAL__NAME = eINSTANCE.getLEnumLiteral_Name();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LMultiplicityImpl <em>LMultiplicity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.LMultiplicityImpl
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLMultiplicity()
     * @generated
     */
    EClass LMULTIPLICITY = eINSTANCE.getLMultiplicity();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LMULTIPLICITY__LOWER = eINSTANCE.getLMultiplicity_Lower();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LMULTIPLICITY__UPPER = eINSTANCE.getLMultiplicity_Upper();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LVisibility <em>LVisibility</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.LVisibility
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLVisibility()
     * @generated
     */
    EEnum LVISIBILITY = eINSTANCE.getLVisibility();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LowerBound <em>Lower Bound</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.LowerBound
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getLowerBound()
     * @generated
     */
    EEnum LOWER_BOUND = eINSTANCE.getLowerBound();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.UpperBound <em>Upper Bound</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.UpperBound
     * @see org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelPackageImpl#getUpperBound()
     * @generated
     */
    EEnum UPPER_BOUND = eINSTANCE.getUpperBound();

  }

} //EntitymodelPackage
