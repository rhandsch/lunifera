/**
 * <copyright>
 * </copyright>
 *

 */
package org.lunifera.metamodel.dsl.jpa.jpa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.metamodel.dsl.jpa.jpa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JpaFactoryImpl extends EFactoryImpl implements JpaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JpaFactory init()
  {
    try
    {
      JpaFactory theJpaFactory = (JpaFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.lunifera.org/metamodel/dsl/jpa/Jpa"); 
      if (theJpaFactory != null)
      {
        return theJpaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JpaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JpaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JpaPackage.JPA_MODEL: return createJPAModel();
      case JpaPackage.JPA_ENTITY: return createJPAEntity();
      case JpaPackage.JPA_PROPERTY: return createJPAProperty();
      case JpaPackage.JPA_REFERENCE: return createJPAReference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPAModel createJPAModel()
  {
    JPAModelImpl jpaModel = new JPAModelImpl();
    return jpaModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPAEntity createJPAEntity()
  {
    JPAEntityImpl jpaEntity = new JPAEntityImpl();
    return jpaEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPAProperty createJPAProperty()
  {
    JPAPropertyImpl jpaProperty = new JPAPropertyImpl();
    return jpaProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPAReference createJPAReference()
  {
    JPAReferenceImpl jpaReference = new JPAReferenceImpl();
    return jpaReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JpaPackage getJpaPackage()
  {
    return (JpaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JpaPackage getPackage()
  {
    return JpaPackage.eINSTANCE;
  }

} //JpaFactoryImpl
