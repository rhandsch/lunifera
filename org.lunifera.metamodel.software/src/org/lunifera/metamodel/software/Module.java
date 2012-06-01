/**
 */
package org.lunifera.metamodel.software;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.software.Module#getParentSystem <em>Parent System</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.Module#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.Module#getTechnologys <em>Technologys</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.software.SoftwarePackage#getModule()
 * @model
 * @generated
 */
public interface Module extends AbstractSoftwareComponent {
	/**
	 * Returns the value of the '<em><b>Parent System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent System</em>' reference.
	 * @see #setParentSystem(org.lunifera.metamodel.software.System)
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getModule_ParentSystem()
	 * @model required="true"
	 * @generated
	 */
	org.lunifera.metamodel.software.System getParentSystem();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.software.Module#getParentSystem <em>Parent System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent System</em>' reference.
	 * @see #getParentSystem()
	 * @generated
	 */
	void setParentSystem(org.lunifera.metamodel.software.System value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.software.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getModule_Features()
	 * @model
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Technologys</b></em>' attribute list.
	 * The list contents are of type {@link org.lunifera.metamodel.software.ImplementationTechnology}.
	 * The literals are from the enumeration {@link org.lunifera.metamodel.software.ImplementationTechnology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technologys</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technologys</em>' attribute list.
	 * @see org.lunifera.metamodel.software.ImplementationTechnology
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getModule_Technologys()
	 * @model
	 * @generated
	 */
	EList<ImplementationTechnology> getTechnologys();

} // Module
