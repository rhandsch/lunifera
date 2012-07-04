/**
 */
package org.lunifera.metamodel.dsl.entity.lentity.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;

import org.lunifera.metamodel.dsl.entity.lentity.LContainer;
import org.lunifera.metamodel.dsl.entity.lentity.LContains;
import org.lunifera.metamodel.dsl.entity.lentity.LContainsJVM;
import org.lunifera.metamodel.dsl.entity.lentity.LEmbedds;
import org.lunifera.metamodel.dsl.entity.lentity.LEntity;
import org.lunifera.metamodel.dsl.entity.lentity.LEntityMember;
import org.lunifera.metamodel.dsl.entity.lentity.LEntityModel;
import org.lunifera.metamodel.dsl.entity.lentity.LImport;
import org.lunifera.metamodel.dsl.entity.lentity.LModifier;
import org.lunifera.metamodel.dsl.entity.lentity.LMultiplicity;
import org.lunifera.metamodel.dsl.entity.lentity.LOperation;
import org.lunifera.metamodel.dsl.entity.lentity.LPackage;
import org.lunifera.metamodel.dsl.entity.lentity.LProperty;
import org.lunifera.metamodel.dsl.entity.lentity.LReference;
import org.lunifera.metamodel.dsl.entity.lentity.LReferenceJVM;
import org.lunifera.metamodel.dsl.entity.lentity.LRefers;
import org.lunifera.metamodel.dsl.entity.lentity.LRefersJVM;
import org.lunifera.metamodel.dsl.entity.lentity.LVisibility;
import org.lunifera.metamodel.dsl.entity.lentity.LentityFactory;
import org.lunifera.metamodel.dsl.entity.lentity.LentityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LentityPackageImpl extends EPackageImpl implements LentityPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lEntityModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lEntityMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lReferenceJVMEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lRefersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lContainsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lRefersJVMEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lContainsJVMEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lEmbeddsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lMultiplicityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum lVisibilityEEnum = null;

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
   * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LentityPackageImpl()
  {
    super(eNS_URI, LentityFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link LentityPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LentityPackage init()
  {
    if (isInited) return (LentityPackage)EPackage.Registry.INSTANCE.getEPackage(LentityPackage.eNS_URI);

    // Obtain or create and register package
    LentityPackageImpl theLentityPackage = (LentityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LentityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LentityPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XAnnotationsPackage.eINSTANCE.eClass();
    XbasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theLentityPackage.createPackageContents();

    // Initialize created meta-data
    theLentityPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLentityPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LentityPackage.eNS_URI, theLentityPackage);
    return theLentityPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLEntityModel()
  {
    return lEntityModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLEntityModel_Package()
  {
    return (EReference)lEntityModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLEntityModel_Imports()
  {
    return (EReference)lEntityModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLEntityModel_Entity()
  {
    return (EReference)lEntityModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLPackage()
  {
    return lPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLPackage_Name()
  {
    return (EAttribute)lPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLImport()
  {
    return lImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLImport_ImportedNamespace()
  {
    return (EAttribute)lImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLEntity()
  {
    return lEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLEntity_Name()
  {
    return (EAttribute)lEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLEntity_SuperType()
  {
    return (EReference)lEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLEntity_EntityMembers()
  {
    return (EReference)lEntityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLEntityMember()
  {
    return lEntityMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLEntityMember_Name()
  {
    return (EAttribute)lEntityMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLReference()
  {
    return lReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLReference_Type()
  {
    return (EReference)lReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLReference_Multiplicity()
  {
    return (EReference)lReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLReferenceJVM()
  {
    return lReferenceJVMEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLReferenceJVM_Type()
  {
    return (EReference)lReferenceJVMEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLReferenceJVM_Multiplicity()
  {
    return (EReference)lReferenceJVMEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLProperty()
  {
    return lPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLProperty_Type()
  {
    return (EReference)lPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLProperty_DefaultValueLiteral()
  {
    return (EAttribute)lPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLRefers()
  {
    return lRefersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLContains()
  {
    return lContainsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLContains_Opposite()
  {
    return (EReference)lContainsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLContainer()
  {
    return lContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLContainer_Opposite()
  {
    return (EReference)lContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLRefersJVM()
  {
    return lRefersJVMEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLContainsJVM()
  {
    return lContainsJVMEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLContainsJVM_Opposite()
  {
    return (EReference)lContainsJVMEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLEmbedds()
  {
    return lEmbeddsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLEmbedds_Type()
  {
    return (EReference)lEmbeddsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLOperation()
  {
    return lOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLOperation_OperationAnnotation()
  {
    return (EReference)lOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLOperation_Modifier()
  {
    return (EReference)lOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLOperation_Type()
  {
    return (EReference)lOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLOperation_Params()
  {
    return (EReference)lOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLOperation_Body()
  {
    return (EReference)lOperationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLModifier()
  {
    return lModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLModifier_Final()
  {
    return (EAttribute)lModifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLModifier_Static()
  {
    return (EAttribute)lModifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLModifier_Visibility()
  {
    return (EAttribute)lModifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLMultiplicity()
  {
    return lMultiplicityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLVisibility()
  {
    return lVisibilityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LentityFactory getLentityFactory()
  {
    return (LentityFactory)getEFactoryInstance();
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
    lEntityModelEClass = createEClass(LENTITY_MODEL);
    createEReference(lEntityModelEClass, LENTITY_MODEL__PACKAGE);
    createEReference(lEntityModelEClass, LENTITY_MODEL__IMPORTS);
    createEReference(lEntityModelEClass, LENTITY_MODEL__ENTITY);

    lPackageEClass = createEClass(LPACKAGE);
    createEAttribute(lPackageEClass, LPACKAGE__NAME);

    lImportEClass = createEClass(LIMPORT);
    createEAttribute(lImportEClass, LIMPORT__IMPORTED_NAMESPACE);

    lEntityEClass = createEClass(LENTITY);
    createEAttribute(lEntityEClass, LENTITY__NAME);
    createEReference(lEntityEClass, LENTITY__SUPER_TYPE);
    createEReference(lEntityEClass, LENTITY__ENTITY_MEMBERS);

    lEntityMemberEClass = createEClass(LENTITY_MEMBER);
    createEAttribute(lEntityMemberEClass, LENTITY_MEMBER__NAME);

    lReferenceEClass = createEClass(LREFERENCE);
    createEReference(lReferenceEClass, LREFERENCE__TYPE);
    createEReference(lReferenceEClass, LREFERENCE__MULTIPLICITY);

    lReferenceJVMEClass = createEClass(LREFERENCE_JVM);
    createEReference(lReferenceJVMEClass, LREFERENCE_JVM__TYPE);
    createEReference(lReferenceJVMEClass, LREFERENCE_JVM__MULTIPLICITY);

    lPropertyEClass = createEClass(LPROPERTY);
    createEReference(lPropertyEClass, LPROPERTY__TYPE);
    createEAttribute(lPropertyEClass, LPROPERTY__DEFAULT_VALUE_LITERAL);

    lRefersEClass = createEClass(LREFERS);

    lContainsEClass = createEClass(LCONTAINS);
    createEReference(lContainsEClass, LCONTAINS__OPPOSITE);

    lContainerEClass = createEClass(LCONTAINER);
    createEReference(lContainerEClass, LCONTAINER__OPPOSITE);

    lRefersJVMEClass = createEClass(LREFERS_JVM);

    lContainsJVMEClass = createEClass(LCONTAINS_JVM);
    createEReference(lContainsJVMEClass, LCONTAINS_JVM__OPPOSITE);

    lEmbeddsEClass = createEClass(LEMBEDDS);
    createEReference(lEmbeddsEClass, LEMBEDDS__TYPE);

    lOperationEClass = createEClass(LOPERATION);
    createEReference(lOperationEClass, LOPERATION__OPERATION_ANNOTATION);
    createEReference(lOperationEClass, LOPERATION__MODIFIER);
    createEReference(lOperationEClass, LOPERATION__TYPE);
    createEReference(lOperationEClass, LOPERATION__PARAMS);
    createEReference(lOperationEClass, LOPERATION__BODY);

    lModifierEClass = createEClass(LMODIFIER);
    createEAttribute(lModifierEClass, LMODIFIER__FINAL);
    createEAttribute(lModifierEClass, LMODIFIER__STATIC);
    createEAttribute(lModifierEClass, LMODIFIER__VISIBILITY);

    lMultiplicityEClass = createEClass(LMULTIPLICITY);

    // Create enums
    lVisibilityEEnum = createEEnum(LVISIBILITY);
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
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XAnnotationsPackage theXAnnotationsPackage = (XAnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(XAnnotationsPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    lReferenceEClass.getESuperTypes().add(this.getLEntityMember());
    lReferenceJVMEClass.getESuperTypes().add(this.getLEntityMember());
    lPropertyEClass.getESuperTypes().add(this.getLEntityMember());
    lRefersEClass.getESuperTypes().add(this.getLReference());
    lContainsEClass.getESuperTypes().add(this.getLReference());
    lContainerEClass.getESuperTypes().add(this.getLReference());
    lRefersJVMEClass.getESuperTypes().add(this.getLReferenceJVM());
    lContainsJVMEClass.getESuperTypes().add(this.getLReferenceJVM());
    lEmbeddsEClass.getESuperTypes().add(this.getLEntityMember());
    lOperationEClass.getESuperTypes().add(this.getLEntityMember());

    // Initialize classes and features; add operations and parameters
    initEClass(lEntityModelEClass, LEntityModel.class, "LEntityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLEntityModel_Package(), this.getLPackage(), null, "package", null, 0, 1, LEntityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLEntityModel_Imports(), this.getLImport(), null, "imports", null, 0, -1, LEntityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLEntityModel_Entity(), this.getLEntity(), null, "entity", null, 0, -1, LEntityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lPackageEClass, LPackage.class, "LPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, LPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lImportEClass, LImport.class, "LImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, LImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lEntityEClass, LEntity.class, "LEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, LEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLEntity_SuperType(), theTypesPackage.getJvmTypeReference(), null, "superType", null, 0, 1, LEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLEntity_EntityMembers(), this.getLEntityMember(), null, "entityMembers", null, 0, -1, LEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lEntityMemberEClass, LEntityMember.class, "LEntityMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLEntityMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, LEntityMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lReferenceEClass, LReference.class, "LReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLReference_Type(), this.getLEntity(), null, "type", null, 0, 1, LReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLReference_Multiplicity(), this.getLMultiplicity(), null, "multiplicity", null, 0, 1, LReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lReferenceJVMEClass, LReferenceJVM.class, "LReferenceJVM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLReferenceJVM_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, LReferenceJVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLReferenceJVM_Multiplicity(), this.getLMultiplicity(), null, "multiplicity", null, 0, 1, LReferenceJVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lPropertyEClass, LProperty.class, "LProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLProperty_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, LProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLProperty_DefaultValueLiteral(), ecorePackage.getEString(), "defaultValueLiteral", null, 0, 1, LProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lRefersEClass, LRefers.class, "LRefers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lContainsEClass, LContains.class, "LContains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLContains_Opposite(), this.getLReference(), null, "opposite", null, 0, 1, LContains.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lContainerEClass, LContainer.class, "LContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLContainer_Opposite(), this.getLReference(), null, "opposite", null, 0, 1, LContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lRefersJVMEClass, LRefersJVM.class, "LRefersJVM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lContainsJVMEClass, LContainsJVM.class, "LContainsJVM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLContainsJVM_Opposite(), theTypesPackage.getJvmField(), null, "opposite", null, 0, 1, LContainsJVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lEmbeddsEClass, LEmbedds.class, "LEmbedds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLEmbedds_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, LEmbedds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lOperationEClass, LOperation.class, "LOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLOperation_OperationAnnotation(), theXAnnotationsPackage.getXAnnotation(), null, "operationAnnotation", null, 0, -1, LOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLOperation_Modifier(), this.getLModifier(), null, "modifier", null, 0, 1, LOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLOperation_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, LOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLOperation_Params(), theTypesPackage.getJvmFormalParameter(), null, "params", null, 0, -1, LOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLOperation_Body(), theXbasePackage.getXExpression(), null, "body", null, 0, 1, LOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lModifierEClass, LModifier.class, "LModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLModifier_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, LModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLModifier_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, LModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLModifier_Visibility(), this.getLVisibility(), "visibility", null, 0, 1, LModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lMultiplicityEClass, LMultiplicity.class, "LMultiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(lVisibilityEEnum, LVisibility.class, "LVisibility");
    addEEnumLiteral(lVisibilityEEnum, LVisibility.PACKAGE);
    addEEnumLiteral(lVisibilityEEnum, LVisibility.PRIVATE);
    addEEnumLiteral(lVisibilityEEnum, LVisibility.PROTECTED);
    addEEnumLiteral(lVisibilityEEnum, LVisibility.PUBLIC);

    // Create resource
    createResource(eNS_URI);
  }

} //LentityPackageImpl
