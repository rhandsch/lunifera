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
package org.lunifera.metamodel.dsl.software.composition.ui.hover;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.lunifera.metamodel.dsl.component.template.library.ui.hover.ComponentTemplateLibraryDslEObjectDocumentationProvider;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.ConstraintLinkInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.LinkInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.SourceEndPointInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.TargetEndPointInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.UnitInstance;
import org.lunifera.metamodel.dsl.software.composition.ui.utilities.CompositeModelUiUtility;

public class CompositeModelDslEObjectDocumentationProvider extends
		ComponentTemplateLibraryDslEObjectDocumentationProvider {

	@Inject
	private CompositeModelUiUtility ecoreUtils;

	public String getDocumentation(EObject o) {
		if (o instanceof TargetEndPointInstance) {
			return ecoreUtils.retrieveHoverDocumentationTargetEndPointInstance(
					(TargetEndPointInstance) o, 0);
		}
		if (o instanceof SourceEndPointInstance) {
			return ecoreUtils.retrieveHoverDocumentationSourceEndPointInstance(
					(SourceEndPointInstance) o, 0);
		}
		if (o instanceof UnitInstance) {
			return ecoreUtils.retrieveHoverDocumentationUnitInstance(
					(UnitInstance) o, 0);
		}
		if (o instanceof LinkInstance) {
			return ecoreUtils.retrieveHoverDocumentationLinkInstance(
					(LinkInstance) o, 0);
		}

		if (o instanceof ConstraintLinkInstance) {
			return ecoreUtils.retrieveHoverDocumentationConstraintLinkInstance(
					(ConstraintLinkInstance) o, 0);
		}
		return super.getDocumentation(o);
	}
}
