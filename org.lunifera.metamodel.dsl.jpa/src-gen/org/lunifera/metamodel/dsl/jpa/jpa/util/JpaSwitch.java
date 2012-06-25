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
      case JpaPackage.JPA_ENTITY_ANNOTATION:
      {
        JpaEntityAnnotation jpaEntityAnnotation = (JpaEntityAnnotation)theEObject;
        T result = caseJpaEntityAnnotation(jpaEntityAnnotation);
        if (result == null) result = caseJpaAnnotation(jpaEntityAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.JPA_PROPERTY_ANNOTATION:
      {
        JpaPropertyAnnotation jpaPropertyAnnotation = (JpaPropertyAnnotation)theEObject;
        T result = caseJpaPropertyAnnotation(jpaPropertyAnnotation);
        if (result == null) result = caseJpaAnnotation(jpaPropertyAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.JPA_REFERENCE_ANNOTATION:
      {
        JpaReferenceAnnotation jpaReferenceAnnotation = (JpaReferenceAnnotation)theEObject;
        T result = caseJpaReferenceAnnotation(jpaReferenceAnnotation);
        if (result == null) result = caseJpaAnnotation(jpaReferenceAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.EMBEDDABLE_ANNOTATION:
      {
        EmbeddableAnnotation embeddableAnnotation = (EmbeddableAnnotation)theEObject;
        T result = caseEmbeddableAnnotation(embeddableAnnotation);
        if (result == null) result = caseJpaEntityAnnotation(embeddableAnnotation);
        if (result == null) result = caseJpaAnnotation(embeddableAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.CACHABLE_ANNOTATION:
      {
        CachableAnnotation cachableAnnotation = (CachableAnnotation)theEObject;
        T result = caseCachableAnnotation(cachableAnnotation);
        if (result == null) result = caseJpaEntityAnnotation(cachableAnnotation);
        if (result == null) result = caseJpaAnnotation(cachableAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.ID_ANNOTATION:
      {
        IdAnnotation idAnnotation = (IdAnnotation)theEObject;
        T result = caseIdAnnotation(idAnnotation);
        if (result == null) result = caseJpaPropertyAnnotation(idAnnotation);
        if (result == null) result = caseJpaAnnotation(idAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.NULLABLE_ANNOTATION:
      {
        NullableAnnotation nullableAnnotation = (NullableAnnotation)theEObject;
        T result = caseNullableAnnotation(nullableAnnotation);
        if (result == null) result = caseJpaPropertyAnnotation(nullableAnnotation);
        if (result == null) result = caseJpaAnnotation(nullableAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.MANY_TO_MANY_ANNOTATION:
      {
        ManyToManyAnnotation manyToManyAnnotation = (ManyToManyAnnotation)theEObject;
        T result = caseManyToManyAnnotation(manyToManyAnnotation);
        if (result == null) result = caseJpaReferenceAnnotation(manyToManyAnnotation);
        if (result == null) result = caseJpaAnnotation(manyToManyAnnotation);
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
  public T caseJpaEntityAnnotation(JpaEntityAnnotation object)
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
  public T caseJpaPropertyAnnotation(JpaPropertyAnnotation object)
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
  public T caseJpaReferenceAnnotation(JpaReferenceAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Embeddable Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Embeddable Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmbeddableAnnotation(EmbeddableAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cachable Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cachable Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCachableAnnotation(CachableAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdAnnotation(IdAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nullable Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nullable Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullableAnnotation(NullableAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Many To Many Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Many To Many Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseManyToManyAnnotation(ManyToManyAnnotation object)
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
