/**
 */
package org.lunifera.metamodel.rule;

import org.lunifera.metamodel.common.AbstractNamedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.rule.RuleServerSettings#getGuvnorURI <em>Guvnor URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.rule.RulePackage#getRuleServerSettings()
 * @model
 * @generated
 */
public interface RuleServerSettings extends AbstractNamedClass {
	/**
	 * Returns the value of the '<em><b>Guvnor URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guvnor URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guvnor URI</em>' attribute.
	 * @see #setGuvnorURI(String)
	 * @see org.lunifera.metamodel.rule.RulePackage#getRuleServerSettings_GuvnorURI()
	 * @model
	 * @generated
	 */
	String getGuvnorURI();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.rule.RuleServerSettings#getGuvnorURI <em>Guvnor URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guvnor URI</em>' attribute.
	 * @see #getGuvnorURI()
	 * @generated
	 */
	void setGuvnorURI(String value);

} // RuleServerSettings
