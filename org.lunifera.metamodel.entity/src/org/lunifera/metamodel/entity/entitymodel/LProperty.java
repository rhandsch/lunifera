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

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LProperty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.LProperty#isId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.LProperty#isVersion <em>Version</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.LProperty#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.LProperty#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.LProperty#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.LProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.LProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.entity.entitymodel.LProperty#getSingularName <em>Singular Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLProperty()
 * @model
 * @generated
 */
public interface LProperty extends LEntityMember {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(boolean)
	 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLProperty_Id()
	 * @model
	 * @generated
	 */
	boolean isId();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.entity.entitymodel.LProperty#isId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isId()
	 * @generated
	 */
	void setId(boolean value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(boolean)
	 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLProperty_Version()
	 * @model
	 * @generated
	 */
	boolean isVersion();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.entity.entitymodel.LProperty#isVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isVersion()
	 * @generated
	 */
	void setVersion(boolean value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLProperty_Transient()
	 * @model
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.entity.entitymodel.LProperty#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

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
	 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLProperty_Multiplicity()
	 * @model containment="true"
	 * @generated
	 */
	LMultiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.entity.entitymodel.LProperty#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(LMultiplicity value);

	/**
	 * Returns the value of the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Literal</em>' attribute.
	 * @see #setDefaultValueLiteral(String)
	 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLProperty_DefaultValueLiteral()
	 * @model
	 * @generated
	 */
	String getDefaultValueLiteral();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.entity.entitymodel.LProperty#getDefaultValueLiteral <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Literal</em>' attribute.
	 * @see #getDefaultValueLiteral()
	 * @generated
	 */
	void setDefaultValueLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.entity.entitymodel.LProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(JvmTypeReference)
	 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLProperty_Type()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getType();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.entity.entitymodel.LProperty#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Singular Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singular Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singular Name</em>' attribute.
	 * @see #setSingularName(String)
	 * @see org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage#getLProperty_SingularName()
	 * @model
	 * @generated
	 */
	String getSingularName();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.entity.entitymodel.LProperty#getSingularName <em>Singular Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singular Name</em>' attribute.
	 * @see #getSingularName()
	 * @generated
	 */
	void setSingularName(String value);

} // LProperty