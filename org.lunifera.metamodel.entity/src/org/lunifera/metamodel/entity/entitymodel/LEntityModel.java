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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEntity Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.LEntityModel#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.LEntityModel#getGenSettings <em>Gen Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLEntityModel()
 * @model
 * @generated
 */
public interface LEntityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.entity.entitymodel.LPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLEntityModel_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<LPackage> getPackages();

	/**
	 * Returns the value of the '<em><b>Gen Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Settings</em>' containment reference.
	 * @see #setGenSettings(LGenSettings)
	 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLEntityModel_GenSettings()
	 * @model containment="true"
	 * @generated
	 */
	LGenSettings getGenSettings();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.entity.entitymodel.LEntityModel#getGenSettings <em>Gen Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Settings</em>' containment reference.
	 * @see #getGenSettings()
	 * @generated
	 */
	void setGenSettings(LGenSettings value);

} // LEntityModel
