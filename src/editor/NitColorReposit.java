package editor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * Reposit of all the color classes associated to the Tokens generated by the parser
 *
 */
public class NitColorReposit {
	
	/**	HashMap containing the associated TextAttribute object for the Tokens generated by the Nit Lexer */
	private Map<String, TextAttribute> keywords;
	
	/**	The Reposit is a Singleton */
	private static NitColorReposit instance;
	
	//Cached keywords list
	private String[] keywordsCache = null;
	
	/** TextAttribute objects representing all the colors of the different tokens */
	private static TextAttribute commentColor = new TextAttribute(new Color(Display.getCurrent(),new RGB(0,128,0)),null,SWT.NORMAL);
	private static TextAttribute classColor = new TextAttribute(new Color(Display.getCurrent(),new RGB(44,145,175)),null,SWT.NORMAL);
	private static TextAttribute numberColor = new TextAttribute(new Color(Display.getCurrent(), new RGB(255, 196, 12)), null, SWT.NORMAL);
	private static TextAttribute stringColor = new TextAttribute(new Color(Display.getCurrent(), new RGB(163,21,21)), null, SWT.NORMAL);
	private static TextAttribute operatorColor = new TextAttribute(new Color(Display.getCurrent(), new RGB(0, 66, 37)), null, SWT.BOLD);
	private static TextAttribute keywordColor = new TextAttribute(new Color(Display.getCurrent(), new RGB(00, 00, 255)), null, SWT.BOLD);
	private static TextAttribute booleanOperatorColor = new TextAttribute(new Color(Display.getCurrent(), new RGB(150, 0, 24)), null, SWT.BOLD);
	private static TextAttribute abortColor = new TextAttribute(new Color(Display.getCurrent(), new RGB(178, 34, 34)), new Color(Display.getCurrent(),new RGB(216, 191, 216)), SWT.BOLD);
	private static TextAttribute errorColor = new TextAttribute(new Color(Display.getCurrent(), new RGB(255,0,0)), null, SWT.UNDERLINE_ERROR);
	
	/**	The default attribute of a token */
	private static TextAttribute defaultAttribute = new TextAttribute(new Color(Display.getCurrent(), new RGB(0,0,0)), null, SWT.NORMAL);
	
