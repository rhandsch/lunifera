/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa.impl;

import org.eclipse.emf.ecore.EClass;

import org.lunifera.metamodel.dsl.jpa.jpa.EntityAnnotation;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EntityAnnotationImpl extends JpaAnnotationImpl implements EntityAnnotation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityAnnotationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JpaPackage.Literals.ENTITY_ANNOTATION;
  }

} //EntityAnnotationImpl
