/*
* generated by Xtext
*/
package org.lunifera.metamodel.dsl.jpa.parser.antlr;

import java.io.InputStream;

import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class JpaAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/lunifera/metamodel/dsl/jpa/parser/antlr/internal/InternalJpa.tokens");
	}
}