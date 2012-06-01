/**
 */
package org.lunifera.metamodel.organization.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.common.impl.AbstractDescribedClassImpl;

import org.lunifera.metamodel.organization.BusinessRole;
import org.lunifera.metamodel.organization.Organization;
import org.lunifera.metamodel.organization.OrganizationPackage;
import org.lunifera.metamodel.organization.Person;
import org.lunifera.metamodel.organization.SecurityRealm;
import org.lunifera.metamodel.organization.Unit;
import org.lunifera.metamodel.organization.UnitType;
import org.lunifera.metamodel.organization.Worker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.organization.impl.OrganizationImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.OrganizationImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.OrganizationImpl#getWorkers <em>Workers</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.OrganizationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.OrganizationImpl#getPartners <em>Partners</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.OrganizationImpl#getMainContact <em>Main Contact</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.OrganizationImpl#getUnitTypes <em>Unit Types</em>}</li>
 *   <li>{@link org.lunifera.metamodel.organization.impl.OrganizationImpl#getSecurityRealms <em>Security Realms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationImpl extends AbstractDescribedClassImpl implements Organization {
	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> units;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The cached value of the '{@link #getWorkers() <em>Workers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkers()
	 * @generated
	 * @ordered
	 */
	protected EList<Worker> workers;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessRole> roles;

	/**
	 * The cached value of the '{@link #getPartners() <em>Partners</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartners()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> partners;

	/**
	 * The cached value of the '{@link #getMainContact() <em>Main Contact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainContact()
	 * @generated
	 * @ordered
	 */
	protected Person mainContact;

	/**
	 * The cached value of the '{@link #getUnitTypes() <em>Unit Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitType> unitTypes;

	/**
	 * The cached value of the '{@link #getSecurityRealms() <em>Security Realms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRealms()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRealm> securityRealms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationPackage.Literals.ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getUnits() {
		if (units == null) {
			units = new EObjectContainmentWithInverseEList<Unit>(Unit.class, this, OrganizationPackage.ORGANIZATION__UNITS, OrganizationPackage.UNIT__ORGANIZATION);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentWithInverseEList<Person>(Person.class, this, OrganizationPackage.ORGANIZATION__PERSONS, OrganizationPackage.PERSON__ORGANIZATION);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Worker> getWorkers() {
		if (workers == null) {
			workers = new EObjectContainmentWithInverseEList<Worker>(Worker.class, this, OrganizationPackage.ORGANIZATION__WORKERS, OrganizationPackage.WORKER__ORGANIZATION);
		}
		return workers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessRole> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentWithInverseEList<BusinessRole>(BusinessRole.class, this, OrganizationPackage.ORGANIZATION__ROLES, OrganizationPackage.BUSINESS_ROLE__ORGANIZATION);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organization> getPartners() {
		if (partners == null) {
			partners = new EObjectResolvingEList<Organization>(Organization.class, this, OrganizationPackage.ORGANIZATION__PARTNERS);
		}
		return partners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getMainContact() {
		if (mainContact != null && mainContact.eIsProxy()) {
			InternalEObject oldMainContact = (InternalEObject)mainContact;
			mainContact = (Person)eResolveProxy(oldMainContact);
			if (mainContact != oldMainContact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationPackage.ORGANIZATION__MAIN_CONTACT, oldMainContact, mainContact));
			}
		}
		return mainContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetMainContact() {
		return mainContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainContact(Person newMainContact) {
		Person oldMainContact = mainContact;
		mainContact = newMainContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.ORGANIZATION__MAIN_CONTACT, oldMainContact, mainContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitType> getUnitTypes() {
		if (unitTypes == null) {
			unitTypes = new EObjectContainmentEList<UnitType>(UnitType.class, this, OrganizationPackage.ORGANIZATION__UNIT_TYPES);
		}
		return unitTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRealm> getSecurityRealms() {
		if (securityRealms == null) {
			securityRealms = new EObjectContainmentEList<SecurityRealm>(SecurityRealm.class, this, OrganizationPackage.ORGANIZATION__SECURITY_REALMS);
		}
		return securityRealms;
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
			case OrganizationPackage.ORGANIZATION__UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnits()).basicAdd(otherEnd, msgs);
			case OrganizationPackage.ORGANIZATION__PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPersons()).basicAdd(otherEnd, msgs);
			case OrganizationPackage.ORGANIZATION__WORKERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkers()).basicAdd(otherEnd, msgs);
			case OrganizationPackage.ORGANIZATION__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
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
			case OrganizationPackage.ORGANIZATION__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
			case OrganizationPackage.ORGANIZATION__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
			case OrganizationPackage.ORGANIZATION__WORKERS:
				return ((InternalEList<?>)getWorkers()).basicRemove(otherEnd, msgs);
			case OrganizationPackage.ORGANIZATION__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case OrganizationPackage.ORGANIZATION__UNIT_TYPES:
				return ((InternalEList<?>)getUnitTypes()).basicRemove(otherEnd, msgs);
			case OrganizationPackage.ORGANIZATION__SECURITY_REALMS:
				return ((InternalEList<?>)getSecurityRealms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrganizationPackage.ORGANIZATION__UNITS:
				return getUnits();
			case OrganizationPackage.ORGANIZATION__PERSONS:
				return getPersons();
			case OrganizationPackage.ORGANIZATION__WORKERS:
				return getWorkers();
			case OrganizationPackage.ORGANIZATION__ROLES:
				return getRoles();
			case OrganizationPackage.ORGANIZATION__PARTNERS:
				return getPartners();
			case OrganizationPackage.ORGANIZATION__MAIN_CONTACT:
				if (resolve) return getMainContact();
				return basicGetMainContact();
			case OrganizationPackage.ORGANIZATION__UNIT_TYPES:
				return getUnitTypes();
			case OrganizationPackage.ORGANIZATION__SECURITY_REALMS:
				return getSecurityRealms();
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
			case OrganizationPackage.ORGANIZATION__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends Unit>)newValue);
				return;
			case OrganizationPackage.ORGANIZATION__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case OrganizationPackage.ORGANIZATION__WORKERS:
				getWorkers().clear();
				getWorkers().addAll((Collection<? extends Worker>)newValue);
				return;
			case OrganizationPackage.ORGANIZATION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends BusinessRole>)newValue);
				return;
			case OrganizationPackage.ORGANIZATION__PARTNERS:
				getPartners().clear();
				getPartners().addAll((Collection<? extends Organization>)newValue);
				return;
			case OrganizationPackage.ORGANIZATION__MAIN_CONTACT:
				setMainContact((Person)newValue);
				return;
			case OrganizationPackage.ORGANIZATION__UNIT_TYPES:
				getUnitTypes().clear();
				getUnitTypes().addAll((Collection<? extends UnitType>)newValue);
				return;
			case OrganizationPackage.ORGANIZATION__SECURITY_REALMS:
				getSecurityRealms().clear();
				getSecurityRealms().addAll((Collection<? extends SecurityRealm>)newValue);
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
			case OrganizationPackage.ORGANIZATION__UNITS:
				getUnits().clear();
				return;
			case OrganizationPackage.ORGANIZATION__PERSONS:
				getPersons().clear();
				return;
			case OrganizationPackage.ORGANIZATION__WORKERS:
				getWorkers().clear();
				return;
			case OrganizationPackage.ORGANIZATION__ROLES:
				getRoles().clear();
				return;
			case OrganizationPackage.ORGANIZATION__PARTNERS:
				getPartners().clear();
				return;
			case OrganizationPackage.ORGANIZATION__MAIN_CONTACT:
				setMainContact((Person)null);
				return;
			case OrganizationPackage.ORGANIZATION__UNIT_TYPES:
				getUnitTypes().clear();
				return;
			case OrganizationPackage.ORGANIZATION__SECURITY_REALMS:
				getSecurityRealms().clear();
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
			case OrganizationPackage.ORGANIZATION__UNITS:
				return units != null && !units.isEmpty();
			case OrganizationPackage.ORGANIZATION__PERSONS:
				return persons != null && !persons.isEmpty();
			case OrganizationPackage.ORGANIZATION__WORKERS:
				return workers != null && !workers.isEmpty();
			case OrganizationPackage.ORGANIZATION__ROLES:
				return roles != null && !roles.isEmpty();
			case OrganizationPackage.ORGANIZATION__PARTNERS:
				return partners != null && !partners.isEmpty();
			case OrganizationPackage.ORGANIZATION__MAIN_CONTACT:
				return mainContact != null;
			case OrganizationPackage.ORGANIZATION__UNIT_TYPES:
				return unitTypes != null && !unitTypes.isEmpty();
			case OrganizationPackage.ORGANIZATION__SECURITY_REALMS:
				return securityRealms != null && !securityRealms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationImpl
