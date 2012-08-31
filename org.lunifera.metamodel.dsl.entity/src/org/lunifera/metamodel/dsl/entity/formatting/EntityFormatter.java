/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Sources generated by Xtext.
 * 
 * IP: Used sourcecode from org.eclipse.emf.ecore.xcore.formatting.XcoreFormatting
 * 
 * Contributors:
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.dsl.entity.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.xbase.formatting.XbaseFormatter;
import org.lunifera.metamodel.dsl.entity.services.EntityGrammarAccess;

import com.google.inject.Inject;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
@SuppressWarnings("restriction")
public class EntityFormatter extends AbstractDeclarativeFormatter {

	@Inject
	private XbaseFormatter xbaseFormatter;

	@Override
	protected void configureFormatting(FormattingConfig c) {
		configure(c, (EntityGrammarAccess) getGrammarAccess());
	}

	public void configure(FormattingConfig c, EntityGrammarAccess ga) {
		xbaseFormatter.configure(c, ga.getXbaseWithAnnotationsGrammarAccess()
				.getXbaseGrammarAccess());

		EntityGrammarAccess f = (EntityGrammarAccess) getGrammarAccess();

		c.setAutoLinewrap(120);

		configureLCompilerType(c, f.getLGenSettingsAccess());
		configureLPackage(c, f.getLPackageAccess());
		configureLEntity(c, f.getLEntityAccess());
		configureLAnnotationDef(c, f.getLAnnotationDefAccess());
		configureLEntityMember(c, f.getEntityMemberAccess());

		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).after(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(1, 1, 1).after(f.getML_COMMENTRule());
	}

	public void configureLCompilerType(FormattingConfig config,
			EntityGrammarAccess.LGenSettingsElements ele) {

		// linewrap
		config.setLinewrap(1, 1, 2).around(ele.getRule());
		config.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_2());
		// config.setLinewrap().around(ele.getCompilerTypeAssignment_3_1_1());
		config.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_4());

		// indentation
		config.setIndentationIncrement().after(
				ele.getLeftCurlyBracketKeyword_2());
		config.setIndentationDecrement().before(
				ele.getRightCurlyBracketKeyword_4());
	}

	public void configureLPackage(FormattingConfig config,
			EntityGrammarAccess.LPackageElements ele) {

		// linewrap
		config.setLinewrap(1, 1, 2).around(ele.getRule());
		config.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3());
		config.setLinewrap().around(ele.getImportsAssignment_4());
		config.setLinewrap(1, 1, 2).around(ele.getCompilersAssignment_5());
		config.setLinewrap(1, 1, 2).around(ele.getTypesAssignment_6());
		config.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_7());

		// indentation
		config.setIndentationIncrement().after(
				ele.getLeftCurlyBracketKeyword_3());
		config.setIndentationDecrement().before(
				ele.getRightCurlyBracketKeyword_7());
	}

	protected void configureLEntity(FormattingConfig c,
			EntityGrammarAccess.LEntityElements ele) {
		// linewrap
		c.setLinewrap(2).around(ele.getRule());
		c.setLinewrap().around(ele.getAnnotationsAssignment_0());
		c.setLinewrap().after(ele.getLeftCurlyBracketKeyword_5());
		c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_7());

		// indentation
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_5());
		c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_7());
	}

	public void configureLEntityMember(FormattingConfig config,
			EntityGrammarAccess.EntityMemberElements elements) {
		config.setLinewrap().around(elements.getRule());
		config.setLinewrap().around(elements.getAnnotationsAssignment_1());
		config.setLinewrap(1).around(elements.getRule());
	}

	protected void configureLAnnotationDef(FormattingConfig c,
			EntityGrammarAccess.LAnnotationDefElements ele) {
		c.setLinewrap(1).after(ele.getRule());
	}
}
