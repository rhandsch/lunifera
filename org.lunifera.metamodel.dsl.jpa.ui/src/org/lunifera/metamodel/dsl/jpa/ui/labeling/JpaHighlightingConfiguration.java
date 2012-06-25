package org.lunifera.metamodel.dsl.jpa.ui.labeling;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class JpaHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

	public static final String JPA_ANNOTATION_ID = "jpaAnnotation";

	public void configure(IHighlightingConfigurationAcceptor acceptor) 
	{
		super.configure(acceptor); 
		acceptor.acceptDefaultHighlighting(JPA_ANNOTATION_ID, "JpaAnnotation", annotationTextStyle());
	}

	public TextStyle annotationTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.COLOR_BLACK);
		return textStyle;
	}
}

//public class JpaHighlightingConfiguration implements IHighlightingConfiguration {
//
//	public static final String JPA_ANNOTATION_ID = "jpaAnnotation";
//
//	public void configure(IHighlightingConfigurationAcceptor acceptor) {
//		acceptor.acceptDefaultHighlighting(JPA_ANNOTATION_ID, "JpaAnnotation",
//				annotationTextStyle());
//	}
//
//	public TextStyle annotationTextStyle() {
//		TextStyle textStyle = new TextStyle();
//		textStyle.setColor(new RGB(100, 100, 100));
//		textStyle.setStyle(SWT.ITALIC);
//		return textStyle;
//	}
//
//}