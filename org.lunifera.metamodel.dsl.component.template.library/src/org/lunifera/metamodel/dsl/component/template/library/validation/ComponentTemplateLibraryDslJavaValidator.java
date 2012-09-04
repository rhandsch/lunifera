/*******************************************************************************
 * Copyright (c) 2011, 2012 Cristiano Gavião - Lunifera.org.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Cristiano Gavião - initial API and implementation
 *******************************************************************************/
package org.lunifera.metamodel.dsl.component.template.library.validation;

import javax.inject.Inject;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.validation.Check;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.AbstractLibraryElement;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.AnalysisState;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.CapabilityType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ComponentTemplateLibraryDslPackage;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ConstraintType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.UnitType;
import org.lunifera.metamodel.dsl.component.template.library.utils.ComponentTemplateLibraryDslModelUtility;
 

public class ComponentTemplateLibraryDslJavaValidator extends AbstractComponentTemplateLibraryDslJavaValidator {

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	@Inject
	private ComponentTemplateLibraryDslModelUtility ecoreUtils;

	@Check
	public void checkNameStartsWithCapital(
			AbstractLibraryElement abstractLibraryElement) {

		QualifiedName fqn = qualifiedNameProvider
				.getFullyQualifiedName(abstractLibraryElement);

		if (!Character.isUpperCase(fqn.getLastSegment().charAt(0))) {
			error("Element name should start with a capital letter",
					ComponentTemplateLibraryDslPackage.Literals.ABSTRACT_LIBRARY_ELEMENT__NAME);
		}

		if ((abstractLibraryElement.getDescription() != null)
				&& (abstractLibraryElement.getDescription().length() == 0)) {
			error("The description attribute can be ignored, but if present, it must not be empty.",
					ComponentTemplateLibraryDslPackage.Literals.ABSTRACT_LIBRARY_ELEMENT__DESCRIPTION);
		}
	}

