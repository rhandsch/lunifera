/**
 */
package org.lunifera.metamodel.dsl.entity.entity;

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
 * @see org.lunifera.metamodel.dsl.entity.entity.EntityFactory
 * @model kind="package"
 * @generated
 */
public interface EntityPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "entity";

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
  String eNS_PREFIX = "entity";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EntityPackage eINSTANCE = org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl.init();

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.EntityModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityModelImpl
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getEntityModel()
   * @generated
   */
  int ENTITY_MODEL = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MODEL__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.PackageImpl
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.AbstractElementImpl
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.ImportImpl
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityImpl
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.AbstractFeatureImpl <em>Abstract Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.AbstractFeatureImpl
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getAbstractFeature()
   * @generated
   */
  int ABSTRACT_FEATURE = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FEATURE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FEATURE__NAME = 1;

  /**
   * The number of structural features of the '<em>Abstract Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.PropertyImpl
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = ABSTRACT_FEATURE__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = ABSTRACT_FEATURE__NAME;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = ABSTRACT_FEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.ReferenceImpl
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__TYPE = ABSTRACT_FEATURE__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = ABSTRACT_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Ref Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REF_TYPE = ABSTRACT_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__LOWER_BOUND = ABSTRACT_FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__UPPER_BOUND = ABSTRACT_FEATURE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = ABSTRACT_FEATURE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.EmbeddsImpl <em>Embedds</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EmbeddsImpl
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getEmbedds()
   * @generated
   */
  int EMBEDDS = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDS__TYPE = ABSTRACT_FEATURE__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDS__NAME = ABSTRACT_FEATURE__NAME;

  /**
   * The number of structural features of the '<em>Embedds</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDS_FEATURE_COUNT = ABSTRACT_FEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.OperationImpl
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__TYPE = ABSTRACT_FEATURE__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = ABSTRACT_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Operation Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OPERATION_ANNOTATION = ABSTRACT_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__MODIFIER = ABSTRACT_FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARAMS = ABSTRACT_FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__BODY = ABSTRACT_FEATURE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = ABSTRACT_FEATURE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.ModifierImpl <em>Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.ModifierImpl
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getModifier()
   * @generated
   */
  int MODIFIER = 10;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__FINAL = 0;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__STATIC = 1;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__VISIBILITY = 2;

  /**
   * The number of structural features of the '<em>Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entity.Visibility <em>Visibility</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entity.Visibility
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getVisibility()
   * @generated
   */
  int VISIBILITY = 11;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entity.RefType <em>Ref Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entity.RefType
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getRefType()
   * @generated
   */
  int REF_TYPE = 12;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.entity.entity.BoundLiteral <em>Bound Literal</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.entity.entity.BoundLiteral
   * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getBoundLiteral()
   * @generated
   */
  int BOUND_LITERAL = 13;


  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entity.EntityModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.EntityModel
   * @generated
   */
  EClass getEntityModel();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.entity.EntityModel#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.EntityModel#getPackage()
   * @see #getEntityModel()
   * @generated
   */
  EReference getEntityModel_Package();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.entity.EntityModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.EntityModel#getElements()
   * @see #getEntityModel()
   * @generated
   */
  EReference getEntityModel_Elements();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entity.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entity.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entity.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entity.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entity.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entity.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entity.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.entity.Entity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Entity#getSuperType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.entity.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Entity#getFeatures()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Features();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entity.AbstractFeature <em>Abstract Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Feature</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.AbstractFeature
   * @generated
   */
  EClass getAbstractFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.entity.AbstractFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.AbstractFeature#getType()
   * @see #getAbstractFeature()
   * @generated
   */
  EReference getAbstractFeature_Type();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entity.AbstractFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.AbstractFeature#getName()
   * @see #getAbstractFeature()
   * @generated
   */
  EAttribute getAbstractFeature_Name();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entity.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entity.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entity.Reference#getRefType <em>Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Reference#getRefType()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_RefType();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entity.Reference#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Reference#getLowerBound()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_LowerBound();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entity.Reference#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Bound</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Reference#getUpperBound()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_UpperBound();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entity.Embedds <em>Embedds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Embedds</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Embedds
   * @generated
   */
  EClass getEmbedds();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entity.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.entity.Operation#getOperationAnnotation <em>Operation Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operation Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Operation#getOperationAnnotation()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_OperationAnnotation();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.entity.Operation#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Operation#getModifier()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Modifier();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.entity.entity.Operation#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Operation#getParams()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.entity.entity.Operation#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Operation#getBody()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Body();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.entity.entity.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modifier</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Modifier
   * @generated
   */
  EClass getModifier();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entity.Modifier#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Modifier#isFinal()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Final();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entity.Modifier#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Modifier#isStatic()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Static();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.entity.entity.Modifier#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Modifier#getVisibility()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Visibility();

  /**
   * Returns the meta object for enum '{@link org.lunifera.metamodel.dsl.entity.entity.Visibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.Visibility
   * @generated
   */
  EEnum getVisibility();

  /**
   * Returns the meta object for enum '{@link org.lunifera.metamodel.dsl.entity.entity.RefType <em>Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Ref Type</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.RefType
   * @generated
   */
  EEnum getRefType();

  /**
   * Returns the meta object for enum '{@link org.lunifera.metamodel.dsl.entity.entity.BoundLiteral <em>Bound Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Bound Literal</em>'.
   * @see org.lunifera.metamodel.dsl.entity.entity.BoundLiteral
   * @generated
   */
  EEnum getBoundLiteral();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EntityFactory getEntityFactory();

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
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.EntityModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityModelImpl
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getEntityModel()
     * @generated
     */
    EClass ENTITY_MODEL = eINSTANCE.getEntityModel();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_MODEL__PACKAGE = eINSTANCE.getEntityModel_Package();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_MODEL__ELEMENTS = eINSTANCE.getEntityModel_Elements();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.PackageImpl
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.AbstractElementImpl
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.ImportImpl
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityImpl
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.AbstractFeatureImpl <em>Abstract Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.AbstractFeatureImpl
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getAbstractFeature()
     * @generated
     */
    EClass ABSTRACT_FEATURE = eINSTANCE.getAbstractFeature();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_FEATURE__TYPE = eINSTANCE.getAbstractFeature_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_FEATURE__NAME = eINSTANCE.getAbstractFeature_Name();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.PropertyImpl
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.ReferenceImpl
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Ref Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__REF_TYPE = eINSTANCE.getReference_RefType();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__LOWER_BOUND = eINSTANCE.getReference_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__UPPER_BOUND = eINSTANCE.getReference_UpperBound();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.EmbeddsImpl <em>Embedds</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EmbeddsImpl
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getEmbedds()
     * @generated
     */
    EClass EMBEDDS = eINSTANCE.getEmbedds();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.OperationImpl
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Operation Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__OPERATION_ANNOTATION = eINSTANCE.getOperation_OperationAnnotation();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__MODIFIER = eINSTANCE.getOperation_Modifier();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__PARAMS = eINSTANCE.getOperation_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__BODY = eINSTANCE.getOperation_Body();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entity.impl.ModifierImpl <em>Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.ModifierImpl
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getModifier()
     * @generated
     */
    EClass MODIFIER = eINSTANCE.getModifier();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__FINAL = eINSTANCE.getModifier_Final();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__STATIC = eINSTANCE.getModifier_Static();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__VISIBILITY = eINSTANCE.getModifier_Visibility();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entity.Visibility <em>Visibility</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entity.Visibility
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getVisibility()
     * @generated
     */
    EEnum VISIBILITY = eINSTANCE.getVisibility();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entity.RefType <em>Ref Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entity.RefType
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getRefType()
     * @generated
     */
    EEnum REF_TYPE = eINSTANCE.getRefType();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.entity.entity.BoundLiteral <em>Bound Literal</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.entity.entity.BoundLiteral
     * @see org.lunifera.metamodel.dsl.entity.entity.impl.EntityPackageImpl#getBoundLiteral()
     * @generated
     */
    EEnum BOUND_LITERAL = eINSTANCE.getBoundLiteral();

  }

} //EntityPackage
