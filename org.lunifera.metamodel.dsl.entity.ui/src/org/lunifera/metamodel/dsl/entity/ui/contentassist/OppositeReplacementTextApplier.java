/**
 * Copyright (c) 2011-2012 Eclipse contributors and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.metamodel.dsl.entity.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ReplacementTextApplier;
import org.lunifera.metamodel.dsl.entity.lentity.LContains;
import org.lunifera.metamodel.dsl.entity.lentity.LRefers;

public class OppositeReplacementTextApplier extends ReplacementTextApplier {
	protected LContains xReference;

	protected ITextViewer viewer;

	protected IScope scope;

	protected IQualifiedNameConverter qualifiedNameConverter;

	protected IValueConverter<String> qualifiedNameValueConverter;

	public OppositeReplacementTextApplier(LContains xReference,
			ITextViewer viewer, IScope scope,
			IQualifiedNameConverter qualifiedNameConverter,
			IValueConverter<String> qualifiedNameValueConverter) {
		this.xReference = xReference;
		this.viewer = viewer;
		this.scope = scope;
		this.qualifiedNameConverter = qualifiedNameConverter;
		this.qualifiedNameValueConverter = qualifiedNameValueConverter;
	}

	@Override
	public void apply(IDocument document,
			ConfigurableCompletionProposal proposal)
			throws BadLocationException {
		String replacementString = getActualReplacementString(proposal);
		proposal.setCursorPosition(replacementString.length());
		int replacementOffset = proposal.getReplacementOffset();

		IEObjectDescription oppositeDescription = scope
				.getSingleElement(qualifiedNameConverter
						.toQualifiedName(qualifiedNameValueConverter.toValue(
								replacementString, null)));
		EObject opposite = oppositeDescription.getEObjectOrProxy();
		if (opposite instanceof JvmField
				&& opposite.eResource() == xReference.eResource()) {
			// LRefers oppositeXReference = (LRefers) ;
			// if (oppositeXReference.getOpposite() == null) {
			// List<INode> nodes = NodeModelUtils.findNodesForFeature(
			// oppositeXReference,
			// XcorePackage.Literals.XNAMED_ELEMENT__NAME);
			// if (!nodes.isEmpty()) {
			// INode node = nodes.get(nodes.size() - 1);
			// int offset = node.getOffset();
			// String oppositeReplacement = " opposite "
			// + qualifiedNameValueConverter.toString(xReference
			// .getName());
			// if (replacementOffset > offset) {
			// document.replace(replacementOffset,
			// proposal.getReplacementLength(),
			// replacementString);
			// document.replace(offset + node.getLength(), 0,
			// oppositeReplacement);
			// } else {
			// document.replace(offset + node.getLength(), 0,
			// oppositeReplacement);
			// document.replace(replacementOffset,
			// proposal.getReplacementLength(),
			// replacementString);
			// }
			// return;
			// }
			// }
		}
		document.replace(replacementOffset, proposal.getReplacementLength(),
				replacementString);
	}

	@Override
	public String getActualReplacementString(
			ConfigurableCompletionProposal proposal) {
		return proposal.getReplacementString();
	}
}
