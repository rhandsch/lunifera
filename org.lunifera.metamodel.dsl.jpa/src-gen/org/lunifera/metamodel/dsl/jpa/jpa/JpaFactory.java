/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage
 * @generated
 */
public interface JpaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JpaFactory eINSTANCE = org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>JPA Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JPA Model</em>'.
   * @generated
   */
  JPAModel createJPAModel();

  /**
   * Returns a new object of class '<em>JPA Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JPA Entity</em>'.
   * @generated
   */
  JPAEntity createJPAEntity();

  /**
   * Returns a new object of class '<em>JPA Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JPA Property</em>'.
   * @generated
   */
  JPAProperty createJPAProperty();

  /**
   * Returns a new object of class '<em>JPA Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JPA Reference</em>'.
   * @generated
   */
  JPAReference createJPAReference();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JpaPackage getJpaPackage();

} //JpaFactory
