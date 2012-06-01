/**
 */
package org.lunifera.metamodel.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.common.Import#getImportText <em>Import Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.common.CommonPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends AbstractIdentifiedClass {
	/**
	 * Returns the value of the '<em><b>Import Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Text</em>' attribute.
	 * @see #setImportText(String)
	 * @see org.lunifera.metamodel.common.CommonPackage#getImport_ImportText()
	 * @model required="true"
	 * @generated
	 */
	String getImportText();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.common.Import#getImportText <em>Import Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Text</em>' attribute.
	 * @see #getImportText()
	 * @generated
	 */
	void setImportText(String value);

} // Import
