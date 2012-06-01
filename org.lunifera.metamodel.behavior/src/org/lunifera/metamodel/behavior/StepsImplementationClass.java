/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steps Implementation Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getProjectPath <em>Project Path</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStepsImplementationClass()
 * @model
 * @generated
 */
public interface StepsImplementationClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.behavior.StepsLibrary#getImplementationClasses <em>Implementation Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' container reference.
	 * @see #setLibrary(StepsLibrary)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStepsImplementationClass_Library()
	 * @see org.lunifera.metamodel.behavior.StepsLibrary#getImplementationClasses
	 * @model opposite="ImplementationClasses" required="true" transient="false"
	 * @generated
	 */
	StepsLibrary getLibrary();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getLibrary <em>Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' container reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(StepsLibrary value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.metamodel.behavior.ImplementationLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see org.lunifera.metamodel.behavior.ImplementationLanguage
	 * @see #setLanguage(ImplementationLanguage)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStepsImplementationClass_Language()
	 * @model
	 * @generated
	 */
	ImplementationLanguage getLanguage();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see org.lunifera.metamodel.behavior.ImplementationLanguage
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(ImplementationLanguage value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStepsImplementationClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Project Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Path</em>' attribute.
	 * @see #setProjectPath(String)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStepsImplementationClass_ProjectPath()
	 * @model
	 * @generated
	 */
	String getProjectPath();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getProjectPath <em>Project Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Path</em>' attribute.
	 * @see #getProjectPath()
	 * @generated
	 */
	void setProjectPath(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getStepsImplementationClass_Id()
	 * @model id="true"
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

} // StepsImplementationClass
