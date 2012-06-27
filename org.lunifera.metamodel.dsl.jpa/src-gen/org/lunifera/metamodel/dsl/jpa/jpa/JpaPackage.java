/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.lunifera.metamodel.dsl.entity.entity.EntityPackage;

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
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaFactory
 * @model kind="package"
 * @generated
 */
public interface JpaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jpa";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lunifera.org/metamodel/dsl/jpa/Jpa";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jpa";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JpaPackage eINSTANCE = org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl.init();

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JModelImpl <em>JModel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JModelImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJModel()
   * @generated
   */
  int JMODEL = 0;

  /**
   * The feature id for the '<em><b>Jmodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JMODEL__JMODEL = 0;

  /**
   * The number of structural features of the '<em>JModel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.EntityImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = EntityPackage.ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = EntityPackage.ENTITY__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = EntityPackage.ENTITY__FEATURES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ANNOTATIONS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.PropertyImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = EntityPackage.PROPERTY__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = EntityPackage.PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__ANNOTATIONS = EntityPackage.PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = EntityPackage.PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ReferenceImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__TYPE = EntityPackage.REFERENCE__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = EntityPackage.REFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Ref Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REF_TYPE = EntityPackage.REFERENCE__REF_TYPE;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__LOWER_BOUND = EntityPackage.REFERENCE__LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__UPPER_BOUND = EntityPackage.REFERENCE__UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__ANNOTATIONS = EntityPackage.REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = EntityPackage.REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaAnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaAnnotationImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJpaAnnotation()
   * @generated
   */
  int JPA_ANNOTATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_ANNOTATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_ANNOTATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.EntityAnnotationImpl <em>Entity Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.EntityAnnotationImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getEntityAnnotation()
   * @generated
   */
  int ENTITY_ANNOTATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ANNOTATION__NAME = JPA_ANNOTATION__NAME;

  /**
   * The number of structural features of the '<em>Entity Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ANNOTATION_FEATURE_COUNT = JPA_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.PropertyAnnotationImpl <em>Property Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.PropertyAnnotationImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getPropertyAnnotation()
   * @generated
   */
  int PROPERTY_ANNOTATION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ANNOTATION__NAME = JPA_ANNOTATION__NAME;

  /**
   * The number of structural features of the '<em>Property Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ANNOTATION_FEATURE_COUNT = JPA_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ReferenceAnnotationImpl <em>Reference Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ReferenceAnnotationImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getReferenceAnnotation()
   * @generated
   */
  int REFERENCE_ANNOTATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_ANNOTATION__NAME = JPA_ANNOTATION__NAME;

  /**
   * The number of structural features of the '<em>Reference Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_ANNOTATION_FEATURE_COUNT = JPA_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.EmbeddableAnnotImpl <em>Embeddable Annot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.EmbeddableAnnotImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getEmbeddableAnnot()
   * @generated
   */
  int EMBEDDABLE_ANNOT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE_ANNOT__NAME = ENTITY_ANNOTATION__NAME;

  /**
   * The number of structural features of the '<em>Embeddable Annot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE_ANNOT_FEATURE_COUNT = ENTITY_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.CachableAnnotImpl <em>Cachable Annot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.CachableAnnotImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getCachableAnnot()
   * @generated
   */
  int CACHABLE_ANNOT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHABLE_ANNOT__NAME = ENTITY_ANNOTATION__NAME;

  /**
   * The number of structural features of the '<em>Cachable Annot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHABLE_ANNOT_FEATURE_COUNT = ENTITY_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.IdAnnotImpl <em>Id Annot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.IdAnnotImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getIdAnnot()
   * @generated
   */
  int ID_ANNOT = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_ANNOT__NAME = PROPERTY_ANNOTATION__NAME;

  /**
   * The number of structural features of the '<em>Id Annot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_ANNOT_FEATURE_COUNT = PROPERTY_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.NullableAnnotImpl <em>Nullable Annot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.NullableAnnotImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getNullableAnnot()
   * @generated
   */
  int NULLABLE_ANNOT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULLABLE_ANNOT__NAME = PROPERTY_ANNOTATION__NAME;

  /**
   * The number of structural features of the '<em>Nullable Annot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULLABLE_ANNOT_FEATURE_COUNT = PROPERTY_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.UniqueAnnotImpl <em>Unique Annot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.UniqueAnnotImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getUniqueAnnot()
   * @generated
   */
  int UNIQUE_ANNOT = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_ANNOT__NAME = PROPERTY_ANNOTATION__NAME;

  /**
   * The number of structural features of the '<em>Unique Annot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_ANNOT_FEATURE_COUNT = PROPERTY_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.LobAnnotImpl <em>Lob Annot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.LobAnnotImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getLobAnnot()
   * @generated
   */
  int LOB_ANNOT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOB_ANNOT__NAME = PROPERTY_ANNOTATION__NAME;

  /**
   * The number of structural features of the '<em>Lob Annot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOB_ANNOT_FEATURE_COUNT = PROPERTY_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToManyAnnotImpl <em>Many To Many Annot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToManyAnnotImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getManyToManyAnnot()
   * @generated
   */
  int MANY_TO_MANY_ANNOT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ANNOT__NAME = REFERENCE_ANNOTATION__NAME;

  /**
   * The feature id for the '<em><b>Target Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ANNOT__TARGET_ENTITY = REFERENCE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ANNOT__MAPPED_BY = REFERENCE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cascade</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ANNOT__CASCADE = REFERENCE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ANNOT__FETCH = REFERENCE_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Many To Many Annot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ANNOT_FEATURE_COUNT = REFERENCE_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToOneAnnotImpl <em>Many To One Annot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToOneAnnotImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getManyToOneAnnot()
   * @generated
   */
  int MANY_TO_ONE_ANNOT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE_ANNOT__NAME = REFERENCE_ANNOTATION__NAME;

  /**
   * The feature id for the '<em><b>Target Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE_ANNOT__TARGET_ENTITY = REFERENCE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE_ANNOT__MAPPED_BY = REFERENCE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cascade</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE_ANNOT__CASCADE = REFERENCE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE_ANNOT__FETCH = REFERENCE_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Many To One Annot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE_ANNOT_FEATURE_COUNT = REFERENCE_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToManyAnnotImpl <em>One To Many Annot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToManyAnnotImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getOneToManyAnnot()
   * @generated
   */
  int ONE_TO_MANY_ANNOT = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY_ANNOT__NAME = REFERENCE_ANNOTATION__NAME;

  /**
   * The feature id for the '<em><b>Target Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY_ANNOT__TARGET_ENTITY = REFERENCE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mapped By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY_ANNOT__MAPPED_BY = REFERENCE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cascade</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY_ANNOT__CASCADE = REFERENCE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY_ANNOT__FETCH = REFERENCE_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Orphan Removal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY_ANNOT__ORPHAN_REMOVAL = REFERENCE_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>One To Many Annot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY_ANNOT_FEATURE_COUNT = REFERENCE_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToOneAnnotImpl <em>One To One Annot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToOneAnnotImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getOneToOneAnnot()
   * @generated
   */
  int ONE_TO_ONE_ANNOT = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE_ANNOT__NAME = REFERENCE_ANNOTATION__NAME;

  /**
   * The feature id for the '<em><b>Target Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE_ANNOT__TARGET_ENTITY = REFERENCE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE_ANNOT__CLASS = REFERENCE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE_ANNOT__MAPPED_BY = REFERENCE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Cascade</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE_ANNOT__CASCADE = REFERENCE_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Orphan Removal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE_ANNOT__ORPHAN_REMOVAL = REFERENCE_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE_ANNOT__FETCH = REFERENCE_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>One To One Annot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE_ANNOT_FEATURE_COUNT = REFERENCE_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamTargetEntityImpl <em>Param Target Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamTargetEntityImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getParamTargetEntity()
   * @generated
   */
  int PARAM_TARGET_ENTITY = 18;

  /**
   * The feature id for the '<em><b>Target Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_TARGET_ENTITY__TARGET_ENTITY = 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_TARGET_ENTITY__CLASS = 1;

  /**
   * The number of structural features of the '<em>Param Target Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_TARGET_ENTITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamMappedByImpl <em>Param Mapped By</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamMappedByImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getParamMappedBy()
   * @generated
   */
  int PARAM_MAPPED_BY = 19;

  /**
   * The feature id for the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_MAPPED_BY__MAPPED_BY = 0;

  /**
   * The number of structural features of the '<em>Param Mapped By</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_MAPPED_BY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamCascadeImpl <em>Param Cascade</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamCascadeImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getParamCascade()
   * @generated
   */
  int PARAM_CASCADE = 20;

  /**
   * The feature id for the '<em><b>Cascade</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_CASCADE__CASCADE = 0;

  /**
   * The number of structural features of the '<em>Param Cascade</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_CASCADE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamFetchImpl <em>Param Fetch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamFetchImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getParamFetch()
   * @generated
   */
  int PARAM_FETCH = 21;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FETCH__FETCH = 0;

  /**
   * The number of structural features of the '<em>Param Fetch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FETCH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamOrphanRemovalImpl <em>Param Orphan Removal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamOrphanRemovalImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getParamOrphanRemoval()
   * @generated
   */
  int PARAM_ORPHAN_REMOVAL = 22;

  /**
   * The feature id for the '<em><b>Orphan Removal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_ORPHAN_REMOVAL__ORPHAN_REMOVAL = 0;

  /**
   * The number of structural features of the '<em>Param Orphan Removal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_ORPHAN_REMOVAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.CascadeType <em>Cascade Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.CascadeType
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getCascadeType()
   * @generated
   */
  int CASCADE_TYPE = 23;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.FetchType <em>Fetch Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.FetchType
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getFetchType()
   * @generated
   */
  int FETCH_TYPE = 24;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.booleanType <em>boolean Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.booleanType
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getbooleanType()
   * @generated
   */
  int BOOLEAN_TYPE = 25;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.classSuffix <em>class Suffix</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.classSuffix
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getclassSuffix()
   * @generated
   */
  int CLASS_SUFFIX = 26;


  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.JModel <em>JModel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JModel</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JModel
   * @generated
   */
  EClass getJModel();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.jpa.jpa.JModel#getJmodel <em>Jmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Jmodel</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JModel#getJmodel()
   * @see #getJModel()
   * @generated
   */
  EReference getJModel_Jmodel();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.jpa.jpa.Entity#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.Entity#getAnnotations()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Annotations();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.jpa.jpa.Property#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.Property#getAnnotations()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Annotations();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.jpa.jpa.Reference#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.Reference#getAnnotations()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Annotations();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.JpaAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaAnnotation
   * @generated
   */
  EClass getJpaAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.JpaAnnotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaAnnotation#getName()
   * @see #getJpaAnnotation()
   * @generated
   */
  EAttribute getJpaAnnotation_Name();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.EntityAnnotation <em>Entity Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.EntityAnnotation
   * @generated
   */
  EClass getEntityAnnotation();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.PropertyAnnotation <em>Property Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.PropertyAnnotation
   * @generated
   */
  EClass getPropertyAnnotation();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ReferenceAnnotation <em>Reference Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ReferenceAnnotation
   * @generated
   */
  EClass getReferenceAnnotation();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.EmbeddableAnnot <em>Embeddable Annot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Embeddable Annot</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.EmbeddableAnnot
   * @generated
   */
  EClass getEmbeddableAnnot();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.CachableAnnot <em>Cachable Annot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cachable Annot</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.CachableAnnot
   * @generated
   */
  EClass getCachableAnnot();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.IdAnnot <em>Id Annot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Annot</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.IdAnnot
   * @generated
   */
  EClass getIdAnnot();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.NullableAnnot <em>Nullable Annot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nullable Annot</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.NullableAnnot
   * @generated
   */
  EClass getNullableAnnot();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.UniqueAnnot <em>Unique Annot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unique Annot</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.UniqueAnnot
   * @generated
   */
  EClass getUniqueAnnot();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.LobAnnot <em>Lob Annot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lob Annot</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.LobAnnot
   * @generated
   */
  EClass getLobAnnot();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnot <em>Many To Many Annot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Many To Many Annot</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnot
   * @generated
   */
  EClass getManyToManyAnnot();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnot#getTargetEntity <em>Target Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Entity</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnot#getTargetEntity()
   * @see #getManyToManyAnnot()
   * @generated
   */
  EReference getManyToManyAnnot_TargetEntity();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnot#getMappedBy <em>Mapped By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapped By</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnot#getMappedBy()
   * @see #getManyToManyAnnot()
   * @generated
   */
  EAttribute getManyToManyAnnot_MappedBy();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnot#getCascade <em>Cascade</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cascade</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnot#getCascade()
   * @see #getManyToManyAnnot()
   * @generated
   */
  EAttribute getManyToManyAnnot_Cascade();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnot#getFetch <em>Fetch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fetch</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnot#getFetch()
   * @see #getManyToManyAnnot()
   * @generated
   */
  EAttribute getManyToManyAnnot_Fetch();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToOneAnnot <em>Many To One Annot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Many To One Annot</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToOneAnnot
   * @generated
   */
  EClass getManyToOneAnnot();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToOneAnnot#getTargetEntity <em>Target Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Entity</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToOneAnnot#getTargetEntity()
   * @see #getManyToOneAnnot()
   * @generated
   */
  EReference getManyToOneAnnot_TargetEntity();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToOneAnnot#getMappedBy <em>Mapped By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapped By</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToOneAnnot#getMappedBy()
   * @see #getManyToOneAnnot()
   * @generated
   */
  EAttribute getManyToOneAnnot_MappedBy();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToOneAnnot#getCascade <em>Cascade</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cascade</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToOneAnnot#getCascade()
   * @see #getManyToOneAnnot()
   * @generated
   */
  EAttribute getManyToOneAnnot_Cascade();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToOneAnnot#getFetch <em>Fetch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fetch</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToOneAnnot#getFetch()
   * @see #getManyToOneAnnot()
   * @generated
   */
  EAttribute getManyToOneAnnot_Fetch();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot <em>One To Many Annot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>One To Many Annot</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot
   * @generated
   */
  EClass getOneToManyAnnot();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getTargetEntity <em>Target Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Entity</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getTargetEntity()
   * @see #getOneToManyAnnot()
   * @generated
   */
  EReference getOneToManyAnnot_TargetEntity();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getMappedBy <em>Mapped By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapped By</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getMappedBy()
   * @see #getOneToManyAnnot()
   * @generated
   */
  EReference getOneToManyAnnot_MappedBy();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getCascade <em>Cascade</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cascade</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getCascade()
   * @see #getOneToManyAnnot()
   * @generated
   */
  EReference getOneToManyAnnot_Cascade();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getFetch <em>Fetch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fetch</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getFetch()
   * @see #getOneToManyAnnot()
   * @generated
   */
  EReference getOneToManyAnnot_Fetch();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getOrphanRemoval <em>Orphan Removal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Orphan Removal</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getOrphanRemoval()
   * @see #getOneToManyAnnot()
   * @generated
   */
  EReference getOneToManyAnnot_OrphanRemoval();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot <em>One To One Annot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>One To One Annot</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot
   * @generated
   */
  EClass getOneToOneAnnot();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getTargetEntity <em>Target Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Entity</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getTargetEntity()
   * @see #getOneToOneAnnot()
   * @generated
   */
  EReference getOneToOneAnnot_TargetEntity();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getClass_()
   * @see #getOneToOneAnnot()
   * @generated
   */
  EAttribute getOneToOneAnnot_Class();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getMappedBy <em>Mapped By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapped By</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getMappedBy()
   * @see #getOneToOneAnnot()
   * @generated
   */
  EAttribute getOneToOneAnnot_MappedBy();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getCascade <em>Cascade</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cascade</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getCascade()
   * @see #getOneToOneAnnot()
   * @generated
   */
  EAttribute getOneToOneAnnot_Cascade();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getOrphanRemoval <em>Orphan Removal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orphan Removal</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getOrphanRemoval()
   * @see #getOneToOneAnnot()
   * @generated
   */
  EAttribute getOneToOneAnnot_OrphanRemoval();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getFetch <em>Fetch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fetch</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getFetch()
   * @see #getOneToOneAnnot()
   * @generated
   */
  EAttribute getOneToOneAnnot_Fetch();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity <em>Param Target Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Target Entity</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity
   * @generated
   */
  EClass getParamTargetEntity();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity#getTargetEntity <em>Target Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Entity</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity#getTargetEntity()
   * @see #getParamTargetEntity()
   * @generated
   */
  EReference getParamTargetEntity_TargetEntity();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity#getClass_()
   * @see #getParamTargetEntity()
   * @generated
   */
  EAttribute getParamTargetEntity_Class();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamMappedBy <em>Param Mapped By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Mapped By</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamMappedBy
   * @generated
   */
  EClass getParamMappedBy();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamMappedBy#getMappedBy <em>Mapped By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapped By</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamMappedBy#getMappedBy()
   * @see #getParamMappedBy()
   * @generated
   */
  EAttribute getParamMappedBy_MappedBy();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamCascade <em>Param Cascade</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Cascade</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamCascade
   * @generated
   */
  EClass getParamCascade();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamCascade#getCascade <em>Cascade</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cascade</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamCascade#getCascade()
   * @see #getParamCascade()
   * @generated
   */
  EAttribute getParamCascade_Cascade();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamFetch <em>Param Fetch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Fetch</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamFetch
   * @generated
   */
  EClass getParamFetch();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamFetch#getFetch <em>Fetch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fetch</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamFetch#getFetch()
   * @see #getParamFetch()
   * @generated
   */
  EAttribute getParamFetch_Fetch();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamOrphanRemoval <em>Param Orphan Removal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Orphan Removal</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamOrphanRemoval
   * @generated
   */
  EClass getParamOrphanRemoval();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamOrphanRemoval#getOrphanRemoval <em>Orphan Removal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orphan Removal</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamOrphanRemoval#getOrphanRemoval()
   * @see #getParamOrphanRemoval()
   * @generated
   */
  EAttribute getParamOrphanRemoval_OrphanRemoval();

  /**
   * Returns the meta object for enum '{@link org.lunifera.metamodel.dsl.jpa.jpa.CascadeType <em>Cascade Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cascade Type</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.CascadeType
   * @generated
   */
  EEnum getCascadeType();

  /**
   * Returns the meta object for enum '{@link org.lunifera.metamodel.dsl.jpa.jpa.FetchType <em>Fetch Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Fetch Type</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.FetchType
   * @generated
   */
  EEnum getFetchType();

  /**
   * Returns the meta object for enum '{@link org.lunifera.metamodel.dsl.jpa.jpa.booleanType <em>boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>boolean Type</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.booleanType
   * @generated
   */
  EEnum getbooleanType();

  /**
   * Returns the meta object for enum '{@link org.lunifera.metamodel.dsl.jpa.jpa.classSuffix <em>class Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>class Suffix</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.classSuffix
   * @generated
   */
  EEnum getclassSuffix();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JpaFactory getJpaFactory();

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
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JModelImpl <em>JModel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JModelImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJModel()
     * @generated
     */
    EClass JMODEL = eINSTANCE.getJModel();

    /**
     * The meta object literal for the '<em><b>Jmodel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JMODEL__JMODEL = eINSTANCE.getJModel_Jmodel();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.EntityImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ANNOTATIONS = eINSTANCE.getEntity_Annotations();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.PropertyImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__ANNOTATIONS = eINSTANCE.getProperty_Annotations();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ReferenceImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__ANNOTATIONS = eINSTANCE.getReference_Annotations();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaAnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaAnnotationImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJpaAnnotation()
     * @generated
     */
    EClass JPA_ANNOTATION = eINSTANCE.getJpaAnnotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JPA_ANNOTATION__NAME = eINSTANCE.getJpaAnnotation_Name();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.EntityAnnotationImpl <em>Entity Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.EntityAnnotationImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getEntityAnnotation()
     * @generated
     */
    EClass ENTITY_ANNOTATION = eINSTANCE.getEntityAnnotation();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.PropertyAnnotationImpl <em>Property Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.PropertyAnnotationImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getPropertyAnnotation()
     * @generated
     */
    EClass PROPERTY_ANNOTATION = eINSTANCE.getPropertyAnnotation();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ReferenceAnnotationImpl <em>Reference Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ReferenceAnnotationImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getReferenceAnnotation()
     * @generated
     */
    EClass REFERENCE_ANNOTATION = eINSTANCE.getReferenceAnnotation();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.EmbeddableAnnotImpl <em>Embeddable Annot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.EmbeddableAnnotImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getEmbeddableAnnot()
     * @generated
     */
    EClass EMBEDDABLE_ANNOT = eINSTANCE.getEmbeddableAnnot();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.CachableAnnotImpl <em>Cachable Annot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.CachableAnnotImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getCachableAnnot()
     * @generated
     */
    EClass CACHABLE_ANNOT = eINSTANCE.getCachableAnnot();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.IdAnnotImpl <em>Id Annot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.IdAnnotImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getIdAnnot()
     * @generated
     */
    EClass ID_ANNOT = eINSTANCE.getIdAnnot();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.NullableAnnotImpl <em>Nullable Annot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.NullableAnnotImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getNullableAnnot()
     * @generated
     */
    EClass NULLABLE_ANNOT = eINSTANCE.getNullableAnnot();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.UniqueAnnotImpl <em>Unique Annot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.UniqueAnnotImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getUniqueAnnot()
     * @generated
     */
    EClass UNIQUE_ANNOT = eINSTANCE.getUniqueAnnot();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.LobAnnotImpl <em>Lob Annot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.LobAnnotImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getLobAnnot()
     * @generated
     */
    EClass LOB_ANNOT = eINSTANCE.getLobAnnot();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToManyAnnotImpl <em>Many To Many Annot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToManyAnnotImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getManyToManyAnnot()
     * @generated
     */
    EClass MANY_TO_MANY_ANNOT = eINSTANCE.getManyToManyAnnot();

    /**
     * The meta object literal for the '<em><b>Target Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANY_TO_MANY_ANNOT__TARGET_ENTITY = eINSTANCE.getManyToManyAnnot_TargetEntity();

    /**
     * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_MANY_ANNOT__MAPPED_BY = eINSTANCE.getManyToManyAnnot_MappedBy();

    /**
     * The meta object literal for the '<em><b>Cascade</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_MANY_ANNOT__CASCADE = eINSTANCE.getManyToManyAnnot_Cascade();

    /**
     * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_MANY_ANNOT__FETCH = eINSTANCE.getManyToManyAnnot_Fetch();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToOneAnnotImpl <em>Many To One Annot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToOneAnnotImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getManyToOneAnnot()
     * @generated
     */
    EClass MANY_TO_ONE_ANNOT = eINSTANCE.getManyToOneAnnot();

    /**
     * The meta object literal for the '<em><b>Target Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANY_TO_ONE_ANNOT__TARGET_ENTITY = eINSTANCE.getManyToOneAnnot_TargetEntity();

    /**
     * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_ONE_ANNOT__MAPPED_BY = eINSTANCE.getManyToOneAnnot_MappedBy();

    /**
     * The meta object literal for the '<em><b>Cascade</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_ONE_ANNOT__CASCADE = eINSTANCE.getManyToOneAnnot_Cascade();

    /**
     * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_ONE_ANNOT__FETCH = eINSTANCE.getManyToOneAnnot_Fetch();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToManyAnnotImpl <em>One To Many Annot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToManyAnnotImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getOneToManyAnnot()
     * @generated
     */
    EClass ONE_TO_MANY_ANNOT = eINSTANCE.getOneToManyAnnot();

    /**
     * The meta object literal for the '<em><b>Target Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_TO_MANY_ANNOT__TARGET_ENTITY = eINSTANCE.getOneToManyAnnot_TargetEntity();

    /**
     * The meta object literal for the '<em><b>Mapped By</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_TO_MANY_ANNOT__MAPPED_BY = eINSTANCE.getOneToManyAnnot_MappedBy();

    /**
     * The meta object literal for the '<em><b>Cascade</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_TO_MANY_ANNOT__CASCADE = eINSTANCE.getOneToManyAnnot_Cascade();

    /**
     * The meta object literal for the '<em><b>Fetch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_TO_MANY_ANNOT__FETCH = eINSTANCE.getOneToManyAnnot_Fetch();

    /**
     * The meta object literal for the '<em><b>Orphan Removal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_TO_MANY_ANNOT__ORPHAN_REMOVAL = eINSTANCE.getOneToManyAnnot_OrphanRemoval();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToOneAnnotImpl <em>One To One Annot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.OneToOneAnnotImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getOneToOneAnnot()
     * @generated
     */
    EClass ONE_TO_ONE_ANNOT = eINSTANCE.getOneToOneAnnot();

    /**
     * The meta object literal for the '<em><b>Target Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_TO_ONE_ANNOT__TARGET_ENTITY = eINSTANCE.getOneToOneAnnot_TargetEntity();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_TO_ONE_ANNOT__CLASS = eINSTANCE.getOneToOneAnnot_Class();

    /**
     * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_TO_ONE_ANNOT__MAPPED_BY = eINSTANCE.getOneToOneAnnot_MappedBy();

    /**
     * The meta object literal for the '<em><b>Cascade</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_TO_ONE_ANNOT__CASCADE = eINSTANCE.getOneToOneAnnot_Cascade();

    /**
     * The meta object literal for the '<em><b>Orphan Removal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_TO_ONE_ANNOT__ORPHAN_REMOVAL = eINSTANCE.getOneToOneAnnot_OrphanRemoval();

    /**
     * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_TO_ONE_ANNOT__FETCH = eINSTANCE.getOneToOneAnnot_Fetch();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamTargetEntityImpl <em>Param Target Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamTargetEntityImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getParamTargetEntity()
     * @generated
     */
    EClass PARAM_TARGET_ENTITY = eINSTANCE.getParamTargetEntity();

    /**
     * The meta object literal for the '<em><b>Target Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_TARGET_ENTITY__TARGET_ENTITY = eINSTANCE.getParamTargetEntity_TargetEntity();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_TARGET_ENTITY__CLASS = eINSTANCE.getParamTargetEntity_Class();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamMappedByImpl <em>Param Mapped By</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamMappedByImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getParamMappedBy()
     * @generated
     */
    EClass PARAM_MAPPED_BY = eINSTANCE.getParamMappedBy();

    /**
     * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_MAPPED_BY__MAPPED_BY = eINSTANCE.getParamMappedBy_MappedBy();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamCascadeImpl <em>Param Cascade</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamCascadeImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getParamCascade()
     * @generated
     */
    EClass PARAM_CASCADE = eINSTANCE.getParamCascade();

    /**
     * The meta object literal for the '<em><b>Cascade</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_CASCADE__CASCADE = eINSTANCE.getParamCascade_Cascade();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamFetchImpl <em>Param Fetch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamFetchImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getParamFetch()
     * @generated
     */
    EClass PARAM_FETCH = eINSTANCE.getParamFetch();

    /**
     * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_FETCH__FETCH = eINSTANCE.getParamFetch_Fetch();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamOrphanRemovalImpl <em>Param Orphan Removal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ParamOrphanRemovalImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getParamOrphanRemoval()
     * @generated
     */
    EClass PARAM_ORPHAN_REMOVAL = eINSTANCE.getParamOrphanRemoval();

    /**
     * The meta object literal for the '<em><b>Orphan Removal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_ORPHAN_REMOVAL__ORPHAN_REMOVAL = eINSTANCE.getParamOrphanRemoval_OrphanRemoval();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.CascadeType <em>Cascade Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.CascadeType
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getCascadeType()
     * @generated
     */
    EEnum CASCADE_TYPE = eINSTANCE.getCascadeType();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.FetchType <em>Fetch Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.FetchType
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getFetchType()
     * @generated
     */
    EEnum FETCH_TYPE = eINSTANCE.getFetchType();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.booleanType <em>boolean Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.booleanType
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getbooleanType()
     * @generated
     */
    EEnum BOOLEAN_TYPE = eINSTANCE.getbooleanType();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.classSuffix <em>class Suffix</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.classSuffix
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getclassSuffix()
     * @generated
     */
    EEnum CLASS_SUFFIX = eINSTANCE.getclassSuffix();

  }

} //JpaPackage
