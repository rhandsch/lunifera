/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Examples Table Column Separator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.ExamplesTableColumnSeparator#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getExamplesTableColumnSeparator()
 * @model
 * @generated
 */
public interface ExamplesTableColumnSeparator extends EObject {
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
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getExamplesTableColumnSeparator_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.ExamplesTableColumnSeparator#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ExamplesTableColumnSeparator
