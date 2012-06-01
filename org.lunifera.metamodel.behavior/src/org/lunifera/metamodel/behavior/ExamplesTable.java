/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Examples Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.ExamplesTable#getHeader <em>Header</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.ExamplesTable#getRows <em>Rows</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.ExamplesTable#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getExamplesTable()
 * @model
 * @generated
 */
public interface ExamplesTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(ExamplesTableHeader)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getExamplesTable_Header()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExamplesTableHeader getHeader();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.ExamplesTable#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(ExamplesTableHeader value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.ExamplesTableRow}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.metamodel.behavior.ExamplesTableRow#getExampleTable <em>Example Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getExamplesTable_Rows()
	 * @see org.lunifera.metamodel.behavior.ExamplesTableRow#getExampleTable
	 * @model opposite="exampleTable" containment="true" required="true"
	 * @generated
	 */
	EList<ExamplesTableRow> getRows();

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
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getExamplesTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.ExamplesTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ExamplesTable
