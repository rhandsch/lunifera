/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage
 * @generated
 */
public interface EntitymodelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EntitymodelFactory eINSTANCE = org.lunifera.metamodel.dsl.entity.entitymodel.impl.EntitymodelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>LEntity Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LEntity Model</em>'.
   * @generated
   */
  LEntityModel createLEntityModel();

  /**
   * Returns a new object of class '<em>LPackage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LPackage</em>'.
   * @generated
   */
  LPackage createLPackage();

  /**
   * Returns a new object of class '<em>LImport</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LImport</em>'.
   * @generated
   */
  LImport createLImport();

  /**
   * Returns a new object of class '<em>LEntity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LEntity</em>'.
   * @generated
   */
  LEntity createLEntity();

  /**
   * Returns a new object of class '<em>LEntity Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LEntity Member</em>'.
   * @generated
   */
  LEntityMember createLEntityMember();

  /**
   * Returns a new object of class '<em>LReference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LReference</em>'.
   * @generated
   */
  LReference createLReference();

  /**
   * Returns a new object of class '<em>LProperty</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LProperty</em>'.
   * @generated
   */
  LProperty createLProperty();

  /**
   * Returns a new object of class '<em>LRefers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LRefers</em>'.
   * @generated
   */
  LRefers createLRefers();

  /**
   * Returns a new object of class '<em>LContains</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LContains</em>'.
   * @generated
   */
  LContains createLContains();

  /**
   * Returns a new object of class '<em>LContainer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LContainer</em>'.
   * @generated
   */
  LContainer createLContainer();

  /**
   * Returns a new object of class '<em>LEmbedds</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LEmbedds</em>'.
   * @generated
   */
  LEmbedds createLEmbedds();

  /**
   * Returns a new object of class '<em>LOperation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LOperation</em>'.
   * @generated
   */
  LOperation createLOperation();

  /**
   * Returns a new object of class '<em>LModifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LModifier</em>'.
   * @generated
   */
  LModifier createLModifier();

  /**
   * Returns a new object of class '<em>LMultiplicity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LMultiplicity</em>'.
   * @generated
   */
  LMultiplicity createLMultiplicity();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EntitymodelPackage getEntitymodelPackage();

} //EntitymodelFactory
