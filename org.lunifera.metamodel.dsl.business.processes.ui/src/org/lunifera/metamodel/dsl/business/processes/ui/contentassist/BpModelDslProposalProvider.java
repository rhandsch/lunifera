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
package org.lunifera.metamodel.dsl.business.processes.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher;
import org.eclipse.xtext.util.Strings;
import org.lunifera.metamodel.dsl.business.processes.ui.contentassist.AbstractBpModelDslProposalProvider;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant
 */
public class BpModelDslProposalProvider extends
		AbstractBpModelDslProposalProvider {

	public void complete_Fqn(EObject model, RuleCall ruleCall,
			final ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		if (doCreateIdProposals()) {
			PrefixMatcher newMatcher = new PrefixMatcher() {
				@Override
				public boolean isCandidateMatchingPrefix(String name,
						String prefix) {
					String strippedName = name;
					if (name.startsWith("^") && !prefix.startsWith("^")) {
						strippedName = name.substring(1);
					}
					return context.getMatcher().isCandidateMatchingPrefix(
							strippedName, prefix);
				}
			};
			ContentAssistContext myContext = context.copy()
					.setMatcher(newMatcher).toContext();
			String feature = getAssignedFeature(ruleCall);
			String proposalText = feature != null ? feature : Strings
					.toFirstUpper(ruleCall.getRule().getName().toLowerCase());
			String displayText = proposalText;
			if (feature != null)
				displayText = proposalText + " - "
						+ ruleCall.getRule().getName();
			proposalText = getValueConverter().toString(proposalText,
					ruleCall.getRule().getName());
			ICompletionProposal proposal = createCompletionProposal(
					proposalText, displayText, null, myContext);
			if (proposal instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal configurable = (ConfigurableCompletionProposal) proposal;
				configurable.setSelectionStart(configurable
						.getReplacementOffset());
				configurable.setSelectionLength(proposalText.length());
				configurable.setAutoInsertable(false);
				configurable.setSimpleLinkedMode(myContext.getViewer(), '\t',
						' ');
			}
			acceptor.accept(proposal);
		}
	}

	private String getAssignedFeature(RuleCall call) {
		Assignment ass = GrammarUtil.containingAssignment(call);
		if (ass != null) {
			String result = ass.getFeature();
			if (result.equals(result.toLowerCase()))
				result = Strings.toFirstUpper(result);
			return result;
		}
		return null;
	}
}
