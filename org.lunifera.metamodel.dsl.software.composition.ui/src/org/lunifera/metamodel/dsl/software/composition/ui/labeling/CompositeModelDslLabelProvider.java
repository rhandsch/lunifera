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
/*
 * generated by Xtext
 */
package org.lunifera.metamodel.dsl.software.composition.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.GeneralAttributeSpec;
import org.lunifera.metamodel.dsl.component.template.library.ui.labeling.ComponentTemplateLibraryDslLabelProvider;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.CompositeModelInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.ConstraintLinkInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.ElementInstanceGroup;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.GeneralAttributeCapture;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.LinkInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.SourceEndPointInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.TargetEndPointInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.UnitInstance;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class CompositeModelDslLabelProvider extends ComponentTemplateLibraryDslLabelProvider {

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;


	@Inject
	public CompositeModelDslLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	/*
	 * //Labels and icons can be computed like this:
	 */

	String image(CompositeModelInstance ele) {
		return "UnitGroup_16.png";
	}

	public String image(ConstraintLinkInstance ele) {
		return image(ele.getConstraintLinkType());
	}

	public String image(ElementInstanceGroup ele) {
		return "UnitGroup_16.png";
	}

	public String image(LinkInstance ele) {
		return image(ele.getLinkType());
	}
	public String image(SourceEndPointInstance ele) {
		return "FromEndPoint_16.png";
	}

	public String image(TargetEndPointInstance ele) {
		return "ToEndPoint_16.png";
	}

	public String image(UnitInstance ele) {
		return image(ele.getSuperType());
	}

	String text(CompositeModelInstance ele) {
		return "Composition Model";
	}


	public String text(ElementInstanceGroup ele) {
		return " Units";
	}
	

	public String text(GeneralAttributeSpec ele) {

		QualifiedName qualifiedName = qualifiedNameProvider
				.getFullyQualifiedName(ele);
		return qualifiedName.skipFirst(qualifiedName.getSegmentCount() - 2)
				.toString();
	}

	public String text(GeneralAttributeCapture ele) {
		
		QualifiedName qualifiedName = qualifiedNameProvider
				.getFullyQualifiedName(ele);
		return qualifiedName.skipFirst(qualifiedName.getSegmentCount() - 2)
				.toString();
	}
	
	
	public String text(LinkInstance ele) {
		QualifiedName qualifiedName = qualifiedNameProvider
				.getFullyQualifiedName(ele);
		return qualifiedName.toString();
	}

	public String text(SourceEndPointInstance ele) {
		QualifiedName qualifiedName = qualifiedNameProvider
				.getFullyQualifiedName(ele);
		return qualifiedName.skipFirst(qualifiedName.getSegmentCount() - 2)
				.toString();
	}

	public String text(TargetEndPointInstance ele) {

		QualifiedName qualifiedName = qualifiedNameProvider
				.getFullyQualifiedName(ele);
		return qualifiedName.skipFirst(qualifiedName.getSegmentCount() - 2)
				.toString();
	}

}
