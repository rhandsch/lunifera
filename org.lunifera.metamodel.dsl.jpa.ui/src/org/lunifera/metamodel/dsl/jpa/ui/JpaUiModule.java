/*
 * generated by Xtext
 */
package org.lunifera.metamodel.dsl.jpa.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.lunifera.metamodel.dsl.jpa.ui.labeling.JpaHighlightingConfiguration;
import org.lunifera.metamodel.dsl.jpa.ui.labeling.JpaSemanticHighlightingCalculator;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used within the IDE.
 */
public class JpaUiModule extends
		org.lunifera.metamodel.dsl.jpa.ui.AbstractJpaUiModule {
	public JpaUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
	}

	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return JpaHighlightingConfiguration.class;
	}

	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return JpaSemanticHighlightingCalculator.class;
	}
}
