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
package org.lunifera.metamodel.dsl.software.composition.ui.utilities;

import java.net.URL;

import javax.inject.Inject;

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
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.AnalysisState;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ComponentTemplateLibraryDslPackage;
import org.lunifera.metamodel.dsl.component.template.library.ui.utils.ComponentTemplateLibraryDslUiUtility;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.ConstraintLinkInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.LinkInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.SourceEndPointInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.TargetEndPointInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.UnitInstance;

/**
 * @author cvgaviao
 * 
 */
@SuppressWarnings("restriction")
public class CompositeModelUiUtility extends
		ComponentTemplateLibraryDslUiUtility {

	@Inject
	private ILabelProvider labelProvider;

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	@Inject
	private IQualifiedNameConverter converter;

	/**
	 * Search for the image that represents the elements informed.
	 * 
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

	public String retrieveHoverDocumentationConstraintLinkInstance(
			ConstraintLinkInstance o, int level) {
		StringBuilder documentation = new StringBuilder();
		if (o.getDescription() != null && !o.getDescription().isEmpty()) {
			documentation.append(o.getDescription());
		} else if (o.getConstraintLinkType() != null
				&& o.getConstraintLinkType().getDescription() != null) {
			documentation.append(HTML_TAG_OPEN_ITALIC).append("super:")
					.append(HTML_TAG_CLOSE_ITALIC)
					.append(o.getConstraintLinkType().getDescription());
		}
		return documentation.toString();
	}

	public String retrieveHoverDocumentationLinkInstance(LinkInstance o,
			int level) {
		StringBuilder documentation = new StringBuilder();
		if (o.getDescription() != null && !o.getDescription().isEmpty()) {
			documentation.append(o.getDescription());
		} else if (o.getLinkType() != null
				&& o.getLinkType().getDescription() != null) {
			documentation.append(HTML_TAG_OPEN_ITALIC).append("super:")
					.append(HTML_TAG_CLOSE_ITALIC)
					.append(o.getLinkType().getDescription());
		}
		return documentation.toString();
	}

	public String retrieveHoverDocumentationSourceEndPointInstance(
			SourceEndPointInstance o, int level) {
		StringBuilder documentation = new StringBuilder();

		if (o.getUnitInstance() != null) {
			documentation
					.append(HTML_TAG_OPEN_BOLD)
					.append("UnitInstance:")
					.append(HTML_TAG_CLOSE_BOLD)
					.append(HTML_TAG_NL)
					.append(qualifiedNameProvider.getFullyQualifiedName(o
							.getUnitInstance()));
		}
		if (o.getRequiredCapabilityCapture() != null) {
			documentation
					.append(HTML_TAG_OPEN_BOLD)
					.append("Capability:")
					.append(HTML_TAG_CLOSE_BOLD)
					.append(HTML_TAG_NL)
					.append(qualifiedNameProvider.getFullyQualifiedName(o
							.getRequiredCapabilityCapture()));
		}
		return documentation.toString();
	}

	public String retrieveHoverDocumentationTargetEndPointInstance(
			TargetEndPointInstance o, int level) {
		StringBuilder documentation = new StringBuilder();
		if (o.getUnitInstance() != null) {
			documentation
					.append(HTML_TAG_OPEN_BOLD)
					.append("UnitInstance:")
					.append(HTML_TAG_CLOSE_BOLD)
					.append(HTML_TAG_NL)
					.append(qualifiedNameProvider.getFullyQualifiedName(o
							.getUnitInstance()));
		}
		if (o.getProvidedCapabilityCapture() != null) {
			documentation
					.append(HTML_TAG_NL)
					.append(HTML_TAG_OPEN_BOLD)
					.append("Capability:")
					.append(HTML_TAG_CLOSE_BOLD)
					.append(HTML_TAG_NL)
					.append(qualifiedNameProvider.getFullyQualifiedName(o
							.getProvidedCapabilityCapture()));
		}
		return documentation.toString();
	}

	public String retrieveHoverDocumentationUnitInstance(UnitInstance o,
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

	public String retrieveHoverFirstLineConstraintLinkInstance(
			ConstraintLinkInstance o, String label) {
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

	public String retrieveHoverFirstLineSourceEndPointInstance(
			SourceEndPointInstance o, String label) {
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

	public String retrieveHoverFirstLineTargetEndPointInstance(
			TargetEndPointInstance o, String label) {
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

	public String retrieveHoverFirstLineLinkInstance(LinkInstance o,
			String label) {
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

	public String retrieveHoverFirstLineUnitInstance(UnitInstance o,
			String label) {
		StringBuilder documentation = new StringBuilder();

		documentation
				.append(getImageTag(o))
				.append(" ")
				.append(HTML_TAG_OPEN_BOLD)
				.append(label)
				.append(HTML_TAG_CLOSE_BOLD)
				.append(" - ")
				.append(HTML_TAG_OPEN_ITALIC)
				.append(retrieveFirstEnumNotNoneInHierarchy(
						o,
						o.getSuperType(),
						ComponentTemplateLibraryDslPackage.Literals.UNIT_TYPE__SUPER_TYPE,
						ComponentTemplateLibraryDslPackage.Literals.UNIT_TYPE__ANALYSIS_STATE,
						AnalysisState.NONE.getLiteral()))
				.append(HTML_TAG_CLOSE_ITALIC);

		if (label != null) {
			documentation.append(" - ").append(HTML_TAG_OPEN_ITALIC)
					.append(o.eClass().getName()).append(HTML_TAG_CLOSE_ITALIC);
		}
		return documentation.toString();
	}
}
