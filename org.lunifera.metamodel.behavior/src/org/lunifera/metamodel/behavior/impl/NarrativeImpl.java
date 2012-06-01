/**
 */
package org.lunifera.metamodel.behavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.lunifera.metamodel.behavior.AsA;
import org.lunifera.metamodel.behavior.BehaviorPackage;
import org.lunifera.metamodel.behavior.IWantTo;
import org.lunifera.metamodel.behavior.InOrderTo;
import org.lunifera.metamodel.behavior.Narrative;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Narrative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.NarrativeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.NarrativeImpl#getAsA <em>As A</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.NarrativeImpl#getIWantTo <em>IWant To</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.NarrativeImpl#getInOrderTo <em>In Order To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NarrativeImpl extends EObjectImpl implements Narrative {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Long ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Long id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAsA() <em>As A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsA()
	 * @generated
	 * @ordered
	 */
	protected AsA asA;

	/**
	 * The cached value of the '{@link #getIWantTo() <em>IWant To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIWantTo()
	 * @generated
	 * @ordered
	 */
	protected IWantTo iWantTo;

	/**
	 * The cached value of the '{@link #getInOrderTo() <em>In Order To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInOrderTo()
	 * @generated
	 * @ordered
	 */
	protected InOrderTo inOrderTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NarrativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.NARRATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Long newId) {
		Long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.NARRATIVE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsA getAsA() {
		return asA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsA(AsA newAsA, NotificationChain msgs) {
		AsA oldAsA = asA;
		asA = newAsA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.NARRATIVE__AS_A, oldAsA, newAsA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsA(AsA newAsA) {
		if (newAsA != asA) {
			NotificationChain msgs = null;
			if (asA != null)
				msgs = ((InternalEObject)asA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.NARRATIVE__AS_A, null, msgs);
			if (newAsA != null)
				msgs = ((InternalEObject)newAsA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.NARRATIVE__AS_A, null, msgs);
			msgs = basicSetAsA(newAsA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.NARRATIVE__AS_A, newAsA, newAsA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IWantTo getIWantTo() {
		return iWantTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIWantTo(IWantTo newIWantTo, NotificationChain msgs) {
		IWantTo oldIWantTo = iWantTo;
		iWantTo = newIWantTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.NARRATIVE__IWANT_TO, oldIWantTo, newIWantTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIWantTo(IWantTo newIWantTo) {
		if (newIWantTo != iWantTo) {
			NotificationChain msgs = null;
			if (iWantTo != null)
				msgs = ((InternalEObject)iWantTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.NARRATIVE__IWANT_TO, null, msgs);
			if (newIWantTo != null)
				msgs = ((InternalEObject)newIWantTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.NARRATIVE__IWANT_TO, null, msgs);
			msgs = basicSetIWantTo(newIWantTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.NARRATIVE__IWANT_TO, newIWantTo, newIWantTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InOrderTo getInOrderTo() {
		return inOrderTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInOrderTo(InOrderTo newInOrderTo, NotificationChain msgs) {
		InOrderTo oldInOrderTo = inOrderTo;
		inOrderTo = newInOrderTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.NARRATIVE__IN_ORDER_TO, oldInOrderTo, newInOrderTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInOrderTo(InOrderTo newInOrderTo) {
		if (newInOrderTo != inOrderTo) {
			NotificationChain msgs = null;
			if (inOrderTo != null)
				msgs = ((InternalEObject)inOrderTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.NARRATIVE__IN_ORDER_TO, null, msgs);
			if (newInOrderTo != null)
				msgs = ((InternalEObject)newInOrderTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.NARRATIVE__IN_ORDER_TO, null, msgs);
			msgs = basicSetInOrderTo(newInOrderTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.NARRATIVE__IN_ORDER_TO, newInOrderTo, newInOrderTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.NARRATIVE__AS_A:
				return basicSetAsA(null, msgs);
			case BehaviorPackage.NARRATIVE__IWANT_TO:
				return basicSetIWantTo(null, msgs);
			case BehaviorPackage.NARRATIVE__IN_ORDER_TO:
				return basicSetInOrderTo(null, msgs);
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
			case BehaviorPackage.NARRATIVE__ID:
				return getId();
			case BehaviorPackage.NARRATIVE__AS_A:
				return getAsA();
			case BehaviorPackage.NARRATIVE__IWANT_TO:
				return getIWantTo();
			case BehaviorPackage.NARRATIVE__IN_ORDER_TO:
				return getInOrderTo();
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
			case BehaviorPackage.NARRATIVE__ID:
				setId((Long)newValue);
				return;
			case BehaviorPackage.NARRATIVE__AS_A:
				setAsA((AsA)newValue);
				return;
			case BehaviorPackage.NARRATIVE__IWANT_TO:
				setIWantTo((IWantTo)newValue);
				return;
			case BehaviorPackage.NARRATIVE__IN_ORDER_TO:
				setInOrderTo((InOrderTo)newValue);
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
			case BehaviorPackage.NARRATIVE__ID:
				setId(ID_EDEFAULT);
				return;
			case BehaviorPackage.NARRATIVE__AS_A:
				setAsA((AsA)null);
				return;
			case BehaviorPackage.NARRATIVE__IWANT_TO:
				setIWantTo((IWantTo)null);
				return;
			case BehaviorPackage.NARRATIVE__IN_ORDER_TO:
				setInOrderTo((InOrderTo)null);
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
			case BehaviorPackage.NARRATIVE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BehaviorPackage.NARRATIVE__AS_A:
				return asA != null;
			case BehaviorPackage.NARRATIVE__IWANT_TO:
				return iWantTo != null;
			case BehaviorPackage.NARRATIVE__IN_ORDER_TO:
				return inOrderTo != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //NarrativeImpl
