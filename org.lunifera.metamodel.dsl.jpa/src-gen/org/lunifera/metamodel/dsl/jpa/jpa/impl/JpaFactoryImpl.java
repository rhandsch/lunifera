/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.metamodel.dsl.jpa.jpa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JpaFactoryImpl extends EFactoryImpl implements JpaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JpaFactory init()
  {
    try
    {
      JpaFactory theJpaFactory = (JpaFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.lunifera.org/metamodel/dsl/jpa/Jpa"); 
      if (theJpaFactory != null)
      {
        return theJpaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JpaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JpaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JpaPackage.JMODEL: return createJModel();
      case JpaPackage.ENTITY: return createEntity();
      case JpaPackage.PROPERTY: return createProperty();
      case JpaPackage.REFERENCE: return createReference();
      case JpaPackage.JPA_ANNOTATION: return createJpaAnnotation();
      case JpaPackage.ENTITY_ANNOTATION: return createEntityAnnotation();
      case JpaPackage.PROPERTY_ANNOTATION: return createPropertyAnnotation();
      case JpaPackage.REFERENCE_ANNOTATION: return createReferenceAnnotation();
      case JpaPackage.EMBEDDABLE_ANNOT: return createEmbeddableAnnot();
      case JpaPackage.CACHABLE_ANNOT: return createCachableAnnot();
      case JpaPackage.ID_ANNOT: return createIdAnnot();
      case JpaPackage.NULLABLE_ANNOT: return createNullableAnnot();
      case JpaPackage.UNIQUE_ANNOT: return createUniqueAnnot();
      case JpaPackage.LOB_ANNOT: return createLobAnnot();
      case JpaPackage.MANY_TO_MANY_ANNOT: return createManyToManyAnnot();
      case JpaPackage.MANY_TO_ONE_ANNOT: return createManyToOneAnnot();
      case JpaPackage.ONE_TO_MANY_ANNOT: return createOneToManyAnnot();
      case JpaPackage.ONE_TO_ONE_ANNOT: return createOneToOneAnnot();
      case JpaPackage.PARAM_TARGET_ENTITY: return createParamTargetEntity();
      case JpaPackage.PARAM_MAPPED_BY: return createParamMappedBy();
      case JpaPackage.PARAM_CASCADE: return createParamCascade();
      case JpaPackage.PARAM_FETCH: return createParamFetch();
      case JpaPackage.PARAM_ORPHAN_REMOVAL: return createParamOrphanRemoval();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case JpaPackage.CASCADE_TYPE:
        return createCascadeTypeFromString(eDataType, initialValue);
      case JpaPackage.FETCH_TYPE:
        return createFetchTypeFromString(eDataType, initialValue);
      case JpaPackage.BOOLEAN_TYPE:
        return createbooleanTypeFromString(eDataType, initialValue);
      case JpaPackage.CLASS_SUFFIX:
        return createclassSuffixFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case JpaPackage.CASCADE_TYPE:
        return convertCascadeTypeToString(eDataType, instanceValue);
      case JpaPackage.FETCH_TYPE:
        return convertFetchTypeToString(eDataType, instanceValue);
      case JpaPackage.BOOLEAN_TYPE:
        return convertbooleanTypeToString(eDataType, instanceValue);
      case JpaPackage.CLASS_SUFFIX:
        return convertclassSuffixToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JModel createJModel()
  {
    JModelImpl jModel = new JModelImpl();
    return jModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JpaAnnotation createJpaAnnotation()
  {
    JpaAnnotationImpl jpaAnnotation = new JpaAnnotationImpl();
    return jpaAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityAnnotation createEntityAnnotation()
  {
    EntityAnnotationImpl entityAnnotation = new EntityAnnotationImpl();
    return entityAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyAnnotation createPropertyAnnotation()
  {
    PropertyAnnotationImpl propertyAnnotation = new PropertyAnnotationImpl();
    return propertyAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceAnnotation createReferenceAnnotation()
  {
    ReferenceAnnotationImpl referenceAnnotation = new ReferenceAnnotationImpl();
    return referenceAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbeddableAnnot createEmbeddableAnnot()
  {
    EmbeddableAnnotImpl embeddableAnnot = new EmbeddableAnnotImpl();
    return embeddableAnnot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CachableAnnot createCachableAnnot()
  {
    CachableAnnotImpl cachableAnnot = new CachableAnnotImpl();
    return cachableAnnot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdAnnot createIdAnnot()
  {
    IdAnnotImpl idAnnot = new IdAnnotImpl();
    return idAnnot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullableAnnot createNullableAnnot()
  {
    NullableAnnotImpl nullableAnnot = new NullableAnnotImpl();
    return nullableAnnot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniqueAnnot createUniqueAnnot()
  {
    UniqueAnnotImpl uniqueAnnot = new UniqueAnnotImpl();
    return uniqueAnnot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LobAnnot createLobAnnot()
  {
    LobAnnotImpl lobAnnot = new LobAnnotImpl();
    return lobAnnot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ManyToManyAnnot createManyToManyAnnot()
  {
    ManyToManyAnnotImpl manyToManyAnnot = new ManyToManyAnnotImpl();
    return manyToManyAnnot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ManyToOneAnnot createManyToOneAnnot()
  {
    ManyToOneAnnotImpl manyToOneAnnot = new ManyToOneAnnotImpl();
    return manyToOneAnnot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneToManyAnnot createOneToManyAnnot()
  {
    OneToManyAnnotImpl oneToManyAnnot = new OneToManyAnnotImpl();
    return oneToManyAnnot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneToOneAnnot createOneToOneAnnot()
  {
    OneToOneAnnotImpl oneToOneAnnot = new OneToOneAnnotImpl();
    return oneToOneAnnot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamTargetEntity createParamTargetEntity()
  {
    ParamTargetEntityImpl paramTargetEntity = new ParamTargetEntityImpl();
    return paramTargetEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamMappedBy createParamMappedBy()
  {
    ParamMappedByImpl paramMappedBy = new ParamMappedByImpl();
    return paramMappedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamCascade createParamCascade()
  {
    ParamCascadeImpl paramCascade = new ParamCascadeImpl();
    return paramCascade;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamFetch createParamFetch()
  {
    ParamFetchImpl paramFetch = new ParamFetchImpl();
    return paramFetch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamOrphanRemoval createParamOrphanRemoval()
  {
    ParamOrphanRemovalImpl paramOrphanRemoval = new ParamOrphanRemovalImpl();
    return paramOrphanRemoval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CascadeType createCascadeTypeFromString(EDataType eDataType, String initialValue)
  {
    CascadeType result = CascadeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCascadeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetchType createFetchTypeFromString(EDataType eDataType, String initialValue)
  {
    FetchType result = FetchType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFetchTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public booleanType createbooleanTypeFromString(EDataType eDataType, String initialValue)
  {
    booleanType result = booleanType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertbooleanTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public classSuffix createclassSuffixFromString(EDataType eDataType, String initialValue)
  {
    classSuffix result = classSuffix.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertclassSuffixToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JpaPackage getJpaPackage()
  {
    return (JpaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JpaPackage getPackage()
  {
    return JpaPackage.eINSTANCE;
  }

} //JpaFactoryImpl
