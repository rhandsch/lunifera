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

import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
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
		StoryDslGrammarAccess gac = (StoryDslGrammarAccess) getGrammarAccess();

		c.setLinewrap(0, 1, 2).before(gac.getSL_COMMENTRule());

		// no spaces tokens
		for (Keyword at : gac.findKeywords("@")) {
			c.setNoSpace().after(at);
		}

		// // Meta
		c.setLinewrap(2, 2, 3).before(gac.getMetaRule());
		c.setLinewrap(1, 1, 1).after(gac.getMetaAccess().getMetaKeyword_1());

		for (Assignment metaElement : gac.findAssignments(gac
				.getAbstractMetaElementRule())) {
			c.setLinewrap(1, 1, 2).before(metaElement);
			c.setIndentationIncrement().before(metaElement);
			c.setIndentationDecrement().after(metaElement);
		}

		// Narrative
		c.setLinewrap(2, 2, 3).before(gac.getNarrativeRule());
		c.setLinewrap(1, 1, 2).after(
				gac.getNarrativeAccess().getNarrativeKeyword_0());

		c.setLinewrap(1, 1, 1).before(gac.getInOrderToRule());
		c.setIndentationIncrement().before(gac.getInOrderToRule());
		c.setIndentationDecrement().after(gac.getInOrderToRule());
		c.setLinewrap(1, 1, 1).before(gac.getAsARule());
		c.setIndentationIncrement().before(gac.getAsARule());
		c.setIndentationDecrement().after(gac.getAsARule());
		c.setLinewrap(1, 1, 1).before(gac.getIWantToRule());
		c.setIndentationIncrement().before(gac.getIWantToRule());
		c.setIndentationDecrement().after(gac.getIWantToRule());

		// // Scenario
		c.setLinewrap(2, 2, 3).before(
				gac.getScenarioAccess().getScenarioKeyword_1());
		c.setLinewrap(1, 2, 3).after(
				gac.getScenarioAccess().getNameAssignment_2());

		// Steps
		c.setLinewrap(1, 1, 2).before(gac.getAbstractStepRule());
		c.setIndentationIncrement().before(gac.getAbstractStepRule());
		c.setIndentationDecrement().after(gac.getAbstractStepRule());
		c.setLinewrap(1, 1, 2).before(gac.getAndStepRule());
		c.setIndentationIncrement().before(gac.getAndStepRule());
		c.setIndentationDecrement().after(gac.getAndStepRule());

		// Example table
		c.setLinewrap(2, 2, 2).before(gac.getExamplesRule());
		c.setIndentationIncrement().before(gac.getExamplesAccess().getExamplesKeyword_0());
		c.setLinewrap(1, 1, 2).after(gac.getExamplesAccess().getExamplesKeyword_0());
		c.setIndentationDecrement().after(gac.getExamplesAccess().getExamplesKeyword_0());
		c.setLinewrap(1, 1, 2).after(gac.getExamplesRule());

		// Table

		c.setLinewrap(1, 1, 1).bounds(gac.getTableRowAccess().getVerticalLineKeyword_1_2(), gac.getTableRowAccess().getVerticalLineKeyword_1_0());
		c.setIndentationIncrement().before(gac.getTableAccess().getGroup());
		c.setNoSpace().around(gac.getTableCellRule());
		c.setIndentationDecrement().after(gac.getTableRule());	
	}
}