	@Check
	public void checkUnitType(UnitType unitType) {
		// not abstract UnitType must inform the analysisState
		if (unitType.isAbstract() == false
				&& unitType.getAnalysisState() == AnalysisState.NONE) {

			int result = ecoreUtils
					.checkExistenceOfEnumNotNoneInHierarchy(
							unitType,
							ComponentTemplateLibraryDslPackage.Literals.UNIT_TYPE__SUPER_TYPE,
							ComponentTemplateLibraryDslPackage.Literals.UNIT_TYPE__ANALYSIS_STATE,
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
			int result = ecoreUtils
					.checkExistenceOfReferenceInHierarchy(
							capabilityType,
							ComponentTemplateLibraryDslPackage.Literals.CAPABILITY_TYPE__SUPER_TYPE,
							ComponentTemplateLibraryDslPackage.Literals.CAPABILITY_TYPE__LINK_TYPE);

			if (result == 0) {
				error("Non abstract CapabilityType must inform its allowed LinkTypes.",
						capabilityType, null, null);
			}
		}
	}

	@Check
	public void checkConstraintType(ConstraintType constraintType) {
		QualifiedName fqn = qualifiedNameProvider
				.getFullyQualifiedName(constraintType);

		if (!Character.isUpperCase(fqn.getLastSegment().charAt(0))) {
			error("Constraint name should start with a capital letter",
					ComponentTemplateLibraryDslPackage.Literals.CONSTRAINT_TYPE__NAME);
		}

		// not abstract CapabilityType must inform the linkTypes
		if (constraintType.isAbstract() == false
				&& constraintType.getAllowedFor().isEmpty()) {
			int result = ecoreUtils
					.checkExistenceOfNotEmptyReferenceListInHierarchy(
							constraintType,
							ComponentTemplateLibraryDslPackage.Literals.CONSTRAINT_TYPE__SUPER_TYPE,
							ComponentTemplateLibraryDslPackage.Literals.CONSTRAINT_TYPE__ALLOWED_FOR);

			if (result == 0) {
				error("Non abstract ConstraintType must inform where it is allowed to be used.",
						constraintType, null, null);
			}
		}
	}

	// @Check
	// public void checkAttributeType(AbstractAttributeType attributeType) {
	// QualifiedName fqn = qualifiedNameProvider
	// .getFullyQualifiedName(attributeType);
	//
	// if (!Character.isUpperCase(fqn.getLastSegment().charAt(0))) {
	// error("Attribute name should start with a capital letter",
	// ComponentLibraryBuilderDslPackage.Literals.ABSTRACT_ATTRIBUTE_TYPE__NAME);
	// }
	// }

	// @Check
	// public void checkAttributeType(GeneralAttributeSpec attributeType) {
	// // error when Attribute don't have any parent with dataType field
	// int result = EcoreUtils.checkExistenceOfReferenceInHierarchy(
	// attributeType,
	// ComponentLibraryBuilderDslPackage.Literals.ATTRIBUTE_TYPE_DATA__SUPER_TYPE,
	// ComponentLibraryBuilderDslPackage.Literals.ATTRIBUTE_TYPE_DATA__DATA_TYPE);
	//
	// if (result == 0) {
	// error("dataType must be informed.", attributeType, null, null);
	//
	// }
	// // warning when Attribute have a parent and it is overriding dataType
	// else if (result > 1) {
	// warning("Parent datatype is being overrided.",
	// ComponentLibraryBuilderDslPackage.Literals.ATTRIBUTE_TYPE_DATA__DATA_TYPE);
	// }
	// }

	// @Check
	// public void checkAttributeType(AttributeType_Link attributeType) {
	// // error when Attribute don't have any parent with LinkType field
	// int result = EcoreUtils.checkExistenceOfReferenceInHierarchy(
	// attributeType,
	// ComponentLibraryBuilderDslPackage.Literals.ATTRIBUTE_TYPE_LINK__SUPER_TYPE,
	// ComponentLibraryBuilderDslPackage.Literals.ATTRIBUTE_TYPE_LINK__LINK_TYPE);
	//
	// if (result == 0) {
	// error("linkType must be informed.", attributeType, null, null);
	//
	// }
	// // warning when Attribute have a parent and it is overriding LinkType
	// else if (result > 1) {
	// warning("Parent linkType is being overrided.",
	// ComponentLibraryBuilderDslPackage.Literals.ATTRIBUTE_TYPE_LINK__LINK_TYPE);
	// }
	// }

	// @Check
	// public void checkAttributeType(AttributeType_Unit attributeType) {
	// // error when Attribute don't have any parent with UnitType field
	// int result = EcoreUtils.checkExistenceOfReferenceInHierarchy(
	// attributeType,
	// ComponentLibraryBuilderDslPackage.Literals.ATTRIBUTE_TYPE_UNIT__SUPER_TYPE,
	// ComponentLibraryBuilderDslPackage.Literals.ATTRIBUTE_TYPE_UNIT__UNIT_TYPE);
	//
	// if (result == 0) {
	// error("unitType must be informed.", attributeType, null, null);
	//
	// }
	// // warning when Attribute have a parent and it is overriding UnitType
	// else if (result > 1) {
	// warning("Parent unitType is being overrided.",
	// ComponentLibraryBuilderDslPackage.Literals.ATTRIBUTE_TYPE_UNIT__UNIT_TYPE);
	// }
	// }

	// @Check
	// public void checkAttributeType(AttributeType_Capability attributeType) {
	// // error when Attribute don't have any parent with CapabilityType field
	// int result = EcoreUtils.checkExistenceOfReferenceInHierarchy(
	// attributeType,
	// ComponentLibraryBuilderDslPackage.Literals.ATTRIBUTE_TYPE_CAPABILITY__SUPER_TYPE,
	// ComponentLibraryBuilderDslPackage.Literals.ATTRIBUTE_TYPE_CAPABILITY__CAPABILITY_TYPE);
	//
	// if (result == 0) {
	// error("capabilityType must be informed.", attributeType, null, null);
	//
	// }
	// // warning when Attribute have a parent and it is overriding
	// // CapabilityType
	// else if (result > 1) {
	// warning("Parent capabilityType is being overrided.",
	// ComponentLibraryBuilderDslPackage.Literals.ATTRIBUTE_TYPE_CAPABILITY__CAPABILITY_TYPE);
	// }
	// }

	// @Check
	// public void checkAttributeCapture(UnitTypeAttribute attributeCapture) {
	// if (!Character.isLowerCase(attributeCapture.getName().charAt(0))) {
	// error("Attribute name should start with a minuscule letter",
	// ComponentLibraryBuilderDslPackage.Literals.UNIT_TYPE_ATTRIBUTE__NAME);
	// }
	// if (attributeCapture.getCaption() != null
	// && attributeCapture.getCaption().isEmpty()) {
	// warning("Caption could be null but not empty.",
	// ComponentLibraryBuilderDslPackage.Literals.ATTRIBUTE_CAPTURE__CAPTION);
	// }
	//
	// if (attributeCapture.getCaption() != null
	// && !Character.isUpperCase(attributeCapture.getCaption().charAt(
	// 0))) {
	// error("Caption should start with a capital letter",
	// ComponentLibraryBuilderDslPackage.Literals.ATTRIBUTE_CAPTURE__CAPTION);
	// }
	// }



}
