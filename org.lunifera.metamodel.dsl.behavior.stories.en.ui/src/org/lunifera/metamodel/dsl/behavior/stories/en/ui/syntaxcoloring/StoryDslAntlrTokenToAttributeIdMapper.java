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

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class StoryDslAntlrTokenToAttributeIdMapper extends
		DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		String superstr = super.calculateId(tokenName, tokenType);
		if ("'processMeta'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.META_ELEMENT;
		} else if ("'stepClassMeta'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.META_ELEMENT;
		} else if ("'unitMeta'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.META_ELEMENT;
		} else if ("'Given'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.STEP_KEYWORD;
		} else if ("'Examples:'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.EXAMPLE_TABLE_KEYWORD;
		} else if ("'Scenario:'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.SCENARIO_KEYWORD;
		} else if ("'When'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.STEP_KEYWORD;
		} else if ("'I want to'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.NARRATIVE_DEFAULT;
		} else if ("'unit'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.META_ELEMENT_VALUE;
		} else if ("'process'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.META_ELEMENT_VALUE;
		} else if ("'entity'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.META_ELEMENT_VALUE;
		} else if ("'And'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.STEP_KEYWORD;
		} else if ("'Meta:'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.META_KEYWORD;
		} else if ("'Narrative:'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.NARRATIVE_KEYWORD;
		} else if ("'Then'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.STEP_KEYWORD;
		} else if ("'In order to'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.NARRATIVE_DEFAULT;
		} else if ("'As a'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.NARRATIVE_DEFAULT;
		} else if ("'@'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.META_ELEMENT;
		} else if ("'entityMeta'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.META_ELEMENT;
		} else if ("RULE_PLACEHOLDER".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.STEP_PARAMETER_VALUE;
		} else if ("'|'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.TABLE_SEPARATOR;
		} else
		// RULE_NEWLINE RULE_ANY_OTHER ','
		// RULE_WS
		if ("'GivenStories:'".equals(tokenName)) {
			superstr = StoryDslHighlightingConfiguration.GIVEN_STORIES_KEYWORD;
		}
		return superstr;
	}
}
