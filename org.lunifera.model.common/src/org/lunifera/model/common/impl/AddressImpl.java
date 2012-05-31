/**
 */
package org.lunifera.model.common.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.model.common.Address;
import org.lunifera.model.common.AddressType;
import org.lunifera.model.common.City;
import org.lunifera.model.common.CommonPackage;
import org.lunifera.model.common.Country;
import org.lunifera.model.common.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.model.common.impl.AddressImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link org.lunifera.model.common.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.lunifera.model.common.impl.AddressImpl#getState <em>State</em>}</li>
 *   <li>{@link org.lunifera.model.common.impl.AddressImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.lunifera.model.common.impl.AddressImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.lunifera.model.common.impl.AddressImpl#getComplements <em>Complements</em>}</li>
 *   <li>{@link org.lunifera.model.common.impl.AddressImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressImpl extends AbsNamedClassImpl implements Address {
	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected City city;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Country country;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getComplements() <em>Complements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplements()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplements() <em>Complements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplements()
	 * @generated
	 * @ordered
	 */
	protected String complements = COMPLEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AddressType TYPE_EDEFAULT = AddressType.HOME;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AddressType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ADDRESS__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City getCity() {
		if (city != null && city.eIsProxy()) {
			InternalEObject oldCity = (InternalEObject)city;
			city = (City)eResolveProxy(oldCity);
			if (city != oldCity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.ADDRESS__CITY, oldCity, city));
			}
		}
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City basicGetCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(City newCity) {
		City oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ADDRESS__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = (State)eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.ADDRESS__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		State oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ADDRESS__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject)country;
			country = (Country)eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.ADDRESS__COUNTRY, oldCountry, country));
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		Country oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ADDRESS__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ADDRESS__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplements() {
		return complements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplements(String newComplements) {
		String oldComplements = complements;
		complements = newComplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ADDRESS__COMPLEMENTS, oldComplements, complements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AddressType newType) {
		AddressType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ADDRESS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.ADDRESS__STREET:
				return getStreet();
			case CommonPackage.ADDRESS__CITY:
				if (resolve) return getCity();
				return basicGetCity();
			case CommonPackage.ADDRESS__STATE:
				if (resolve) return getState();
				return basicGetState();
			case CommonPackage.ADDRESS__COUNTRY:
				if (resolve) return getCountry();
				return basicGetCountry();
			case CommonPackage.ADDRESS__NUMBER:
				return getNumber();
			case CommonPackage.ADDRESS__COMPLEMENTS:
				return getComplements();
			case CommonPackage.ADDRESS__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.ADDRESS__STREET:
				setStreet((String)newValue);
				return;
			case CommonPackage.ADDRESS__CITY:
				setCity((City)newValue);
				return;
			case CommonPackage.ADDRESS__STATE:
				setState((State)newValue);
				return;
			case CommonPackage.ADDRESS__COUNTRY:
				setCountry((Country)newValue);
				return;
			case CommonPackage.ADDRESS__NUMBER:
				setNumber((String)newValue);
				return;
			case CommonPackage.ADDRESS__COMPLEMENTS:
				setComplements((String)newValue);
				return;
			case CommonPackage.ADDRESS__TYPE:
				setType((AddressType)newValue);
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
			case CommonPackage.ADDRESS__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case CommonPackage.ADDRESS__CITY:
				setCity((City)null);
				return;
			case CommonPackage.ADDRESS__STATE:
				setState((State)null);
				return;
			case CommonPackage.ADDRESS__COUNTRY:
				setCountry((Country)null);
				return;
			case CommonPackage.ADDRESS__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case CommonPackage.ADDRESS__COMPLEMENTS:
				setComplements(COMPLEMENTS_EDEFAULT);
				return;
			case CommonPackage.ADDRESS__TYPE:
				setType(TYPE_EDEFAULT);
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
			case CommonPackage.ADDRESS__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case CommonPackage.ADDRESS__CITY:
				return city != null;
			case CommonPackage.ADDRESS__STATE:
				return state != null;
			case CommonPackage.ADDRESS__COUNTRY:
				return country != null;
			case CommonPackage.ADDRESS__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case CommonPackage.ADDRESS__COMPLEMENTS:
				return COMPLEMENTS_EDEFAULT == null ? complements != null : !COMPLEMENTS_EDEFAULT.equals(complements);
			case CommonPackage.ADDRESS__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (street: ");
		result.append(street);
		result.append(", number: ");
		result.append(number);
		result.append(", complements: ");
		result.append(complements);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AddressImpl
