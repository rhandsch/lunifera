/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.lunifera.metamodel.dsl.entity.entity.EntityPackage;

import org.lunifera.metamodel.dsl.jpa.jpa.CachableAnnotation;
import org.lunifera.metamodel.dsl.jpa.jpa.EmbeddableAnnotation;
import org.lunifera.metamodel.dsl.jpa.jpa.Entity;
import org.lunifera.metamodel.dsl.jpa.jpa.EntityAnnotation;
import org.lunifera.metamodel.dsl.jpa.jpa.IdAnnotation;
import org.lunifera.metamodel.dsl.jpa.jpa.JModel;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaAnnotation;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaFactory;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage;
import org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation;
import org.lunifera.metamodel.dsl.jpa.jpa.NullableAnnotation;
import org.lunifera.metamodel.dsl.jpa.jpa.Property;
import org.lunifera.metamodel.dsl.jpa.jpa.PropertyAnnotation;
import org.lunifera.metamodel.dsl.jpa.jpa.Reference;
import org.lunifera.metamodel.dsl.jpa.jpa.ReferenceAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JpaPackageImpl extends EPackageImpl implements JpaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jpaAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass embeddableAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cachableAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullableAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass manyToManyAnnotationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JpaPackageImpl()
  {
    super(eNS_URI, JpaFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link JpaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JpaPackage init()
  {
    if (isInited) return (JpaPackage)EPackage.Registry.INSTANCE.getEPackage(JpaPackage.eNS_URI);

    // Obtain or create and register package
    JpaPackageImpl theJpaPackage = (JpaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JpaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JpaPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EntityPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theJpaPackage.createPackageContents();

    // Initialize created meta-data
    theJpaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJpaPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JpaPackage.eNS_URI, theJpaPackage);
    return theJpaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJModel()
  {
    return jModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJModel_Jmodel()
  {
    return (EReference)jModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Annotations()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Annotations()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_Annotations()
  {
    return (EReference)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJpaAnnotation()
  {
    return jpaAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityAnnotation()
  {
    return entityAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityAnnotation_Name()
  {
    return (EAttribute)entityAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyAnnotation()
  {
    return propertyAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyAnnotation_Name()
  {
    return (EAttribute)propertyAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceAnnotation()
  {
    return referenceAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmbeddableAnnotation()
  {
    return embeddableAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCachableAnnotation()
  {
    return cachableAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdAnnotation()
  {
    return idAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullableAnnotation()
  {
    return nullableAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManyToManyAnnotation()
  {
    return manyToManyAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManyToManyAnnotation_Name()
  {
    return (EAttribute)manyToManyAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getManyToManyAnnotation_TargetEntity()
  {
    return (EReference)manyToManyAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManyToManyAnnotation_MappedBy()
  {
    return (EAttribute)manyToManyAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JpaFactory getJpaFactory()
  {
    return (JpaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    jModelEClass = createEClass(JMODEL);
    createEReference(jModelEClass, JMODEL__JMODEL);

    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__ANNOTATIONS);

    propertyEClass = createEClass(PROPERTY);
    createEReference(propertyEClass, PROPERTY__ANNOTATIONS);

    referenceEClass = createEClass(REFERENCE);
    createEReference(referenceEClass, REFERENCE__ANNOTATIONS);

    jpaAnnotationEClass = createEClass(JPA_ANNOTATION);

    entityAnnotationEClass = createEClass(ENTITY_ANNOTATION);
    createEAttribute(entityAnnotationEClass, ENTITY_ANNOTATION__NAME);

    propertyAnnotationEClass = createEClass(PROPERTY_ANNOTATION);
    createEAttribute(propertyAnnotationEClass, PROPERTY_ANNOTATION__NAME);

    referenceAnnotationEClass = createEClass(REFERENCE_ANNOTATION);

    embeddableAnnotationEClass = createEClass(EMBEDDABLE_ANNOTATION);

    cachableAnnotationEClass = createEClass(CACHABLE_ANNOTATION);

    idAnnotationEClass = createEClass(ID_ANNOTATION);

    nullableAnnotationEClass = createEClass(NULLABLE_ANNOTATION);

    manyToManyAnnotationEClass = createEClass(MANY_TO_MANY_ANNOTATION);
    createEAttribute(manyToManyAnnotationEClass, MANY_TO_MANY_ANNOTATION__NAME);
    createEReference(manyToManyAnnotationEClass, MANY_TO_MANY_ANNOTATION__TARGET_ENTITY);
    createEAttribute(manyToManyAnnotationEClass, MANY_TO_MANY_ANNOTATION__MAPPED_BY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    entityEClass.getESuperTypes().add(theEntityPackage.getEntity());
    propertyEClass.getESuperTypes().add(theEntityPackage.getProperty());
    referenceEClass.getESuperTypes().add(theEntityPackage.getReference());
    entityAnnotationEClass.getESuperTypes().add(this.getJpaAnnotation());
    propertyAnnotationEClass.getESuperTypes().add(this.getJpaAnnotation());
    referenceAnnotationEClass.getESuperTypes().add(this.getJpaAnnotation());
    embeddableAnnotationEClass.getESuperTypes().add(this.getEntityAnnotation());
    cachableAnnotationEClass.getESuperTypes().add(this.getEntityAnnotation());
    idAnnotationEClass.getESuperTypes().add(this.getPropertyAnnotation());
    nullableAnnotationEClass.getESuperTypes().add(this.getPropertyAnnotation());
    manyToManyAnnotationEClass.getESuperTypes().add(this.getReferenceAnnotation());

    // Initialize classes and features; add operations and parameters
    initEClass(jModelEClass, JModel.class, "JModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJModel_Jmodel(), theEntityPackage.getEntityModel(), null, "jmodel", null, 0, 1, JModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_Annotations(), this.getEntityAnnotation(), null, "annotations", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProperty_Annotations(), this.getPropertyAnnotation(), null, "annotations", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReference_Annotations(), this.getReferenceAnnotation(), null, "annotations", null, 0, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jpaAnnotationEClass, JpaAnnotation.class, "JpaAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entityAnnotationEClass, EntityAnnotation.class, "EntityAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntityAnnotation_Name(), ecorePackage.getEString(), "name", null, 0, 1, EntityAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyAnnotationEClass, PropertyAnnotation.class, "PropertyAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyAnnotation_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceAnnotationEClass, ReferenceAnnotation.class, "ReferenceAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(embeddableAnnotationEClass, EmbeddableAnnotation.class, "EmbeddableAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cachableAnnotationEClass, CachableAnnotation.class, "CachableAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(idAnnotationEClass, IdAnnotation.class, "IdAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nullableAnnotationEClass, NullableAnnotation.class, "NullableAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(manyToManyAnnotationEClass, ManyToManyAnnotation.class, "ManyToManyAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getManyToManyAnnotation_Name(), ecorePackage.getEString(), "name", null, 0, 1, ManyToManyAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getManyToManyAnnotation_TargetEntity(), theTypesPackage.getJvmParameterizedTypeReference(), null, "targetEntity", null, 0, 1, ManyToManyAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManyToManyAnnotation_MappedBy(), ecorePackage.getEString(), "mappedBy", null, 0, 1, ManyToManyAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //JpaPackageImpl
