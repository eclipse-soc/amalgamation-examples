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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'{'", "'}'", "'manifest'", "'layout'", "'top'", "'='", "'left'", "'width'", "'->'", "'widget'", "'<'", "'>'", "'button'", "'spinner'", "'editText'", "'textView'", "'activity'", "'list activity'", "'data'", "'item'", "'tab activity'", "'action'", "'go to'", "'show'", "'invoke'", "'load'", "'=>'", "'.'", "'://'", "'/'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
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
        	return "Application";	
       	}
       	
       	@Override
       	protected DroidGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleApplication
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:77:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:78:2: (iv_ruleApplication= ruleApplication EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:79:2: iv_ruleApplication= ruleApplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication75);
            iv_ruleApplication=ruleApplication();
            _fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication85); 

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
    // $ANTLR end entryRuleApplication


    // $ANTLR start ruleApplication
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:86:1: ruleApplication returns [EObject current=null] : ( 'application' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_package_2_0= ruleQualifiedName ) )? '{' ( (lv_manifest_4_0= ruleManifestFile ) )? ( (lv_layouts_5_0= ruleLayout ) )* ( (lv_activities_6_0= ruleActivity ) )+ '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_package_2_0 = null;

        EObject lv_manifest_4_0 = null;

        EObject lv_layouts_5_0 = null;

        EObject lv_activities_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:91:6: ( ( 'application' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_package_2_0= ruleQualifiedName ) )? '{' ( (lv_manifest_4_0= ruleManifestFile ) )? ( (lv_layouts_5_0= ruleLayout ) )* ( (lv_activities_6_0= ruleActivity ) )+ '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:92:1: ( 'application' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_package_2_0= ruleQualifiedName ) )? '{' ( (lv_manifest_4_0= ruleManifestFile ) )? ( (lv_layouts_5_0= ruleLayout ) )* ( (lv_activities_6_0= ruleActivity ) )+ '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:92:1: ( 'application' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_package_2_0= ruleQualifiedName ) )? '{' ( (lv_manifest_4_0= ruleManifestFile ) )? ( (lv_layouts_5_0= ruleLayout ) )* ( (lv_activities_6_0= ruleActivity ) )+ '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:92:3: 'application' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_package_2_0= ruleQualifiedName ) )? '{' ( (lv_manifest_4_0= ruleManifestFile ) )? ( (lv_layouts_5_0= ruleLayout ) )* ( (lv_activities_6_0= ruleActivity ) )+ '}'
            {
            match(input,11,FOLLOW_11_in_ruleApplication120); 

                    createLeafNode(grammarAccess.getApplicationAccess().getApplicationKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:96:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:97:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:97:1: (lv_name_1_0= RULE_STRING )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:98:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplication137); 

            			createLeafNode(grammarAccess.getApplicationAccess().getNameSTRINGTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:120:2: ( (lv_package_2_0= ruleQualifiedName ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:121:1: (lv_package_2_0= ruleQualifiedName )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:121:1: (lv_package_2_0= ruleQualifiedName )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:122:3: lv_package_2_0= ruleQualifiedName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getPackageQualifiedNameParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleApplication163);
                    lv_package_2_0=ruleQualifiedName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"package",
                    	        		lv_package_2_0, 
                    	        		"QualifiedName", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleApplication174); 

                    createLeafNode(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:148:1: ( (lv_manifest_4_0= ruleManifestFile ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:149:1: (lv_manifest_4_0= ruleManifestFile )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:149:1: (lv_manifest_4_0= ruleManifestFile )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:150:3: lv_manifest_4_0= ruleManifestFile
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getManifestManifestFileParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleManifestFile_in_ruleApplication195);
                    lv_manifest_4_0=ruleManifestFile();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"manifest",
                    	        		lv_manifest_4_0, 
                    	        		"ManifestFile", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:172:3: ( (lv_layouts_5_0= ruleLayout ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:173:1: (lv_layouts_5_0= ruleLayout )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:173:1: (lv_layouts_5_0= ruleLayout )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:174:3: lv_layouts_5_0= ruleLayout
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getLayoutsLayoutParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLayout_in_ruleApplication217);
            	    lv_layouts_5_0=ruleLayout();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"layouts",
            	    	        		lv_layouts_5_0, 
            	    	        		"Layout", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:196:3: ( (lv_activities_6_0= ruleActivity ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=28 && LA4_0<=29)||LA4_0==32) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:197:1: (lv_activities_6_0= ruleActivity )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:197:1: (lv_activities_6_0= ruleActivity )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:198:3: lv_activities_6_0= ruleActivity
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getActivitiesActivityParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivity_in_ruleApplication239);
            	    lv_activities_6_0=ruleActivity();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"activities",
            	    	        		lv_activities_6_0, 
            	    	        		"Activity", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match(input,13,FOLLOW_13_in_ruleApplication250); 

                    createLeafNode(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_7(), null); 
                

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
    // $ANTLR end ruleApplication


    // $ANTLR start entryRuleManifestFile
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:234:1: entryRuleManifestFile returns [EObject current=null] : iv_ruleManifestFile= ruleManifestFile EOF ;
    public final EObject entryRuleManifestFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManifestFile = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:235:2: (iv_ruleManifestFile= ruleManifestFile EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:236:2: iv_ruleManifestFile= ruleManifestFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getManifestFileRule(), currentNode); 
            pushFollow(FOLLOW_ruleManifestFile_in_entryRuleManifestFile288);
            iv_ruleManifestFile=ruleManifestFile();
            _fsp--;

             current =iv_ruleManifestFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManifestFile298); 

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
    // $ANTLR end entryRuleManifestFile


    // $ANTLR start ruleManifestFile
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:243:1: ruleManifestFile returns [EObject current=null] : ( () 'manifest' '{' '}' ) ;
    public final EObject ruleManifestFile() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:248:6: ( ( () 'manifest' '{' '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:249:1: ( () 'manifest' '{' '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:249:1: ( () 'manifest' '{' '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:249:2: () 'manifest' '{' '}'
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:249:2: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:250:5: 
            {
             
                    temp=factory.create(grammarAccess.getManifestFileAccess().getManifestFileAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getManifestFileAccess().getManifestFileAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,14,FOLLOW_14_in_ruleManifestFile342); 

                    createLeafNode(grammarAccess.getManifestFileAccess().getManifestKeyword_1(), null); 
                
            match(input,12,FOLLOW_12_in_ruleManifestFile352); 

                    createLeafNode(grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,13,FOLLOW_13_in_ruleManifestFile362); 

                    createLeafNode(grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_3(), null); 
                

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
    // $ANTLR end ruleManifestFile


    // $ANTLR start entryRuleLayout
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:280:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:281:2: (iv_ruleLayout= ruleLayout EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:282:2: iv_ruleLayout= ruleLayout EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLayoutRule(), currentNode); 
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout398);
            iv_ruleLayout=ruleLayout();
            _fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout408); 

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
    // $ANTLR end entryRuleLayout


    // $ANTLR start ruleLayout
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:289:1: ruleLayout returns [EObject current=null] : ( 'layout' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_widgets_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:294:6: ( ( 'layout' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:295:1: ( 'layout' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:295:1: ( 'layout' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:295:3: 'layout' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}'
            {
            match(input,15,FOLLOW_15_in_ruleLayout443); 

                    createLeafNode(grammarAccess.getLayoutAccess().getLayoutKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:299:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:300:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:300:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:301:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLayout460); 

            			createLeafNode(grammarAccess.getLayoutAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLayoutRule().getType().getClassifier());
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

            match(input,12,FOLLOW_12_in_ruleLayout475); 

                    createLeafNode(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:327:1: ( (lv_widgets_3_0= ruleWidget ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21||(LA5_0>=24 && LA5_0<=27)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:328:1: (lv_widgets_3_0= ruleWidget )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:328:1: (lv_widgets_3_0= ruleWidget )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:329:3: lv_widgets_3_0= ruleWidget
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLayoutAccess().getWidgetsWidgetParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleWidget_in_ruleLayout496);
            	    lv_widgets_3_0=ruleWidget();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLayoutRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"widgets",
            	    	        		lv_widgets_3_0, 
            	    	        		"Widget", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleLayout507); 

                    createLeafNode(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruleLayout


    // $ANTLR start entryRuleWidget
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:363:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:364:2: (iv_ruleWidget= ruleWidget EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:365:2: iv_ruleWidget= ruleWidget EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWidgetRule(), currentNode); 
            pushFollow(FOLLOW_ruleWidget_in_entryRuleWidget543);
            iv_ruleWidget=ruleWidget();
            _fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidget553); 

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
    // $ANTLR end entryRuleWidget


    // $ANTLR start ruleWidget
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:372:1: ruleWidget returns [EObject current=null] : ( (this_GenericWidget_0= ruleGenericWidget | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_EditText_3= ruleEditText | this_TextView_4= ruleTextView ) ( 'top' '=' ( (lv_top_7_0= RULE_INT ) ) )? ( 'left' '=' ( (lv_left_10_0= RULE_INT ) ) )? ( 'width' '=' ( (lv_width_13_0= RULE_INT ) ) )? ( '->' ( (lv_actions_15_0= ruleAction ) ) )* ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        Token lv_top_7_0=null;
        Token lv_left_10_0=null;
        Token lv_width_13_0=null;
        EObject this_GenericWidget_0 = null;

        EObject this_Button_1 = null;

        EObject this_Spinner_2 = null;

        EObject this_EditText_3 = null;

        EObject this_TextView_4 = null;

        EObject lv_actions_15_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:377:6: ( ( (this_GenericWidget_0= ruleGenericWidget | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_EditText_3= ruleEditText | this_TextView_4= ruleTextView ) ( 'top' '=' ( (lv_top_7_0= RULE_INT ) ) )? ( 'left' '=' ( (lv_left_10_0= RULE_INT ) ) )? ( 'width' '=' ( (lv_width_13_0= RULE_INT ) ) )? ( '->' ( (lv_actions_15_0= ruleAction ) ) )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:378:1: ( (this_GenericWidget_0= ruleGenericWidget | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_EditText_3= ruleEditText | this_TextView_4= ruleTextView ) ( 'top' '=' ( (lv_top_7_0= RULE_INT ) ) )? ( 'left' '=' ( (lv_left_10_0= RULE_INT ) ) )? ( 'width' '=' ( (lv_width_13_0= RULE_INT ) ) )? ( '->' ( (lv_actions_15_0= ruleAction ) ) )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:378:1: ( (this_GenericWidget_0= ruleGenericWidget | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_EditText_3= ruleEditText | this_TextView_4= ruleTextView ) ( 'top' '=' ( (lv_top_7_0= RULE_INT ) ) )? ( 'left' '=' ( (lv_left_10_0= RULE_INT ) ) )? ( 'width' '=' ( (lv_width_13_0= RULE_INT ) ) )? ( '->' ( (lv_actions_15_0= ruleAction ) ) )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:378:2: (this_GenericWidget_0= ruleGenericWidget | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_EditText_3= ruleEditText | this_TextView_4= ruleTextView ) ( 'top' '=' ( (lv_top_7_0= RULE_INT ) ) )? ( 'left' '=' ( (lv_left_10_0= RULE_INT ) ) )? ( 'width' '=' ( (lv_width_13_0= RULE_INT ) ) )? ( '->' ( (lv_actions_15_0= ruleAction ) ) )*
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:378:2: (this_GenericWidget_0= ruleGenericWidget | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_EditText_3= ruleEditText | this_TextView_4= ruleTextView )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            case 27:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("378:2: (this_GenericWidget_0= ruleGenericWidget | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_EditText_3= ruleEditText | this_TextView_4= ruleTextView )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:379:5: this_GenericWidget_0= ruleGenericWidget
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getGenericWidgetParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGenericWidget_in_ruleWidget601);
                    this_GenericWidget_0=ruleGenericWidget();
                    _fsp--;

                     
                            current = this_GenericWidget_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:389:5: this_Button_1= ruleButton
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getButtonParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleWidget628);
                    this_Button_1=ruleButton();
                    _fsp--;

                     
                            current = this_Button_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:399:5: this_Spinner_2= ruleSpinner
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSpinner_in_ruleWidget655);
                    this_Spinner_2=ruleSpinner();
                    _fsp--;

                     
                            current = this_Spinner_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:409:5: this_EditText_3= ruleEditText
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getEditTextParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEditText_in_ruleWidget682);
                    this_EditText_3=ruleEditText();
                    _fsp--;

                     
                            current = this_EditText_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:419:5: this_TextView_4= ruleTextView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getTextViewParserRuleCall_0_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTextView_in_ruleWidget709);
                    this_TextView_4=ruleTextView();
                    _fsp--;

                     
                            current = this_TextView_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:427:2: ( 'top' '=' ( (lv_top_7_0= RULE_INT ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:427:4: 'top' '=' ( (lv_top_7_0= RULE_INT ) )
                    {
                    match(input,16,FOLLOW_16_in_ruleWidget720); 

                            createLeafNode(grammarAccess.getWidgetAccess().getTopKeyword_1_0(), null); 
                        
                    match(input,17,FOLLOW_17_in_ruleWidget730); 

                            createLeafNode(grammarAccess.getWidgetAccess().getEqualsSignKeyword_1_1(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:435:1: ( (lv_top_7_0= RULE_INT ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:436:1: (lv_top_7_0= RULE_INT )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:436:1: (lv_top_7_0= RULE_INT )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:437:3: lv_top_7_0= RULE_INT
                    {
                    lv_top_7_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWidget747); 

                    			createLeafNode(grammarAccess.getWidgetAccess().getTopINTTerminalRuleCall_1_2_0(), "top"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWidgetRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"top",
                    	        		lv_top_7_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:459:4: ( 'left' '=' ( (lv_left_10_0= RULE_INT ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:459:6: 'left' '=' ( (lv_left_10_0= RULE_INT ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleWidget765); 

                            createLeafNode(grammarAccess.getWidgetAccess().getLeftKeyword_2_0(), null); 
                        
                    match(input,17,FOLLOW_17_in_ruleWidget775); 

                            createLeafNode(grammarAccess.getWidgetAccess().getEqualsSignKeyword_2_1(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:467:1: ( (lv_left_10_0= RULE_INT ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:468:1: (lv_left_10_0= RULE_INT )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:468:1: (lv_left_10_0= RULE_INT )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:469:3: lv_left_10_0= RULE_INT
                    {
                    lv_left_10_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWidget792); 

                    			createLeafNode(grammarAccess.getWidgetAccess().getLeftINTTerminalRuleCall_2_2_0(), "left"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWidgetRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"left",
                    	        		lv_left_10_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:491:4: ( 'width' '=' ( (lv_width_13_0= RULE_INT ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:491:6: 'width' '=' ( (lv_width_13_0= RULE_INT ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleWidget810); 

                            createLeafNode(grammarAccess.getWidgetAccess().getWidthKeyword_3_0(), null); 
                        
                    match(input,17,FOLLOW_17_in_ruleWidget820); 

                            createLeafNode(grammarAccess.getWidgetAccess().getEqualsSignKeyword_3_1(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:499:1: ( (lv_width_13_0= RULE_INT ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:500:1: (lv_width_13_0= RULE_INT )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:500:1: (lv_width_13_0= RULE_INT )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:501:3: lv_width_13_0= RULE_INT
                    {
                    lv_width_13_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWidget837); 

                    			createLeafNode(grammarAccess.getWidgetAccess().getWidthINTTerminalRuleCall_3_2_0(), "width"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWidgetRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"width",
                    	        		lv_width_13_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:523:4: ( '->' ( (lv_actions_15_0= ruleAction ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:523:6: '->' ( (lv_actions_15_0= ruleAction ) )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleWidget855); 

            	            createLeafNode(grammarAccess.getWidgetAccess().getHyphenMinusGreaterThanSignKeyword_4_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:527:1: ( (lv_actions_15_0= ruleAction ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:528:1: (lv_actions_15_0= ruleAction )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:528:1: (lv_actions_15_0= ruleAction )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:529:3: lv_actions_15_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getActionsActionParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleWidget876);
            	    lv_actions_15_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWidgetRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actions",
            	    	        		lv_actions_15_0, 
            	    	        		"Action", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end ruleWidget


    // $ANTLR start entryRuleGenericWidget
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:559:1: entryRuleGenericWidget returns [EObject current=null] : iv_ruleGenericWidget= ruleGenericWidget EOF ;
    public final EObject entryRuleGenericWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericWidget = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:560:2: (iv_ruleGenericWidget= ruleGenericWidget EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:561:2: iv_ruleGenericWidget= ruleGenericWidget EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGenericWidgetRule(), currentNode); 
            pushFollow(FOLLOW_ruleGenericWidget_in_entryRuleGenericWidget914);
            iv_ruleGenericWidget=ruleGenericWidget();
            _fsp--;

             current =iv_ruleGenericWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericWidget924); 

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
    // $ANTLR end entryRuleGenericWidget


    // $ANTLR start ruleGenericWidget
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:568:1: ruleGenericWidget returns [EObject current=null] : ( 'widget' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_name_5_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleGenericWidget() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:573:6: ( ( 'widget' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_name_5_0= ruleQualifiedName ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:574:1: ( 'widget' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_name_5_0= ruleQualifiedName ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:574:1: ( 'widget' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_name_5_0= ruleQualifiedName ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:574:3: 'widget' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_name_5_0= ruleQualifiedName ) )
            {
            match(input,21,FOLLOW_21_in_ruleGenericWidget959); 

                    createLeafNode(grammarAccess.getGenericWidgetAccess().getWidgetKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:578:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:579:5: 
            {
             
                    temp=factory.create(grammarAccess.getGenericWidgetAccess().getGenericWidgetAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getGenericWidgetAccess().getGenericWidgetAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:589:2: ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:589:4: '<' ( (lv_id_3_0= RULE_ID ) ) '>'
                    {
                    match(input,22,FOLLOW_22_in_ruleGenericWidget979); 

                            createLeafNode(grammarAccess.getGenericWidgetAccess().getLessThanSignKeyword_2_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:593:1: ( (lv_id_3_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:594:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:594:1: (lv_id_3_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:595:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGenericWidget996); 

                    			createLeafNode(grammarAccess.getGenericWidgetAccess().getIdIDTerminalRuleCall_2_1_0(), "id"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGenericWidgetRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"id",
                    	        		lv_id_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,23,FOLLOW_23_in_ruleGenericWidget1011); 

                            createLeafNode(grammarAccess.getGenericWidgetAccess().getGreaterThanSignKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:621:3: ( (lv_name_5_0= ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:622:1: (lv_name_5_0= ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:622:1: (lv_name_5_0= ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:623:3: lv_name_5_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGenericWidgetAccess().getNameQualifiedNameParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGenericWidget1034);
            lv_name_5_0=ruleQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGenericWidgetRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_5_0, 
            	        		"QualifiedName", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


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
    // $ANTLR end ruleGenericWidget


    // $ANTLR start entryRuleButton
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:653:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:654:2: (iv_ruleButton= ruleButton EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:655:2: iv_ruleButton= ruleButton EOF
            {
             currentNode = createCompositeNode(grammarAccess.getButtonRule(), currentNode); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton1070);
            iv_ruleButton=ruleButton();
            _fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton1080); 

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
    // $ANTLR end entryRuleButton


    // $ANTLR start ruleButton
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:662:1: ruleButton returns [EObject current=null] : ( 'button' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        Token lv_label_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:667:6: ( ( 'button' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:668:1: ( 'button' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:668:1: ( 'button' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:668:3: 'button' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) )
            {
            match(input,24,FOLLOW_24_in_ruleButton1115); 

                    createLeafNode(grammarAccess.getButtonAccess().getButtonKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:672:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:673:5: 
            {
             
                    temp=factory.create(grammarAccess.getButtonAccess().getButtonAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getButtonAccess().getButtonAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:683:2: ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:683:4: '<' ( (lv_id_3_0= RULE_ID ) ) '>'
                    {
                    match(input,22,FOLLOW_22_in_ruleButton1135); 

                            createLeafNode(grammarAccess.getButtonAccess().getLessThanSignKeyword_2_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:687:1: ( (lv_id_3_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:688:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:688:1: (lv_id_3_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:689:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleButton1152); 

                    			createLeafNode(grammarAccess.getButtonAccess().getIdIDTerminalRuleCall_2_1_0(), "id"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"id",
                    	        		lv_id_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,23,FOLLOW_23_in_ruleButton1167); 

                            createLeafNode(grammarAccess.getButtonAccess().getGreaterThanSignKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:715:3: ( (lv_label_5_0= RULE_STRING ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:716:1: (lv_label_5_0= RULE_STRING )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:716:1: (lv_label_5_0= RULE_STRING )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:717:3: lv_label_5_0= RULE_STRING
            {
            lv_label_5_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButton1186); 

            			createLeafNode(grammarAccess.getButtonAccess().getLabelSTRINGTerminalRuleCall_3_0(), "label"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"label",
            	        		lv_label_5_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


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
    // $ANTLR end ruleButton


    // $ANTLR start entryRuleSpinner
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:747:1: entryRuleSpinner returns [EObject current=null] : iv_ruleSpinner= ruleSpinner EOF ;
    public final EObject entryRuleSpinner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinner = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:748:2: (iv_ruleSpinner= ruleSpinner EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:749:2: iv_ruleSpinner= ruleSpinner EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSpinnerRule(), currentNode); 
            pushFollow(FOLLOW_ruleSpinner_in_entryRuleSpinner1227);
            iv_ruleSpinner=ruleSpinner();
            _fsp--;

             current =iv_ruleSpinner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpinner1237); 

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
    // $ANTLR end entryRuleSpinner


    // $ANTLR start ruleSpinner
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:756:1: ruleSpinner returns [EObject current=null] : ( 'spinner' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleSpinner() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        Token lv_label_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:761:6: ( ( 'spinner' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:762:1: ( 'spinner' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:762:1: ( 'spinner' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:762:3: 'spinner' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) )
            {
            match(input,25,FOLLOW_25_in_ruleSpinner1272); 

                    createLeafNode(grammarAccess.getSpinnerAccess().getSpinnerKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:766:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:767:5: 
            {
             
                    temp=factory.create(grammarAccess.getSpinnerAccess().getSpinnerAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getSpinnerAccess().getSpinnerAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:777:2: ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:777:4: '<' ( (lv_id_3_0= RULE_ID ) ) '>'
                    {
                    match(input,22,FOLLOW_22_in_ruleSpinner1292); 

                            createLeafNode(grammarAccess.getSpinnerAccess().getLessThanSignKeyword_2_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:781:1: ( (lv_id_3_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:782:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:782:1: (lv_id_3_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:783:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpinner1309); 

                    			createLeafNode(grammarAccess.getSpinnerAccess().getIdIDTerminalRuleCall_2_1_0(), "id"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSpinnerRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"id",
                    	        		lv_id_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,23,FOLLOW_23_in_ruleSpinner1324); 

                            createLeafNode(grammarAccess.getSpinnerAccess().getGreaterThanSignKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:809:3: ( (lv_label_5_0= RULE_STRING ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:810:1: (lv_label_5_0= RULE_STRING )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:810:1: (lv_label_5_0= RULE_STRING )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:811:3: lv_label_5_0= RULE_STRING
            {
            lv_label_5_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpinner1343); 

            			createLeafNode(grammarAccess.getSpinnerAccess().getLabelSTRINGTerminalRuleCall_3_0(), "label"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSpinnerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"label",
            	        		lv_label_5_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


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
    // $ANTLR end ruleSpinner


    // $ANTLR start entryRuleEditText
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:841:1: entryRuleEditText returns [EObject current=null] : iv_ruleEditText= ruleEditText EOF ;
    public final EObject entryRuleEditText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditText = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:842:2: (iv_ruleEditText= ruleEditText EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:843:2: iv_ruleEditText= ruleEditText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEditTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleEditText_in_entryRuleEditText1384);
            iv_ruleEditText=ruleEditText();
            _fsp--;

             current =iv_ruleEditText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditText1394); 

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
    // $ANTLR end entryRuleEditText


    // $ANTLR start ruleEditText
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:850:1: ruleEditText returns [EObject current=null] : ( 'editText' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleEditText() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        Token lv_label_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:855:6: ( ( 'editText' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:856:1: ( 'editText' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:856:1: ( 'editText' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:856:3: 'editText' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) )
            {
            match(input,26,FOLLOW_26_in_ruleEditText1429); 

                    createLeafNode(grammarAccess.getEditTextAccess().getEditTextKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:860:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:861:5: 
            {
             
                    temp=factory.create(grammarAccess.getEditTextAccess().getEditTextAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getEditTextAccess().getEditTextAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:871:2: ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:871:4: '<' ( (lv_id_3_0= RULE_ID ) ) '>'
                    {
                    match(input,22,FOLLOW_22_in_ruleEditText1449); 

                            createLeafNode(grammarAccess.getEditTextAccess().getLessThanSignKeyword_2_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:875:1: ( (lv_id_3_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:876:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:876:1: (lv_id_3_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:877:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEditText1466); 

                    			createLeafNode(grammarAccess.getEditTextAccess().getIdIDTerminalRuleCall_2_1_0(), "id"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"id",
                    	        		lv_id_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,23,FOLLOW_23_in_ruleEditText1481); 

                            createLeafNode(grammarAccess.getEditTextAccess().getGreaterThanSignKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:903:3: ( (lv_label_5_0= RULE_STRING ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:904:1: (lv_label_5_0= RULE_STRING )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:904:1: (lv_label_5_0= RULE_STRING )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:905:3: lv_label_5_0= RULE_STRING
            {
            lv_label_5_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEditText1500); 

            			createLeafNode(grammarAccess.getEditTextAccess().getLabelSTRINGTerminalRuleCall_3_0(), "label"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"label",
            	        		lv_label_5_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


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
    // $ANTLR end ruleEditText


    // $ANTLR start entryRuleTextView
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:935:1: entryRuleTextView returns [EObject current=null] : iv_ruleTextView= ruleTextView EOF ;
    public final EObject entryRuleTextView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextView = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:936:2: (iv_ruleTextView= ruleTextView EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:937:2: iv_ruleTextView= ruleTextView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleTextView_in_entryRuleTextView1541);
            iv_ruleTextView=ruleTextView();
            _fsp--;

             current =iv_ruleTextView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextView1551); 

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
    // $ANTLR end entryRuleTextView


    // $ANTLR start ruleTextView
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:944:1: ruleTextView returns [EObject current=null] : ( 'textView' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextView() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        Token lv_label_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:949:6: ( ( 'textView' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:950:1: ( 'textView' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:950:1: ( 'textView' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:950:3: 'textView' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_label_5_0= RULE_STRING ) )
            {
            match(input,27,FOLLOW_27_in_ruleTextView1586); 

                    createLeafNode(grammarAccess.getTextViewAccess().getTextViewKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:954:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:955:5: 
            {
             
                    temp=factory.create(grammarAccess.getTextViewAccess().getTextViewAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTextViewAccess().getTextViewAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:965:2: ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:965:4: '<' ( (lv_id_3_0= RULE_ID ) ) '>'
                    {
                    match(input,22,FOLLOW_22_in_ruleTextView1606); 

                            createLeafNode(grammarAccess.getTextViewAccess().getLessThanSignKeyword_2_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:969:1: ( (lv_id_3_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:970:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:970:1: (lv_id_3_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:971:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextView1623); 

                    			createLeafNode(grammarAccess.getTextViewAccess().getIdIDTerminalRuleCall_2_1_0(), "id"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTextViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"id",
                    	        		lv_id_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,23,FOLLOW_23_in_ruleTextView1638); 

                            createLeafNode(grammarAccess.getTextViewAccess().getGreaterThanSignKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:997:3: ( (lv_label_5_0= RULE_STRING ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:998:1: (lv_label_5_0= RULE_STRING )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:998:1: (lv_label_5_0= RULE_STRING )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:999:3: lv_label_5_0= RULE_STRING
            {
            lv_label_5_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextView1657); 

            			createLeafNode(grammarAccess.getTextViewAccess().getLabelSTRINGTerminalRuleCall_3_0(), "label"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTextViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"label",
            	        		lv_label_5_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


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
    // $ANTLR end ruleTextView


    // $ANTLR start entryRuleActivity
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1029:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1030:2: (iv_ruleActivity= ruleActivity EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1031:2: iv_ruleActivity= ruleActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity1698);
            iv_ruleActivity=ruleActivity();
            _fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity1708); 

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
    // $ANTLR end entryRuleActivity


    // $ANTLR start ruleActivity
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1038:1: ruleActivity returns [EObject current=null] : (this_GenericActivity_0= ruleGenericActivity | this_ListActivity_1= ruleListActivity | this_TabActivity_2= ruleTabActivity ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        EObject this_GenericActivity_0 = null;

        EObject this_ListActivity_1 = null;

        EObject this_TabActivity_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1043:6: ( (this_GenericActivity_0= ruleGenericActivity | this_ListActivity_1= ruleListActivity | this_TabActivity_2= ruleTabActivity ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1044:1: (this_GenericActivity_0= ruleGenericActivity | this_ListActivity_1= ruleListActivity | this_TabActivity_2= ruleTabActivity )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1044:1: (this_GenericActivity_0= ruleGenericActivity | this_ListActivity_1= ruleListActivity | this_TabActivity_2= ruleTabActivity )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt16=1;
                }
                break;
            case 29:
                {
                alt16=2;
                }
                break;
            case 32:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1044:1: (this_GenericActivity_0= ruleGenericActivity | this_ListActivity_1= ruleListActivity | this_TabActivity_2= ruleTabActivity )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1045:5: this_GenericActivity_0= ruleGenericActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActivityAccess().getGenericActivityParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGenericActivity_in_ruleActivity1755);
                    this_GenericActivity_0=ruleGenericActivity();
                    _fsp--;

                     
                            current = this_GenericActivity_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1055:5: this_ListActivity_1= ruleListActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActivityAccess().getListActivityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleListActivity_in_ruleActivity1782);
                    this_ListActivity_1=ruleListActivity();
                    _fsp--;

                     
                            current = this_ListActivity_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1065:5: this_TabActivity_2= ruleTabActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActivityAccess().getTabActivityParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTabActivity_in_ruleActivity1809);
                    this_TabActivity_2=ruleTabActivity();
                    _fsp--;

                     
                            current = this_TabActivity_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

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
    // $ANTLR end ruleActivity


    // $ANTLR start entryRuleGenericActivity
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1081:1: entryRuleGenericActivity returns [EObject current=null] : iv_ruleGenericActivity= ruleGenericActivity EOF ;
    public final EObject entryRuleGenericActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericActivity = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1082:2: (iv_ruleGenericActivity= ruleGenericActivity EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1083:2: iv_ruleGenericActivity= ruleGenericActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGenericActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleGenericActivity_in_entryRuleGenericActivity1844);
            iv_ruleGenericActivity=ruleGenericActivity();
            _fsp--;

             current =iv_ruleGenericActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericActivity1854); 

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
    // $ANTLR end entryRuleGenericActivity


    // $ANTLR start ruleGenericActivity
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1090:1: ruleGenericActivity returns [EObject current=null] : ( 'activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}' ) ;
    public final EObject ruleGenericActivity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1095:6: ( ( 'activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1096:1: ( 'activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1096:1: ( 'activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1096:3: 'activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}'
            {
            match(input,28,FOLLOW_28_in_ruleGenericActivity1889); 

                    createLeafNode(grammarAccess.getGenericActivityAccess().getActivityKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1100:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1101:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1101:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1102:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGenericActivityAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGenericActivity1910);
            lv_name_1_0=ruleQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGenericActivityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"QualifiedName", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleGenericActivity1920); 

                    createLeafNode(grammarAccess.getGenericActivityAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1128:1: ( (lv_actions_3_0= ruleAction ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=33 && LA17_0<=37)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1129:1: (lv_actions_3_0= ruleAction )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1129:1: (lv_actions_3_0= ruleAction )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1130:3: lv_actions_3_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGenericActivityAccess().getActionsActionParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleGenericActivity1941);
            	    lv_actions_3_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGenericActivityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actions",
            	    	        		lv_actions_3_0, 
            	    	        		"Action", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleGenericActivity1952); 

                    createLeafNode(grammarAccess.getGenericActivityAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruleGenericActivity


    // $ANTLR start entryRuleListActivity
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1164:1: entryRuleListActivity returns [EObject current=null] : iv_ruleListActivity= ruleListActivity EOF ;
    public final EObject entryRuleListActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListActivity = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1165:2: (iv_ruleListActivity= ruleListActivity EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1166:2: iv_ruleListActivity= ruleListActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getListActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleListActivity_in_entryRuleListActivity1988);
            iv_ruleListActivity=ruleListActivity();
            _fsp--;

             current =iv_ruleListActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListActivity1998); 

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
    // $ANTLR end entryRuleListActivity


    // $ANTLR start ruleListActivity
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1173:1: ruleListActivity returns [EObject current=null] : ( 'list activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' 'data' ( (lv_dataSource_4_0= RULE_ID ) ) ( 'layout' ( ( RULE_ID ) ) )? 'item' ( ( RULE_ID ) ) ( (lv_actions_9_0= ruleAction ) )* '}' ) ;
    public final EObject ruleListActivity() throws RecognitionException {
        EObject current = null;

        Token lv_dataSource_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actions_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1178:6: ( ( 'list activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' 'data' ( (lv_dataSource_4_0= RULE_ID ) ) ( 'layout' ( ( RULE_ID ) ) )? 'item' ( ( RULE_ID ) ) ( (lv_actions_9_0= ruleAction ) )* '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1179:1: ( 'list activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' 'data' ( (lv_dataSource_4_0= RULE_ID ) ) ( 'layout' ( ( RULE_ID ) ) )? 'item' ( ( RULE_ID ) ) ( (lv_actions_9_0= ruleAction ) )* '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1179:1: ( 'list activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' 'data' ( (lv_dataSource_4_0= RULE_ID ) ) ( 'layout' ( ( RULE_ID ) ) )? 'item' ( ( RULE_ID ) ) ( (lv_actions_9_0= ruleAction ) )* '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1179:3: 'list activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' 'data' ( (lv_dataSource_4_0= RULE_ID ) ) ( 'layout' ( ( RULE_ID ) ) )? 'item' ( ( RULE_ID ) ) ( (lv_actions_9_0= ruleAction ) )* '}'
            {
            match(input,29,FOLLOW_29_in_ruleListActivity2033); 

                    createLeafNode(grammarAccess.getListActivityAccess().getListActivityKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1183:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1184:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1184:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1185:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getListActivityAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleListActivity2054);
            lv_name_1_0=ruleQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getListActivityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"QualifiedName", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleListActivity2064); 

                    createLeafNode(grammarAccess.getListActivityAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,30,FOLLOW_30_in_ruleListActivity2074); 

                    createLeafNode(grammarAccess.getListActivityAccess().getDataKeyword_3(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1215:1: ( (lv_dataSource_4_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1216:1: (lv_dataSource_4_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1216:1: (lv_dataSource_4_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1217:3: lv_dataSource_4_0= RULE_ID
            {
            lv_dataSource_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListActivity2091); 

            			createLeafNode(grammarAccess.getListActivityAccess().getDataSourceIDTerminalRuleCall_4_0(), "dataSource"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getListActivityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"dataSource",
            	        		lv_dataSource_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1239:2: ( 'layout' ( ( RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1239:4: 'layout' ( ( RULE_ID ) )
                    {
                    match(input,15,FOLLOW_15_in_ruleListActivity2107); 

                            createLeafNode(grammarAccess.getListActivityAccess().getLayoutKeyword_5_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1243:1: ( ( RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1244:1: ( RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1244:1: ( RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1245:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getListActivityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListActivity2125); 

                    		createLeafNode(grammarAccess.getListActivityAccess().getLayoutLayoutCrossReference_5_1_0(), "layout"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,31,FOLLOW_31_in_ruleListActivity2137); 

                    createLeafNode(grammarAccess.getListActivityAccess().getItemKeyword_6(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1261:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1262:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1262:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1263:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getListActivityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListActivity2155); 

            		createLeafNode(grammarAccess.getListActivityAccess().getItemLayoutLayoutCrossReference_7_0(), "itemLayout"); 
            	

            }


            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1275:2: ( (lv_actions_9_0= ruleAction ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=33 && LA19_0<=37)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1276:1: (lv_actions_9_0= ruleAction )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1276:1: (lv_actions_9_0= ruleAction )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1277:3: lv_actions_9_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getListActivityAccess().getActionsActionParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleListActivity2176);
            	    lv_actions_9_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getListActivityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actions",
            	    	        		lv_actions_9_0, 
            	    	        		"Action", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleListActivity2187); 

                    createLeafNode(grammarAccess.getListActivityAccess().getRightCurlyBracketKeyword_9(), null); 
                

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
    // $ANTLR end ruleListActivity


    // $ANTLR start entryRuleTabActivity
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1311:1: entryRuleTabActivity returns [EObject current=null] : iv_ruleTabActivity= ruleTabActivity EOF ;
    public final EObject entryRuleTabActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabActivity = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1312:2: (iv_ruleTabActivity= ruleTabActivity EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1313:2: iv_ruleTabActivity= ruleTabActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTabActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleTabActivity_in_entryRuleTabActivity2223);
            iv_ruleTabActivity=ruleTabActivity();
            _fsp--;

             current =iv_ruleTabActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabActivity2233); 

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
    // $ANTLR end entryRuleTabActivity


    // $ANTLR start ruleTabActivity
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1320:1: ruleTabActivity returns [EObject current=null] : ( 'tab activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}' ) ;
    public final EObject ruleTabActivity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1325:6: ( ( 'tab activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1326:1: ( 'tab activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1326:1: ( 'tab activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1326:3: 'tab activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}'
            {
            match(input,32,FOLLOW_32_in_ruleTabActivity2268); 

                    createLeafNode(grammarAccess.getTabActivityAccess().getTabActivityKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1330:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1331:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1331:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1332:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTabActivityAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTabActivity2289);
            lv_name_1_0=ruleQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTabActivityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"QualifiedName", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleTabActivity2299); 

                    createLeafNode(grammarAccess.getTabActivityAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1358:1: ( (lv_actions_3_0= ruleAction ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=33 && LA20_0<=37)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1359:1: (lv_actions_3_0= ruleAction )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1359:1: (lv_actions_3_0= ruleAction )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1360:3: lv_actions_3_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTabActivityAccess().getActionsActionParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleTabActivity2320);
            	    lv_actions_3_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTabActivityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actions",
            	    	        		lv_actions_3_0, 
            	    	        		"Action", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleTabActivity2331); 

                    createLeafNode(grammarAccess.getTabActivityAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruleTabActivity


    // $ANTLR start entryRuleAction
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1394:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1395:2: (iv_ruleAction= ruleAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1396:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction2367);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction2377); 

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
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1403:1: ruleAction returns [EObject current=null] : (this_GenericAction_0= ruleGenericAction | this_GoToURLAction_1= ruleGoToURLAction | this_ShowLayoutAction_2= ruleShowLayoutAction | this_InvokeActivityAction_3= ruleInvokeActivityAction | this_LoadResourceAction_4= ruleLoadResourceAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_GenericAction_0 = null;

        EObject this_GoToURLAction_1 = null;

        EObject this_ShowLayoutAction_2 = null;

        EObject this_InvokeActivityAction_3 = null;

        EObject this_LoadResourceAction_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1408:6: ( (this_GenericAction_0= ruleGenericAction | this_GoToURLAction_1= ruleGoToURLAction | this_ShowLayoutAction_2= ruleShowLayoutAction | this_InvokeActivityAction_3= ruleInvokeActivityAction | this_LoadResourceAction_4= ruleLoadResourceAction ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1409:1: (this_GenericAction_0= ruleGenericAction | this_GoToURLAction_1= ruleGoToURLAction | this_ShowLayoutAction_2= ruleShowLayoutAction | this_InvokeActivityAction_3= ruleInvokeActivityAction | this_LoadResourceAction_4= ruleLoadResourceAction )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1409:1: (this_GenericAction_0= ruleGenericAction | this_GoToURLAction_1= ruleGoToURLAction | this_ShowLayoutAction_2= ruleShowLayoutAction | this_InvokeActivityAction_3= ruleInvokeActivityAction | this_LoadResourceAction_4= ruleLoadResourceAction )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt21=1;
                }
                break;
            case 34:
                {
                alt21=2;
                }
                break;
            case 35:
                {
                alt21=3;
                }
                break;
            case 36:
                {
                alt21=4;
                }
                break;
            case 37:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1409:1: (this_GenericAction_0= ruleGenericAction | this_GoToURLAction_1= ruleGoToURLAction | this_ShowLayoutAction_2= ruleShowLayoutAction | this_InvokeActivityAction_3= ruleInvokeActivityAction | this_LoadResourceAction_4= ruleLoadResourceAction )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1410:5: this_GenericAction_0= ruleGenericAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getGenericActionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGenericAction_in_ruleAction2424);
                    this_GenericAction_0=ruleGenericAction();
                    _fsp--;

                     
                            current = this_GenericAction_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1420:5: this_GoToURLAction_1= ruleGoToURLAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getGoToURLActionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGoToURLAction_in_ruleAction2451);
                    this_GoToURLAction_1=ruleGoToURLAction();
                    _fsp--;

                     
                            current = this_GoToURLAction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1430:5: this_ShowLayoutAction_2= ruleShowLayoutAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getShowLayoutActionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleShowLayoutAction_in_ruleAction2478);
                    this_ShowLayoutAction_2=ruleShowLayoutAction();
                    _fsp--;

                     
                            current = this_ShowLayoutAction_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1440:5: this_InvokeActivityAction_3= ruleInvokeActivityAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getInvokeActivityActionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInvokeActivityAction_in_ruleAction2505);
                    this_InvokeActivityAction_3=ruleInvokeActivityAction();
                    _fsp--;

                     
                            current = this_InvokeActivityAction_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1450:5: this_LoadResourceAction_4= ruleLoadResourceAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getLoadResourceActionParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLoadResourceAction_in_ruleAction2532);
                    this_LoadResourceAction_4=ruleLoadResourceAction();
                    _fsp--;

                     
                            current = this_LoadResourceAction_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

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
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleGenericAction
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1466:1: entryRuleGenericAction returns [EObject current=null] : iv_ruleGenericAction= ruleGenericAction EOF ;
    public final EObject entryRuleGenericAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericAction = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1467:2: (iv_ruleGenericAction= ruleGenericAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1468:2: iv_ruleGenericAction= ruleGenericAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGenericActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleGenericAction_in_entryRuleGenericAction2567);
            iv_ruleGenericAction=ruleGenericAction();
            _fsp--;

             current =iv_ruleGenericAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericAction2577); 

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
    // $ANTLR end entryRuleGenericAction


    // $ANTLR start ruleGenericAction
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1475:1: ruleGenericAction returns [EObject current=null] : ( 'action' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleGenericAction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1480:6: ( ( 'action' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1481:1: ( 'action' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1481:1: ( 'action' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1481:3: 'action' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            match(input,33,FOLLOW_33_in_ruleGenericAction2612); 

                    createLeafNode(grammarAccess.getGenericActionAccess().getActionKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1485:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1486:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1486:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1487:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGenericActionAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGenericAction2633);
            lv_name_1_0=ruleQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGenericActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"QualifiedName", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


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
    // $ANTLR end ruleGenericAction


    // $ANTLR start entryRuleGoToURLAction
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1517:1: entryRuleGoToURLAction returns [EObject current=null] : iv_ruleGoToURLAction= ruleGoToURLAction EOF ;
    public final EObject entryRuleGoToURLAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoToURLAction = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1518:2: (iv_ruleGoToURLAction= ruleGoToURLAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1519:2: iv_ruleGoToURLAction= ruleGoToURLAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGoToURLActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleGoToURLAction_in_entryRuleGoToURLAction2669);
            iv_ruleGoToURLAction=ruleGoToURLAction();
            _fsp--;

             current =iv_ruleGoToURLAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoToURLAction2679); 

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
    // $ANTLR end entryRuleGoToURLAction


    // $ANTLR start ruleGoToURLAction
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1526:1: ruleGoToURLAction returns [EObject current=null] : ( 'go to' ( (lv_url_1_0= ruleURL ) ) ) ;
    public final EObject ruleGoToURLAction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_url_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1531:6: ( ( 'go to' ( (lv_url_1_0= ruleURL ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1532:1: ( 'go to' ( (lv_url_1_0= ruleURL ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1532:1: ( 'go to' ( (lv_url_1_0= ruleURL ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1532:3: 'go to' ( (lv_url_1_0= ruleURL ) )
            {
            match(input,34,FOLLOW_34_in_ruleGoToURLAction2714); 

                    createLeafNode(grammarAccess.getGoToURLActionAccess().getGoToKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1536:1: ( (lv_url_1_0= ruleURL ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1537:1: (lv_url_1_0= ruleURL )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1537:1: (lv_url_1_0= ruleURL )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1538:3: lv_url_1_0= ruleURL
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGoToURLActionAccess().getUrlURLParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleURL_in_ruleGoToURLAction2735);
            lv_url_1_0=ruleURL();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGoToURLActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"url",
            	        		lv_url_1_0, 
            	        		"URL", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


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
    // $ANTLR end ruleGoToURLAction


    // $ANTLR start entryRuleShowLayoutAction
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1568:1: entryRuleShowLayoutAction returns [EObject current=null] : iv_ruleShowLayoutAction= ruleShowLayoutAction EOF ;
    public final EObject entryRuleShowLayoutAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShowLayoutAction = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1569:2: (iv_ruleShowLayoutAction= ruleShowLayoutAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1570:2: iv_ruleShowLayoutAction= ruleShowLayoutAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getShowLayoutActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleShowLayoutAction_in_entryRuleShowLayoutAction2771);
            iv_ruleShowLayoutAction=ruleShowLayoutAction();
            _fsp--;

             current =iv_ruleShowLayoutAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShowLayoutAction2781); 

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
    // $ANTLR end entryRuleShowLayoutAction


    // $ANTLR start ruleShowLayoutAction
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1577:1: ruleShowLayoutAction returns [EObject current=null] : ( 'show' ( ( RULE_ID ) ) ) ;
    public final EObject ruleShowLayoutAction() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1582:6: ( ( 'show' ( ( RULE_ID ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1583:1: ( 'show' ( ( RULE_ID ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1583:1: ( 'show' ( ( RULE_ID ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1583:3: 'show' ( ( RULE_ID ) )
            {
            match(input,35,FOLLOW_35_in_ruleShowLayoutAction2816); 

                    createLeafNode(grammarAccess.getShowLayoutActionAccess().getShowKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1587:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1588:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1588:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1589:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getShowLayoutActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleShowLayoutAction2834); 

            		createLeafNode(grammarAccess.getShowLayoutActionAccess().getLayoutLayoutCrossReference_1_0(), "layout"); 
            	

            }


            }


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
    // $ANTLR end ruleShowLayoutAction


    // $ANTLR start entryRuleInvokeActivityAction
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1609:1: entryRuleInvokeActivityAction returns [EObject current=null] : iv_ruleInvokeActivityAction= ruleInvokeActivityAction EOF ;
    public final EObject entryRuleInvokeActivityAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvokeActivityAction = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1610:2: (iv_ruleInvokeActivityAction= ruleInvokeActivityAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1611:2: iv_ruleInvokeActivityAction= ruleInvokeActivityAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInvokeActivityActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInvokeActivityAction_in_entryRuleInvokeActivityAction2870);
            iv_ruleInvokeActivityAction=ruleInvokeActivityAction();
            _fsp--;

             current =iv_ruleInvokeActivityAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvokeActivityAction2880); 

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
    // $ANTLR end entryRuleInvokeActivityAction


    // $ANTLR start ruleInvokeActivityAction
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1618:1: ruleInvokeActivityAction returns [EObject current=null] : ( 'invoke' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleInvokeActivityAction() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1623:6: ( ( 'invoke' ( ( ruleQualifiedName ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1624:1: ( 'invoke' ( ( ruleQualifiedName ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1624:1: ( 'invoke' ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1624:3: 'invoke' ( ( ruleQualifiedName ) )
            {
            match(input,36,FOLLOW_36_in_ruleInvokeActivityAction2915); 

                    createLeafNode(grammarAccess.getInvokeActivityActionAccess().getInvokeKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1628:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1629:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1629:1: ( ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1630:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInvokeActivityActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getInvokeActivityActionAccess().getActivityActivityCrossReference_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInvokeActivityAction2938);
            ruleQualifiedName();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }


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
    // $ANTLR end ruleInvokeActivityAction


    // $ANTLR start entryRuleLoadResourceAction
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1652:1: entryRuleLoadResourceAction returns [EObject current=null] : iv_ruleLoadResourceAction= ruleLoadResourceAction EOF ;
    public final EObject entryRuleLoadResourceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadResourceAction = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1653:2: (iv_ruleLoadResourceAction= ruleLoadResourceAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1654:2: iv_ruleLoadResourceAction= ruleLoadResourceAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoadResourceActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleLoadResourceAction_in_entryRuleLoadResourceAction2974);
            iv_ruleLoadResourceAction=ruleLoadResourceAction();
            _fsp--;

             current =iv_ruleLoadResourceAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadResourceAction2984); 

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
    // $ANTLR end entryRuleLoadResourceAction


    // $ANTLR start ruleLoadResourceAction
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1661:1: ruleLoadResourceAction returns [EObject current=null] : ( 'load' ( (lv_resource_1_0= RULE_ID ) ) ( '->' ( (lv_toVar_3_0= RULE_ID ) ) )? ( '=>' ( (lv_afterLoad_5_0= ruleAction ) ) )? ) ;
    public final EObject ruleLoadResourceAction() throws RecognitionException {
        EObject current = null;

        Token lv_resource_1_0=null;
        Token lv_toVar_3_0=null;
        EObject lv_afterLoad_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1666:6: ( ( 'load' ( (lv_resource_1_0= RULE_ID ) ) ( '->' ( (lv_toVar_3_0= RULE_ID ) ) )? ( '=>' ( (lv_afterLoad_5_0= ruleAction ) ) )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1667:1: ( 'load' ( (lv_resource_1_0= RULE_ID ) ) ( '->' ( (lv_toVar_3_0= RULE_ID ) ) )? ( '=>' ( (lv_afterLoad_5_0= ruleAction ) ) )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1667:1: ( 'load' ( (lv_resource_1_0= RULE_ID ) ) ( '->' ( (lv_toVar_3_0= RULE_ID ) ) )? ( '=>' ( (lv_afterLoad_5_0= ruleAction ) ) )? )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1667:3: 'load' ( (lv_resource_1_0= RULE_ID ) ) ( '->' ( (lv_toVar_3_0= RULE_ID ) ) )? ( '=>' ( (lv_afterLoad_5_0= ruleAction ) ) )?
            {
            match(input,37,FOLLOW_37_in_ruleLoadResourceAction3019); 

                    createLeafNode(grammarAccess.getLoadResourceActionAccess().getLoadKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1671:1: ( (lv_resource_1_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1672:1: (lv_resource_1_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1672:1: (lv_resource_1_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1673:3: lv_resource_1_0= RULE_ID
            {
            lv_resource_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLoadResourceAction3036); 

            			createLeafNode(grammarAccess.getLoadResourceActionAccess().getResourceIDTerminalRuleCall_1_0(), "resource"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoadResourceActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"resource",
            	        		lv_resource_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1695:2: ( '->' ( (lv_toVar_3_0= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_ID) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1695:4: '->' ( (lv_toVar_3_0= RULE_ID ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleLoadResourceAction3052); 

                            createLeafNode(grammarAccess.getLoadResourceActionAccess().getHyphenMinusGreaterThanSignKeyword_2_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1699:1: ( (lv_toVar_3_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1700:1: (lv_toVar_3_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1700:1: (lv_toVar_3_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1701:3: lv_toVar_3_0= RULE_ID
                    {
                    lv_toVar_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLoadResourceAction3069); 

                    			createLeafNode(grammarAccess.getLoadResourceActionAccess().getToVarIDTerminalRuleCall_2_1_0(), "toVar"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLoadResourceActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"toVar",
                    	        		lv_toVar_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1723:4: ( '=>' ( (lv_afterLoad_5_0= ruleAction ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1723:6: '=>' ( (lv_afterLoad_5_0= ruleAction ) )
                    {
                    match(input,38,FOLLOW_38_in_ruleLoadResourceAction3087); 

                            createLeafNode(grammarAccess.getLoadResourceActionAccess().getEqualsSignGreaterThanSignKeyword_3_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1727:1: ( (lv_afterLoad_5_0= ruleAction ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1728:1: (lv_afterLoad_5_0= ruleAction )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1728:1: (lv_afterLoad_5_0= ruleAction )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1729:3: lv_afterLoad_5_0= ruleAction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLoadResourceActionAccess().getAfterLoadActionParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAction_in_ruleLoadResourceAction3108);
                    lv_afterLoad_5_0=ruleAction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLoadResourceActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"afterLoad",
                    	        		lv_afterLoad_5_0, 
                    	        		"Action", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end ruleLoadResourceAction


    // $ANTLR start entryRuleQualifiedName
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1759:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1760:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1761:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3147);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3158); 

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
    // $ANTLR end entryRuleQualifiedName


    // $ANTLR start ruleQualifiedName
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1768:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1773:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1774:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1774:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1774:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3198); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1781:1: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1782:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,39,FOLLOW_39_in_ruleQualifiedName3217); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3232); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


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
    // $ANTLR end ruleQualifiedName


    // $ANTLR start entryRuleURL
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1802:1: entryRuleURL returns [String current=null] : iv_ruleURL= ruleURL EOF ;
    public final String entryRuleURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1803:2: (iv_ruleURL= ruleURL EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1804:2: iv_ruleURL= ruleURL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getURLRule(), currentNode); 
            pushFollow(FOLLOW_ruleURL_in_entryRuleURL3280);
            iv_ruleURL=ruleURL();
            _fsp--;

             current =iv_ruleURL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURL3291); 

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
    // $ANTLR end entryRuleURL


    // $ANTLR start ruleURL
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1811:1: ruleURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '://' this_QualifiedName_2= ruleQualifiedName (kw= '/' (this_QualifiedName_4= ruleQualifiedName kw= '/' )* )? ) ;
    public final AntlrDatatypeRuleToken ruleURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_2 = null;

        AntlrDatatypeRuleToken this_QualifiedName_4 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1816:6: ( (this_ID_0= RULE_ID kw= '://' this_QualifiedName_2= ruleQualifiedName (kw= '/' (this_QualifiedName_4= ruleQualifiedName kw= '/' )* )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1817:1: (this_ID_0= RULE_ID kw= '://' this_QualifiedName_2= ruleQualifiedName (kw= '/' (this_QualifiedName_4= ruleQualifiedName kw= '/' )* )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1817:1: (this_ID_0= RULE_ID kw= '://' this_QualifiedName_2= ruleQualifiedName (kw= '/' (this_QualifiedName_4= ruleQualifiedName kw= '/' )* )? )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1817:6: this_ID_0= RULE_ID kw= '://' this_QualifiedName_2= ruleQualifiedName (kw= '/' (this_QualifiedName_4= ruleQualifiedName kw= '/' )* )?
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURL3331); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getURLAccess().getIDTerminalRuleCall_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,40,FOLLOW_40_in_ruleURL3349); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getURLAccess().getColonSolidusSolidusKeyword_1(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getURLAccess().getQualifiedNameParserRuleCall_2(), currentNode); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleURL3371);
            this_QualifiedName_2=ruleQualifiedName();
            _fsp--;


            		current.merge(this_QualifiedName_2);
                
             
                    currentNode = currentNode.getParent();
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1841:1: (kw= '/' (this_QualifiedName_4= ruleQualifiedName kw= '/' )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1842:2: kw= '/' (this_QualifiedName_4= ruleQualifiedName kw= '/' )*
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleURL3390); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getURLAccess().getSolidusKeyword_3_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1847:1: (this_QualifiedName_4= ruleQualifiedName kw= '/' )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1848:5: this_QualifiedName_4= ruleQualifiedName kw= '/'
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getURLAccess().getQualifiedNameParserRuleCall_3_1_0(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleURL3413);
                    	    this_QualifiedName_4=ruleQualifiedName();
                    	    _fsp--;


                    	    		current.merge(this_QualifiedName_4);
                    	        
                    	     
                    	            currentNode = currentNode.getParent();
                    	        
                    	    kw=(Token)input.LT(1);
                    	    match(input,41,FOLLOW_41_in_ruleURL3431); 

                    	            current.merge(kw);
                    	            createLeafNode(grammarAccess.getURLAccess().getSolidusKeyword_3_1_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end ruleURL


 

    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleApplication120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplication137 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleApplication163 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication174 = new BitSet(new long[]{0x000000013000C000L});
    public static final BitSet FOLLOW_ruleManifestFile_in_ruleApplication195 = new BitSet(new long[]{0x0000000130008000L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleApplication217 = new BitSet(new long[]{0x0000000130008000L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleApplication239 = new BitSet(new long[]{0x0000000130002000L});
    public static final BitSet FOLLOW_13_in_ruleApplication250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManifestFile_in_entryRuleManifestFile288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManifestFile298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleManifestFile342 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleManifestFile352 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleManifestFile362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleLayout443 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLayout460 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLayout475 = new BitSet(new long[]{0x000000000F202000L});
    public static final BitSet FOLLOW_ruleWidget_in_ruleLayout496 = new BitSet(new long[]{0x000000000F202000L});
    public static final BitSet FOLLOW_13_in_ruleLayout507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericWidget_in_ruleWidget601 = new BitSet(new long[]{0x00000000001D0002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleWidget628 = new BitSet(new long[]{0x00000000001D0002L});
    public static final BitSet FOLLOW_ruleSpinner_in_ruleWidget655 = new BitSet(new long[]{0x00000000001D0002L});
    public static final BitSet FOLLOW_ruleEditText_in_ruleWidget682 = new BitSet(new long[]{0x00000000001D0002L});
    public static final BitSet FOLLOW_ruleTextView_in_ruleWidget709 = new BitSet(new long[]{0x00000000001D0002L});
    public static final BitSet FOLLOW_16_in_ruleWidget720 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWidget730 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWidget747 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_18_in_ruleWidget765 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWidget775 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWidget792 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleWidget810 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWidget820 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWidget837 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleWidget855 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleWidget876 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleGenericWidget_in_entryRuleGenericWidget914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericWidget924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleGenericWidget959 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_22_in_ruleGenericWidget979 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGenericWidget996 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleGenericWidget1011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGenericWidget1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton1070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleButton1115 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleButton1135 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleButton1152 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleButton1167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButton1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinner_in_entryRuleSpinner1227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpinner1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSpinner1272 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleSpinner1292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpinner1309 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSpinner1324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpinner1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditText_in_entryRuleEditText1384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditText1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEditText1429 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleEditText1449 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEditText1466 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEditText1481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEditText1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextView_in_entryRuleTextView1541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextView1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTextView1586 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleTextView1606 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextView1623 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTextView1638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextView1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericActivity_in_ruleActivity1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListActivity_in_ruleActivity1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabActivity_in_ruleActivity1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericActivity_in_entryRuleGenericActivity1844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericActivity1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleGenericActivity1889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGenericActivity1910 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGenericActivity1920 = new BitSet(new long[]{0x0000003E00002000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleGenericActivity1941 = new BitSet(new long[]{0x0000003E00002000L});
    public static final BitSet FOLLOW_13_in_ruleGenericActivity1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListActivity_in_entryRuleListActivity1988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListActivity1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleListActivity2033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleListActivity2054 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleListActivity2064 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleListActivity2074 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListActivity2091 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_15_in_ruleListActivity2107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListActivity2125 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleListActivity2137 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListActivity2155 = new BitSet(new long[]{0x0000003E00002000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleListActivity2176 = new BitSet(new long[]{0x0000003E00002000L});
    public static final BitSet FOLLOW_13_in_ruleListActivity2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabActivity_in_entryRuleTabActivity2223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabActivity2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTabActivity2268 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTabActivity2289 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTabActivity2299 = new BitSet(new long[]{0x0000003E00002000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleTabActivity2320 = new BitSet(new long[]{0x0000003E00002000L});
    public static final BitSet FOLLOW_13_in_ruleTabActivity2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericAction_in_ruleAction2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoToURLAction_in_ruleAction2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShowLayoutAction_in_ruleAction2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeActivityAction_in_ruleAction2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadResourceAction_in_ruleAction2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericAction_in_entryRuleGenericAction2567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericAction2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleGenericAction2612 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGenericAction2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoToURLAction_in_entryRuleGoToURLAction2669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoToURLAction2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleGoToURLAction2714 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleURL_in_ruleGoToURLAction2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShowLayoutAction_in_entryRuleShowLayoutAction2771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShowLayoutAction2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleShowLayoutAction2816 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleShowLayoutAction2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeActivityAction_in_entryRuleInvokeActivityAction2870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvokeActivityAction2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInvokeActivityAction2915 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInvokeActivityAction2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadResourceAction_in_entryRuleLoadResourceAction2974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadResourceAction2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleLoadResourceAction3019 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLoadResourceAction3036 = new BitSet(new long[]{0x0000004000100002L});
    public static final BitSet FOLLOW_20_in_ruleLoadResourceAction3052 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLoadResourceAction3069 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleLoadResourceAction3087 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleLoadResourceAction3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3198 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedName3217 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3232 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleURL_in_entryRuleURL3280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURL3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURL3331 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleURL3349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleURL3371 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleURL3390 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleURL3413 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleURL3431 = new BitSet(new long[]{0x0000000000000022L});

}