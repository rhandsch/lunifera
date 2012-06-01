/**
 */
package org.lunifera.metamodel.software;

import org.eclipse.emf.common.util.EList;

import org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge Container Software</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.software.KnowledgeContainerSoftware#getSoftwareComponents <em>Software Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.software.SoftwarePackage#getKnowledgeContainerSoftware()
 * @model
 * @generated
 */
public interface KnowledgeContainerSoftware extends AbstractKnowledgeContainer {
	/**
	 * Returns the value of the '<em><b>Software Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.software.AbstractSoftwareComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Components</em>' containment reference list.
	 * @see org.lunifera.metamodel.software.SoftwarePackage#getKnowledgeContainerSoftware_SoftwareComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractSoftwareComponent> getSoftwareComponents();

} // KnowledgeContainerSoftware