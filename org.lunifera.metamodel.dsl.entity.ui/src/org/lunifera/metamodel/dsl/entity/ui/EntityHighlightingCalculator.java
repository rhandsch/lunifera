/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributions:
 * 		Hans Georg Glöckler - Initial implementation
 */
package org.lunifera.metamodel.dsl.entity.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.lunifera.metamodel.entity.entitymodel.LEntity;
import org.lunifera.metamodel.entity.entitymodel.LGenSettings;
import org.lunifera.metamodel.entity.entitymodel.LProperty;
import org.lunifera.metamodel.entity.entitymodel.LReference;

public class EntityHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
			return;

		INode root = resource.getParseResult().getRootNode();
		BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
		while (it.hasNext()) {
			INode node = it.next();
			String text = node.getText();
			EObject semanticElement = node.getSemanticElement();
	
			if (semanticElement instanceof LProperty) {
				if ("id".equals(text) || "transient".equals(text)
						|| "version".equals(text)) {
					if (node.getNextSibling() == null) {
						if (!"transient".equals(text)) {
							acceptor.addPosition(node.getOffset(),
									node.getLength(),
									EntityHighlightingConfiguration.DEFAULT_ID);
						}
					} else {
						acceptor.addPosition(node.getOffset(),
								node.getLength(),
								EntityHighlightingConfiguration.MODIFIER_ID);
					}

				}
			} else if (semanticElement instanceof LReference) {
				if ("transient".equals(text) || "lazy".equals(text)) {
					if (node.getNextSibling() == null) {
						if (!"transient".equals(text)) {
							acceptor.addPosition(node.getOffset(),
									node.getLength(),
									EntityHighlightingConfiguration.DEFAULT_ID);
						}
					} else {
						acceptor.addPosition(node.getOffset(),
								node.getLength(),
								EntityHighlightingConfiguration.MODIFIER_ID);
					}

				}
			} else if (semanticElement instanceof LEntity) {
				if ("cachable".equals(text) || "embeddable".equals(text)) {
					acceptor.addPosition(node.getOffset(), node.getLength(),
							EntityHighlightingConfiguration.MODIFIER_ID);
				}
			} else if (semanticElement instanceof LGenSettings) {
				if ("compilerType=".equals(text)) {
					acceptor.addPosition(node.getOffset(), node.getLength(),
							EntityHighlightingConfiguration.DEFAULT_ID);
				}
			} 
		}
	}

}
