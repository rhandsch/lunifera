/**
 */
package org.lunifera.metamodel.businessprocess.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.businessprocess.BusinessProcessDefinition;
import org.lunifera.metamodel.businessprocess.BusinessprocessPackage;

import org.lunifera.metamodel.common.impl.AbstractDescribedClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Process Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.businessprocess.impl.BusinessProcessDefinitionImpl#getProcessId <em>Process Id</em>}</li>
 *   <li>{@link org.lunifera.metamodel.businessprocess.impl.BusinessProcessDefinitionImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.lunifera.metamodel.businessprocess.impl.BusinessProcessDefinitionImpl#getDetailDescription <em>Detail Description</em>}</li>
 *   <li>{@link org.lunifera.metamodel.businessprocess.impl.BusinessProcessDefinitionImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.lunifera.metamodel.businessprocess.impl.BusinessProcessDefinitionImpl#getBpmnProcess <em>Bpmn Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessProcessDefinitionImpl extends AbstractDescribedClassImpl implements BusinessProcessDefinition {
	/**
	 * The default value of the '{@link #getProcessId() <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessId() <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessId()
	 * @generated
	 * @ordered
	 */
	protected String processId = PROCESS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetailDescription() <em>Detail Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAIL_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailDescription() <em>Detail Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailDescription()
	 * @generated
	 * @ordered
	 */
	protected String detailDescription = DETAIL_DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getBpmnProcess() <em>Bpmn Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpmnProcess()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.bpmn2.Process bpmnProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessProcessDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessprocessPackage.Literals.BUSINESS_PROCESS_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessId() {
		return processId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessId(String newProcessId) {
		String oldProcessId = processId;
		processId = newProcessId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__PROCESS_ID, oldProcessId, processId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetailDescription() {
		return detailDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailDescription(String newDetailDescription) {
		String oldDetailDescription = detailDescription;
		detailDescription = newDetailDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__DETAIL_DESCRIPTION, oldDetailDescription, detailDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpmn2.Process getBpmnProcess() {
		if (bpmnProcess != null && bpmnProcess.eIsProxy()) {
			InternalEObject oldBpmnProcess = (InternalEObject)bpmnProcess;
			bpmnProcess = (org.eclipse.bpmn2.Process)eResolveProxy(oldBpmnProcess);
			if (bpmnProcess != oldBpmnProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__BPMN_PROCESS, oldBpmnProcess, bpmnProcess));
			}
		}
		return bpmnProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpmn2.Process basicGetBpmnProcess() {
		return bpmnProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpmnProcess(org.eclipse.bpmn2.Process newBpmnProcess) {
		org.eclipse.bpmn2.Process oldBpmnProcess = bpmnProcess;
		bpmnProcess = newBpmnProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__BPMN_PROCESS, oldBpmnProcess, bpmnProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__PROCESS_ID:
				return getProcessId();
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__SUMMARY:
				return getSummary();
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__DETAIL_DESCRIPTION:
				return getDetailDescription();
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__CREATION_DATE:
				return getCreationDate();
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__BPMN_PROCESS:
				if (resolve) return getBpmnProcess();
				return basicGetBpmnProcess();
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
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__PROCESS_ID:
				setProcessId((String)newValue);
				return;
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__SUMMARY:
				setSummary((String)newValue);
				return;
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__DETAIL_DESCRIPTION:
				setDetailDescription((String)newValue);
				return;
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__BPMN_PROCESS:
				setBpmnProcess((org.eclipse.bpmn2.Process)newValue);
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
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__PROCESS_ID:
				setProcessId(PROCESS_ID_EDEFAULT);
				return;
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__DETAIL_DESCRIPTION:
				setDetailDescription(DETAIL_DESCRIPTION_EDEFAULT);
				return;
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__BPMN_PROCESS:
				setBpmnProcess((org.eclipse.bpmn2.Process)null);
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
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__PROCESS_ID:
				return PROCESS_ID_EDEFAULT == null ? processId != null : !PROCESS_ID_EDEFAULT.equals(processId);
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__DETAIL_DESCRIPTION:
				return DETAIL_DESCRIPTION_EDEFAULT == null ? detailDescription != null : !DETAIL_DESCRIPTION_EDEFAULT.equals(detailDescription);
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case BusinessprocessPackage.BUSINESS_PROCESS_DEFINITION__BPMN_PROCESS:
				return bpmnProcess != null;
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
		result.append(" (processId: ");
		result.append(processId);
		result.append(", summary: ");
		result.append(summary);
		result.append(", detailDescription: ");
		result.append(detailDescription);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //BusinessProcessDefinitionImpl
