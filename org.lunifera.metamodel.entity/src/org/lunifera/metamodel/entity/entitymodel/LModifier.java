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
 * A representation of the model object '<em><b>LModifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.LModifier#isFinal <em>Final</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.LModifier#isStatic <em>Static</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.LModifier#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLModifier()
 * @model
 * @generated
 */
public interface LModifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLModifier_Final()
	 * @model
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.entity.entitymodel.LModifier#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLModifier_Static()
	 * @model
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.entity.entitymodel.LModifier#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.metamodel.entity.entitymodel.LVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.lunifera.metamodel.entity.entitymodel.LVisibility
	 * @see #setVisibility(LVisibility)
	 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLModifier_Visibility()
	 * @model
	 * @generated
	 */
	LVisibility getVisibility();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.entity.entitymodel.LModifier#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.lunifera.metamodel.entity.entitymodel.LVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(LVisibility value);

} // LModifier
