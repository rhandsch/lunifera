/**
 */
package org.lunifera.metamodel.dsl.entity.entitymodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage;
import org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model oject '<em><b>LProperty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl#isId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl#isVersion <em>Version</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.entity.entitymodel.impl.LPropertyImpl#getSingularName <em>Singular Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LPropertyImpl extends LEntityMemberImpl implements LProperty {
	/**
	 * The default value of the '{@link #isId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isId()
	 * @generated
	 * @ordered
	 */
	protected boolean id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersion()
	 * @generated
	 * @ordered
	 */
	protected boolean version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected LMultiplicity multiplicity;

	/**
	 * The default value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueLiteral = DEFAULT_VALUE_LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference type;

	/**
	 * The default value of the '{@link #getSingularName() <em>Singular Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingularName()
	 * @generated
	 * @ordered
	 */
	protected static final String SINGULAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSingularName() <em>Singular Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingularName()
	 * @generated
	 * @ordered
	 */
	protected String singularName = SINGULAR_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitymodelPackage.Literals.LPROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(boolean newId) {
		boolean oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(boolean newVersion) {
		boolean oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(JvmTypeReference newType, NotificationChain msgs) {
		JvmTypeReference oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(JvmTypeReference newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LPROPERTY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LPROPERTY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSingularName() {
		return singularName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingularName(String newSingularName) {
		String oldSingularName = singularName;
		singularName = newSingularName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__SINGULAR_NAME, oldSingularName, singularName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LMultiplicity getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiplicity(LMultiplicity newMultiplicity, NotificationChain msgs) {
		LMultiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__MULTIPLICITY, oldMultiplicity, newMultiplicity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(LMultiplicity newMultiplicity) {
		if (newMultiplicity != multiplicity) {
			NotificationChain msgs = null;
			if (multiplicity != null)
				msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LPROPERTY__MULTIPLICITY, null, msgs);
			if (newMultiplicity != null)
				msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntitymodelPackage.LPROPERTY__MULTIPLICITY, null, msgs);
			msgs = basicSetMultiplicity(newMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__MULTIPLICITY, newMultiplicity, newMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueLiteral() {
		return defaultValueLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueLiteral(String newDefaultValueLiteral) {
		String oldDefaultValueLiteral = defaultValueLiteral;
		defaultValueLiteral = newDefaultValueLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__DEFAULT_VALUE_LITERAL, oldDefaultValueLiteral, defaultValueLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitymodelPackage.LPROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntitymodelPackage.LPROPERTY__MULTIPLICITY:
				return basicSetMultiplicity(null, msgs);
			case EntitymodelPackage.LPROPERTY__TYPE:
				return basicSetType(null, msgs);
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
			case EntitymodelPackage.LPROPERTY__ID:
				return isId();
			case EntitymodelPackage.LPROPERTY__VERSION:
				return isVersion();
			case EntitymodelPackage.LPROPERTY__TRANSIENT:
				return isTransient();
			case EntitymodelPackage.LPROPERTY__MULTIPLICITY:
				return getMultiplicity();
			case EntitymodelPackage.LPROPERTY__DEFAULT_VALUE_LITERAL:
				return getDefaultValueLiteral();
			case EntitymodelPackage.LPROPERTY__NAME:
				return getName();
			case EntitymodelPackage.LPROPERTY__TYPE:
				return getType();
			case EntitymodelPackage.LPROPERTY__SINGULAR_NAME:
				return getSingularName();
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
			case EntitymodelPackage.LPROPERTY__ID:
				setId((Boolean)newValue);
				return;
			case EntitymodelPackage.LPROPERTY__VERSION:
				setVersion((Boolean)newValue);
				return;
			case EntitymodelPackage.LPROPERTY__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case EntitymodelPackage.LPROPERTY__MULTIPLICITY:
				setMultiplicity((LMultiplicity)newValue);
				return;
			case EntitymodelPackage.LPROPERTY__DEFAULT_VALUE_LITERAL:
				setDefaultValueLiteral((String)newValue);
				return;
			case EntitymodelPackage.LPROPERTY__NAME:
				setName((String)newValue);
				return;
			case EntitymodelPackage.LPROPERTY__TYPE:
				setType((JvmTypeReference)newValue);
				return;
			case EntitymodelPackage.LPROPERTY__SINGULAR_NAME:
				setSingularName((String)newValue);
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
			case EntitymodelPackage.LPROPERTY__ID:
				setId(ID_EDEFAULT);
				return;
			case EntitymodelPackage.LPROPERTY__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EntitymodelPackage.LPROPERTY__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case EntitymodelPackage.LPROPERTY__MULTIPLICITY:
				setMultiplicity((LMultiplicity)null);
				return;
			case EntitymodelPackage.LPROPERTY__DEFAULT_VALUE_LITERAL:
				setDefaultValueLiteral(DEFAULT_VALUE_LITERAL_EDEFAULT);
				return;
			case EntitymodelPackage.LPROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EntitymodelPackage.LPROPERTY__TYPE:
				setType((JvmTypeReference)null);
				return;
			case EntitymodelPackage.LPROPERTY__SINGULAR_NAME:
				setSingularName(SINGULAR_NAME_EDEFAULT);
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
			case EntitymodelPackage.LPROPERTY__ID:
				return id != ID_EDEFAULT;
			case EntitymodelPackage.LPROPERTY__VERSION:
				return version != VERSION_EDEFAULT;
			case EntitymodelPackage.LPROPERTY__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
			case EntitymodelPackage.LPROPERTY__MULTIPLICITY:
				return multiplicity != null;
			case EntitymodelPackage.LPROPERTY__DEFAULT_VALUE_LITERAL:
				return DEFAULT_VALUE_LITERAL_EDEFAULT == null ? defaultValueLiteral != null : !DEFAULT_VALUE_LITERAL_EDEFAULT.equals(defaultValueLiteral);
			case EntitymodelPackage.LPROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EntitymodelPackage.LPROPERTY__TYPE:
				return type != null;
			case EntitymodelPackage.LPROPERTY__SINGULAR_NAME:
				return SINGULAR_NAME_EDEFAULT == null ? singularName != null : !SINGULAR_NAME_EDEFAULT.equals(singularName);
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
		result.append(", version: ");
		result.append(version);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", defaultValueLiteral: ");
		result.append(defaultValueLiteral);
		result.append(", name: ");
		result.append(name);
		result.append(", singularName: ");
		result.append(singularName);
		result.append(')');
		return result.toString();
	}

} //LPropertyImpl
