/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.metamodel.dsl.entity.entity.AbstractElement;
import org.lunifera.metamodel.dsl.entity.entity.AbstractFeature;

import org.lunifera.metamodel.dsl.jpa.jpa.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage
 * @generated
 */
public class JpaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JpaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JpaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JpaPackage.eINSTANCE;
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
  protected JpaSwitch<Adapter> modelSwitch =
    new JpaSwitch<Adapter>()
    {
      @Override
      public Adapter caseJModel(JModel object)
      {
        return createJModelAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseJpaAnnotation(JpaAnnotation object)
      {
        return createJpaAnnotationAdapter();
      }
      @Override
      public Adapter caseEntityAnnotation(EntityAnnotation object)
      {
        return createEntityAnnotationAdapter();
      }
      @Override
      public Adapter casePropertyAnnotation(PropertyAnnotation object)
      {
        return createPropertyAnnotationAdapter();
      }
      @Override
      public Adapter caseReferenceAnnotation(ReferenceAnnotation object)
      {
        return createReferenceAnnotationAdapter();
      }
      @Override
      public Adapter caseEmbeddableAnnot(EmbeddableAnnot object)
      {
        return createEmbeddableAnnotAdapter();
      }
      @Override
      public Adapter caseCachableAnnot(CachableAnnot object)
      {
        return createCachableAnnotAdapter();
      }
      @Override
      public Adapter caseIdAnnot(IdAnnot object)
      {
        return createIdAnnotAdapter();
      }
      @Override
      public Adapter caseNullableAnnot(NullableAnnot object)
      {
        return createNullableAnnotAdapter();
      }
      @Override
      public Adapter caseUniqueAnnot(UniqueAnnot object)
      {
        return createUniqueAnnotAdapter();
      }
      @Override
      public Adapter caseLobAnnot(LobAnnot object)
      {
        return createLobAnnotAdapter();
      }
      @Override
      public Adapter caseManyToManyAnnot(ManyToManyAnnot object)
      {
        return createManyToManyAnnotAdapter();
      }
      @Override
      public Adapter caseManyToOneAnnot(ManyToOneAnnot object)
      {
        return createManyToOneAnnotAdapter();
      }
      @Override
      public Adapter caseOneToManyAnnot(OneToManyAnnot object)
      {
        return createOneToManyAnnotAdapter();
      }
      @Override
      public Adapter caseOneToOneAnnot(OneToOneAnnot object)
      {
        return createOneToOneAnnotAdapter();
      }
      @Override
      public Adapter caseParamTargetEntity(ParamTargetEntity object)
      {
        return createParamTargetEntityAdapter();
      }
      @Override
      public Adapter caseParamMappedBy(ParamMappedBy object)
      {
        return createParamMappedByAdapter();
      }
      @Override
      public Adapter caseParamCascade(ParamCascade object)
      {
        return createParamCascadeAdapter();
      }
      @Override
      public Adapter caseParamFetch(ParamFetch object)
      {
        return createParamFetchAdapter();
      }
      @Override
      public Adapter caseParamOrphanRemoval(ParamOrphanRemoval object)
      {
        return createParamOrphanRemovalAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter caseEntity_Entity(org.lunifera.metamodel.dsl.entity.entity.Entity object)
      {
        return createEntity_EntityAdapter();
      }
      @Override
      public Adapter caseAbstractFeature(AbstractFeature object)
      {
        return createAbstractFeatureAdapter();
      }
      @Override
      public Adapter caseEntity_Property(org.lunifera.metamodel.dsl.entity.entity.Property object)
      {
        return createEntity_PropertyAdapter();
      }
      @Override
      public Adapter caseEntity_Reference(org.lunifera.metamodel.dsl.entity.entity.Reference object)
      {
        return createEntity_ReferenceAdapter();
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
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.JModel <em>JModel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JModel
   * @generated
   */
  public Adapter createJModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.JpaAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaAnnotation
   * @generated
   */
  public Adapter createJpaAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.EntityAnnotation <em>Entity Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.EntityAnnotation
   * @generated
   */
  public Adapter createEntityAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.PropertyAnnotation <em>Property Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.PropertyAnnotation
   * @generated
   */
  public Adapter createPropertyAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ReferenceAnnotation <em>Reference Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ReferenceAnnotation
   * @generated
   */
  public Adapter createReferenceAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.EmbeddableAnnot <em>Embeddable Annot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.EmbeddableAnnot
   * @generated
   */
  public Adapter createEmbeddableAnnotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.CachableAnnot <em>Cachable Annot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.CachableAnnot
   * @generated
   */
  public Adapter createCachableAnnotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.IdAnnot <em>Id Annot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.IdAnnot
   * @generated
   */
  public Adapter createIdAnnotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.NullableAnnot <em>Nullable Annot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.NullableAnnot
   * @generated
   */
  public Adapter createNullableAnnotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.UniqueAnnot <em>Unique Annot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.UniqueAnnot
   * @generated
   */
  public Adapter createUniqueAnnotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.LobAnnot <em>Lob Annot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.LobAnnot
   * @generated
   */
  public Adapter createLobAnnotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnot <em>Many To Many Annot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnot
   * @generated
   */
  public Adapter createManyToManyAnnotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToOneAnnot <em>Many To One Annot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToOneAnnot
   * @generated
   */
  public Adapter createManyToOneAnnotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot <em>One To Many Annot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot
   * @generated
   */
  public Adapter createOneToManyAnnotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot <em>One To One Annot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot
   * @generated
   */
  public Adapter createOneToOneAnnotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity <em>Param Target Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamTargetEntity
   * @generated
   */
  public Adapter createParamTargetEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamMappedBy <em>Param Mapped By</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamMappedBy
   * @generated
   */
  public Adapter createParamMappedByAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamCascade <em>Param Cascade</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamCascade
   * @generated
   */
  public Adapter createParamCascadeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamFetch <em>Param Fetch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamFetch
   * @generated
   */
  public Adapter createParamFetchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ParamOrphanRemoval <em>Param Orphan Removal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ParamOrphanRemoval
   * @generated
   */
  public Adapter createParamOrphanRemovalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entity.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entity.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entity.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entity.Entity
   * @generated
   */
  public Adapter createEntity_EntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entity.AbstractFeature <em>Abstract Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entity.AbstractFeature
   * @generated
   */
  public Adapter createAbstractFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entity.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entity.Property
   * @generated
   */
  public Adapter createEntity_PropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.entity.entity.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.entity.entity.Reference
   * @generated
   */
  public Adapter createEntity_ReferenceAdapter()
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

} //JpaAdapterFactory
