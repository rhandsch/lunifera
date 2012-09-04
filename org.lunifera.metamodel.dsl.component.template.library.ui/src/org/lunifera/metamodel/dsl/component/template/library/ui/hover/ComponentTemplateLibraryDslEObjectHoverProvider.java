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
package org.lunifera.metamodel.dsl.component.template.library.ui.hover;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.CapabilityType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ConstraintLinkType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ConstraintType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.GeneralAttributeCapture;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.GeneralAttributeSpec;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.LinkType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ProvidedCapabilityCapture;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.RequiredCapabilityCapture;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.UnitType;
import org.lunifera.metamodel.dsl.component.template.library.ui.utils.ComponentTemplateLibraryDslUiUtility;

public class ComponentTemplateLibraryDslEObjectHoverProvider extends
		DefaultEObjectHoverProvider {

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	@Inject
	private ComponentTemplateLibraryDslUiUtility ecoreUtils;

	@Override
	protected String getFirstLine(EObject o) {

		String label = qualifiedNameProvider.getFullyQualifiedName(o)
				.toString();

		if (o instanceof UnitType) {

			return ecoreUtils.retrieveHoverFirstLineUnitType((UnitType) o,
					label);
		}
		if (o instanceof CapabilityType) {

			return ecoreUtils.retrieveHoverFirstLineCapabilityType(
					(CapabilityType) o, label);
		}
		if (o instanceof LinkType) {

			return ecoreUtils.retrieveHoverFirstLineLinkType((LinkType) o,
					label);
		}
		if (o instanceof ConstraintLinkType) {
			return ecoreUtils.retrieveHoverFirstLineConstraintLinkType(
					(ConstraintLinkType) o, label);
		}
		if (o instanceof ConstraintType) {
			return ecoreUtils.retrieveHoverFirstLineConstraintType(
					(ConstraintType) o, label);
		}
		if (o instanceof GeneralAttributeSpec)
			return ecoreUtils.retrieveHoverFirstLineGeneralAttributeSpec(
					(GeneralAttributeSpec) o, label);
		if (o instanceof GeneralAttributeCapture)
			return ecoreUtils.retrieveHoverFirstLineGeneralAttributeCapture(
					(GeneralAttributeCapture) o, label);
		if (o instanceof RequiredCapabilityCapture)
			return ecoreUtils.retrieveHoverFirstLineRequiredCapability(
					(RequiredCapabilityCapture) o, label);
		if (o instanceof ProvidedCapabilityCapture)
			return ecoreUtils.retrieveHoverFirstLineProvidedCapability(
					(ProvidedCapabilityCapture) o, label);

		return super.getFirstLine(o);
	}
}
