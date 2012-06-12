/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.lunifera.metamodel.dsl.entity.entity.EntityPackage;

import org.lunifera.metamodel.dsl.jpa.jpa.JPAEntity;
import org.lunifera.metamodel.dsl.jpa.jpa.JPAModel;
import org.lunifera.metamodel.dsl.jpa.jpa.JPAProperty;
import org.lunifera.metamodel.dsl.jpa.jpa.JPAReference;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaFactory;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage;

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
  private EClass jpaModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jpaEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jpaPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jpaReferenceEClass = null;

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
  public EClass getJPAModel()
  {
    return jpaModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJPAEntity()
  {
    return jpaEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJPAEntity_Name()
  {
    return (EReference)jpaEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJPAProperty()
  {
    return jpaPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJPAProperty_Name()
  {
    return (EReference)jpaPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJPAReference()
  {
    return jpaReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJPAReference_Name()
  {
    return (EReference)jpaReferenceEClass.getEStructuralFeatures().get(0);
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
    jpaModelEClass = createEClass(JPA_MODEL);

    jpaEntityEClass = createEClass(JPA_ENTITY);
    createEReference(jpaEntityEClass, JPA_ENTITY__NAME);

    jpaPropertyEClass = createEClass(JPA_PROPERTY);
    createEReference(jpaPropertyEClass, JPA_PROPERTY__NAME);

    jpaReferenceEClass = createEClass(JPA_REFERENCE);
    createEReference(jpaReferenceEClass, JPA_REFERENCE__NAME);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    jpaEntityEClass.getESuperTypes().add(this.getJPAModel());
    jpaPropertyEClass.getESuperTypes().add(this.getJPAModel());
    jpaReferenceEClass.getESuperTypes().add(this.getJPAModel());

    // Initialize classes and features; add operations and parameters
    initEClass(jpaModelEClass, JPAModel.class, "JPAModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(jpaEntityEClass, JPAEntity.class, "JPAEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJPAEntity_Name(), theEntityPackage.getEntity(), null, "name", null, 0, 1, JPAEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jpaPropertyEClass, JPAProperty.class, "JPAProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJPAProperty_Name(), theEntityPackage.getProperty(), null, "name", null, 0, 1, JPAProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jpaReferenceEClass, JPAReference.class, "JPAReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJPAReference_Name(), theEntityPackage.getReference(), null, "name", null, 0, 1, JPAReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //JpaPackageImpl
