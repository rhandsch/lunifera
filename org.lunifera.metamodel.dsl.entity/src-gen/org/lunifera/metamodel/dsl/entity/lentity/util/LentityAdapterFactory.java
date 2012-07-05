/**
 */
package org.lunifera.metamodel.dsl.entity.lentity.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.metamodel.dsl.entity.lentity.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.dsl.entity.lentity.LentityPackage
 * @generated
 */
public class LentityAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LentityPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LentityAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LentityPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LentitySwitch<Adapter> modelSwitch =
    new LentitySwitch<Adapter>()
    {
      @Override
      public Adapter caseLEntityModel(LEntityModel object)
      {
        return createLEntityModelAdapter();
      }
      @Override
      public Adapter caseLPackage(LPackage object)
      {
        return createLPackageAdapter();
      }
      @Override
      public Adapter caseLImport(LImport object)
      {
        return createLImportAdapter();
      }
      @Override
      public Adapter caseLEntity(LEntity object)
      {
        return createLEntityAdapter();
      }
      @Override
      public Adapter caseLEntityMember(LEntityMember object)
      {
        return createLEntityMemberAdapter();
      }
      @Override
      public Adapter caseLReference(LReference object)
      {
        return createLReferenceAdapter();
      }
      @Override
      public Adapter caseLReferenceJVM(LReferenceJVM object)
      {
        return createLReferenceJVMAdapter();
      }
      @Override
      public Adapter caseLProperty(LProperty object)
      {
        return createLPropertyAdapter();
      }
      @Override
      public Adapter caseLRefers(LRefers object)
      {
        return createLRefersAdapter();
      }
      @Override
      public Adapter caseLContains(LContains object)
      {
        return createLContainsAdapter();
      }
      @Override
      public Adapter caseLContainer(LContainer object)
      {
        return createLContainerAdapter();
      }
      @Override
      public Adapter caseLEmbedds(LEmbedds object)
      {
        return createLEmbeddsAdapter();
      }
      @Override
      public Adapter caseLRefersJVM(LRefersJVM object)
      {
        return createLRefersJVMAdapter();
      }
      @Override
      public Adapter caseLContainsJVM(LContainsJVM object)
      {
        return createLContainsJVMAdapter();
      }
      @Override
      public Adapter caseLOperation(LOperation object)
      {
        return createLOperationAdapter();
      }
      @Override
      public Adapter caseLModifier(LModifier object)
      {
        return createLModifierAdapter();
      }
      @Override
      public Adapter caseLMultiplicity(LMultiplicity object)
      {
        return createLMultiplicityAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntityModel <em>LEntity Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEntityModel
   * @generated
   */
  public Adapter createLEntityModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LPackage <em>LPackage</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LPackage
   * @generated
   */
  public Adapter createLPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LImport <em>LImport</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LImport
   * @generated
   */
  public Adapter createLImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntity <em>LEntity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEntity
   * @generated
   */
  public Adapter createLEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LEntityMember <em>LEntity Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEntityMember
   * @generated
   */
  public Adapter createLEntityMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LReference <em>LReference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LReference
   * @generated
   */
  public Adapter createLReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LReferenceJVM <em>LReference JVM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LReferenceJVM
   * @generated
   */
  public Adapter createLReferenceJVMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LProperty <em>LProperty</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LProperty
   * @generated
   */
  public Adapter createLPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LRefers <em>LRefers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LRefers
   * @generated
   */
  public Adapter createLRefersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LContains <em>LContains</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LContains
   * @generated
   */
  public Adapter createLContainsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LContainer <em>LContainer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LContainer
   * @generated
   */
  public Adapter createLContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LEmbedds <em>LEmbedds</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LEmbedds
   * @generated
   */
  public Adapter createLEmbeddsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LRefersJVM <em>LRefers JVM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LRefersJVM
   * @generated
   */
  public Adapter createLRefersJVMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LContainsJVM <em>LContains JVM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LContainsJVM
   * @generated
   */
  public Adapter createLContainsJVMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LOperation <em>LOperation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LOperation
   * @generated
   */
  public Adapter createLOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LModifier <em>LModifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LModifier
   * @generated
   */
  public Adapter createLModifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.lentity.LMultiplicity <em>LMultiplicity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.lentity.LMultiplicity
   * @generated
   */
  public Adapter createLMultiplicityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LentityAdapterFactory
