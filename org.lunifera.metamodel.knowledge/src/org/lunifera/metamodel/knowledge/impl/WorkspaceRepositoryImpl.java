/**
 */
package org.lunifera.metamodel.knowledge.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.common.impl.AbstractDescribedClassImpl;

import org.lunifera.metamodel.knowledge.KnowledgePackage;
import org.lunifera.metamodel.knowledge.ModelingProject;
import org.lunifera.metamodel.knowledge.WorkspaceRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workspace Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.knowledge.impl.WorkspaceRepositoryImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.impl.WorkspaceRepositoryImpl#getLastModification <em>Last Modification</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.impl.WorkspaceRepositoryImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.impl.WorkspaceRepositoryImpl#getProjectContainers <em>Project Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkspaceRepositoryImpl extends AbstractDescribedClassImpl implements WorkspaceRepository {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

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
	 * The cached value of the '{@link #getProjectContainers() <em>Project Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelingProject> projectContainers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkspaceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KnowledgePackage.Literals.WORKSPACE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KnowledgePackage.WORKSPACE_REPOSITORY__URI, oldUri, uri));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KnowledgePackage.WORKSPACE_REPOSITORY__LAST_MODIFICATION, oldLastModification, lastModification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KnowledgePackage.WORKSPACE_REPOSITORY__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelingProject> getProjectContainers() {
		if (projectContainers == null) {
			projectContainers = new EObjectContainmentEList<ModelingProject>(ModelingProject.class, this, KnowledgePackage.WORKSPACE_REPOSITORY__PROJECT_CONTAINERS);
		}
		return projectContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KnowledgePackage.WORKSPACE_REPOSITORY__PROJECT_CONTAINERS:
				return ((InternalEList<?>)getProjectContainers()).basicRemove(otherEnd, msgs);
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
			case KnowledgePackage.WORKSPACE_REPOSITORY__URI:
				return getUri();
			case KnowledgePackage.WORKSPACE_REPOSITORY__LAST_MODIFICATION:
				return getLastModification();
			case KnowledgePackage.WORKSPACE_REPOSITORY__CREATION_DATE:
				return getCreationDate();
			case KnowledgePackage.WORKSPACE_REPOSITORY__PROJECT_CONTAINERS:
				return getProjectContainers();
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
			case KnowledgePackage.WORKSPACE_REPOSITORY__URI:
				setUri((String)newValue);
				return;
			case KnowledgePackage.WORKSPACE_REPOSITORY__LAST_MODIFICATION:
				setLastModification((Date)newValue);
				return;
			case KnowledgePackage.WORKSPACE_REPOSITORY__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case KnowledgePackage.WORKSPACE_REPOSITORY__PROJECT_CONTAINERS:
				getProjectContainers().clear();
				getProjectContainers().addAll((Collection<? extends ModelingProject>)newValue);
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
			case KnowledgePackage.WORKSPACE_REPOSITORY__URI:
				setUri(URI_EDEFAULT);
				return;
			case KnowledgePackage.WORKSPACE_REPOSITORY__LAST_MODIFICATION:
				setLastModification(LAST_MODIFICATION_EDEFAULT);
				return;
			case KnowledgePackage.WORKSPACE_REPOSITORY__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case KnowledgePackage.WORKSPACE_REPOSITORY__PROJECT_CONTAINERS:
				getProjectContainers().clear();
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
			case KnowledgePackage.WORKSPACE_REPOSITORY__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case KnowledgePackage.WORKSPACE_REPOSITORY__LAST_MODIFICATION:
				return LAST_MODIFICATION_EDEFAULT == null ? lastModification != null : !LAST_MODIFICATION_EDEFAULT.equals(lastModification);
			case KnowledgePackage.WORKSPACE_REPOSITORY__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case KnowledgePackage.WORKSPACE_REPOSITORY__PROJECT_CONTAINERS:
				return projectContainers != null && !projectContainers.isEmpty();
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(", lastModification: ");
		result.append(lastModification);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //WorkspaceRepositoryImpl
