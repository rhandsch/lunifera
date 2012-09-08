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
package org.lunifera.metamodel.dsl.behavior.stories.en.naming;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.Strings;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.AbstractStep;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.AbstractStepDescriptionPiece;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.AndStep;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.ComponentSelection;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.EntitySelection;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.Examples;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.GivenStories;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.Meta;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementComponent;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementEntity;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementProcess;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementStepClass;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.Narrative;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.NormalStepDescriptionPiece;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.ProcessSelection;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.StepDescription;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.StoryDslPackage;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.util.StoryDslSwitch;

import com.google.inject.Inject;

/**
 * @author cvgaviao
 * 
 */
public class StoryDslQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter converter;
	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	/**
	 * Computes the qualified name of an {@link Meta} based on its container's
	 * qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(Meta e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".meta"));
		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link Narrative} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(Narrative e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".narrative"));
		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link Narrative} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(Examples e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".examples"));
		return qualifiedNameFromConverter;
	}

	/**
	 * Computes the qualified name of an {@link GivenStories} based on its
	 * container's qualified name.
	 * 
	 * @param e
	 * @return
	 */
	protected QualifiedName qualifiedName(GivenStories e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".givenstories"));
		return qualifiedNameFromConverter;
	}

	protected QualifiedName qualifiedName(AbstractStep e) {
		QualifiedName qualifiedNameFromConverter = converter
				.toQualifiedName(getStepDescriptionFull(e.getStepDescription()));
		return qualifiedNameFromConverter;
	}

	protected QualifiedName qualifiedName(AndStep e) {
		QualifiedName qualifiedNameFromConverter = converter
				.toQualifiedName(getStepDescriptionFull(e.getStepDescription()));
		return qualifiedNameFromConverter;
	}

	protected QualifiedName qualifiedName(MetaElementProcess e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();

		List<INode> nodes = NodeModelUtils.findNodesForFeature(e,
				StoryDslPackage.Literals.META_ELEMENT_PROCESS__PROCESS);

		if (!nodes.isEmpty()) {
			INode first = nodes.get(0);
			String name = converter.toQualifiedName(
					NodeModelUtils.getTokenText(first)).getLastSegment();
			qualifiedNameFromConverter = converter.toQualifiedName(containerQN
					.concat(".process.").concat(Strings.toFirstUpper(name)));
		}
		if (qualifiedNameFromConverter == null)
			qualifiedNameFromConverter = super.qualifiedName(e);

		return qualifiedNameFromConverter;

	}

	protected QualifiedName qualifiedName(MetaElementComponent e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();

		List<INode> nodes = NodeModelUtils.findNodesForFeature(e,
				StoryDslPackage.Literals.META_ELEMENT_COMPONENT__COMPONENT);

		if (!nodes.isEmpty()) {
			INode first = nodes.get(0);
			String name = converter.toQualifiedName(
					NodeModelUtils.getTokenText(first)).getLastSegment();
			qualifiedNameFromConverter = converter.toQualifiedName(containerQN
					.concat(".component.").concat(Strings.toFirstUpper(name)));
		}
		if (qualifiedNameFromConverter == null)
			qualifiedNameFromConverter = super.qualifiedName(e);

		return qualifiedNameFromConverter;

	}

	protected QualifiedName qualifiedName(MetaElementEntity e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();

		List<INode> nodes = NodeModelUtils.findNodesForFeature(e,
				StoryDslPackage.Literals.META_ELEMENT_ENTITY__ENTITY);

		if (!nodes.isEmpty()) {
			INode first = nodes.get(0);
			String name = converter.toQualifiedName(
					NodeModelUtils.getTokenText(first)).getLastSegment();
			qualifiedNameFromConverter = converter.toQualifiedName(containerQN
					.concat(".entity.").concat(Strings.toFirstUpper(name)));
		}
		if (qualifiedNameFromConverter == null)
			qualifiedNameFromConverter = super.qualifiedName(e);

		return qualifiedNameFromConverter;

	}

	protected QualifiedName qualifiedName(MetaElementStepClass e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();

		List<INode> nodes = NodeModelUtils.findNodesForFeature(e,
				StoryDslPackage.Literals.META_ELEMENT_STEP_CLASS__STEP_CLASS);

		if (!nodes.isEmpty()) {
			INode first = nodes.get(0);
			String name = converter.toQualifiedName(
					NodeModelUtils.getTokenText(first)).getLastSegment();
			qualifiedNameFromConverter = converter.toQualifiedName(containerQN
					.concat(".stepclass.").concat(Strings.toFirstUpper(name)));
		}
		if (qualifiedNameFromConverter == null)
			qualifiedNameFromConverter = super.qualifiedName(e);

		return qualifiedNameFromConverter;

	}

	private String getStepDescriptionFull(StepDescription stepDescription) {
		StringBuilder name = new StringBuilder();

		EList<AbstractStepDescriptionPiece> pieces = stepDescription
				.getPieces();
		StoryDslSwitch<String> switcha = new StoryDslSwitch<String>() {
			@Override
			public String caseProcessSelection(ProcessSelection object) {
				return object.getProcess().getName();
			}

			@Override
			public String caseEntitySelection(EntitySelection object) {
				return object.getEntity().getName();
			}

			@Override
			public String caseComponentSelection(ComponentSelection object) {
				return object.getUnit().getName();
			}

			@Override
			public String caseNormalStepDescriptionPiece(
					NormalStepDescriptionPiece object) {
				return object.getWord();
			}
		};
		for (AbstractStepDescriptionPiece piece : pieces) {
			name.append(switcha.doSwitch(piece)).append(" ");
		}

		return name.toString();
	}

}
