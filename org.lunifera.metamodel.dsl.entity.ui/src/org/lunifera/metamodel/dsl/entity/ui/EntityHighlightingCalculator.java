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

	// private static final Set<String> keywords = new HashSet<String>();
	// static {
	// javakeywords.add("package");
	// javakeywords.add("transient");
	// }

	// public void provideHighlightingFor( XtextResource resource,
	// IHighlightedPositionAcceptor acceptor )
	// {
	// if( resource == null || resource.getParseResult() == null ) return;
	//
	// INode root = resource.getParseResult().getRootNode();
	// BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
	// while( it.hasNext() )
	// {
	// INode node = it.next();
	// if( node instanceof CompositeNodeWithSemanticElement &&
	// node.getSemanticElement() instanceof Group )
	// {
	// setStyles( acceptor, it, GROUP, GROUP_NAME, GROUP );
	// setStyles( acceptor, node.getAsTreeIterable().reverse().iterator(), null,
	// GROUP );
	// }
	// else if( node instanceof CompositeNodeWithSemanticElement &&
	// node.getSemanticElement() instanceof PFT )
	// {
	// setStyles( acceptor, it, PFT, GROUP_NAME, PFT );
	// setStyles( acceptor, node.getAsTreeIterable().reverse().iterator(), null,
	// PFT );
	// }
	// else if( node.getSemanticElement() instanceof Include )
	// {
	// setStyles( acceptor, it, GROUP_NAME );
	// }
	// else if( node.getSemanticElement() instanceof Param && node instanceof
	// CompositeNode )
	// {
	// setStyles( acceptor, it, PARAM, STRING, null, PARAM_VAL, STRING,
	// PARAM_VAL );
	// }
	// else if( node.getSemanticElement() instanceof Variable && node instanceof
	// CompositeNode )
	// {
	// setStyles( acceptor, it, VARIABLE, VARIABLE_VAL );
	// }
	// else if( node instanceof HiddenLeafNode && node.getGrammarElement()
	// instanceof TerminalRuleImpl )
	// {
	// TerminalRuleImpl ge = (TerminalRuleImpl) node.getGrammarElement();
	// if( ge.getName().equalsIgnoreCase( "GUESS_COMMENT" ) )
	// acceptor.addPosition( node.getOffset(), node.getLength(), COMMENT );
	// }
	// //else
	// //System.err.println( "Node: " + node.getClass().getSimpleName() + " " +
	// node.getGrammarElement().getClass().getSimpleName() );
	// }
	// }
	//
	// void setStyles( IHighlightedPositionAcceptor acceptor,
	// BidiIterator<INode> it, String...styles )
	// {
	// for( String s : styles )
	// {
	// if( ! it.hasNext() ) return;
	// INode n = skipWhiteSpace( acceptor, it );
	// if( n != null && s != null ) acceptor.addPosition( n.getOffset(),
	// n.getLength(), s );
	// }
	// }
	//
	// INode skipWhiteSpace( IHighlightedPositionAcceptor acceptor,
	// BidiIterator<INode> it )
	// {
	// INode n = null;
	// while ( it.hasNext() && ( n = it.next() ).getClass() ==
	// HiddenLeafNode.class )
	// processHiddenNode( acceptor, (HiddenLeafNode)n );
	// return n;
	// }
	//
	// INode skipWhiteSpaceBackwards( IHighlightedPositionAcceptor acceptor,
	// BidiIterator<INode> it )
	// {
	// INode n = null;
	// while ( it.hasPrevious() && ( n = it.previous() ).getClass() ==
	// HiddenLeafNode.class )
	// processHiddenNode( acceptor, (HiddenLeafNode)n );
	// return n;
	// }
	//
	//
	//
	// void processHiddenNode( IHighlightedPositionAcceptor acceptor,
	// HiddenLeafNode node )
	// {
	// if( node.getGrammarElement() instanceof TerminalRuleImpl )
	// {
	// TerminalRuleImpl ge = (TerminalRuleImpl) node.getGrammarElement();
	// if( ge.getName().equalsIgnoreCase( "GUESS_COMMENT" ) )
	// acceptor.addPosition( node.getOffset(), node.getLength(), COMMENT );
	// }
	//
	// }

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
