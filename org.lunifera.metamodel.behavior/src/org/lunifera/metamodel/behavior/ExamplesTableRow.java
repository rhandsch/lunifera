/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Examples Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.ExamplesTableRow#getExampleTable <em>Example Table</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.ExamplesTableRow#getCells <em>Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getExamplesTableRow()
 * @model
 * @generated
 */
public interface ExamplesTableRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Example Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.behavior.ExamplesTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Table</em>' container reference.
	 * @see #setExampleTable(ExamplesTable)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getExamplesTableRow_ExampleTable()
	 * @see org.lunifera.metamodel.behavior.ExamplesTable#getRows
	 * @model opposite="rows" required="true" transient="false"
	 * @generated
	 */
	ExamplesTable getExampleTable();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.ExamplesTableRow#getExampleTable <em>Example Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Table</em>' container reference.
	 * @see #getExampleTable()
	 * @generated
	 */
	void setExampleTable(ExamplesTable value);

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.ExampleTableCell}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.behavior.ExampleTableCell#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getExamplesTableRow_Cells()
	 * @see org.lunifera.metamodel.behavior.ExampleTableCell#getRow
	 * @model opposite="row" containment="true" required="true"
	 * @generated
	 */
	EList<ExampleTableCell> getCells();

} // ExamplesTableRow
