/**
 */
package org.lunifera.metamodel.dsl.entity.entity.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.metamodel.dsl.entity.entity.AbstractElement;
import org.lunifera.metamodel.dsl.entity.entity.AbstractFeature;
import org.lunifera.metamodel.dsl.entity.entity.BoundLiteral;
import org.lunifera.metamodel.dsl.entity.entity.Embedds;
import org.lunifera.metamodel.dsl.entity.entity.Entity;
import org.lunifera.metamodel.dsl.entity.entity.EntityFactory;
import org.lunifera.metamodel.dsl.entity.entity.EntityModel;
import org.lunifera.metamodel.dsl.entity.entity.EntityPackage;
import org.lunifera.metamodel.dsl.entity.entity.Import;
import org.lunifera.metamodel.dsl.entity.entity.Modifier;
import org.lunifera.metamodel.dsl.entity.entity.Operation;
import org.lunifera.metamodel.dsl.entity.entity.Property;
import org.lunifera.metamodel.dsl.entity.entity.RefType;
import org.lunifera.metamodel.dsl.entity.entity.Reference;
import org.lunifera.metamodel.dsl.entity.entity.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityFactoryImpl extends EFactoryImpl implements EntityFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EntityFactory init()
  {
    try
    {
      EntityFactory theEntityFactory = (EntityFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.lunifera.org/metamodel/dsl/entity/Entity"); 
      if (theEntityFactory != null)
      {
        return theEntityFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EntityFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityFactoryImpl()
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
      case EntityPackage.ENTITY_MODEL: return createEntityModel();
      case EntityPackage.PACKAGE: return createPackage();
      case EntityPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case EntityPackage.IMPORT: return createImport();
      case EntityPackage.ENTITY: return createEntity();
      case EntityPackage.ABSTRACT_FEATURE: return createAbstractFeature();
      case EntityPackage.PROPERTY: return createProperty();
      case EntityPackage.REFERENCE: return createReference();
      case EntityPackage.EMBEDDS: return createEmbedds();
      case EntityPackage.OPERATION: return createOperation();
      case EntityPackage.MODIFIER: return createModifier();
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
      case EntityPackage.VISIBILITY:
        return createVisibilityFromString(eDataType, initialValue);
      case EntityPackage.REF_TYPE:
        return createRefTypeFromString(eDataType, initialValue);
      case EntityPackage.BOUND_LITERAL:
        return createBoundLiteralFromString(eDataType, initialValue);
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
      case EntityPackage.VISIBILITY:
        return convertVisibilityToString(eDataType, instanceValue);
      case EntityPackage.REF_TYPE:
        return convertRefTypeToString(eDataType, instanceValue);
      case EntityPackage.BOUND_LITERAL:
        return convertBoundLiteralToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityModel createEntityModel()
  {
    EntityModelImpl entityModel = new EntityModelImpl();
    return entityModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.lunifera.metamodel.dsl.entity.entity.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
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
  public AbstractFeature createAbstractFeature()
  {
    AbstractFeatureImpl abstractFeature = new AbstractFeatureImpl();
    return abstractFeature;
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
  public Embedds createEmbedds()
  {
    EmbeddsImpl embedds = new EmbeddsImpl();
    return embedds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modifier createModifier()
  {
    ModifierImpl modifier = new ModifierImpl();
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility createVisibilityFromString(EDataType eDataType, String initialValue)
  {
    Visibility result = Visibility.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisibilityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefType createRefTypeFromString(EDataType eDataType, String initialValue)
  {
    RefType result = RefType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRefTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoundLiteral createBoundLiteralFromString(EDataType eDataType, String initialValue)
  {
    BoundLiteral result = BoundLiteral.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBoundLiteralToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityPackage getEntityPackage()
  {
    return (EntityPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EntityPackage getPackage()
  {
    return EntityPackage.eINSTANCE;
  }

} //EntityFactoryImpl
