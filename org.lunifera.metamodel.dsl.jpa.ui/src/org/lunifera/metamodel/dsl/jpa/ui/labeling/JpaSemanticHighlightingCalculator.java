// copied parts of the code from org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator
package org.lunifera.metamodel.dsl.jpa.ui.labeling;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaAnnotation;
import org.lunifera.metamodel.dsl.jpa.jpa.JpaPackage;

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
					if (firstLeafNode != null)
						highlightNode(firstLeafNode,
								JpaHighlightingConfiguration.JPA_ANNOTATION_ID,
								acceptor);
				}
				highlightObjectAtFeature(acceptor, element,
						JpaPackage.Literals.JPA_ENTITY_ANNOTATION__NAME,
						JpaHighlightingConfiguration.JPA_ANNOTATION_ID);
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
					JpaHighlightingConfiguration.JPA_ANNOTATION_ID);
		}
	}

	private boolean isJpaAnnotation(EObject object) {
		return object instanceof JpaAnnotation;
	}

	/**
	 * Highlights an object at the position of the given
	 * {@link EStructuralFeature}
	 */
	protected void highlightObjectAtFeature(
			IHighlightedPositionAcceptor acceptor, EObject object,
			EStructuralFeature feature, String id) {
		List<INode> childs = NodeModelUtils
				.findNodesForFeature(object, feature);
		if (childs.size() > 0)
			highlightNode(childs.get(0), id, acceptor);
	}
}