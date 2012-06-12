/**
 */
package org.lunifera.metamodel.dsl.jpa.jpa;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.dsl.jpa.jpa.JpaFactory
 * @model kind="package"
 * @generated
 */
public interface JpaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jpa";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lunifera.org/metamodel/dsl/jpa/Jpa";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jpa";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JpaPackage eINSTANCE = org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl.init();

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAModelImpl <em>JPA Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAModelImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJPAModel()
   * @generated
   */
  int JPA_MODEL = 0;

  /**
   * The number of structural features of the '<em>JPA Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAEntityImpl <em>JPA Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAEntityImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJPAEntity()
   * @generated
   */
  int JPA_ENTITY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_ENTITY__NAME = JPA_MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>JPA Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_ENTITY_FEATURE_COUNT = JPA_MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAPropertyImpl <em>JPA Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAPropertyImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJPAProperty()
   * @generated
   */
  int JPA_PROPERTY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_PROPERTY__NAME = JPA_MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>JPA Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_PROPERTY_FEATURE_COUNT = JPA_MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAReferenceImpl <em>JPA Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAReferenceImpl
   * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJPAReference()
   * @generated
   */
  int JPA_REFERENCE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_REFERENCE__NAME = JPA_MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>JPA Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_REFERENCE_FEATURE_COUNT = JPA_MODEL_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.JPAModel <em>JPA Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JPA Model</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JPAModel
   * @generated
   */
  EClass getJPAModel();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.JPAEntity <em>JPA Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JPA Entity</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JPAEntity
   * @generated
   */
  EClass getJPAEntity();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.jpa.jpa.JPAEntity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JPAEntity#getName()
   * @see #getJPAEntity()
   * @generated
   */
  EReference getJPAEntity_Name();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.JPAProperty <em>JPA Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JPA Property</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JPAProperty
   * @generated
   */
  EClass getJPAProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.jpa.jpa.JPAProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JPAProperty#getName()
   * @see #getJPAProperty()
   * @generated
   */
  EReference getJPAProperty_Name();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.jpa.jpa.JPAReference <em>JPA Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JPA Reference</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JPAReference
   * @generated
   */
  EClass getJPAReference();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.jpa.jpa.JPAReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.jpa.jpa.JPAReference#getName()
   * @see #getJPAReference()
   * @generated
   */
  EReference getJPAReference_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JpaFactory getJpaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAModelImpl <em>JPA Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAModelImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJPAModel()
     * @generated
     */
    EClass JPA_MODEL = eINSTANCE.getJPAModel();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAEntityImpl <em>JPA Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAEntityImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJPAEntity()
     * @generated
     */
    EClass JPA_ENTITY = eINSTANCE.getJPAEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JPA_ENTITY__NAME = eINSTANCE.getJPAEntity_Name();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAPropertyImpl <em>JPA Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAPropertyImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJPAProperty()
     * @generated
     */
    EClass JPA_PROPERTY = eINSTANCE.getJPAProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JPA_PROPERTY__NAME = eINSTANCE.getJPAProperty_Name();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAReferenceImpl <em>JPA Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JPAReferenceImpl
     * @see org.lunifera.metamodel.dsl.jpa.jpa.impl.JpaPackageImpl#getJPAReference()
     * @generated
     */
    EClass JPA_REFERENCE = eINSTANCE.getJPAReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JPA_REFERENCE__NAME = eINSTANCE.getJPAReference_Name();

  }

} //JpaPackage
