package org.eclipse.amalgam.tutorials.xtext.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.amalgam.tutorials.xtext.services.DroidGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDroidParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalDroidParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g"; }



     	private DroidGrammarAccess grammarAccess;
     	
        public InternalDroidParser(TokenStream input, IAstFactory factory, DroidGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DroidGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:79:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:86:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:91:6: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:92:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:92:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:93:1: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:93:1: (lv_greetings_0_0= ruleGreeting )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:94:3: lv_greetings_0_0= ruleGreeting
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel130);
            	    lv_greetings_0_0=ruleGreeting();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"greetings",
            	    	        		lv_greetings_0_0, 
            	    	        		"Greeting", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleGreeting
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:124:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:125:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:126:2: iv_ruleGreeting= ruleGreeting EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGreetingRule(), currentNode); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting166);
            iv_ruleGreeting=ruleGreeting();
            _fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGreeting


    // $ANTLR start ruleGreeting
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:133:1: ruleGreeting returns [EObject current=null] : ( 'Hello' ( (lv_name_1_0= RULE_ID ) ) '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:138:6: ( ( 'Hello' ( (lv_name_1_0= RULE_ID ) ) '!' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:139:1: ( 'Hello' ( (lv_name_1_0= RULE_ID ) ) '!' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:139:1: ( 'Hello' ( (lv_name_1_0= RULE_ID ) ) '!' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:139:3: 'Hello' ( (lv_name_1_0= RULE_ID ) ) '!'
            {
            match(input,11,FOLLOW_11_in_ruleGreeting211); 

                    createLeafNode(grammarAccess.getGreetingAccess().getHelloKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:143:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:144:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:144:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:145:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting228); 

            			createLeafNode(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGreetingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleGreeting243); 

                    createLeafNode(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleGreeting


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGreeting211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting228 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGreeting243 = new BitSet(new long[]{0x0000000000000002L});

}