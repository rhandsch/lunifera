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
package org.lunifera.metamodel.dsl.software.composition.naming;

import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.lunifera.metamodel.dsl.component.template.library.naming.ComponentTemplateLibraryDslQualifiedNameProvider;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.ConstraintLinkInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.LinkInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.SourceEndPointInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.TargetEndPointInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.UnitInstance;

import com.google.inject.Inject;

public class CompositionDslQualifiedNameProvider extends
		ComponentTemplateLibraryDslQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter converter;

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	protected QualifiedName qualifiedName(LinkInstance e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".links")).append(e.getName());
		return qualifiedNameFromConverter;
	}

	protected QualifiedName qualifiedName(ConstraintLinkInstance e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".constraintlinks")).append(e.getName());
		return qualifiedNameFromConverter;
	}

	protected QualifiedName qualifiedName(UnitInstance e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".units")).append(e.getName());
		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link SourceEndPointInstance} based on
	 * its container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(SourceEndPointInstance e) {

		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();

		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".source"));
		if (qualifiedNameFromConverter == null)
			qualifiedNameFromConverter = super.qualifiedName(e);

		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link TargetEndPointInstance} based on
	 * its container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(TargetEndPointInstance e) {

		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();

		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".target"));
		if (qualifiedNameFromConverter == null)
			qualifiedNameFromConverter = super.qualifiedName(e);

		return qualifiedNameFromConverter;
	}

}
