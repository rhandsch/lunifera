/**
 */
package org.lunifera.metamodel.knowledge.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.lunifera.metamodel.common.impl.AbstractDescribedClassImpl;

import org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer;
import org.lunifera.metamodel.knowledge.KnowledgePackage;
import org.lunifera.metamodel.knowledge.ModelingProject;

import org.lunifera.metamodel.organization.Worker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Knowledge Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.knowledge.impl.AbstractKnowledgeContainerImpl#getLastModification <em>Last Modification</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.impl.AbstractKnowledgeContainerImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.impl.AbstractKnowledgeContainerImpl#getProjectContainer <em>Project Container</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.impl.AbstractKnowledgeContainerImpl#getTechOwner <em>Tech Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractKnowledgeContainerImpl extends AbstractDescribedClassImpl implements AbstractKnowledgeContainer {
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
	 * The cached value of the '{@link #getTechOwner() <em>Tech Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechOwner()
	 * @generated
	 * @ordered
	 */
	protected Worker techOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractKnowledgeContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KnowledgePackage.Literals.ABSTRACT_KNOWLEDGE_CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__LAST_MODIFICATION, oldLastModification, lastModification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingProject getProjectContainer() {
		if (eContainerFeatureID() != KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER) return null;
		return (ModelingProject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectContainer(ModelingProject newProjectContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProjectContainer, KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectContainer(ModelingProject newProjectContainer) {
		if (newProjectContainer != eInternalContainer() || (eContainerFeatureID() != KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER && newProjectContainer != null)) {
			if (EcoreUtil.isAncestor(this, newProjectContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProjectContainer != null)
				msgs = ((InternalEObject)newProjectContainer).eInverseAdd(this, KnowledgePackage.MODELING_PROJECT__KNOWLEDGE_CONTAINERS, ModelingProject.class, msgs);
			msgs = basicSetProjectContainer(newProjectContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER, newProjectContainer, newProjectContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Worker getTechOwner() {
		if (techOwner != null && techOwner.eIsProxy()) {
			InternalEObject oldTechOwner = (InternalEObject)techOwner;
			techOwner = (Worker)eResolveProxy(oldTechOwner);
			if (techOwner != oldTechOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__TECH_OWNER, oldTechOwner, techOwner));
			}
		}
		return techOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Worker basicGetTechOwner() {
		return techOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechOwner(Worker newTechOwner) {
		Worker oldTechOwner = techOwner;
		techOwner = newTechOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__TECH_OWNER, oldTechOwner, techOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProjectContainer((ModelingProject)otherEnd, msgs);
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
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER:
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
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER:
				return eInternalContainer().eInverseRemove(this, KnowledgePackage.MODELING_PROJECT__KNOWLEDGE_CONTAINERS, ModelingProject.class, msgs);
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
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__LAST_MODIFICATION:
				return getLastModification();
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__CREATION_DATE:
				return getCreationDate();
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER:
				return getProjectContainer();
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__TECH_OWNER:
				if (resolve) return getTechOwner();
				return basicGetTechOwner();
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
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__LAST_MODIFICATION:
				setLastModification((Date)newValue);
				return;
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER:
				setProjectContainer((ModelingProject)newValue);
				return;
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__TECH_OWNER:
				setTechOwner((Worker)newValue);
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
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__LAST_MODIFICATION:
				setLastModification(LAST_MODIFICATION_EDEFAULT);
				return;
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER:
				setProjectContainer((ModelingProject)null);
				return;
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__TECH_OWNER:
				setTechOwner((Worker)null);
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
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__LAST_MODIFICATION:
				return LAST_MODIFICATION_EDEFAULT == null ? lastModification != null : !LAST_MODIFICATION_EDEFAULT.equals(lastModification);
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER:
				return getProjectContainer() != null;
			case KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__TECH_OWNER:
				return techOwner != null;
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

} //AbstractKnowledgeContainerImpl
