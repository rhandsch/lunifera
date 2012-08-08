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
package org.lunifera.metamodel.dsl.entity.entitymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LRefers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LRefers#isNotnull <em>Notnull</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.LRefers#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLRefers()
 * @model
 * @generated
 */
public interface LRefers extends LReference {
	/**
	 * Returns the value of the '<em><b>Notnull</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notnull</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notnull</em>' attribute.
	 * @see #setNotnull(boolean)
	 * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLRefers_Notnull()
	 * @model
	 * @generated
	 */
	boolean isNotnull();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LRefers#isNotnull <em>Notnull</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notnull</em>' attribute.
	 * @see #isNotnull()
	 * @generated
	 */
	void setNotnull(boolean value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(LMultiplicity)
	 * @see org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage#getLRefers_Multiplicity()
	 * @model containment="true"
	 * @generated
	 */
	LMultiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.dsl.entity.entitymodel.LRefers#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(LMultiplicity value);

} // LRefers
