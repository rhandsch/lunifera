/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Sources generated by Xtext  
 * 
 * Contributors:
 *  		Hans Georg Glöckler - Initial implementation
 *  		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.entity.entitymodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LImport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.LImport#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLImport()
 * @model
 * @generated
 */
public interface LImport extends EObject {
	/**
	 * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Namespace</em>' attribute.
	 * @see #setImportedNamespace(String)
	 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLImport_ImportedNamespace()
	 * @model
	 * @generated
	 */
	String getImportedNamespace();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.entity.entitymodel.LImport#getImportedNamespace <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Namespace</em>' attribute.
	 * @see #getImportedNamespace()
	 * @generated
	 */
	void setImportedNamespace(String value);

} // LImport
