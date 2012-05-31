/**
 */
package org.lunifera.model.software;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.model.software.Bundle#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.model.software.SoftwarePackage#getBundle()
 * @model
 * @generated
 */
public interface Bundle extends AbstractSoftwareComponent {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.model.software.BundleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.lunifera.model.software.BundleType
	 * @see #setType(BundleType)
	 * @see org.lunifera.model.software.SoftwarePackage#getBundle_Type()
	 * @model required="true"
	 * @generated
	 */
	BundleType getType();

	/**
	 * Sets the value of the '{@link org.lunifera.model.software.Bundle#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.lunifera.model.software.BundleType
	 * @see #getType()
	 * @generated
	 */
	void setType(BundleType value);

} // Bundle
