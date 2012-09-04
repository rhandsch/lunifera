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
package org.lunifera.metamodel.dsl.component.template.library.naming;

import java.util.List;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.Strings;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ArtifactTypeGroup;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.CapabilityDataType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.CapabilityTypeGroup;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ClassifierGroup;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ComponentTemplateLibraryDslPackage;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.CompositionTypeGroup;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ConstraintLinkDataType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ConstraintLinkTypeGroup;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ConstraintTypeCapture;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ConstraintTypeGroup;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.DataType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.GeneralAttributeCapture;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.LinkDataType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.LinkTypeGroup;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.MessageDefinitionGroup;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.Multiplicity;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.Enum;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.NumberRange;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ProvidedCapabilityCapture;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.RequiredCapabilityCapture;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ResolutionTypeGroup;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.UnitDataType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.UnitTypeGroup;

import com.google.inject.Inject;

/**
 * @author cvgaviao
 * 
 */
public class ComponentTemplateLibraryDslQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter converter;
	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	/**
	 * Computes the qualified name of an {@link ArtifactTypeGroup} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(ArtifactTypeGroup e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".artifacttypes"));
		return qualifiedNameFromConverter;

	}

	/**
	 * Computes the qualified name of an {@link CapabilityDataType} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(CapabilityDataType e) {

		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();

		List<INode> nodes = NodeModelUtils
				.findNodesForFeature(
						e,
						ComponentTemplateLibraryDslPackage.Literals.CAPABILITY_DATA_TYPE__CAPABILITY_TYPE);

		if (!nodes.isEmpty()) {
			INode first = nodes.get(0);
			String name = converter.toQualifiedName(
					NodeModelUtils.getTokenText(first)).getLastSegment();
			qualifiedNameFromConverter = converter.toQualifiedName(containerQN
					.concat(".capabilitydatatypes.").concat(
							Strings.toFirstUpper(name)));
		}
		if (qualifiedNameFromConverter == null)
			qualifiedNameFromConverter = super.qualifiedName(e);

		return qualifiedNameFromConverter;

	}

	/**
	 * Computes the qualified name of an {@link CapabilityTypeGroup} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(CapabilityTypeGroup e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".capabilitytypes"));
		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link CompositionTypeGroup} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(ClassifierGroup e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".classifiers"));
		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link CompositionTypeGroup} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(CompositionTypeGroup e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".compositiontypes"));
		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link ConstraintLinkDataType} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(ConstraintLinkDataType e) {

		QualifiedName qualifiedNameFromConverter = null;

		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();

		List<INode> nodes = NodeModelUtils
				.findNodesForFeature(
						e,
						ComponentTemplateLibraryDslPackage.Literals.CONSTRAINT_LINK_DATA_TYPE__CONSTRAINT_LINK);

		if (!nodes.isEmpty()) {
			INode first = nodes.get(0);
			String name = converter.toQualifiedName(
					NodeModelUtils.getTokenText(first)).getLastSegment();
			qualifiedNameFromConverter = converter.toQualifiedName(containerQN
					.concat(".constraintlinks.").concat(
							Strings.toFirstUpper(name)));

		}
		if (qualifiedNameFromConverter == null)
			qualifiedNameFromConverter = super.qualifiedName(e);

		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link ConstraintLinkTypeGroup} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(ConstraintLinkTypeGroup e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".constraintlinktypes"));
		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link ConstraintTypeCapture} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(ConstraintTypeCapture e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();

		List<INode> nodes = NodeModelUtils
				.findNodesForFeature(
						e,
						ComponentTemplateLibraryDslPackage.Literals.CONSTRAINT_TYPE_CAPTURE__CONSTRAINT);

		if (!nodes.isEmpty()) {
			INode first = nodes.get(0);
			String name = converter.toQualifiedName(
					NodeModelUtils.getTokenText(first)).getLastSegment();
			qualifiedNameFromConverter = converter.toQualifiedName(containerQN
					.concat(".attributes.").concat(Strings.toFirstUpper(name)));
		}
		if (qualifiedNameFromConverter == null)
			qualifiedNameFromConverter = super.qualifiedName(e);

		return qualifiedNameFromConverter;

	}

	/**
	 * Computes the qualified name of an {@link ConstraintTypeGroup} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(ConstraintTypeGroup e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".constrainttypes"));
		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link DataType} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(DataType e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".datatypes.")
				.concat(Strings.toFirstUpper(e.getName())));
		return qualifiedNameFromConverter;

	}

	/**
	 * Computes the qualified name of an {@link Enum} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(Enum e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".enums.").concat(Strings.toFirstUpper(e.getName())));

		return qualifiedNameFromConverter;

	}

	/**
	 * Computes the qualified name of an {@link GeneralAttributeCapture} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(GeneralAttributeCapture e) {

		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();

		List<INode> nodes = NodeModelUtils
				.findNodesForFeature(
						e,
						ComponentTemplateLibraryDslPackage.Literals.GENERAL_ATTRIBUTE_CAPTURE__CAPTURED_ATTRIBUTE_SPEC);

		if (!nodes.isEmpty()) {
			INode first = nodes.get(0);
			String name = converter.toQualifiedName(
					NodeModelUtils.getTokenText(first)).getLastSegment();
			qualifiedNameFromConverter = converter.toQualifiedName(containerQN
					.concat(".attributes.").concat(Strings.toFirstUpper(name)));
		}
		if (qualifiedNameFromConverter == null)
			qualifiedNameFromConverter = super.qualifiedName(e);

		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link LinkDataType} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(LinkDataType e) {

		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();

		List<INode> nodes = NodeModelUtils
				.findNodesForFeature(
						e,
						ComponentTemplateLibraryDslPackage.Literals.LINK_DATA_TYPE__LINK_TYPE);

		if (!nodes.isEmpty()) {
			INode first = nodes.get(0);
			String name = converter.toQualifiedName(
					NodeModelUtils.getTokenText(first)).getLastSegment();
			qualifiedNameFromConverter = converter.toQualifiedName(containerQN
					.concat(".linkdatatypes.").concat(name));

		}
		if (qualifiedNameFromConverter == null)
			qualifiedNameFromConverter = super.qualifiedName(e);

		return qualifiedNameFromConverter;

	}

	/**
	 * Computes the qualified name of an {@link LinkTypeGroup} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(LinkTypeGroup e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".linktypes"));
		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link MessageDefinitionGroup} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(MessageDefinitionGroup e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".messagedefinitions"));

		return qualifiedNameFromConverter;
	}

	// CLASSIFIERS

	/**
	 * Computes the qualified name of an {@link Multiplicity} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(Multiplicity e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".multiplicities.").concat(e.getName()));

		return qualifiedNameFromConverter;

	}

	/**
	 * Computes the qualified name of an {@link NumberRange} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(NumberRange e) {

		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".ranges.").concat(e.getName()));

		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link ProvidedCapabilityCapture} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(ProvidedCapabilityCapture e) {

		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();

		List<INode> nodes = NodeModelUtils
				.findNodesForFeature(
						e,
						ComponentTemplateLibraryDslPackage.Literals.ABSTRACT_CAPABILITY_CAPTURE__CAPABILITY);

		if (!nodes.isEmpty()) {
			INode first = nodes.get(0);
			String name = converter.toQualifiedName(
					NodeModelUtils.getTokenText(first)).getLastSegment();
			qualifiedNameFromConverter = converter.toQualifiedName(containerQN
					.concat(".provides.").concat(name));
		}
		if (qualifiedNameFromConverter == null)
			qualifiedNameFromConverter = super.qualifiedName(e);

		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link RequiredCapabilityCapture} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(RequiredCapabilityCapture e) {

		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();

		List<INode> nodes = NodeModelUtils
				.findNodesForFeature(
						e,
						ComponentTemplateLibraryDslPackage.Literals.ABSTRACT_CAPABILITY_CAPTURE__CAPABILITY);

		if (!nodes.isEmpty()) {
			INode first = nodes.get(0);
			String name = converter.toQualifiedName(
					NodeModelUtils.getTokenText(first)).getLastSegment();
			qualifiedNameFromConverter = converter.toQualifiedName(containerQN
					.concat(".requires.").concat(name));

		}
		if (qualifiedNameFromConverter == null)
			qualifiedNameFromConverter = super.qualifiedName(e);

		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link ResolutionTypeGroup} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(ResolutionTypeGroup e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".resolutiontypes"));
		return qualifiedNameFromConverter;
	}


	/**
	 * Computes the qualified name of an {@link UnitDataType} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(UnitDataType e) {

		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();

		List<INode> nodes = NodeModelUtils
				.findNodesForFeature(
						e,
						ComponentTemplateLibraryDslPackage.Literals.UNIT_DATA_TYPE__UNIT_TYPE);

		if (!nodes.isEmpty()) {
			INode first = nodes.get(0);
			String name = converter.toQualifiedName(
					NodeModelUtils.getTokenText(first)).getLastSegment();
			qualifiedNameFromConverter = converter.toQualifiedName(containerQN
					.concat(".unitdatatypes.").concat(name));
		}
		if (qualifiedNameFromConverter == null)
			qualifiedNameFromConverter = super.qualifiedName(e);

		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link UnitTypeGroup} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(UnitTypeGroup e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".unittypes"));
		return qualifiedNameFromConverter;
	}
}
