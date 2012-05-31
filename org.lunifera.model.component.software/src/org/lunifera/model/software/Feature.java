/**
 */
package org.lunifera.model.software;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.model.software.Feature#getBundles <em>Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.model.software.SoftwarePackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends AbstractSoftwareComponent {
	/**
	 * Returns the value of the '<em><b>Bundles</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.model.software.Bundle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundles</em>' reference list.
	 * @see org.lunifera.model.software.SoftwarePackage#getFeature_Bundles()
	 * @model
	 * @generated
	 */
	EList<Bundle> getBundles();

} // Feature
