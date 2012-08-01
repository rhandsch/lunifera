/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.metamodel.dsl.entity.entitymodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage
 * @generated
 */
public class EntitymodelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EntitymodelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntitymodelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EntitymodelPackage.eINSTANCE;
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
  protected EntitymodelSwitch<Adapter> modelSwitch =
    new EntitymodelSwitch<Adapter>()
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
      public Adapter caseLGenSettings(LGenSettings object)
      {
        return createLGenSettingsAdapter();
      }
      @Override
      public Adapter caseLType(LType object)
      {
        return createLTypeAdapter();
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
      public Adapter caseLEnum(LEnum object)
      {
        return createLEnumAdapter();
      }
      @Override
      public Adapter caseLEnumLiteral(LEnumLiteral object)
      {
        return createLEnumLiteralAdapter();
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
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel <em>LEntity Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel
   * @generated
   */
  public Adapter createLEntityModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LPackage <em>LPackage</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LPackage
   * @generated
   */
  public Adapter createLPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LImport <em>LImport</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LImport
   * @generated
   */
  public Adapter createLImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings <em>LGen Settings</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings
   * @generated
   */
  public Adapter createLGenSettingsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LType <em>LType</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LType
   * @generated
   */
  public Adapter createLTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntity <em>LEntity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEntity
   * @generated
   */
  public Adapter createLEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEntityMember <em>LEntity Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEntityMember
   * @generated
   */
  public Adapter createLEntityMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LReference <em>LReference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LReference
   * @generated
   */
  public Adapter createLReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LProperty <em>LProperty</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LProperty
   * @generated
   */
  public Adapter createLPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LRefers <em>LRefers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LRefers
   * @generated
   */
  public Adapter createLRefersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LContains <em>LContains</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LContains
   * @generated
   */
  public Adapter createLContainsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LContainer <em>LContainer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LContainer
   * @generated
   */
  public Adapter createLContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEmbedds <em>LEmbedds</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEmbedds
   * @generated
   */
  public Adapter createLEmbeddsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LOperation <em>LOperation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LOperation
   * @generated
   */
  public Adapter createLOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LModifier <em>LModifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LModifier
   * @generated
   */
  public Adapter createLModifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEnum <em>LEnum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEnum
   * @generated
   */
  public Adapter createLEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LEnumLiteral <em>LEnum Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LEnumLiteral
   * @generated
   */
  public Adapter createLEnumLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity <em>LMultiplicity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity
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

} //EntitymodelAdapterFactory
