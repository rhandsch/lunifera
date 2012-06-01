/**
 */
package org.lunifera.metamodel.entity;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer;

import org.lunifera.metamodel.software.AbstractSoftwareComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge Container Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.entity.KnowledgeContainerDomain#getElements <em>Elements</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.KnowledgeContainerDomain#getRelatedSoftwares <em>Related Softwares</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.entity.EntityPackage#getKnowledgeContainerDomain()
 * @model
 * @generated
 */
public interface KnowledgeContainerDomain extends AbstractKnowledgeContainer {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.entity.AbstractElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.lunifera.metamodel.entity.EntityPackage#getKnowledgeContainerDomain_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractElement> getElements();

	/**
	 * Returns the value of the '<em><b>Related Softwares</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.software.AbstractSoftwareComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Softwares</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Softwares</em>' reference list.
	 * @see org.lunifera.metamodel.entity.EntityPackage#getKnowledgeContainerDomain_RelatedSoftwares()
	 * @model
	 * @generated
	 */
	EList<AbstractSoftwareComponent> getRelatedSoftwares();

} // KnowledgeContainerDomain
