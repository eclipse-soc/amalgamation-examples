package org.eclipse.amalgam.tutorials.xtext.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEX_COLOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'{'", "'}'", "'manifest'", "'resource'", "'menu'", "'string'", "'='", "'integer'", "'bool'", "'color'", "'dimension'", "'bitmap'", "'transition'", "'<->'", "'animation'", "'layout'", "'widget'", "'<'", "'>'", "'top:'", "'left:'", "'width:'", "'height:'", "'background:'", "'clickable?'", "'fadeScrollBars?'", "'isScrollContainer?'", "'->'", "'textView'", "'hint:'", "'textColor:'", "'button'", "'imageButton'", "'link'", "'to'", "'spinner'", "'prompt:'", "'editText'", "'editable?'", "'numeric?'", "'password?'", "'phoneNumber?'", "'activity'", "'listActivity'", "'data'", "'item'", "'tabActivity'", "'tab'", "'action'", "'goTo'", "'show'", "'invoke'", "'load'", "'=>'", "'('", "')'", "'.'", "'YES'", "'NO'", "'://'", "'/'", "'dp'", "'sp'", "'pt'", "'px'", "'mm'", "'in'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_HEX_COLOR=7;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:78:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:79:2: (iv_ruleApplication= ruleApplication EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:80:2: iv_ruleApplication= ruleApplication EOF
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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:87:1: ruleApplication returns [EObject current=null] : ( 'application' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_package_2_0= ruleQualifiedName ) )? '{' ( (lv_manifest_4_0= ruleManifestFile ) )? ( ( (lv_resources_5_0= ruleResource ) ) | ( (lv_layouts_6_0= ruleLayout ) ) | ( (lv_activities_7_0= ruleActivity ) ) )+ '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_package_2_0 = null;

        EObject lv_manifest_4_0 = null;

        EObject lv_resources_5_0 = null;

        EObject lv_layouts_6_0 = null;

        EObject lv_activities_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:92:6: ( ( 'application' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_package_2_0= ruleQualifiedName ) )? '{' ( (lv_manifest_4_0= ruleManifestFile ) )? ( ( (lv_resources_5_0= ruleResource ) ) | ( (lv_layouts_6_0= ruleLayout ) ) | ( (lv_activities_7_0= ruleActivity ) ) )+ '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:93:1: ( 'application' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_package_2_0= ruleQualifiedName ) )? '{' ( (lv_manifest_4_0= ruleManifestFile ) )? ( ( (lv_resources_5_0= ruleResource ) ) | ( (lv_layouts_6_0= ruleLayout ) ) | ( (lv_activities_7_0= ruleActivity ) ) )+ '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:93:1: ( 'application' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_package_2_0= ruleQualifiedName ) )? '{' ( (lv_manifest_4_0= ruleManifestFile ) )? ( ( (lv_resources_5_0= ruleResource ) ) | ( (lv_layouts_6_0= ruleLayout ) ) | ( (lv_activities_7_0= ruleActivity ) ) )+ '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:93:3: 'application' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_package_2_0= ruleQualifiedName ) )? '{' ( (lv_manifest_4_0= ruleManifestFile ) )? ( ( (lv_resources_5_0= ruleResource ) ) | ( (lv_layouts_6_0= ruleLayout ) ) | ( (lv_activities_7_0= ruleActivity ) ) )+ '}'
            {
            match(input,12,FOLLOW_12_in_ruleApplication120); 

                    createLeafNode(grammarAccess.getApplicationAccess().getApplicationKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:97:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:98:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:98:1: (lv_name_1_0= RULE_STRING )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:99:3: lv_name_1_0= RULE_STRING
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

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:121:2: ( (lv_package_2_0= ruleQualifiedName ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:122:1: (lv_package_2_0= ruleQualifiedName )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:122:1: (lv_package_2_0= ruleQualifiedName )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:123:3: lv_package_2_0= ruleQualifiedName
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

            match(input,13,FOLLOW_13_in_ruleApplication174); 

                    createLeafNode(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:149:1: ( (lv_manifest_4_0= ruleManifestFile ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:150:1: (lv_manifest_4_0= ruleManifestFile )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:150:1: (lv_manifest_4_0= ruleManifestFile )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:151:3: lv_manifest_4_0= ruleManifestFile
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

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:173:3: ( ( (lv_resources_5_0= ruleResource ) ) | ( (lv_layouts_6_0= ruleLayout ) ) | ( (lv_activities_7_0= ruleActivity ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 16:
                case 17:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 27:
                    {
                    alt3=1;
                    }
                    break;
                case 28:
                    {
                    alt3=2;
                    }
                    break;
                case 55:
                case 56:
                case 59:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:173:4: ( (lv_resources_5_0= ruleResource ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:173:4: ( (lv_resources_5_0= ruleResource ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:174:1: (lv_resources_5_0= ruleResource )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:174:1: (lv_resources_5_0= ruleResource )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:175:3: lv_resources_5_0= ruleResource
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getResourcesResourceParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleResource_in_ruleApplication218);
            	    lv_resources_5_0=ruleResource();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"resources",
            	    	        		lv_resources_5_0, 
            	    	        		"Resource", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:198:6: ( (lv_layouts_6_0= ruleLayout ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:198:6: ( (lv_layouts_6_0= ruleLayout ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:199:1: (lv_layouts_6_0= ruleLayout )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:199:1: (lv_layouts_6_0= ruleLayout )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:200:3: lv_layouts_6_0= ruleLayout
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getLayoutsLayoutParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLayout_in_ruleApplication245);
            	    lv_layouts_6_0=ruleLayout();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"layouts",
            	    	        		lv_layouts_6_0, 
            	    	        		"Layout", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:223:6: ( (lv_activities_7_0= ruleActivity ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:223:6: ( (lv_activities_7_0= ruleActivity ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:224:1: (lv_activities_7_0= ruleActivity )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:224:1: (lv_activities_7_0= ruleActivity )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:225:3: lv_activities_7_0= ruleActivity
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getActivitiesActivityParserRuleCall_5_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivity_in_ruleApplication272);
            	    lv_activities_7_0=ruleActivity();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"activities",
            	    	        		lv_activities_7_0, 
            	    	        		"Activity", 
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match(input,14,FOLLOW_14_in_ruleApplication284); 

                    createLeafNode(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_6(), null); 
                

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:259:1: entryRuleManifestFile returns [EObject current=null] : iv_ruleManifestFile= ruleManifestFile EOF ;
    public final EObject entryRuleManifestFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManifestFile = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:260:2: (iv_ruleManifestFile= ruleManifestFile EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:261:2: iv_ruleManifestFile= ruleManifestFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getManifestFileRule(), currentNode); 
            pushFollow(FOLLOW_ruleManifestFile_in_entryRuleManifestFile320);
            iv_ruleManifestFile=ruleManifestFile();
            _fsp--;

             current =iv_ruleManifestFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManifestFile330); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:268:1: ruleManifestFile returns [EObject current=null] : ( () 'manifest' '{' '}' ) ;
    public final EObject ruleManifestFile() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:273:6: ( ( () 'manifest' '{' '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:274:1: ( () 'manifest' '{' '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:274:1: ( () 'manifest' '{' '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:274:2: () 'manifest' '{' '}'
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:274:2: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:275:5: 
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

            match(input,15,FOLLOW_15_in_ruleManifestFile374); 

                    createLeafNode(grammarAccess.getManifestFileAccess().getManifestKeyword_1(), null); 
                
            match(input,13,FOLLOW_13_in_ruleManifestFile384); 

                    createLeafNode(grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,14,FOLLOW_14_in_ruleManifestFile394); 

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


    // $ANTLR start entryRuleResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:305:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:306:2: (iv_ruleResource= ruleResource EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:307:2: iv_ruleResource= ruleResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource430);
            iv_ruleResource=ruleResource();
            _fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource440); 

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
    // $ANTLR end entryRuleResource


    // $ANTLR start ruleResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:314:1: ruleResource returns [EObject current=null] : (this_GenericResource_0= ruleGenericResource | this_MenuResource_1= ruleMenuResource | this_ValueResource_2= ruleValueResource | this_DrawableResource_3= ruleDrawableResource | this_AnimationResource_4= ruleAnimationResource ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        EObject this_GenericResource_0 = null;

        EObject this_MenuResource_1 = null;

        EObject this_ValueResource_2 = null;

        EObject this_DrawableResource_3 = null;

        EObject this_AnimationResource_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:319:6: ( (this_GenericResource_0= ruleGenericResource | this_MenuResource_1= ruleMenuResource | this_ValueResource_2= ruleValueResource | this_DrawableResource_3= ruleDrawableResource | this_AnimationResource_4= ruleAnimationResource ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:320:1: (this_GenericResource_0= ruleGenericResource | this_MenuResource_1= ruleMenuResource | this_ValueResource_2= ruleValueResource | this_DrawableResource_3= ruleDrawableResource | this_AnimationResource_4= ruleAnimationResource )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:320:1: (this_GenericResource_0= ruleGenericResource | this_MenuResource_1= ruleMenuResource | this_ValueResource_2= ruleValueResource | this_DrawableResource_3= ruleDrawableResource | this_AnimationResource_4= ruleAnimationResource )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
                {
                alt4=3;
                }
                break;
            case 24:
            case 25:
                {
                alt4=4;
                }
                break;
            case 27:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("320:1: (this_GenericResource_0= ruleGenericResource | this_MenuResource_1= ruleMenuResource | this_ValueResource_2= ruleValueResource | this_DrawableResource_3= ruleDrawableResource | this_AnimationResource_4= ruleAnimationResource )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:321:5: this_GenericResource_0= ruleGenericResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getResourceAccess().getGenericResourceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGenericResource_in_ruleResource487);
                    this_GenericResource_0=ruleGenericResource();
                    _fsp--;

                     
                            current = this_GenericResource_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:331:5: this_MenuResource_1= ruleMenuResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getResourceAccess().getMenuResourceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMenuResource_in_ruleResource514);
                    this_MenuResource_1=ruleMenuResource();
                    _fsp--;

                     
                            current = this_MenuResource_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:341:5: this_ValueResource_2= ruleValueResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getResourceAccess().getValueResourceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleValueResource_in_ruleResource541);
                    this_ValueResource_2=ruleValueResource();
                    _fsp--;

                     
                            current = this_ValueResource_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:351:5: this_DrawableResource_3= ruleDrawableResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getResourceAccess().getDrawableResourceParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDrawableResource_in_ruleResource568);
                    this_DrawableResource_3=ruleDrawableResource();
                    _fsp--;

                     
                            current = this_DrawableResource_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:361:5: this_AnimationResource_4= ruleAnimationResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getResourceAccess().getAnimationResourceParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnimationResource_in_ruleResource595);
                    this_AnimationResource_4=ruleAnimationResource();
                    _fsp--;

                     
                            current = this_AnimationResource_4; 
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
    // $ANTLR end ruleResource


    // $ANTLR start entryRuleGenericResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:377:1: entryRuleGenericResource returns [EObject current=null] : iv_ruleGenericResource= ruleGenericResource EOF ;
    public final EObject entryRuleGenericResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericResource = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:378:2: (iv_ruleGenericResource= ruleGenericResource EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:379:2: iv_ruleGenericResource= ruleGenericResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGenericResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleGenericResource_in_entryRuleGenericResource630);
            iv_ruleGenericResource=ruleGenericResource();
            _fsp--;

             current =iv_ruleGenericResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericResource640); 

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
    // $ANTLR end entryRuleGenericResource


    // $ANTLR start ruleGenericResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:386:1: ruleGenericResource returns [EObject current=null] : ( 'resource' () ( (lv_name_2_0= RULE_ID ) ) '{' '}' ) ;
    public final EObject ruleGenericResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:391:6: ( ( 'resource' () ( (lv_name_2_0= RULE_ID ) ) '{' '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:392:1: ( 'resource' () ( (lv_name_2_0= RULE_ID ) ) '{' '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:392:1: ( 'resource' () ( (lv_name_2_0= RULE_ID ) ) '{' '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:392:3: 'resource' () ( (lv_name_2_0= RULE_ID ) ) '{' '}'
            {
            match(input,16,FOLLOW_16_in_ruleGenericResource675); 

                    createLeafNode(grammarAccess.getGenericResourceAccess().getResourceKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:396:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:397:5: 
            {
             
                    temp=factory.create(grammarAccess.getGenericResourceAccess().getGenericResourceAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getGenericResourceAccess().getGenericResourceAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:407:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:408:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:408:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:409:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGenericResource701); 

            			createLeafNode(grammarAccess.getGenericResourceAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGenericResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleGenericResource716); 

                    createLeafNode(grammarAccess.getGenericResourceAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            match(input,14,FOLLOW_14_in_ruleGenericResource726); 

                    createLeafNode(grammarAccess.getGenericResourceAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruleGenericResource


    // $ANTLR start entryRuleMenuResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:447:1: entryRuleMenuResource returns [EObject current=null] : iv_ruleMenuResource= ruleMenuResource EOF ;
    public final EObject entryRuleMenuResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenuResource = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:448:2: (iv_ruleMenuResource= ruleMenuResource EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:449:2: iv_ruleMenuResource= ruleMenuResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMenuResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleMenuResource_in_entryRuleMenuResource762);
            iv_ruleMenuResource=ruleMenuResource();
            _fsp--;

             current =iv_ruleMenuResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMenuResource772); 

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
    // $ANTLR end entryRuleMenuResource


    // $ANTLR start ruleMenuResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:456:1: ruleMenuResource returns [EObject current=null] : ( 'menu' () ( (lv_name_2_0= RULE_ID ) ) '{' '}' ) ;
    public final EObject ruleMenuResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:461:6: ( ( 'menu' () ( (lv_name_2_0= RULE_ID ) ) '{' '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:462:1: ( 'menu' () ( (lv_name_2_0= RULE_ID ) ) '{' '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:462:1: ( 'menu' () ( (lv_name_2_0= RULE_ID ) ) '{' '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:462:3: 'menu' () ( (lv_name_2_0= RULE_ID ) ) '{' '}'
            {
            match(input,17,FOLLOW_17_in_ruleMenuResource807); 

                    createLeafNode(grammarAccess.getMenuResourceAccess().getMenuKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:466:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:467:5: 
            {
             
                    temp=factory.create(grammarAccess.getMenuResourceAccess().getMenuResourceAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getMenuResourceAccess().getMenuResourceAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:477:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:478:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:478:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:479:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMenuResource833); 

            			createLeafNode(grammarAccess.getMenuResourceAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMenuResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleMenuResource848); 

                    createLeafNode(grammarAccess.getMenuResourceAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            match(input,14,FOLLOW_14_in_ruleMenuResource858); 

                    createLeafNode(grammarAccess.getMenuResourceAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruleMenuResource


    // $ANTLR start entryRuleValueResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:517:1: entryRuleValueResource returns [EObject current=null] : iv_ruleValueResource= ruleValueResource EOF ;
    public final EObject entryRuleValueResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueResource = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:518:2: (iv_ruleValueResource= ruleValueResource EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:519:2: iv_ruleValueResource= ruleValueResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleValueResource_in_entryRuleValueResource894);
            iv_ruleValueResource=ruleValueResource();
            _fsp--;

             current =iv_ruleValueResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueResource904); 

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
    // $ANTLR end entryRuleValueResource


    // $ANTLR start ruleValueResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:526:1: ruleValueResource returns [EObject current=null] : (this_StringValueResource_0= ruleStringValueResource | this_IntegerValueResource_1= ruleIntegerValueResource | this_BooleanValueResource_2= ruleBooleanValueResource | this_ColorValueResource_3= ruleColorValueResource | this_DimensionValueResource_4= ruleDimensionValueResource ) ;
    public final EObject ruleValueResource() throws RecognitionException {
        EObject current = null;

        EObject this_StringValueResource_0 = null;

        EObject this_IntegerValueResource_1 = null;

        EObject this_BooleanValueResource_2 = null;

        EObject this_ColorValueResource_3 = null;

        EObject this_DimensionValueResource_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:531:6: ( (this_StringValueResource_0= ruleStringValueResource | this_IntegerValueResource_1= ruleIntegerValueResource | this_BooleanValueResource_2= ruleBooleanValueResource | this_ColorValueResource_3= ruleColorValueResource | this_DimensionValueResource_4= ruleDimensionValueResource ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:532:1: (this_StringValueResource_0= ruleStringValueResource | this_IntegerValueResource_1= ruleIntegerValueResource | this_BooleanValueResource_2= ruleBooleanValueResource | this_ColorValueResource_3= ruleColorValueResource | this_DimensionValueResource_4= ruleDimensionValueResource )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:532:1: (this_StringValueResource_0= ruleStringValueResource | this_IntegerValueResource_1= ruleIntegerValueResource | this_BooleanValueResource_2= ruleBooleanValueResource | this_ColorValueResource_3= ruleColorValueResource | this_DimensionValueResource_4= ruleDimensionValueResource )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 22:
                {
                alt5=4;
                }
                break;
            case 23:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("532:1: (this_StringValueResource_0= ruleStringValueResource | this_IntegerValueResource_1= ruleIntegerValueResource | this_BooleanValueResource_2= ruleBooleanValueResource | this_ColorValueResource_3= ruleColorValueResource | this_DimensionValueResource_4= ruleDimensionValueResource )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:533:5: this_StringValueResource_0= ruleStringValueResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueResourceAccess().getStringValueResourceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringValueResource_in_ruleValueResource951);
                    this_StringValueResource_0=ruleStringValueResource();
                    _fsp--;

                     
                            current = this_StringValueResource_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:543:5: this_IntegerValueResource_1= ruleIntegerValueResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueResourceAccess().getIntegerValueResourceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntegerValueResource_in_ruleValueResource978);
                    this_IntegerValueResource_1=ruleIntegerValueResource();
                    _fsp--;

                     
                            current = this_IntegerValueResource_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:553:5: this_BooleanValueResource_2= ruleBooleanValueResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueResourceAccess().getBooleanValueResourceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanValueResource_in_ruleValueResource1005);
                    this_BooleanValueResource_2=ruleBooleanValueResource();
                    _fsp--;

                     
                            current = this_BooleanValueResource_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:563:5: this_ColorValueResource_3= ruleColorValueResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueResourceAccess().getColorValueResourceParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleColorValueResource_in_ruleValueResource1032);
                    this_ColorValueResource_3=ruleColorValueResource();
                    _fsp--;

                     
                            current = this_ColorValueResource_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:573:5: this_DimensionValueResource_4= ruleDimensionValueResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueResourceAccess().getDimensionValueResourceParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDimensionValueResource_in_ruleValueResource1059);
                    this_DimensionValueResource_4=ruleDimensionValueResource();
                    _fsp--;

                     
                            current = this_DimensionValueResource_4; 
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
    // $ANTLR end ruleValueResource


    // $ANTLR start entryRuleStringValueResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:589:1: entryRuleStringValueResource returns [EObject current=null] : iv_ruleStringValueResource= ruleStringValueResource EOF ;
    public final EObject entryRuleStringValueResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueResource = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:590:2: (iv_ruleStringValueResource= ruleStringValueResource EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:591:2: iv_ruleStringValueResource= ruleStringValueResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringValueResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringValueResource_in_entryRuleStringValueResource1094);
            iv_ruleStringValueResource=ruleStringValueResource();
            _fsp--;

             current =iv_ruleStringValueResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValueResource1104); 

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
    // $ANTLR end entryRuleStringValueResource


    // $ANTLR start ruleStringValueResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:598:1: ruleStringValueResource returns [EObject current=null] : ( 'string' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValueResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_value_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:603:6: ( ( 'string' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:604:1: ( 'string' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:604:1: ( 'string' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:604:3: 'string' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            match(input,18,FOLLOW_18_in_ruleStringValueResource1139); 

                    createLeafNode(grammarAccess.getStringValueResourceAccess().getStringKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:608:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:609:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:609:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:610:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringValueResource1156); 

            			createLeafNode(grammarAccess.getStringValueResourceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringValueResourceRule().getType().getClassifier());
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

            match(input,19,FOLLOW_19_in_ruleStringValueResource1171); 

                    createLeafNode(grammarAccess.getStringValueResourceAccess().getEqualsSignKeyword_2(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:636:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:637:1: (lv_value_3_0= RULE_STRING )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:637:1: (lv_value_3_0= RULE_STRING )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:638:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValueResource1188); 

            			createLeafNode(grammarAccess.getStringValueResourceAccess().getValueSTRINGTerminalRuleCall_3_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringValueResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_3_0, 
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
    // $ANTLR end ruleStringValueResource


    // $ANTLR start entryRuleIntegerValueResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:668:1: entryRuleIntegerValueResource returns [EObject current=null] : iv_ruleIntegerValueResource= ruleIntegerValueResource EOF ;
    public final EObject entryRuleIntegerValueResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueResource = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:669:2: (iv_ruleIntegerValueResource= ruleIntegerValueResource EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:670:2: iv_ruleIntegerValueResource= ruleIntegerValueResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerValueResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntegerValueResource_in_entryRuleIntegerValueResource1229);
            iv_ruleIntegerValueResource=ruleIntegerValueResource();
            _fsp--;

             current =iv_ruleIntegerValueResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValueResource1239); 

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
    // $ANTLR end entryRuleIntegerValueResource


    // $ANTLR start ruleIntegerValueResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:677:1: ruleIntegerValueResource returns [EObject current=null] : ( 'integer' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerValueResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_value_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:682:6: ( ( 'integer' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:683:1: ( 'integer' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:683:1: ( 'integer' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_INT ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:683:3: 'integer' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_INT ) )
            {
            match(input,20,FOLLOW_20_in_ruleIntegerValueResource1274); 

                    createLeafNode(grammarAccess.getIntegerValueResourceAccess().getIntegerKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:687:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:688:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:688:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:689:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerValueResource1291); 

            			createLeafNode(grammarAccess.getIntegerValueResourceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntegerValueResourceRule().getType().getClassifier());
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

            match(input,19,FOLLOW_19_in_ruleIntegerValueResource1306); 

                    createLeafNode(grammarAccess.getIntegerValueResourceAccess().getEqualsSignKeyword_2(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:715:1: ( (lv_value_3_0= RULE_INT ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:716:1: (lv_value_3_0= RULE_INT )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:716:1: (lv_value_3_0= RULE_INT )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:717:3: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerValueResource1323); 

            			createLeafNode(grammarAccess.getIntegerValueResourceAccess().getValueINTTerminalRuleCall_3_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntegerValueResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_3_0, 
            	        		"INT", 
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
    // $ANTLR end ruleIntegerValueResource


    // $ANTLR start entryRuleBooleanValueResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:747:1: entryRuleBooleanValueResource returns [EObject current=null] : iv_ruleBooleanValueResource= ruleBooleanValueResource EOF ;
    public final EObject entryRuleBooleanValueResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueResource = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:748:2: (iv_ruleBooleanValueResource= ruleBooleanValueResource EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:749:2: iv_ruleBooleanValueResource= ruleBooleanValueResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanValueResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanValueResource_in_entryRuleBooleanValueResource1364);
            iv_ruleBooleanValueResource=ruleBooleanValueResource();
            _fsp--;

             current =iv_ruleBooleanValueResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValueResource1374); 

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
    // $ANTLR end entryRuleBooleanValueResource


    // $ANTLR start ruleBooleanValueResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:756:1: ruleBooleanValueResource returns [EObject current=null] : ( 'bool' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleBOOL ) ) ) ;
    public final EObject ruleBooleanValueResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:761:6: ( ( 'bool' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleBOOL ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:762:1: ( 'bool' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleBOOL ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:762:1: ( 'bool' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleBOOL ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:762:3: 'bool' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleBOOL ) )
            {
            match(input,21,FOLLOW_21_in_ruleBooleanValueResource1409); 

                    createLeafNode(grammarAccess.getBooleanValueResourceAccess().getBoolKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:766:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:767:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:767:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:768:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanValueResource1426); 

            			createLeafNode(grammarAccess.getBooleanValueResourceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBooleanValueResourceRule().getType().getClassifier());
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

            match(input,19,FOLLOW_19_in_ruleBooleanValueResource1441); 

                    createLeafNode(grammarAccess.getBooleanValueResourceAccess().getEqualsSignKeyword_2(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:794:1: ( (lv_value_3_0= ruleBOOL ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:795:1: (lv_value_3_0= ruleBOOL )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:795:1: (lv_value_3_0= ruleBOOL )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:796:3: lv_value_3_0= ruleBOOL
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBooleanValueResourceAccess().getValueBOOLParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBOOL_in_ruleBooleanValueResource1462);
            lv_value_3_0=ruleBOOL();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBooleanValueResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_3_0, 
            	        		"BOOL", 
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
    // $ANTLR end ruleBooleanValueResource


    // $ANTLR start entryRuleColorValueResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:826:1: entryRuleColorValueResource returns [EObject current=null] : iv_ruleColorValueResource= ruleColorValueResource EOF ;
    public final EObject entryRuleColorValueResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorValueResource = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:827:2: (iv_ruleColorValueResource= ruleColorValueResource EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:828:2: iv_ruleColorValueResource= ruleColorValueResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getColorValueResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleColorValueResource_in_entryRuleColorValueResource1498);
            iv_ruleColorValueResource=ruleColorValueResource();
            _fsp--;

             current =iv_ruleColorValueResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorValueResource1508); 

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
    // $ANTLR end entryRuleColorValueResource


    // $ANTLR start ruleColorValueResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:835:1: ruleColorValueResource returns [EObject current=null] : ( 'color' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_HEX_COLOR ) ) ) ;
    public final EObject ruleColorValueResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_value_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:840:6: ( ( 'color' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_HEX_COLOR ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:841:1: ( 'color' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_HEX_COLOR ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:841:1: ( 'color' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_HEX_COLOR ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:841:3: 'color' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= RULE_HEX_COLOR ) )
            {
            match(input,22,FOLLOW_22_in_ruleColorValueResource1543); 

                    createLeafNode(grammarAccess.getColorValueResourceAccess().getColorKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:845:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:846:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:846:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:847:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColorValueResource1560); 

            			createLeafNode(grammarAccess.getColorValueResourceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getColorValueResourceRule().getType().getClassifier());
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

            match(input,19,FOLLOW_19_in_ruleColorValueResource1575); 

                    createLeafNode(grammarAccess.getColorValueResourceAccess().getEqualsSignKeyword_2(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:873:1: ( (lv_value_3_0= RULE_HEX_COLOR ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:874:1: (lv_value_3_0= RULE_HEX_COLOR )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:874:1: (lv_value_3_0= RULE_HEX_COLOR )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:875:3: lv_value_3_0= RULE_HEX_COLOR
            {
            lv_value_3_0=(Token)input.LT(1);
            match(input,RULE_HEX_COLOR,FOLLOW_RULE_HEX_COLOR_in_ruleColorValueResource1592); 

            			createLeafNode(grammarAccess.getColorValueResourceAccess().getValueHEX_COLORTerminalRuleCall_3_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getColorValueResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_3_0, 
            	        		"HEX_COLOR", 
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
    // $ANTLR end ruleColorValueResource


    // $ANTLR start entryRuleDimensionValueResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:905:1: entryRuleDimensionValueResource returns [EObject current=null] : iv_ruleDimensionValueResource= ruleDimensionValueResource EOF ;
    public final EObject entryRuleDimensionValueResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionValueResource = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:906:2: (iv_ruleDimensionValueResource= ruleDimensionValueResource EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:907:2: iv_ruleDimensionValueResource= ruleDimensionValueResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDimensionValueResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleDimensionValueResource_in_entryRuleDimensionValueResource1633);
            iv_ruleDimensionValueResource=ruleDimensionValueResource();
            _fsp--;

             current =iv_ruleDimensionValueResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDimensionValueResource1643); 

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
    // $ANTLR end entryRuleDimensionValueResource


    // $ANTLR start ruleDimensionValueResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:914:1: ruleDimensionValueResource returns [EObject current=null] : ( 'dimension' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleFLOAT ) ) ( (lv_unit_4_0= ruleDimensionKind ) ) ) ;
    public final EObject ruleDimensionValueResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;

        Enumerator lv_unit_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:919:6: ( ( 'dimension' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleFLOAT ) ) ( (lv_unit_4_0= ruleDimensionKind ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:920:1: ( 'dimension' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleFLOAT ) ) ( (lv_unit_4_0= ruleDimensionKind ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:920:1: ( 'dimension' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleFLOAT ) ) ( (lv_unit_4_0= ruleDimensionKind ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:920:3: 'dimension' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleFLOAT ) ) ( (lv_unit_4_0= ruleDimensionKind ) )
            {
            match(input,23,FOLLOW_23_in_ruleDimensionValueResource1678); 

                    createLeafNode(grammarAccess.getDimensionValueResourceAccess().getDimensionKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:924:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:925:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:925:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:926:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDimensionValueResource1695); 

            			createLeafNode(grammarAccess.getDimensionValueResourceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDimensionValueResourceRule().getType().getClassifier());
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

            match(input,19,FOLLOW_19_in_ruleDimensionValueResource1710); 

                    createLeafNode(grammarAccess.getDimensionValueResourceAccess().getEqualsSignKeyword_2(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:952:1: ( (lv_value_3_0= ruleFLOAT ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:953:1: (lv_value_3_0= ruleFLOAT )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:953:1: (lv_value_3_0= ruleFLOAT )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:954:3: lv_value_3_0= ruleFLOAT
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDimensionValueResourceAccess().getValueFLOATParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFLOAT_in_ruleDimensionValueResource1731);
            lv_value_3_0=ruleFLOAT();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDimensionValueResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_3_0, 
            	        		"FLOAT", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:976:2: ( (lv_unit_4_0= ruleDimensionKind ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:977:1: (lv_unit_4_0= ruleDimensionKind )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:977:1: (lv_unit_4_0= ruleDimensionKind )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:978:3: lv_unit_4_0= ruleDimensionKind
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDimensionValueResourceAccess().getUnitDimensionKindEnumRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDimensionKind_in_ruleDimensionValueResource1752);
            lv_unit_4_0=ruleDimensionKind();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDimensionValueResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"unit",
            	        		lv_unit_4_0, 
            	        		"DimensionKind", 
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
    // $ANTLR end ruleDimensionValueResource


    // $ANTLR start entryRuleDrawableResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1008:1: entryRuleDrawableResource returns [EObject current=null] : iv_ruleDrawableResource= ruleDrawableResource EOF ;
    public final EObject entryRuleDrawableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrawableResource = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1009:2: (iv_ruleDrawableResource= ruleDrawableResource EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1010:2: iv_ruleDrawableResource= ruleDrawableResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDrawableResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleDrawableResource_in_entryRuleDrawableResource1788);
            iv_ruleDrawableResource=ruleDrawableResource();
            _fsp--;

             current =iv_ruleDrawableResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDrawableResource1798); 

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
    // $ANTLR end entryRuleDrawableResource


    // $ANTLR start ruleDrawableResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1017:1: ruleDrawableResource returns [EObject current=null] : (this_BitmapDrawableResource_0= ruleBitmapDrawableResource | this_TransitionDrawableResource_1= ruleTransitionDrawableResource ) ;
    public final EObject ruleDrawableResource() throws RecognitionException {
        EObject current = null;

        EObject this_BitmapDrawableResource_0 = null;

        EObject this_TransitionDrawableResource_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1022:6: ( (this_BitmapDrawableResource_0= ruleBitmapDrawableResource | this_TransitionDrawableResource_1= ruleTransitionDrawableResource ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1023:1: (this_BitmapDrawableResource_0= ruleBitmapDrawableResource | this_TransitionDrawableResource_1= ruleTransitionDrawableResource )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1023:1: (this_BitmapDrawableResource_0= ruleBitmapDrawableResource | this_TransitionDrawableResource_1= ruleTransitionDrawableResource )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1023:1: (this_BitmapDrawableResource_0= ruleBitmapDrawableResource | this_TransitionDrawableResource_1= ruleTransitionDrawableResource )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1024:5: this_BitmapDrawableResource_0= ruleBitmapDrawableResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDrawableResourceAccess().getBitmapDrawableResourceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBitmapDrawableResource_in_ruleDrawableResource1845);
                    this_BitmapDrawableResource_0=ruleBitmapDrawableResource();
                    _fsp--;

                     
                            current = this_BitmapDrawableResource_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1034:5: this_TransitionDrawableResource_1= ruleTransitionDrawableResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDrawableResourceAccess().getTransitionDrawableResourceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTransitionDrawableResource_in_ruleDrawableResource1872);
                    this_TransitionDrawableResource_1=ruleTransitionDrawableResource();
                    _fsp--;

                     
                            current = this_TransitionDrawableResource_1; 
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
    // $ANTLR end ruleDrawableResource


    // $ANTLR start entryRuleBitmapDrawableResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1050:1: entryRuleBitmapDrawableResource returns [EObject current=null] : iv_ruleBitmapDrawableResource= ruleBitmapDrawableResource EOF ;
    public final EObject entryRuleBitmapDrawableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitmapDrawableResource = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1051:2: (iv_ruleBitmapDrawableResource= ruleBitmapDrawableResource EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1052:2: iv_ruleBitmapDrawableResource= ruleBitmapDrawableResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBitmapDrawableResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleBitmapDrawableResource_in_entryRuleBitmapDrawableResource1907);
            iv_ruleBitmapDrawableResource=ruleBitmapDrawableResource();
            _fsp--;

             current =iv_ruleBitmapDrawableResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitmapDrawableResource1917); 

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
    // $ANTLR end entryRuleBitmapDrawableResource


    // $ANTLR start ruleBitmapDrawableResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1059:1: ruleBitmapDrawableResource returns [EObject current=null] : ( 'bitmap' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_filename_3_0= RULE_ID ) ) ) ;
    public final EObject ruleBitmapDrawableResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_filename_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1064:6: ( ( 'bitmap' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_filename_3_0= RULE_ID ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1065:1: ( 'bitmap' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_filename_3_0= RULE_ID ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1065:1: ( 'bitmap' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_filename_3_0= RULE_ID ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1065:3: 'bitmap' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_filename_3_0= RULE_ID ) )
            {
            match(input,24,FOLLOW_24_in_ruleBitmapDrawableResource1952); 

                    createLeafNode(grammarAccess.getBitmapDrawableResourceAccess().getBitmapKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1069:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1070:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1070:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1071:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBitmapDrawableResource1969); 

            			createLeafNode(grammarAccess.getBitmapDrawableResourceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBitmapDrawableResourceRule().getType().getClassifier());
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

            match(input,19,FOLLOW_19_in_ruleBitmapDrawableResource1984); 

                    createLeafNode(grammarAccess.getBitmapDrawableResourceAccess().getEqualsSignKeyword_2(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1097:1: ( (lv_filename_3_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1098:1: (lv_filename_3_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1098:1: (lv_filename_3_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1099:3: lv_filename_3_0= RULE_ID
            {
            lv_filename_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBitmapDrawableResource2001); 

            			createLeafNode(grammarAccess.getBitmapDrawableResourceAccess().getFilenameIDTerminalRuleCall_3_0(), "filename"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBitmapDrawableResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"filename",
            	        		lv_filename_3_0, 
            	        		"ID", 
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
    // $ANTLR end ruleBitmapDrawableResource


    // $ANTLR start entryRuleTransitionDrawableResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1129:1: entryRuleTransitionDrawableResource returns [EObject current=null] : iv_ruleTransitionDrawableResource= ruleTransitionDrawableResource EOF ;
    public final EObject entryRuleTransitionDrawableResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDrawableResource = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1130:2: (iv_ruleTransitionDrawableResource= ruleTransitionDrawableResource EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1131:2: iv_ruleTransitionDrawableResource= ruleTransitionDrawableResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTransitionDrawableResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleTransitionDrawableResource_in_entryRuleTransitionDrawableResource2042);
            iv_ruleTransitionDrawableResource=ruleTransitionDrawableResource();
            _fsp--;

             current =iv_ruleTransitionDrawableResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionDrawableResource2052); 

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
    // $ANTLR end entryRuleTransitionDrawableResource


    // $ANTLR start ruleTransitionDrawableResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1138:1: ruleTransitionDrawableResource returns [EObject current=null] : ( 'transition' ( ( RULE_ID ) ) '<->' ( ( RULE_ID ) ) ) ;
    public final EObject ruleTransitionDrawableResource() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1143:6: ( ( 'transition' ( ( RULE_ID ) ) '<->' ( ( RULE_ID ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1144:1: ( 'transition' ( ( RULE_ID ) ) '<->' ( ( RULE_ID ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1144:1: ( 'transition' ( ( RULE_ID ) ) '<->' ( ( RULE_ID ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1144:3: 'transition' ( ( RULE_ID ) ) '<->' ( ( RULE_ID ) )
            {
            match(input,25,FOLLOW_25_in_ruleTransitionDrawableResource2087); 

                    createLeafNode(grammarAccess.getTransitionDrawableResourceAccess().getTransitionKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1148:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1149:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1149:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1150:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTransitionDrawableResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransitionDrawableResource2105); 

            		createLeafNode(grammarAccess.getTransitionDrawableResourceAccess().getFromDrawableResourceCrossReference_1_0(), "from"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleTransitionDrawableResource2115); 

                    createLeafNode(grammarAccess.getTransitionDrawableResourceAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_2(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1166:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1167:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1167:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1168:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTransitionDrawableResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransitionDrawableResource2133); 

            		createLeafNode(grammarAccess.getTransitionDrawableResourceAccess().getToDrawableResourceCrossReference_3_0(), "to"); 
            	

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
    // $ANTLR end ruleTransitionDrawableResource


    // $ANTLR start entryRuleAnimationResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1188:1: entryRuleAnimationResource returns [EObject current=null] : iv_ruleAnimationResource= ruleAnimationResource EOF ;
    public final EObject entryRuleAnimationResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimationResource = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1189:2: (iv_ruleAnimationResource= ruleAnimationResource EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1190:2: iv_ruleAnimationResource= ruleAnimationResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnimationResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnimationResource_in_entryRuleAnimationResource2169);
            iv_ruleAnimationResource=ruleAnimationResource();
            _fsp--;

             current =iv_ruleAnimationResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnimationResource2179); 

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
    // $ANTLR end entryRuleAnimationResource


    // $ANTLR start ruleAnimationResource
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1197:1: ruleAnimationResource returns [EObject current=null] : ( 'animation' () ( (lv_name_2_0= RULE_ID ) ) '{' '}' ) ;
    public final EObject ruleAnimationResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1202:6: ( ( 'animation' () ( (lv_name_2_0= RULE_ID ) ) '{' '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1203:1: ( 'animation' () ( (lv_name_2_0= RULE_ID ) ) '{' '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1203:1: ( 'animation' () ( (lv_name_2_0= RULE_ID ) ) '{' '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1203:3: 'animation' () ( (lv_name_2_0= RULE_ID ) ) '{' '}'
            {
            match(input,27,FOLLOW_27_in_ruleAnimationResource2214); 

                    createLeafNode(grammarAccess.getAnimationResourceAccess().getAnimationKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1207:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1208:5: 
            {
             
                    temp=factory.create(grammarAccess.getAnimationResourceAccess().getAnimationResourceAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAnimationResourceAccess().getAnimationResourceAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1218:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1219:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1219:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1220:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnimationResource2240); 

            			createLeafNode(grammarAccess.getAnimationResourceAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnimationResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleAnimationResource2255); 

                    createLeafNode(grammarAccess.getAnimationResourceAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            match(input,14,FOLLOW_14_in_ruleAnimationResource2265); 

                    createLeafNode(grammarAccess.getAnimationResourceAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruleAnimationResource


    // $ANTLR start entryRuleLayout
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1258:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1259:2: (iv_ruleLayout= ruleLayout EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1260:2: iv_ruleLayout= ruleLayout EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLayoutRule(), currentNode); 
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout2301);
            iv_ruleLayout=ruleLayout();
            _fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout2311); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1267:1: ruleLayout returns [EObject current=null] : ( 'layout' () ( (lv_name_2_0= RULE_ID ) ) '{' ( (lv_widgets_4_0= ruleWidget ) )* '}' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_widgets_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1272:6: ( ( 'layout' () ( (lv_name_2_0= RULE_ID ) ) '{' ( (lv_widgets_4_0= ruleWidget ) )* '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1273:1: ( 'layout' () ( (lv_name_2_0= RULE_ID ) ) '{' ( (lv_widgets_4_0= ruleWidget ) )* '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1273:1: ( 'layout' () ( (lv_name_2_0= RULE_ID ) ) '{' ( (lv_widgets_4_0= ruleWidget ) )* '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1273:3: 'layout' () ( (lv_name_2_0= RULE_ID ) ) '{' ( (lv_widgets_4_0= ruleWidget ) )* '}'
            {
            match(input,28,FOLLOW_28_in_ruleLayout2346); 

                    createLeafNode(grammarAccess.getLayoutAccess().getLayoutKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1277:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1278:5: 
            {
             
                    temp=factory.create(grammarAccess.getLayoutAccess().getLayoutAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLayoutAccess().getLayoutAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1288:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1289:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1289:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1290:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLayout2372); 

            			createLeafNode(grammarAccess.getLayoutAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLayoutRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleLayout2387); 

                    createLeafNode(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1316:1: ( (lv_widgets_4_0= ruleWidget ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29||LA7_0==41||(LA7_0>=44 && LA7_0<=46)||LA7_0==48||LA7_0==50) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1317:1: (lv_widgets_4_0= ruleWidget )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1317:1: (lv_widgets_4_0= ruleWidget )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1318:3: lv_widgets_4_0= ruleWidget
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLayoutAccess().getWidgetsWidgetParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleWidget_in_ruleLayout2408);
            	    lv_widgets_4_0=ruleWidget();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLayoutRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"widgets",
            	    	        		lv_widgets_4_0, 
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
            	    break loop7;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleLayout2419); 

                    createLeafNode(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_5(), null); 
                

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1352:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1353:2: (iv_ruleWidget= ruleWidget EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1354:2: iv_ruleWidget= ruleWidget EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWidgetRule(), currentNode); 
            pushFollow(FOLLOW_ruleWidget_in_entryRuleWidget2455);
            iv_ruleWidget=ruleWidget();
            _fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidget2465); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1361:1: ruleWidget returns [EObject current=null] : (this_GenericWidget_0= ruleGenericWidget | this_Button_1= ruleButton | this_ImageButton_2= ruleImageButton | this_Link_3= ruleLink | this_Spinner_4= ruleSpinner | this_EditText_5= ruleEditText | this_TextView_6= ruleTextView ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        EObject this_GenericWidget_0 = null;

        EObject this_Button_1 = null;

        EObject this_ImageButton_2 = null;

        EObject this_Link_3 = null;

        EObject this_Spinner_4 = null;

        EObject this_EditText_5 = null;

        EObject this_TextView_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1366:6: ( (this_GenericWidget_0= ruleGenericWidget | this_Button_1= ruleButton | this_ImageButton_2= ruleImageButton | this_Link_3= ruleLink | this_Spinner_4= ruleSpinner | this_EditText_5= ruleEditText | this_TextView_6= ruleTextView ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1367:1: (this_GenericWidget_0= ruleGenericWidget | this_Button_1= ruleButton | this_ImageButton_2= ruleImageButton | this_Link_3= ruleLink | this_Spinner_4= ruleSpinner | this_EditText_5= ruleEditText | this_TextView_6= ruleTextView )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1367:1: (this_GenericWidget_0= ruleGenericWidget | this_Button_1= ruleButton | this_ImageButton_2= ruleImageButton | this_Link_3= ruleLink | this_Spinner_4= ruleSpinner | this_EditText_5= ruleEditText | this_TextView_6= ruleTextView )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 44:
                {
                alt8=2;
                }
                break;
            case 45:
                {
                alt8=3;
                }
                break;
            case 46:
                {
                alt8=4;
                }
                break;
            case 48:
                {
                alt8=5;
                }
                break;
            case 50:
                {
                alt8=6;
                }
                break;
            case 41:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1367:1: (this_GenericWidget_0= ruleGenericWidget | this_Button_1= ruleButton | this_ImageButton_2= ruleImageButton | this_Link_3= ruleLink | this_Spinner_4= ruleSpinner | this_EditText_5= ruleEditText | this_TextView_6= ruleTextView )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1368:5: this_GenericWidget_0= ruleGenericWidget
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getGenericWidgetParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGenericWidget_in_ruleWidget2512);
                    this_GenericWidget_0=ruleGenericWidget();
                    _fsp--;

                     
                            current = this_GenericWidget_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1378:5: this_Button_1= ruleButton
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getButtonParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleWidget2539);
                    this_Button_1=ruleButton();
                    _fsp--;

                     
                            current = this_Button_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1388:5: this_ImageButton_2= ruleImageButton
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getImageButtonParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleImageButton_in_ruleWidget2566);
                    this_ImageButton_2=ruleImageButton();
                    _fsp--;

                     
                            current = this_ImageButton_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1398:5: this_Link_3= ruleLink
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getLinkParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleWidget2593);
                    this_Link_3=ruleLink();
                    _fsp--;

                     
                            current = this_Link_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1408:5: this_Spinner_4= ruleSpinner
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSpinner_in_ruleWidget2620);
                    this_Spinner_4=ruleSpinner();
                    _fsp--;

                     
                            current = this_Spinner_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1418:5: this_EditText_5= ruleEditText
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getEditTextParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEditText_in_ruleWidget2647);
                    this_EditText_5=ruleEditText();
                    _fsp--;

                     
                            current = this_EditText_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1428:5: this_TextView_6= ruleTextView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getTextViewParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTextView_in_ruleWidget2674);
                    this_TextView_6=ruleTextView();
                    _fsp--;

                     
                            current = this_TextView_6; 
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
    // $ANTLR end ruleWidget


    // $ANTLR start entryRuleGenericWidget
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1444:1: entryRuleGenericWidget returns [EObject current=null] : iv_ruleGenericWidget= ruleGenericWidget EOF ;
    public final EObject entryRuleGenericWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericWidget = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1445:2: (iv_ruleGenericWidget= ruleGenericWidget EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1446:2: iv_ruleGenericWidget= ruleGenericWidget EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGenericWidgetRule(), currentNode); 
            pushFollow(FOLLOW_ruleGenericWidget_in_entryRuleGenericWidget2709);
            iv_ruleGenericWidget=ruleGenericWidget();
            _fsp--;

             current =iv_ruleGenericWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericWidget2719); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1453:1: ruleGenericWidget returns [EObject current=null] : ( 'widget' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_name_5_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_24_0= ruleAction ) ) )* ) ;
    public final EObject ruleGenericWidget() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        Token lv_name_5_0=null;
        EObject lv_top_8_0 = null;

        EObject lv_left_10_0 = null;

        EObject lv_width_12_0 = null;

        EObject lv_height_14_0 = null;

        EObject lv_background_16_0 = null;

        EObject lv_clickable_18_0 = null;

        EObject lv_fadeScrollBars_20_0 = null;

        EObject lv_isScrollContainer_22_0 = null;

        EObject lv_actions_24_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1458:6: ( ( 'widget' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_name_5_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_24_0= ruleAction ) ) )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1459:1: ( 'widget' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_name_5_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_24_0= ruleAction ) ) )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1459:1: ( 'widget' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_name_5_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_24_0= ruleAction ) ) )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1459:3: 'widget' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_name_5_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_24_0= ruleAction ) ) )*
            {
            match(input,29,FOLLOW_29_in_ruleGenericWidget2754); 

                    createLeafNode(grammarAccess.getGenericWidgetAccess().getWidgetKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1463:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1464:5: 
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

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1474:2: ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1474:4: '<' ( (lv_id_3_0= RULE_ID ) ) '>'
                    {
                    match(input,30,FOLLOW_30_in_ruleGenericWidget2774); 

                            createLeafNode(grammarAccess.getGenericWidgetAccess().getLessThanSignKeyword_2_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1478:1: ( (lv_id_3_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1479:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1479:1: (lv_id_3_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1480:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGenericWidget2791); 

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

                    match(input,31,FOLLOW_31_in_ruleGenericWidget2806); 

                            createLeafNode(grammarAccess.getGenericWidgetAccess().getGreaterThanSignKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1506:3: ( (lv_name_5_0= RULE_STRING ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1507:1: (lv_name_5_0= RULE_STRING )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1507:1: (lv_name_5_0= RULE_STRING )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1508:3: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenericWidget2825); 

            			createLeafNode(grammarAccess.getGenericWidgetAccess().getNameSTRINGTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGenericWidgetRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_5_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1530:2: ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1532:1: ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1532:1: ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1533:2: ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4());
            	
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1536:2: ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1537:3: ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) )*
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1537:3: ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) )*
            loop10:
            do {
                int alt10=9;
                int LA10_0 = input.LA(1);

                if ( LA10_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 3) ) {
                    alt10=4;
                }
                else if ( LA10_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 4) ) {
                    alt10=5;
                }
                else if ( LA10_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 5) ) {
                    alt10=6;
                }
                else if ( LA10_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 6) ) {
                    alt10=7;
                }
                else if ( LA10_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 7) ) {
                    alt10=8;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1539:4: ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1539:4: ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1540:5: {...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGenericWidget", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1540:110: ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1541:6: ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1544:6: ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1544:8: 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,32,FOLLOW_32_in_ruleGenericWidget2883); 

            	            createLeafNode(grammarAccess.getGenericWidgetAccess().getTopKeyword_4_0_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1548:1: ( (lv_top_8_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1549:1: (lv_top_8_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1549:1: (lv_top_8_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1550:3: lv_top_8_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGenericWidgetAccess().getTopDimensionPropertyValueParserRuleCall_4_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleGenericWidget2904);
            	    lv_top_8_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGenericWidgetRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"top",
            	    	        		lv_top_8_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1579:4: ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1579:4: ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1580:5: {...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGenericWidget", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1580:110: ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1581:6: ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1584:6: ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1584:8: 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,33,FOLLOW_33_in_ruleGenericWidget2966); 

            	            createLeafNode(grammarAccess.getGenericWidgetAccess().getLeftKeyword_4_1_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1588:1: ( (lv_left_10_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1589:1: (lv_left_10_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1589:1: (lv_left_10_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1590:3: lv_left_10_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGenericWidgetAccess().getLeftDimensionPropertyValueParserRuleCall_4_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleGenericWidget2987);
            	    lv_left_10_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGenericWidgetRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"left",
            	    	        		lv_left_10_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1619:4: ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1619:4: ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1620:5: {...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGenericWidget", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1620:110: ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1621:6: ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1624:6: ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1624:8: 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,34,FOLLOW_34_in_ruleGenericWidget3049); 

            	            createLeafNode(grammarAccess.getGenericWidgetAccess().getWidthKeyword_4_2_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1628:1: ( (lv_width_12_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1629:1: (lv_width_12_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1629:1: (lv_width_12_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1630:3: lv_width_12_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGenericWidgetAccess().getWidthDimensionPropertyValueParserRuleCall_4_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleGenericWidget3070);
            	    lv_width_12_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGenericWidgetRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"width",
            	    	        		lv_width_12_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1659:4: ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1659:4: ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1660:5: {...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGenericWidget", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1660:110: ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1661:6: ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1664:6: ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1664:8: 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,35,FOLLOW_35_in_ruleGenericWidget3132); 

            	            createLeafNode(grammarAccess.getGenericWidgetAccess().getHeightKeyword_4_3_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1668:1: ( (lv_height_14_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1669:1: (lv_height_14_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1669:1: (lv_height_14_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1670:3: lv_height_14_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGenericWidgetAccess().getHeightDimensionPropertyValueParserRuleCall_4_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleGenericWidget3153);
            	    lv_height_14_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGenericWidgetRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"height",
            	    	        		lv_height_14_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1699:4: ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1699:4: ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1700:5: {...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGenericWidget", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1700:110: ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1701:6: ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1704:6: ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1704:8: 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) )
            	    {
            	    match(input,36,FOLLOW_36_in_ruleGenericWidget3215); 

            	            createLeafNode(grammarAccess.getGenericWidgetAccess().getBackgroundKeyword_4_4_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1708:1: ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1709:1: (lv_background_16_0= ruleDrawableResourcePropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1709:1: (lv_background_16_0= ruleDrawableResourcePropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1710:3: lv_background_16_0= ruleDrawableResourcePropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGenericWidgetAccess().getBackgroundDrawableResourcePropertyValueParserRuleCall_4_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDrawableResourcePropertyValue_in_ruleGenericWidget3236);
            	    lv_background_16_0=ruleDrawableResourcePropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGenericWidgetRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"background",
            	    	        		lv_background_16_0, 
            	    	        		"DrawableResourcePropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1739:4: ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1739:4: ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1740:5: {...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGenericWidget", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1740:110: ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1741:6: ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1744:6: ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1744:8: 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,37,FOLLOW_37_in_ruleGenericWidget3298); 

            	            createLeafNode(grammarAccess.getGenericWidgetAccess().getClickableKeyword_4_5_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1748:1: ( (lv_clickable_18_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1749:1: (lv_clickable_18_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1749:1: (lv_clickable_18_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1750:3: lv_clickable_18_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGenericWidgetAccess().getClickableBooleanPropertyValueParserRuleCall_4_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleGenericWidget3319);
            	    lv_clickable_18_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGenericWidgetRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"clickable",
            	    	        		lv_clickable_18_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1779:4: ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1779:4: ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1780:5: {...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGenericWidget", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1780:110: ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1781:6: ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 6);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1784:6: ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1784:8: 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,38,FOLLOW_38_in_ruleGenericWidget3381); 

            	            createLeafNode(grammarAccess.getGenericWidgetAccess().getFadeScrollBarsKeyword_4_6_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1788:1: ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1789:1: (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1789:1: (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1790:3: lv_fadeScrollBars_20_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGenericWidgetAccess().getFadeScrollBarsBooleanPropertyValueParserRuleCall_4_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleGenericWidget3402);
            	    lv_fadeScrollBars_20_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGenericWidgetRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"fadeScrollBars",
            	    	        		lv_fadeScrollBars_20_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1819:4: ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1819:4: ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1820:5: {...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleGenericWidget", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1820:110: ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1821:6: ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4(), 7);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1824:6: ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1824:8: 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,39,FOLLOW_39_in_ruleGenericWidget3464); 

            	            createLeafNode(grammarAccess.getGenericWidgetAccess().getIsScrollContainerKeyword_4_7_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1828:1: ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1829:1: (lv_isScrollContainer_22_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1829:1: (lv_isScrollContainer_22_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1830:3: lv_isScrollContainer_22_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGenericWidgetAccess().getIsScrollContainerBooleanPropertyValueParserRuleCall_4_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleGenericWidget3485);
            	    lv_isScrollContainer_22_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGenericWidgetRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"isScrollContainer",
            	    	        		lv_isScrollContainer_22_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGenericWidgetAccess().getUnorderedGroup_4());
            	

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1866:2: ( '->' ( (lv_actions_24_0= ruleAction ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==40) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1866:4: '->' ( (lv_actions_24_0= ruleAction ) )
            	    {
            	    match(input,40,FOLLOW_40_in_ruleGenericWidget3536); 

            	            createLeafNode(grammarAccess.getGenericWidgetAccess().getHyphenMinusGreaterThanSignKeyword_5_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1870:1: ( (lv_actions_24_0= ruleAction ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1871:1: (lv_actions_24_0= ruleAction )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1871:1: (lv_actions_24_0= ruleAction )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1872:3: lv_actions_24_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGenericWidgetAccess().getActionsActionParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleGenericWidget3557);
            	    lv_actions_24_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGenericWidgetRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actions",
            	    	        		lv_actions_24_0, 
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
            	    break loop11;
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
    // $ANTLR end ruleGenericWidget


    // $ANTLR start entryRuleTextView
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1902:1: entryRuleTextView returns [EObject current=null] : iv_ruleTextView= ruleTextView EOF ;
    public final EObject entryRuleTextView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextView = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1903:2: (iv_ruleTextView= ruleTextView EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1904:2: iv_ruleTextView= ruleTextView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleTextView_in_entryRuleTextView3595);
            iv_ruleTextView=ruleTextView();
            _fsp--;

             current =iv_ruleTextView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextView3605); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1911:1: ruleTextView returns [EObject current=null] : ( 'textView' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )* ) ;
    public final EObject ruleTextView() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        EObject lv_text_5_0 = null;

        EObject lv_top_8_0 = null;

        EObject lv_left_10_0 = null;

        EObject lv_width_12_0 = null;

        EObject lv_height_14_0 = null;

        EObject lv_background_16_0 = null;

        EObject lv_clickable_18_0 = null;

        EObject lv_fadeScrollBars_20_0 = null;

        EObject lv_isScrollContainer_22_0 = null;

        EObject lv_hint_24_0 = null;

        EObject lv_textColor_26_0 = null;

        EObject lv_actions_28_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1916:6: ( ( 'textView' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1917:1: ( 'textView' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1917:1: ( 'textView' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1917:3: 'textView' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )*
            {
            match(input,41,FOLLOW_41_in_ruleTextView3640); 

                    createLeafNode(grammarAccess.getTextViewAccess().getTextViewKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1921:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1922:5: 
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

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1932:2: ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1932:4: '<' ( (lv_id_3_0= RULE_ID ) ) '>'
                    {
                    match(input,30,FOLLOW_30_in_ruleTextView3660); 

                            createLeafNode(grammarAccess.getTextViewAccess().getLessThanSignKeyword_2_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1936:1: ( (lv_id_3_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1937:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1937:1: (lv_id_3_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1938:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextView3677); 

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

                    match(input,31,FOLLOW_31_in_ruleTextView3692); 

                            createLeafNode(grammarAccess.getTextViewAccess().getGreaterThanSignKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1964:3: ( (lv_text_5_0= ruleStringPropertyValue ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1965:1: (lv_text_5_0= ruleStringPropertyValue )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1965:1: (lv_text_5_0= ruleStringPropertyValue )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1966:3: lv_text_5_0= ruleStringPropertyValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTextViewAccess().getTextStringPropertyValueParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStringPropertyValue_in_ruleTextView3715);
            lv_text_5_0=ruleStringPropertyValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTextViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_5_0, 
            	        		"StringPropertyValue", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1988:2: ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1990:1: ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1990:1: ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1991:2: ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTextViewAccess().getUnorderedGroup_4());
            	
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1994:2: ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1995:3: ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )*
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1995:3: ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )*
            loop13:
            do {
                int alt13=11;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 2) ) {
                    alt13=3;
                }
                else if ( LA13_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 3) ) {
                    alt13=4;
                }
                else if ( LA13_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 4) ) {
                    alt13=5;
                }
                else if ( LA13_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 5) ) {
                    alt13=6;
                }
                else if ( LA13_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 6) ) {
                    alt13=7;
                }
                else if ( LA13_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 7) ) {
                    alt13=8;
                }
                else if ( LA13_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 8) ) {
                    alt13=9;
                }
                else if ( LA13_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 9) ) {
                    alt13=10;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1997:4: ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1997:4: ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1998:5: {...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTextView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1998:105: ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:1999:6: ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2002:6: ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2002:8: 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,32,FOLLOW_32_in_ruleTextView3768); 

            	            createLeafNode(grammarAccess.getTextViewAccess().getTopKeyword_4_0_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2006:1: ( (lv_top_8_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2007:1: (lv_top_8_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2007:1: (lv_top_8_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2008:3: lv_top_8_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTextViewAccess().getTopDimensionPropertyValueParserRuleCall_4_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleTextView3789);
            	    lv_top_8_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTextViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"top",
            	    	        		lv_top_8_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextViewAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2037:4: ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2037:4: ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2038:5: {...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTextView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2038:105: ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2039:6: ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2042:6: ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2042:8: 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,33,FOLLOW_33_in_ruleTextView3851); 

            	            createLeafNode(grammarAccess.getTextViewAccess().getLeftKeyword_4_1_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2046:1: ( (lv_left_10_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2047:1: (lv_left_10_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2047:1: (lv_left_10_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2048:3: lv_left_10_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTextViewAccess().getLeftDimensionPropertyValueParserRuleCall_4_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleTextView3872);
            	    lv_left_10_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTextViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"left",
            	    	        		lv_left_10_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextViewAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2077:4: ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2077:4: ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2078:5: {...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTextView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2078:105: ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2079:6: ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2082:6: ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2082:8: 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,34,FOLLOW_34_in_ruleTextView3934); 

            	            createLeafNode(grammarAccess.getTextViewAccess().getWidthKeyword_4_2_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2086:1: ( (lv_width_12_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2087:1: (lv_width_12_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2087:1: (lv_width_12_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2088:3: lv_width_12_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTextViewAccess().getWidthDimensionPropertyValueParserRuleCall_4_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleTextView3955);
            	    lv_width_12_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTextViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"width",
            	    	        		lv_width_12_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextViewAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2117:4: ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2117:4: ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2118:5: {...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTextView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2118:105: ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2119:6: ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2122:6: ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2122:8: 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,35,FOLLOW_35_in_ruleTextView4017); 

            	            createLeafNode(grammarAccess.getTextViewAccess().getHeightKeyword_4_3_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2126:1: ( (lv_height_14_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2127:1: (lv_height_14_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2127:1: (lv_height_14_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2128:3: lv_height_14_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTextViewAccess().getHeightDimensionPropertyValueParserRuleCall_4_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleTextView4038);
            	    lv_height_14_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTextViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"height",
            	    	        		lv_height_14_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextViewAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2157:4: ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2157:4: ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2158:5: {...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTextView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2158:105: ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2159:6: ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2162:6: ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2162:8: 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) )
            	    {
            	    match(input,36,FOLLOW_36_in_ruleTextView4100); 

            	            createLeafNode(grammarAccess.getTextViewAccess().getBackgroundKeyword_4_4_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2166:1: ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2167:1: (lv_background_16_0= ruleDrawableResourcePropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2167:1: (lv_background_16_0= ruleDrawableResourcePropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2168:3: lv_background_16_0= ruleDrawableResourcePropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTextViewAccess().getBackgroundDrawableResourcePropertyValueParserRuleCall_4_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDrawableResourcePropertyValue_in_ruleTextView4121);
            	    lv_background_16_0=ruleDrawableResourcePropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTextViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"background",
            	    	        		lv_background_16_0, 
            	    	        		"DrawableResourcePropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextViewAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2197:4: ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2197:4: ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2198:5: {...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTextView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2198:105: ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2199:6: ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2202:6: ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2202:8: 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,37,FOLLOW_37_in_ruleTextView4183); 

            	            createLeafNode(grammarAccess.getTextViewAccess().getClickableKeyword_4_5_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2206:1: ( (lv_clickable_18_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2207:1: (lv_clickable_18_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2207:1: (lv_clickable_18_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2208:3: lv_clickable_18_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTextViewAccess().getClickableBooleanPropertyValueParserRuleCall_4_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleTextView4204);
            	    lv_clickable_18_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTextViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"clickable",
            	    	        		lv_clickable_18_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextViewAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2237:4: ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2237:4: ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2238:5: {...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleTextView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2238:105: ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2239:6: ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 6);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2242:6: ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2242:8: 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,38,FOLLOW_38_in_ruleTextView4266); 

            	            createLeafNode(grammarAccess.getTextViewAccess().getFadeScrollBarsKeyword_4_6_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2246:1: ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2247:1: (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2247:1: (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2248:3: lv_fadeScrollBars_20_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTextViewAccess().getFadeScrollBarsBooleanPropertyValueParserRuleCall_4_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleTextView4287);
            	    lv_fadeScrollBars_20_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTextViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"fadeScrollBars",
            	    	        		lv_fadeScrollBars_20_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextViewAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2277:4: ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2277:4: ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2278:5: {...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleTextView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2278:105: ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2279:6: ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 7);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2282:6: ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2282:8: 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,39,FOLLOW_39_in_ruleTextView4349); 

            	            createLeafNode(grammarAccess.getTextViewAccess().getIsScrollContainerKeyword_4_7_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2286:1: ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2287:1: (lv_isScrollContainer_22_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2287:1: (lv_isScrollContainer_22_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2288:3: lv_isScrollContainer_22_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTextViewAccess().getIsScrollContainerBooleanPropertyValueParserRuleCall_4_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleTextView4370);
            	    lv_isScrollContainer_22_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTextViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"isScrollContainer",
            	    	        		lv_isScrollContainer_22_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextViewAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2317:4: ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2317:4: ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2318:5: {...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleTextView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2318:105: ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2319:6: ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 8);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2322:6: ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2322:8: 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) )
            	    {
            	    match(input,42,FOLLOW_42_in_ruleTextView4432); 

            	            createLeafNode(grammarAccess.getTextViewAccess().getHintKeyword_4_8_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2326:1: ( (lv_hint_24_0= ruleStringPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2327:1: (lv_hint_24_0= ruleStringPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2327:1: (lv_hint_24_0= ruleStringPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2328:3: lv_hint_24_0= ruleStringPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTextViewAccess().getHintStringPropertyValueParserRuleCall_4_8_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringPropertyValue_in_ruleTextView4453);
            	    lv_hint_24_0=ruleStringPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTextViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"hint",
            	    	        		lv_hint_24_0, 
            	    	        		"StringPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextViewAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2357:4: ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2357:4: ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2358:5: {...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleTextView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2358:105: ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2359:6: ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextViewAccess().getUnorderedGroup_4(), 9);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2362:6: ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2362:8: 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) )
            	    {
            	    match(input,43,FOLLOW_43_in_ruleTextView4515); 

            	            createLeafNode(grammarAccess.getTextViewAccess().getTextColorKeyword_4_9_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2366:1: ( (lv_textColor_26_0= ruleColorPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2367:1: (lv_textColor_26_0= ruleColorPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2367:1: (lv_textColor_26_0= ruleColorPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2368:3: lv_textColor_26_0= ruleColorPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTextViewAccess().getTextColorColorPropertyValueParserRuleCall_4_9_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleColorPropertyValue_in_ruleTextView4536);
            	    lv_textColor_26_0=ruleColorPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTextViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"textColor",
            	    	        		lv_textColor_26_0, 
            	    	        		"ColorPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextViewAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTextViewAccess().getUnorderedGroup_4());
            	

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2404:2: ( '->' ( (lv_actions_28_0= ruleAction ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2404:4: '->' ( (lv_actions_28_0= ruleAction ) )
            	    {
            	    match(input,40,FOLLOW_40_in_ruleTextView4587); 

            	            createLeafNode(grammarAccess.getTextViewAccess().getHyphenMinusGreaterThanSignKeyword_5_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2408:1: ( (lv_actions_28_0= ruleAction ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2409:1: (lv_actions_28_0= ruleAction )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2409:1: (lv_actions_28_0= ruleAction )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2410:3: lv_actions_28_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTextViewAccess().getActionsActionParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleTextView4608);
            	    lv_actions_28_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTextViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actions",
            	    	        		lv_actions_28_0, 
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
            	    break loop14;
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
    // $ANTLR end ruleTextView


    // $ANTLR start entryRuleButton
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2440:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2441:2: (iv_ruleButton= ruleButton EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2442:2: iv_ruleButton= ruleButton EOF
            {
             currentNode = createCompositeNode(grammarAccess.getButtonRule(), currentNode); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton4646);
            iv_ruleButton=ruleButton();
            _fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton4656); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2449:1: ruleButton returns [EObject current=null] : ( 'button' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )* ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        EObject lv_text_5_0 = null;

        EObject lv_top_8_0 = null;

        EObject lv_left_10_0 = null;

        EObject lv_width_12_0 = null;

        EObject lv_height_14_0 = null;

        EObject lv_background_16_0 = null;

        EObject lv_clickable_18_0 = null;

        EObject lv_fadeScrollBars_20_0 = null;

        EObject lv_isScrollContainer_22_0 = null;

        EObject lv_hint_24_0 = null;

        EObject lv_textColor_26_0 = null;

        EObject lv_actions_28_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2454:6: ( ( 'button' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2455:1: ( 'button' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2455:1: ( 'button' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2455:3: 'button' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )*
            {
            match(input,44,FOLLOW_44_in_ruleButton4691); 

                    createLeafNode(grammarAccess.getButtonAccess().getButtonKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2459:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2460:5: 
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

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2470:2: ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2470:4: '<' ( (lv_id_3_0= RULE_ID ) ) '>'
                    {
                    match(input,30,FOLLOW_30_in_ruleButton4711); 

                            createLeafNode(grammarAccess.getButtonAccess().getLessThanSignKeyword_2_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2474:1: ( (lv_id_3_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2475:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2475:1: (lv_id_3_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2476:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleButton4728); 

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

                    match(input,31,FOLLOW_31_in_ruleButton4743); 

                            createLeafNode(grammarAccess.getButtonAccess().getGreaterThanSignKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2502:3: ( (lv_text_5_0= ruleStringPropertyValue ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2503:1: (lv_text_5_0= ruleStringPropertyValue )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2503:1: (lv_text_5_0= ruleStringPropertyValue )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2504:3: lv_text_5_0= ruleStringPropertyValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getTextStringPropertyValueParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStringPropertyValue_in_ruleButton4766);
            lv_text_5_0=ruleStringPropertyValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_5_0, 
            	        		"StringPropertyValue", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2526:2: ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2528:1: ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2528:1: ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2529:2: ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getButtonAccess().getUnorderedGroup_4());
            	
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2532:2: ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2533:3: ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )*
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2533:3: ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )*
            loop16:
            do {
                int alt16=11;
                int LA16_0 = input.LA(1);

                if ( LA16_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 1) ) {
                    alt16=2;
                }
                else if ( LA16_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 2) ) {
                    alt16=3;
                }
                else if ( LA16_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 3) ) {
                    alt16=4;
                }
                else if ( LA16_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 4) ) {
                    alt16=5;
                }
                else if ( LA16_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 5) ) {
                    alt16=6;
                }
                else if ( LA16_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 6) ) {
                    alt16=7;
                }
                else if ( LA16_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 7) ) {
                    alt16=8;
                }
                else if ( LA16_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 8) ) {
                    alt16=9;
                }
                else if ( LA16_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 9) ) {
                    alt16=10;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2535:4: ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2535:4: ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2536:5: {...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2536:103: ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2537:6: ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2540:6: ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2540:8: 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,32,FOLLOW_32_in_ruleButton4819); 

            	            createLeafNode(grammarAccess.getButtonAccess().getTopKeyword_4_0_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2544:1: ( (lv_top_8_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2545:1: (lv_top_8_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2545:1: (lv_top_8_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2546:3: lv_top_8_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getTopDimensionPropertyValueParserRuleCall_4_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleButton4840);
            	    lv_top_8_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"top",
            	    	        		lv_top_8_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2575:4: ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2575:4: ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2576:5: {...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2576:103: ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2577:6: ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2580:6: ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2580:8: 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,33,FOLLOW_33_in_ruleButton4902); 

            	            createLeafNode(grammarAccess.getButtonAccess().getLeftKeyword_4_1_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2584:1: ( (lv_left_10_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2585:1: (lv_left_10_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2585:1: (lv_left_10_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2586:3: lv_left_10_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getLeftDimensionPropertyValueParserRuleCall_4_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleButton4923);
            	    lv_left_10_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"left",
            	    	        		lv_left_10_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2615:4: ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2615:4: ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2616:5: {...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2616:103: ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2617:6: ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2620:6: ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2620:8: 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,34,FOLLOW_34_in_ruleButton4985); 

            	            createLeafNode(grammarAccess.getButtonAccess().getWidthKeyword_4_2_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2624:1: ( (lv_width_12_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2625:1: (lv_width_12_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2625:1: (lv_width_12_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2626:3: lv_width_12_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getWidthDimensionPropertyValueParserRuleCall_4_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleButton5006);
            	    lv_width_12_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"width",
            	    	        		lv_width_12_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2655:4: ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2655:4: ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2656:5: {...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2656:103: ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2657:6: ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2660:6: ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2660:8: 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,35,FOLLOW_35_in_ruleButton5068); 

            	            createLeafNode(grammarAccess.getButtonAccess().getHeightKeyword_4_3_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2664:1: ( (lv_height_14_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2665:1: (lv_height_14_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2665:1: (lv_height_14_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2666:3: lv_height_14_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getHeightDimensionPropertyValueParserRuleCall_4_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleButton5089);
            	    lv_height_14_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"height",
            	    	        		lv_height_14_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2695:4: ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2695:4: ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2696:5: {...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2696:103: ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2697:6: ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2700:6: ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2700:8: 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) )
            	    {
            	    match(input,36,FOLLOW_36_in_ruleButton5151); 

            	            createLeafNode(grammarAccess.getButtonAccess().getBackgroundKeyword_4_4_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2704:1: ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2705:1: (lv_background_16_0= ruleDrawableResourcePropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2705:1: (lv_background_16_0= ruleDrawableResourcePropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2706:3: lv_background_16_0= ruleDrawableResourcePropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getBackgroundDrawableResourcePropertyValueParserRuleCall_4_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDrawableResourcePropertyValue_in_ruleButton5172);
            	    lv_background_16_0=ruleDrawableResourcePropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"background",
            	    	        		lv_background_16_0, 
            	    	        		"DrawableResourcePropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2735:4: ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2735:4: ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2736:5: {...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2736:103: ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2737:6: ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2740:6: ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2740:8: 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,37,FOLLOW_37_in_ruleButton5234); 

            	            createLeafNode(grammarAccess.getButtonAccess().getClickableKeyword_4_5_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2744:1: ( (lv_clickable_18_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2745:1: (lv_clickable_18_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2745:1: (lv_clickable_18_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2746:3: lv_clickable_18_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getClickableBooleanPropertyValueParserRuleCall_4_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleButton5255);
            	    lv_clickable_18_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"clickable",
            	    	        		lv_clickable_18_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2775:4: ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2775:4: ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2776:5: {...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2776:103: ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2777:6: ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 6);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2780:6: ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2780:8: 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,38,FOLLOW_38_in_ruleButton5317); 

            	            createLeafNode(grammarAccess.getButtonAccess().getFadeScrollBarsKeyword_4_6_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2784:1: ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2785:1: (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2785:1: (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2786:3: lv_fadeScrollBars_20_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getFadeScrollBarsBooleanPropertyValueParserRuleCall_4_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleButton5338);
            	    lv_fadeScrollBars_20_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"fadeScrollBars",
            	    	        		lv_fadeScrollBars_20_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2815:4: ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2815:4: ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2816:5: {...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2816:103: ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2817:6: ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 7);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2820:6: ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2820:8: 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,39,FOLLOW_39_in_ruleButton5400); 

            	            createLeafNode(grammarAccess.getButtonAccess().getIsScrollContainerKeyword_4_7_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2824:1: ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2825:1: (lv_isScrollContainer_22_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2825:1: (lv_isScrollContainer_22_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2826:3: lv_isScrollContainer_22_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getIsScrollContainerBooleanPropertyValueParserRuleCall_4_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleButton5421);
            	    lv_isScrollContainer_22_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"isScrollContainer",
            	    	        		lv_isScrollContainer_22_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2855:4: ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2855:4: ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2856:5: {...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2856:103: ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2857:6: ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 8);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2860:6: ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2860:8: 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) )
            	    {
            	    match(input,42,FOLLOW_42_in_ruleButton5483); 

            	            createLeafNode(grammarAccess.getButtonAccess().getHintKeyword_4_8_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2864:1: ( (lv_hint_24_0= ruleStringPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2865:1: (lv_hint_24_0= ruleStringPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2865:1: (lv_hint_24_0= ruleStringPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2866:3: lv_hint_24_0= ruleStringPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getHintStringPropertyValueParserRuleCall_4_8_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringPropertyValue_in_ruleButton5504);
            	    lv_hint_24_0=ruleStringPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"hint",
            	    	        		lv_hint_24_0, 
            	    	        		"StringPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2895:4: ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2895:4: ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2896:5: {...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2896:103: ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2897:6: ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup_4(), 9);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2900:6: ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2900:8: 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) )
            	    {
            	    match(input,43,FOLLOW_43_in_ruleButton5566); 

            	            createLeafNode(grammarAccess.getButtonAccess().getTextColorKeyword_4_9_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2904:1: ( (lv_textColor_26_0= ruleColorPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2905:1: (lv_textColor_26_0= ruleColorPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2905:1: (lv_textColor_26_0= ruleColorPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2906:3: lv_textColor_26_0= ruleColorPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getTextColorColorPropertyValueParserRuleCall_4_9_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleColorPropertyValue_in_ruleButton5587);
            	    lv_textColor_26_0=ruleColorPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"textColor",
            	    	        		lv_textColor_26_0, 
            	    	        		"ColorPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getButtonAccess().getUnorderedGroup_4());
            	

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2942:2: ( '->' ( (lv_actions_28_0= ruleAction ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==40) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2942:4: '->' ( (lv_actions_28_0= ruleAction ) )
            	    {
            	    match(input,40,FOLLOW_40_in_ruleButton5638); 

            	            createLeafNode(grammarAccess.getButtonAccess().getHyphenMinusGreaterThanSignKeyword_5_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2946:1: ( (lv_actions_28_0= ruleAction ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2947:1: (lv_actions_28_0= ruleAction )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2947:1: (lv_actions_28_0= ruleAction )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2948:3: lv_actions_28_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getActionsActionParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleButton5659);
            	    lv_actions_28_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actions",
            	    	        		lv_actions_28_0, 
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
            	    break loop17;
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
    // $ANTLR end ruleButton


    // $ANTLR start entryRuleImageButton
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2978:1: entryRuleImageButton returns [EObject current=null] : iv_ruleImageButton= ruleImageButton EOF ;
    public final EObject entryRuleImageButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageButton = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2979:2: (iv_ruleImageButton= ruleImageButton EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2980:2: iv_ruleImageButton= ruleImageButton EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImageButtonRule(), currentNode); 
            pushFollow(FOLLOW_ruleImageButton_in_entryRuleImageButton5697);
            iv_ruleImageButton=ruleImageButton();
            _fsp--;

             current =iv_ruleImageButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageButton5707); 

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
    // $ANTLR end entryRuleImageButton


    // $ANTLR start ruleImageButton
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2987:1: ruleImageButton returns [EObject current=null] : ( 'imageButton' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_src_5_0= ruleDrawableImageResourcePropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )* ) ;
    public final EObject ruleImageButton() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        EObject lv_src_5_0 = null;

        EObject lv_top_8_0 = null;

        EObject lv_left_10_0 = null;

        EObject lv_width_12_0 = null;

        EObject lv_height_14_0 = null;

        EObject lv_background_16_0 = null;

        EObject lv_clickable_18_0 = null;

        EObject lv_fadeScrollBars_20_0 = null;

        EObject lv_isScrollContainer_22_0 = null;

        EObject lv_hint_24_0 = null;

        EObject lv_textColor_26_0 = null;

        EObject lv_actions_28_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2992:6: ( ( 'imageButton' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_src_5_0= ruleDrawableImageResourcePropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2993:1: ( 'imageButton' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_src_5_0= ruleDrawableImageResourcePropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2993:1: ( 'imageButton' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_src_5_0= ruleDrawableImageResourcePropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2993:3: 'imageButton' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_src_5_0= ruleDrawableImageResourcePropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) ( '->' ( (lv_actions_28_0= ruleAction ) ) )*
            {
            match(input,45,FOLLOW_45_in_ruleImageButton5742); 

                    createLeafNode(grammarAccess.getImageButtonAccess().getImageButtonKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2997:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:2998:5: 
            {
             
                    temp=factory.create(grammarAccess.getImageButtonAccess().getImageButtonAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getImageButtonAccess().getImageButtonAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3008:2: ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3008:4: '<' ( (lv_id_3_0= RULE_ID ) ) '>'
                    {
                    match(input,30,FOLLOW_30_in_ruleImageButton5762); 

                            createLeafNode(grammarAccess.getImageButtonAccess().getLessThanSignKeyword_2_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3012:1: ( (lv_id_3_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3013:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3013:1: (lv_id_3_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3014:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImageButton5779); 

                    			createLeafNode(grammarAccess.getImageButtonAccess().getIdIDTerminalRuleCall_2_1_0(), "id"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getImageButtonRule().getType().getClassifier());
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

                    match(input,31,FOLLOW_31_in_ruleImageButton5794); 

                            createLeafNode(grammarAccess.getImageButtonAccess().getGreaterThanSignKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3040:3: ( (lv_src_5_0= ruleDrawableImageResourcePropertyValue ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3041:1: (lv_src_5_0= ruleDrawableImageResourcePropertyValue )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3041:1: (lv_src_5_0= ruleDrawableImageResourcePropertyValue )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3042:3: lv_src_5_0= ruleDrawableImageResourcePropertyValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageButtonAccess().getSrcDrawableImageResourcePropertyValueParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDrawableImageResourcePropertyValue_in_ruleImageButton5817);
            lv_src_5_0=ruleDrawableImageResourcePropertyValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageButtonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"src",
            	        		lv_src_5_0, 
            	        		"DrawableImageResourcePropertyValue", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3064:2: ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3066:1: ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3066:1: ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3067:2: ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getImageButtonAccess().getUnorderedGroup_4());
            	
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3070:2: ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3071:3: ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )*
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3071:3: ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )*
            loop19:
            do {
                int alt19=11;
                int LA19_0 = input.LA(1);

                if ( LA19_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 1) ) {
                    alt19=2;
                }
                else if ( LA19_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 2) ) {
                    alt19=3;
                }
                else if ( LA19_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 3) ) {
                    alt19=4;
                }
                else if ( LA19_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 4) ) {
                    alt19=5;
                }
                else if ( LA19_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 5) ) {
                    alt19=6;
                }
                else if ( LA19_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 6) ) {
                    alt19=7;
                }
                else if ( LA19_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 7) ) {
                    alt19=8;
                }
                else if ( LA19_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 8) ) {
                    alt19=9;
                }
                else if ( LA19_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 9) ) {
                    alt19=10;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3073:4: ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3073:4: ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3074:5: {...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleImageButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3074:108: ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3075:6: ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3078:6: ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3078:8: 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,32,FOLLOW_32_in_ruleImageButton5870); 

            	            createLeafNode(grammarAccess.getImageButtonAccess().getTopKeyword_4_0_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3082:1: ( (lv_top_8_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3083:1: (lv_top_8_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3083:1: (lv_top_8_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3084:3: lv_top_8_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getImageButtonAccess().getTopDimensionPropertyValueParserRuleCall_4_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleImageButton5891);
            	    lv_top_8_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getImageButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"top",
            	    	        		lv_top_8_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3113:4: ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3113:4: ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3114:5: {...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleImageButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3114:108: ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3115:6: ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3118:6: ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3118:8: 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,33,FOLLOW_33_in_ruleImageButton5953); 

            	            createLeafNode(grammarAccess.getImageButtonAccess().getLeftKeyword_4_1_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3122:1: ( (lv_left_10_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3123:1: (lv_left_10_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3123:1: (lv_left_10_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3124:3: lv_left_10_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getImageButtonAccess().getLeftDimensionPropertyValueParserRuleCall_4_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleImageButton5974);
            	    lv_left_10_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getImageButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"left",
            	    	        		lv_left_10_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3153:4: ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3153:4: ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3154:5: {...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleImageButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3154:108: ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3155:6: ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3158:6: ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3158:8: 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,34,FOLLOW_34_in_ruleImageButton6036); 

            	            createLeafNode(grammarAccess.getImageButtonAccess().getWidthKeyword_4_2_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3162:1: ( (lv_width_12_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3163:1: (lv_width_12_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3163:1: (lv_width_12_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3164:3: lv_width_12_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getImageButtonAccess().getWidthDimensionPropertyValueParserRuleCall_4_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleImageButton6057);
            	    lv_width_12_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getImageButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"width",
            	    	        		lv_width_12_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3193:4: ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3193:4: ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3194:5: {...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleImageButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3194:108: ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3195:6: ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3198:6: ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3198:8: 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,35,FOLLOW_35_in_ruleImageButton6119); 

            	            createLeafNode(grammarAccess.getImageButtonAccess().getHeightKeyword_4_3_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3202:1: ( (lv_height_14_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3203:1: (lv_height_14_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3203:1: (lv_height_14_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3204:3: lv_height_14_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getImageButtonAccess().getHeightDimensionPropertyValueParserRuleCall_4_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleImageButton6140);
            	    lv_height_14_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getImageButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"height",
            	    	        		lv_height_14_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3233:4: ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3233:4: ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3234:5: {...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleImageButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3234:108: ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3235:6: ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3238:6: ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3238:8: 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) )
            	    {
            	    match(input,36,FOLLOW_36_in_ruleImageButton6202); 

            	            createLeafNode(grammarAccess.getImageButtonAccess().getBackgroundKeyword_4_4_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3242:1: ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3243:1: (lv_background_16_0= ruleDrawableResourcePropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3243:1: (lv_background_16_0= ruleDrawableResourcePropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3244:3: lv_background_16_0= ruleDrawableResourcePropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getImageButtonAccess().getBackgroundDrawableResourcePropertyValueParserRuleCall_4_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDrawableResourcePropertyValue_in_ruleImageButton6223);
            	    lv_background_16_0=ruleDrawableResourcePropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getImageButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"background",
            	    	        		lv_background_16_0, 
            	    	        		"DrawableResourcePropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3273:4: ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3273:4: ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3274:5: {...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleImageButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3274:108: ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3275:6: ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3278:6: ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3278:8: 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,37,FOLLOW_37_in_ruleImageButton6285); 

            	            createLeafNode(grammarAccess.getImageButtonAccess().getClickableKeyword_4_5_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3282:1: ( (lv_clickable_18_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3283:1: (lv_clickable_18_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3283:1: (lv_clickable_18_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3284:3: lv_clickable_18_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getImageButtonAccess().getClickableBooleanPropertyValueParserRuleCall_4_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleImageButton6306);
            	    lv_clickable_18_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getImageButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"clickable",
            	    	        		lv_clickable_18_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3313:4: ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3313:4: ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3314:5: {...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleImageButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3314:108: ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3315:6: ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 6);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3318:6: ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3318:8: 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,38,FOLLOW_38_in_ruleImageButton6368); 

            	            createLeafNode(grammarAccess.getImageButtonAccess().getFadeScrollBarsKeyword_4_6_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3322:1: ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3323:1: (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3323:1: (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3324:3: lv_fadeScrollBars_20_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getImageButtonAccess().getFadeScrollBarsBooleanPropertyValueParserRuleCall_4_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleImageButton6389);
            	    lv_fadeScrollBars_20_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getImageButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"fadeScrollBars",
            	    	        		lv_fadeScrollBars_20_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3353:4: ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3353:4: ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3354:5: {...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleImageButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3354:108: ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3355:6: ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 7);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3358:6: ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3358:8: 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,39,FOLLOW_39_in_ruleImageButton6451); 

            	            createLeafNode(grammarAccess.getImageButtonAccess().getIsScrollContainerKeyword_4_7_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3362:1: ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3363:1: (lv_isScrollContainer_22_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3363:1: (lv_isScrollContainer_22_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3364:3: lv_isScrollContainer_22_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getImageButtonAccess().getIsScrollContainerBooleanPropertyValueParserRuleCall_4_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleImageButton6472);
            	    lv_isScrollContainer_22_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getImageButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"isScrollContainer",
            	    	        		lv_isScrollContainer_22_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3393:4: ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3393:4: ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3394:5: {...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleImageButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3394:108: ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3395:6: ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 8);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3398:6: ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3398:8: 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) )
            	    {
            	    match(input,42,FOLLOW_42_in_ruleImageButton6534); 

            	            createLeafNode(grammarAccess.getImageButtonAccess().getHintKeyword_4_8_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3402:1: ( (lv_hint_24_0= ruleStringPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3403:1: (lv_hint_24_0= ruleStringPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3403:1: (lv_hint_24_0= ruleStringPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3404:3: lv_hint_24_0= ruleStringPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getImageButtonAccess().getHintStringPropertyValueParserRuleCall_4_8_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringPropertyValue_in_ruleImageButton6555);
            	    lv_hint_24_0=ruleStringPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getImageButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"hint",
            	    	        		lv_hint_24_0, 
            	    	        		"StringPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3433:4: ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3433:4: ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3434:5: {...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleImageButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3434:108: ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3435:6: ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageButtonAccess().getUnorderedGroup_4(), 9);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3438:6: ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3438:8: 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) )
            	    {
            	    match(input,43,FOLLOW_43_in_ruleImageButton6617); 

            	            createLeafNode(grammarAccess.getImageButtonAccess().getTextColorKeyword_4_9_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3442:1: ( (lv_textColor_26_0= ruleColorPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3443:1: (lv_textColor_26_0= ruleColorPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3443:1: (lv_textColor_26_0= ruleColorPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3444:3: lv_textColor_26_0= ruleColorPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getImageButtonAccess().getTextColorColorPropertyValueParserRuleCall_4_9_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleColorPropertyValue_in_ruleImageButton6638);
            	    lv_textColor_26_0=ruleColorPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getImageButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"textColor",
            	    	        		lv_textColor_26_0, 
            	    	        		"ColorPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageButtonAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getImageButtonAccess().getUnorderedGroup_4());
            	

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3480:2: ( '->' ( (lv_actions_28_0= ruleAction ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3480:4: '->' ( (lv_actions_28_0= ruleAction ) )
            	    {
            	    match(input,40,FOLLOW_40_in_ruleImageButton6689); 

            	            createLeafNode(grammarAccess.getImageButtonAccess().getHyphenMinusGreaterThanSignKeyword_5_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3484:1: ( (lv_actions_28_0= ruleAction ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3485:1: (lv_actions_28_0= ruleAction )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3485:1: (lv_actions_28_0= ruleAction )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3486:3: lv_actions_28_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getImageButtonAccess().getActionsActionParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleImageButton6710);
            	    lv_actions_28_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getImageButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actions",
            	    	        		lv_actions_28_0, 
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
            	    break loop20;
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
    // $ANTLR end ruleImageButton


    // $ANTLR start entryRuleLink
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3516:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3517:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3518:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink6748);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink6758); 

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
    // $ANTLR end entryRuleLink


    // $ANTLR start ruleLink
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3525:1: ruleLink returns [EObject current=null] : ( 'link' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) 'to' ( ( RULE_ID ) ) ( '->' ( (lv_actions_30_0= ruleAction ) ) )* ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        EObject lv_text_5_0 = null;

        EObject lv_top_8_0 = null;

        EObject lv_left_10_0 = null;

        EObject lv_width_12_0 = null;

        EObject lv_height_14_0 = null;

        EObject lv_background_16_0 = null;

        EObject lv_clickable_18_0 = null;

        EObject lv_fadeScrollBars_20_0 = null;

        EObject lv_isScrollContainer_22_0 = null;

        EObject lv_hint_24_0 = null;

        EObject lv_textColor_26_0 = null;

        EObject lv_actions_30_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3530:6: ( ( 'link' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) 'to' ( ( RULE_ID ) ) ( '->' ( (lv_actions_30_0= ruleAction ) ) )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3531:1: ( 'link' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) 'to' ( ( RULE_ID ) ) ( '->' ( (lv_actions_30_0= ruleAction ) ) )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3531:1: ( 'link' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) 'to' ( ( RULE_ID ) ) ( '->' ( (lv_actions_30_0= ruleAction ) ) )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3531:3: 'link' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) ) 'to' ( ( RULE_ID ) ) ( '->' ( (lv_actions_30_0= ruleAction ) ) )*
            {
            match(input,46,FOLLOW_46_in_ruleLink6793); 

                    createLeafNode(grammarAccess.getLinkAccess().getLinkKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3535:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3536:5: 
            {
             
                    temp=factory.create(grammarAccess.getLinkAccess().getLinkAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLinkAccess().getLinkAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3546:2: ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3546:4: '<' ( (lv_id_3_0= RULE_ID ) ) '>'
                    {
                    match(input,30,FOLLOW_30_in_ruleLink6813); 

                            createLeafNode(grammarAccess.getLinkAccess().getLessThanSignKeyword_2_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3550:1: ( (lv_id_3_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3551:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3551:1: (lv_id_3_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3552:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink6830); 

                    			createLeafNode(grammarAccess.getLinkAccess().getIdIDTerminalRuleCall_2_1_0(), "id"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
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

                    match(input,31,FOLLOW_31_in_ruleLink6845); 

                            createLeafNode(grammarAccess.getLinkAccess().getGreaterThanSignKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3578:3: ( (lv_text_5_0= ruleStringPropertyValue ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3579:1: (lv_text_5_0= ruleStringPropertyValue )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3579:1: (lv_text_5_0= ruleStringPropertyValue )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3580:3: lv_text_5_0= ruleStringPropertyValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTextStringPropertyValueParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStringPropertyValue_in_ruleLink6868);
            lv_text_5_0=ruleStringPropertyValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_5_0, 
            	        		"StringPropertyValue", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3602:2: ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3604:1: ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3604:1: ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3605:2: ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getLinkAccess().getUnorderedGroup_4());
            	
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3608:2: ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3609:3: ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )*
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3609:3: ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) )*
            loop22:
            do {
                int alt22=11;
                int LA22_0 = input.LA(1);

                if ( LA22_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 1) ) {
                    alt22=2;
                }
                else if ( LA22_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 2) ) {
                    alt22=3;
                }
                else if ( LA22_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 3) ) {
                    alt22=4;
                }
                else if ( LA22_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 4) ) {
                    alt22=5;
                }
                else if ( LA22_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 5) ) {
                    alt22=6;
                }
                else if ( LA22_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 6) ) {
                    alt22=7;
                }
                else if ( LA22_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 7) ) {
                    alt22=8;
                }
                else if ( LA22_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 8) ) {
                    alt22=9;
                }
                else if ( LA22_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 9) ) {
                    alt22=10;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3611:4: ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3611:4: ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3612:5: {...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3612:101: ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3613:6: ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3616:6: ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3616:8: 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,32,FOLLOW_32_in_ruleLink6921); 

            	            createLeafNode(grammarAccess.getLinkAccess().getTopKeyword_4_0_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3620:1: ( (lv_top_8_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3621:1: (lv_top_8_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3621:1: (lv_top_8_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3622:3: lv_top_8_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTopDimensionPropertyValueParserRuleCall_4_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleLink6942);
            	    lv_top_8_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"top",
            	    	        		lv_top_8_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLinkAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3651:4: ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3651:4: ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3652:5: {...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3652:101: ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3653:6: ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3656:6: ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3656:8: 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,33,FOLLOW_33_in_ruleLink7004); 

            	            createLeafNode(grammarAccess.getLinkAccess().getLeftKeyword_4_1_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3660:1: ( (lv_left_10_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3661:1: (lv_left_10_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3661:1: (lv_left_10_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3662:3: lv_left_10_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getLeftDimensionPropertyValueParserRuleCall_4_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleLink7025);
            	    lv_left_10_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"left",
            	    	        		lv_left_10_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLinkAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3691:4: ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3691:4: ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3692:5: {...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3692:101: ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3693:6: ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3696:6: ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3696:8: 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,34,FOLLOW_34_in_ruleLink7087); 

            	            createLeafNode(grammarAccess.getLinkAccess().getWidthKeyword_4_2_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3700:1: ( (lv_width_12_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3701:1: (lv_width_12_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3701:1: (lv_width_12_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3702:3: lv_width_12_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getWidthDimensionPropertyValueParserRuleCall_4_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleLink7108);
            	    lv_width_12_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"width",
            	    	        		lv_width_12_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLinkAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3731:4: ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3731:4: ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3732:5: {...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3732:101: ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3733:6: ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3736:6: ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3736:8: 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,35,FOLLOW_35_in_ruleLink7170); 

            	            createLeafNode(grammarAccess.getLinkAccess().getHeightKeyword_4_3_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3740:1: ( (lv_height_14_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3741:1: (lv_height_14_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3741:1: (lv_height_14_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3742:3: lv_height_14_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getHeightDimensionPropertyValueParserRuleCall_4_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleLink7191);
            	    lv_height_14_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"height",
            	    	        		lv_height_14_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLinkAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3771:4: ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3771:4: ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3772:5: {...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3772:101: ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3773:6: ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3776:6: ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3776:8: 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) )
            	    {
            	    match(input,36,FOLLOW_36_in_ruleLink7253); 

            	            createLeafNode(grammarAccess.getLinkAccess().getBackgroundKeyword_4_4_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3780:1: ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3781:1: (lv_background_16_0= ruleDrawableResourcePropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3781:1: (lv_background_16_0= ruleDrawableResourcePropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3782:3: lv_background_16_0= ruleDrawableResourcePropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getBackgroundDrawableResourcePropertyValueParserRuleCall_4_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDrawableResourcePropertyValue_in_ruleLink7274);
            	    lv_background_16_0=ruleDrawableResourcePropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"background",
            	    	        		lv_background_16_0, 
            	    	        		"DrawableResourcePropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLinkAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3811:4: ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3811:4: ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3812:5: {...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3812:101: ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3813:6: ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3816:6: ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3816:8: 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,37,FOLLOW_37_in_ruleLink7336); 

            	            createLeafNode(grammarAccess.getLinkAccess().getClickableKeyword_4_5_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3820:1: ( (lv_clickable_18_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3821:1: (lv_clickable_18_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3821:1: (lv_clickable_18_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3822:3: lv_clickable_18_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getClickableBooleanPropertyValueParserRuleCall_4_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleLink7357);
            	    lv_clickable_18_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"clickable",
            	    	        		lv_clickable_18_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLinkAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3851:4: ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3851:4: ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3852:5: {...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3852:101: ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3853:6: ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 6);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3856:6: ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3856:8: 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,38,FOLLOW_38_in_ruleLink7419); 

            	            createLeafNode(grammarAccess.getLinkAccess().getFadeScrollBarsKeyword_4_6_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3860:1: ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3861:1: (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3861:1: (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3862:3: lv_fadeScrollBars_20_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getFadeScrollBarsBooleanPropertyValueParserRuleCall_4_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleLink7440);
            	    lv_fadeScrollBars_20_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"fadeScrollBars",
            	    	        		lv_fadeScrollBars_20_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLinkAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3891:4: ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3891:4: ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3892:5: {...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3892:101: ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3893:6: ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 7);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3896:6: ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3896:8: 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,39,FOLLOW_39_in_ruleLink7502); 

            	            createLeafNode(grammarAccess.getLinkAccess().getIsScrollContainerKeyword_4_7_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3900:1: ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3901:1: (lv_isScrollContainer_22_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3901:1: (lv_isScrollContainer_22_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3902:3: lv_isScrollContainer_22_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getIsScrollContainerBooleanPropertyValueParserRuleCall_4_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleLink7523);
            	    lv_isScrollContainer_22_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"isScrollContainer",
            	    	        		lv_isScrollContainer_22_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLinkAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3931:4: ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3931:4: ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3932:5: {...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3932:101: ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3933:6: ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 8);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3936:6: ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3936:8: 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) )
            	    {
            	    match(input,42,FOLLOW_42_in_ruleLink7585); 

            	            createLeafNode(grammarAccess.getLinkAccess().getHintKeyword_4_8_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3940:1: ( (lv_hint_24_0= ruleStringPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3941:1: (lv_hint_24_0= ruleStringPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3941:1: (lv_hint_24_0= ruleStringPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3942:3: lv_hint_24_0= ruleStringPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getHintStringPropertyValueParserRuleCall_4_8_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringPropertyValue_in_ruleLink7606);
            	    lv_hint_24_0=ruleStringPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"hint",
            	    	        		lv_hint_24_0, 
            	    	        		"StringPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLinkAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3971:4: ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3971:4: ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3972:5: {...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3972:101: ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3973:6: ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLinkAccess().getUnorderedGroup_4(), 9);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3976:6: ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3976:8: 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) )
            	    {
            	    match(input,43,FOLLOW_43_in_ruleLink7668); 

            	            createLeafNode(grammarAccess.getLinkAccess().getTextColorKeyword_4_9_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3980:1: ( (lv_textColor_26_0= ruleColorPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3981:1: (lv_textColor_26_0= ruleColorPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3981:1: (lv_textColor_26_0= ruleColorPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:3982:3: lv_textColor_26_0= ruleColorPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTextColorColorPropertyValueParserRuleCall_4_9_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleColorPropertyValue_in_ruleLink7689);
            	    lv_textColor_26_0=ruleColorPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"textColor",
            	    	        		lv_textColor_26_0, 
            	    	        		"ColorPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLinkAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getLinkAccess().getUnorderedGroup_4());
            	

            }

            match(input,47,FOLLOW_47_in_ruleLink7739); 

                    createLeafNode(grammarAccess.getLinkAccess().getToKeyword_5(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4022:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4023:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4023:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4024:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink7757); 

            		createLeafNode(grammarAccess.getLinkAccess().getTargetActivityCrossReference_6_0(), "target"); 
            	

            }


            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4036:2: ( '->' ( (lv_actions_30_0= ruleAction ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4036:4: '->' ( (lv_actions_30_0= ruleAction ) )
            	    {
            	    match(input,40,FOLLOW_40_in_ruleLink7768); 

            	            createLeafNode(grammarAccess.getLinkAccess().getHyphenMinusGreaterThanSignKeyword_7_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4040:1: ( (lv_actions_30_0= ruleAction ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4041:1: (lv_actions_30_0= ruleAction )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4041:1: (lv_actions_30_0= ruleAction )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4042:3: lv_actions_30_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getActionsActionParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleLink7789);
            	    lv_actions_30_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actions",
            	    	        		lv_actions_30_0, 
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
            	    break loop23;
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
    // $ANTLR end ruleLink


    // $ANTLR start entryRuleSpinner
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4072:1: entryRuleSpinner returns [EObject current=null] : iv_ruleSpinner= ruleSpinner EOF ;
    public final EObject entryRuleSpinner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinner = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4073:2: (iv_ruleSpinner= ruleSpinner EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4074:2: iv_ruleSpinner= ruleSpinner EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSpinnerRule(), currentNode); 
            pushFollow(FOLLOW_ruleSpinner_in_entryRuleSpinner7827);
            iv_ruleSpinner=ruleSpinner();
            _fsp--;

             current =iv_ruleSpinner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpinner7837); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4081:1: ruleSpinner returns [EObject current=null] : ( 'spinner' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleSpinner() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        EObject lv_top_7_0 = null;

        EObject lv_left_9_0 = null;

        EObject lv_width_11_0 = null;

        EObject lv_height_13_0 = null;

        EObject lv_background_15_0 = null;

        EObject lv_clickable_17_0 = null;

        EObject lv_fadeScrollBars_19_0 = null;

        EObject lv_isScrollContainer_21_0 = null;

        EObject lv_prompt_23_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4086:6: ( ( 'spinner' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) ) ) )* ) ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4087:1: ( 'spinner' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) ) ) )* ) ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4087:1: ( 'spinner' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) ) ) )* ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4087:3: 'spinner' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) ) ) )* ) ) )
            {
            match(input,48,FOLLOW_48_in_ruleSpinner7872); 

                    createLeafNode(grammarAccess.getSpinnerAccess().getSpinnerKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4091:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4092:5: 
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

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4102:2: ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4102:4: '<' ( (lv_id_3_0= RULE_ID ) ) '>'
                    {
                    match(input,30,FOLLOW_30_in_ruleSpinner7892); 

                            createLeafNode(grammarAccess.getSpinnerAccess().getLessThanSignKeyword_2_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4106:1: ( (lv_id_3_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4107:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4107:1: (lv_id_3_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4108:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpinner7909); 

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

                    match(input,31,FOLLOW_31_in_ruleSpinner7924); 

                            createLeafNode(grammarAccess.getSpinnerAccess().getGreaterThanSignKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4134:3: ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) ) ) )* ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4136:1: ( ( ( ({...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) ) ) )* ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4136:1: ( ( ( ({...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) ) ) )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4137:2: ( ( ({...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSpinnerAccess().getUnorderedGroup_3());
            	
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4140:2: ( ( ({...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) ) ) )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4141:3: ( ({...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) ) ) )*
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4141:3: ( ({...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) ) ) )*
            loop25:
            do {
                int alt25=10;
                int LA25_0 = input.LA(1);

                if ( LA25_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 1) ) {
                    alt25=2;
                }
                else if ( LA25_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 2) ) {
                    alt25=3;
                }
                else if ( LA25_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 3) ) {
                    alt25=4;
                }
                else if ( LA25_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 4) ) {
                    alt25=5;
                }
                else if ( LA25_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 5) ) {
                    alt25=6;
                }
                else if ( LA25_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 6) ) {
                    alt25=7;
                }
                else if ( LA25_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 7) ) {
                    alt25=8;
                }
                else if ( LA25_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 8) ) {
                    alt25=9;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4143:4: ({...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4143:4: ({...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4144:5: {...}? => ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSpinner", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4144:104: ( ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4145:6: ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4148:6: ( 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4148:8: 'top:' ( (lv_top_7_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,32,FOLLOW_32_in_ruleSpinner7979); 

            	            createLeafNode(grammarAccess.getSpinnerAccess().getTopKeyword_3_0_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4152:1: ( (lv_top_7_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4153:1: (lv_top_7_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4153:1: (lv_top_7_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4154:3: lv_top_7_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSpinnerAccess().getTopDimensionPropertyValueParserRuleCall_3_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleSpinner8000);
            	    lv_top_7_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSpinnerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"top",
            	    	        		lv_top_7_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpinnerAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4183:4: ({...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4183:4: ({...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4184:5: {...}? => ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSpinner", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4184:104: ( ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4185:6: ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4188:6: ( 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4188:8: 'left:' ( (lv_left_9_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,33,FOLLOW_33_in_ruleSpinner8062); 

            	            createLeafNode(grammarAccess.getSpinnerAccess().getLeftKeyword_3_1_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4192:1: ( (lv_left_9_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4193:1: (lv_left_9_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4193:1: (lv_left_9_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4194:3: lv_left_9_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSpinnerAccess().getLeftDimensionPropertyValueParserRuleCall_3_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleSpinner8083);
            	    lv_left_9_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSpinnerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"left",
            	    	        		lv_left_9_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpinnerAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4223:4: ({...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4223:4: ({...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4224:5: {...}? => ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSpinner", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4224:104: ( ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4225:6: ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4228:6: ( 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4228:8: 'width:' ( (lv_width_11_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,34,FOLLOW_34_in_ruleSpinner8145); 

            	            createLeafNode(grammarAccess.getSpinnerAccess().getWidthKeyword_3_2_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4232:1: ( (lv_width_11_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4233:1: (lv_width_11_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4233:1: (lv_width_11_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4234:3: lv_width_11_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSpinnerAccess().getWidthDimensionPropertyValueParserRuleCall_3_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleSpinner8166);
            	    lv_width_11_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSpinnerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"width",
            	    	        		lv_width_11_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpinnerAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4263:4: ({...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4263:4: ({...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4264:5: {...}? => ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSpinner", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4264:104: ( ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4265:6: ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4268:6: ( 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4268:8: 'height:' ( (lv_height_13_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,35,FOLLOW_35_in_ruleSpinner8228); 

            	            createLeafNode(grammarAccess.getSpinnerAccess().getHeightKeyword_3_3_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4272:1: ( (lv_height_13_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4273:1: (lv_height_13_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4273:1: (lv_height_13_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4274:3: lv_height_13_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSpinnerAccess().getHeightDimensionPropertyValueParserRuleCall_3_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleSpinner8249);
            	    lv_height_13_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSpinnerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"height",
            	    	        		lv_height_13_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpinnerAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4303:4: ({...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4303:4: ({...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4304:5: {...}? => ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSpinner", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4304:104: ( ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4305:6: ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4308:6: ( 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4308:8: 'background:' ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) )
            	    {
            	    match(input,36,FOLLOW_36_in_ruleSpinner8311); 

            	            createLeafNode(grammarAccess.getSpinnerAccess().getBackgroundKeyword_3_4_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4312:1: ( (lv_background_15_0= ruleDrawableResourcePropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4313:1: (lv_background_15_0= ruleDrawableResourcePropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4313:1: (lv_background_15_0= ruleDrawableResourcePropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4314:3: lv_background_15_0= ruleDrawableResourcePropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSpinnerAccess().getBackgroundDrawableResourcePropertyValueParserRuleCall_3_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDrawableResourcePropertyValue_in_ruleSpinner8332);
            	    lv_background_15_0=ruleDrawableResourcePropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSpinnerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"background",
            	    	        		lv_background_15_0, 
            	    	        		"DrawableResourcePropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpinnerAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4343:4: ({...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4343:4: ({...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4344:5: {...}? => ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSpinner", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4344:104: ( ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4345:6: ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4348:6: ( 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4348:8: 'clickable?' ( (lv_clickable_17_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,37,FOLLOW_37_in_ruleSpinner8394); 

            	            createLeafNode(grammarAccess.getSpinnerAccess().getClickableKeyword_3_5_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4352:1: ( (lv_clickable_17_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4353:1: (lv_clickable_17_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4353:1: (lv_clickable_17_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4354:3: lv_clickable_17_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSpinnerAccess().getClickableBooleanPropertyValueParserRuleCall_3_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleSpinner8415);
            	    lv_clickable_17_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSpinnerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"clickable",
            	    	        		lv_clickable_17_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpinnerAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4383:4: ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4383:4: ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4384:5: {...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSpinner", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4384:104: ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4385:6: ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4388:6: ( 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4388:8: 'fadeScrollBars?' ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,38,FOLLOW_38_in_ruleSpinner8477); 

            	            createLeafNode(grammarAccess.getSpinnerAccess().getFadeScrollBarsKeyword_3_6_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4392:1: ( (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4393:1: (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4393:1: (lv_fadeScrollBars_19_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4394:3: lv_fadeScrollBars_19_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSpinnerAccess().getFadeScrollBarsBooleanPropertyValueParserRuleCall_3_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleSpinner8498);
            	    lv_fadeScrollBars_19_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSpinnerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"fadeScrollBars",
            	    	        		lv_fadeScrollBars_19_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpinnerAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4423:4: ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4423:4: ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4424:5: {...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleSpinner", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4424:104: ( ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4425:6: ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4428:6: ( 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4428:8: 'isScrollContainer?' ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,39,FOLLOW_39_in_ruleSpinner8560); 

            	            createLeafNode(grammarAccess.getSpinnerAccess().getIsScrollContainerKeyword_3_7_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4432:1: ( (lv_isScrollContainer_21_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4433:1: (lv_isScrollContainer_21_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4433:1: (lv_isScrollContainer_21_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4434:3: lv_isScrollContainer_21_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSpinnerAccess().getIsScrollContainerBooleanPropertyValueParserRuleCall_3_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleSpinner8581);
            	    lv_isScrollContainer_21_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSpinnerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"isScrollContainer",
            	    	        		lv_isScrollContainer_21_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpinnerAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4463:4: ({...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4463:4: ({...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4464:5: {...}? => ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleSpinner", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4464:104: ( ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4465:6: ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSpinnerAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4468:6: ( 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4468:8: 'prompt:' ( (lv_prompt_23_0= ruleStringPropertyValue ) )
            	    {
            	    match(input,49,FOLLOW_49_in_ruleSpinner8643); 

            	            createLeafNode(grammarAccess.getSpinnerAccess().getPromptKeyword_3_8_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4472:1: ( (lv_prompt_23_0= ruleStringPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4473:1: (lv_prompt_23_0= ruleStringPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4473:1: (lv_prompt_23_0= ruleStringPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4474:3: lv_prompt_23_0= ruleStringPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSpinnerAccess().getPromptStringPropertyValueParserRuleCall_3_8_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringPropertyValue_in_ruleSpinner8664);
            	    lv_prompt_23_0=ruleStringPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSpinnerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"prompt",
            	    	        		lv_prompt_23_0, 
            	    	        		"StringPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpinnerAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSpinnerAccess().getUnorderedGroup_3());
            	

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4518:1: entryRuleEditText returns [EObject current=null] : iv_ruleEditText= ruleEditText EOF ;
    public final EObject entryRuleEditText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditText = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4519:2: (iv_ruleEditText= ruleEditText EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4520:2: iv_ruleEditText= ruleEditText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEditTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleEditText_in_entryRuleEditText8740);
            iv_ruleEditText=ruleEditText();
            _fsp--;

             current =iv_ruleEditText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditText8750); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4527:1: ruleEditText returns [EObject current=null] : ( 'editText' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) | ({...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEditText() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        EObject lv_text_5_0 = null;

        EObject lv_top_8_0 = null;

        EObject lv_left_10_0 = null;

        EObject lv_width_12_0 = null;

        EObject lv_height_14_0 = null;

        EObject lv_background_16_0 = null;

        EObject lv_clickable_18_0 = null;

        EObject lv_fadeScrollBars_20_0 = null;

        EObject lv_isScrollContainer_22_0 = null;

        EObject lv_hint_24_0 = null;

        EObject lv_textColor_26_0 = null;

        EObject lv_editable_28_0 = null;

        EObject lv_numeric_30_0 = null;

        EObject lv_password_32_0 = null;

        EObject lv_phoneNumber_34_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4532:6: ( ( 'editText' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) | ({...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4533:1: ( 'editText' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) | ({...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4533:1: ( 'editText' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) | ({...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4533:3: 'editText' () ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )? ( (lv_text_5_0= ruleStringPropertyValue ) ) ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) | ({...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) ) )
            {
            match(input,50,FOLLOW_50_in_ruleEditText8785); 

                    createLeafNode(grammarAccess.getEditTextAccess().getEditTextKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4537:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4538:5: 
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

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4548:2: ( '<' ( (lv_id_3_0= RULE_ID ) ) '>' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4548:4: '<' ( (lv_id_3_0= RULE_ID ) ) '>'
                    {
                    match(input,30,FOLLOW_30_in_ruleEditText8805); 

                            createLeafNode(grammarAccess.getEditTextAccess().getLessThanSignKeyword_2_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4552:1: ( (lv_id_3_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4553:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4553:1: (lv_id_3_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4554:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEditText8822); 

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

                    match(input,31,FOLLOW_31_in_ruleEditText8837); 

                            createLeafNode(grammarAccess.getEditTextAccess().getGreaterThanSignKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4580:3: ( (lv_text_5_0= ruleStringPropertyValue ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4581:1: (lv_text_5_0= ruleStringPropertyValue )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4581:1: (lv_text_5_0= ruleStringPropertyValue )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4582:3: lv_text_5_0= ruleStringPropertyValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getTextStringPropertyValueParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStringPropertyValue_in_ruleEditText8860);
            lv_text_5_0=ruleStringPropertyValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_5_0, 
            	        		"StringPropertyValue", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4604:2: ( ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) | ({...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4606:1: ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) | ({...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4606:1: ( ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) | ({...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) ) ) )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4607:2: ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) | ({...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4610:2: ( ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) | ({...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) ) ) )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4611:3: ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) | ({...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) ) ) )*
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4611:3: ( ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) ) | ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) ) | ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) ) | ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) ) | ({...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) ) ) | ({...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) ) ) )*
            loop27:
            do {
                int alt27=15;
                int LA27_0 = input.LA(1);

                if ( LA27_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 0) ) {
                    alt27=1;
                }
                else if ( LA27_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 1) ) {
                    alt27=2;
                }
                else if ( LA27_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 2) ) {
                    alt27=3;
                }
                else if ( LA27_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 3) ) {
                    alt27=4;
                }
                else if ( LA27_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 4) ) {
                    alt27=5;
                }
                else if ( LA27_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 5) ) {
                    alt27=6;
                }
                else if ( LA27_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 6) ) {
                    alt27=7;
                }
                else if ( LA27_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 7) ) {
                    alt27=8;
                }
                else if ( LA27_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 8) ) {
                    alt27=9;
                }
                else if ( LA27_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 9) ) {
                    alt27=10;
                }
                else if ( LA27_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 10) ) {
                    alt27=11;
                }
                else if ( LA27_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 11) ) {
                    alt27=12;
                }
                else if ( LA27_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 12) ) {
                    alt27=13;
                }
                else if ( LA27_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 13) ) {
                    alt27=14;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4613:4: ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4613:4: ({...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4614:5: {...}? => ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEditText", "getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4614:105: ( ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4615:6: ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4618:6: ( 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4618:8: 'top:' ( (lv_top_8_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,32,FOLLOW_32_in_ruleEditText8913); 

            	            createLeafNode(grammarAccess.getEditTextAccess().getTopKeyword_4_0_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4622:1: ( (lv_top_8_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4623:1: (lv_top_8_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4623:1: (lv_top_8_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4624:3: lv_top_8_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getTopDimensionPropertyValueParserRuleCall_4_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleEditText8934);
            	    lv_top_8_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"top",
            	    	        		lv_top_8_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4653:4: ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4653:4: ({...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4654:5: {...}? => ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEditText", "getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4654:105: ( ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4655:6: ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4658:6: ( 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4658:8: 'left:' ( (lv_left_10_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,33,FOLLOW_33_in_ruleEditText8996); 

            	            createLeafNode(grammarAccess.getEditTextAccess().getLeftKeyword_4_1_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4662:1: ( (lv_left_10_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4663:1: (lv_left_10_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4663:1: (lv_left_10_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4664:3: lv_left_10_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getLeftDimensionPropertyValueParserRuleCall_4_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleEditText9017);
            	    lv_left_10_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"left",
            	    	        		lv_left_10_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4693:4: ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4693:4: ({...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4694:5: {...}? => ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEditText", "getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4694:105: ( ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4695:6: ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4698:6: ( 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4698:8: 'width:' ( (lv_width_12_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,34,FOLLOW_34_in_ruleEditText9079); 

            	            createLeafNode(grammarAccess.getEditTextAccess().getWidthKeyword_4_2_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4702:1: ( (lv_width_12_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4703:1: (lv_width_12_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4703:1: (lv_width_12_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4704:3: lv_width_12_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getWidthDimensionPropertyValueParserRuleCall_4_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleEditText9100);
            	    lv_width_12_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"width",
            	    	        		lv_width_12_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4733:4: ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4733:4: ({...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4734:5: {...}? => ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEditText", "getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4734:105: ( ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4735:6: ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4738:6: ( 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4738:8: 'height:' ( (lv_height_14_0= ruleDimensionPropertyValue ) )
            	    {
            	    match(input,35,FOLLOW_35_in_ruleEditText9162); 

            	            createLeafNode(grammarAccess.getEditTextAccess().getHeightKeyword_4_3_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4742:1: ( (lv_height_14_0= ruleDimensionPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4743:1: (lv_height_14_0= ruleDimensionPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4743:1: (lv_height_14_0= ruleDimensionPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4744:3: lv_height_14_0= ruleDimensionPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getHeightDimensionPropertyValueParserRuleCall_4_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDimensionPropertyValue_in_ruleEditText9183);
            	    lv_height_14_0=ruleDimensionPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"height",
            	    	        		lv_height_14_0, 
            	    	        		"DimensionPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4773:4: ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4773:4: ({...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4774:5: {...}? => ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEditText", "getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4774:105: ( ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4775:6: ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4778:6: ( 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4778:8: 'background:' ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) )
            	    {
            	    match(input,36,FOLLOW_36_in_ruleEditText9245); 

            	            createLeafNode(grammarAccess.getEditTextAccess().getBackgroundKeyword_4_4_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4782:1: ( (lv_background_16_0= ruleDrawableResourcePropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4783:1: (lv_background_16_0= ruleDrawableResourcePropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4783:1: (lv_background_16_0= ruleDrawableResourcePropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4784:3: lv_background_16_0= ruleDrawableResourcePropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getBackgroundDrawableResourcePropertyValueParserRuleCall_4_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDrawableResourcePropertyValue_in_ruleEditText9266);
            	    lv_background_16_0=ruleDrawableResourcePropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"background",
            	    	        		lv_background_16_0, 
            	    	        		"DrawableResourcePropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4813:4: ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4813:4: ({...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4814:5: {...}? => ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEditText", "getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4814:105: ( ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4815:6: ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4818:6: ( 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4818:8: 'clickable?' ( (lv_clickable_18_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,37,FOLLOW_37_in_ruleEditText9328); 

            	            createLeafNode(grammarAccess.getEditTextAccess().getClickableKeyword_4_5_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4822:1: ( (lv_clickable_18_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4823:1: (lv_clickable_18_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4823:1: (lv_clickable_18_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4824:3: lv_clickable_18_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getClickableBooleanPropertyValueParserRuleCall_4_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleEditText9349);
            	    lv_clickable_18_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"clickable",
            	    	        		lv_clickable_18_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4853:4: ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4853:4: ({...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4854:5: {...}? => ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEditText", "getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4854:105: ( ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4855:6: ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 6);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4858:6: ( 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4858:8: 'fadeScrollBars?' ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,38,FOLLOW_38_in_ruleEditText9411); 

            	            createLeafNode(grammarAccess.getEditTextAccess().getFadeScrollBarsKeyword_4_6_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4862:1: ( (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4863:1: (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4863:1: (lv_fadeScrollBars_20_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4864:3: lv_fadeScrollBars_20_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getFadeScrollBarsBooleanPropertyValueParserRuleCall_4_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleEditText9432);
            	    lv_fadeScrollBars_20_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"fadeScrollBars",
            	    	        		lv_fadeScrollBars_20_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4893:4: ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4893:4: ({...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4894:5: {...}? => ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEditText", "getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4894:105: ( ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4895:6: ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 7);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4898:6: ( 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4898:8: 'isScrollContainer?' ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,39,FOLLOW_39_in_ruleEditText9494); 

            	            createLeafNode(grammarAccess.getEditTextAccess().getIsScrollContainerKeyword_4_7_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4902:1: ( (lv_isScrollContainer_22_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4903:1: (lv_isScrollContainer_22_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4903:1: (lv_isScrollContainer_22_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4904:3: lv_isScrollContainer_22_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getIsScrollContainerBooleanPropertyValueParserRuleCall_4_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleEditText9515);
            	    lv_isScrollContainer_22_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"isScrollContainer",
            	    	        		lv_isScrollContainer_22_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4933:4: ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4933:4: ({...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4934:5: {...}? => ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEditText", "getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4934:105: ( ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4935:6: ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 8);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4938:6: ( 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4938:8: 'hint:' ( (lv_hint_24_0= ruleStringPropertyValue ) )
            	    {
            	    match(input,42,FOLLOW_42_in_ruleEditText9577); 

            	            createLeafNode(grammarAccess.getEditTextAccess().getHintKeyword_4_8_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4942:1: ( (lv_hint_24_0= ruleStringPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4943:1: (lv_hint_24_0= ruleStringPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4943:1: (lv_hint_24_0= ruleStringPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4944:3: lv_hint_24_0= ruleStringPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getHintStringPropertyValueParserRuleCall_4_8_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringPropertyValue_in_ruleEditText9598);
            	    lv_hint_24_0=ruleStringPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"hint",
            	    	        		lv_hint_24_0, 
            	    	        		"StringPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4973:4: ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4973:4: ({...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4974:5: {...}? => ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleEditText", "getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4974:105: ( ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4975:6: ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 9);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4978:6: ( 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4978:8: 'textColor:' ( (lv_textColor_26_0= ruleColorPropertyValue ) )
            	    {
            	    match(input,43,FOLLOW_43_in_ruleEditText9660); 

            	            createLeafNode(grammarAccess.getEditTextAccess().getTextColorKeyword_4_9_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4982:1: ( (lv_textColor_26_0= ruleColorPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4983:1: (lv_textColor_26_0= ruleColorPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4983:1: (lv_textColor_26_0= ruleColorPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:4984:3: lv_textColor_26_0= ruleColorPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getTextColorColorPropertyValueParserRuleCall_4_9_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleColorPropertyValue_in_ruleEditText9681);
            	    lv_textColor_26_0=ruleColorPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"textColor",
            	    	        		lv_textColor_26_0, 
            	    	        		"ColorPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5013:4: ({...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5013:4: ({...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5014:5: {...}? => ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleEditText", "getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 10)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5014:106: ( ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5015:6: ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 10);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5018:6: ( 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5018:8: 'editable?' ( (lv_editable_28_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,51,FOLLOW_51_in_ruleEditText9743); 

            	            createLeafNode(grammarAccess.getEditTextAccess().getEditableKeyword_4_10_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5022:1: ( (lv_editable_28_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5023:1: (lv_editable_28_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5023:1: (lv_editable_28_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5024:3: lv_editable_28_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getEditableBooleanPropertyValueParserRuleCall_4_10_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleEditText9764);
            	    lv_editable_28_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"editable",
            	    	        		lv_editable_28_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5053:4: ({...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5053:4: ({...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5054:5: {...}? => ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleEditText", "getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 11)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5054:106: ( ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5055:6: ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 11);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5058:6: ( 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5058:8: 'numeric?' ( (lv_numeric_30_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,52,FOLLOW_52_in_ruleEditText9826); 

            	            createLeafNode(grammarAccess.getEditTextAccess().getNumericKeyword_4_11_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5062:1: ( (lv_numeric_30_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5063:1: (lv_numeric_30_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5063:1: (lv_numeric_30_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5064:3: lv_numeric_30_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getNumericBooleanPropertyValueParserRuleCall_4_11_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleEditText9847);
            	    lv_numeric_30_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"numeric",
            	    	        		lv_numeric_30_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5093:4: ({...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5093:4: ({...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5094:5: {...}? => ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleEditText", "getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 12)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5094:106: ( ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5095:6: ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 12);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5098:6: ( 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5098:8: 'password?' ( (lv_password_32_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,53,FOLLOW_53_in_ruleEditText9909); 

            	            createLeafNode(grammarAccess.getEditTextAccess().getPasswordKeyword_4_12_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5102:1: ( (lv_password_32_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5103:1: (lv_password_32_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5103:1: (lv_password_32_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5104:3: lv_password_32_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getPasswordBooleanPropertyValueParserRuleCall_4_12_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleEditText9930);
            	    lv_password_32_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"password",
            	    	        		lv_password_32_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5133:4: ({...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) ) )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5133:4: ({...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5134:5: {...}? => ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleEditText", "getUnorderedGroupHelper().canSelect(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 13)");
            	    }
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5134:106: ( ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5135:6: ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEditTextAccess().getUnorderedGroup_4(), 13);
            	    	 				
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5138:6: ( 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5138:8: 'phoneNumber?' ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) )
            	    {
            	    match(input,54,FOLLOW_54_in_ruleEditText9992); 

            	            createLeafNode(grammarAccess.getEditTextAccess().getPhoneNumberKeyword_4_13_0(), null); 
            	        
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5142:1: ( (lv_phoneNumber_34_0= ruleBooleanPropertyValue ) )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5143:1: (lv_phoneNumber_34_0= ruleBooleanPropertyValue )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5143:1: (lv_phoneNumber_34_0= ruleBooleanPropertyValue )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5144:3: lv_phoneNumber_34_0= ruleBooleanPropertyValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEditTextAccess().getPhoneNumberBooleanPropertyValueParserRuleCall_4_13_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanPropertyValue_in_ruleEditText10013);
            	    lv_phoneNumber_34_0=ruleBooleanPropertyValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEditTextRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"phoneNumber",
            	    	        		lv_phoneNumber_34_0, 
            	    	        		"BooleanPropertyValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEditTextAccess().getUnorderedGroup_4());
            	

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


    // $ANTLR start entryRuleActivity
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5188:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5189:2: (iv_ruleActivity= ruleActivity EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5190:2: iv_ruleActivity= ruleActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity10089);
            iv_ruleActivity=ruleActivity();
            _fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity10099); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5197:1: ruleActivity returns [EObject current=null] : (this_GenericActivity_0= ruleGenericActivity | this_ListActivity_1= ruleListActivity | this_TabActivity_2= ruleTabActivity ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        EObject this_GenericActivity_0 = null;

        EObject this_ListActivity_1 = null;

        EObject this_TabActivity_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5202:6: ( (this_GenericActivity_0= ruleGenericActivity | this_ListActivity_1= ruleListActivity | this_TabActivity_2= ruleTabActivity ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5203:1: (this_GenericActivity_0= ruleGenericActivity | this_ListActivity_1= ruleListActivity | this_TabActivity_2= ruleTabActivity )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5203:1: (this_GenericActivity_0= ruleGenericActivity | this_ListActivity_1= ruleListActivity | this_TabActivity_2= ruleTabActivity )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt28=1;
                }
                break;
            case 56:
                {
                alt28=2;
                }
                break;
            case 59:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("5203:1: (this_GenericActivity_0= ruleGenericActivity | this_ListActivity_1= ruleListActivity | this_TabActivity_2= ruleTabActivity )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5204:5: this_GenericActivity_0= ruleGenericActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActivityAccess().getGenericActivityParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGenericActivity_in_ruleActivity10146);
                    this_GenericActivity_0=ruleGenericActivity();
                    _fsp--;

                     
                            current = this_GenericActivity_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5214:5: this_ListActivity_1= ruleListActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActivityAccess().getListActivityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleListActivity_in_ruleActivity10173);
                    this_ListActivity_1=ruleListActivity();
                    _fsp--;

                     
                            current = this_ListActivity_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5224:5: this_TabActivity_2= ruleTabActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActivityAccess().getTabActivityParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTabActivity_in_ruleActivity10200);
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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5240:1: entryRuleGenericActivity returns [EObject current=null] : iv_ruleGenericActivity= ruleGenericActivity EOF ;
    public final EObject entryRuleGenericActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericActivity = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5241:2: (iv_ruleGenericActivity= ruleGenericActivity EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5242:2: iv_ruleGenericActivity= ruleGenericActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGenericActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleGenericActivity_in_entryRuleGenericActivity10235);
            iv_ruleGenericActivity=ruleGenericActivity();
            _fsp--;

             current =iv_ruleGenericActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericActivity10245); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5249:1: ruleGenericActivity returns [EObject current=null] : ( 'activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}' ) ;
    public final EObject ruleGenericActivity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5254:6: ( ( 'activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5255:1: ( 'activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5255:1: ( 'activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5255:3: 'activity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_actions_3_0= ruleAction ) )* '}'
            {
            match(input,55,FOLLOW_55_in_ruleGenericActivity10280); 

                    createLeafNode(grammarAccess.getGenericActivityAccess().getActivityKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5259:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5260:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5260:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5261:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGenericActivityAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGenericActivity10301);
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

            match(input,13,FOLLOW_13_in_ruleGenericActivity10311); 

                    createLeafNode(grammarAccess.getGenericActivityAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5287:1: ( (lv_actions_3_0= ruleAction ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=61 && LA29_0<=65)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5288:1: (lv_actions_3_0= ruleAction )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5288:1: (lv_actions_3_0= ruleAction )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5289:3: lv_actions_3_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGenericActivityAccess().getActionsActionParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleGenericActivity10332);
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
            	    break loop29;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleGenericActivity10343); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5323:1: entryRuleListActivity returns [EObject current=null] : iv_ruleListActivity= ruleListActivity EOF ;
    public final EObject entryRuleListActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListActivity = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5324:2: (iv_ruleListActivity= ruleListActivity EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5325:2: iv_ruleListActivity= ruleListActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getListActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleListActivity_in_entryRuleListActivity10379);
            iv_ruleListActivity=ruleListActivity();
            _fsp--;

             current =iv_ruleListActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListActivity10389); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5332:1: ruleListActivity returns [EObject current=null] : ( 'listActivity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' 'data' ( (lv_dataSource_4_0= RULE_ID ) ) ( 'layout' ( ( RULE_ID ) ) )? 'item' ( ( RULE_ID ) ) ( (lv_actions_9_0= ruleAction ) )* '}' ) ;
    public final EObject ruleListActivity() throws RecognitionException {
        EObject current = null;

        Token lv_dataSource_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actions_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5337:6: ( ( 'listActivity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' 'data' ( (lv_dataSource_4_0= RULE_ID ) ) ( 'layout' ( ( RULE_ID ) ) )? 'item' ( ( RULE_ID ) ) ( (lv_actions_9_0= ruleAction ) )* '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5338:1: ( 'listActivity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' 'data' ( (lv_dataSource_4_0= RULE_ID ) ) ( 'layout' ( ( RULE_ID ) ) )? 'item' ( ( RULE_ID ) ) ( (lv_actions_9_0= ruleAction ) )* '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5338:1: ( 'listActivity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' 'data' ( (lv_dataSource_4_0= RULE_ID ) ) ( 'layout' ( ( RULE_ID ) ) )? 'item' ( ( RULE_ID ) ) ( (lv_actions_9_0= ruleAction ) )* '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5338:3: 'listActivity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' 'data' ( (lv_dataSource_4_0= RULE_ID ) ) ( 'layout' ( ( RULE_ID ) ) )? 'item' ( ( RULE_ID ) ) ( (lv_actions_9_0= ruleAction ) )* '}'
            {
            match(input,56,FOLLOW_56_in_ruleListActivity10424); 

                    createLeafNode(grammarAccess.getListActivityAccess().getListActivityKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5342:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5343:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5343:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5344:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getListActivityAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleListActivity10445);
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

            match(input,13,FOLLOW_13_in_ruleListActivity10455); 

                    createLeafNode(grammarAccess.getListActivityAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,57,FOLLOW_57_in_ruleListActivity10465); 

                    createLeafNode(grammarAccess.getListActivityAccess().getDataKeyword_3(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5374:1: ( (lv_dataSource_4_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5375:1: (lv_dataSource_4_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5375:1: (lv_dataSource_4_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5376:3: lv_dataSource_4_0= RULE_ID
            {
            lv_dataSource_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListActivity10482); 

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

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5398:2: ( 'layout' ( ( RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5398:4: 'layout' ( ( RULE_ID ) )
                    {
                    match(input,28,FOLLOW_28_in_ruleListActivity10498); 

                            createLeafNode(grammarAccess.getListActivityAccess().getLayoutKeyword_5_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5402:1: ( ( RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5403:1: ( RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5403:1: ( RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5404:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getListActivityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListActivity10516); 

                    		createLeafNode(grammarAccess.getListActivityAccess().getLayoutLayoutCrossReference_5_1_0(), "layout"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,58,FOLLOW_58_in_ruleListActivity10528); 

                    createLeafNode(grammarAccess.getListActivityAccess().getItemKeyword_6(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5420:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5421:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5421:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5422:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getListActivityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListActivity10546); 

            		createLeafNode(grammarAccess.getListActivityAccess().getItemLayoutLayoutCrossReference_7_0(), "itemLayout"); 
            	

            }


            }

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5434:2: ( (lv_actions_9_0= ruleAction ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=61 && LA31_0<=65)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5435:1: (lv_actions_9_0= ruleAction )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5435:1: (lv_actions_9_0= ruleAction )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5436:3: lv_actions_9_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getListActivityAccess().getActionsActionParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleListActivity10567);
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
            	    break loop31;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleListActivity10578); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5470:1: entryRuleTabActivity returns [EObject current=null] : iv_ruleTabActivity= ruleTabActivity EOF ;
    public final EObject entryRuleTabActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabActivity = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5471:2: (iv_ruleTabActivity= ruleTabActivity EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5472:2: iv_ruleTabActivity= ruleTabActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTabActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleTabActivity_in_entryRuleTabActivity10614);
            iv_ruleTabActivity=ruleTabActivity();
            _fsp--;

             current =iv_ruleTabActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabActivity10624); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5479:1: ruleTabActivity returns [EObject current=null] : ( 'tabActivity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_tabs_3_0= ruleTab ) )+ '}' ) ;
    public final EObject ruleTabActivity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_tabs_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5484:6: ( ( 'tabActivity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_tabs_3_0= ruleTab ) )+ '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5485:1: ( 'tabActivity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_tabs_3_0= ruleTab ) )+ '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5485:1: ( 'tabActivity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_tabs_3_0= ruleTab ) )+ '}' )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5485:3: 'tabActivity' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_tabs_3_0= ruleTab ) )+ '}'
            {
            match(input,59,FOLLOW_59_in_ruleTabActivity10659); 

                    createLeafNode(grammarAccess.getTabActivityAccess().getTabActivityKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5489:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5490:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5490:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5491:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTabActivityAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTabActivity10680);
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

            match(input,13,FOLLOW_13_in_ruleTabActivity10690); 

                    createLeafNode(grammarAccess.getTabActivityAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5517:1: ( (lv_tabs_3_0= ruleTab ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==60) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5518:1: (lv_tabs_3_0= ruleTab )
            	    {
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5518:1: (lv_tabs_3_0= ruleTab )
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5519:3: lv_tabs_3_0= ruleTab
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTabActivityAccess().getTabsTabParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTab_in_ruleTabActivity10711);
            	    lv_tabs_3_0=ruleTab();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTabActivityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"tabs",
            	    	        		lv_tabs_3_0, 
            	    	        		"Tab", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            match(input,14,FOLLOW_14_in_ruleTabActivity10722); 

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


    // $ANTLR start entryRuleTab
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5553:1: entryRuleTab returns [EObject current=null] : iv_ruleTab= ruleTab EOF ;
    public final EObject entryRuleTab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTab = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5554:2: (iv_ruleTab= ruleTab EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5555:2: iv_ruleTab= ruleTab EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTabRule(), currentNode); 
            pushFollow(FOLLOW_ruleTab_in_entryRuleTab10758);
            iv_ruleTab=ruleTab();
            _fsp--;

             current =iv_ruleTab; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTab10768); 

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
    // $ANTLR end entryRuleTab


    // $ANTLR start ruleTab
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5562:1: ruleTab returns [EObject current=null] : ( 'tab' ( ( RULE_ID ) ) ) ;
    public final EObject ruleTab() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5567:6: ( ( 'tab' ( ( RULE_ID ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5568:1: ( 'tab' ( ( RULE_ID ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5568:1: ( 'tab' ( ( RULE_ID ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5568:3: 'tab' ( ( RULE_ID ) )
            {
            match(input,60,FOLLOW_60_in_ruleTab10803); 

                    createLeafNode(grammarAccess.getTabAccess().getTabKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5572:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5573:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5573:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5574:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTabRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTab10821); 

            		createLeafNode(grammarAccess.getTabAccess().getActivityActivityCrossReference_1_0(), "activity"); 
            	

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
    // $ANTLR end ruleTab


    // $ANTLR start entryRuleAction
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5594:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5595:2: (iv_ruleAction= ruleAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5596:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction10857);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction10867); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5603:1: ruleAction returns [EObject current=null] : (this_GenericAction_0= ruleGenericAction | this_GoToURLAction_1= ruleGoToURLAction | this_ShowLayoutAction_2= ruleShowLayoutAction | this_InvokeActivityAction_3= ruleInvokeActivityAction | this_LoadResourceAction_4= ruleLoadResourceAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_GenericAction_0 = null;

        EObject this_GoToURLAction_1 = null;

        EObject this_ShowLayoutAction_2 = null;

        EObject this_InvokeActivityAction_3 = null;

        EObject this_LoadResourceAction_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5608:6: ( (this_GenericAction_0= ruleGenericAction | this_GoToURLAction_1= ruleGoToURLAction | this_ShowLayoutAction_2= ruleShowLayoutAction | this_InvokeActivityAction_3= ruleInvokeActivityAction | this_LoadResourceAction_4= ruleLoadResourceAction ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5609:1: (this_GenericAction_0= ruleGenericAction | this_GoToURLAction_1= ruleGoToURLAction | this_ShowLayoutAction_2= ruleShowLayoutAction | this_InvokeActivityAction_3= ruleInvokeActivityAction | this_LoadResourceAction_4= ruleLoadResourceAction )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5609:1: (this_GenericAction_0= ruleGenericAction | this_GoToURLAction_1= ruleGoToURLAction | this_ShowLayoutAction_2= ruleShowLayoutAction | this_InvokeActivityAction_3= ruleInvokeActivityAction | this_LoadResourceAction_4= ruleLoadResourceAction )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt33=1;
                }
                break;
            case 62:
                {
                alt33=2;
                }
                break;
            case 63:
                {
                alt33=3;
                }
                break;
            case 64:
                {
                alt33=4;
                }
                break;
            case 65:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("5609:1: (this_GenericAction_0= ruleGenericAction | this_GoToURLAction_1= ruleGoToURLAction | this_ShowLayoutAction_2= ruleShowLayoutAction | this_InvokeActivityAction_3= ruleInvokeActivityAction | this_LoadResourceAction_4= ruleLoadResourceAction )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5610:5: this_GenericAction_0= ruleGenericAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getGenericActionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGenericAction_in_ruleAction10914);
                    this_GenericAction_0=ruleGenericAction();
                    _fsp--;

                     
                            current = this_GenericAction_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5620:5: this_GoToURLAction_1= ruleGoToURLAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getGoToURLActionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGoToURLAction_in_ruleAction10941);
                    this_GoToURLAction_1=ruleGoToURLAction();
                    _fsp--;

                     
                            current = this_GoToURLAction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5630:5: this_ShowLayoutAction_2= ruleShowLayoutAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getShowLayoutActionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleShowLayoutAction_in_ruleAction10968);
                    this_ShowLayoutAction_2=ruleShowLayoutAction();
                    _fsp--;

                     
                            current = this_ShowLayoutAction_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5640:5: this_InvokeActivityAction_3= ruleInvokeActivityAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getInvokeActivityActionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInvokeActivityAction_in_ruleAction10995);
                    this_InvokeActivityAction_3=ruleInvokeActivityAction();
                    _fsp--;

                     
                            current = this_InvokeActivityAction_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5650:5: this_LoadResourceAction_4= ruleLoadResourceAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getLoadResourceActionParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLoadResourceAction_in_ruleAction11022);
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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5666:1: entryRuleGenericAction returns [EObject current=null] : iv_ruleGenericAction= ruleGenericAction EOF ;
    public final EObject entryRuleGenericAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericAction = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5667:2: (iv_ruleGenericAction= ruleGenericAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5668:2: iv_ruleGenericAction= ruleGenericAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGenericActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleGenericAction_in_entryRuleGenericAction11057);
            iv_ruleGenericAction=ruleGenericAction();
            _fsp--;

             current =iv_ruleGenericAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericAction11067); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5675:1: ruleGenericAction returns [EObject current=null] : ( 'action' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleGenericAction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5680:6: ( ( 'action' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5681:1: ( 'action' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5681:1: ( 'action' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5681:3: 'action' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            match(input,61,FOLLOW_61_in_ruleGenericAction11102); 

                    createLeafNode(grammarAccess.getGenericActionAccess().getActionKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5685:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5686:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5686:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5687:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGenericActionAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGenericAction11123);
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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5717:1: entryRuleGoToURLAction returns [EObject current=null] : iv_ruleGoToURLAction= ruleGoToURLAction EOF ;
    public final EObject entryRuleGoToURLAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoToURLAction = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5718:2: (iv_ruleGoToURLAction= ruleGoToURLAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5719:2: iv_ruleGoToURLAction= ruleGoToURLAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGoToURLActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleGoToURLAction_in_entryRuleGoToURLAction11159);
            iv_ruleGoToURLAction=ruleGoToURLAction();
            _fsp--;

             current =iv_ruleGoToURLAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoToURLAction11169); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5726:1: ruleGoToURLAction returns [EObject current=null] : ( 'goTo' ( (lv_url_1_0= ruleURL ) ) ) ;
    public final EObject ruleGoToURLAction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_url_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5731:6: ( ( 'goTo' ( (lv_url_1_0= ruleURL ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5732:1: ( 'goTo' ( (lv_url_1_0= ruleURL ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5732:1: ( 'goTo' ( (lv_url_1_0= ruleURL ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5732:3: 'goTo' ( (lv_url_1_0= ruleURL ) )
            {
            match(input,62,FOLLOW_62_in_ruleGoToURLAction11204); 

                    createLeafNode(grammarAccess.getGoToURLActionAccess().getGoToKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5736:1: ( (lv_url_1_0= ruleURL ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5737:1: (lv_url_1_0= ruleURL )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5737:1: (lv_url_1_0= ruleURL )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5738:3: lv_url_1_0= ruleURL
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGoToURLActionAccess().getUrlURLParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleURL_in_ruleGoToURLAction11225);
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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5768:1: entryRuleShowLayoutAction returns [EObject current=null] : iv_ruleShowLayoutAction= ruleShowLayoutAction EOF ;
    public final EObject entryRuleShowLayoutAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShowLayoutAction = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5769:2: (iv_ruleShowLayoutAction= ruleShowLayoutAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5770:2: iv_ruleShowLayoutAction= ruleShowLayoutAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getShowLayoutActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleShowLayoutAction_in_entryRuleShowLayoutAction11261);
            iv_ruleShowLayoutAction=ruleShowLayoutAction();
            _fsp--;

             current =iv_ruleShowLayoutAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShowLayoutAction11271); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5777:1: ruleShowLayoutAction returns [EObject current=null] : ( 'show' ( ( RULE_ID ) ) ) ;
    public final EObject ruleShowLayoutAction() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5782:6: ( ( 'show' ( ( RULE_ID ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5783:1: ( 'show' ( ( RULE_ID ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5783:1: ( 'show' ( ( RULE_ID ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5783:3: 'show' ( ( RULE_ID ) )
            {
            match(input,63,FOLLOW_63_in_ruleShowLayoutAction11306); 

                    createLeafNode(grammarAccess.getShowLayoutActionAccess().getShowKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5787:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5788:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5788:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5789:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getShowLayoutActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleShowLayoutAction11324); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5809:1: entryRuleInvokeActivityAction returns [EObject current=null] : iv_ruleInvokeActivityAction= ruleInvokeActivityAction EOF ;
    public final EObject entryRuleInvokeActivityAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvokeActivityAction = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5810:2: (iv_ruleInvokeActivityAction= ruleInvokeActivityAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5811:2: iv_ruleInvokeActivityAction= ruleInvokeActivityAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInvokeActivityActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInvokeActivityAction_in_entryRuleInvokeActivityAction11360);
            iv_ruleInvokeActivityAction=ruleInvokeActivityAction();
            _fsp--;

             current =iv_ruleInvokeActivityAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvokeActivityAction11370); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5818:1: ruleInvokeActivityAction returns [EObject current=null] : ( 'invoke' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleInvokeActivityAction() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5823:6: ( ( 'invoke' ( ( ruleQualifiedName ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5824:1: ( 'invoke' ( ( ruleQualifiedName ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5824:1: ( 'invoke' ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5824:3: 'invoke' ( ( ruleQualifiedName ) )
            {
            match(input,64,FOLLOW_64_in_ruleInvokeActivityAction11405); 

                    createLeafNode(grammarAccess.getInvokeActivityActionAccess().getInvokeKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5828:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5829:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5829:1: ( ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5830:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInvokeActivityActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getInvokeActivityActionAccess().getActivityActivityCrossReference_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInvokeActivityAction11428);
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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5852:1: entryRuleLoadResourceAction returns [EObject current=null] : iv_ruleLoadResourceAction= ruleLoadResourceAction EOF ;
    public final EObject entryRuleLoadResourceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadResourceAction = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5853:2: (iv_ruleLoadResourceAction= ruleLoadResourceAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5854:2: iv_ruleLoadResourceAction= ruleLoadResourceAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoadResourceActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleLoadResourceAction_in_entryRuleLoadResourceAction11464);
            iv_ruleLoadResourceAction=ruleLoadResourceAction();
            _fsp--;

             current =iv_ruleLoadResourceAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadResourceAction11474); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5861:1: ruleLoadResourceAction returns [EObject current=null] : ( 'load' ( (lv_resource_1_0= RULE_ID ) ) ( '->' ( (lv_toVar_3_0= RULE_ID ) ) )? ( '=>' ( (lv_afterLoad_5_0= ruleAction ) ) )? ) ;
    public final EObject ruleLoadResourceAction() throws RecognitionException {
        EObject current = null;

        Token lv_resource_1_0=null;
        Token lv_toVar_3_0=null;
        EObject lv_afterLoad_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5866:6: ( ( 'load' ( (lv_resource_1_0= RULE_ID ) ) ( '->' ( (lv_toVar_3_0= RULE_ID ) ) )? ( '=>' ( (lv_afterLoad_5_0= ruleAction ) ) )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5867:1: ( 'load' ( (lv_resource_1_0= RULE_ID ) ) ( '->' ( (lv_toVar_3_0= RULE_ID ) ) )? ( '=>' ( (lv_afterLoad_5_0= ruleAction ) ) )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5867:1: ( 'load' ( (lv_resource_1_0= RULE_ID ) ) ( '->' ( (lv_toVar_3_0= RULE_ID ) ) )? ( '=>' ( (lv_afterLoad_5_0= ruleAction ) ) )? )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5867:3: 'load' ( (lv_resource_1_0= RULE_ID ) ) ( '->' ( (lv_toVar_3_0= RULE_ID ) ) )? ( '=>' ( (lv_afterLoad_5_0= ruleAction ) ) )?
            {
            match(input,65,FOLLOW_65_in_ruleLoadResourceAction11509); 

                    createLeafNode(grammarAccess.getLoadResourceActionAccess().getLoadKeyword_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5871:1: ( (lv_resource_1_0= RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5872:1: (lv_resource_1_0= RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5872:1: (lv_resource_1_0= RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5873:3: lv_resource_1_0= RULE_ID
            {
            lv_resource_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLoadResourceAction11526); 

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

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5895:2: ( '->' ( (lv_toVar_3_0= RULE_ID ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==RULE_ID) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5895:4: '->' ( (lv_toVar_3_0= RULE_ID ) )
                    {
                    match(input,40,FOLLOW_40_in_ruleLoadResourceAction11542); 

                            createLeafNode(grammarAccess.getLoadResourceActionAccess().getHyphenMinusGreaterThanSignKeyword_2_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5899:1: ( (lv_toVar_3_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5900:1: (lv_toVar_3_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5900:1: (lv_toVar_3_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5901:3: lv_toVar_3_0= RULE_ID
                    {
                    lv_toVar_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLoadResourceAction11559); 

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

            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5923:4: ( '=>' ( (lv_afterLoad_5_0= ruleAction ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==66) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5923:6: '=>' ( (lv_afterLoad_5_0= ruleAction ) )
                    {
                    match(input,66,FOLLOW_66_in_ruleLoadResourceAction11577); 

                            createLeafNode(grammarAccess.getLoadResourceActionAccess().getEqualsSignGreaterThanSignKeyword_3_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5927:1: ( (lv_afterLoad_5_0= ruleAction ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5928:1: (lv_afterLoad_5_0= ruleAction )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5928:1: (lv_afterLoad_5_0= ruleAction )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5929:3: lv_afterLoad_5_0= ruleAction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLoadResourceActionAccess().getAfterLoadActionParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAction_in_ruleLoadResourceAction11598);
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


    // $ANTLR start entryRuleStringPropertyValue
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5961:1: entryRuleStringPropertyValue returns [EObject current=null] : iv_ruleStringPropertyValue= ruleStringPropertyValue EOF ;
    public final EObject entryRuleStringPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPropertyValue = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5962:2: (iv_ruleStringPropertyValue= ruleStringPropertyValue EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5963:2: iv_ruleStringPropertyValue= ruleStringPropertyValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringPropertyValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringPropertyValue_in_entryRuleStringPropertyValue11638);
            iv_ruleStringPropertyValue=ruleStringPropertyValue();
            _fsp--;

             current =iv_ruleStringPropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringPropertyValue11648); 

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
    // $ANTLR end entryRuleStringPropertyValue


    // $ANTLR start ruleStringPropertyValue
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5970:1: ruleStringPropertyValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) ) ;
    public final EObject ruleStringPropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_externalResource_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5975:6: ( ( ( (lv_value_0_0= RULE_STRING ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5976:1: ( ( (lv_value_0_0= RULE_STRING ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5976:1: ( ( (lv_value_0_0= RULE_STRING ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID||LA37_0==67) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("5976:1: ( ( (lv_value_0_0= RULE_STRING ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5976:2: ( (lv_value_0_0= RULE_STRING ) )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5976:2: ( (lv_value_0_0= RULE_STRING ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5977:1: (lv_value_0_0= RULE_STRING )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5977:1: (lv_value_0_0= RULE_STRING )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:5978:3: lv_value_0_0= RULE_STRING
                    {
                    lv_value_0_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringPropertyValue11690); 

                    			createLeafNode(grammarAccess.getStringPropertyValueAccess().getValueSTRINGTerminalRuleCall_0_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringPropertyValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_0_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6001:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6001:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_ID) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==67) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("6001:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6001:7: ( ( RULE_ID ) )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6001:7: ( ( RULE_ID ) )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6002:1: ( RULE_ID )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6002:1: ( RULE_ID )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6003:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getStringPropertyValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringPropertyValue11720); 

                            		createLeafNode(grammarAccess.getStringPropertyValueAccess().getResourceStringValueResourceCrossReference_1_0_0(), "resource"); 
                            	

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6016:6: ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6016:6: ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6016:8: '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')'
                            {
                            match(input,67,FOLLOW_67_in_ruleStringPropertyValue11737); 

                                    createLeafNode(grammarAccess.getStringPropertyValueAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                                
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6020:1: ( (lv_externalResource_3_0= RULE_ID ) )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6021:1: (lv_externalResource_3_0= RULE_ID )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6021:1: (lv_externalResource_3_0= RULE_ID )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6022:3: lv_externalResource_3_0= RULE_ID
                            {
                            lv_externalResource_3_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringPropertyValue11754); 

                            			createLeafNode(grammarAccess.getStringPropertyValueAccess().getExternalResourceIDTerminalRuleCall_1_1_1_0(), "externalResource"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getStringPropertyValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"externalResource",
                            	        		lv_externalResource_3_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            match(input,68,FOLLOW_68_in_ruleStringPropertyValue11769); 

                                    createLeafNode(grammarAccess.getStringPropertyValueAccess().getRightParenthesisKeyword_1_1_2(), null); 
                                

                            }


                            }
                            break;

                    }


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
    // $ANTLR end ruleStringPropertyValue


    // $ANTLR start entryRuleIntegerPropertyValue
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6056:1: entryRuleIntegerPropertyValue returns [EObject current=null] : iv_ruleIntegerPropertyValue= ruleIntegerPropertyValue EOF ;
    public final EObject entryRuleIntegerPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerPropertyValue = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6057:2: (iv_ruleIntegerPropertyValue= ruleIntegerPropertyValue EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6058:2: iv_ruleIntegerPropertyValue= ruleIntegerPropertyValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerPropertyValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntegerPropertyValue_in_entryRuleIntegerPropertyValue11807);
            iv_ruleIntegerPropertyValue=ruleIntegerPropertyValue();
            _fsp--;

             current =iv_ruleIntegerPropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerPropertyValue11817); 

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
    // $ANTLR end entryRuleIntegerPropertyValue


    // $ANTLR start ruleIntegerPropertyValue
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6065:1: ruleIntegerPropertyValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) ) ;
    public final EObject ruleIntegerPropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_externalResource_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6070:6: ( ( ( (lv_value_0_0= RULE_INT ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6071:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6071:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID||LA39_0==67) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6071:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6071:2: ( (lv_value_0_0= RULE_INT ) )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6071:2: ( (lv_value_0_0= RULE_INT ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6072:1: (lv_value_0_0= RULE_INT )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6072:1: (lv_value_0_0= RULE_INT )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6073:3: lv_value_0_0= RULE_INT
                    {
                    lv_value_0_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerPropertyValue11859); 

                    			createLeafNode(grammarAccess.getIntegerPropertyValueAccess().getValueINTTerminalRuleCall_0_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerPropertyValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_0_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6096:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6096:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==67) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("6096:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6096:7: ( ( RULE_ID ) )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6096:7: ( ( RULE_ID ) )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6097:1: ( RULE_ID )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6097:1: ( RULE_ID )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6098:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getIntegerPropertyValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerPropertyValue11889); 

                            		createLeafNode(grammarAccess.getIntegerPropertyValueAccess().getResourceIntegerValueResourceCrossReference_1_0_0(), "resource"); 
                            	

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6111:6: ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6111:6: ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6111:8: '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')'
                            {
                            match(input,67,FOLLOW_67_in_ruleIntegerPropertyValue11906); 

                                    createLeafNode(grammarAccess.getIntegerPropertyValueAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                                
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6115:1: ( (lv_externalResource_3_0= RULE_ID ) )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6116:1: (lv_externalResource_3_0= RULE_ID )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6116:1: (lv_externalResource_3_0= RULE_ID )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6117:3: lv_externalResource_3_0= RULE_ID
                            {
                            lv_externalResource_3_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerPropertyValue11923); 

                            			createLeafNode(grammarAccess.getIntegerPropertyValueAccess().getExternalResourceIDTerminalRuleCall_1_1_1_0(), "externalResource"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getIntegerPropertyValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"externalResource",
                            	        		lv_externalResource_3_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            match(input,68,FOLLOW_68_in_ruleIntegerPropertyValue11938); 

                                    createLeafNode(grammarAccess.getIntegerPropertyValueAccess().getRightParenthesisKeyword_1_1_2(), null); 
                                

                            }


                            }
                            break;

                    }


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
    // $ANTLR end ruleIntegerPropertyValue


    // $ANTLR start entryRuleBooleanPropertyValue
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6151:1: entryRuleBooleanPropertyValue returns [EObject current=null] : iv_ruleBooleanPropertyValue= ruleBooleanPropertyValue EOF ;
    public final EObject entryRuleBooleanPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanPropertyValue = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6152:2: (iv_ruleBooleanPropertyValue= ruleBooleanPropertyValue EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6153:2: iv_ruleBooleanPropertyValue= ruleBooleanPropertyValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanPropertyValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanPropertyValue_in_entryRuleBooleanPropertyValue11976);
            iv_ruleBooleanPropertyValue=ruleBooleanPropertyValue();
            _fsp--;

             current =iv_ruleBooleanPropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanPropertyValue11986); 

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
    // $ANTLR end entryRuleBooleanPropertyValue


    // $ANTLR start ruleBooleanPropertyValue
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6160:1: ruleBooleanPropertyValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleBOOL ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) ) ;
    public final EObject ruleBooleanPropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_externalResource_3_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6165:6: ( ( ( (lv_value_0_0= ruleBOOL ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6166:1: ( ( (lv_value_0_0= ruleBOOL ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6166:1: ( ( (lv_value_0_0= ruleBOOL ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=70 && LA41_0<=71)) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ID||LA41_0==67) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6166:1: ( ( (lv_value_0_0= ruleBOOL ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6166:2: ( (lv_value_0_0= ruleBOOL ) )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6166:2: ( (lv_value_0_0= ruleBOOL ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6167:1: (lv_value_0_0= ruleBOOL )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6167:1: (lv_value_0_0= ruleBOOL )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6168:3: lv_value_0_0= ruleBOOL
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBooleanPropertyValueAccess().getValueBOOLParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBOOL_in_ruleBooleanPropertyValue12032);
                    lv_value_0_0=ruleBOOL();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBooleanPropertyValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_0_0, 
                    	        		"BOOL", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6191:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6191:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==67) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("6191:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6191:7: ( ( RULE_ID ) )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6191:7: ( ( RULE_ID ) )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6192:1: ( RULE_ID )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6192:1: ( RULE_ID )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6193:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getBooleanPropertyValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanPropertyValue12057); 

                            		createLeafNode(grammarAccess.getBooleanPropertyValueAccess().getResourceBooleanValueResourceCrossReference_1_0_0(), "resource"); 
                            	

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6206:6: ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6206:6: ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6206:8: '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')'
                            {
                            match(input,67,FOLLOW_67_in_ruleBooleanPropertyValue12074); 

                                    createLeafNode(grammarAccess.getBooleanPropertyValueAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                                
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6210:1: ( (lv_externalResource_3_0= RULE_ID ) )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6211:1: (lv_externalResource_3_0= RULE_ID )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6211:1: (lv_externalResource_3_0= RULE_ID )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6212:3: lv_externalResource_3_0= RULE_ID
                            {
                            lv_externalResource_3_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanPropertyValue12091); 

                            			createLeafNode(grammarAccess.getBooleanPropertyValueAccess().getExternalResourceIDTerminalRuleCall_1_1_1_0(), "externalResource"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBooleanPropertyValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"externalResource",
                            	        		lv_externalResource_3_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            match(input,68,FOLLOW_68_in_ruleBooleanPropertyValue12106); 

                                    createLeafNode(grammarAccess.getBooleanPropertyValueAccess().getRightParenthesisKeyword_1_1_2(), null); 
                                

                            }


                            }
                            break;

                    }


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
    // $ANTLR end ruleBooleanPropertyValue


    // $ANTLR start entryRuleColorPropertyValue
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6246:1: entryRuleColorPropertyValue returns [EObject current=null] : iv_ruleColorPropertyValue= ruleColorPropertyValue EOF ;
    public final EObject entryRuleColorPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorPropertyValue = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6247:2: (iv_ruleColorPropertyValue= ruleColorPropertyValue EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6248:2: iv_ruleColorPropertyValue= ruleColorPropertyValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getColorPropertyValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleColorPropertyValue_in_entryRuleColorPropertyValue12144);
            iv_ruleColorPropertyValue=ruleColorPropertyValue();
            _fsp--;

             current =iv_ruleColorPropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorPropertyValue12154); 

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
    // $ANTLR end entryRuleColorPropertyValue


    // $ANTLR start ruleColorPropertyValue
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6255:1: ruleColorPropertyValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_HEX_COLOR ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) ) ;
    public final EObject ruleColorPropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_externalResource_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6260:6: ( ( ( (lv_value_0_0= RULE_HEX_COLOR ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6261:1: ( ( (lv_value_0_0= RULE_HEX_COLOR ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6261:1: ( ( (lv_value_0_0= RULE_HEX_COLOR ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_HEX_COLOR) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID||LA43_0==67) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6261:1: ( ( (lv_value_0_0= RULE_HEX_COLOR ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6261:2: ( (lv_value_0_0= RULE_HEX_COLOR ) )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6261:2: ( (lv_value_0_0= RULE_HEX_COLOR ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6262:1: (lv_value_0_0= RULE_HEX_COLOR )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6262:1: (lv_value_0_0= RULE_HEX_COLOR )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6263:3: lv_value_0_0= RULE_HEX_COLOR
                    {
                    lv_value_0_0=(Token)input.LT(1);
                    match(input,RULE_HEX_COLOR,FOLLOW_RULE_HEX_COLOR_in_ruleColorPropertyValue12196); 

                    			createLeafNode(grammarAccess.getColorPropertyValueAccess().getValueHEX_COLORTerminalRuleCall_0_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getColorPropertyValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_0_0, 
                    	        		"HEX_COLOR", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6286:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6286:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==67) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("6286:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6286:7: ( ( RULE_ID ) )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6286:7: ( ( RULE_ID ) )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6287:1: ( RULE_ID )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6287:1: ( RULE_ID )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6288:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getColorPropertyValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColorPropertyValue12226); 

                            		createLeafNode(grammarAccess.getColorPropertyValueAccess().getResourceColorValueResourceCrossReference_1_0_0(), "resource"); 
                            	

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6301:6: ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6301:6: ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6301:8: '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')'
                            {
                            match(input,67,FOLLOW_67_in_ruleColorPropertyValue12243); 

                                    createLeafNode(grammarAccess.getColorPropertyValueAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                                
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6305:1: ( (lv_externalResource_3_0= RULE_ID ) )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6306:1: (lv_externalResource_3_0= RULE_ID )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6306:1: (lv_externalResource_3_0= RULE_ID )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6307:3: lv_externalResource_3_0= RULE_ID
                            {
                            lv_externalResource_3_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColorPropertyValue12260); 

                            			createLeafNode(grammarAccess.getColorPropertyValueAccess().getExternalResourceIDTerminalRuleCall_1_1_1_0(), "externalResource"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getColorPropertyValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"externalResource",
                            	        		lv_externalResource_3_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            match(input,68,FOLLOW_68_in_ruleColorPropertyValue12275); 

                                    createLeafNode(grammarAccess.getColorPropertyValueAccess().getRightParenthesisKeyword_1_1_2(), null); 
                                

                            }


                            }
                            break;

                    }


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
    // $ANTLR end ruleColorPropertyValue


    // $ANTLR start entryRuleDimensionPropertyValue
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6341:1: entryRuleDimensionPropertyValue returns [EObject current=null] : iv_ruleDimensionPropertyValue= ruleDimensionPropertyValue EOF ;
    public final EObject entryRuleDimensionPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionPropertyValue = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6342:2: (iv_ruleDimensionPropertyValue= ruleDimensionPropertyValue EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6343:2: iv_ruleDimensionPropertyValue= ruleDimensionPropertyValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDimensionPropertyValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleDimensionPropertyValue_in_entryRuleDimensionPropertyValue12313);
            iv_ruleDimensionPropertyValue=ruleDimensionPropertyValue();
            _fsp--;

             current =iv_ruleDimensionPropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDimensionPropertyValue12323); 

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
    // $ANTLR end entryRuleDimensionPropertyValue


    // $ANTLR start ruleDimensionPropertyValue
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6350:1: ruleDimensionPropertyValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleFLOAT ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) ) ;
    public final EObject ruleDimensionPropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_externalResource_3_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6355:6: ( ( ( (lv_value_0_0= ruleFLOAT ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6356:1: ( ( (lv_value_0_0= ruleFLOAT ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6356:1: ( ( (lv_value_0_0= ruleFLOAT ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_INT) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ID||LA45_0==67) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6356:1: ( ( (lv_value_0_0= ruleFLOAT ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6356:2: ( (lv_value_0_0= ruleFLOAT ) )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6356:2: ( (lv_value_0_0= ruleFLOAT ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6357:1: (lv_value_0_0= ruleFLOAT )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6357:1: (lv_value_0_0= ruleFLOAT )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6358:3: lv_value_0_0= ruleFLOAT
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDimensionPropertyValueAccess().getValueFLOATParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFLOAT_in_ruleDimensionPropertyValue12369);
                    lv_value_0_0=ruleFLOAT();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDimensionPropertyValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_0_0, 
                    	        		"FLOAT", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6381:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6381:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ID) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==67) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("6381:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6381:7: ( ( RULE_ID ) )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6381:7: ( ( RULE_ID ) )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6382:1: ( RULE_ID )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6382:1: ( RULE_ID )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6383:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getDimensionPropertyValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDimensionPropertyValue12394); 

                            		createLeafNode(grammarAccess.getDimensionPropertyValueAccess().getResourceDimensionValueResourceCrossReference_1_0_0(), "resource"); 
                            	

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6396:6: ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6396:6: ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6396:8: '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')'
                            {
                            match(input,67,FOLLOW_67_in_ruleDimensionPropertyValue12411); 

                                    createLeafNode(grammarAccess.getDimensionPropertyValueAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                                
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6400:1: ( (lv_externalResource_3_0= RULE_ID ) )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6401:1: (lv_externalResource_3_0= RULE_ID )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6401:1: (lv_externalResource_3_0= RULE_ID )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6402:3: lv_externalResource_3_0= RULE_ID
                            {
                            lv_externalResource_3_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDimensionPropertyValue12428); 

                            			createLeafNode(grammarAccess.getDimensionPropertyValueAccess().getExternalResourceIDTerminalRuleCall_1_1_1_0(), "externalResource"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDimensionPropertyValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"externalResource",
                            	        		lv_externalResource_3_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            match(input,68,FOLLOW_68_in_ruleDimensionPropertyValue12443); 

                                    createLeafNode(grammarAccess.getDimensionPropertyValueAccess().getRightParenthesisKeyword_1_1_2(), null); 
                                

                            }


                            }
                            break;

                    }


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
    // $ANTLR end ruleDimensionPropertyValue


    // $ANTLR start entryRuleDrawableResourcePropertyValue
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6436:1: entryRuleDrawableResourcePropertyValue returns [EObject current=null] : iv_ruleDrawableResourcePropertyValue= ruleDrawableResourcePropertyValue EOF ;
    public final EObject entryRuleDrawableResourcePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrawableResourcePropertyValue = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6437:2: (iv_ruleDrawableResourcePropertyValue= ruleDrawableResourcePropertyValue EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6438:2: iv_ruleDrawableResourcePropertyValue= ruleDrawableResourcePropertyValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDrawableResourcePropertyValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleDrawableResourcePropertyValue_in_entryRuleDrawableResourcePropertyValue12481);
            iv_ruleDrawableResourcePropertyValue=ruleDrawableResourcePropertyValue();
            _fsp--;

             current =iv_ruleDrawableResourcePropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDrawableResourcePropertyValue12491); 

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
    // $ANTLR end entryRuleDrawableResourcePropertyValue


    // $ANTLR start ruleDrawableResourcePropertyValue
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6445:1: ruleDrawableResourcePropertyValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_HEX_COLOR ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) ) ;
    public final EObject ruleDrawableResourcePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_externalResource_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6450:6: ( ( ( (lv_value_0_0= RULE_HEX_COLOR ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6451:1: ( ( (lv_value_0_0= RULE_HEX_COLOR ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6451:1: ( ( (lv_value_0_0= RULE_HEX_COLOR ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_HEX_COLOR) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_ID||LA47_0==67) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6451:1: ( ( (lv_value_0_0= RULE_HEX_COLOR ) ) | ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) ) )", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6451:2: ( (lv_value_0_0= RULE_HEX_COLOR ) )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6451:2: ( (lv_value_0_0= RULE_HEX_COLOR ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6452:1: (lv_value_0_0= RULE_HEX_COLOR )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6452:1: (lv_value_0_0= RULE_HEX_COLOR )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6453:3: lv_value_0_0= RULE_HEX_COLOR
                    {
                    lv_value_0_0=(Token)input.LT(1);
                    match(input,RULE_HEX_COLOR,FOLLOW_RULE_HEX_COLOR_in_ruleDrawableResourcePropertyValue12533); 

                    			createLeafNode(grammarAccess.getDrawableResourcePropertyValueAccess().getValueHEX_COLORTerminalRuleCall_0_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDrawableResourcePropertyValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_0_0, 
                    	        		"HEX_COLOR", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6476:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6476:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==67) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("6476:6: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' ) )", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6476:7: ( ( RULE_ID ) )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6476:7: ( ( RULE_ID ) )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6477:1: ( RULE_ID )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6477:1: ( RULE_ID )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6478:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getDrawableResourcePropertyValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDrawableResourcePropertyValue12563); 

                            		createLeafNode(grammarAccess.getDrawableResourcePropertyValueAccess().getResourceDrawableResourceCrossReference_1_0_0(), "resource"); 
                            	

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6491:6: ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6491:6: ( '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')' )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6491:8: '(' ( (lv_externalResource_3_0= RULE_ID ) ) ')'
                            {
                            match(input,67,FOLLOW_67_in_ruleDrawableResourcePropertyValue12580); 

                                    createLeafNode(grammarAccess.getDrawableResourcePropertyValueAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                                
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6495:1: ( (lv_externalResource_3_0= RULE_ID ) )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6496:1: (lv_externalResource_3_0= RULE_ID )
                            {
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6496:1: (lv_externalResource_3_0= RULE_ID )
                            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6497:3: lv_externalResource_3_0= RULE_ID
                            {
                            lv_externalResource_3_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDrawableResourcePropertyValue12597); 

                            			createLeafNode(grammarAccess.getDrawableResourcePropertyValueAccess().getExternalResourceIDTerminalRuleCall_1_1_1_0(), "externalResource"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDrawableResourcePropertyValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"externalResource",
                            	        		lv_externalResource_3_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            match(input,68,FOLLOW_68_in_ruleDrawableResourcePropertyValue12612); 

                                    createLeafNode(grammarAccess.getDrawableResourcePropertyValueAccess().getRightParenthesisKeyword_1_1_2(), null); 
                                

                            }


                            }
                            break;

                    }


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
    // $ANTLR end ruleDrawableResourcePropertyValue


    // $ANTLR start entryRuleDrawableImageResourcePropertyValue
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6531:1: entryRuleDrawableImageResourcePropertyValue returns [EObject current=null] : iv_ruleDrawableImageResourcePropertyValue= ruleDrawableImageResourcePropertyValue EOF ;
    public final EObject entryRuleDrawableImageResourcePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrawableImageResourcePropertyValue = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6532:2: (iv_ruleDrawableImageResourcePropertyValue= ruleDrawableImageResourcePropertyValue EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6533:2: iv_ruleDrawableImageResourcePropertyValue= ruleDrawableImageResourcePropertyValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDrawableImageResourcePropertyValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleDrawableImageResourcePropertyValue_in_entryRuleDrawableImageResourcePropertyValue12650);
            iv_ruleDrawableImageResourcePropertyValue=ruleDrawableImageResourcePropertyValue();
            _fsp--;

             current =iv_ruleDrawableImageResourcePropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDrawableImageResourcePropertyValue12660); 

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
    // $ANTLR end entryRuleDrawableImageResourcePropertyValue


    // $ANTLR start ruleDrawableImageResourcePropertyValue
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6540:1: ruleDrawableImageResourcePropertyValue returns [EObject current=null] : ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_2_0= RULE_ID ) ) ')' ) ) ;
    public final EObject ruleDrawableImageResourcePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_externalResource_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6545:6: ( ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_2_0= RULE_ID ) ) ')' ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6546:1: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_2_0= RULE_ID ) ) ')' ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6546:1: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_2_0= RULE_ID ) ) ')' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            else if ( (LA48_0==67) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6546:1: ( ( ( RULE_ID ) ) | ( '(' ( (lv_externalResource_2_0= RULE_ID ) ) ')' ) )", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6546:2: ( ( RULE_ID ) )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6546:2: ( ( RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6547:1: ( RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6547:1: ( RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6548:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDrawableImageResourcePropertyValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDrawableImageResourcePropertyValue12703); 

                    		createLeafNode(grammarAccess.getDrawableImageResourcePropertyValueAccess().getResourceDrawableResourceCrossReference_0_0(), "resource"); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6561:6: ( '(' ( (lv_externalResource_2_0= RULE_ID ) ) ')' )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6561:6: ( '(' ( (lv_externalResource_2_0= RULE_ID ) ) ')' )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6561:8: '(' ( (lv_externalResource_2_0= RULE_ID ) ) ')'
                    {
                    match(input,67,FOLLOW_67_in_ruleDrawableImageResourcePropertyValue12720); 

                            createLeafNode(grammarAccess.getDrawableImageResourcePropertyValueAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6565:1: ( (lv_externalResource_2_0= RULE_ID ) )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6566:1: (lv_externalResource_2_0= RULE_ID )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6566:1: (lv_externalResource_2_0= RULE_ID )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6567:3: lv_externalResource_2_0= RULE_ID
                    {
                    lv_externalResource_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDrawableImageResourcePropertyValue12737); 

                    			createLeafNode(grammarAccess.getDrawableImageResourcePropertyValueAccess().getExternalResourceIDTerminalRuleCall_1_1_0(), "externalResource"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDrawableImageResourcePropertyValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"externalResource",
                    	        		lv_externalResource_2_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,68,FOLLOW_68_in_ruleDrawableImageResourcePropertyValue12752); 

                            createLeafNode(grammarAccess.getDrawableImageResourcePropertyValueAccess().getRightParenthesisKeyword_1_2(), null); 
                        

                    }


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
    // $ANTLR end ruleDrawableImageResourcePropertyValue


    // $ANTLR start entryRuleQualifiedName
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6601:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6602:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6603:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12790);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName12801); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6610:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6615:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6616:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6616:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6616:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12841); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6623:1: (kw= '.' this_ID_2= RULE_ID )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==69) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6624:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,69,FOLLOW_69_in_ruleQualifiedName12860); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12875); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop49;
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


    // $ANTLR start entryRuleBOOL
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6644:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6645:2: (iv_ruleBOOL= ruleBOOL EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6646:2: iv_ruleBOOL= ruleBOOL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBOOLRule(), currentNode); 
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL12923);
            iv_ruleBOOL=ruleBOOL();
            _fsp--;

             current =iv_ruleBOOL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL12934); 

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
    // $ANTLR end entryRuleBOOL


    // $ANTLR start ruleBOOL
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6653:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'YES' | kw= 'NO' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6658:6: ( (kw= 'YES' | kw= 'NO' ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6659:1: (kw= 'YES' | kw= 'NO' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6659:1: (kw= 'YES' | kw= 'NO' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==70) ) {
                alt50=1;
            }
            else if ( (LA50_0==71) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6659:1: (kw= 'YES' | kw= 'NO' )", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6660:2: kw= 'YES'
                    {
                    kw=(Token)input.LT(1);
                    match(input,70,FOLLOW_70_in_ruleBOOL12972); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBOOLAccess().getYESKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6667:2: kw= 'NO'
                    {
                    kw=(Token)input.LT(1);
                    match(input,71,FOLLOW_71_in_ruleBOOL12991); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBOOLAccess().getNOKeyword_1(), null); 
                        

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
    // $ANTLR end ruleBOOL


    // $ANTLR start entryRuleFLOAT
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6680:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6681:2: (iv_ruleFLOAT= ruleFLOAT EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6682:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFLOATRule(), currentNode); 
            pushFollow(FOLLOW_ruleFLOAT_in_entryRuleFLOAT13032);
            iv_ruleFLOAT=ruleFLOAT();
            _fsp--;

             current =iv_ruleFLOAT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFLOAT13043); 

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
    // $ANTLR end entryRuleFLOAT


    // $ANTLR start ruleFLOAT
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6689:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6694:6: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6695:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6695:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6695:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT13083); 

            		current.merge(this_INT_0);
                
             
                createLeafNode(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0(), null); 
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6702:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==69) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6703:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)input.LT(1);
                    match(input,69,FOLLOW_69_in_ruleFLOAT13102); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getFLOATAccess().getFullStopKeyword_1_0(), null); 
                        
                    this_INT_2=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT13117); 

                    		current.merge(this_INT_2);
                        
                     
                        createLeafNode(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_1_1(), null); 
                        

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
    // $ANTLR end ruleFLOAT


    // $ANTLR start entryRuleURL
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6723:1: entryRuleURL returns [String current=null] : iv_ruleURL= ruleURL EOF ;
    public final String entryRuleURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL = null;


        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6724:2: (iv_ruleURL= ruleURL EOF )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6725:2: iv_ruleURL= ruleURL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getURLRule(), currentNode); 
            pushFollow(FOLLOW_ruleURL_in_entryRuleURL13165);
            iv_ruleURL=ruleURL();
            _fsp--;

             current =iv_ruleURL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURL13176); 

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
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6732:1: ruleURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '://' this_QualifiedName_2= ruleQualifiedName (kw= '/' (this_QualifiedName_4= ruleQualifiedName kw= '/' )* )? ) ;
    public final AntlrDatatypeRuleToken ruleURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_2 = null;

        AntlrDatatypeRuleToken this_QualifiedName_4 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6737:6: ( (this_ID_0= RULE_ID kw= '://' this_QualifiedName_2= ruleQualifiedName (kw= '/' (this_QualifiedName_4= ruleQualifiedName kw= '/' )* )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6738:1: (this_ID_0= RULE_ID kw= '://' this_QualifiedName_2= ruleQualifiedName (kw= '/' (this_QualifiedName_4= ruleQualifiedName kw= '/' )* )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6738:1: (this_ID_0= RULE_ID kw= '://' this_QualifiedName_2= ruleQualifiedName (kw= '/' (this_QualifiedName_4= ruleQualifiedName kw= '/' )* )? )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6738:6: this_ID_0= RULE_ID kw= '://' this_QualifiedName_2= ruleQualifiedName (kw= '/' (this_QualifiedName_4= ruleQualifiedName kw= '/' )* )?
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURL13216); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getURLAccess().getIDTerminalRuleCall_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,72,FOLLOW_72_in_ruleURL13234); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getURLAccess().getColonSolidusSolidusKeyword_1(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getURLAccess().getQualifiedNameParserRuleCall_2(), currentNode); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleURL13256);
            this_QualifiedName_2=ruleQualifiedName();
            _fsp--;


            		current.merge(this_QualifiedName_2);
                
             
                    currentNode = currentNode.getParent();
                
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6762:1: (kw= '/' (this_QualifiedName_4= ruleQualifiedName kw= '/' )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==73) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6763:2: kw= '/' (this_QualifiedName_4= ruleQualifiedName kw= '/' )*
                    {
                    kw=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_ruleURL13275); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getURLAccess().getSolidusKeyword_3_0(), null); 
                        
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6768:1: (this_QualifiedName_4= ruleQualifiedName kw= '/' )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==RULE_ID) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6769:5: this_QualifiedName_4= ruleQualifiedName kw= '/'
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getURLAccess().getQualifiedNameParserRuleCall_3_1_0(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleURL13298);
                    	    this_QualifiedName_4=ruleQualifiedName();
                    	    _fsp--;


                    	    		current.merge(this_QualifiedName_4);
                    	        
                    	     
                    	            currentNode = currentNode.getParent();
                    	        
                    	    kw=(Token)input.LT(1);
                    	    match(input,73,FOLLOW_73_in_ruleURL13316); 

                    	            current.merge(kw);
                    	            createLeafNode(grammarAccess.getURLAccess().getSolidusKeyword_3_1_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
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


    // $ANTLR start ruleDimensionKind
    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6793:1: ruleDimensionKind returns [Enumerator current=null] : ( ( 'dp' ) | ( 'sp' ) | ( 'pt' ) | ( 'px' ) | ( 'mm' ) | ( 'in' ) ) ;
    public final Enumerator ruleDimensionKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6797:6: ( ( ( 'dp' ) | ( 'sp' ) | ( 'pt' ) | ( 'px' ) | ( 'mm' ) | ( 'in' ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6798:1: ( ( 'dp' ) | ( 'sp' ) | ( 'pt' ) | ( 'px' ) | ( 'mm' ) | ( 'in' ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6798:1: ( ( 'dp' ) | ( 'sp' ) | ( 'pt' ) | ( 'px' ) | ( 'mm' ) | ( 'in' ) )
            int alt54=6;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt54=1;
                }
                break;
            case 75:
                {
                alt54=2;
                }
                break;
            case 76:
                {
                alt54=3;
                }
                break;
            case 77:
                {
                alt54=4;
                }
                break;
            case 78:
                {
                alt54=5;
                }
                break;
            case 79:
                {
                alt54=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("6798:1: ( ( 'dp' ) | ( 'sp' ) | ( 'pt' ) | ( 'px' ) | ( 'mm' ) | ( 'in' ) )", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6798:2: ( 'dp' )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6798:2: ( 'dp' )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6798:4: 'dp'
                    {
                    match(input,74,FOLLOW_74_in_ruleDimensionKind13372); 

                            current = grammarAccess.getDimensionKindAccess().getDpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDimensionKindAccess().getDpEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6804:6: ( 'sp' )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6804:6: ( 'sp' )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6804:8: 'sp'
                    {
                    match(input,75,FOLLOW_75_in_ruleDimensionKind13387); 

                            current = grammarAccess.getDimensionKindAccess().getSpEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDimensionKindAccess().getSpEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6810:6: ( 'pt' )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6810:6: ( 'pt' )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6810:8: 'pt'
                    {
                    match(input,76,FOLLOW_76_in_ruleDimensionKind13402); 

                            current = grammarAccess.getDimensionKindAccess().getPtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDimensionKindAccess().getPtEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6816:6: ( 'px' )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6816:6: ( 'px' )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6816:8: 'px'
                    {
                    match(input,77,FOLLOW_77_in_ruleDimensionKind13417); 

                            current = grammarAccess.getDimensionKindAccess().getPxEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDimensionKindAccess().getPxEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6822:6: ( 'mm' )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6822:6: ( 'mm' )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6822:8: 'mm'
                    {
                    match(input,78,FOLLOW_78_in_ruleDimensionKind13432); 

                            current = grammarAccess.getDimensionKindAccess().getMmEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDimensionKindAccess().getMmEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6828:6: ( 'in' )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6828:6: ( 'in' )
                    // ../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g:6828:8: 'in'
                    {
                    match(input,79,FOLLOW_79_in_ruleDimensionKind13447); 

                            current = grammarAccess.getDimensionKindAccess().getInEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDimensionKindAccess().getInEnumLiteralDeclaration_5(), null); 
                        

                    }


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
    // $ANTLR end ruleDimensionKind


 

    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleApplication120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplication137 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleApplication163 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleApplication174 = new BitSet(new long[]{0x098000001BF78000L});
    public static final BitSet FOLLOW_ruleManifestFile_in_ruleApplication195 = new BitSet(new long[]{0x098000001BF70000L});
    public static final BitSet FOLLOW_ruleResource_in_ruleApplication218 = new BitSet(new long[]{0x098000001BF74000L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleApplication245 = new BitSet(new long[]{0x098000001BF74000L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleApplication272 = new BitSet(new long[]{0x098000001BF74000L});
    public static final BitSet FOLLOW_14_in_ruleApplication284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManifestFile_in_entryRuleManifestFile320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManifestFile330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleManifestFile374 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleManifestFile384 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleManifestFile394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericResource_in_ruleResource487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMenuResource_in_ruleResource514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueResource_in_ruleResource541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrawableResource_in_ruleResource568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnimationResource_in_ruleResource595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericResource_in_entryRuleGenericResource630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericResource640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleGenericResource675 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGenericResource701 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGenericResource716 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGenericResource726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMenuResource_in_entryRuleMenuResource762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMenuResource772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMenuResource807 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMenuResource833 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMenuResource848 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMenuResource858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueResource_in_entryRuleValueResource894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueResource904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValueResource_in_ruleValueResource951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValueResource_in_ruleValueResource978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValueResource_in_ruleValueResource1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorValueResource_in_ruleValueResource1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDimensionValueResource_in_ruleValueResource1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValueResource_in_entryRuleStringValueResource1094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValueResource1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleStringValueResource1139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringValueResource1156 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStringValueResource1171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValueResource1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValueResource_in_entryRuleIntegerValueResource1229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValueResource1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleIntegerValueResource1274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerValueResource1291 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIntegerValueResource1306 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerValueResource1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValueResource_in_entryRuleBooleanValueResource1364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValueResource1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBooleanValueResource1409 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanValueResource1426 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBooleanValueResource1441 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleBooleanValueResource1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorValueResource_in_entryRuleColorValueResource1498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorValueResource1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleColorValueResource1543 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColorValueResource1560 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleColorValueResource1575 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_COLOR_in_ruleColorValueResource1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDimensionValueResource_in_entryRuleDimensionValueResource1633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDimensionValueResource1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDimensionValueResource1678 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDimensionValueResource1695 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDimensionValueResource1710 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFLOAT_in_ruleDimensionValueResource1731 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FC00L});
    public static final BitSet FOLLOW_ruleDimensionKind_in_ruleDimensionValueResource1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrawableResource_in_entryRuleDrawableResource1788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDrawableResource1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitmapDrawableResource_in_ruleDrawableResource1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionDrawableResource_in_ruleDrawableResource1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitmapDrawableResource_in_entryRuleBitmapDrawableResource1907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitmapDrawableResource1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBitmapDrawableResource1952 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBitmapDrawableResource1969 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBitmapDrawableResource1984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBitmapDrawableResource2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionDrawableResource_in_entryRuleTransitionDrawableResource2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionDrawableResource2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTransitionDrawableResource2087 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransitionDrawableResource2105 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTransitionDrawableResource2115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransitionDrawableResource2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnimationResource_in_entryRuleAnimationResource2169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnimationResource2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAnimationResource2214 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnimationResource2240 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAnimationResource2255 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAnimationResource2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout2301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLayout2346 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLayout2372 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLayout2387 = new BitSet(new long[]{0x0005720020004000L});
    public static final BitSet FOLLOW_ruleWidget_in_ruleLayout2408 = new BitSet(new long[]{0x0005720020004000L});
    public static final BitSet FOLLOW_14_in_ruleLayout2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget2455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericWidget_in_ruleWidget2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleWidget2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageButton_in_ruleWidget2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleWidget2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinner_in_ruleWidget2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditText_in_ruleWidget2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextView_in_ruleWidget2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericWidget_in_entryRuleGenericWidget2709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericWidget2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleGenericWidget2754 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_30_in_ruleGenericWidget2774 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGenericWidget2791 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleGenericWidget2806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenericWidget2825 = new BitSet(new long[]{0x000001FF00000002L});
    public static final BitSet FOLLOW_32_in_ruleGenericWidget2883 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleGenericWidget2904 = new BitSet(new long[]{0x000001FF00000002L});
    public static final BitSet FOLLOW_33_in_ruleGenericWidget2966 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleGenericWidget2987 = new BitSet(new long[]{0x000001FF00000002L});
    public static final BitSet FOLLOW_34_in_ruleGenericWidget3049 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleGenericWidget3070 = new BitSet(new long[]{0x000001FF00000002L});
    public static final BitSet FOLLOW_35_in_ruleGenericWidget3132 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleGenericWidget3153 = new BitSet(new long[]{0x000001FF00000002L});
    public static final BitSet FOLLOW_36_in_ruleGenericWidget3215 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDrawableResourcePropertyValue_in_ruleGenericWidget3236 = new BitSet(new long[]{0x000001FF00000002L});
    public static final BitSet FOLLOW_37_in_ruleGenericWidget3298 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleGenericWidget3319 = new BitSet(new long[]{0x000001FF00000002L});
    public static final BitSet FOLLOW_38_in_ruleGenericWidget3381 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleGenericWidget3402 = new BitSet(new long[]{0x000001FF00000002L});
    public static final BitSet FOLLOW_39_in_ruleGenericWidget3464 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleGenericWidget3485 = new BitSet(new long[]{0x000001FF00000002L});
    public static final BitSet FOLLOW_40_in_ruleGenericWidget3536 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAction_in_ruleGenericWidget3557 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleTextView_in_entryRuleTextView3595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextView3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTextView3640 = new BitSet(new long[]{0x0000000040000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_ruleTextView3660 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextView3677 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTextView3692 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleStringPropertyValue_in_ruleTextView3715 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_32_in_ruleTextView3768 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleTextView3789 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_33_in_ruleTextView3851 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleTextView3872 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_34_in_ruleTextView3934 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleTextView3955 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_35_in_ruleTextView4017 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleTextView4038 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_36_in_ruleTextView4100 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDrawableResourcePropertyValue_in_ruleTextView4121 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_37_in_ruleTextView4183 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleTextView4204 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_38_in_ruleTextView4266 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleTextView4287 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_39_in_ruleTextView4349 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleTextView4370 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_42_in_ruleTextView4432 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleStringPropertyValue_in_ruleTextView4453 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_43_in_ruleTextView4515 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleColorPropertyValue_in_ruleTextView4536 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_40_in_ruleTextView4587 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAction_in_ruleTextView4608 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton4646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleButton4691 = new BitSet(new long[]{0x0000000040000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_ruleButton4711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleButton4728 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleButton4743 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleStringPropertyValue_in_ruleButton4766 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_32_in_ruleButton4819 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleButton4840 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_33_in_ruleButton4902 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleButton4923 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_34_in_ruleButton4985 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleButton5006 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_35_in_ruleButton5068 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleButton5089 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_36_in_ruleButton5151 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDrawableResourcePropertyValue_in_ruleButton5172 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_37_in_ruleButton5234 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleButton5255 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_38_in_ruleButton5317 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleButton5338 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_39_in_ruleButton5400 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleButton5421 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_42_in_ruleButton5483 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleStringPropertyValue_in_ruleButton5504 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_43_in_ruleButton5566 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleColorPropertyValue_in_ruleButton5587 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_40_in_ruleButton5638 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAction_in_ruleButton5659 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleImageButton_in_entryRuleImageButton5697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageButton5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleImageButton5742 = new BitSet(new long[]{0x0000000040000020L,0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_ruleImageButton5762 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImageButton5779 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleImageButton5794 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDrawableImageResourcePropertyValue_in_ruleImageButton5817 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_32_in_ruleImageButton5870 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleImageButton5891 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_33_in_ruleImageButton5953 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleImageButton5974 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_34_in_ruleImageButton6036 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleImageButton6057 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_35_in_ruleImageButton6119 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleImageButton6140 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_36_in_ruleImageButton6202 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDrawableResourcePropertyValue_in_ruleImageButton6223 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_37_in_ruleImageButton6285 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleImageButton6306 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_38_in_ruleImageButton6368 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleImageButton6389 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_39_in_ruleImageButton6451 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleImageButton6472 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_42_in_ruleImageButton6534 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleStringPropertyValue_in_ruleImageButton6555 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_43_in_ruleImageButton6617 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleColorPropertyValue_in_ruleImageButton6638 = new BitSet(new long[]{0x00000DFF00000002L});
    public static final BitSet FOLLOW_40_in_ruleImageButton6689 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAction_in_ruleImageButton6710 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink6748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLink6793 = new BitSet(new long[]{0x0000000040000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_ruleLink6813 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink6830 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLink6845 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleStringPropertyValue_in_ruleLink6868 = new BitSet(new long[]{0x00008CFF00000000L});
    public static final BitSet FOLLOW_32_in_ruleLink6921 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleLink6942 = new BitSet(new long[]{0x00008CFF00000000L});
    public static final BitSet FOLLOW_33_in_ruleLink7004 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleLink7025 = new BitSet(new long[]{0x00008CFF00000000L});
    public static final BitSet FOLLOW_34_in_ruleLink7087 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleLink7108 = new BitSet(new long[]{0x00008CFF00000000L});
    public static final BitSet FOLLOW_35_in_ruleLink7170 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleLink7191 = new BitSet(new long[]{0x00008CFF00000000L});
    public static final BitSet FOLLOW_36_in_ruleLink7253 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDrawableResourcePropertyValue_in_ruleLink7274 = new BitSet(new long[]{0x00008CFF00000000L});
    public static final BitSet FOLLOW_37_in_ruleLink7336 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleLink7357 = new BitSet(new long[]{0x00008CFF00000000L});
    public static final BitSet FOLLOW_38_in_ruleLink7419 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleLink7440 = new BitSet(new long[]{0x00008CFF00000000L});
    public static final BitSet FOLLOW_39_in_ruleLink7502 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleLink7523 = new BitSet(new long[]{0x00008CFF00000000L});
    public static final BitSet FOLLOW_42_in_ruleLink7585 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleStringPropertyValue_in_ruleLink7606 = new BitSet(new long[]{0x00008CFF00000000L});
    public static final BitSet FOLLOW_43_in_ruleLink7668 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleColorPropertyValue_in_ruleLink7689 = new BitSet(new long[]{0x00008CFF00000000L});
    public static final BitSet FOLLOW_47_in_ruleLink7739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink7757 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleLink7768 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAction_in_ruleLink7789 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleSpinner_in_entryRuleSpinner7827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpinner7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSpinner7872 = new BitSet(new long[]{0x000200FF40000002L});
    public static final BitSet FOLLOW_30_in_ruleSpinner7892 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpinner7909 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSpinner7924 = new BitSet(new long[]{0x000200FF00000002L});
    public static final BitSet FOLLOW_32_in_ruleSpinner7979 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleSpinner8000 = new BitSet(new long[]{0x000200FF00000002L});
    public static final BitSet FOLLOW_33_in_ruleSpinner8062 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleSpinner8083 = new BitSet(new long[]{0x000200FF00000002L});
    public static final BitSet FOLLOW_34_in_ruleSpinner8145 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleSpinner8166 = new BitSet(new long[]{0x000200FF00000002L});
    public static final BitSet FOLLOW_35_in_ruleSpinner8228 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleSpinner8249 = new BitSet(new long[]{0x000200FF00000002L});
    public static final BitSet FOLLOW_36_in_ruleSpinner8311 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDrawableResourcePropertyValue_in_ruleSpinner8332 = new BitSet(new long[]{0x000200FF00000002L});
    public static final BitSet FOLLOW_37_in_ruleSpinner8394 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleSpinner8415 = new BitSet(new long[]{0x000200FF00000002L});
    public static final BitSet FOLLOW_38_in_ruleSpinner8477 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleSpinner8498 = new BitSet(new long[]{0x000200FF00000002L});
    public static final BitSet FOLLOW_39_in_ruleSpinner8560 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleSpinner8581 = new BitSet(new long[]{0x000200FF00000002L});
    public static final BitSet FOLLOW_49_in_ruleSpinner8643 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleStringPropertyValue_in_ruleSpinner8664 = new BitSet(new long[]{0x000200FF00000002L});
    public static final BitSet FOLLOW_ruleEditText_in_entryRuleEditText8740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditText8750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleEditText8785 = new BitSet(new long[]{0x0000000040000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_ruleEditText8805 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEditText8822 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEditText8837 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleStringPropertyValue_in_ruleEditText8860 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_32_in_ruleEditText8913 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleEditText8934 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_33_in_ruleEditText8996 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleEditText9017 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_34_in_ruleEditText9079 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleEditText9100 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_35_in_ruleEditText9162 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_ruleEditText9183 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_36_in_ruleEditText9245 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleDrawableResourcePropertyValue_in_ruleEditText9266 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_37_in_ruleEditText9328 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleEditText9349 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_38_in_ruleEditText9411 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleEditText9432 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_39_in_ruleEditText9494 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleEditText9515 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_42_in_ruleEditText9577 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleStringPropertyValue_in_ruleEditText9598 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_43_in_ruleEditText9660 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleColorPropertyValue_in_ruleEditText9681 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_51_in_ruleEditText9743 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleEditText9764 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_52_in_ruleEditText9826 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleEditText9847 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_53_in_ruleEditText9909 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleEditText9930 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_54_in_ruleEditText9992 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000C8L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_ruleEditText10013 = new BitSet(new long[]{0x00780CFF00000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity10089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity10099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericActivity_in_ruleActivity10146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListActivity_in_ruleActivity10173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabActivity_in_ruleActivity10200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericActivity_in_entryRuleGenericActivity10235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericActivity10245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleGenericActivity10280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGenericActivity10301 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGenericActivity10311 = new BitSet(new long[]{0xE000000000004000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAction_in_ruleGenericActivity10332 = new BitSet(new long[]{0xE000000000004000L,0x0000000000000003L});
    public static final BitSet FOLLOW_14_in_ruleGenericActivity10343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListActivity_in_entryRuleListActivity10379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListActivity10389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleListActivity10424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleListActivity10445 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleListActivity10455 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleListActivity10465 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListActivity10482 = new BitSet(new long[]{0x0400000010000000L});
    public static final BitSet FOLLOW_28_in_ruleListActivity10498 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListActivity10516 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleListActivity10528 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListActivity10546 = new BitSet(new long[]{0xE000000000004000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAction_in_ruleListActivity10567 = new BitSet(new long[]{0xE000000000004000L,0x0000000000000003L});
    public static final BitSet FOLLOW_14_in_ruleListActivity10578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabActivity_in_entryRuleTabActivity10614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabActivity10624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTabActivity10659 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTabActivity10680 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTabActivity10690 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleTab_in_ruleTabActivity10711 = new BitSet(new long[]{0x1000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTabActivity10722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTab_in_entryRuleTab10758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTab10768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTab10803 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTab10821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction10857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction10867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericAction_in_ruleAction10914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoToURLAction_in_ruleAction10941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShowLayoutAction_in_ruleAction10968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeActivityAction_in_ruleAction10995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadResourceAction_in_ruleAction11022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericAction_in_entryRuleGenericAction11057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericAction11067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleGenericAction11102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGenericAction11123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoToURLAction_in_entryRuleGoToURLAction11159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoToURLAction11169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleGoToURLAction11204 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleURL_in_ruleGoToURLAction11225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShowLayoutAction_in_entryRuleShowLayoutAction11261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShowLayoutAction11271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleShowLayoutAction11306 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleShowLayoutAction11324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeActivityAction_in_entryRuleInvokeActivityAction11360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvokeActivityAction11370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleInvokeActivityAction11405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInvokeActivityAction11428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadResourceAction_in_entryRuleLoadResourceAction11464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadResourceAction11474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleLoadResourceAction11509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLoadResourceAction11526 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_40_in_ruleLoadResourceAction11542 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLoadResourceAction11559 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleLoadResourceAction11577 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAction_in_ruleLoadResourceAction11598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringPropertyValue_in_entryRuleStringPropertyValue11638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringPropertyValue11648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringPropertyValue11690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringPropertyValue11720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleStringPropertyValue11737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringPropertyValue11754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStringPropertyValue11769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerPropertyValue_in_entryRuleIntegerPropertyValue11807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerPropertyValue11817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerPropertyValue11859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerPropertyValue11889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleIntegerPropertyValue11906 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerPropertyValue11923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleIntegerPropertyValue11938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanPropertyValue_in_entryRuleBooleanPropertyValue11976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanPropertyValue11986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleBooleanPropertyValue12032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanPropertyValue12057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleBooleanPropertyValue12074 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanPropertyValue12091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleBooleanPropertyValue12106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorPropertyValue_in_entryRuleColorPropertyValue12144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorPropertyValue12154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_COLOR_in_ruleColorPropertyValue12196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColorPropertyValue12226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleColorPropertyValue12243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColorPropertyValue12260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleColorPropertyValue12275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDimensionPropertyValue_in_entryRuleDimensionPropertyValue12313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDimensionPropertyValue12323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_ruleDimensionPropertyValue12369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDimensionPropertyValue12394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDimensionPropertyValue12411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDimensionPropertyValue12428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleDimensionPropertyValue12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrawableResourcePropertyValue_in_entryRuleDrawableResourcePropertyValue12481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDrawableResourcePropertyValue12491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_COLOR_in_ruleDrawableResourcePropertyValue12533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDrawableResourcePropertyValue12563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDrawableResourcePropertyValue12580 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDrawableResourcePropertyValue12597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleDrawableResourcePropertyValue12612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrawableImageResourcePropertyValue_in_entryRuleDrawableImageResourcePropertyValue12650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDrawableImageResourcePropertyValue12660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDrawableImageResourcePropertyValue12703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDrawableImageResourcePropertyValue12720 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDrawableImageResourcePropertyValue12737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleDrawableImageResourcePropertyValue12752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName12801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12841 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleQualifiedName12860 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12875 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL12923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL12934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleBOOL12972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleBOOL12991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_entryRuleFLOAT13032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFLOAT13043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT13083 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleFLOAT13102 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT13117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURL_in_entryRuleURL13165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURL13176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURL13216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleURL13234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleURL13256 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleURL13275 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleURL13298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleURL13316 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_74_in_ruleDimensionKind13372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleDimensionKind13387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleDimensionKind13402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDimensionKind13417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDimensionKind13432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDimensionKind13447 = new BitSet(new long[]{0x0000000000000002L});

}
