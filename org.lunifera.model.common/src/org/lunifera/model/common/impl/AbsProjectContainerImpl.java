/**
 */
package org.lunifera.model.common.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.model.common.AbsKnowledgeContainer;
import org.lunifera.model.common.AbsProjectContainer;
import org.lunifera.model.common.CommonPackage;
import org.lunifera.model.common.Import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abs Project Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.model.common.impl.AbsProjectContainerImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.lunifera.model.common.impl.AbsProjectContainerImpl#getJdtURI <em>Jdt URI</em>}</li>
 *   <li>{@link org.lunifera.model.common.impl.AbsProjectContainerImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.lunifera.model.common.impl.AbsProjectContainerImpl#getKnowledgeContainers <em>Knowledge Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbsProjectContainerImpl extends AbsDescribedClassImpl implements AbsProjectContainer {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The default value of the '{@link #getJdtURI() <em>Jdt URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdtURI()
	 * @generated
	 * @ordered
	 */
	protected static final String JDT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJdtURI() <em>Jdt URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdtURI()
	 * @generated
	 * @ordered
	 */
	protected String jdtURI = JDT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected String createdBy = CREATED_BY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKnowledgeContainers() <em>Knowledge Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<AbsKnowledgeContainer> knowledgeContainers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsProjectContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ABS_PROJECT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, CommonPackage.ABS_PROJECT_CONTAINER__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJdtURI() {
		return jdtURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdtURI(String newJdtURI) {
		String oldJdtURI = jdtURI;
		jdtURI = newJdtURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ABS_PROJECT_CONTAINER__JDT_URI, oldJdtURI, jdtURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedBy(String newCreatedBy) {
		String oldCreatedBy = createdBy;
		createdBy = newCreatedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ABS_PROJECT_CONTAINER__CREATED_BY, oldCreatedBy, createdBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbsKnowledgeContainer> getKnowledgeContainers() {
		if (knowledgeContainers == null) {
			knowledgeContainers = new EObjectContainmentWithInverseEList<AbsKnowledgeContainer>(AbsKnowledgeContainer.class, this, CommonPackage.ABS_PROJECT_CONTAINER__KNOWLEDGE_CONTAINERS, CommonPackage.ABS_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER);
		}
		return knowledgeContainers;
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
			case CommonPackage.ABS_PROJECT_CONTAINER__KNOWLEDGE_CONTAINERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getKnowledgeContainers()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.ABS_PROJECT_CONTAINER__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case CommonPackage.ABS_PROJECT_CONTAINER__KNOWLEDGE_CONTAINERS:
				return ((InternalEList<?>)getKnowledgeContainers()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.ABS_PROJECT_CONTAINER__IMPORTS:
				return getImports();
			case CommonPackage.ABS_PROJECT_CONTAINER__JDT_URI:
				return getJdtURI();
			case CommonPackage.ABS_PROJECT_CONTAINER__CREATED_BY:
				return getCreatedBy();
			case CommonPackage.ABS_PROJECT_CONTAINER__KNOWLEDGE_CONTAINERS:
				return getKnowledgeContainers();
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
			case CommonPackage.ABS_PROJECT_CONTAINER__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case CommonPackage.ABS_PROJECT_CONTAINER__JDT_URI:
				setJdtURI((String)newValue);
				return;
			case CommonPackage.ABS_PROJECT_CONTAINER__CREATED_BY:
				setCreatedBy((String)newValue);
				return;
			case CommonPackage.ABS_PROJECT_CONTAINER__KNOWLEDGE_CONTAINERS:
				getKnowledgeContainers().clear();
				getKnowledgeContainers().addAll((Collection<? extends AbsKnowledgeContainer>)newValue);
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
			case CommonPackage.ABS_PROJECT_CONTAINER__IMPORTS:
				getImports().clear();
				return;
			case CommonPackage.ABS_PROJECT_CONTAINER__JDT_URI:
				setJdtURI(JDT_URI_EDEFAULT);
				return;
			case CommonPackage.ABS_PROJECT_CONTAINER__CREATED_BY:
				setCreatedBy(CREATED_BY_EDEFAULT);
				return;
			case CommonPackage.ABS_PROJECT_CONTAINER__KNOWLEDGE_CONTAINERS:
				getKnowledgeContainers().clear();
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
			case CommonPackage.ABS_PROJECT_CONTAINER__IMPORTS:
				return imports != null && !imports.isEmpty();
			case CommonPackage.ABS_PROJECT_CONTAINER__JDT_URI:
				return JDT_URI_EDEFAULT == null ? jdtURI != null : !JDT_URI_EDEFAULT.equals(jdtURI);
			case CommonPackage.ABS_PROJECT_CONTAINER__CREATED_BY:
				return CREATED_BY_EDEFAULT == null ? createdBy != null : !CREATED_BY_EDEFAULT.equals(createdBy);
			case CommonPackage.ABS_PROJECT_CONTAINER__KNOWLEDGE_CONTAINERS:
				return knowledgeContainers != null && !knowledgeContainers.isEmpty();
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
		result.append(" (jdtURI: ");
		result.append(jdtURI);
		result.append(", createdBy: ");
		result.append(createdBy);
		result.append(')');
		return result.toString();
	}

} //AbsProjectContainerImpl
