/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.lunifera.metamodel.dsl.entity.entitymodel.*;

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
 * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage
 * @generated
 */
public class EntitymodelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EntitymodelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntitymodelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EntitymodelPackage.eINSTANCE;
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
      case EntitymodelPackage.LENTITY_MODEL:
      {
        LEntityModel lEntityModel = (LEntityModel)theEObject;
        T result = caseLEntityModel(lEntityModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EntitymodelPackage.LPACKAGE:
      {
        LPackage lPackage = (LPackage)theEObject;
        T result = caseLPackage(lPackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EntitymodelPackage.LIMPORT:
      {
        LImport lImport = (LImport)theEObject;
        T result = caseLImport(lImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EntitymodelPackage.LGEN_SETTINGS:
      {
        LGenSettings lGenSettings = (LGenSettings)theEObject;
        T result = caseLGenSettings(lGenSettings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EntitymodelPackage.LENTITY:
      {
        LEntity lEntity = (LEntity)theEObject;
        T result = caseLEntity(lEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EntitymodelPackage.LENTITY_MEMBER:
      {
        LEntityMember lEntityMember = (LEntityMember)theEObject;
        T result = caseLEntityMember(lEntityMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EntitymodelPackage.LREFERENCE:
      {
        LReference lReference = (LReference)theEObject;
        T result = caseLReference(lReference);
        if (result == null) result = caseLEntityMember(lReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EntitymodelPackage.LPROPERTY:
      {
        LProperty lProperty = (LProperty)theEObject;
        T result = caseLProperty(lProperty);
        if (result == null) result = caseLEntityMember(lProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EntitymodelPackage.LREFERS:
      {
        LRefers lRefers = (LRefers)theEObject;
        T result = caseLRefers(lRefers);
        if (result == null) result = caseLReference(lRefers);
        if (result == null) result = caseLEntityMember(lRefers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EntitymodelPackage.LCONTAINS:
      {
        LContains lContains = (LContains)theEObject;
        T result = caseLContains(lContains);
        if (result == null) result = caseLReference(lContains);
        if (result == null) result = caseLEntityMember(lContains);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EntitymodelPackage.LCONTAINER:
      {
        LContainer lContainer = (LContainer)theEObject;
        T result = caseLContainer(lContainer);
        if (result == null) result = caseLReference(lContainer);
        if (result == null) result = caseLEntityMember(lContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EntitymodelPackage.LEMBEDDS:
      {
        LEmbedds lEmbedds = (LEmbedds)theEObject;
        T result = caseLEmbedds(lEmbedds);
        if (result == null) result = caseLEntityMember(lEmbedds);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EntitymodelPackage.LOPERATION:
      {
        LOperation lOperation = (LOperation)theEObject;
        T result = caseLOperation(lOperation);
        if (result == null) result = caseLEntityMember(lOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EntitymodelPackage.LMODIFIER:
      {
        LModifier lModifier = (LModifier)theEObject;
        T result = caseLModifier(lModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EntitymodelPackage.LMULTIPLICITY:
      {
        LMultiplicity lMultiplicity = (LMultiplicity)theEObject;
        T result = caseLMultiplicity(lMultiplicity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LEntity Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LEntity Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLEntityModel(LEntityModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LPackage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LPackage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLPackage(LPackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LImport</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LImport</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLImport(LImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LGen Settings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LGen Settings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLGenSettings(LGenSettings object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LEntity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LEntity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLEntity(LEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LEntity Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LEntity Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLEntityMember(LEntityMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LReference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LReference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLReference(LReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LProperty</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LProperty</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLProperty(LProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LRefers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LRefers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLRefers(LRefers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LContains</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LContains</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLContains(LContains object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LContainer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LContainer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLContainer(LContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LEmbedds</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LEmbedds</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLEmbedds(LEmbedds object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LOperation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LOperation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLOperation(LOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LModifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LModifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLModifier(LModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LMultiplicity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LMultiplicity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLMultiplicity(LMultiplicity object)
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

} //EntitymodelSwitch
