/**
 */
package org.lunifera.metamodel.dsl.entity.lentity.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.metamodel.dsl.entity.lentity.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LentityFactoryImpl extends EFactoryImpl implements LentityFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LentityFactory init()
  {
    try
    {
      LentityFactory theLentityFactory = (LentityFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.lunifera.org/metamodel/dsl/entity/Entity"); 
      if (theLentityFactory != null)
      {
        return theLentityFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LentityFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LentityFactoryImpl()
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
      case LentityPackage.LENTITY_MODEL: return createLEntityModel();
      case LentityPackage.LPACKAGE: return createLPackage();
      case LentityPackage.LIMPORT: return createLImport();
      case LentityPackage.LENTITY: return createLEntity();
      case LentityPackage.LENTITY_MEMBER: return createLEntityMember();
      case LentityPackage.LREFERENCE: return createLReference();
      case LentityPackage.LREFERENCE_JVM: return createLReferenceJVM();
      case LentityPackage.LPROPERTY: return createLProperty();
      case LentityPackage.LREFERS: return createLRefers();
      case LentityPackage.LCONTAINS: return createLContains();
      case LentityPackage.LCONTAINER: return createLContainer();
      case LentityPackage.LEMBEDDS: return createLEmbedds();
      case LentityPackage.LREFERS_JVM: return createLRefersJVM();
      case LentityPackage.LCONTAINS_JVM: return createLContainsJVM();
      case LentityPackage.LOPERATION: return createLOperation();
      case LentityPackage.LMODIFIER: return createLModifier();
      case LentityPackage.LMULTIPLICITY: return createLMultiplicity();
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
      case LentityPackage.LVISIBILITY:
        return createLVisibilityFromString(eDataType, initialValue);
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
      case LentityPackage.LVISIBILITY:
        return convertLVisibilityToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEntityModel createLEntityModel()
  {
    LEntityModelImpl lEntityModel = new LEntityModelImpl();
    return lEntityModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LPackage createLPackage()
  {
    LPackageImpl lPackage = new LPackageImpl();
    return lPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LImport createLImport()
  {
    LImportImpl lImport = new LImportImpl();
    return lImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEntity createLEntity()
  {
    LEntityImpl lEntity = new LEntityImpl();
    return lEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEntityMember createLEntityMember()
  {
    LEntityMemberImpl lEntityMember = new LEntityMemberImpl();
    return lEntityMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LReference createLReference()
  {
    LReferenceImpl lReference = new LReferenceImpl();
    return lReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LReferenceJVM createLReferenceJVM()
  {
    LReferenceJVMImpl lReferenceJVM = new LReferenceJVMImpl();
    return lReferenceJVM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LProperty createLProperty()
  {
    LPropertyImpl lProperty = new LPropertyImpl();
    return lProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LRefers createLRefers()
  {
    LRefersImpl lRefers = new LRefersImpl();
    return lRefers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LContains createLContains()
  {
    LContainsImpl lContains = new LContainsImpl();
    return lContains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LContainer createLContainer()
  {
    LContainerImpl lContainer = new LContainerImpl();
    return lContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEmbedds createLEmbedds()
  {
    LEmbeddsImpl lEmbedds = new LEmbeddsImpl();
    return lEmbedds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LRefersJVM createLRefersJVM()
  {
    LRefersJVMImpl lRefersJVM = new LRefersJVMImpl();
    return lRefersJVM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LContainsJVM createLContainsJVM()
  {
    LContainsJVMImpl lContainsJVM = new LContainsJVMImpl();
    return lContainsJVM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LOperation createLOperation()
  {
    LOperationImpl lOperation = new LOperationImpl();
    return lOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LModifier createLModifier()
  {
    LModifierImpl lModifier = new LModifierImpl();
    return lModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LMultiplicity createLMultiplicity()
  {
    LMultiplicityImpl lMultiplicity = new LMultiplicityImpl();
    return lMultiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LVisibility createLVisibilityFromString(EDataType eDataType, String initialValue)
  {
    LVisibility result = LVisibility.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLVisibilityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LentityPackage getLentityPackage()
  {
    return (LentityPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LentityPackage getPackage()
  {
    return LentityPackage.eINSTANCE;
  }

} //LentityFactoryImpl
