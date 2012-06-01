/**
 */
package org.lunifera.metamodel.entity.impl;

import org.eclipse.emf.ecore.EClass;

import org.lunifera.metamodel.common.impl.AbstractIdentifiedClassImpl;

import org.lunifera.metamodel.entity.AbstractElement;
import org.lunifera.metamodel.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractElementImpl extends AbstractIdentifiedClassImpl implements AbstractElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.ABSTRACT_ELEMENT;
	}

} //AbstractElementImpl
