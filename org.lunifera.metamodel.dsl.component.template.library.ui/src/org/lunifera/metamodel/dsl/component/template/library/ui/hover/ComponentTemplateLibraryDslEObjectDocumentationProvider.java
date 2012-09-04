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
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.AbstractCapabilityCapture;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.CapabilityType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ConstraintLinkType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ConstraintType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.LinkType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.UnitType;
import org.lunifera.metamodel.dsl.component.template.library.ui.utils.ComponentTemplateLibraryDslUiUtility;

public class ComponentTemplateLibraryDslEObjectDocumentationProvider extends
		MultiLineCommentDocumentationProvider {

	@Inject
	private ComponentTemplateLibraryDslUiUtility ecoreUtils;

	public String getDocumentation(EObject o) {
		if (o instanceof UnitType) {
			String formatedText = ecoreUtils
					.retrieveHoverDocumentationUnitType((UnitType) o, 0);
			return formatedText;
		}
		if (o instanceof LinkType) {
			return ecoreUtils.retrieveHoverDocumentationLinkType((LinkType) o,
					0);
		}

		if (o instanceof ConstraintLinkType) {
			return ecoreUtils.retrieveHoverDocumentationConstraintLinkType(
					(ConstraintLinkType) o, 0);
		}

		if (o instanceof ConstraintType) {
			return ecoreUtils.retrieveHoverDocumentationConstraintType(
					(ConstraintType) o, 0);
		}
		if (o instanceof CapabilityType) {
			return ecoreUtils.retrieveHoverDocumentationCapabilityType(
					(CapabilityType) o, 0);
		}
		if (o instanceof AbstractCapabilityCapture) {
			return ecoreUtils.retrieveHoverDocumentationAbstractCapabilityCapture(
					(AbstractCapabilityCapture) o, 0);
		}
		return super.getDocumentation(o);
	}

}
