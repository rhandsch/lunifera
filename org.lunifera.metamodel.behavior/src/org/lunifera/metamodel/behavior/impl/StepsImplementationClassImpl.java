/**
 */
package org.lunifera.metamodel.behavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.lunifera.metamodel.behavior.BehaviorPackage;
import org.lunifera.metamodel.behavior.ImplementationLanguage;
import org.lunifera.metamodel.behavior.StepsImplementationClass;
import org.lunifera.metamodel.behavior.StepsLibrary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Steps Implementation Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StepsImplementationClassImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StepsImplementationClassImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StepsImplementationClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StepsImplementationClassImpl#getProjectPath <em>Project Path</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.StepsImplementationClassImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepsImplementationClassImpl extends EObjectImpl implements StepsImplementationClass {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final ImplementationLanguage LANGUAGE_EDEFAULT = ImplementationLanguage.JAVA;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected ImplementationLanguage language = LANGUAGE_EDEFAULT;

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
	 * The default value of the '{@link #getProjectPath() <em>Project Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectPath() <em>Project Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectPath()
	 * @generated
	 * @ordered
	 */
	protected String projectPath = PROJECT_PATH_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepsImplementationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.STEPS_IMPLEMENTATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsLibrary getLibrary() {
		if (eContainerFeatureID() != BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LIBRARY) return null;
		return (StepsLibrary)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(StepsLibrary newLibrary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLibrary, BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LIBRARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(StepsLibrary newLibrary) {
		if (newLibrary != eInternalContainer() || (eContainerFeatureID() != BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LIBRARY && newLibrary != null)) {
			if (EcoreUtil.isAncestor(this, newLibrary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLibrary != null)
				msgs = ((InternalEObject)newLibrary).eInverseAdd(this, BehaviorPackage.STEPS_LIBRARY__IMPLEMENTATION_CLASSES, StepsLibrary.class, msgs);
			msgs = basicSetLibrary(newLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LIBRARY, newLibrary, newLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationLanguage getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(ImplementationLanguage newLanguage) {
		ImplementationLanguage oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectPath() {
		return projectPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectPath(String newProjectPath) {
		String oldProjectPath = projectPath;
		projectPath = newProjectPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__PROJECT_PATH, oldProjectPath, projectPath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LIBRARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLibrary((StepsLibrary)otherEnd, msgs);
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
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LIBRARY:
				return basicSetLibrary(null, msgs);
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
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LIBRARY:
				return eInternalContainer().eInverseRemove(this, BehaviorPackage.STEPS_LIBRARY__IMPLEMENTATION_CLASSES, StepsLibrary.class, msgs);
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
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LIBRARY:
				return getLibrary();
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LANGUAGE:
				return getLanguage();
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__NAME:
				return getName();
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__PROJECT_PATH:
				return getProjectPath();
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__ID:
				return getId();
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
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LIBRARY:
				setLibrary((StepsLibrary)newValue);
				return;
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LANGUAGE:
				setLanguage((ImplementationLanguage)newValue);
				return;
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__NAME:
				setName((String)newValue);
				return;
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__PROJECT_PATH:
				setProjectPath((String)newValue);
				return;
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__ID:
				setId((Long)newValue);
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
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LIBRARY:
				setLibrary((StepsLibrary)null);
				return;
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__PROJECT_PATH:
				setProjectPath(PROJECT_PATH_EDEFAULT);
				return;
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__ID:
				setId(ID_EDEFAULT);
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
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LIBRARY:
				return getLibrary() != null;
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__LANGUAGE:
				return language != LANGUAGE_EDEFAULT;
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__PROJECT_PATH:
				return PROJECT_PATH_EDEFAULT == null ? projectPath != null : !PROJECT_PATH_EDEFAULT.equals(projectPath);
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (language: ");
		result.append(language);
		result.append(", name: ");
		result.append(name);
		result.append(", projectPath: ");
		result.append(projectPath);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //StepsImplementationClassImpl
