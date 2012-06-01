/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.ExampleTableCell#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.ExampleTableCell#getValue <em>Value</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.ExampleTableCell#getRow <em>Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getExampleTableCell()
 * @model
 * @generated
 */
public interface ExampleTableCell extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getExampleTableCell_ColumnName()
	 * @model id="true"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.ExampleTableCell#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getExampleTableCell_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.ExampleTableCell#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.behavior.ExamplesTableRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' container reference.
	 * @see #setRow(ExamplesTableRow)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getExampleTableCell_Row()
	 * @see org.lunifera.metamodel.behavior.ExamplesTableRow#getCells
	 * @model opposite="cells" transient="false"
	 * @generated
	 */
	ExamplesTableRow getRow();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.ExampleTableCell#getRow <em>Row</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' container reference.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(ExamplesTableRow value);

} // ExampleTableCell
