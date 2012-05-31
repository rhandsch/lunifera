/**
 */
package org.lunifera.model.common.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.lunifera.model.common.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.model.common.CommonPackage
 * @generated
 */
public class CommonValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CommonValidator INSTANCE = new CommonValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.lunifera.model.common";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CommonPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CommonPackage.ABS_IDENTIFIED_CLASS:
				return validateAbsIdentifiedClass((AbsIdentifiedClass)value, diagnostics, context);
			case CommonPackage.ABS_NAMED_CLASS:
				return validateAbsNamedClass((AbsNamedClass)value, diagnostics, context);
			case CommonPackage.ABS_DESCRIBED_CLASS:
				return validateAbsDescribedClass((AbsDescribedClass)value, diagnostics, context);
			case CommonPackage.ABS_PROJECT_CONTAINER:
				return validateAbsProjectContainer((AbsProjectContainer)value, diagnostics, context);
			case CommonPackage.ABS_KNOWLEDGE_CONTAINER:
				return validateAbsKnowledgeContainer((AbsKnowledgeContainer)value, diagnostics, context);
			case CommonPackage.IMPORT:
				return validateImport((Import)value, diagnostics, context);
			case CommonPackage.EMAIL:
				return validateEmail((Email)value, diagnostics, context);
			case CommonPackage.PHONE:
				return validatePhone((Phone)value, diagnostics, context);
			case CommonPackage.PHONE_COMPANY:
				return validatePhoneCompany((PhoneCompany)value, diagnostics, context);
			case CommonPackage.COUNTRY:
				return validateCountry((Country)value, diagnostics, context);
			case CommonPackage.CITY:
				return validateCity((City)value, diagnostics, context);
			case CommonPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case CommonPackage.ADDRESS:
				return validateAddress((Address)value, diagnostics, context);
			case CommonPackage.EMAIL_TYPE:
				return validateEmailType((EmailType)value, diagnostics, context);
			case CommonPackage.PHONE_TYPE:
				return validatePhoneType((PhoneType)value, diagnostics, context);
			case CommonPackage.ADDRESS_TYPE:
				return validateAddressType((AddressType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbsIdentifiedClass(AbsIdentifiedClass absIdentifiedClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(absIdentifiedClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbsNamedClass(AbsNamedClass absNamedClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(absNamedClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbsDescribedClass(AbsDescribedClass absDescribedClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(absDescribedClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbsProjectContainer(AbsProjectContainer absProjectContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(absProjectContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbsKnowledgeContainer(AbsKnowledgeContainer absKnowledgeContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(absKnowledgeContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImport(Import import_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(import_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmail(Email email, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(email, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(email, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(email, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(email, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(email, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(email, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(email, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(email, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(email, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmail_HasEmailNotNull(email, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmail_HasValidEmal(email, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HasEmailNotNull constraint of '<em>Email</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmail_HasEmailNotNull(Email email, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "HasEmailNotNull", getObjectLabel(email, context) },
						 new Object[] { email },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the HasValidEmal constraint of '<em>Email</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmail_HasValidEmal(Email email, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "HasValidEmal", getObjectLabel(email, context) },
						 new Object[] { email },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhone(Phone phone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(phone, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhoneCompany(PhoneCompany phoneCompany, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(phoneCompany, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(country, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCity(City city, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(city, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(state, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(address, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(address, diagnostics, context);
		if (result || diagnostics != null) result &= validateAddress_onlyStatesFromSelectedCountry(address, diagnostics, context);
		return result;
	}

	/**
	 * Validates the onlyStatesFromSelectedCountry constraint of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress_onlyStatesFromSelectedCountry(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "onlyStatesFromSelectedCountry", getObjectLabel(address, context) },
						 new Object[] { address },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailType(EmailType emailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhoneType(PhoneType phoneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressType(AddressType addressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CommonValidator
