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
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.lunifera.metamodel.dsl.component.template.library.ui.hover.ComponentTemplateLibraryDslEObjectHoverProvider;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.ConstraintLinkInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.LinkInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.SourceEndPointInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.TargetEndPointInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.UnitInstance;
import org.lunifera.metamodel.dsl.software.composition.ui.utilities.CompositeModelUiUtility;

public class CompositeModelDslEObjectHoverProvider extends
		ComponentTemplateLibraryDslEObjectHoverProvider {

	@Inject
	private CompositeModelUiUtility ecoreUtils;

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;


@Override
	protected String getFirstLine(EObject o) {
	
	String label = qualifiedNameProvider.getFullyQualifiedName(o)
			.toString();
	
	if (o instanceof UnitInstance)
		return ecoreUtils.retrieveHoverFirstLineUnitInstance(
				(UnitInstance) o, label);
	if (o instanceof ConstraintLinkInstance)
		return ecoreUtils.retrieveHoverFirstLineConstraintLinkInstance(
				(ConstraintLinkInstance) o, label);
	if (o instanceof LinkInstance)
		return ecoreUtils.retrieveHoverFirstLineLinkInstance(
				(LinkInstance) o, label);
	if (o instanceof SourceEndPointInstance)
		return ecoreUtils.retrieveHoverFirstLineSourceEndPointInstance(
				(SourceEndPointInstance) o, label);
	if (o instanceof TargetEndPointInstance)
		return ecoreUtils.retrieveHoverFirstLineTargetEndPointInstance(
				(TargetEndPointInstance) o, label);
	
		// TODO Auto-generated method stub
		return super.getFirstLine(o);
	}	
}
