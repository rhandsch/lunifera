/**
 */
package org.lunifera.model.domain;

import org.eclipse.emf.common.util.EList;

import org.lunifera.model.common.AbsKnowledgeContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge Container Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.model.domain.KnowledgeContainerDomain#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.model.domain.DomainPackage#getKnowledgeContainerDomain()
 * @model
 * @generated
 */
public interface KnowledgeContainerDomain extends AbsKnowledgeContainer {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.model.domain.AbstractElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.lunifera.model.domain.DomainPackage#getKnowledgeContainerDomain_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractElement> getElements();

} // KnowledgeContainerDomain
