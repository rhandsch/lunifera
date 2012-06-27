// copied parts of the code from org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator
package org.lunifera.metamodel.dsl.jpa.ui.labeling;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaAnnotation;

public class JpaSemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		for (Iterator<EObject> contents = resource.getAllContents(); contents
				.hasNext();) {
			EObject element = contents.next();
			if (isJpaAnnotation(element)) {
				ICompositeNode annotationNode = NodeModelUtils
						.findActualNodeFor(element);
				if (annotationNode != null) {
					ILeafNode firstLeafNode = NodeModelUtils
							.findLeafNodeAtOffset(annotationNode,
									annotationNode.getOffset());
					for (INode node : annotationNode.getLeafNodes()) {
						EObject semanticObject = NodeModelUtils
								.findActualSemanticObjectFor(node);

						if (node.getText().equals("ManyToMany")) {
							highlightNode(
									node,
									JpaHighlightingConfiguration.ANNOTATION_SPECIAL_KEYWORDS,
									acceptor);
						} else if (node.getText().equals("ManyToOne")) {
							highlightNode(
									node,
									JpaHighlightingConfiguration.ANNOTATION_SPECIAL_KEYWORDS,
									acceptor);
						} else if (node == firstLeafNode) {
							highlightNode(firstLeafNode,
									JpaHighlightingConfiguration.ANNOTATION_ID,
									acceptor);
						} else if (semanticObject instanceof JvmParameterizedTypeReference) {
							highlightNode(
									node,
									JpaHighlightingConfiguration.ANNOTATION_PARAMS_VALUE,
									acceptor);
						} else if (node.getGrammarElement() instanceof RuleCall) {
							RuleCall ruleCall = (RuleCall) node
									.getGrammarElement();
							if ("ID".equals(ruleCall.getRule().getName())) {
								highlightNode(
										node,
										JpaHighlightingConfiguration.ANNOTATION_PARAMS_VALUE,
										acceptor);
							}
						} else {
							highlightNode(
									node,
									JpaHighlightingConfiguration.ANNOTATION_PARAMS_ID,
									acceptor);
						}
					}
				}
			}
		}
	}

	/**
	 * Highlights the non-hidden parts of {@code node} with the style that is
	 * associated with {@code id}.
	 */
	protected void highlightNode(INode node, String id,
			IHighlightedPositionAcceptor acceptor) {
		if (node == null)
			return;
		if (node instanceof ILeafNode) {
			acceptor.addPosition(node.getOffset(), node.getLength(), id);
		} else {
			for (ILeafNode leaf : node.getLeafNodes()) {
				if (!leaf.isHidden()) {
					acceptor.addPosition(leaf.getOffset(), leaf.getLength(), id);
				}
			}
		}
	}

	protected void highlightAsAnnotation(EObject element,
			EStructuralFeature feature, IHighlightedPositionAcceptor acceptor) {
		for (INode node : NodeModelUtils.findNodesForFeature(element, feature)) {
			acceptor.addPosition(node.getOffset(), node.getLength(),
					JpaHighlightingConfiguration.ANNOTATION_ID);
		}
	}

	private boolean isJpaAnnotation(EObject object) {
		return object instanceof JpaAnnotation;
	}

}