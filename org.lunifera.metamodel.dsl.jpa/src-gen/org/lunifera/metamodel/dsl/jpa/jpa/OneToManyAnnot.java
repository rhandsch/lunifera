/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One To Many Annot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getOrphanRemoval <em>Orphan Removal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getOneToManyAnnot()
 * @model
 * @generated
 */
public interface OneToManyAnnot extends ReferenceAnnotation
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
   * @see #setTargetEntity(ParamTargetEntity)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getOneToManyAnnot_TargetEntity()
   * @model containment="true"
   * @generated
   */
  ParamTargetEntity getTargetEntity();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getTargetEntity <em>Target Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Entity</em>' containment reference.
   * @see #getTargetEntity()
   * @generated
   */
  void setTargetEntity(ParamTargetEntity value);

  /**
   * Returns the value of the '<em><b>Mapped By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped By</em>' containment reference.
   * @see #setMappedBy(ParamMappedBy)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getOneToManyAnnot_MappedBy()
   * @model containment="true"
   * @generated
   */
  ParamMappedBy getMappedBy();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getMappedBy <em>Mapped By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped By</em>' containment reference.
   * @see #getMappedBy()
   * @generated
   */
  void setMappedBy(ParamMappedBy value);

  /**
   * Returns the value of the '<em><b>Cascade</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cascade</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cascade</em>' containment reference.
   * @see #setCascade(ParamCascade)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getOneToManyAnnot_Cascade()
   * @model containment="true"
   * @generated
   */
  ParamCascade getCascade();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getCascade <em>Cascade</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cascade</em>' containment reference.
   * @see #getCascade()
   * @generated
   */
  void setCascade(ParamCascade value);

  /**
   * Returns the value of the '<em><b>Fetch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fetch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fetch</em>' containment reference.
   * @see #setFetch(ParamFetch)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getOneToManyAnnot_Fetch()
   * @model containment="true"
   * @generated
   */
  ParamFetch getFetch();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getFetch <em>Fetch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fetch</em>' containment reference.
   * @see #getFetch()
   * @generated
   */
  void setFetch(ParamFetch value);

  /**
   * Returns the value of the '<em><b>Orphan Removal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orphan Removal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orphan Removal</em>' containment reference.
   * @see #setOrphanRemoval(ParamOrphanRemoval)
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage#getOneToManyAnnot_OrphanRemoval()
   * @model containment="true"
   * @generated
   */
  ParamOrphanRemoval getOrphanRemoval();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.jpa.jpa.OneToManyAnnot#getOrphanRemoval <em>Orphan Removal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orphan Removal</em>' containment reference.
   * @see #getOrphanRemoval()
   * @generated
   */
  void setOrphanRemoval(ParamOrphanRemoval value);

} // OneToManyAnnot
