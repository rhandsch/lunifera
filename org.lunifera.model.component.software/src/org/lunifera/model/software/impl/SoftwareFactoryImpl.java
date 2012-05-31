/**
 */
package org.lunifera.model.software.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.model.software.API;
import org.lunifera.model.software.AccessMode;
import org.lunifera.model.software.AccessType;
import org.lunifera.model.software.Application;
import org.lunifera.model.software.Bundle;
import org.lunifera.model.software.BundleType;
import org.lunifera.model.software.Composite;
import org.lunifera.model.software.Feature;
import org.lunifera.model.software.ImplementationTechnology;
import org.lunifera.model.software.KnowledgeContainerSoftware;
import org.lunifera.model.software.License;
import org.lunifera.model.software.Module;
import org.lunifera.model.software.NotificationEvent;
import org.lunifera.model.software.NotificationStrategy;
import org.lunifera.model.software.NotificationType;
import org.lunifera.model.software.Ownership;
import org.lunifera.model.software.SoftwareFactory;
import org.lunifera.model.software.SoftwarePackage;
import org.lunifera.model.software.SoftwareSetup;
import org.lunifera.model.software.SoftwareStatus;
import org.lunifera.model.software.ThirdAPI;
import org.lunifera.model.software.ThirdSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareFactoryImpl extends EFactoryImpl implements SoftwareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoftwareFactory init() {
		try {
			SoftwareFactory theSoftwareFactory = (SoftwareFactory)EPackage.Registry.INSTANCE.getEFactory("http://lunifera.org/model/1.0/Software"); 
			if (theSoftwareFactory != null) {
				return theSoftwareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoftwareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SoftwarePackage.KNOWLEDGE_CONTAINER_SOFTWARE: return createKnowledgeContainerSoftware();
			case SoftwarePackage.SYSTEM: return createSystem();
			case SoftwarePackage.APPLICATION: return createApplication();
			case SoftwarePackage.COMPOSITE: return createComposite();
			case SoftwarePackage.MODULE: return createModule();
			case SoftwarePackage.FEATURE: return createFeature();
			case SoftwarePackage.BUNDLE: return createBundle();
			case SoftwarePackage.THIRD_SYSTEM: return createThirdSystem();
			case SoftwarePackage.API: return createAPI();
			case SoftwarePackage.THIRD_API: return createThirdAPI();
			case SoftwarePackage.SOFTWARE_SETUP: return createSoftwareSetup();
			case SoftwarePackage.NOTIFICATION_STRATEGY: return createNotificationStrategy();
			case SoftwarePackage.LICENSE: return createLicense();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SoftwarePackage.SOFTWARE_STATUS:
				return createSoftwareStatusFromString(eDataType, initialValue);
			case SoftwarePackage.ACCESS_TYPE:
				return createAccessTypeFromString(eDataType, initialValue);
			case SoftwarePackage.ACCESS_MODE:
				return createAccessModeFromString(eDataType, initialValue);
			case SoftwarePackage.NOTIFICATION_EVENT:
				return createNotificationEventFromString(eDataType, initialValue);
			case SoftwarePackage.NOTIFICATION_TYPE:
				return createNotificationTypeFromString(eDataType, initialValue);
			case SoftwarePackage.BUNDLE_TYPE:
				return createBundleTypeFromString(eDataType, initialValue);
			case SoftwarePackage.IMPLEMENTATION_TECHNOLOGY:
				return createImplementationTechnologyFromString(eDataType, initialValue);
			case SoftwarePackage.OWNERSHIP:
				return createOwnershipFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SoftwarePackage.SOFTWARE_STATUS:
				return convertSoftwareStatusToString(eDataType, instanceValue);
			case SoftwarePackage.ACCESS_TYPE:
				return convertAccessTypeToString(eDataType, instanceValue);
			case SoftwarePackage.ACCESS_MODE:
				return convertAccessModeToString(eDataType, instanceValue);
			case SoftwarePackage.NOTIFICATION_EVENT:
				return convertNotificationEventToString(eDataType, instanceValue);
			case SoftwarePackage.NOTIFICATION_TYPE:
				return convertNotificationTypeToString(eDataType, instanceValue);
			case SoftwarePackage.BUNDLE_TYPE:
				return convertBundleTypeToString(eDataType, instanceValue);
			case SoftwarePackage.IMPLEMENTATION_TECHNOLOGY:
				return convertImplementationTechnologyToString(eDataType, instanceValue);
			case SoftwarePackage.OWNERSHIP:
				return convertOwnershipToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeContainerSoftware createKnowledgeContainerSoftware() {
		KnowledgeContainerSoftwareImpl knowledgeContainerSoftware = new KnowledgeContainerSoftwareImpl();
		return knowledgeContainerSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.lunifera.model.software.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThirdSystem createThirdSystem() {
		ThirdSystemImpl thirdSystem = new ThirdSystemImpl();
		return thirdSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API createAPI() {
		APIImpl api = new APIImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThirdAPI createThirdAPI() {
		ThirdAPIImpl thirdAPI = new ThirdAPIImpl();
		return thirdAPI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSetup createSoftwareSetup() {
		SoftwareSetupImpl softwareSetup = new SoftwareSetupImpl();
		return softwareSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationStrategy createNotificationStrategy() {
		NotificationStrategyImpl notificationStrategy = new NotificationStrategyImpl();
		return notificationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public License createLicense() {
		LicenseImpl license = new LicenseImpl();
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareStatus createSoftwareStatusFromString(EDataType eDataType, String initialValue) {
		SoftwareStatus result = SoftwareStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSoftwareStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue) {
		AccessType result = AccessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMode createAccessModeFromString(EDataType eDataType, String initialValue) {
		AccessMode result = AccessMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationEvent createNotificationEventFromString(EDataType eDataType, String initialValue) {
		NotificationEvent result = NotificationEvent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotificationEventToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationType createNotificationTypeFromString(EDataType eDataType, String initialValue) {
		NotificationType result = NotificationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotificationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleType createBundleTypeFromString(EDataType eDataType, String initialValue) {
		BundleType result = BundleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBundleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationTechnology createImplementationTechnologyFromString(EDataType eDataType, String initialValue) {
		ImplementationTechnology result = ImplementationTechnology.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImplementationTechnologyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ownership createOwnershipFromString(EDataType eDataType, String initialValue) {
		Ownership result = Ownership.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOwnershipToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwarePackage getSoftwarePackage() {
		return (SoftwarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoftwarePackage getPackage() {
		return SoftwarePackage.eINSTANCE;
	}

} //SoftwareFactoryImpl
