/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.lunifera.metamodel.dsl.entity.entity.AbstractElement;
import org.lunifera.metamodel.dsl.entity.entity.AbstractFeature;

import org.lunifera.metamodel.dsl.jpa.jpa.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage
 * @generated
 */
public class JpaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JpaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JpaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = JpaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case JpaPackage.JMODEL:
      {
        JModel jModel = (JModel)theEObject;
        T result = caseJModel(jModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = caseEntity_Entity(entity);
        if (result == null) result = caseAbstractElement(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = caseEntity_Property(property);
        if (result == null) result = caseAbstractFeature(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = caseEntity_Reference(reference);
        if (result == null) result = caseAbstractFeature(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.JPA_ANNOTATION:
      {
        JpaAnnotation jpaAnnotation = (JpaAnnotation)theEObject;
        T result = caseJpaAnnotation(jpaAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.ENTITY_ANNOTATION:
      {
        EntityAnnotation entityAnnotation = (EntityAnnotation)theEObject;
        T result = caseEntityAnnotation(entityAnnotation);
        if (result == null) result = caseJpaAnnotation(entityAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.PROPERTY_ANNOTATION:
      {
        PropertyAnnotation propertyAnnotation = (PropertyAnnotation)theEObject;
        T result = casePropertyAnnotation(propertyAnnotation);
        if (result == null) result = caseJpaAnnotation(propertyAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.REFERENCE_ANNOTATION:
      {
        ReferenceAnnotation referenceAnnotation = (ReferenceAnnotation)theEObject;
        T result = caseReferenceAnnotation(referenceAnnotation);
        if (result == null) result = caseJpaAnnotation(referenceAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.EMBEDDABLE_ANNOT:
      {
        EmbeddableAnnot embeddableAnnot = (EmbeddableAnnot)theEObject;
        T result = caseEmbeddableAnnot(embeddableAnnot);
        if (result == null) result = caseEntityAnnotation(embeddableAnnot);
        if (result == null) result = caseJpaAnnotation(embeddableAnnot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.CACHABLE_ANNOT:
      {
        CachableAnnot cachableAnnot = (CachableAnnot)theEObject;
        T result = caseCachableAnnot(cachableAnnot);
        if (result == null) result = caseEntityAnnotation(cachableAnnot);
        if (result == null) result = caseJpaAnnotation(cachableAnnot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.ID_ANNOT:
      {
        IdAnnot idAnnot = (IdAnnot)theEObject;
        T result = caseIdAnnot(idAnnot);
        if (result == null) result = casePropertyAnnotation(idAnnot);
        if (result == null) result = caseJpaAnnotation(idAnnot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.NULLABLE_ANNOT:
      {
        NullableAnnot nullableAnnot = (NullableAnnot)theEObject;
        T result = caseNullableAnnot(nullableAnnot);
        if (result == null) result = casePropertyAnnotation(nullableAnnot);
        if (result == null) result = caseJpaAnnotation(nullableAnnot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.UNIQUE_ANNOT:
      {
        UniqueAnnot uniqueAnnot = (UniqueAnnot)theEObject;
        T result = caseUniqueAnnot(uniqueAnnot);
        if (result == null) result = casePropertyAnnotation(uniqueAnnot);
        if (result == null) result = caseJpaAnnotation(uniqueAnnot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.LOB_ANNOT:
      {
        LobAnnot lobAnnot = (LobAnnot)theEObject;
        T result = caseLobAnnot(lobAnnot);
        if (result == null) result = casePropertyAnnotation(lobAnnot);
        if (result == null) result = caseJpaAnnotation(lobAnnot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.MANY_TO_MANY_ANNOT:
      {
        ManyToManyAnnot manyToManyAnnot = (ManyToManyAnnot)theEObject;
        T result = caseManyToManyAnnot(manyToManyAnnot);
        if (result == null) result = caseReferenceAnnotation(manyToManyAnnot);
        if (result == null) result = caseJpaAnnotation(manyToManyAnnot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.MANY_TO_ONE_ANNOT:
      {
        ManyToOneAnnot manyToOneAnnot = (ManyToOneAnnot)theEObject;
        T result = caseManyToOneAnnot(manyToOneAnnot);
        if (result == null) result = caseReferenceAnnotation(manyToOneAnnot);
        if (result == null) result = caseJpaAnnotation(manyToOneAnnot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.ONE_TO_MANY_ANNOT:
      {
        OneToManyAnnot oneToManyAnnot = (OneToManyAnnot)theEObject;
        T result = caseOneToManyAnnot(oneToManyAnnot);
        if (result == null) result = caseReferenceAnnotation(oneToManyAnnot);
        if (result == null) result = caseJpaAnnotation(oneToManyAnnot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.ONE_TO_ONE_ANNOT:
      {
        OneToOneAnnot oneToOneAnnot = (OneToOneAnnot)theEObject;
        T result = caseOneToOneAnnot(oneToOneAnnot);
        if (result == null) result = caseReferenceAnnotation(oneToOneAnnot);
        if (result == null) result = caseJpaAnnotation(oneToOneAnnot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.PARAM_TARGET_ENTITY:
      {
        ParamTargetEntity paramTargetEntity = (ParamTargetEntity)theEObject;
        T result = caseParamTargetEntity(paramTargetEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.PARAM_MAPPED_BY:
      {
        ParamMappedBy paramMappedBy = (ParamMappedBy)theEObject;
        T result = caseParamMappedBy(paramMappedBy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.PARAM_CASCADE:
      {
        ParamCascade paramCascade = (ParamCascade)theEObject;
        T result = caseParamCascade(paramCascade);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.PARAM_FETCH:
      {
        ParamFetch paramFetch = (ParamFetch)theEObject;
        T result = caseParamFetch(paramFetch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.PARAM_ORPHAN_REMOVAL:
      {
        ParamOrphanRemoval paramOrphanRemoval = (ParamOrphanRemoval)theEObject;
        T result = caseParamOrphanRemoval(paramOrphanRemoval);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JModel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JModel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJModel(JModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJpaAnnotation(JpaAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityAnnotation(EntityAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyAnnotation(PropertyAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceAnnotation(ReferenceAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Embeddable Annot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Embeddable Annot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmbeddableAnnot(EmbeddableAnnot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cachable Annot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cachable Annot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCachableAnnot(CachableAnnot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Annot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Annot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdAnnot(IdAnnot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nullable Annot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nullable Annot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullableAnnot(NullableAnnot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unique Annot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unique Annot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniqueAnnot(UniqueAnnot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lob Annot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lob Annot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLobAnnot(LobAnnot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Many To Many Annot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Many To Many Annot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseManyToManyAnnot(ManyToManyAnnot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Many To One Annot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Many To One Annot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseManyToOneAnnot(ManyToOneAnnot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>One To Many Annot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>One To Many Annot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOneToManyAnnot(OneToManyAnnot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>One To One Annot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>One To One Annot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOneToOneAnnot(OneToOneAnnot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param Target Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Target Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamTargetEntity(ParamTargetEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param Mapped By</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Mapped By</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamMappedBy(ParamMappedBy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param Cascade</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Cascade</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamCascade(ParamCascade object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param Fetch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Fetch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamFetch(ParamFetch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param Orphan Removal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Orphan Removal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamOrphanRemoval(ParamOrphanRemoval object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity_Entity(org.lunifera.metamodel.dsl.entity.entity.Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractFeature(AbstractFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity_Property(org.lunifera.metamodel.dsl.entity.entity.Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity_Reference(org.lunifera.metamodel.dsl.entity.entity.Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //JpaSwitch
