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
   * Returns a new object of class '<em>JModel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JModel</em>'.
   * @generated
   */
  JModel createJModel();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  JpaAnnotation createJpaAnnotation();

  /**
   * Returns a new object of class '<em>Entity Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Annotation</em>'.
   * @generated
   */
  EntityAnnotation createEntityAnnotation();

  /**
   * Returns a new object of class '<em>Property Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Annotation</em>'.
   * @generated
   */
  PropertyAnnotation createPropertyAnnotation();

  /**
   * Returns a new object of class '<em>Reference Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Annotation</em>'.
   * @generated
   */
  ReferenceAnnotation createReferenceAnnotation();

  /**
   * Returns a new object of class '<em>Embeddable Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Embeddable Annotation</em>'.
   * @generated
   */
  EmbeddableAnnotation createEmbeddableAnnotation();

  /**
   * Returns a new object of class '<em>Cachable Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cachable Annotation</em>'.
   * @generated
   */
  CachableAnnotation createCachableAnnotation();

  /**
   * Returns a new object of class '<em>Id Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Id Annotation</em>'.
   * @generated
   */
  IdAnnotation createIdAnnotation();

  /**
   * Returns a new object of class '<em>Nullable Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nullable Annotation</em>'.
   * @generated
   */
  NullableAnnotation createNullableAnnotation();

  /**
   * Returns a new object of class '<em>Many To Many Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Many To Many Annotation</em>'.
   * @generated
   */
  ManyToManyAnnotation createManyToManyAnnotation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JpaPackage getJpaPackage();

} //JpaFactory
