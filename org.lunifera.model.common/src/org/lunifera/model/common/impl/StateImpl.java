/**
 */
package org.lunifera.model.common.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.model.common.City;
import org.lunifera.model.common.CommonPackage;
import org.lunifera.model.common.Country;
import org.lunifera.model.common.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.model.common.impl.StateImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.lunifera.model.common.impl.StateImpl#getCities <em>Cities</em>}</li>
 *   <li>{@link org.lunifera.model.common.impl.StateImpl#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends AbsNamedClassImpl implements State {
	/**
	 * The cached value of the '{@link #getCities() <em>Cities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCities()
	 * @generated
	 * @ordered
	 */
	protected EList<City> cities;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		if (eContainerFeatureID() != CommonPackage.STATE__COUNTRY) return null;
		return (Country)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(Country newCountry, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCountry, CommonPackage.STATE__COUNTRY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		if (newCountry != eInternalContainer() || (eContainerFeatureID() != CommonPackage.STATE__COUNTRY && newCountry != null)) {
			if (EcoreUtil.isAncestor(this, newCountry))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, CommonPackage.COUNTRY__STATES, Country.class, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STATE__COUNTRY, newCountry, newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<City> getCities() {
		if (cities == null) {
			cities = new EObjectContainmentWithInverseEList<City>(City.class, this, CommonPackage.STATE__CITIES, CommonPackage.CITY__STATE);
		}
		return cities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STATE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.STATE__COUNTRY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCountry((Country)otherEnd, msgs);
			case CommonPackage.STATE__CITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCities()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.STATE__COUNTRY:
				return basicSetCountry(null, msgs);
			case CommonPackage.STATE__CITIES:
				return ((InternalEList<?>)getCities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CommonPackage.STATE__COUNTRY:
				return eInternalContainer().eInverseRemove(this, CommonPackage.COUNTRY__STATES, Country.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.STATE__COUNTRY:
				return getCountry();
			case CommonPackage.STATE__CITIES:
				return getCities();
			case CommonPackage.STATE__CODE:
				return getCode();
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
			case CommonPackage.STATE__COUNTRY:
				setCountry((Country)newValue);
				return;
			case CommonPackage.STATE__CITIES:
				getCities().clear();
				getCities().addAll((Collection<? extends City>)newValue);
				return;
			case CommonPackage.STATE__CODE:
				setCode((String)newValue);
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
			case CommonPackage.STATE__COUNTRY:
				setCountry((Country)null);
				return;
			case CommonPackage.STATE__CITIES:
				getCities().clear();
				return;
			case CommonPackage.STATE__CODE:
				setCode(CODE_EDEFAULT);
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
			case CommonPackage.STATE__COUNTRY:
				return getCountry() != null;
			case CommonPackage.STATE__CITIES:
				return cities != null && !cities.isEmpty();
			case CommonPackage.STATE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
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
		result.append(" (code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //StateImpl
