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
package org.lunifera.metamodel.dsl.behavior.stories.en.ui.syntaxcoloring;

import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.AbstractMetaElement;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.AsA;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.IWantTo;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.InOrderTo;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementComponent;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementDefault;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementEntity;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementProcess;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.Scenario;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.StepDescription;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.Story;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.StoryDslPackage;
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.Table;

public class StoryDslSemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
			return;

		// INode root = resource.getParseResult().getRootNode();
		// BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
		// while (it.hasNext()) {
		// INode node = it.next();
		// String text = node.getText();
		// EObject semanticElement = node.getSemanticElement();
		// EObject grammarElement = node.getGrammarElement();
		// int offset = node.getOffset();
		// int lenght = node.getLength();

		TreeIterator<EObject> tree = resource.getAllContents();
		while (tree.hasNext()) {
			EObject eObject = (EObject) tree.next();

			if (eObject instanceof StepDescription) {
				INode node = NodeModelUtils.getNode(eObject);
				int offset = node.getOffset();
				int lenght = node.getLength();
				acceptor.addPosition(offset, lenght,
						StoryDslHighlightingConfiguration.STEP_DEFAULT);

			} else

			if (eObject instanceof Scenario) {
				List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject,
						StoryDslPackage.Literals.SCENARIO__NAME);
				int offset = nodes.get(0).getOffset();
				int lenght = nodes.get(0).getLength();
				acceptor.addPosition(offset, lenght,
						StoryDslHighlightingConfiguration.SCENARIO_DEFAULT);
			} else

			if (eObject instanceof MetaElementDefault) {
				List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject,
						StoryDslPackage.Literals.META_ELEMENT_DEFAULT__NAME);
				for (INode iNode : nodes) {

					int offset = iNode.getOffset();
					int lenght = iNode.getLength();
					acceptor.addPosition(offset, lenght,
							StoryDslHighlightingConfiguration.META_ELEMENT);
				}
				nodes = NodeModelUtils.findNodesForFeature(eObject,
						StoryDslPackage.Literals.META_ELEMENT_DEFAULT__VALUE);
				for (INode iNode : nodes) {

					int offset = iNode.getOffset();
					int lenght = iNode.getLength();
					acceptor.addPosition(
							offset,
							lenght,
							StoryDslHighlightingConfiguration.META_ELEMENT_VALUE);
				}
			} else

			if (eObject instanceof MetaElementComponent) {
				List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject,
						StoryDslPackage.Literals.META_ELEMENT_DEFAULT__NAME);
				for (INode iNode : nodes) {

					int offset = iNode.getOffset();
					int lenght = iNode.getLength();
					acceptor.addPosition(
							offset,
							lenght,
							StoryDslHighlightingConfiguration.META_ELEMENT_VALUE);
				}
			} else if (eObject instanceof MetaElementEntity) {
				List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject,
						StoryDslPackage.Literals.META_ELEMENT_DEFAULT__NAME);
				for (INode iNode : nodes) {

					int offset = iNode.getOffset();
					int lenght = iNode.getLength();
					acceptor.addPosition(
							offset,
							lenght,
							StoryDslHighlightingConfiguration.META_ELEMENT_VALUE);
				}
			} else

			if (eObject instanceof MetaElementProcess) {
				List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject,
						StoryDslPackage.Literals.META_ELEMENT_PROCESS__PROCESS);
				for (INode iNode : nodes) {

					int offset = iNode.getOffset();
					int lenght = iNode.getLength();
					acceptor.addPosition(
							offset,
							lenght,
							StoryDslHighlightingConfiguration.META_ELEMENT_VALUE);
				}
			} else

			if (eObject instanceof InOrderTo) {
				List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject,
						StoryDslPackage.Literals.IN_ORDER_TO__NAME);
				for (INode iNode : nodes) {
					int offset = iNode.getOffset();
					int lenght = iNode.getLength();
					acceptor.addPosition(offset, lenght,
							StoryDslHighlightingConfiguration.NARRATIVE_DEFAULT);
				}
			} else

			if (eObject instanceof IWantTo) {
				List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject,
						StoryDslPackage.Literals.IWANT_TO__NAME);
				for (INode iNode : nodes) {
					int offset = iNode.getOffset();
					int lenght = iNode.getLength();
					acceptor.addPosition(offset, lenght,
							StoryDslHighlightingConfiguration.NARRATIVE_DEFAULT);
				}
			} else

			if (eObject instanceof AsA) {
				List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject,
						StoryDslPackage.Literals.AS_A__ROLES);
				for (INode iNode : nodes) {

					int offset = iNode.getOffset();
					int lenght = iNode.getLength();
					acceptor.addPosition(
							offset,
							lenght,
							StoryDslHighlightingConfiguration.META_ELEMENT_VALUE);
				}
			} else

			if (eObject instanceof Table) {
				List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject,
						StoryDslPackage.Literals.TABLE__ROWS);
				int i = 0;
				for (INode iNode : nodes) {
					int offset = iNode.getOffset();
					int lenght = iNode.getLength();
					if (i == 0) {
						acceptor.addPosition(offset, lenght,
								StoryDslHighlightingConfiguration.TABLE_HEADER);
					} else {
						EObject row = iNode.getSemanticElement();
						List<INode> cells = NodeModelUtils.findNodesForFeature(
								row, StoryDslPackage.Literals.TABLE_ROW__CELLS);
						for (INode iCell : cells) {
							offset = iCell.getOffset();
							lenght = iCell.getLength();
							acceptor.addPosition(
									offset,
									lenght,
									StoryDslHighlightingConfiguration.TABLE_CELL);
						}
					}
					i++;
				}
			} else

			if (eObject instanceof Story) {
				List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject,
						StoryDslPackage.Literals.STORY__DESCRIPTION);
				if (nodes != null && !nodes.isEmpty()) {
					int offset = nodes.get(0).getOffset();
					int lenght = nodes.get(0).getLength();
					acceptor.addPosition(offset, lenght,
							StoryDslHighlightingConfiguration.STORY_DEFAULT);
				}
			}
		}

	}

}
