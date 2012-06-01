/**
 */
package org.lunifera.metamodel.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.common.City#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.common.CommonPackage#getCity()
 * @model
 * @generated
 */
public interface City extends AbstractNamedClass {
	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.common.State#getCities <em>Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see org.lunifera.metamodel.common.CommonPackage#getCity_State()
	 * @see org.lunifera.metamodel.common.State#getCities
	 * @model opposite="cities" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.common.City#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // City
