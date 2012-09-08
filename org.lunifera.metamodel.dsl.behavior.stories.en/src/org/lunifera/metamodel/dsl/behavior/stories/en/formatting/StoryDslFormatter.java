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
package org.lunifera.metamodel.dsl.behavior.stories.en.formatting;

import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.lunifera.metamodel.dsl.behavior.stories.en.services.StoryDslGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class StoryDslFormatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {
		// It's usually a good idea to activate the following three statements.
		// They will add and preserve newlines around comments
		// c.setLinewrap(0, 1,
		// 2).before(getGrammarAccess().getSL_COMMENTRule());
		// c.setLinewrap(0, 1,
		// 2).before(getGrammarAccess().getML_COMMENTRule());
		// c.setLinewrap(0, 1, 1).after(getGrammarAccess().getML_COMMENTRule());

		StoryDslGrammarAccess gac = (StoryDslGrammarAccess) getGrammarAccess();

		//c.setAutoLinewrap(120);

		// find common keywords an specify formatting for them
		// for (Pair<Keyword, Keyword> pair : gac.findKeywordPairs("(", ")")) {
		// c.setNoSpace().after(pair.getFirst());
		// c.setNoSpace().before(pair.getSecond());
		// }

//		// story description
//		c.setIndentationIncrement().around(
//				gac.getStoryAccess().getDescriptionAssignment_0());
//
//		// Meta
//
//		c.setLinewrap().after(gac.getMetaAccess().getMetaKeyword_1());
//		
//		c.setIndentationIncrement().before(gac.getAbstractMetaElementRule());
//		c.setIndentationDecrement().after(gac.getAbstractMetaElementRule());
//		c.setLinewrap(1).after(gac.getAbstractMetaElementRule());
//		c.setLinewrap(2).after(gac.getMetaRule());
//
		for (Keyword comma : gac.findKeywords("@")) {
			c.setNoSpace().after(comma);
			}
		
//		// Scenario
//		c.setLinewrap(1, 1, 3).around(gac.getScenarioRule());
////		c.setLinewrap(1, 1, 2).after(
////				gac.getScenarioAccess().getNameAssignment_2());
//
//		// Steps
////		c.setLinewrap(0, 1, 2).between(
////				gac.getScenarioAccess().getNameAssignment_2(),
////				gac.getGivenStepRule());
//		c.setLinewrap(1, 1, 2).after(gac.getGivenStepRule());
//		c.setLinewrap(1, 1, 1).after(gac.getWhenStepRule());
//		c.setLinewrap(1, 1, 1).after(gac.getThenStepRule());
//
		c.setIndentationIncrement().before(gac.getAndStepRule());
		c.setIndentationDecrement().after(gac.getAndStepRule());
		c.setLinewrap(1, 1, 1).after(gac.getAndStepRule());
//
//		// formatting for grammar rule TestIndentation
//		//c.setIndentationIncrement().after(gac.getNarrativeRule());

	}
	
	protected TerminalRule getWSRule(){
		return (TerminalRule) GrammarUtil.findRuleForName(grammar.getGrammar(),
				"WS");
	}
}
