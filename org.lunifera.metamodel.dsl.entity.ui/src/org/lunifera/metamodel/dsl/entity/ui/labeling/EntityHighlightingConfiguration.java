package org.lunifera.metamodel.dsl.entity.ui.labeling;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class EntityHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

	public static final String LAZY = "lazy";

	public static final String ANNOTATION_ID = "AnnotationId";
	public static final String ANNOTATION_PARAMS_ID = "AnnotationParamsId";
	public static final String ANNOTATION_PARAMS_VALUE = "AnnotationParamsValue";
	public static final String ANNOTATION_SPECIAL_KEYWORDS = "AnnotationSpecialsKeywords";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(ANNOTATION_ID, "Annotation ID",
				annotationIdTextStyle());
		acceptor.acceptDefaultHighlighting(ANNOTATION_PARAMS_ID,
				"Annotation Params ID", annotationParamIdTextStyle());
		acceptor.acceptDefaultHighlighting(ANNOTATION_PARAMS_VALUE,
				"Annotation Params Value", annotationParamValueTextStyle());
		acceptor.acceptDefaultHighlighting(ANNOTATION_SPECIAL_KEYWORDS,
				"Annotation Special Keywords", annotationSpecialKeywords());
		acceptor.acceptDefaultHighlighting(LAZY, "lazy", lazyStyle());
	}

	public TextStyle annotationIdTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		return textStyle;
	}

	public TextStyle annotationParamIdTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		return textStyle;
	}

	public TextStyle annotationParamValueTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 37, 178));
		return textStyle;
	}

	public TextStyle annotationSpecialKeywords() {
		TextStyle textStyle = defaultTextStyle().copy();
		return textStyle;
	}

	public TextStyle lazyStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 37, 178));
		return textStyle;
	}

}

// public class JpaHighlightingConfiguration implements
// IHighlightingConfiguration {
//
// public static final String JPA_ANNOTATION_ID = "jpaAnnotation";
//
// public void configure(IHighlightingConfigurationAcceptor acceptor) {
// acceptor.acceptDefaultHighlighting(JPA_ANNOTATION_ID, "JpaAnnotation",
// annotationTextStyle());
// }
//
// public TextStyle annotationTextStyle() {
// TextStyle textStyle = new TextStyle();
// textStyle.setColor(new RGB(100, 100, 100));
// textStyle.setStyle(SWT.ITALIC);
// return textStyle;
// }
//
// }