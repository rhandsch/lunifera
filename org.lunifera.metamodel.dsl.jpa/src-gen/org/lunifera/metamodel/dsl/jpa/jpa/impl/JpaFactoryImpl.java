/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.impl;

import org.eclipse.emf.ecore.EClass;
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
      case JpaPackage.EMBEDDABLE_ANNOTATION: return createEmbeddableAnnotation();
      case JpaPackage.CACHABLE_ANNOTATION: return createCachableAnnotation();
      case JpaPackage.ID_ANNOTATION: return createIdAnnotation();
      case JpaPackage.NULLABLE_ANNOTATION: return createNullableAnnotation();
      case JpaPackage.MANY_TO_MANY_ANNOTATION: return createManyToManyAnnotation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public EmbeddableAnnotation createEmbeddableAnnotation()
  {
    EmbeddableAnnotationImpl embeddableAnnotation = new EmbeddableAnnotationImpl();
    return embeddableAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CachableAnnotation createCachableAnnotation()
  {
    CachableAnnotationImpl cachableAnnotation = new CachableAnnotationImpl();
    return cachableAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdAnnotation createIdAnnotation()
  {
    IdAnnotationImpl idAnnotation = new IdAnnotationImpl();
    return idAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullableAnnotation createNullableAnnotation()
  {
    NullableAnnotationImpl nullableAnnotation = new NullableAnnotationImpl();
    return nullableAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ManyToManyAnnotation createManyToManyAnnotation()
  {
    ManyToManyAnnotationImpl manyToManyAnnotation = new ManyToManyAnnotationImpl();
    return manyToManyAnnotation;
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
