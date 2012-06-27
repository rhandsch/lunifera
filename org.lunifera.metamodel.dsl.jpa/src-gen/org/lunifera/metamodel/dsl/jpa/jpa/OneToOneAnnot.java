/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One To One Annot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getOrphanRemoval <em>Orphan Removal</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getFetch <em>Fetch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getOneToOneAnnot()
 * @model
 * @generated
 */
public interface OneToOneAnnot extends ReferenceAnnotation
{
  /**
   * Returns the value of the '<em><b>Target Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Entity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Entity</em>' containment reference.
   * @see #setTargetEntity(JvmParameterizedTypeReference)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getOneToOneAnnot_TargetEntity()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getTargetEntity();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getTargetEntity <em>Target Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Entity</em>' containment reference.
   * @see #getTargetEntity()
   * @generated
   */
  void setTargetEntity(JvmParameterizedTypeReference value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.metamodel.dsl.jpa.jpa.classSuffix}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.classSuffix
   * @see #setClass(classSuffix)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getOneToOneAnnot_Class()
   * @model
   * @generated
   */
  classSuffix getClass_();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.classSuffix
   * @see #getClass_()
   * @generated
   */
  void setClass(classSuffix value);

  /**
   * Returns the value of the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped By</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped By</em>' attribute.
   * @see #setMappedBy(String)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getOneToOneAnnot_MappedBy()
   * @model
   * @generated
   */
  String getMappedBy();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getMappedBy <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped By</em>' attribute.
   * @see #getMappedBy()
   * @generated
   */
  void setMappedBy(String value);

  /**
   * Returns the value of the '<em><b>Cascade</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.metamodel.dsl.jpa.jpa.CascadeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cascade</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cascade</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.CascadeType
   * @see #setCascade(CascadeType)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getOneToOneAnnot_Cascade()
   * @model
   * @generated
   */
  CascadeType getCascade();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getCascade <em>Cascade</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cascade</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.CascadeType
   * @see #getCascade()
   * @generated
   */
  void setCascade(CascadeType value);

  /**
   * Returns the value of the '<em><b>Orphan Removal</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.metamodel.dsl.jpa.jpa.booleanType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orphan Removal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orphan Removal</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.booleanType
   * @see #setOrphanRemoval(booleanType)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getOneToOneAnnot_OrphanRemoval()
   * @model
   * @generated
   */
  booleanType getOrphanRemoval();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getOrphanRemoval <em>Orphan Removal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orphan Removal</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.booleanType
   * @see #getOrphanRemoval()
   * @generated
   */
  void setOrphanRemoval(booleanType value);

  /**
   * Returns the value of the '<em><b>Fetch</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.metamodel.dsl.jpa.jpa.FetchType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fetch</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fetch</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.FetchType
   * @see #setFetch(FetchType)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getOneToOneAnnot_Fetch()
   * @model
   * @generated
   */
  FetchType getFetch();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToOneAnnot#getFetch <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fetch</em>' attribute.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.FetchType
   * @see #getFetch()
   * @generated
   */
  void setFetch(FetchType value);

} // OneToOneAnnot
