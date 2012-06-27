/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.lunifera.metamodel.dsl.entity.entity.EntityPackage;

import org.lunifera.metamodel.dsl.jpa.jpa.CachableAnnot;
import org.lunifera.metamodel.dsl.jpa.jpa.CascadeType;
import org.lunifera.metamodel.dsl.jpa.jpa.EmbeddableAnnot;
import org.lunifera.metamodel.dsl.jpa.jpa.Entity;
import org.lunifera.metamodel.dsl.jpa.jpa.EntityAnnotation;
import org.lunifera.metamodel.dsl.jpa.jpa.FetchType;
import org.lunifera.metamodel.dsl.jpa.jpa.IdAnnot;
import org.lunifera.metamodel.dsl.jpa.jpa.JModel;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaAnnotation;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaFactory;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage;
import org.lunifera.metamodel.dsl.jpa.jpa.LobAnnot;
import org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnot;
import org.lunifera.metamodel.dsl.jpa.jpa.ManyToOneAnnot;
import org.lunifera.metamodel.dsl.jpa.jpa.NullableAnnot;
import org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot;
import org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot;
import org.lunifera.metamodel.dsl.jpa.jpa.ParamCascade;
import org.lunifera.metamodel.dsl.jpa.jpa.ParamFetch;
import org.lunifera.metamodel.dsl.jpa.jpa.ParamMappedBy;
import org.lunifera.metamodel.dsl.jpa.jpa.ParamOrphanRemoval;
import org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity;
import org.lunifera.metamodel.dsl.jpa.jpa.Property;
import org.lunifera.metamodel.dsl.jpa.jpa.PropertyAnnotation;
import org.lunifera.metamodel.dsl.jpa.jpa.Reference;
import org.lunifera.metamodel.dsl.jpa.jpa.ReferenceAnnotation;
import org.lunifera.metamodel.dsl.jpa.jpa.UniqueAnnot;
import org.lunifera.metamodel.dsl.jpa.jpa.booleanType;
import org.lunifera.metamodel.dsl.jpa.jpa.classSuffix;

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
  private EClass embeddableAnnotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cachableAnnotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idAnnotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullableAnnotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uniqueAnnotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lobAnnotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass manyToManyAnnotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass manyToOneAnnotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oneToManyAnnotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oneToOneAnnotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramTargetEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramMappedByEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramCascadeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramFetchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramOrphanRemovalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum cascadeTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fetchTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum booleanTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum classSuffixEEnum = null;

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
  public EAttribute getJpaAnnotation_Name()
  {
    return (EAttribute)jpaAnnotationEClass.getEStructuralFeatures().get(0);
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
  public EClass getPropertyAnnotation()
  {
    return propertyAnnotationEClass;
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
  public EClass getEmbeddableAnnot()
  {
    return embeddableAnnotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCachableAnnot()
  {
    return cachableAnnotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdAnnot()
  {
    return idAnnotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullableAnnot()
  {
    return nullableAnnotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUniqueAnnot()
  {
    return uniqueAnnotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLobAnnot()
  {
    return lobAnnotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManyToManyAnnot()
  {
    return manyToManyAnnotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getManyToManyAnnot_TargetEntity()
  {
    return (EReference)manyToManyAnnotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManyToManyAnnot_MappedBy()
  {
    return (EAttribute)manyToManyAnnotEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManyToManyAnnot_Cascade()
  {
    return (EAttribute)manyToManyAnnotEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManyToManyAnnot_Fetch()
  {
    return (EAttribute)manyToManyAnnotEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManyToOneAnnot()
  {
    return manyToOneAnnotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getManyToOneAnnot_TargetEntity()
  {
    return (EReference)manyToOneAnnotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManyToOneAnnot_MappedBy()
  {
    return (EAttribute)manyToOneAnnotEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManyToOneAnnot_Cascade()
  {
    return (EAttribute)manyToOneAnnotEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManyToOneAnnot_Fetch()
  {
    return (EAttribute)manyToOneAnnotEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOneToManyAnnot()
  {
    return oneToManyAnnotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneToManyAnnot_TargetEntity()
  {
    return (EReference)oneToManyAnnotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneToManyAnnot_MappedBy()
  {
    return (EReference)oneToManyAnnotEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneToManyAnnot_Cascade()
  {
    return (EReference)oneToManyAnnotEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneToManyAnnot_Fetch()
  {
    return (EReference)oneToManyAnnotEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneToManyAnnot_OrphanRemoval()
  {
    return (EReference)oneToManyAnnotEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOneToOneAnnot()
  {
    return oneToOneAnnotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneToOneAnnot_TargetEntity()
  {
    return (EReference)oneToOneAnnotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneToOneAnnot_Class()
  {
    return (EAttribute)oneToOneAnnotEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneToOneAnnot_MappedBy()
  {
    return (EAttribute)oneToOneAnnotEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneToOneAnnot_Cascade()
  {
    return (EAttribute)oneToOneAnnotEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneToOneAnnot_OrphanRemoval()
  {
    return (EAttribute)oneToOneAnnotEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneToOneAnnot_Fetch()
  {
    return (EAttribute)oneToOneAnnotEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParamTargetEntity()
  {
    return paramTargetEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParamTargetEntity_TargetEntity()
  {
    return (EReference)paramTargetEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParamTargetEntity_Class()
  {
    return (EAttribute)paramTargetEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParamMappedBy()
  {
    return paramMappedByEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParamMappedBy_MappedBy()
  {
    return (EAttribute)paramMappedByEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParamCascade()
  {
    return paramCascadeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParamCascade_Cascade()
  {
    return (EAttribute)paramCascadeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParamFetch()
  {
    return paramFetchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParamFetch_Fetch()
  {
    return (EAttribute)paramFetchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParamOrphanRemoval()
  {
    return paramOrphanRemovalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParamOrphanRemoval_OrphanRemoval()
  {
    return (EAttribute)paramOrphanRemovalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCascadeType()
  {
    return cascadeTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFetchType()
  {
    return fetchTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getbooleanType()
  {
    return booleanTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getclassSuffix()
  {
    return classSuffixEEnum;
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
    createEAttribute(jpaAnnotationEClass, JPA_ANNOTATION__NAME);

    entityAnnotationEClass = createEClass(ENTITY_ANNOTATION);

    propertyAnnotationEClass = createEClass(PROPERTY_ANNOTATION);

    referenceAnnotationEClass = createEClass(REFERENCE_ANNOTATION);

    embeddableAnnotEClass = createEClass(EMBEDDABLE_ANNOT);

    cachableAnnotEClass = createEClass(CACHABLE_ANNOT);

    idAnnotEClass = createEClass(ID_ANNOT);

    nullableAnnotEClass = createEClass(NULLABLE_ANNOT);

    uniqueAnnotEClass = createEClass(UNIQUE_ANNOT);

    lobAnnotEClass = createEClass(LOB_ANNOT);

    manyToManyAnnotEClass = createEClass(MANY_TO_MANY_ANNOT);
    createEReference(manyToManyAnnotEClass, MANY_TO_MANY_ANNOT__TARGET_ENTITY);
    createEAttribute(manyToManyAnnotEClass, MANY_TO_MANY_ANNOT__MAPPED_BY);
    createEAttribute(manyToManyAnnotEClass, MANY_TO_MANY_ANNOT__CASCADE);
    createEAttribute(manyToManyAnnotEClass, MANY_TO_MANY_ANNOT__FETCH);

    manyToOneAnnotEClass = createEClass(MANY_TO_ONE_ANNOT);
    createEReference(manyToOneAnnotEClass, MANY_TO_ONE_ANNOT__TARGET_ENTITY);
    createEAttribute(manyToOneAnnotEClass, MANY_TO_ONE_ANNOT__MAPPED_BY);
    createEAttribute(manyToOneAnnotEClass, MANY_TO_ONE_ANNOT__CASCADE);
    createEAttribute(manyToOneAnnotEClass, MANY_TO_ONE_ANNOT__FETCH);

    oneToManyAnnotEClass = createEClass(ONE_TO_MANY_ANNOT);
    createEReference(oneToManyAnnotEClass, ONE_TO_MANY_ANNOT__TARGET_ENTITY);
    createEReference(oneToManyAnnotEClass, ONE_TO_MANY_ANNOT__MAPPED_BY);
    createEReference(oneToManyAnnotEClass, ONE_TO_MANY_ANNOT__CASCADE);
    createEReference(oneToManyAnnotEClass, ONE_TO_MANY_ANNOT__FETCH);
    createEReference(oneToManyAnnotEClass, ONE_TO_MANY_ANNOT__ORPHAN_REMOVAL);

    oneToOneAnnotEClass = createEClass(ONE_TO_ONE_ANNOT);
    createEReference(oneToOneAnnotEClass, ONE_TO_ONE_ANNOT__TARGET_ENTITY);
    createEAttribute(oneToOneAnnotEClass, ONE_TO_ONE_ANNOT__CLASS);
    createEAttribute(oneToOneAnnotEClass, ONE_TO_ONE_ANNOT__MAPPED_BY);
    createEAttribute(oneToOneAnnotEClass, ONE_TO_ONE_ANNOT__CASCADE);
    createEAttribute(oneToOneAnnotEClass, ONE_TO_ONE_ANNOT__ORPHAN_REMOVAL);
    createEAttribute(oneToOneAnnotEClass, ONE_TO_ONE_ANNOT__FETCH);

    paramTargetEntityEClass = createEClass(PARAM_TARGET_ENTITY);
    createEReference(paramTargetEntityEClass, PARAM_TARGET_ENTITY__TARGET_ENTITY);
    createEAttribute(paramTargetEntityEClass, PARAM_TARGET_ENTITY__CLASS);

    paramMappedByEClass = createEClass(PARAM_MAPPED_BY);
    createEAttribute(paramMappedByEClass, PARAM_MAPPED_BY__MAPPED_BY);

    paramCascadeEClass = createEClass(PARAM_CASCADE);
    createEAttribute(paramCascadeEClass, PARAM_CASCADE__CASCADE);

    paramFetchEClass = createEClass(PARAM_FETCH);
    createEAttribute(paramFetchEClass, PARAM_FETCH__FETCH);

    paramOrphanRemovalEClass = createEClass(PARAM_ORPHAN_REMOVAL);
    createEAttribute(paramOrphanRemovalEClass, PARAM_ORPHAN_REMOVAL__ORPHAN_REMOVAL);

    // Create enums
    cascadeTypeEEnum = createEEnum(CASCADE_TYPE);
    fetchTypeEEnum = createEEnum(FETCH_TYPE);
    booleanTypeEEnum = createEEnum(BOOLEAN_TYPE);
    classSuffixEEnum = createEEnum(CLASS_SUFFIX);
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
    embeddableAnnotEClass.getESuperTypes().add(this.getEntityAnnotation());
    cachableAnnotEClass.getESuperTypes().add(this.getEntityAnnotation());
    idAnnotEClass.getESuperTypes().add(this.getPropertyAnnotation());
    nullableAnnotEClass.getESuperTypes().add(this.getPropertyAnnotation());
    uniqueAnnotEClass.getESuperTypes().add(this.getPropertyAnnotation());
    lobAnnotEClass.getESuperTypes().add(this.getPropertyAnnotation());
    manyToManyAnnotEClass.getESuperTypes().add(this.getReferenceAnnotation());
    manyToOneAnnotEClass.getESuperTypes().add(this.getReferenceAnnotation());
    oneToManyAnnotEClass.getESuperTypes().add(this.getReferenceAnnotation());
    oneToOneAnnotEClass.getESuperTypes().add(this.getReferenceAnnotation());

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
    initEAttribute(getJpaAnnotation_Name(), ecorePackage.getEString(), "name", null, 0, 1, JpaAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityAnnotationEClass, EntityAnnotation.class, "EntityAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertyAnnotationEClass, PropertyAnnotation.class, "PropertyAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(referenceAnnotationEClass, ReferenceAnnotation.class, "ReferenceAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(embeddableAnnotEClass, EmbeddableAnnot.class, "EmbeddableAnnot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cachableAnnotEClass, CachableAnnot.class, "CachableAnnot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(idAnnotEClass, IdAnnot.class, "IdAnnot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nullableAnnotEClass, NullableAnnot.class, "NullableAnnot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uniqueAnnotEClass, UniqueAnnot.class, "UniqueAnnot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lobAnnotEClass, LobAnnot.class, "LobAnnot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(manyToManyAnnotEClass, ManyToManyAnnot.class, "ManyToManyAnnot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getManyToManyAnnot_TargetEntity(), theTypesPackage.getJvmParameterizedTypeReference(), null, "targetEntity", null, 0, 1, ManyToManyAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManyToManyAnnot_MappedBy(), ecorePackage.getEString(), "mappedBy", null, 0, 1, ManyToManyAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManyToManyAnnot_Cascade(), this.getCascadeType(), "cascade", null, 0, 1, ManyToManyAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManyToManyAnnot_Fetch(), this.getFetchType(), "fetch", null, 0, 1, ManyToManyAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(manyToOneAnnotEClass, ManyToOneAnnot.class, "ManyToOneAnnot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getManyToOneAnnot_TargetEntity(), theTypesPackage.getJvmParameterizedTypeReference(), null, "targetEntity", null, 0, 1, ManyToOneAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManyToOneAnnot_MappedBy(), ecorePackage.getEString(), "mappedBy", null, 0, 1, ManyToOneAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManyToOneAnnot_Cascade(), this.getCascadeType(), "cascade", null, 0, 1, ManyToOneAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManyToOneAnnot_Fetch(), this.getFetchType(), "fetch", null, 0, 1, ManyToOneAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oneToManyAnnotEClass, OneToManyAnnot.class, "OneToManyAnnot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOneToManyAnnot_TargetEntity(), this.getParamTargetEntity(), null, "targetEntity", null, 0, 1, OneToManyAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOneToManyAnnot_MappedBy(), this.getParamMappedBy(), null, "mappedBy", null, 0, 1, OneToManyAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOneToManyAnnot_Cascade(), this.getParamCascade(), null, "cascade", null, 0, 1, OneToManyAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOneToManyAnnot_Fetch(), this.getParamFetch(), null, "fetch", null, 0, 1, OneToManyAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOneToManyAnnot_OrphanRemoval(), this.getParamOrphanRemoval(), null, "orphanRemoval", null, 0, 1, OneToManyAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oneToOneAnnotEClass, OneToOneAnnot.class, "OneToOneAnnot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOneToOneAnnot_TargetEntity(), theTypesPackage.getJvmParameterizedTypeReference(), null, "targetEntity", null, 0, 1, OneToOneAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOneToOneAnnot_Class(), this.getclassSuffix(), "class", null, 0, 1, OneToOneAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOneToOneAnnot_MappedBy(), ecorePackage.getEString(), "mappedBy", null, 0, 1, OneToOneAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOneToOneAnnot_Cascade(), this.getCascadeType(), "cascade", null, 0, 1, OneToOneAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOneToOneAnnot_OrphanRemoval(), this.getbooleanType(), "orphanRemoval", null, 0, 1, OneToOneAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOneToOneAnnot_Fetch(), this.getFetchType(), "fetch", null, 0, 1, OneToOneAnnot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramTargetEntityEClass, ParamTargetEntity.class, "ParamTargetEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParamTargetEntity_TargetEntity(), theTypesPackage.getJvmParameterizedTypeReference(), null, "targetEntity", null, 0, 1, ParamTargetEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParamTargetEntity_Class(), this.getclassSuffix(), "class", null, 0, 1, ParamTargetEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramMappedByEClass, ParamMappedBy.class, "ParamMappedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParamMappedBy_MappedBy(), ecorePackage.getEString(), "mappedBy", null, 0, 1, ParamMappedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramCascadeEClass, ParamCascade.class, "ParamCascade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParamCascade_Cascade(), this.getCascadeType(), "cascade", null, 0, 1, ParamCascade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramFetchEClass, ParamFetch.class, "ParamFetch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParamFetch_Fetch(), this.getFetchType(), "fetch", null, 0, 1, ParamFetch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramOrphanRemovalEClass, ParamOrphanRemoval.class, "ParamOrphanRemoval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParamOrphanRemoval_OrphanRemoval(), this.getbooleanType(), "orphanRemoval", null, 0, 1, ParamOrphanRemoval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(cascadeTypeEEnum, CascadeType.class, "CascadeType");
    addEEnumLiteral(cascadeTypeEEnum, CascadeType.ALL);
    addEEnumLiteral(cascadeTypeEEnum, CascadeType.MERGE);
    addEEnumLiteral(cascadeTypeEEnum, CascadeType.PERSIST);
    addEEnumLiteral(cascadeTypeEEnum, CascadeType.REFRESH);
    addEEnumLiteral(cascadeTypeEEnum, CascadeType.REMOVE);

    initEEnum(fetchTypeEEnum, FetchType.class, "FetchType");
    addEEnumLiteral(fetchTypeEEnum, FetchType.LAZY);
    addEEnumLiteral(fetchTypeEEnum, FetchType.EAGER);

    initEEnum(booleanTypeEEnum, booleanType.class, "booleanType");
    addEEnumLiteral(booleanTypeEEnum, booleanType.TRUE);
    addEEnumLiteral(booleanTypeEEnum, booleanType.FALSE);

    initEEnum(classSuffixEEnum, classSuffix.class, "classSuffix");
    addEEnumLiteral(classSuffixEEnum, classSuffix.CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //JpaPackageImpl
