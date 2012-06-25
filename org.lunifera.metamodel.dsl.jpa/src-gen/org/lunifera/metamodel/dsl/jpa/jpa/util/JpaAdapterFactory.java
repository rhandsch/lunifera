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
      public Adapter caseJpaEntityAnnotation(JpaEntityAnnotation object)
      {
        return createJpaEntityAnnotationAdapter();
      }
      @Override
      public Adapter caseJpaPropertyAnnotation(JpaPropertyAnnotation object)
      {
        return createJpaPropertyAnnotationAdapter();
      }
      @Override
      public Adapter caseJpaReferenceAnnotation(JpaReferenceAnnotation object)
      {
        return createJpaReferenceAnnotationAdapter();
      }
      @Override
      public Adapter caseEmbeddableAnnotation(EmbeddableAnnotation object)
      {
        return createEmbeddableAnnotationAdapter();
      }
      @Override
      public Adapter caseCachableAnnotation(CachableAnnotation object)
      {
        return createCachableAnnotationAdapter();
      }
      @Override
      public Adapter caseIdAnnotation(IdAnnotation object)
      {
        return createIdAnnotationAdapter();
      }
      @Override
      public Adapter caseNullableAnnotation(NullableAnnotation object)
      {
        return createNullableAnnotationAdapter();
      }
      @Override
      public Adapter caseManyToManyAnnotation(ManyToManyAnnotation object)
      {
        return createManyToManyAnnotationAdapter();
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
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.JpaEntityAnnotation <em>Entity Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaEntityAnnotation
   * @generated
   */
  public Adapter createJpaEntityAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.JpaPropertyAnnotation <em>Property Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPropertyAnnotation
   * @generated
   */
  public Adapter createJpaPropertyAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.JpaReferenceAnnotation <em>Reference Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaReferenceAnnotation
   * @generated
   */
  public Adapter createJpaReferenceAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.EmbeddableAnnotation <em>Embeddable Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.EmbeddableAnnotation
   * @generated
   */
  public Adapter createEmbeddableAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.CachableAnnotation <em>Cachable Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.CachableAnnotation
   * @generated
   */
  public Adapter createCachableAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.IdAnnotation <em>Id Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.IdAnnotation
   * @generated
   */
  public Adapter createIdAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.NullableAnnotation <em>Nullable Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.NullableAnnotation
   * @generated
   */
  public Adapter createNullableAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation <em>Many To Many Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.ManyToManyAnnotation
   * @generated
   */
  public Adapter createManyToManyAnnotationAdapter()
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
