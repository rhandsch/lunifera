package org.lunifera.metamodel.dsl.software.library.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.AbstractAttributeType;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.AbstractLibraryElement;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.AnalysisState;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.AttributeType_Capability;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.AttributeType_Data;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.AttributeType_Link;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.AttributeType_Unit;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.CapabilityType;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.ConstraintType;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.SoftwareLibraryDslPackage;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.UnitType;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.UnitTypeAttribute;

public class SoftwareLibraryDslJavaValidator extends
		AbstractSoftwareLibraryDslJavaValidator {

	@Check
	public void checkNameStartsWithCapital(
			AbstractLibraryElement abstractLibraryElement) {
		if (!Character.isUpperCase(abstractLibraryElement.getName().charAt(0))) {
			error("Name should start with a capital letter",
					SoftwareLibraryDslPackage.Literals.ABSTRACT_LIBRARY_ELEMENT__NAME);
		}

		if ((abstractLibraryElement.getCaption() != null)
				&& (abstractLibraryElement.getCaption().length() == 0)) {
			error("The caption attribute can be ignored, but if present, it must not be empty.",
					SoftwareLibraryDslPackage.Literals.ABSTRACT_LIBRARY_ELEMENT__CAPTION);
		}
		if ((abstractLibraryElement.getDescription() != null)
				&& (abstractLibraryElement.getDescription().length() == 0)) {
			error("The description attribute can be ignored, but if present, it must not be empty.",
					SoftwareLibraryDslPackage.Literals.ABSTRACT_LIBRARY_ELEMENT__DESCRIPTION);
		}
	}

	@Check
	public void checkUnitType(UnitType unitType) {
		// not abstract UnitType must inform the analysisState
		if (unitType.isAbstract() == false
				&& unitType.getAnalysisState() == AnalysisState.NONE) {

			int result = checkExistenceOfEnumNotNoneInHierarchy(
					unitType,
					SoftwareLibraryDslPackage.Literals.UNIT_TYPE__SUPER_TYPE,
					SoftwareLibraryDslPackage.Literals.UNIT_TYPE__ANALYSIS_STATE,
					AnalysisState.NONE.getLiteral());

			if (result == 0) {
				error("Non abstract UnitType must inform its Analysis State.",
						unitType, null, null);
			}
		}
	}

	@Check
	public void checkCapabilityType(CapabilityType capabilityType) {
		// not abstract CapabilityType must inform the linkTypes
		if (capabilityType.isAbstract() == false
				&& capabilityType.getLinkType() == null) {
			int result = checkExistenceOfReferenceInHierarchy(
					capabilityType,
					SoftwareLibraryDslPackage.Literals.CAPABILITY_TYPE__SUPER_TYPE,
					SoftwareLibraryDslPackage.Literals.CAPABILITY_TYPE__LINK_TYPE);

			if (result == 0) {
				error("Non abstract CapabilityType must inform its allowed LinkTypes.",
						capabilityType, null, null);
			}
		}
	}

	@Check
	public void checkConstraintType(ConstraintType constraintType) {
		// not abstract CapabilityType must inform the linkTypes
		if (constraintType.isAbstract() == false
				&& constraintType.getAllowedFor().isEmpty()) {
			int result = checkExistenceOfNotEmptyReferenceListInHierarchy(
					constraintType,
					SoftwareLibraryDslPackage.Literals.CONSTRAINT_TYPE__SUPER_TYPE,
					SoftwareLibraryDslPackage.Literals.CONSTRAINT_TYPE__ALLOWED_FOR);

			if (result == 0) {
				error("Non abstract ConstraintType must inform where it is allowed to be used.",
						constraintType, null, null);
			}
		}
	}

	@Check
	public void checkAttributeType(AbstractAttributeType attributeType) {
		if (!Character.isUpperCase(attributeType.getName().charAt(0))) {
			error("Name should start with a capital letter",
					SoftwareLibraryDslPackage.Literals.ABSTRACT_ATTRIBUTE_TYPE__NAME);
		}
	}

	@Check
	public void checkAttributeType(AttributeType_Data attributeType) {
		// error when Attribute don't have any parent with dataType field
		int result = checkExistenceOfReferenceInHierarchy(
				attributeType,
				SoftwareLibraryDslPackage.Literals.ATTRIBUTE_TYPE_DATA__SUPER_TYPE,
				SoftwareLibraryDslPackage.Literals.ATTRIBUTE_TYPE_DATA__DATA_TYPE);

		if (result == 0) {
			error("dataType must be informed.", attributeType, null, null);

		}
		// warning when Attribute have a parent and it is overriding dataType
		else if (result > 1) {
			warning("Parent datatype is being overrided.",
					SoftwareLibraryDslPackage.Literals.ATTRIBUTE_TYPE_DATA__DATA_TYPE);
		}
	}

	@Check
	public void checkAttributeType(AttributeType_Link attributeType) {
		// error when Attribute don't have any parent with LinkType field
		int result = checkExistenceOfReferenceInHierarchy(
				attributeType,
				SoftwareLibraryDslPackage.Literals.ATTRIBUTE_TYPE_LINK__SUPER_TYPE,
				SoftwareLibraryDslPackage.Literals.ATTRIBUTE_TYPE_LINK__LINK_TYPE);

		if (result == 0) {
			error("linkType must be informed.", attributeType, null, null);

		}
		// warning when Attribute have a parent and it is overriding LinkType
		else if (result > 1) {
			warning("Parent linkType is being overrided.",
					SoftwareLibraryDslPackage.Literals.ATTRIBUTE_TYPE_LINK__LINK_TYPE);
		}
	}

	@Check
	public void checkAttributeType(AttributeType_Unit attributeType) {
		// error when Attribute don't have any parent with UnitType field
		int result = checkExistenceOfReferenceInHierarchy(
				attributeType,
				SoftwareLibraryDslPackage.Literals.ATTRIBUTE_TYPE_UNIT__SUPER_TYPE,
				SoftwareLibraryDslPackage.Literals.ATTRIBUTE_TYPE_UNIT__UNIT_TYPE);

		if (result == 0) {
			error("unitType must be informed.", attributeType, null, null);

		}
		// warning when Attribute have a parent and it is overriding UnitType
		else if (result > 1) {
			warning("Parent unitType is being overrided.",
					SoftwareLibraryDslPackage.Literals.ATTRIBUTE_TYPE_UNIT__UNIT_TYPE);
		}
	}

	@Check
	public void checkAttributeType(AttributeType_Capability attributeType) {
		// error when Attribute don't have any parent with CapabilityType field
		int result = checkExistenceOfReferenceInHierarchy(
				attributeType,
				SoftwareLibraryDslPackage.Literals.ATTRIBUTE_TYPE_CAPABILITY__SUPER_TYPE,
				SoftwareLibraryDslPackage.Literals.ATTRIBUTE_TYPE_CAPABILITY__CAPABILITY_TYPE);

		if (result == 0) {
			error("capabilityType must be informed.", attributeType, null, null);

		}
		// warning when Attribute have a parent and it is overriding
		// CapabilityType
		else if (result > 1) {
			warning("Parent capabilityType is being overrided.",
					SoftwareLibraryDslPackage.Literals.ATTRIBUTE_TYPE_CAPABILITY__CAPABILITY_TYPE);
		}
	}

	@Check
	public void checkAttributeCapture(UnitTypeAttribute attributeCapture) {
		if (!Character.isLowerCase(attributeCapture.getName().charAt(0))) {
			error("Attribute name should start with a minuscule letter",
					SoftwareLibraryDslPackage.Literals.UNIT_TYPE_ATTRIBUTE__NAME);
		}
		// if (attributeCapture.getCaption() != null
		// && attributeCapture.getCaption().isEmpty()) {
		// warning("Caption could be null but not empty.",
		// SoftwareLibraryDslPackage.Literals.ATTRIBUTE_CAPTURE__CAPTION);
		// }
		//
		// if (attributeCapture.getCaption() != null
		// && !Character.isUpperCase(attributeCapture.getCaption().charAt(
		// 0))) {
		// error("Caption should start with a capital letter",
		// SoftwareLibraryDslPackage.Literals.ATTRIBUTE_CAPTURE__CAPTION);
		// }
	}

	/**
	 * 
	 * @param object
	 * @param parentReference
	 * @param referenceToCheck
	 * @return the number of reference found in the hierarchy.
	 */
	private int checkExistenceOfReferenceInHierarchy(EObject object,
			EReference parentReference, EReference referenceToCheck) {
		int result = 0;

		// verify the existence of reference in the current object
		EObject reference = (EObject) object.eGet(referenceToCheck);
		if (reference != null) {
			result++;
		}

		EObject parent = (EObject) object.eGet(parentReference);
		if (parent != null) {
			result = result
					+ checkExistenceOfReferenceInHierarchy(parent,
							parentReference, referenceToCheck);
		}
		return result;
	}

	private int checkExistenceOfEnumNotNoneInHierarchy(EObject object,
			EReference parentReference, EAttribute attributeToCheck,
			String enumNoneValue) {
		int result = 0;

		// verify the existence of reference in the current object
		Object value = object.eGet(attributeToCheck);
		if (value != null && value.equals(enumNoneValue)) {
			result++;
		}

		EObject parent = (EObject) object.eGet(parentReference);
		if (parent != null) {
			result = result
					+ checkExistenceOfEnumNotNoneInHierarchy(parent,
							parentReference, attributeToCheck, enumNoneValue);
		}
		return result;
	}

	private int checkExistenceOfNotEmptyReferenceListInHierarchy(
			EObject object, EReference parentReference,
			EReference referenceToCheck) {
		int result = 0;

		// verify the existence of reference in the current object
		EList<?> list = (EList<?>) object.eGet(referenceToCheck);
		if (list != null && !list.isEmpty()) {
			result++;
		}

		EObject parent = (EObject) object.eGet(parentReference);
		if (parent != null) {
			result = result
					+ checkExistenceOfNotEmptyReferenceListInHierarchy(parent,
							parentReference, referenceToCheck);
		}
		return result;
	}

}
