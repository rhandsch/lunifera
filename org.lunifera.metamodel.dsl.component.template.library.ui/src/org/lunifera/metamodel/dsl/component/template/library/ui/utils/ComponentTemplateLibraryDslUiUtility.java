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
package org.lunifera.metamodel.dsl.component.template.library.ui.utils;

import java.net.URL;

import javax.inject.Inject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.AbstractCapabilityCapture;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.AnalysisState;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.CapabilityType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ComponentTemplateLibraryDslPackage;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ConstraintLinkType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ConstraintType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.GeneralAttributeCapture;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.GeneralAttributeSpec;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.LinkType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ProvidedCapabilityCapture;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.RequiredCapabilityCapture;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.UnitType;

/**
 * @author cvgaviao
 * 
 */
@SuppressWarnings("restriction")
public class ComponentTemplateLibraryDslUiUtility {

	public final static String HTML_TAG_OPEN_BOLD = "<b>";
	public final static String HTML_TAG_CLOSE_BOLD = "</b>";

	public final static String HTML_TAG_NL = "<br>";
	public final static String HTML_TAG_OPEN_ITALIC = "<i>";
	public final static String HTML_TAG_CLOSE_ITALIC = "</i>";
	public final static String HTML_TAG_ULIST_BLOCK_OPEN = "<UL>";
	public final static String HTML_TAG_ULIST_BLOCK_CLOSE = "</UL>";
	public final static String HTML_TAG_ULIST_OPEN_HEADER = "<LH>";
	public final static String HTML_TAG_ULIST_CLOSE_HEADER = "</LH>";
	public final static String HTML_TAG_ULIST_ITEM_OPEN = "<LI>";
	public final static String HTML_TAG_ULIST_ITEM_CLOSE = "</LI>";
	public final static String HTML_TAG_TABLE_BLOCK_OPEN = "<Table>";
	public final static String HTML_TAG_TABLE_BLOCK_CLOSE = "</Table>";
	public final static String HTML_TAG_TABLE_OPEN_HEADER = "<TH>";
	public final static String HTML_TAG_TABLE_CLOSE_HEADER = "</TH>";
	public final static String HTML_TAG_TABLE_ROW_OPEN = "<TR>";
	public final static String HTML_TAG_TABLE_ROW_CLOSE = "</TR>";
	public final static String HTML_TAG_TABLE_COL_OPEN = "<TD>";
	public final static String HTML_TAG_TABLE_COL_CLOSE = "</TD>";
	public final static String HTML_TAG_IMG_OPEN = "<img src=";
	public final static String HTML_TAG_IMG_CLOSE = "/>";

	@Inject
	private ILabelProvider labelProvider;

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	@Inject
	private IQualifiedNameConverter converter;






	private void fillCapabilityTypeHierarchyTree(CapabilityType capabilityType,
			StringBuilder documentation, int level) {
		if (capabilityType != null) {
			documentation.append(HTML_TAG_ULIST_BLOCK_OPEN);
			documentation.append(HTML_TAG_ULIST_ITEM_OPEN)
					.append(HTML_TAG_OPEN_ITALIC)
					.append(capabilityType.getName())
					.append(HTML_TAG_CLOSE_ITALIC);

			if (capabilityType.getSuperType() != null) {
				fillCapabilityTypeHierarchyTree(capabilityType.getSuperType(),
						documentation, ++level);
				documentation.append(HTML_TAG_ULIST_ITEM_CLOSE);
				documentation.append(HTML_TAG_ULIST_BLOCK_CLOSE);
			} else {
				documentation.append(HTML_TAG_ULIST_ITEM_CLOSE);
				documentation.append(HTML_TAG_ULIST_BLOCK_CLOSE);
			}

		}
	}

