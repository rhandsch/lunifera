/**
 */
package org.lunifera.model.common.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.lunifera.model.common.AbsKnowledgeContainer;
import org.lunifera.model.common.AbsProjectContainer;
import org.lunifera.model.common.CommonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abs Knowledge Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.model.common.impl.AbsKnowledgeContainerImpl#getLastModification <em>Last Modification</em>}</li>
 *   <li>{@link org.lunifera.model.common.impl.AbsKnowledgeContainerImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.lunifera.model.common.impl.AbsKnowledgeContainerImpl#getProjectContainer <em>Project Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbsKnowledgeContainerImpl extends AbsDescribedClassImpl implements AbsKnowledgeContainer {
	/**
	 * The default value of the '{@link #getLastModification() <em>Last Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModification()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModification() <em>Last Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModification()
	 * @generated
	 * @ordered
	 */
	protected Date lastModification = LAST_MODIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsKnowledgeContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ABS_KNOWLEDGE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastModification() {
		return lastModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModification(Date newLastModification) {
		Date oldLastModification = lastModification;
		lastModification = newLastModification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ABS_KNOWLEDGE_CONTAINER__LAST_MODIFICATION, oldLastModification, lastModification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ABS_KNOWLEDGE_CONTAINER__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsProjectContainer getProjectContainer() {
		if (eContainerFeatureID() != CommonPackage.ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER) return null;
		return (AbsProjectContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectContainer(AbsProjectContainer newProjectContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProjectContainer, CommonPackage.ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectContainer(AbsProjectContainer newProjectContainer) {
		if (newProjectContainer != eInternalContainer() || (eContainerFeatureID() != CommonPackage.ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER && newProjectContainer != null)) {
			if (EcoreUtil.isAncestor(this, newProjectContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProjectContainer != null)
				msgs = ((InternalEObject)newProjectContainer).eInverseAdd(this, CommonPackage.ABS_PROJECT_CONTAINER__KNOWLEDGE_CONTAINERS, AbsProjectContainer.class, msgs);
			msgs = basicSetProjectContainer(newProjectContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER, newProjectContainer, newProjectContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProjectContainer((AbsProjectContainer)otherEnd, msgs);
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
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER:
				return basicSetProjectContainer(null, msgs);
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
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER:
				return eInternalContainer().eInverseRemove(this, CommonPackage.ABS_PROJECT_CONTAINER__KNOWLEDGE_CONTAINERS, AbsProjectContainer.class, msgs);
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
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__LAST_MODIFICATION:
				return getLastModification();
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__CREATION_DATE:
				return getCreationDate();
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER:
				return getProjectContainer();
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
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__LAST_MODIFICATION:
				setLastModification((Date)newValue);
				return;
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER:
				setProjectContainer((AbsProjectContainer)newValue);
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
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__LAST_MODIFICATION:
				setLastModification(LAST_MODIFICATION_EDEFAULT);
				return;
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER:
				setProjectContainer((AbsProjectContainer)null);
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
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__LAST_MODIFICATION:
				return LAST_MODIFICATION_EDEFAULT == null ? lastModification != null : !LAST_MODIFICATION_EDEFAULT.equals(lastModification);
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER:
				return getProjectContainer() != null;
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
		result.append(" (lastModification: ");
		result.append(lastModification);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //AbsKnowledgeContainerImpl
