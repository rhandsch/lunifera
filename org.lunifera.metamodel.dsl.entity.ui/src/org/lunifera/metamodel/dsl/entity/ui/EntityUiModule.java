/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Sources generated by Xtext
 * 
 * Contributions:
 * 		Hans Georg Glöckler - Initial implementation
 */
package org.lunifera.metamodel.dsl.entity.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.IContentProposalProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.lunifera.metamodel.dsl.entity.ui.contentassist.EntityProposalProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class EntityUiModule extends
		org.lunifera.metamodel.dsl.entity.ui.AbstractEntityUiModule {
	public EntityUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends IContentProposalProvider> bindIContentProposalProvider() {
		return EntityProposalProvider.class;
	}

	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration () {
	    return EntityHighlightingConfiguration.class;
	  }
	 public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator(){
		 return EntityHighlightingCalculator.class;
	 }
	
}