	/**
	 * The Color Reposit, used to set and get the colors of the different tokens identified by the lexer
	 */
	private NitColorReposit(){
		keywords = new HashMap<String, TextAttribute>();
		
		// Populating keywords HashMap with colors
		keywords.put("TComment", commentColor);
		keywords.put("TKwmodule", keywordColor);
		keywords.put("TKwimport", keywordColor);
		keywords.put("TKwclass", keywordColor);
		keywords.put("TKwabstract", keywordColor);
		keywords.put("TKwinterface", keywordColor);
		keywords.put("TKwenum", keywordColor);
		keywords.put("TKwspecial", keywordColor);
		keywords.put("TKwend", keywordColor);
		keywords.put("TKwmeth", keywordColor);
		keywords.put("TKwtype", classColor);
		keywords.put("TKwinit", keywordColor);
		keywords.put("TKwredef", keywordColor);
		keywords.put("TKwis", keywordColor);
		keywords.put("TKwdo", keywordColor);
		keywords.put("TKwreadable", keywordColor);
		keywords.put("TKwwritable", keywordColor);
		keywords.put("TKwvar", keywordColor);
		keywords.put("TKwintern", keywordColor);
		keywords.put("TKwextern", keywordColor);
		keywords.put("TKwprotected", keywordColor);
		keywords.put("TKwprivate", keywordColor);
		keywords.put("TKwintrude", keywordColor);
		keywords.put("TKwif", keywordColor);
		keywords.put("TKwthen", keywordColor);
		keywords.put("TKwelse", keywordColor);
		keywords.put("TKwwhile", keywordColor);
		keywords.put("TKwloop", keywordColor);
		keywords.put("TKwfor", keywordColor);
		keywords.put("TKwin", keywordColor);
		keywords.put("TKwand", booleanOperatorColor);
		keywords.put("TKwor", booleanOperatorColor);
		keywords.put("TKwnot", booleanOperatorColor);
		keywords.put("TKwreturn", keywordColor);
		keywords.put("TKwcontinue", keywordColor);
		keywords.put("TKwbreak", keywordColor);
		keywords.put("TKwabort", abortColor);
		keywords.put("TKwassert", keywordColor);
		keywords.put("TKwnew", keywordColor);
		keywords.put("TKwisa", keywordColor);
		keywords.put("TKwonce", keywordColor);
		keywords.put("TKwsuper", keywordColor);
		keywords.put("TKwself", keywordColor);
		keywords.put("TKwtrue", keywordColor);
		keywords.put("TKwfalse", keywordColor);
		keywords.put("TKwnull", keywordColor);
		keywords.put("TKwas", keywordColor);
		keywords.put("TKwnullable", keywordColor);
		keywords.put("TKwisset", keywordColor);
		keywords.put("TKwlabel", keywordColor);
		keywords.put("TOpar",defaultAttribute);
		keywords.put("TCpar",defaultAttribute);
		keywords.put("TObra",defaultAttribute);
		keywords.put("TCbra", defaultAttribute);
		keywords.put("TComma", defaultAttribute);
		keywords.put("TColumn",operatorColor);
		keywords.put("TQuad",operatorColor);
		keywords.put("TAssign",operatorColor);
		keywords.put("TPluseq",operatorColor);
		keywords.put("TMinuseq",operatorColor);
		keywords.put("TDotdotdot",operatorColor);
		keywords.put("TDotdot",operatorColor);
		keywords.put("TDot",operatorColor);
		keywords.put("TPlus",operatorColor);
		keywords.put("TMinus",operatorColor);
		keywords.put("TStar",operatorColor);
		keywords.put("TSlash",operatorColor);
		keywords.put("TPercent",operatorColor);
		keywords.put("TEq",booleanOperatorColor);
		keywords.put("TNe",booleanOperatorColor);
		keywords.put("TLt",booleanOperatorColor);
		keywords.put("TLe",booleanOperatorColor);
		keywords.put("TLl",booleanOperatorColor);
		keywords.put("TGt",booleanOperatorColor);
		keywords.put("TGe",booleanOperatorColor);
		keywords.put("TGg",booleanOperatorColor);
		keywords.put("TStarship",booleanOperatorColor);
		keywords.put("TBang",booleanOperatorColor);
		keywords.put("TClassid", classColor);
		keywords.put("TId", defaultAttribute);
		keywords.put("TAttrid", defaultAttribute);
		keywords.put("TNumber",numberColor);
		keywords.put("TFloat",numberColor);
		keywords.put("TChar",numberColor);
		keywords.put("TString",stringColor);
		keywords.put("TStartString",stringColor);
		keywords.put("TMidString",stringColor);
		keywords.put("TEndString",stringColor);
		keywords.put("TBadChar", errorColor);
		keywords.put("TBadString", errorColor);
		
		keywordsCache = this.getKeywords();
	}
	
	/**
	 * Singleton method to get back the only instance of the Color Reposit
	 * 
	 * @return The current instance of NitColorReposit
	 */
	public static NitColorReposit getInstance()
	{
		if(NitColorReposit.instance == null){
			instance = new NitColorReposit();
		}
		return instance;
	}
	
	/**
	 * Method to get the TextAttribute corresponding to the Token sent by the Lexer
	 * 
	 * @param word The token name as sent by the Lexer
	 * @return The TextAttribute corresponding to the token @param word
	 */
	public TextAttribute getStyleForKeyWord(String word){
		TextAttribute tt = keywords.get(word);
		if(tt != null){
			return tt;
		}else{
			return defaultAttribute;
		}
	}
	
	/**
	 * @return An array of Nit Keywords
	 */
	public String[] getKeywords(){
		if(this.keywordsCache == null){
			Set<String> keys = this.keywords.keySet();
			ArrayList<String> results = new ArrayList<String>();
			
			for(String key : keys){
				if(key.substring(0,3).toLowerCase().startsWith("tkw")){
					results.add(key.substring(3,key.length()));
				}
			}
			
			this.keywordsCache = results.toArray(new String[results.size()]);
		}
		
		return this.keywordsCache;
	}
}
