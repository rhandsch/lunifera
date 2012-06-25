/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
   * The feature id for the '<em><b>Var Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__VAR_TYPE = EntityPackage.PROPERTY__VAR_TYPE;

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
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_ANNOTATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaEntityAnnotationImpl <em>Entity Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaEntityAnnotationImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJpaEntityAnnotation()
   * @generated
   */
  int JPA_ENTITY_ANNOTATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_ENTITY_ANNOTATION__NAME = JPA_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_ENTITY_ANNOTATION_FEATURE_COUNT = JPA_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPropertyAnnotationImpl <em>Property Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPropertyAnnotationImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJpaPropertyAnnotation()
   * @generated
   */
  int JPA_PROPERTY_ANNOTATION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_PROPERTY_ANNOTATION__NAME = JPA_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_PROPERTY_ANNOTATION_FEATURE_COUNT = JPA_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaReferenceAnnotationImpl <em>Reference Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaReferenceAnnotationImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJpaReferenceAnnotation()
   * @generated
   */
  int JPA_REFERENCE_ANNOTATION = 7;

  /**
   * The number of structural features of the '<em>Reference Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_REFERENCE_ANNOTATION_FEATURE_COUNT = JPA_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.EmbeddableAnnotationImpl <em>Embeddable Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.EmbeddableAnnotationImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getEmbeddableAnnotation()
   * @generated
   */
  int EMBEDDABLE_ANNOTATION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE_ANNOTATION__NAME = JPA_ENTITY_ANNOTATION__NAME;

  /**
   * The number of structural features of the '<em>Embeddable Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE_ANNOTATION_FEATURE_COUNT = JPA_ENTITY_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.CachableAnnotationImpl <em>Cachable Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.CachableAnnotationImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getCachableAnnotation()
   * @generated
   */
  int CACHABLE_ANNOTATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHABLE_ANNOTATION__NAME = JPA_ENTITY_ANNOTATION__NAME;

  /**
   * The number of structural features of the '<em>Cachable Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHABLE_ANNOTATION_FEATURE_COUNT = JPA_ENTITY_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.IdAnnotationImpl <em>Id Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.IdAnnotationImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getIdAnnotation()
   * @generated
   */
  int ID_ANNOTATION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_ANNOTATION__NAME = JPA_PROPERTY_ANNOTATION__NAME;

  /**
   * The number of structural features of the '<em>Id Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_ANNOTATION_FEATURE_COUNT = JPA_PROPERTY_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.NullableAnnotationImpl <em>Nullable Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.NullableAnnotationImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getNullableAnnotation()
   * @generated
   */
  int NULLABLE_ANNOTATION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULLABLE_ANNOTATION__NAME = JPA_PROPERTY_ANNOTATION__NAME;

  /**
   * The number of structural features of the '<em>Nullable Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULLABLE_ANNOTATION_FEATURE_COUNT = JPA_PROPERTY_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToManyAnnotationImpl <em>Many To Many Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToManyAnnotationImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getManyToManyAnnotation()
   * @generated
   */
  int MANY_TO_MANY_ANNOTATION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ANNOTATION__NAME = JPA_REFERENCE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ANNOTATION__TARGET_ENTITY = JPA_REFERENCE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ANNOTATION__MAPPED_BY = JPA_REFERENCE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Many To Many Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ANNOTATION_FEATURE_COUNT = JPA_REFERENCE_ANNOTATION_FEATURE_COUNT + 3;


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
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.JpaEntityAnnotation <em>Entity Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaEntityAnnotation
   * @generated
   */
  EClass getJpaEntityAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.JpaEntityAnnotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaEntityAnnotation#getName()
   * @see #getJpaEntityAnnotation()
   * @generated
   */
  EAttribute getJpaEntityAnnotation_Name();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.JpaPropertyAnnotation <em>Property Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPropertyAnnotation
   * @generated
   */
  EClass getJpaPropertyAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.JpaPropertyAnnotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPropertyAnnotation#getName()
   * @see #getJpaPropertyAnnotation()
   * @generated
   */
  EAttribute getJpaPropertyAnnotation_Name();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.JpaReferenceAnnotation <em>Reference Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaReferenceAnnotation
   * @generated
   */
  EClass getJpaReferenceAnnotation();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.EmbeddableAnnotation <em>Embeddable Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Embeddable Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.EmbeddableAnnotation
   * @generated
   */
  EClass getEmbeddableAnnotation();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.CachableAnnotation <em>Cachable Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cachable Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.CachableAnnotation
   * @generated
   */
  EClass getCachableAnnotation();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.IdAnnotation <em>Id Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.IdAnnotation
   * @generated
   */
  EClass getIdAnnotation();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.NullableAnnotation <em>Nullable Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nullable Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.NullableAnnotation
   * @generated
   */
  EClass getNullableAnnotation();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation <em>Many To Many Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Many To Many Annotation</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation
   * @generated
   */
  EClass getManyToManyAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation#getName()
   * @see #getManyToManyAnnotation()
   * @generated
   */
  EAttribute getManyToManyAnnotation_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation#getTargetEntity <em>Target Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Entity</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation#getTargetEntity()
   * @see #getManyToManyAnnotation()
   * @generated
   */
  EReference getManyToManyAnnotation_TargetEntity();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation#getMappedBy <em>Mapped By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapped By</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation#getMappedBy()
   * @see #getManyToManyAnnotation()
   * @generated
   */
  EAttribute getManyToManyAnnotation_MappedBy();

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
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaEntityAnnotationImpl <em>Entity Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaEntityAnnotationImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJpaEntityAnnotation()
     * @generated
     */
    EClass JPA_ENTITY_ANNOTATION = eINSTANCE.getJpaEntityAnnotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JPA_ENTITY_ANNOTATION__NAME = eINSTANCE.getJpaEntityAnnotation_Name();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPropertyAnnotationImpl <em>Property Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPropertyAnnotationImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJpaPropertyAnnotation()
     * @generated
     */
    EClass JPA_PROPERTY_ANNOTATION = eINSTANCE.getJpaPropertyAnnotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JPA_PROPERTY_ANNOTATION__NAME = eINSTANCE.getJpaPropertyAnnotation_Name();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaReferenceAnnotationImpl <em>Reference Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaReferenceAnnotationImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJpaReferenceAnnotation()
     * @generated
     */
    EClass JPA_REFERENCE_ANNOTATION = eINSTANCE.getJpaReferenceAnnotation();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.EmbeddableAnnotationImpl <em>Embeddable Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.EmbeddableAnnotationImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getEmbeddableAnnotation()
     * @generated
     */
    EClass EMBEDDABLE_ANNOTATION = eINSTANCE.getEmbeddableAnnotation();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.CachableAnnotationImpl <em>Cachable Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.CachableAnnotationImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getCachableAnnotation()
     * @generated
     */
    EClass CACHABLE_ANNOTATION = eINSTANCE.getCachableAnnotation();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.IdAnnotationImpl <em>Id Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.IdAnnotationImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getIdAnnotation()
     * @generated
     */
    EClass ID_ANNOTATION = eINSTANCE.getIdAnnotation();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.NullableAnnotationImpl <em>Nullable Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.NullableAnnotationImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getNullableAnnotation()
     * @generated
     */
    EClass NULLABLE_ANNOTATION = eINSTANCE.getNullableAnnotation();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToManyAnnotationImpl <em>Many To Many Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.ManyToManyAnnotationImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getManyToManyAnnotation()
     * @generated
     */
    EClass MANY_TO_MANY_ANNOTATION = eINSTANCE.getManyToManyAnnotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_MANY_ANNOTATION__NAME = eINSTANCE.getManyToManyAnnotation_Name();

    /**
     * The meta object literal for the '<em><b>Target Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANY_TO_MANY_ANNOTATION__TARGET_ENTITY = eINSTANCE.getManyToManyAnnotation_TargetEntity();

    /**
     * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_MANY_ANNOTATION__MAPPED_BY = eINSTANCE.getManyToManyAnnotation_MappedBy();

  }

} //JpaPackage
