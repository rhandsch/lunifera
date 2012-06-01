/**
 */
package org.lunifera.metamodel.rule;

import org.lunifera.metamodel.common.AbstractNamedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.rule.BusinessRule#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link org.lunifera.metamodel.rule.BusinessRule#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.lunifera.metamodel.rule.BusinessRule#getBody <em>Body</em>}</li>
 *   <li>{@link org.lunifera.metamodel.rule.BusinessRule#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.lunifera.metamodel.rule.BusinessRule#getServerURI <em>Server URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.rule.RulePackage#getBusinessRule()
 * @model
 * @generated
 */
public interface BusinessRule extends AbstractNamedClass {
	/**
	 * Returns the value of the '<em><b>Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Id</em>' attribute.
	 * @see #setRuleId(String)
	 * @see org.lunifera.metamodel.rule.RulePackage#getBusinessRule_RuleId()
	 * @model unique="false"
	 * @generated
	 */
	String getRuleId();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.rule.BusinessRule#getRuleId <em>Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Id</em>' attribute.
	 * @see #getRuleId()
	 * @generated
	 */
	void setRuleId(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.lunifera.metamodel.rule.RulePackage#getBusinessRule_Summary()
	 * @model unique="false"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.rule.BusinessRule#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.lunifera.metamodel.rule.RulePackage#getBusinessRule_Body()
	 * @model unique="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.rule.BusinessRule#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.metamodel.rule.RuleLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see org.lunifera.metamodel.rule.RuleLanguage
	 * @see #setLanguage(RuleLanguage)
	 * @see org.lunifera.metamodel.rule.RulePackage#getBusinessRule_Language()
	 * @model unique="false"
	 * @generated
	 */
	RuleLanguage getLanguage();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.rule.BusinessRule#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see org.lunifera.metamodel.rule.RuleLanguage
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(RuleLanguage value);

	/**
	 * Returns the value of the '<em><b>Server URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server URI</em>' attribute.
	 * @see #setServerURI(String)
	 * @see org.lunifera.metamodel.rule.RulePackage#getBusinessRule_ServerURI()
	 * @model
	 * @generated
	 */
	String getServerURI();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.rule.BusinessRule#getServerURI <em>Server URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server URI</em>' attribute.
	 * @see #getServerURI()
	 * @generated
	 */
	void setServerURI(String value);

} // BusinessRule
