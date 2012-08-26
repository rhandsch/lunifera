package org.lunifera.metamodel.dsl.entity.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class EntityHighlightingConfiguration implements IHighlightingConfiguration {

//	  // provide an id string for the highlighting calculator
//	  public static final String PARAM = "Parameter";
//	  public static final String PARAM_VAL = "Parameter Value";
//	  public static final String VARIABLE = "Variable";
//	  public static final String VARIABLE_VAL = "Variable Val";
//	  public static final String COMMENT = "Comment";
//	  public static final String STRING = "String";
//	  public static final String NUMBER = "Number";
//	  public static final String GROUP = "Group";
//	  public static final String PFT = "PFT";
//	  public static final String GROUP_NAME = "Group Name";
//	  public static final String[] ALL_STRINGS =
//		  { PARAM , PARAM_VAL , VARIABLE , VARIABLE_VAL , STRING , NUMBER , GROUP , PFT
//		  };
//
//	  // configure the acceptor providing the id, the description string
//	  // that will appear in the preference page and the initial text style
//	  public void configure(IHighlightingConfigurationAcceptor acceptor) 
//	  {
//		  addType( acceptor, PARAM, 50, 0, 0, NORMAL );
//		  addType( acceptor, PARAM_VAL, 50, 0, 0, NORMAL );
//		  addType( acceptor, VARIABLE, 50, 0, 0, NORMAL );
//		  addType( acceptor, VARIABLE_VAL, 50, 0, 0, NORMAL );
//		  addType( acceptor, STRING, 50, 0, 0, NORMAL );
//		  addType( acceptor, NUMBER, 50, 0, 0, NORMAL );
//		  addType( acceptor, GROUP, 50, 0, 0, NORMAL );
//		  addType( acceptor, PFT, 50, 0, 0, NORMAL );
//		  addType( acceptor, GROUP_NAME, 50, 0, 0, NORMAL );
//		  addType( acceptor, COMMENT, 150, 200, 200, NORMAL );
//	  }
//	 
//	  public void addType(IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int style )
//	  {
//		TextStyle textStyle = new TextStyle();
//	    textStyle.setBackgroundColor(new RGB(255, 255, 255));
//	    textStyle.setColor(new RGB(r, g, b));
//	    textStyle.setStyle(style);
//	    acceptor.acceptDefaultHighlighting(s, s, textStyle);
//	  }

	public static final String COMMENT_ID = "comment";
	public static final String KEYWORD_ID = "keyword";
	public static final String MODIFIER_ID = "modifier";
	public static final String PUNCTUATION_ID = "punctuation";
	public static final String STRING_ID = "string";
	public static final String NUMBER_ID = "number";
	public static final String DEFAULT_ID = "default";
	public static final String INVALID_TOKEN_ID = "error";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
		acceptor.acceptDefaultHighlighting(MODIFIER_ID, "Modifier", modifierTextStyle());
		acceptor.acceptDefaultHighlighting(PUNCTUATION_ID, "Punctuation character", punctuationTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", stringTextStyle());
		acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
		acceptor.acceptDefaultHighlighting(INVALID_TOKEN_ID, "Invalid Symbol", errorTextStyle());
	}
	
	public TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}
	
	public TextStyle commentTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63, 127, 95));
		return textStyle;
	}

	public TextStyle keywordTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 85));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle modifierTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 85));
		return textStyle;
	}
 
	public TextStyle stringTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(42, 0, 255));
		return textStyle;
	}

	public TextStyle errorTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
//		textStyle.setColor(new RGB(255, 0, 0));
		return textStyle;
	}
	
	public TextStyle numberTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(125, 125, 125));
		return textStyle;
	}

	public TextStyle punctuationTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		return textStyle;
	}

}