	/**
	 * Search for the image that represents the elements informed.
	 * @param object
	 * @return
	 */
	public String getImageTag(final EObject object) {
		final String[] result = new String[1];
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				Image image = labelProvider.getImage(object);
				result[0] = getImageTagLink(ImageDescriptor
						.createFromImage(image));
			}
		});
		return result[0];
	}

	protected String getImageTagLink(ImageDescriptor imageDescriptor) {
		URL url = getURL(imageDescriptor);
		if (url != null)
			return "<image src='" + url.toExternalForm() + "'/>";
		return "";
	}


	protected URL getURL(ImageDescriptor descriptor) {
		return JavaPlugin.getDefault().getImagesOnFSRegistry()
				.getImageURL(descriptor);
	}

	/**
	 * 
	 * @param object
	 * @param parentReference
	 * @param attributeToCheck
	 * @param enumNoneValue
	 * @return
	 */
	public String retrieveFirstEnumNotNoneInHierarchy(final EObject context,
			final EObject object, EReference parentReference,
			EAttribute attributeToCheck, String enumNoneValue) {
		String resultString = "";
		EObject resolved;

		if (object.eIsProxy()) {
			resolved = EcoreUtil2.resolve(object, object);
		} else {
			resolved = object;
		}

		// verify the existence of reference in the current object
		Object value = resolved.eGet(attributeToCheck);
		if (value != null && !value.toString().equals(enumNoneValue)) {
			return value.toString();
		}

		EObject parent = (EObject) resolved.eGet(parentReference);
		if (parent != null && !parent.equals(resolved)) {
			if (parent.eIsProxy()) {
				parent = EcoreUtil2.resolve(parent, object);
			}
			return retrieveFirstEnumNotNoneInHierarchy(context, parent,
					parentReference, attributeToCheck, enumNoneValue);
		}
		return resultString;
	}

	public String retrieveHoverDocumentationAbstractCapabilityCapture(
			AbstractCapabilityCapture o, int level) {
		StringBuilder documentation = new StringBuilder();
		if (o.getDescription() != null && !o.getDescription().isEmpty()) {
			documentation.append(o.getDescription()).append(HTML_TAG_NL);
		}
		if (o.getCapability() != null) {
			documentation
					.append(HTML_TAG_OPEN_BOLD)
					.append("Capability:")
					.append(HTML_TAG_CLOSE_BOLD)
					.append(HTML_TAG_NL)
					.append(qualifiedNameProvider.getFullyQualifiedName(o
							.getCapability()));
		}
		return documentation.toString();
	}

	public String retrieveHoverDocumentationCapabilityType(CapabilityType o,
			int level) {
		StringBuilder documentation = new StringBuilder();
		if (o.getDescription() != null && !o.getDescription().isEmpty()) {
			documentation.append(o.getDescription());
		} else if (o.getSuperType() != null
				&& o.getSuperType().getDescription() != null) {
			documentation.append(HTML_TAG_OPEN_ITALIC).append("super: ")
					.append(HTML_TAG_CLOSE_ITALIC)
					.append(o.getSuperType().getDescription());
		}
		documentation.append(HTML_TAG_OPEN_BOLD).append(HTML_TAG_NL)
				.append("Hierarchy:").append(HTML_TAG_CLOSE_BOLD);

		fillCapabilityTypeHierarchyTree(o, documentation, level);

		// list from parents:
		retrieveHtmlWithCapabilityAttributesFromHierarchy(o, documentation);

		return documentation.toString();
	}

	public String retrieveHoverDocumentationConstraintLinkType(
			ConstraintLinkType o, int level) {
		StringBuilder documentation = new StringBuilder();
		if (o.getDescription() != null && !o.getDescription().isEmpty()) {
			documentation.append(o.getDescription());
		} else if (o.getSuperType() != null
				&& o.getSuperType().getDescription() != null) {
			documentation.append(HTML_TAG_OPEN_ITALIC).append("super: ")
					.append(HTML_TAG_CLOSE_ITALIC)
					.append(o.getSuperType().getDescription());
		}
		return documentation.toString();
	}

	public String retrieveHoverDocumentationConstraintType(ConstraintType o,
			int level) {
		StringBuilder documentation = new StringBuilder();
		if (o.getDescription() != null && !o.getDescription().isEmpty()) {
			documentation.append(o.getDescription());
		} else if (o.getSuperType() != null
				&& o.getSuperType().getDescription() != null) {
			documentation.append(HTML_TAG_OPEN_ITALIC).append("super: ")
					.append(HTML_TAG_CLOSE_ITALIC)
					.append(o.getSuperType().getDescription());
		}

		return documentation.toString();
	}

	public String retrieveHoverDocumentationLinkType(LinkType o, int level) {
		StringBuilder documentation = new StringBuilder();
		if (o.getDescription() != null && !o.getDescription().isEmpty()) {
			documentation.append(o.getDescription());
		} else if (o.getSuperType() != null
				&& o.getSuperType().getDescription() != null) {
			documentation.append(HTML_TAG_OPEN_ITALIC).append("super: ")
					.append(HTML_TAG_CLOSE_ITALIC)
					.append(o.getSuperType().getDescription());
		}
		return documentation.toString();
	}

	/**
	 * Get list of capabilities of one unitType.
	 * 
	 * @param unitType
	 * @param richText
	 * @param recursive
	 *            the recursive search parameter can allow for hierarchy
	 *            completion.
	 * @return
	 */
	public String retrieveHoverDocumentationUnitType(UnitType unitType,
			int level) {
		StringBuilder documentation = new StringBuilder();
		if (unitType.getDescription() != null
				&& !unitType.getDescription().isEmpty())
			documentation.append(unitType.getDescription()).append(HTML_TAG_NL);
		documentation.append(HTML_TAG_OPEN_BOLD).append("Hierarchy:")
				.append(HTML_TAG_CLOSE_BOLD);

		retrieveUnitHierarchyTree(unitType, documentation, level);

		// list from parents:
		retrieveHtmlWithProvidedCapabilitiesFromHierarchy(unitType,
				documentation);

		// list from parents:
		retrieveHtmlWithRequiredCapabilitiesFromHierarchy(unitType,
				documentation);

		return documentation.toString();
	}

	public String retrieveHoverFirstLineCapabilityType(CapabilityType o,
			String label) {
		StringBuilder documentation = new StringBuilder();
		documentation.append(getImageTag(o)).append(" ")
				.append(HTML_TAG_OPEN_BOLD).append(HTML_TAG_OPEN_ITALIC)
				.append(label).append(HTML_TAG_CLOSE_ITALIC)
				.append(HTML_TAG_CLOSE_BOLD).append(" :: ");
		if (label != null) {
			documentation.append(HTML_TAG_OPEN_ITALIC)
					.append(o.eClass().getName()).append(HTML_TAG_CLOSE_ITALIC);
		}
		return documentation.toString();
	}

	public String retrieveHoverFirstLineConstraintLinkType(
			ConstraintLinkType o, String label) {
		StringBuilder documentation = new StringBuilder();
		documentation.append(getImageTag(o)).append(" ")
				.append(HTML_TAG_OPEN_BOLD).append(HTML_TAG_OPEN_ITALIC)
				.append(label).append(HTML_TAG_CLOSE_ITALIC)
				.append(HTML_TAG_CLOSE_BOLD).append(" :: ");

		if (label != null) {
			documentation.append(HTML_TAG_OPEN_ITALIC)
					.append(o.eClass().getName()).append(HTML_TAG_CLOSE_ITALIC);
		}
		return documentation.toString();
	}

	public String retrieveHoverFirstLineConstraintType(ConstraintType o,
			String label) {
		StringBuilder documentation = new StringBuilder();
		documentation.append(getImageTag(o)).append(" ")
				.append(HTML_TAG_OPEN_BOLD).append(HTML_TAG_OPEN_ITALIC)
				.append(label).append(HTML_TAG_CLOSE_ITALIC)
				.append(HTML_TAG_CLOSE_BOLD).append(" :: ");

		if (label != null) {
			documentation.append(HTML_TAG_OPEN_ITALIC)
					.append(o.eClass().getName()).append(HTML_TAG_CLOSE_ITALIC);
		}
		return documentation.toString();
	}

	public String retrieveHoverFirstLineGeneralAttributeCapture(
			GeneralAttributeCapture o, String label) {
		StringBuilder documentation = new StringBuilder();

		if (label != null) {
			documentation.append(getImageTag(o)).append(" ")
					.append(HTML_TAG_OPEN_BOLD).append(HTML_TAG_OPEN_ITALIC)
					.append(label).append(HTML_TAG_CLOSE_ITALIC)
					.append(HTML_TAG_CLOSE_BOLD);

			documentation.append(" :: ").append(HTML_TAG_OPEN_ITALIC)
					.append(o.eClass().getName()).append(HTML_TAG_CLOSE_ITALIC);
		}
		return documentation.toString();
	}

	public String retrieveHoverFirstLineGeneralAttributeSpec(
			GeneralAttributeSpec o, String label) {
		StringBuilder documentation = new StringBuilder();

		if (label != null) {
			documentation.append(getImageTag(o)).append(" ")
					.append(HTML_TAG_OPEN_BOLD).append(HTML_TAG_OPEN_ITALIC)
					.append(label).append(HTML_TAG_CLOSE_ITALIC)
					.append(HTML_TAG_CLOSE_BOLD);

			documentation.append(" :: ").append(HTML_TAG_OPEN_ITALIC)
					.append(o.eClass().getName()).append(HTML_TAG_CLOSE_ITALIC);
		}
		return documentation.toString();
	}

	public String retrieveHoverFirstLineLinkType(LinkType o, String label) {
		StringBuilder documentation = new StringBuilder();
		documentation
				.append(getImageTag(o))
				.append(" ")
				.append(HTML_TAG_OPEN_BOLD)
				.append(HTML_TAG_OPEN_ITALIC)
				.append(label)
				.append(HTML_TAG_CLOSE_ITALIC)
				.append(HTML_TAG_CLOSE_BOLD)
				.append(" :: ")
				.append(HTML_TAG_OPEN_ITALIC)
				.append(retrieveFirstEnumNotNoneInHierarchy(
						o.eContainer(),
						o,
						ComponentTemplateLibraryDslPackage.Literals.LINK_TYPE__SUPER_TYPE,
						ComponentTemplateLibraryDslPackage.Literals.ABSTRACT_LINK__ANALYSIS_STATE,
						AnalysisState.NONE.getLiteral()))
				.append(HTML_TAG_CLOSE_ITALIC).append(" - ");
		;

		if (label != null) {
			documentation.append(HTML_TAG_OPEN_ITALIC)
					.append(o.eClass().getName()).append(HTML_TAG_CLOSE_ITALIC);
		}
		return documentation.toString();
	}

	public String retrieveHoverFirstLineProvidedCapability(
			ProvidedCapabilityCapture o, String label) {
		StringBuilder documentation = new StringBuilder();

		if (label != null) {
			documentation
					// .append(getImageTag(o))
					// .append(" ")
					.append(HTML_TAG_OPEN_BOLD).append(HTML_TAG_OPEN_ITALIC)
					.append(label).append(HTML_TAG_CLOSE_ITALIC)
					.append(HTML_TAG_CLOSE_BOLD);

			documentation.append(" :: ").append(HTML_TAG_OPEN_ITALIC)
					.append(o.eClass().getName()).append(HTML_TAG_CLOSE_ITALIC);
		}
		return documentation.toString();
	}

	public String retrieveHoverFirstLineRequiredCapability(
			RequiredCapabilityCapture o, String label) {
		StringBuilder documentation = new StringBuilder();

		if (label != null) {
			documentation.append(getImageTag(o)).append(" ")
					.append(HTML_TAG_OPEN_BOLD).append(HTML_TAG_OPEN_ITALIC)
					.append(label).append(HTML_TAG_CLOSE_ITALIC)
					.append(HTML_TAG_CLOSE_BOLD);

			documentation.append(" :: ").append(HTML_TAG_OPEN_ITALIC)
					.append(o.eClass().getName()).append(HTML_TAG_CLOSE_ITALIC);
		}
		return documentation.toString();
	}


	/**
	 * This method is used to create the first line in the UnitType hover.
	 * 
	 * @param o
	 * @param label
	 * @param image
	 * @return
	 */
	public String retrieveHoverFirstLineUnitType(UnitType o, String label) {
		StringBuilder documentation = new StringBuilder();
		documentation
				.append(getImageTag(o))
				.append(" ")
				.append(HTML_TAG_OPEN_BOLD)
				.append(label)
				.append(HTML_TAG_CLOSE_BOLD)
				.append(" :: ")
				.append(HTML_TAG_OPEN_ITALIC)
				.append(retrieveFirstEnumNotNoneInHierarchy(
						o.eContainer(),
						o,
						ComponentTemplateLibraryDslPackage.Literals.UNIT_TYPE__SUPER_TYPE,
						ComponentTemplateLibraryDslPackage.Literals.UNIT_TYPE__ANALYSIS_STATE,
						AnalysisState.NONE.getLiteral()))
				.append(HTML_TAG_CLOSE_ITALIC).append(" - ");

		if (label != null) {
			documentation.append(HTML_TAG_OPEN_ITALIC)
					.append(o.eClass().getName()).append(HTML_TAG_CLOSE_ITALIC);
		}
		return documentation.toString();
	}

	private void retrieveHtmlWithCapabilityAttributesFromHierarchy(
			CapabilityType capabilityType, StringBuilder documentation) {
		if (capabilityType != null) {
			EList<GeneralAttributeSpec> attr = capabilityType.getAttributes();
			if (!attr.isEmpty()) {
				documentation
						.append(HTML_TAG_OPEN_BOLD)
						.append("Attributes from " + HTML_TAG_OPEN_ITALIC
								+ capabilityType.getName()
								+ HTML_TAG_CLOSE_ITALIC)
						.append(HTML_TAG_CLOSE_BOLD);
				documentation.append(HTML_TAG_ULIST_BLOCK_OPEN);
				for (GeneralAttributeSpec spec : attr) {

					String atttype = qualifiedNameProvider
							.getFullyQualifiedName(spec.getType()).toString();
					documentation.append(HTML_TAG_ULIST_ITEM_OPEN)
							.append(spec.getName()).append(" :: ")
							.append(atttype).append(HTML_TAG_ULIST_ITEM_CLOSE);

				}
				documentation.append(HTML_TAG_ULIST_BLOCK_CLOSE);
			}
		}
		if (capabilityType.getSuperType() != null) {
			retrieveHtmlWithCapabilityAttributesFromHierarchy(
					capabilityType.getSuperType(), documentation);
		}
	}

	private void retrieveHtmlWithProvidedCapabilitiesFromHierarchy(
			UnitType unitType, StringBuilder documentation) {

		if (unitType != null) {
			EList<ProvidedCapabilityCapture> provided = unitType
					.getProvidedCapabilities();
			if (!provided.isEmpty()) {
				documentation
						.append(HTML_TAG_OPEN_BOLD)
						.append("Provided Capabilities from "
								+ HTML_TAG_OPEN_ITALIC + unitType.getName()
								+ HTML_TAG_CLOSE_ITALIC)
						.append(HTML_TAG_CLOSE_BOLD)
						.append(HTML_TAG_ULIST_BLOCK_OPEN);

				for (ProvidedCapabilityCapture providedCapabilityCapture : provided) {
					CapabilityType capabilityType = providedCapabilityCapture
							.getCapability();

					documentation.append(HTML_TAG_ULIST_ITEM_OPEN)
							.append(capabilityType.getName())
							.append(HTML_TAG_ULIST_ITEM_CLOSE);

				}
				documentation.append(HTML_TAG_ULIST_BLOCK_CLOSE);
			}
		}
		if (unitType.getSuperType() != null) {
			retrieveHtmlWithProvidedCapabilitiesFromHierarchy(
					unitType.getSuperType(), documentation);
		}

	}

	private void retrieveHtmlWithRequiredCapabilitiesFromHierarchy(
			UnitType unitType, StringBuilder documentation) {
		if (unitType != null) {
			EList<RequiredCapabilityCapture> required = unitType
					.getRequiredCapabilities();
			if (!required.isEmpty()) {
				documentation
						.append(HTML_TAG_OPEN_BOLD)
						.append("Required Capabilities from "
								+ HTML_TAG_OPEN_ITALIC + unitType.getName()
								+ HTML_TAG_CLOSE_ITALIC)
						.append(HTML_TAG_CLOSE_BOLD);
				documentation.append(HTML_TAG_ULIST_BLOCK_OPEN);
				for (RequiredCapabilityCapture requiredCapabilityCapture : required) {
					CapabilityType capabilityType = requiredCapabilityCapture
							.getCapability();

					documentation.append(HTML_TAG_ULIST_ITEM_OPEN)
							.append(capabilityType.getName())
							.append(HTML_TAG_ULIST_ITEM_CLOSE);

				}
				documentation.append(HTML_TAG_ULIST_BLOCK_CLOSE);
			}
		}
		if (unitType.getSuperType() != null) {
			retrieveHtmlWithRequiredCapabilitiesFromHierarchy(
					unitType.getSuperType(), documentation);
		}
	}

	private void retrieveUnitHierarchyTree(UnitType unitType,
			StringBuilder documentation, int level) {
		if (unitType != null) {
			documentation.append(HTML_TAG_ULIST_BLOCK_OPEN);
			documentation.append(HTML_TAG_ULIST_ITEM_OPEN)
					.append(HTML_TAG_OPEN_ITALIC).append(unitType.getName())
					.append(HTML_TAG_CLOSE_ITALIC);

			if (unitType.getSuperType() != null) {
				retrieveUnitHierarchyTree(unitType.getSuperType(),
						documentation, ++level);
				documentation.append(HTML_TAG_ULIST_ITEM_CLOSE);
				documentation.append(HTML_TAG_ULIST_BLOCK_CLOSE);
			} else {
				documentation.append(HTML_TAG_ULIST_ITEM_CLOSE);
				documentation.append(HTML_TAG_ULIST_BLOCK_CLOSE);
			}

		}
	}
}
