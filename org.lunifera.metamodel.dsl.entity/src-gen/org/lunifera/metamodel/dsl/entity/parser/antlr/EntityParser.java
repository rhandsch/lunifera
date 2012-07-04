/*
* generated by Xtext
*/
package org.lunifera.metamodel.dsl.entity.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.lunifera.metamodel.dsl.entity.services.EntityGrammarAccess;

public class EntityParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private EntityGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.lunifera.metamodel.dsl.entity.parser.antlr.internal.InternalEntityParser createParser(XtextTokenStream stream) {
		return new org.lunifera.metamodel.dsl.entity.parser.antlr.internal.InternalEntityParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "LEntityModel";
	}
	
	public EntityGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EntityGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
