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
   * Returns a new object of class '<em>Embeddable Annot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Embeddable Annot</em>'.
   * @generated
   */
  EmbeddableAnnot createEmbeddableAnnot();

  /**
   * Returns a new object of class '<em>Cachable Annot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cachable Annot</em>'.
   * @generated
   */
  CachableAnnot createCachableAnnot();

  /**
   * Returns a new object of class '<em>Id Annot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Id Annot</em>'.
   * @generated
   */
  IdAnnot createIdAnnot();

  /**
   * Returns a new object of class '<em>Nullable Annot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nullable Annot</em>'.
   * @generated
   */
  NullableAnnot createNullableAnnot();

  /**
   * Returns a new object of class '<em>Unique Annot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unique Annot</em>'.
   * @generated
   */
  UniqueAnnot createUniqueAnnot();

  /**
   * Returns a new object of class '<em>Lob Annot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lob Annot</em>'.
   * @generated
   */
  LobAnnot createLobAnnot();

  /**
   * Returns a new object of class '<em>Many To Many Annot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Many To Many Annot</em>'.
   * @generated
   */
  ManyToManyAnnot createManyToManyAnnot();

  /**
   * Returns a new object of class '<em>Many To One Annot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Many To One Annot</em>'.
   * @generated
   */
  ManyToOneAnnot createManyToOneAnnot();

  /**
   * Returns a new object of class '<em>One To Many Annot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>One To Many Annot</em>'.
   * @generated
   */
  OneToManyAnnot createOneToManyAnnot();

  /**
   * Returns a new object of class '<em>One To One Annot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>One To One Annot</em>'.
   * @generated
   */
  OneToOneAnnot createOneToOneAnnot();

  /**
   * Returns a new object of class '<em>Param Target Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param Target Entity</em>'.
   * @generated
   */
  ParamTargetEntity createParamTargetEntity();

  /**
   * Returns a new object of class '<em>Param Mapped By</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param Mapped By</em>'.
   * @generated
   */
  ParamMappedBy createParamMappedBy();

  /**
   * Returns a new object of class '<em>Param Cascade</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param Cascade</em>'.
   * @generated
   */
  ParamCascade createParamCascade();

  /**
   * Returns a new object of class '<em>Param Fetch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param Fetch</em>'.
   * @generated
   */
  ParamFetch createParamFetch();

  /**
   * Returns a new object of class '<em>Param Orphan Removal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param Orphan Removal</em>'.
   * @generated
   */
  ParamOrphanRemoval createParamOrphanRemoval();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JpaPackage getJpaPackage();

} //JpaFactory
