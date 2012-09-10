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

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class StoryDslHighlightingConfiguration extends
		DefaultHighlightingConfiguration implements IHighlightingConfiguration {

	public static final String META_KEYWORD = "meta_keyword";
	public static final String META_ELEMENT = "meta_element";
	public static final String META_ELEMENT_VALUE = "meta_element_value";
	public static final String EXAMPLE_TABLE_DEFAULT = "example_table_default";
	public static final String EXAMPLE_TABLE_KEYWORD = "example_table_keyword";
	public static final String TABLE_SEPARATOR = "table_separator";
	public static final String TABLE_HEADER = "table_header";
	public static final String TABLE_CELL = "table_row";
	public static final String SCENARIO_DEFAULT = "scenario_default";
	public static final String STORY_DEFAULT = "story_default";
	public static final String SCENARIO_KEYWORD = "scenario_keyword";
	public static final String GIVEN_STORIES_KEYWORD = "given_stories_keyword";
	public static final String STEP_DEFAULT = "step_default";
	public static final String STEP_IMPLEMENTED = "step_implemented";
	public static final String STEP_KEYWORD = "step_keyword";
	public static final String STEP_PARAMETER = "step_parameter";
	public static final String STEP_PARAMETER_VALUE = "step_parameter_value";
	public static final String NARRATIVE_DEFAULT = "narrative_default";
	public static final String NARRATIVE_KEYWORD = "narrative_keyword";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {

		super.configure(acceptor);

		acceptor.acceptDefaultHighlighting(META_ELEMENT_VALUE, "Meta Element Value",
				metaElementValueTextStyle());
		acceptor.acceptDefaultHighlighting(META_ELEMENT, "Meta Element",
				metaElementTextStyle());

		acceptor.acceptDefaultHighlighting(META_KEYWORD, "Meta Keyword",
				metaKeywordTextStyle());

		acceptor.acceptDefaultHighlighting(NARRATIVE_DEFAULT, "Narrative",
				narrativeDefaultTextStyle());

		acceptor.acceptDefaultHighlighting(NARRATIVE_KEYWORD,
				"Narrative Keyword", narrativeKeywordTextStyle());

		acceptor.acceptDefaultHighlighting(SCENARIO_DEFAULT, "Scenario",
				scenarioDefaultTextStyle());

		acceptor.acceptDefaultHighlighting(STORY_DEFAULT, "Story",
				storyDefaultTextStyle());

		acceptor.acceptDefaultHighlighting(SCENARIO_KEYWORD,
				"Scenario Keyword", scenarioKeywordTextStyle());

		acceptor.acceptDefaultHighlighting(STEP_DEFAULT, "Step",
				stepDefaultTextStyle());

		acceptor.acceptDefaultHighlighting(STEP_IMPLEMENTED,
				"Step Implemented", stepImplementedTextStyle());

		acceptor.acceptDefaultHighlighting(STEP_KEYWORD, "Step Keyword",
				stepKeywordTextStyle());

		acceptor.acceptDefaultHighlighting(STEP_PARAMETER, "Step Parameter",
				stepParameterTextStyle());

		acceptor.acceptDefaultHighlighting(STEP_PARAMETER_VALUE,
				"Step Parameter Value", stepParameterValueTextStyle());

		acceptor.acceptDefaultHighlighting(EXAMPLE_TABLE_DEFAULT,
				"Example Table", exampleTableDefaultTextStyle());

		acceptor.acceptDefaultHighlighting(EXAMPLE_TABLE_KEYWORD,
				"Example Table Keyword", exampleTableKeywordTextStyle());

		acceptor.acceptDefaultHighlighting(TABLE_SEPARATOR, "Table Separator",
				tableSeparatorTextStyle());

		acceptor.acceptDefaultHighlighting(TABLE_CELL, "Table Cell",
				tableCellTextStyle());

		acceptor.acceptDefaultHighlighting(TABLE_HEADER, "Table Header",
				tableHeaderTextStyle());

		acceptor.acceptDefaultHighlighting(GIVEN_STORIES_KEYWORD,
				"Given Stories Keyword", givenStoriesKeywordTextStyle());
	}

	public TextStyle tableCellTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(34, 64, 39));
		return textStyle;
	}

	public TextStyle tableHeaderTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(5, 5, 5));
		textStyle.setBackgroundColor(new RGB(248, 240, 200));
		textStyle.setStyle(SWT.BOLD | SWT.ITALIC);
		return textStyle;
	}

	public TextStyle exampleTableDefaultTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(252, 237, 185));
		return textStyle;
	}

	public TextStyle exampleTableKeywordTextStyle() {
		TextStyle textStyle = keywordTextStyle().copy();
		textStyle.setColor(new RGB(122, 158, 193));
		return textStyle;
	}

	public TextStyle tableSeparatorTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}

	public TextStyle givenStoriesKeywordTextStyle() {
		TextStyle textStyle = keywordTextStyle().copy();
		// textStyle.setColor(new RGB(127, 0, 85));
		// textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle metaElementTextStyle() {
		TextStyle textStyle = keywordTextStyle().copy();
		return textStyle;
	}

	public TextStyle metaElementValueTextStyle() {
		TextStyle textStyle = keywordTextStyle().copy();
		textStyle.setColor(new RGB(214, 176, 201));
		return textStyle;
	}
	
	public TextStyle metaKeywordTextStyle() {
		TextStyle textStyle = keywordTextStyle().copy();
		textStyle.setColor(new RGB(60, 116, 193));
		return textStyle;
	}

	public TextStyle narrativeDefaultTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(60, 116, 150));
		return textStyle;
	}

	public TextStyle narrativeKeywordTextStyle() {
		TextStyle textStyle = keywordTextStyle().copy();
		textStyle.setColor(new RGB(60, 116, 193));
		return textStyle;
	}

	public TextStyle scenarioDefaultTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(223, 160, 111));
		textStyle.setStyle(SWT.BOLD | SWT.ITALIC);
		return textStyle;
	}

	public TextStyle storyDefaultTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(131, 103, 152));
		textStyle.setStyle(SWT.BOLD | SWT.ITALIC);
		return textStyle;
	}

	public TextStyle scenarioKeywordTextStyle() {
		TextStyle textStyle = keywordTextStyle().copy();
		textStyle.setColor(new RGB(60, 116, 193));
		return textStyle;
	}

	public TextStyle stepDefaultTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		return textStyle;
	}

	public TextStyle stepImplementedTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 85));
		return textStyle;
	}

	public TextStyle stepKeywordTextStyle() {
		TextStyle textStyle = keywordTextStyle().copy();
		textStyle.setColor(new RGB(110, 173, 120));
		return textStyle;
	}

	public TextStyle stepParameterTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(125, 125, 125));
		return textStyle;
	}

	public TextStyle stepParameterValueTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 85));
		return textStyle;
	}
}
