/**
 */
package org.lunifera.metamodel.common.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.common.CommonPackage;
import org.lunifera.metamodel.common.Country;
import org.lunifera.metamodel.common.Phone;
import org.lunifera.metamodel.common.PhoneCompany;
import org.lunifera.metamodel.common.PhoneType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.common.impl.PhoneImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.common.impl.PhoneImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.lunifera.metamodel.common.impl.PhoneImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link org.lunifera.metamodel.common.impl.PhoneImpl#getRegionCode <em>Region Code</em>}</li>
 *   <li>{@link org.lunifera.metamodel.common.impl.PhoneImpl#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhoneImpl extends AbstractIdentifiedClassImpl implements Phone {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PhoneType TYPE_EDEFAULT = PhoneType.HOME;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PhoneType type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getCompany() <em>Company</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected PhoneCompany company;

	/**
	 * The default value of the '{@link #getRegionCode() <em>Region Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionCode()
	 * @generated
	 * @ordered
	 */
	protected static final int REGION_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegionCode() <em>Region Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionCode()
	 * @generated
	 * @ordered
	 */
	protected int regionCode = REGION_CODE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.PHONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhoneType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PhoneType newType) {
		PhoneType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.PHONE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.PHONE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhoneCompany getCompany() {
		if (company != null && company.eIsProxy()) {
			InternalEObject oldCompany = (InternalEObject)company;
			company = (PhoneCompany)eResolveProxy(oldCompany);
			if (company != oldCompany) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.PHONE__COMPANY, oldCompany, company));
			}
		}
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhoneCompany basicGetCompany() {
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompany(PhoneCompany newCompany) {
		PhoneCompany oldCompany = company;
		company = newCompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.PHONE__COMPANY, oldCompany, company));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegionCode() {
		return regionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionCode(int newRegionCode) {
		int oldRegionCode = regionCode;
		regionCode = newRegionCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.PHONE__REGION_CODE, oldRegionCode, regionCode));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.PHONE__COUNTRY, oldCountry, country));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.PHONE__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.PHONE__TYPE:
				return getType();
			case CommonPackage.PHONE__NUMBER:
				return getNumber();
			case CommonPackage.PHONE__COMPANY:
				if (resolve) return getCompany();
				return basicGetCompany();
			case CommonPackage.PHONE__REGION_CODE:
				return getRegionCode();
			case CommonPackage.PHONE__COUNTRY:
				if (resolve) return getCountry();
				return basicGetCountry();
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
			case CommonPackage.PHONE__TYPE:
				setType((PhoneType)newValue);
				return;
			case CommonPackage.PHONE__NUMBER:
				setNumber((String)newValue);
				return;
			case CommonPackage.PHONE__COMPANY:
				setCompany((PhoneCompany)newValue);
				return;
			case CommonPackage.PHONE__REGION_CODE:
				setRegionCode((Integer)newValue);
				return;
			case CommonPackage.PHONE__COUNTRY:
				setCountry((Country)newValue);
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
			case CommonPackage.PHONE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CommonPackage.PHONE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case CommonPackage.PHONE__COMPANY:
				setCompany((PhoneCompany)null);
				return;
			case CommonPackage.PHONE__REGION_CODE:
				setRegionCode(REGION_CODE_EDEFAULT);
				return;
			case CommonPackage.PHONE__COUNTRY:
				setCountry((Country)null);
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
			case CommonPackage.PHONE__TYPE:
				return type != TYPE_EDEFAULT;
			case CommonPackage.PHONE__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case CommonPackage.PHONE__COMPANY:
				return company != null;
			case CommonPackage.PHONE__REGION_CODE:
				return regionCode != REGION_CODE_EDEFAULT;
			case CommonPackage.PHONE__COUNTRY:
				return country != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", number: ");
		result.append(number);
		result.append(", regionCode: ");
		result.append(regionCode);
		result.append(')');
		return result.toString();
	}

} //PhoneImpl
