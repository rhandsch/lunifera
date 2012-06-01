/**
 */
package org.lunifera.metamodel.knowledge.impl;

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

import org.lunifera.metamodel.common.Import;

import org.lunifera.metamodel.common.impl.AbstractDescribedClassImpl;

import org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer;
import org.lunifera.metamodel.knowledge.KnowledgePackage;
import org.lunifera.metamodel.knowledge.ModelingProject;
import org.lunifera.metamodel.knowledge.WorkspaceRepository;

import org.lunifera.metamodel.organization.KnowledgeContainerOrganization;
import org.lunifera.metamodel.organization.Organization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modeling Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.knowledge.impl.ModelingProjectImpl#getWorkspace <em>Workspace</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.impl.ModelingProjectImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.impl.ModelingProjectImpl#getJdtURI <em>Jdt URI</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.impl.ModelingProjectImpl#getKnowledgeContainers <em>Knowledge Containers</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.impl.ModelingProjectImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.lunifera.metamodel.knowledge.impl.ModelingProjectImpl#getOrganizationKnowledgeContainers <em>Organization Knowledge Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelingProjectImpl extends AbstractDescribedClassImpl implements ModelingProject {
	/**
	 * The cached value of the '{@link #getWorkspace() <em>Workspace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkspace()
	 * @generated
	 * @ordered
	 */
	protected WorkspaceRepository workspace;

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
	 * The cached value of the '{@link #getKnowledgeContainers() <em>Knowledge Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractKnowledgeContainer> knowledgeContainers;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Organization owner;

	/**
	 * The cached value of the '{@link #getOrganizationKnowledgeContainers() <em>Organization Knowledge Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationKnowledgeContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<KnowledgeContainerOrganization> organizationKnowledgeContainers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KnowledgePackage.Literals.MODELING_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkspaceRepository getWorkspace() {
		if (workspace != null && workspace.eIsProxy()) {
			InternalEObject oldWorkspace = (InternalEObject)workspace;
			workspace = (WorkspaceRepository)eResolveProxy(oldWorkspace);
			if (workspace != oldWorkspace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KnowledgePackage.MODELING_PROJECT__WORKSPACE, oldWorkspace, workspace));
			}
		}
		return workspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkspaceRepository basicGetWorkspace() {
		return workspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkspace(WorkspaceRepository newWorkspace) {
		WorkspaceRepository oldWorkspace = workspace;
		workspace = newWorkspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KnowledgePackage.MODELING_PROJECT__WORKSPACE, oldWorkspace, workspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, KnowledgePackage.MODELING_PROJECT__IMPORTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, KnowledgePackage.MODELING_PROJECT__JDT_URI, oldJdtURI, jdtURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractKnowledgeContainer> getKnowledgeContainers() {
		if (knowledgeContainers == null) {
			knowledgeContainers = new EObjectContainmentWithInverseEList<AbstractKnowledgeContainer>(AbstractKnowledgeContainer.class, this, KnowledgePackage.MODELING_PROJECT__KNOWLEDGE_CONTAINERS, KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER);
		}
		return knowledgeContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Organization)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KnowledgePackage.MODELING_PROJECT__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Organization newOwner) {
		Organization oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KnowledgePackage.MODELING_PROJECT__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KnowledgeContainerOrganization> getOrganizationKnowledgeContainers() {
		if (organizationKnowledgeContainers == null) {
			organizationKnowledgeContainers = new EObjectContainmentEList<KnowledgeContainerOrganization>(KnowledgeContainerOrganization.class, this, KnowledgePackage.MODELING_PROJECT__ORGANIZATION_KNOWLEDGE_CONTAINERS);
		}
		return organizationKnowledgeContainers;
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
			case KnowledgePackage.MODELING_PROJECT__KNOWLEDGE_CONTAINERS:
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
			case KnowledgePackage.MODELING_PROJECT__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case KnowledgePackage.MODELING_PROJECT__KNOWLEDGE_CONTAINERS:
				return ((InternalEList<?>)getKnowledgeContainers()).basicRemove(otherEnd, msgs);
			case KnowledgePackage.MODELING_PROJECT__ORGANIZATION_KNOWLEDGE_CONTAINERS:
				return ((InternalEList<?>)getOrganizationKnowledgeContainers()).basicRemove(otherEnd, msgs);
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
			case KnowledgePackage.MODELING_PROJECT__WORKSPACE:
				if (resolve) return getWorkspace();
				return basicGetWorkspace();
			case KnowledgePackage.MODELING_PROJECT__IMPORTS:
				return getImports();
			case KnowledgePackage.MODELING_PROJECT__JDT_URI:
				return getJdtURI();
			case KnowledgePackage.MODELING_PROJECT__KNOWLEDGE_CONTAINERS:
				return getKnowledgeContainers();
			case KnowledgePackage.MODELING_PROJECT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case KnowledgePackage.MODELING_PROJECT__ORGANIZATION_KNOWLEDGE_CONTAINERS:
				return getOrganizationKnowledgeContainers();
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
			case KnowledgePackage.MODELING_PROJECT__WORKSPACE:
				setWorkspace((WorkspaceRepository)newValue);
				return;
			case KnowledgePackage.MODELING_PROJECT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case KnowledgePackage.MODELING_PROJECT__JDT_URI:
				setJdtURI((String)newValue);
				return;
			case KnowledgePackage.MODELING_PROJECT__KNOWLEDGE_CONTAINERS:
				getKnowledgeContainers().clear();
				getKnowledgeContainers().addAll((Collection<? extends AbstractKnowledgeContainer>)newValue);
				return;
			case KnowledgePackage.MODELING_PROJECT__OWNER:
				setOwner((Organization)newValue);
				return;
			case KnowledgePackage.MODELING_PROJECT__ORGANIZATION_KNOWLEDGE_CONTAINERS:
				getOrganizationKnowledgeContainers().clear();
				getOrganizationKnowledgeContainers().addAll((Collection<? extends KnowledgeContainerOrganization>)newValue);
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
			case KnowledgePackage.MODELING_PROJECT__WORKSPACE:
				setWorkspace((WorkspaceRepository)null);
				return;
			case KnowledgePackage.MODELING_PROJECT__IMPORTS:
				getImports().clear();
				return;
			case KnowledgePackage.MODELING_PROJECT__JDT_URI:
				setJdtURI(JDT_URI_EDEFAULT);
				return;
			case KnowledgePackage.MODELING_PROJECT__KNOWLEDGE_CONTAINERS:
				getKnowledgeContainers().clear();
				return;
			case KnowledgePackage.MODELING_PROJECT__OWNER:
				setOwner((Organization)null);
				return;
			case KnowledgePackage.MODELING_PROJECT__ORGANIZATION_KNOWLEDGE_CONTAINERS:
				getOrganizationKnowledgeContainers().clear();
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
			case KnowledgePackage.MODELING_PROJECT__WORKSPACE:
				return workspace != null;
			case KnowledgePackage.MODELING_PROJECT__IMPORTS:
				return imports != null && !imports.isEmpty();
			case KnowledgePackage.MODELING_PROJECT__JDT_URI:
				return JDT_URI_EDEFAULT == null ? jdtURI != null : !JDT_URI_EDEFAULT.equals(jdtURI);
			case KnowledgePackage.MODELING_PROJECT__KNOWLEDGE_CONTAINERS:
				return knowledgeContainers != null && !knowledgeContainers.isEmpty();
			case KnowledgePackage.MODELING_PROJECT__OWNER:
				return owner != null;
			case KnowledgePackage.MODELING_PROJECT__ORGANIZATION_KNOWLEDGE_CONTAINERS:
				return organizationKnowledgeContainers != null && !organizationKnowledgeContainers.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ModelingProjectImpl
