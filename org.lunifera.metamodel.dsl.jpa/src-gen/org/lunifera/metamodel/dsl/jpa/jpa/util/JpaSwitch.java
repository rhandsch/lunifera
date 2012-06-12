/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.lunifera.metamodel.dsl.jpa.jpa.JPAEntity;
import org.lunifera.metamodel.dsl.jpa.jpa.JPAModel;
import org.lunifera.metamodel.dsl.jpa.jpa.JPAProperty;
import org.lunifera.metamodel.dsl.jpa.jpa.JPAReference;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage;

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
      case JpaPackage.JPA_MODEL:
      {
        JPAModel jpaModel = (JPAModel)theEObject;
        T result = caseJPAModel(jpaModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.JPA_ENTITY:
      {
        JPAEntity jpaEntity = (JPAEntity)theEObject;
        T result = caseJPAEntity(jpaEntity);
        if (result == null) result = caseJPAModel(jpaEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.JPA_PROPERTY:
      {
        JPAProperty jpaProperty = (JPAProperty)theEObject;
        T result = caseJPAProperty(jpaProperty);
        if (result == null) result = caseJPAModel(jpaProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JpaPackage.JPA_REFERENCE:
      {
        JPAReference jpaReference = (JPAReference)theEObject;
        T result = caseJPAReference(jpaReference);
        if (result == null) result = caseJPAModel(jpaReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JPA Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JPA Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJPAModel(JPAModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JPA Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JPA Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJPAEntity(JPAEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JPA Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JPA Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJPAProperty(JPAProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JPA Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JPA Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJPAReference(JPAReference object)
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
