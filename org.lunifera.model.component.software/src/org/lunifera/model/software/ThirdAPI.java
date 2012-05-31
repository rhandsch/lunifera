/**
 */
package org.lunifera.model.software;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Third API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.model.software.ThirdAPI#getWebPage <em>Web Page</em>}</li>
 *   <li>{@link org.lunifera.model.software.ThirdAPI#getSupportPage <em>Support Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.model.software.SoftwarePackage#getThirdAPI()
 * @model
 * @generated
 */
public interface ThirdAPI extends API {
	/**
	 * Returns the value of the '<em><b>Web Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Page</em>' attribute.
	 * @see #setWebPage(String)
	 * @see org.lunifera.model.software.SoftwarePackage#getThirdAPI_WebPage()
	 * @model
	 * @generated
	 */
	String getWebPage();

	/**
	 * Sets the value of the '{@link org.lunifera.model.software.ThirdAPI#getWebPage <em>Web Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Page</em>' attribute.
	 * @see #getWebPage()
	 * @generated
	 */
	void setWebPage(String value);

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
	 * @see org.lunifera.model.software.SoftwarePackage#getThirdAPI_SupportPage()
	 * @model
	 * @generated
	 */
	String getSupportPage();

	/**
	 * Sets the value of the '{@link org.lunifera.model.software.ThirdAPI#getSupportPage <em>Support Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Page</em>' attribute.
	 * @see #getSupportPage()
	 * @generated
	 */
	void setSupportPage(String value);

} // ThirdAPI
