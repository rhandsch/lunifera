/**
 */
package org.lunifera.metamodel.software;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Third System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.software.ThirdSystem#getWebpage <em>Webpage</em>}</li>
 *   <li>{@link org.lunifera.metamodel.software.ThirdSystem#getSupportPage <em>Support Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.software.SoftwarePackage#getThirdSystem()
 * @model
 * @generated
 */
public interface ThirdSystem extends org.lunifera.metamodel.software.System {
	/**
	 * Returns the value of the '<em><b>Webpage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webpage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webpage</em>' attribute.
	 * @see #setWebpage(String)
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getThirdSystem_Webpage()
	 * @model
	 * @generated
	 */
	String getWebpage();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.software.ThirdSystem#getWebpage <em>Webpage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webpage</em>' attribute.
	 * @see #getWebpage()
	 * @generated
	 */
	void setWebpage(String value);

	/**
	 * Returns the value of the '<em><b>Support Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Page</em>' attribute.
	 * @see #setSupportPage(String)
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getThirdSystem_SupportPage()
	 * @model
	 * @generated
	 */
	String getSupportPage();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.software.ThirdSystem#getSupportPage <em>Support Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Page</em>' attribute.
	 * @see #getSupportPage()
	 * @generated
	 */
	void setSupportPage(String value);

} // ThirdSystem
