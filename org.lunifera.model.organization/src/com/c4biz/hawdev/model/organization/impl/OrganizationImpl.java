/**
 */
package com.c4biz.hawdev.model.organization.impl;

import com.c4biz.hawdev.model.organization.Organization;
import com.c4biz.hawdev.model.organization.OrganizationPackage;
import com.c4biz.hawdev.model.organization.Person;
import com.c4biz.hawdev.model.organization.Role;
import com.c4biz.hawdev.model.organization.Unit;
import com.c4biz.hawdev.model.organization.UnitType;
import com.c4biz.hawdev.model.organization.Worker;

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

import org.lunifera.model.common.impl.AbsDescribedClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.c4biz.hawdev.model.organization.impl.OrganizationImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.impl.OrganizationImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.impl.OrganizationImpl#getWorkers <em>Workers</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.impl.OrganizationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.impl.OrganizationImpl#getPartners <em>Partners</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.impl.OrganizationImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.impl.OrganizationImpl#getUnitTypes <em>Unit Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationImpl extends AbsDescribedClassImpl implements Organization {
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
	protected EList<Role> roles;

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
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected Person contact;

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
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentWithInverseEList<Role>(Role.class, this, OrganizationPackage.ORGANIZATION__ROLES, OrganizationPackage.ROLE__ORGANIZATION);
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
	public Person getContact() {
		if (contact != null && contact.eIsProxy()) {
			InternalEObject oldContact = (InternalEObject)contact;
			contact = (Person)eResolveProxy(oldContact);
			if (contact != oldContact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationPackage.ORGANIZATION__CONTACT, oldContact, contact));
			}
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetContact() {
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContact(Person newContact) {
		Person oldContact = contact;
		contact = newContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationPackage.ORGANIZATION__CONTACT, oldContact, contact));
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
			case OrganizationPackage.ORGANIZATION__CONTACT:
				if (resolve) return getContact();
				return basicGetContact();
			case OrganizationPackage.ORGANIZATION__UNIT_TYPES:
				return getUnitTypes();
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
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case OrganizationPackage.ORGANIZATION__PARTNERS:
				getPartners().clear();
				getPartners().addAll((Collection<? extends Organization>)newValue);
				return;
			case OrganizationPackage.ORGANIZATION__CONTACT:
				setContact((Person)newValue);
				return;
			case OrganizationPackage.ORGANIZATION__UNIT_TYPES:
				getUnitTypes().clear();
				getUnitTypes().addAll((Collection<? extends UnitType>)newValue);
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
			case OrganizationPackage.ORGANIZATION__CONTACT:
				setContact((Person)null);
				return;
			case OrganizationPackage.ORGANIZATION__UNIT_TYPES:
				getUnitTypes().clear();
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
			case OrganizationPackage.ORGANIZATION__CONTACT:
				return contact != null;
			case OrganizationPackage.ORGANIZATION__UNIT_TYPES:
				return unitTypes != null && !unitTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationImpl
