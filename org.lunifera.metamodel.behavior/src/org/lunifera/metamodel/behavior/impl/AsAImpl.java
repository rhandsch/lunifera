/**
 */
package org.lunifera.metamodel.behavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.lunifera.metamodel.behavior.AsA;
import org.lunifera.metamodel.behavior.BehaviorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.AsAImpl#getBusinessRoles <em>Business Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsAImpl extends EObjectImpl implements AsA {
	/**
	 * The cached value of the '{@link #getBusinessRoles() <em>Business Roles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> businessRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.AS_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBusinessRoles() {
		if (businessRoles == null) {
			businessRoles = new EDataTypeEList<String>(String.class, this, BehaviorPackage.AS_A__BUSINESS_ROLES);
		}
		return businessRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.AS_A__BUSINESS_ROLES:
				return getBusinessRoles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviorPackage.AS_A__BUSINESS_ROLES:
				getBusinessRoles().clear();
				getBusinessRoles().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BehaviorPackage.AS_A__BUSINESS_ROLES:
				getBusinessRoles().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BehaviorPackage.AS_A__BUSINESS_ROLES:
				return businessRoles != null && !businessRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (businessRoles: ");
		result.append(businessRoles);
		result.append(')');
		return result.toString();
	}

} //AsAImpl
