package org.eclipse.amalgam.tutorials.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.amalgam.tutorials.xtext.services.DroidGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDroidParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'{'", "'}'", "'manifest'", "'layout'", "'top'", "'='", "'left'", "'width'", "'->'", "'widget'", "'<'", "'>'", "'button'", "'spinner'", "'editText'", "'textView'", "'activity'", "'list activity'", "'data'", "'item'", "'tab activity'", "'action'", "'go to'", "'show'", "'invoke'", "'load'", "'=>'", "'.'", "'://'", "'/'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g"; }


     
     	private DroidGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DroidGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleApplication
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:61:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:62:1: ( ruleApplication EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:63:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication61);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleApplication


    // $ANTLR start ruleApplication
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:70:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:74:2: ( ( ( rule__Application__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:75:1: ( ( rule__Application__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:75:1: ( ( rule__Application__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:76:1: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:77:1: ( rule__Application__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:77:2: rule__Application__Group__0
            {
            pushFollow(FOLLOW_rule__Application__Group__0_in_ruleApplication94);
            rule__Application__Group__0();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleApplication


    // $ANTLR start entryRuleManifestFile
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:91:1: entryRuleManifestFile : ruleManifestFile EOF ;
    public final void entryRuleManifestFile() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:92:1: ( ruleManifestFile EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:93:1: ruleManifestFile EOF
            {
             before(grammarAccess.getManifestFileRule()); 
            pushFollow(FOLLOW_ruleManifestFile_in_entryRuleManifestFile123);
            ruleManifestFile();
            _fsp--;

             after(grammarAccess.getManifestFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManifestFile130); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleManifestFile


    // $ANTLR start ruleManifestFile
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:100:1: ruleManifestFile : ( ( rule__ManifestFile__Group__0 ) ) ;
    public final void ruleManifestFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:104:2: ( ( ( rule__ManifestFile__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:105:1: ( ( rule__ManifestFile__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:105:1: ( ( rule__ManifestFile__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:106:1: ( rule__ManifestFile__Group__0 )
            {
             before(grammarAccess.getManifestFileAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:107:1: ( rule__ManifestFile__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:107:2: rule__ManifestFile__Group__0
            {
            pushFollow(FOLLOW_rule__ManifestFile__Group__0_in_ruleManifestFile156);
            rule__ManifestFile__Group__0();
            _fsp--;


            }

             after(grammarAccess.getManifestFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleManifestFile


    // $ANTLR start entryRuleLayout
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:119:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:120:1: ( ruleLayout EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:121:1: ruleLayout EOF
            {
             before(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout183);
            ruleLayout();
            _fsp--;

             after(grammarAccess.getLayoutRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLayout


    // $ANTLR start ruleLayout
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:128:1: ruleLayout : ( ( rule__Layout__Group__0 ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:132:2: ( ( ( rule__Layout__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:133:1: ( ( rule__Layout__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:133:1: ( ( rule__Layout__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:134:1: ( rule__Layout__Group__0 )
            {
             before(grammarAccess.getLayoutAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:135:1: ( rule__Layout__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:135:2: rule__Layout__Group__0
            {
            pushFollow(FOLLOW_rule__Layout__Group__0_in_ruleLayout216);
            rule__Layout__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLayoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLayout


    // $ANTLR start entryRuleWidget
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:147:1: entryRuleWidget : ruleWidget EOF ;
    public final void entryRuleWidget() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:148:1: ( ruleWidget EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:149:1: ruleWidget EOF
            {
             before(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_ruleWidget_in_entryRuleWidget243);
            ruleWidget();
            _fsp--;

             after(grammarAccess.getWidgetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidget250); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleWidget


    // $ANTLR start ruleWidget
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:156:1: ruleWidget : ( ( rule__Widget__Group__0 ) ) ;
    public final void ruleWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:160:2: ( ( ( rule__Widget__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:161:1: ( ( rule__Widget__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:161:1: ( ( rule__Widget__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:162:1: ( rule__Widget__Group__0 )
            {
             before(grammarAccess.getWidgetAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:163:1: ( rule__Widget__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:163:2: rule__Widget__Group__0
            {
            pushFollow(FOLLOW_rule__Widget__Group__0_in_ruleWidget276);
            rule__Widget__Group__0();
            _fsp--;


            }

             after(grammarAccess.getWidgetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleWidget


    // $ANTLR start entryRuleGenericWidget
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:175:1: entryRuleGenericWidget : ruleGenericWidget EOF ;
    public final void entryRuleGenericWidget() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:176:1: ( ruleGenericWidget EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:177:1: ruleGenericWidget EOF
            {
             before(grammarAccess.getGenericWidgetRule()); 
            pushFollow(FOLLOW_ruleGenericWidget_in_entryRuleGenericWidget303);
            ruleGenericWidget();
            _fsp--;

             after(grammarAccess.getGenericWidgetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericWidget310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleGenericWidget


    // $ANTLR start ruleGenericWidget
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:184:1: ruleGenericWidget : ( ( rule__GenericWidget__Group__0 ) ) ;
    public final void ruleGenericWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:188:2: ( ( ( rule__GenericWidget__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:189:1: ( ( rule__GenericWidget__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:189:1: ( ( rule__GenericWidget__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:190:1: ( rule__GenericWidget__Group__0 )
            {
             before(grammarAccess.getGenericWidgetAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:191:1: ( rule__GenericWidget__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:191:2: rule__GenericWidget__Group__0
            {
            pushFollow(FOLLOW_rule__GenericWidget__Group__0_in_ruleGenericWidget336);
            rule__GenericWidget__Group__0();
            _fsp--;


            }

             after(grammarAccess.getGenericWidgetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleGenericWidget


    // $ANTLR start entryRuleButton
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:203:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:204:1: ( ruleButton EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:205:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton363);
            ruleButton();
            _fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleButton


    // $ANTLR start ruleButton
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:212:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:216:2: ( ( ( rule__Button__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:217:1: ( ( rule__Button__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:217:1: ( ( rule__Button__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:218:1: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:219:1: ( rule__Button__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:219:2: rule__Button__Group__0
            {
            pushFollow(FOLLOW_rule__Button__Group__0_in_ruleButton396);
            rule__Button__Group__0();
            _fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleButton


    // $ANTLR start entryRuleSpinner
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:231:1: entryRuleSpinner : ruleSpinner EOF ;
    public final void entryRuleSpinner() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:232:1: ( ruleSpinner EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:233:1: ruleSpinner EOF
            {
             before(grammarAccess.getSpinnerRule()); 
            pushFollow(FOLLOW_ruleSpinner_in_entryRuleSpinner423);
            ruleSpinner();
            _fsp--;

             after(grammarAccess.getSpinnerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpinner430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSpinner


    // $ANTLR start ruleSpinner
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:240:1: ruleSpinner : ( ( rule__Spinner__Group__0 ) ) ;
    public final void ruleSpinner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:244:2: ( ( ( rule__Spinner__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:245:1: ( ( rule__Spinner__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:245:1: ( ( rule__Spinner__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:246:1: ( rule__Spinner__Group__0 )
            {
             before(grammarAccess.getSpinnerAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:247:1: ( rule__Spinner__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:247:2: rule__Spinner__Group__0
            {
            pushFollow(FOLLOW_rule__Spinner__Group__0_in_ruleSpinner456);
            rule__Spinner__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSpinner


    // $ANTLR start entryRuleEditText
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:259:1: entryRuleEditText : ruleEditText EOF ;
    public final void entryRuleEditText() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:260:1: ( ruleEditText EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:261:1: ruleEditText EOF
            {
             before(grammarAccess.getEditTextRule()); 
            pushFollow(FOLLOW_ruleEditText_in_entryRuleEditText483);
            ruleEditText();
            _fsp--;

             after(grammarAccess.getEditTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditText490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEditText


    // $ANTLR start ruleEditText
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:268:1: ruleEditText : ( ( rule__EditText__Group__0 ) ) ;
    public final void ruleEditText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:272:2: ( ( ( rule__EditText__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:273:1: ( ( rule__EditText__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:273:1: ( ( rule__EditText__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:274:1: ( rule__EditText__Group__0 )
            {
             before(grammarAccess.getEditTextAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:275:1: ( rule__EditText__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:275:2: rule__EditText__Group__0
            {
            pushFollow(FOLLOW_rule__EditText__Group__0_in_ruleEditText516);
            rule__EditText__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEditTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEditText


    // $ANTLR start entryRuleTextView
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:287:1: entryRuleTextView : ruleTextView EOF ;
    public final void entryRuleTextView() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:288:1: ( ruleTextView EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:289:1: ruleTextView EOF
            {
             before(grammarAccess.getTextViewRule()); 
            pushFollow(FOLLOW_ruleTextView_in_entryRuleTextView543);
            ruleTextView();
            _fsp--;

             after(grammarAccess.getTextViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextView550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTextView


    // $ANTLR start ruleTextView
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:296:1: ruleTextView : ( ( rule__TextView__Group__0 ) ) ;
    public final void ruleTextView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:300:2: ( ( ( rule__TextView__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:301:1: ( ( rule__TextView__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:301:1: ( ( rule__TextView__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:302:1: ( rule__TextView__Group__0 )
            {
             before(grammarAccess.getTextViewAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:303:1: ( rule__TextView__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:303:2: rule__TextView__Group__0
            {
            pushFollow(FOLLOW_rule__TextView__Group__0_in_ruleTextView576);
            rule__TextView__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTextViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTextView


    // $ANTLR start entryRuleActivity
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:315:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:316:1: ( ruleActivity EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:317:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity603);
            ruleActivity();
            _fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleActivity


    // $ANTLR start ruleActivity
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:324:1: ruleActivity : ( ( rule__Activity__Alternatives ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:328:2: ( ( ( rule__Activity__Alternatives ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:329:1: ( ( rule__Activity__Alternatives ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:329:1: ( ( rule__Activity__Alternatives ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:330:1: ( rule__Activity__Alternatives )
            {
             before(grammarAccess.getActivityAccess().getAlternatives()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:331:1: ( rule__Activity__Alternatives )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:331:2: rule__Activity__Alternatives
            {
            pushFollow(FOLLOW_rule__Activity__Alternatives_in_ruleActivity636);
            rule__Activity__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getActivityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleActivity


    // $ANTLR start entryRuleGenericActivity
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:343:1: entryRuleGenericActivity : ruleGenericActivity EOF ;
    public final void entryRuleGenericActivity() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:344:1: ( ruleGenericActivity EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:345:1: ruleGenericActivity EOF
            {
             before(grammarAccess.getGenericActivityRule()); 
            pushFollow(FOLLOW_ruleGenericActivity_in_entryRuleGenericActivity663);
            ruleGenericActivity();
            _fsp--;

             after(grammarAccess.getGenericActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericActivity670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleGenericActivity


    // $ANTLR start ruleGenericActivity
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:352:1: ruleGenericActivity : ( ( rule__GenericActivity__Group__0 ) ) ;
    public final void ruleGenericActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:356:2: ( ( ( rule__GenericActivity__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:357:1: ( ( rule__GenericActivity__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:357:1: ( ( rule__GenericActivity__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:358:1: ( rule__GenericActivity__Group__0 )
            {
             before(grammarAccess.getGenericActivityAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:359:1: ( rule__GenericActivity__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:359:2: rule__GenericActivity__Group__0
            {
            pushFollow(FOLLOW_rule__GenericActivity__Group__0_in_ruleGenericActivity696);
            rule__GenericActivity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getGenericActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleGenericActivity


    // $ANTLR start entryRuleListActivity
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:371:1: entryRuleListActivity : ruleListActivity EOF ;
    public final void entryRuleListActivity() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:372:1: ( ruleListActivity EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:373:1: ruleListActivity EOF
            {
             before(grammarAccess.getListActivityRule()); 
            pushFollow(FOLLOW_ruleListActivity_in_entryRuleListActivity723);
            ruleListActivity();
            _fsp--;

             after(grammarAccess.getListActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListActivity730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleListActivity


    // $ANTLR start ruleListActivity
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:380:1: ruleListActivity : ( ( rule__ListActivity__Group__0 ) ) ;
    public final void ruleListActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:384:2: ( ( ( rule__ListActivity__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:385:1: ( ( rule__ListActivity__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:385:1: ( ( rule__ListActivity__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:386:1: ( rule__ListActivity__Group__0 )
            {
             before(grammarAccess.getListActivityAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:387:1: ( rule__ListActivity__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:387:2: rule__ListActivity__Group__0
            {
            pushFollow(FOLLOW_rule__ListActivity__Group__0_in_ruleListActivity756);
            rule__ListActivity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getListActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleListActivity


    // $ANTLR start entryRuleTabActivity
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:399:1: entryRuleTabActivity : ruleTabActivity EOF ;
    public final void entryRuleTabActivity() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:400:1: ( ruleTabActivity EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:401:1: ruleTabActivity EOF
            {
             before(grammarAccess.getTabActivityRule()); 
            pushFollow(FOLLOW_ruleTabActivity_in_entryRuleTabActivity783);
            ruleTabActivity();
            _fsp--;

             after(grammarAccess.getTabActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabActivity790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTabActivity


    // $ANTLR start ruleTabActivity
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:408:1: ruleTabActivity : ( ( rule__TabActivity__Group__0 ) ) ;
    public final void ruleTabActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:412:2: ( ( ( rule__TabActivity__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:413:1: ( ( rule__TabActivity__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:413:1: ( ( rule__TabActivity__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:414:1: ( rule__TabActivity__Group__0 )
            {
             before(grammarAccess.getTabActivityAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:415:1: ( rule__TabActivity__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:415:2: rule__TabActivity__Group__0
            {
            pushFollow(FOLLOW_rule__TabActivity__Group__0_in_ruleTabActivity816);
            rule__TabActivity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTabActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTabActivity


    // $ANTLR start entryRuleAction
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:427:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:428:1: ( ruleAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:429:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction843);
            ruleAction();
            _fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:436:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:440:2: ( ( ( rule__Action__Alternatives ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:441:1: ( ( rule__Action__Alternatives ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:441:1: ( ( rule__Action__Alternatives ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:442:1: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:443:1: ( rule__Action__Alternatives )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:443:2: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_rule__Action__Alternatives_in_ruleAction876);
            rule__Action__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleGenericAction
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:455:1: entryRuleGenericAction : ruleGenericAction EOF ;
    public final void entryRuleGenericAction() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:456:1: ( ruleGenericAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:457:1: ruleGenericAction EOF
            {
             before(grammarAccess.getGenericActionRule()); 
            pushFollow(FOLLOW_ruleGenericAction_in_entryRuleGenericAction903);
            ruleGenericAction();
            _fsp--;

             after(grammarAccess.getGenericActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericAction910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleGenericAction


    // $ANTLR start ruleGenericAction
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:464:1: ruleGenericAction : ( ( rule__GenericAction__Group__0 ) ) ;
    public final void ruleGenericAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:468:2: ( ( ( rule__GenericAction__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:469:1: ( ( rule__GenericAction__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:469:1: ( ( rule__GenericAction__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:470:1: ( rule__GenericAction__Group__0 )
            {
             before(grammarAccess.getGenericActionAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:471:1: ( rule__GenericAction__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:471:2: rule__GenericAction__Group__0
            {
            pushFollow(FOLLOW_rule__GenericAction__Group__0_in_ruleGenericAction936);
            rule__GenericAction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getGenericActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleGenericAction


    // $ANTLR start entryRuleGoToURLAction
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:483:1: entryRuleGoToURLAction : ruleGoToURLAction EOF ;
    public final void entryRuleGoToURLAction() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:484:1: ( ruleGoToURLAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:485:1: ruleGoToURLAction EOF
            {
             before(grammarAccess.getGoToURLActionRule()); 
            pushFollow(FOLLOW_ruleGoToURLAction_in_entryRuleGoToURLAction963);
            ruleGoToURLAction();
            _fsp--;

             after(grammarAccess.getGoToURLActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoToURLAction970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleGoToURLAction


    // $ANTLR start ruleGoToURLAction
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:492:1: ruleGoToURLAction : ( ( rule__GoToURLAction__Group__0 ) ) ;
    public final void ruleGoToURLAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:496:2: ( ( ( rule__GoToURLAction__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:497:1: ( ( rule__GoToURLAction__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:497:1: ( ( rule__GoToURLAction__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:498:1: ( rule__GoToURLAction__Group__0 )
            {
             before(grammarAccess.getGoToURLActionAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:499:1: ( rule__GoToURLAction__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:499:2: rule__GoToURLAction__Group__0
            {
            pushFollow(FOLLOW_rule__GoToURLAction__Group__0_in_ruleGoToURLAction996);
            rule__GoToURLAction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getGoToURLActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleGoToURLAction


    // $ANTLR start entryRuleShowLayoutAction
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:511:1: entryRuleShowLayoutAction : ruleShowLayoutAction EOF ;
    public final void entryRuleShowLayoutAction() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:512:1: ( ruleShowLayoutAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:513:1: ruleShowLayoutAction EOF
            {
             before(grammarAccess.getShowLayoutActionRule()); 
            pushFollow(FOLLOW_ruleShowLayoutAction_in_entryRuleShowLayoutAction1023);
            ruleShowLayoutAction();
            _fsp--;

             after(grammarAccess.getShowLayoutActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShowLayoutAction1030); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleShowLayoutAction


    // $ANTLR start ruleShowLayoutAction
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:520:1: ruleShowLayoutAction : ( ( rule__ShowLayoutAction__Group__0 ) ) ;
    public final void ruleShowLayoutAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:524:2: ( ( ( rule__ShowLayoutAction__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:525:1: ( ( rule__ShowLayoutAction__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:525:1: ( ( rule__ShowLayoutAction__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:526:1: ( rule__ShowLayoutAction__Group__0 )
            {
             before(grammarAccess.getShowLayoutActionAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:527:1: ( rule__ShowLayoutAction__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:527:2: rule__ShowLayoutAction__Group__0
            {
            pushFollow(FOLLOW_rule__ShowLayoutAction__Group__0_in_ruleShowLayoutAction1056);
            rule__ShowLayoutAction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getShowLayoutActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleShowLayoutAction


    // $ANTLR start entryRuleInvokeActivityAction
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:539:1: entryRuleInvokeActivityAction : ruleInvokeActivityAction EOF ;
    public final void entryRuleInvokeActivityAction() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:540:1: ( ruleInvokeActivityAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:541:1: ruleInvokeActivityAction EOF
            {
             before(grammarAccess.getInvokeActivityActionRule()); 
            pushFollow(FOLLOW_ruleInvokeActivityAction_in_entryRuleInvokeActivityAction1083);
            ruleInvokeActivityAction();
            _fsp--;

             after(grammarAccess.getInvokeActivityActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvokeActivityAction1090); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleInvokeActivityAction


    // $ANTLR start ruleInvokeActivityAction
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:548:1: ruleInvokeActivityAction : ( ( rule__InvokeActivityAction__Group__0 ) ) ;
    public final void ruleInvokeActivityAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:552:2: ( ( ( rule__InvokeActivityAction__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:553:1: ( ( rule__InvokeActivityAction__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:553:1: ( ( rule__InvokeActivityAction__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:554:1: ( rule__InvokeActivityAction__Group__0 )
            {
             before(grammarAccess.getInvokeActivityActionAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:555:1: ( rule__InvokeActivityAction__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:555:2: rule__InvokeActivityAction__Group__0
            {
            pushFollow(FOLLOW_rule__InvokeActivityAction__Group__0_in_ruleInvokeActivityAction1116);
            rule__InvokeActivityAction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInvokeActivityActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInvokeActivityAction


    // $ANTLR start entryRuleLoadResourceAction
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:567:1: entryRuleLoadResourceAction : ruleLoadResourceAction EOF ;
    public final void entryRuleLoadResourceAction() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:568:1: ( ruleLoadResourceAction EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:569:1: ruleLoadResourceAction EOF
            {
             before(grammarAccess.getLoadResourceActionRule()); 
            pushFollow(FOLLOW_ruleLoadResourceAction_in_entryRuleLoadResourceAction1143);
            ruleLoadResourceAction();
            _fsp--;

             after(grammarAccess.getLoadResourceActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadResourceAction1150); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLoadResourceAction


    // $ANTLR start ruleLoadResourceAction
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:576:1: ruleLoadResourceAction : ( ( rule__LoadResourceAction__Group__0 ) ) ;
    public final void ruleLoadResourceAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:580:2: ( ( ( rule__LoadResourceAction__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:581:1: ( ( rule__LoadResourceAction__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:581:1: ( ( rule__LoadResourceAction__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:582:1: ( rule__LoadResourceAction__Group__0 )
            {
             before(grammarAccess.getLoadResourceActionAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:583:1: ( rule__LoadResourceAction__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:583:2: rule__LoadResourceAction__Group__0
            {
            pushFollow(FOLLOW_rule__LoadResourceAction__Group__0_in_ruleLoadResourceAction1176);
            rule__LoadResourceAction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLoadResourceActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLoadResourceAction


    // $ANTLR start entryRuleQualifiedName
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:595:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:596:1: ( ruleQualifiedName EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:597:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1203);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1210); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleQualifiedName


    // $ANTLR start ruleQualifiedName
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:604:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:608:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:609:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:609:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:610:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:611:1: ( rule__QualifiedName__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:611:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1236);
            rule__QualifiedName__Group__0();
            _fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleQualifiedName


    // $ANTLR start entryRuleURL
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:623:1: entryRuleURL : ruleURL EOF ;
    public final void entryRuleURL() throws RecognitionException {
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:624:1: ( ruleURL EOF )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:625:1: ruleURL EOF
            {
             before(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_ruleURL_in_entryRuleURL1263);
            ruleURL();
            _fsp--;

             after(grammarAccess.getURLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURL1270); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleURL


    // $ANTLR start ruleURL
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:632:1: ruleURL : ( ( rule__URL__Group__0 ) ) ;
    public final void ruleURL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:636:2: ( ( ( rule__URL__Group__0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:637:1: ( ( rule__URL__Group__0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:637:1: ( ( rule__URL__Group__0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:638:1: ( rule__URL__Group__0 )
            {
             before(grammarAccess.getURLAccess().getGroup()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:639:1: ( rule__URL__Group__0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:639:2: rule__URL__Group__0
            {
            pushFollow(FOLLOW_rule__URL__Group__0_in_ruleURL1296);
            rule__URL__Group__0();
            _fsp--;


            }

             after(grammarAccess.getURLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleURL


    // $ANTLR start rule__Widget__Alternatives_0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:652:1: rule__Widget__Alternatives_0 : ( ( ruleGenericWidget ) | ( ruleButton ) | ( ruleSpinner ) | ( ruleEditText ) | ( ruleTextView ) );
    public final void rule__Widget__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:656:1: ( ( ruleGenericWidget ) | ( ruleButton ) | ( ruleSpinner ) | ( ruleEditText ) | ( ruleTextView ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=4;
                }
                break;
            case 27:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("652:1: rule__Widget__Alternatives_0 : ( ( ruleGenericWidget ) | ( ruleButton ) | ( ruleSpinner ) | ( ruleEditText ) | ( ruleTextView ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:657:1: ( ruleGenericWidget )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:657:1: ( ruleGenericWidget )
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:658:1: ruleGenericWidget
                    {
                     before(grammarAccess.getWidgetAccess().getGenericWidgetParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleGenericWidget_in_rule__Widget__Alternatives_01333);
                    ruleGenericWidget();
                    _fsp--;

                     after(grammarAccess.getWidgetAccess().getGenericWidgetParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:663:6: ( ruleButton )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:663:6: ( ruleButton )
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:664:1: ruleButton
                    {
                     before(grammarAccess.getWidgetAccess().getButtonParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleButton_in_rule__Widget__Alternatives_01350);
                    ruleButton();
                    _fsp--;

                     after(grammarAccess.getWidgetAccess().getButtonParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:669:6: ( ruleSpinner )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:669:6: ( ruleSpinner )
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:670:1: ruleSpinner
                    {
                     before(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleSpinner_in_rule__Widget__Alternatives_01367);
                    ruleSpinner();
                    _fsp--;

                     after(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:675:6: ( ruleEditText )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:675:6: ( ruleEditText )
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:676:1: ruleEditText
                    {
                     before(grammarAccess.getWidgetAccess().getEditTextParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleEditText_in_rule__Widget__Alternatives_01384);
                    ruleEditText();
                    _fsp--;

                     after(grammarAccess.getWidgetAccess().getEditTextParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:681:6: ( ruleTextView )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:681:6: ( ruleTextView )
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:682:1: ruleTextView
                    {
                     before(grammarAccess.getWidgetAccess().getTextViewParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleTextView_in_rule__Widget__Alternatives_01401);
                    ruleTextView();
                    _fsp--;

                     after(grammarAccess.getWidgetAccess().getTextViewParserRuleCall_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Alternatives_0


    // $ANTLR start rule__Activity__Alternatives
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:692:1: rule__Activity__Alternatives : ( ( ruleGenericActivity ) | ( ruleListActivity ) | ( ruleTabActivity ) );
    public final void rule__Activity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:696:1: ( ( ruleGenericActivity ) | ( ruleListActivity ) | ( ruleTabActivity ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("692:1: rule__Activity__Alternatives : ( ( ruleGenericActivity ) | ( ruleListActivity ) | ( ruleTabActivity ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:697:1: ( ruleGenericActivity )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:697:1: ( ruleGenericActivity )
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:698:1: ruleGenericActivity
                    {
                     before(grammarAccess.getActivityAccess().getGenericActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGenericActivity_in_rule__Activity__Alternatives1433);
                    ruleGenericActivity();
                    _fsp--;

                     after(grammarAccess.getActivityAccess().getGenericActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:703:6: ( ruleListActivity )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:703:6: ( ruleListActivity )
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:704:1: ruleListActivity
                    {
                     before(grammarAccess.getActivityAccess().getListActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleListActivity_in_rule__Activity__Alternatives1450);
                    ruleListActivity();
                    _fsp--;

                     after(grammarAccess.getActivityAccess().getListActivityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:709:6: ( ruleTabActivity )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:709:6: ( ruleTabActivity )
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:710:1: ruleTabActivity
                    {
                     before(grammarAccess.getActivityAccess().getTabActivityParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTabActivity_in_rule__Activity__Alternatives1467);
                    ruleTabActivity();
                    _fsp--;

                     after(grammarAccess.getActivityAccess().getTabActivityParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Alternatives


    // $ANTLR start rule__Action__Alternatives
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:720:1: rule__Action__Alternatives : ( ( ruleGenericAction ) | ( ruleGoToURLAction ) | ( ruleShowLayoutAction ) | ( ruleInvokeActivityAction ) | ( ruleLoadResourceAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:724:1: ( ( ruleGenericAction ) | ( ruleGoToURLAction ) | ( ruleShowLayoutAction ) | ( ruleInvokeActivityAction ) | ( ruleLoadResourceAction ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt3=1;
                }
                break;
            case 34:
                {
                alt3=2;
                }
                break;
            case 35:
                {
                alt3=3;
                }
                break;
            case 36:
                {
                alt3=4;
                }
                break;
            case 37:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("720:1: rule__Action__Alternatives : ( ( ruleGenericAction ) | ( ruleGoToURLAction ) | ( ruleShowLayoutAction ) | ( ruleInvokeActivityAction ) | ( ruleLoadResourceAction ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:725:1: ( ruleGenericAction )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:725:1: ( ruleGenericAction )
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:726:1: ruleGenericAction
                    {
                     before(grammarAccess.getActionAccess().getGenericActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGenericAction_in_rule__Action__Alternatives1499);
                    ruleGenericAction();
                    _fsp--;

                     after(grammarAccess.getActionAccess().getGenericActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:731:6: ( ruleGoToURLAction )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:731:6: ( ruleGoToURLAction )
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:732:1: ruleGoToURLAction
                    {
                     before(grammarAccess.getActionAccess().getGoToURLActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGoToURLAction_in_rule__Action__Alternatives1516);
                    ruleGoToURLAction();
                    _fsp--;

                     after(grammarAccess.getActionAccess().getGoToURLActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:737:6: ( ruleShowLayoutAction )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:737:6: ( ruleShowLayoutAction )
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:738:1: ruleShowLayoutAction
                    {
                     before(grammarAccess.getActionAccess().getShowLayoutActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleShowLayoutAction_in_rule__Action__Alternatives1533);
                    ruleShowLayoutAction();
                    _fsp--;

                     after(grammarAccess.getActionAccess().getShowLayoutActionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:743:6: ( ruleInvokeActivityAction )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:743:6: ( ruleInvokeActivityAction )
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:744:1: ruleInvokeActivityAction
                    {
                     before(grammarAccess.getActionAccess().getInvokeActivityActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleInvokeActivityAction_in_rule__Action__Alternatives1550);
                    ruleInvokeActivityAction();
                    _fsp--;

                     after(grammarAccess.getActionAccess().getInvokeActivityActionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:749:6: ( ruleLoadResourceAction )
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:749:6: ( ruleLoadResourceAction )
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:750:1: ruleLoadResourceAction
                    {
                     before(grammarAccess.getActionAccess().getLoadResourceActionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleLoadResourceAction_in_rule__Action__Alternatives1567);
                    ruleLoadResourceAction();
                    _fsp--;

                     after(grammarAccess.getActionAccess().getLoadResourceActionParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Alternatives


    // $ANTLR start rule__Application__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:762:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:766:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:767:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__01597);
            rule__Application__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__01600);
            rule__Application__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__0


    // $ANTLR start rule__Application__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:774:1: rule__Application__Group__0__Impl : ( 'application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:778:1: ( ( 'application' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:779:1: ( 'application' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:779:1: ( 'application' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:780:1: 'application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Application__Group__0__Impl1628); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__0__Impl


    // $ANTLR start rule__Application__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:793:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:797:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:798:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__11659);
            rule__Application__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__11662);
            rule__Application__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__1


    // $ANTLR start rule__Application__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:805:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:809:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:810:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:810:1: ( ( rule__Application__NameAssignment_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:811:1: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:812:1: ( rule__Application__NameAssignment_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:812:2: rule__Application__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl1689);
            rule__Application__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__1__Impl


    // $ANTLR start rule__Application__Group__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:822:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:826:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:827:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__21719);
            rule__Application__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__21722);
            rule__Application__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__2


    // $ANTLR start rule__Application__Group__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:834:1: rule__Application__Group__2__Impl : ( ( rule__Application__PackageAssignment_2 )? ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:838:1: ( ( ( rule__Application__PackageAssignment_2 )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:839:1: ( ( rule__Application__PackageAssignment_2 )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:839:1: ( ( rule__Application__PackageAssignment_2 )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:840:1: ( rule__Application__PackageAssignment_2 )?
            {
             before(grammarAccess.getApplicationAccess().getPackageAssignment_2()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:841:1: ( rule__Application__PackageAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:841:2: rule__Application__PackageAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Application__PackageAssignment_2_in_rule__Application__Group__2__Impl1749);
                    rule__Application__PackageAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getPackageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__2__Impl


    // $ANTLR start rule__Application__Group__3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:851:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:855:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:856:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__31780);
            rule__Application__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__4_in_rule__Application__Group__31783);
            rule__Application__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__3


    // $ANTLR start rule__Application__Group__3__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:863:1: rule__Application__Group__3__Impl : ( '{' ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:867:1: ( ( '{' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:868:1: ( '{' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:868:1: ( '{' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:869:1: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Application__Group__3__Impl1811); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__3__Impl


    // $ANTLR start rule__Application__Group__4
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:882:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:886:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:887:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__41842);
            rule__Application__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__5_in_rule__Application__Group__41845);
            rule__Application__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__4


    // $ANTLR start rule__Application__Group__4__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:894:1: rule__Application__Group__4__Impl : ( ( rule__Application__ManifestAssignment_4 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:898:1: ( ( ( rule__Application__ManifestAssignment_4 )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:899:1: ( ( rule__Application__ManifestAssignment_4 )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:899:1: ( ( rule__Application__ManifestAssignment_4 )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:900:1: ( rule__Application__ManifestAssignment_4 )?
            {
             before(grammarAccess.getApplicationAccess().getManifestAssignment_4()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:901:1: ( rule__Application__ManifestAssignment_4 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:901:2: rule__Application__ManifestAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Application__ManifestAssignment_4_in_rule__Application__Group__4__Impl1872);
                    rule__Application__ManifestAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getManifestAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__4__Impl


    // $ANTLR start rule__Application__Group__5
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:911:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:915:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:916:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__51903);
            rule__Application__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__6_in_rule__Application__Group__51906);
            rule__Application__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__5


    // $ANTLR start rule__Application__Group__5__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:923:1: rule__Application__Group__5__Impl : ( ( rule__Application__LayoutsAssignment_5 )* ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:927:1: ( ( ( rule__Application__LayoutsAssignment_5 )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:928:1: ( ( rule__Application__LayoutsAssignment_5 )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:928:1: ( ( rule__Application__LayoutsAssignment_5 )* )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:929:1: ( rule__Application__LayoutsAssignment_5 )*
            {
             before(grammarAccess.getApplicationAccess().getLayoutsAssignment_5()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:930:1: ( rule__Application__LayoutsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:930:2: rule__Application__LayoutsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Application__LayoutsAssignment_5_in_rule__Application__Group__5__Impl1933);
            	    rule__Application__LayoutsAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getLayoutsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__5__Impl


    // $ANTLR start rule__Application__Group__6
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:940:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:944:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:945:2: rule__Application__Group__6__Impl rule__Application__Group__7
            {
            pushFollow(FOLLOW_rule__Application__Group__6__Impl_in_rule__Application__Group__61964);
            rule__Application__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__7_in_rule__Application__Group__61967);
            rule__Application__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__6


    // $ANTLR start rule__Application__Group__6__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:952:1: rule__Application__Group__6__Impl : ( ( ( rule__Application__ActivitiesAssignment_6 ) ) ( ( rule__Application__ActivitiesAssignment_6 )* ) ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:956:1: ( ( ( ( rule__Application__ActivitiesAssignment_6 ) ) ( ( rule__Application__ActivitiesAssignment_6 )* ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:957:1: ( ( ( rule__Application__ActivitiesAssignment_6 ) ) ( ( rule__Application__ActivitiesAssignment_6 )* ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:957:1: ( ( ( rule__Application__ActivitiesAssignment_6 ) ) ( ( rule__Application__ActivitiesAssignment_6 )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:958:1: ( ( rule__Application__ActivitiesAssignment_6 ) ) ( ( rule__Application__ActivitiesAssignment_6 )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:958:1: ( ( rule__Application__ActivitiesAssignment_6 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:959:1: ( rule__Application__ActivitiesAssignment_6 )
            {
             before(grammarAccess.getApplicationAccess().getActivitiesAssignment_6()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:960:1: ( rule__Application__ActivitiesAssignment_6 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:960:2: rule__Application__ActivitiesAssignment_6
            {
            pushFollow(FOLLOW_rule__Application__ActivitiesAssignment_6_in_rule__Application__Group__6__Impl1996);
            rule__Application__ActivitiesAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getActivitiesAssignment_6()); 

            }

            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:963:1: ( ( rule__Application__ActivitiesAssignment_6 )* )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:964:1: ( rule__Application__ActivitiesAssignment_6 )*
            {
             before(grammarAccess.getApplicationAccess().getActivitiesAssignment_6()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:965:1: ( rule__Application__ActivitiesAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=28 && LA7_0<=29)||LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:965:2: rule__Application__ActivitiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Application__ActivitiesAssignment_6_in_rule__Application__Group__6__Impl2008);
            	    rule__Application__ActivitiesAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getActivitiesAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__6__Impl


    // $ANTLR start rule__Application__Group__7
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:976:1: rule__Application__Group__7 : rule__Application__Group__7__Impl ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:980:1: ( rule__Application__Group__7__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:981:2: rule__Application__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group__7__Impl_in_rule__Application__Group__72041);
            rule__Application__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__7


    // $ANTLR start rule__Application__Group__7__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:987:1: rule__Application__Group__7__Impl : ( '}' ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:991:1: ( ( '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:992:1: ( '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:992:1: ( '}' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:993:1: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__Application__Group__7__Impl2069); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__7__Impl


    // $ANTLR start rule__ManifestFile__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1022:1: rule__ManifestFile__Group__0 : rule__ManifestFile__Group__0__Impl rule__ManifestFile__Group__1 ;
    public final void rule__ManifestFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1026:1: ( rule__ManifestFile__Group__0__Impl rule__ManifestFile__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1027:2: rule__ManifestFile__Group__0__Impl rule__ManifestFile__Group__1
            {
            pushFollow(FOLLOW_rule__ManifestFile__Group__0__Impl_in_rule__ManifestFile__Group__02116);
            rule__ManifestFile__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ManifestFile__Group__1_in_rule__ManifestFile__Group__02119);
            rule__ManifestFile__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ManifestFile__Group__0


    // $ANTLR start rule__ManifestFile__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1034:1: rule__ManifestFile__Group__0__Impl : ( () ) ;
    public final void rule__ManifestFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1038:1: ( ( () ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1039:1: ( () )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1039:1: ( () )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1040:1: ()
            {
             before(grammarAccess.getManifestFileAccess().getManifestFileAction_0()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1041:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1043:1: 
            {
            }

             after(grammarAccess.getManifestFileAccess().getManifestFileAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ManifestFile__Group__0__Impl


    // $ANTLR start rule__ManifestFile__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1053:1: rule__ManifestFile__Group__1 : rule__ManifestFile__Group__1__Impl rule__ManifestFile__Group__2 ;
    public final void rule__ManifestFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1057:1: ( rule__ManifestFile__Group__1__Impl rule__ManifestFile__Group__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1058:2: rule__ManifestFile__Group__1__Impl rule__ManifestFile__Group__2
            {
            pushFollow(FOLLOW_rule__ManifestFile__Group__1__Impl_in_rule__ManifestFile__Group__12177);
            rule__ManifestFile__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ManifestFile__Group__2_in_rule__ManifestFile__Group__12180);
            rule__ManifestFile__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ManifestFile__Group__1


    // $ANTLR start rule__ManifestFile__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1065:1: rule__ManifestFile__Group__1__Impl : ( 'manifest' ) ;
    public final void rule__ManifestFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1069:1: ( ( 'manifest' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1070:1: ( 'manifest' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1070:1: ( 'manifest' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1071:1: 'manifest'
            {
             before(grammarAccess.getManifestFileAccess().getManifestKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__ManifestFile__Group__1__Impl2208); 
             after(grammarAccess.getManifestFileAccess().getManifestKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ManifestFile__Group__1__Impl


    // $ANTLR start rule__ManifestFile__Group__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1084:1: rule__ManifestFile__Group__2 : rule__ManifestFile__Group__2__Impl rule__ManifestFile__Group__3 ;
    public final void rule__ManifestFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1088:1: ( rule__ManifestFile__Group__2__Impl rule__ManifestFile__Group__3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1089:2: rule__ManifestFile__Group__2__Impl rule__ManifestFile__Group__3
            {
            pushFollow(FOLLOW_rule__ManifestFile__Group__2__Impl_in_rule__ManifestFile__Group__22239);
            rule__ManifestFile__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ManifestFile__Group__3_in_rule__ManifestFile__Group__22242);
            rule__ManifestFile__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ManifestFile__Group__2


    // $ANTLR start rule__ManifestFile__Group__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1096:1: rule__ManifestFile__Group__2__Impl : ( '{' ) ;
    public final void rule__ManifestFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1100:1: ( ( '{' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1101:1: ( '{' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1101:1: ( '{' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1102:1: '{'
            {
             before(grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__ManifestFile__Group__2__Impl2270); 
             after(grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ManifestFile__Group__2__Impl


    // $ANTLR start rule__ManifestFile__Group__3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1115:1: rule__ManifestFile__Group__3 : rule__ManifestFile__Group__3__Impl ;
    public final void rule__ManifestFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1119:1: ( rule__ManifestFile__Group__3__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1120:2: rule__ManifestFile__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ManifestFile__Group__3__Impl_in_rule__ManifestFile__Group__32301);
            rule__ManifestFile__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ManifestFile__Group__3


    // $ANTLR start rule__ManifestFile__Group__3__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1126:1: rule__ManifestFile__Group__3__Impl : ( '}' ) ;
    public final void rule__ManifestFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1130:1: ( ( '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1131:1: ( '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1131:1: ( '}' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1132:1: '}'
            {
             before(grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__ManifestFile__Group__3__Impl2329); 
             after(grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ManifestFile__Group__3__Impl


    // $ANTLR start rule__Layout__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1153:1: rule__Layout__Group__0 : rule__Layout__Group__0__Impl rule__Layout__Group__1 ;
    public final void rule__Layout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1157:1: ( rule__Layout__Group__0__Impl rule__Layout__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1158:2: rule__Layout__Group__0__Impl rule__Layout__Group__1
            {
            pushFollow(FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__02368);
            rule__Layout__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__02371);
            rule__Layout__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Layout__Group__0


    // $ANTLR start rule__Layout__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1165:1: rule__Layout__Group__0__Impl : ( 'layout' ) ;
    public final void rule__Layout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1169:1: ( ( 'layout' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1170:1: ( 'layout' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1170:1: ( 'layout' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1171:1: 'layout'
            {
             before(grammarAccess.getLayoutAccess().getLayoutKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Layout__Group__0__Impl2399); 
             after(grammarAccess.getLayoutAccess().getLayoutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Layout__Group__0__Impl


    // $ANTLR start rule__Layout__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1184:1: rule__Layout__Group__1 : rule__Layout__Group__1__Impl rule__Layout__Group__2 ;
    public final void rule__Layout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1188:1: ( rule__Layout__Group__1__Impl rule__Layout__Group__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1189:2: rule__Layout__Group__1__Impl rule__Layout__Group__2
            {
            pushFollow(FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__12430);
            rule__Layout__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__12433);
            rule__Layout__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Layout__Group__1


    // $ANTLR start rule__Layout__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1196:1: rule__Layout__Group__1__Impl : ( ( rule__Layout__NameAssignment_1 ) ) ;
    public final void rule__Layout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1200:1: ( ( ( rule__Layout__NameAssignment_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1201:1: ( ( rule__Layout__NameAssignment_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1201:1: ( ( rule__Layout__NameAssignment_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1202:1: ( rule__Layout__NameAssignment_1 )
            {
             before(grammarAccess.getLayoutAccess().getNameAssignment_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1203:1: ( rule__Layout__NameAssignment_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1203:2: rule__Layout__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Layout__NameAssignment_1_in_rule__Layout__Group__1__Impl2460);
            rule__Layout__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLayoutAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Layout__Group__1__Impl


    // $ANTLR start rule__Layout__Group__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1213:1: rule__Layout__Group__2 : rule__Layout__Group__2__Impl rule__Layout__Group__3 ;
    public final void rule__Layout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1217:1: ( rule__Layout__Group__2__Impl rule__Layout__Group__3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1218:2: rule__Layout__Group__2__Impl rule__Layout__Group__3
            {
            pushFollow(FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__22490);
            rule__Layout__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Layout__Group__3_in_rule__Layout__Group__22493);
            rule__Layout__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Layout__Group__2


    // $ANTLR start rule__Layout__Group__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1225:1: rule__Layout__Group__2__Impl : ( '{' ) ;
    public final void rule__Layout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1229:1: ( ( '{' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1230:1: ( '{' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1230:1: ( '{' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1231:1: '{'
            {
             before(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Layout__Group__2__Impl2521); 
             after(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Layout__Group__2__Impl


    // $ANTLR start rule__Layout__Group__3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1244:1: rule__Layout__Group__3 : rule__Layout__Group__3__Impl rule__Layout__Group__4 ;
    public final void rule__Layout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1248:1: ( rule__Layout__Group__3__Impl rule__Layout__Group__4 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1249:2: rule__Layout__Group__3__Impl rule__Layout__Group__4
            {
            pushFollow(FOLLOW_rule__Layout__Group__3__Impl_in_rule__Layout__Group__32552);
            rule__Layout__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Layout__Group__4_in_rule__Layout__Group__32555);
            rule__Layout__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Layout__Group__3


    // $ANTLR start rule__Layout__Group__3__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1256:1: rule__Layout__Group__3__Impl : ( ( rule__Layout__WidgetsAssignment_3 )* ) ;
    public final void rule__Layout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1260:1: ( ( ( rule__Layout__WidgetsAssignment_3 )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1261:1: ( ( rule__Layout__WidgetsAssignment_3 )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1261:1: ( ( rule__Layout__WidgetsAssignment_3 )* )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1262:1: ( rule__Layout__WidgetsAssignment_3 )*
            {
             before(grammarAccess.getLayoutAccess().getWidgetsAssignment_3()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1263:1: ( rule__Layout__WidgetsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21||(LA8_0>=24 && LA8_0<=27)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1263:2: rule__Layout__WidgetsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Layout__WidgetsAssignment_3_in_rule__Layout__Group__3__Impl2582);
            	    rule__Layout__WidgetsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLayoutAccess().getWidgetsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Layout__Group__3__Impl


    // $ANTLR start rule__Layout__Group__4
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1273:1: rule__Layout__Group__4 : rule__Layout__Group__4__Impl ;
    public final void rule__Layout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1277:1: ( rule__Layout__Group__4__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1278:2: rule__Layout__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Layout__Group__4__Impl_in_rule__Layout__Group__42613);
            rule__Layout__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Layout__Group__4


    // $ANTLR start rule__Layout__Group__4__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1284:1: rule__Layout__Group__4__Impl : ( '}' ) ;
    public final void rule__Layout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1288:1: ( ( '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1289:1: ( '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1289:1: ( '}' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1290:1: '}'
            {
             before(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Layout__Group__4__Impl2641); 
             after(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Layout__Group__4__Impl


    // $ANTLR start rule__Widget__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1313:1: rule__Widget__Group__0 : rule__Widget__Group__0__Impl rule__Widget__Group__1 ;
    public final void rule__Widget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1317:1: ( rule__Widget__Group__0__Impl rule__Widget__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1318:2: rule__Widget__Group__0__Impl rule__Widget__Group__1
            {
            pushFollow(FOLLOW_rule__Widget__Group__0__Impl_in_rule__Widget__Group__02682);
            rule__Widget__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Widget__Group__1_in_rule__Widget__Group__02685);
            rule__Widget__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group__0


    // $ANTLR start rule__Widget__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1325:1: rule__Widget__Group__0__Impl : ( ( rule__Widget__Alternatives_0 ) ) ;
    public final void rule__Widget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1329:1: ( ( ( rule__Widget__Alternatives_0 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1330:1: ( ( rule__Widget__Alternatives_0 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1330:1: ( ( rule__Widget__Alternatives_0 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1331:1: ( rule__Widget__Alternatives_0 )
            {
             before(grammarAccess.getWidgetAccess().getAlternatives_0()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1332:1: ( rule__Widget__Alternatives_0 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1332:2: rule__Widget__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Widget__Alternatives_0_in_rule__Widget__Group__0__Impl2712);
            rule__Widget__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getWidgetAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group__0__Impl


    // $ANTLR start rule__Widget__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1342:1: rule__Widget__Group__1 : rule__Widget__Group__1__Impl rule__Widget__Group__2 ;
    public final void rule__Widget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1346:1: ( rule__Widget__Group__1__Impl rule__Widget__Group__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1347:2: rule__Widget__Group__1__Impl rule__Widget__Group__2
            {
            pushFollow(FOLLOW_rule__Widget__Group__1__Impl_in_rule__Widget__Group__12742);
            rule__Widget__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Widget__Group__2_in_rule__Widget__Group__12745);
            rule__Widget__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group__1


    // $ANTLR start rule__Widget__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1354:1: rule__Widget__Group__1__Impl : ( ( rule__Widget__Group_1__0 )? ) ;
    public final void rule__Widget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1358:1: ( ( ( rule__Widget__Group_1__0 )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1359:1: ( ( rule__Widget__Group_1__0 )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1359:1: ( ( rule__Widget__Group_1__0 )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1360:1: ( rule__Widget__Group_1__0 )?
            {
             before(grammarAccess.getWidgetAccess().getGroup_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1361:1: ( rule__Widget__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1361:2: rule__Widget__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Widget__Group_1__0_in_rule__Widget__Group__1__Impl2772);
                    rule__Widget__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWidgetAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group__1__Impl


    // $ANTLR start rule__Widget__Group__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1371:1: rule__Widget__Group__2 : rule__Widget__Group__2__Impl rule__Widget__Group__3 ;
    public final void rule__Widget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1375:1: ( rule__Widget__Group__2__Impl rule__Widget__Group__3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1376:2: rule__Widget__Group__2__Impl rule__Widget__Group__3
            {
            pushFollow(FOLLOW_rule__Widget__Group__2__Impl_in_rule__Widget__Group__22803);
            rule__Widget__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Widget__Group__3_in_rule__Widget__Group__22806);
            rule__Widget__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group__2


    // $ANTLR start rule__Widget__Group__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1383:1: rule__Widget__Group__2__Impl : ( ( rule__Widget__Group_2__0 )? ) ;
    public final void rule__Widget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1387:1: ( ( ( rule__Widget__Group_2__0 )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1388:1: ( ( rule__Widget__Group_2__0 )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1388:1: ( ( rule__Widget__Group_2__0 )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1389:1: ( rule__Widget__Group_2__0 )?
            {
             before(grammarAccess.getWidgetAccess().getGroup_2()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1390:1: ( rule__Widget__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1390:2: rule__Widget__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Widget__Group_2__0_in_rule__Widget__Group__2__Impl2833);
                    rule__Widget__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWidgetAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group__2__Impl


    // $ANTLR start rule__Widget__Group__3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1400:1: rule__Widget__Group__3 : rule__Widget__Group__3__Impl rule__Widget__Group__4 ;
    public final void rule__Widget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1404:1: ( rule__Widget__Group__3__Impl rule__Widget__Group__4 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1405:2: rule__Widget__Group__3__Impl rule__Widget__Group__4
            {
            pushFollow(FOLLOW_rule__Widget__Group__3__Impl_in_rule__Widget__Group__32864);
            rule__Widget__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Widget__Group__4_in_rule__Widget__Group__32867);
            rule__Widget__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group__3


    // $ANTLR start rule__Widget__Group__3__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1412:1: rule__Widget__Group__3__Impl : ( ( rule__Widget__Group_3__0 )? ) ;
    public final void rule__Widget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1416:1: ( ( ( rule__Widget__Group_3__0 )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1417:1: ( ( rule__Widget__Group_3__0 )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1417:1: ( ( rule__Widget__Group_3__0 )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1418:1: ( rule__Widget__Group_3__0 )?
            {
             before(grammarAccess.getWidgetAccess().getGroup_3()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1419:1: ( rule__Widget__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1419:2: rule__Widget__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Widget__Group_3__0_in_rule__Widget__Group__3__Impl2894);
                    rule__Widget__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWidgetAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group__3__Impl


    // $ANTLR start rule__Widget__Group__4
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1429:1: rule__Widget__Group__4 : rule__Widget__Group__4__Impl ;
    public final void rule__Widget__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1433:1: ( rule__Widget__Group__4__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1434:2: rule__Widget__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Widget__Group__4__Impl_in_rule__Widget__Group__42925);
            rule__Widget__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group__4


    // $ANTLR start rule__Widget__Group__4__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1440:1: rule__Widget__Group__4__Impl : ( ( rule__Widget__Group_4__0 )* ) ;
    public final void rule__Widget__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1444:1: ( ( ( rule__Widget__Group_4__0 )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1445:1: ( ( rule__Widget__Group_4__0 )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1445:1: ( ( rule__Widget__Group_4__0 )* )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1446:1: ( rule__Widget__Group_4__0 )*
            {
             before(grammarAccess.getWidgetAccess().getGroup_4()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1447:1: ( rule__Widget__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1447:2: rule__Widget__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Widget__Group_4__0_in_rule__Widget__Group__4__Impl2952);
            	    rule__Widget__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getWidgetAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group__4__Impl


    // $ANTLR start rule__Widget__Group_1__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1467:1: rule__Widget__Group_1__0 : rule__Widget__Group_1__0__Impl rule__Widget__Group_1__1 ;
    public final void rule__Widget__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1471:1: ( rule__Widget__Group_1__0__Impl rule__Widget__Group_1__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1472:2: rule__Widget__Group_1__0__Impl rule__Widget__Group_1__1
            {
            pushFollow(FOLLOW_rule__Widget__Group_1__0__Impl_in_rule__Widget__Group_1__02993);
            rule__Widget__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Widget__Group_1__1_in_rule__Widget__Group_1__02996);
            rule__Widget__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_1__0


    // $ANTLR start rule__Widget__Group_1__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1479:1: rule__Widget__Group_1__0__Impl : ( 'top' ) ;
    public final void rule__Widget__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1483:1: ( ( 'top' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1484:1: ( 'top' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1484:1: ( 'top' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1485:1: 'top'
            {
             before(grammarAccess.getWidgetAccess().getTopKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Widget__Group_1__0__Impl3024); 
             after(grammarAccess.getWidgetAccess().getTopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_1__0__Impl


    // $ANTLR start rule__Widget__Group_1__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1498:1: rule__Widget__Group_1__1 : rule__Widget__Group_1__1__Impl rule__Widget__Group_1__2 ;
    public final void rule__Widget__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1502:1: ( rule__Widget__Group_1__1__Impl rule__Widget__Group_1__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1503:2: rule__Widget__Group_1__1__Impl rule__Widget__Group_1__2
            {
            pushFollow(FOLLOW_rule__Widget__Group_1__1__Impl_in_rule__Widget__Group_1__13055);
            rule__Widget__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Widget__Group_1__2_in_rule__Widget__Group_1__13058);
            rule__Widget__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_1__1


    // $ANTLR start rule__Widget__Group_1__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1510:1: rule__Widget__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Widget__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1514:1: ( ( '=' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1515:1: ( '=' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1515:1: ( '=' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1516:1: '='
            {
             before(grammarAccess.getWidgetAccess().getEqualsSignKeyword_1_1()); 
            match(input,17,FOLLOW_17_in_rule__Widget__Group_1__1__Impl3086); 
             after(grammarAccess.getWidgetAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_1__1__Impl


    // $ANTLR start rule__Widget__Group_1__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1529:1: rule__Widget__Group_1__2 : rule__Widget__Group_1__2__Impl ;
    public final void rule__Widget__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1533:1: ( rule__Widget__Group_1__2__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1534:2: rule__Widget__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Widget__Group_1__2__Impl_in_rule__Widget__Group_1__23117);
            rule__Widget__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_1__2


    // $ANTLR start rule__Widget__Group_1__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1540:1: rule__Widget__Group_1__2__Impl : ( ( rule__Widget__TopAssignment_1_2 ) ) ;
    public final void rule__Widget__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1544:1: ( ( ( rule__Widget__TopAssignment_1_2 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1545:1: ( ( rule__Widget__TopAssignment_1_2 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1545:1: ( ( rule__Widget__TopAssignment_1_2 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1546:1: ( rule__Widget__TopAssignment_1_2 )
            {
             before(grammarAccess.getWidgetAccess().getTopAssignment_1_2()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1547:1: ( rule__Widget__TopAssignment_1_2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1547:2: rule__Widget__TopAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Widget__TopAssignment_1_2_in_rule__Widget__Group_1__2__Impl3144);
            rule__Widget__TopAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getWidgetAccess().getTopAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_1__2__Impl


    // $ANTLR start rule__Widget__Group_2__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1563:1: rule__Widget__Group_2__0 : rule__Widget__Group_2__0__Impl rule__Widget__Group_2__1 ;
    public final void rule__Widget__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1567:1: ( rule__Widget__Group_2__0__Impl rule__Widget__Group_2__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1568:2: rule__Widget__Group_2__0__Impl rule__Widget__Group_2__1
            {
            pushFollow(FOLLOW_rule__Widget__Group_2__0__Impl_in_rule__Widget__Group_2__03180);
            rule__Widget__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Widget__Group_2__1_in_rule__Widget__Group_2__03183);
            rule__Widget__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_2__0


    // $ANTLR start rule__Widget__Group_2__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1575:1: rule__Widget__Group_2__0__Impl : ( 'left' ) ;
    public final void rule__Widget__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1579:1: ( ( 'left' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1580:1: ( 'left' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1580:1: ( 'left' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1581:1: 'left'
            {
             before(grammarAccess.getWidgetAccess().getLeftKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__Widget__Group_2__0__Impl3211); 
             after(grammarAccess.getWidgetAccess().getLeftKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_2__0__Impl


    // $ANTLR start rule__Widget__Group_2__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1594:1: rule__Widget__Group_2__1 : rule__Widget__Group_2__1__Impl rule__Widget__Group_2__2 ;
    public final void rule__Widget__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1598:1: ( rule__Widget__Group_2__1__Impl rule__Widget__Group_2__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1599:2: rule__Widget__Group_2__1__Impl rule__Widget__Group_2__2
            {
            pushFollow(FOLLOW_rule__Widget__Group_2__1__Impl_in_rule__Widget__Group_2__13242);
            rule__Widget__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Widget__Group_2__2_in_rule__Widget__Group_2__13245);
            rule__Widget__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_2__1


    // $ANTLR start rule__Widget__Group_2__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1606:1: rule__Widget__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Widget__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1610:1: ( ( '=' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1611:1: ( '=' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1611:1: ( '=' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1612:1: '='
            {
             before(grammarAccess.getWidgetAccess().getEqualsSignKeyword_2_1()); 
            match(input,17,FOLLOW_17_in_rule__Widget__Group_2__1__Impl3273); 
             after(grammarAccess.getWidgetAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_2__1__Impl


    // $ANTLR start rule__Widget__Group_2__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1625:1: rule__Widget__Group_2__2 : rule__Widget__Group_2__2__Impl ;
    public final void rule__Widget__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1629:1: ( rule__Widget__Group_2__2__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1630:2: rule__Widget__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Widget__Group_2__2__Impl_in_rule__Widget__Group_2__23304);
            rule__Widget__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_2__2


    // $ANTLR start rule__Widget__Group_2__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1636:1: rule__Widget__Group_2__2__Impl : ( ( rule__Widget__LeftAssignment_2_2 ) ) ;
    public final void rule__Widget__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1640:1: ( ( ( rule__Widget__LeftAssignment_2_2 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1641:1: ( ( rule__Widget__LeftAssignment_2_2 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1641:1: ( ( rule__Widget__LeftAssignment_2_2 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1642:1: ( rule__Widget__LeftAssignment_2_2 )
            {
             before(grammarAccess.getWidgetAccess().getLeftAssignment_2_2()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1643:1: ( rule__Widget__LeftAssignment_2_2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1643:2: rule__Widget__LeftAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Widget__LeftAssignment_2_2_in_rule__Widget__Group_2__2__Impl3331);
            rule__Widget__LeftAssignment_2_2();
            _fsp--;


            }

             after(grammarAccess.getWidgetAccess().getLeftAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_2__2__Impl


    // $ANTLR start rule__Widget__Group_3__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1659:1: rule__Widget__Group_3__0 : rule__Widget__Group_3__0__Impl rule__Widget__Group_3__1 ;
    public final void rule__Widget__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1663:1: ( rule__Widget__Group_3__0__Impl rule__Widget__Group_3__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1664:2: rule__Widget__Group_3__0__Impl rule__Widget__Group_3__1
            {
            pushFollow(FOLLOW_rule__Widget__Group_3__0__Impl_in_rule__Widget__Group_3__03367);
            rule__Widget__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Widget__Group_3__1_in_rule__Widget__Group_3__03370);
            rule__Widget__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_3__0


    // $ANTLR start rule__Widget__Group_3__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1671:1: rule__Widget__Group_3__0__Impl : ( 'width' ) ;
    public final void rule__Widget__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1675:1: ( ( 'width' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1676:1: ( 'width' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1676:1: ( 'width' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1677:1: 'width'
            {
             before(grammarAccess.getWidgetAccess().getWidthKeyword_3_0()); 
            match(input,19,FOLLOW_19_in_rule__Widget__Group_3__0__Impl3398); 
             after(grammarAccess.getWidgetAccess().getWidthKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_3__0__Impl


    // $ANTLR start rule__Widget__Group_3__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1690:1: rule__Widget__Group_3__1 : rule__Widget__Group_3__1__Impl rule__Widget__Group_3__2 ;
    public final void rule__Widget__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1694:1: ( rule__Widget__Group_3__1__Impl rule__Widget__Group_3__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1695:2: rule__Widget__Group_3__1__Impl rule__Widget__Group_3__2
            {
            pushFollow(FOLLOW_rule__Widget__Group_3__1__Impl_in_rule__Widget__Group_3__13429);
            rule__Widget__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Widget__Group_3__2_in_rule__Widget__Group_3__13432);
            rule__Widget__Group_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_3__1


    // $ANTLR start rule__Widget__Group_3__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1702:1: rule__Widget__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Widget__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1706:1: ( ( '=' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1707:1: ( '=' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1707:1: ( '=' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1708:1: '='
            {
             before(grammarAccess.getWidgetAccess().getEqualsSignKeyword_3_1()); 
            match(input,17,FOLLOW_17_in_rule__Widget__Group_3__1__Impl3460); 
             after(grammarAccess.getWidgetAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_3__1__Impl


    // $ANTLR start rule__Widget__Group_3__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1721:1: rule__Widget__Group_3__2 : rule__Widget__Group_3__2__Impl ;
    public final void rule__Widget__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1725:1: ( rule__Widget__Group_3__2__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1726:2: rule__Widget__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Widget__Group_3__2__Impl_in_rule__Widget__Group_3__23491);
            rule__Widget__Group_3__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_3__2


    // $ANTLR start rule__Widget__Group_3__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1732:1: rule__Widget__Group_3__2__Impl : ( ( rule__Widget__WidthAssignment_3_2 ) ) ;
    public final void rule__Widget__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1736:1: ( ( ( rule__Widget__WidthAssignment_3_2 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1737:1: ( ( rule__Widget__WidthAssignment_3_2 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1737:1: ( ( rule__Widget__WidthAssignment_3_2 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1738:1: ( rule__Widget__WidthAssignment_3_2 )
            {
             before(grammarAccess.getWidgetAccess().getWidthAssignment_3_2()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1739:1: ( rule__Widget__WidthAssignment_3_2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1739:2: rule__Widget__WidthAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Widget__WidthAssignment_3_2_in_rule__Widget__Group_3__2__Impl3518);
            rule__Widget__WidthAssignment_3_2();
            _fsp--;


            }

             after(grammarAccess.getWidgetAccess().getWidthAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_3__2__Impl


    // $ANTLR start rule__Widget__Group_4__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1755:1: rule__Widget__Group_4__0 : rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1 ;
    public final void rule__Widget__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1759:1: ( rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1760:2: rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1
            {
            pushFollow(FOLLOW_rule__Widget__Group_4__0__Impl_in_rule__Widget__Group_4__03554);
            rule__Widget__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Widget__Group_4__1_in_rule__Widget__Group_4__03557);
            rule__Widget__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_4__0


    // $ANTLR start rule__Widget__Group_4__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1767:1: rule__Widget__Group_4__0__Impl : ( '->' ) ;
    public final void rule__Widget__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1771:1: ( ( '->' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1772:1: ( '->' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1772:1: ( '->' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1773:1: '->'
            {
             before(grammarAccess.getWidgetAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
            match(input,20,FOLLOW_20_in_rule__Widget__Group_4__0__Impl3585); 
             after(grammarAccess.getWidgetAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_4__0__Impl


    // $ANTLR start rule__Widget__Group_4__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1786:1: rule__Widget__Group_4__1 : rule__Widget__Group_4__1__Impl ;
    public final void rule__Widget__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1790:1: ( rule__Widget__Group_4__1__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1791:2: rule__Widget__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Widget__Group_4__1__Impl_in_rule__Widget__Group_4__13616);
            rule__Widget__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_4__1


    // $ANTLR start rule__Widget__Group_4__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1797:1: rule__Widget__Group_4__1__Impl : ( ( rule__Widget__ActionsAssignment_4_1 ) ) ;
    public final void rule__Widget__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1801:1: ( ( ( rule__Widget__ActionsAssignment_4_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1802:1: ( ( rule__Widget__ActionsAssignment_4_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1802:1: ( ( rule__Widget__ActionsAssignment_4_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1803:1: ( rule__Widget__ActionsAssignment_4_1 )
            {
             before(grammarAccess.getWidgetAccess().getActionsAssignment_4_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1804:1: ( rule__Widget__ActionsAssignment_4_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1804:2: rule__Widget__ActionsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Widget__ActionsAssignment_4_1_in_rule__Widget__Group_4__1__Impl3643);
            rule__Widget__ActionsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getWidgetAccess().getActionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Group_4__1__Impl


    // $ANTLR start rule__GenericWidget__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1818:1: rule__GenericWidget__Group__0 : rule__GenericWidget__Group__0__Impl rule__GenericWidget__Group__1 ;
    public final void rule__GenericWidget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1822:1: ( rule__GenericWidget__Group__0__Impl rule__GenericWidget__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1823:2: rule__GenericWidget__Group__0__Impl rule__GenericWidget__Group__1
            {
            pushFollow(FOLLOW_rule__GenericWidget__Group__0__Impl_in_rule__GenericWidget__Group__03677);
            rule__GenericWidget__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GenericWidget__Group__1_in_rule__GenericWidget__Group__03680);
            rule__GenericWidget__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__Group__0


    // $ANTLR start rule__GenericWidget__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1830:1: rule__GenericWidget__Group__0__Impl : ( 'widget' ) ;
    public final void rule__GenericWidget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1834:1: ( ( 'widget' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1835:1: ( 'widget' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1835:1: ( 'widget' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1836:1: 'widget'
            {
             before(grammarAccess.getGenericWidgetAccess().getWidgetKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__GenericWidget__Group__0__Impl3708); 
             after(grammarAccess.getGenericWidgetAccess().getWidgetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__Group__0__Impl


    // $ANTLR start rule__GenericWidget__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1849:1: rule__GenericWidget__Group__1 : rule__GenericWidget__Group__1__Impl rule__GenericWidget__Group__2 ;
    public final void rule__GenericWidget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1853:1: ( rule__GenericWidget__Group__1__Impl rule__GenericWidget__Group__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1854:2: rule__GenericWidget__Group__1__Impl rule__GenericWidget__Group__2
            {
            pushFollow(FOLLOW_rule__GenericWidget__Group__1__Impl_in_rule__GenericWidget__Group__13739);
            rule__GenericWidget__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GenericWidget__Group__2_in_rule__GenericWidget__Group__13742);
            rule__GenericWidget__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__Group__1


    // $ANTLR start rule__GenericWidget__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1861:1: rule__GenericWidget__Group__1__Impl : ( () ) ;
    public final void rule__GenericWidget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1865:1: ( ( () ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1866:1: ( () )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1866:1: ( () )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1867:1: ()
            {
             before(grammarAccess.getGenericWidgetAccess().getGenericWidgetAction_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1868:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1870:1: 
            {
            }

             after(grammarAccess.getGenericWidgetAccess().getGenericWidgetAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__Group__1__Impl


    // $ANTLR start rule__GenericWidget__Group__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1880:1: rule__GenericWidget__Group__2 : rule__GenericWidget__Group__2__Impl rule__GenericWidget__Group__3 ;
    public final void rule__GenericWidget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1884:1: ( rule__GenericWidget__Group__2__Impl rule__GenericWidget__Group__3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1885:2: rule__GenericWidget__Group__2__Impl rule__GenericWidget__Group__3
            {
            pushFollow(FOLLOW_rule__GenericWidget__Group__2__Impl_in_rule__GenericWidget__Group__23800);
            rule__GenericWidget__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GenericWidget__Group__3_in_rule__GenericWidget__Group__23803);
            rule__GenericWidget__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__Group__2


    // $ANTLR start rule__GenericWidget__Group__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1892:1: rule__GenericWidget__Group__2__Impl : ( ( rule__GenericWidget__Group_2__0 )? ) ;
    public final void rule__GenericWidget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1896:1: ( ( ( rule__GenericWidget__Group_2__0 )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1897:1: ( ( rule__GenericWidget__Group_2__0 )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1897:1: ( ( rule__GenericWidget__Group_2__0 )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1898:1: ( rule__GenericWidget__Group_2__0 )?
            {
             before(grammarAccess.getGenericWidgetAccess().getGroup_2()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1899:1: ( rule__GenericWidget__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1899:2: rule__GenericWidget__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__GenericWidget__Group_2__0_in_rule__GenericWidget__Group__2__Impl3830);
                    rule__GenericWidget__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGenericWidgetAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__Group__2__Impl


    // $ANTLR start rule__GenericWidget__Group__3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1909:1: rule__GenericWidget__Group__3 : rule__GenericWidget__Group__3__Impl ;
    public final void rule__GenericWidget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1913:1: ( rule__GenericWidget__Group__3__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1914:2: rule__GenericWidget__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GenericWidget__Group__3__Impl_in_rule__GenericWidget__Group__33861);
            rule__GenericWidget__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__Group__3


    // $ANTLR start rule__GenericWidget__Group__3__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1920:1: rule__GenericWidget__Group__3__Impl : ( ( rule__GenericWidget__NameAssignment_3 ) ) ;
    public final void rule__GenericWidget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1924:1: ( ( ( rule__GenericWidget__NameAssignment_3 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1925:1: ( ( rule__GenericWidget__NameAssignment_3 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1925:1: ( ( rule__GenericWidget__NameAssignment_3 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1926:1: ( rule__GenericWidget__NameAssignment_3 )
            {
             before(grammarAccess.getGenericWidgetAccess().getNameAssignment_3()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1927:1: ( rule__GenericWidget__NameAssignment_3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1927:2: rule__GenericWidget__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__GenericWidget__NameAssignment_3_in_rule__GenericWidget__Group__3__Impl3888);
            rule__GenericWidget__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getGenericWidgetAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__Group__3__Impl


    // $ANTLR start rule__GenericWidget__Group_2__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1945:1: rule__GenericWidget__Group_2__0 : rule__GenericWidget__Group_2__0__Impl rule__GenericWidget__Group_2__1 ;
    public final void rule__GenericWidget__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1949:1: ( rule__GenericWidget__Group_2__0__Impl rule__GenericWidget__Group_2__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1950:2: rule__GenericWidget__Group_2__0__Impl rule__GenericWidget__Group_2__1
            {
            pushFollow(FOLLOW_rule__GenericWidget__Group_2__0__Impl_in_rule__GenericWidget__Group_2__03926);
            rule__GenericWidget__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GenericWidget__Group_2__1_in_rule__GenericWidget__Group_2__03929);
            rule__GenericWidget__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__Group_2__0


    // $ANTLR start rule__GenericWidget__Group_2__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1957:1: rule__GenericWidget__Group_2__0__Impl : ( '<' ) ;
    public final void rule__GenericWidget__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1961:1: ( ( '<' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1962:1: ( '<' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1962:1: ( '<' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1963:1: '<'
            {
             before(grammarAccess.getGenericWidgetAccess().getLessThanSignKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__GenericWidget__Group_2__0__Impl3957); 
             after(grammarAccess.getGenericWidgetAccess().getLessThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__Group_2__0__Impl


    // $ANTLR start rule__GenericWidget__Group_2__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1976:1: rule__GenericWidget__Group_2__1 : rule__GenericWidget__Group_2__1__Impl rule__GenericWidget__Group_2__2 ;
    public final void rule__GenericWidget__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1980:1: ( rule__GenericWidget__Group_2__1__Impl rule__GenericWidget__Group_2__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1981:2: rule__GenericWidget__Group_2__1__Impl rule__GenericWidget__Group_2__2
            {
            pushFollow(FOLLOW_rule__GenericWidget__Group_2__1__Impl_in_rule__GenericWidget__Group_2__13988);
            rule__GenericWidget__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GenericWidget__Group_2__2_in_rule__GenericWidget__Group_2__13991);
            rule__GenericWidget__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__Group_2__1


    // $ANTLR start rule__GenericWidget__Group_2__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1988:1: rule__GenericWidget__Group_2__1__Impl : ( ( rule__GenericWidget__IdAssignment_2_1 ) ) ;
    public final void rule__GenericWidget__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1992:1: ( ( ( rule__GenericWidget__IdAssignment_2_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1993:1: ( ( rule__GenericWidget__IdAssignment_2_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1993:1: ( ( rule__GenericWidget__IdAssignment_2_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1994:1: ( rule__GenericWidget__IdAssignment_2_1 )
            {
             before(grammarAccess.getGenericWidgetAccess().getIdAssignment_2_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1995:1: ( rule__GenericWidget__IdAssignment_2_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1995:2: rule__GenericWidget__IdAssignment_2_1
            {
            pushFollow(FOLLOW_rule__GenericWidget__IdAssignment_2_1_in_rule__GenericWidget__Group_2__1__Impl4018);
            rule__GenericWidget__IdAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getGenericWidgetAccess().getIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__Group_2__1__Impl


    // $ANTLR start rule__GenericWidget__Group_2__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2005:1: rule__GenericWidget__Group_2__2 : rule__GenericWidget__Group_2__2__Impl ;
    public final void rule__GenericWidget__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2009:1: ( rule__GenericWidget__Group_2__2__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2010:2: rule__GenericWidget__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__GenericWidget__Group_2__2__Impl_in_rule__GenericWidget__Group_2__24048);
            rule__GenericWidget__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__Group_2__2


    // $ANTLR start rule__GenericWidget__Group_2__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2016:1: rule__GenericWidget__Group_2__2__Impl : ( '>' ) ;
    public final void rule__GenericWidget__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2020:1: ( ( '>' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2021:1: ( '>' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2021:1: ( '>' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2022:1: '>'
            {
             before(grammarAccess.getGenericWidgetAccess().getGreaterThanSignKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__GenericWidget__Group_2__2__Impl4076); 
             after(grammarAccess.getGenericWidgetAccess().getGreaterThanSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__Group_2__2__Impl


    // $ANTLR start rule__Button__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2041:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2045:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2046:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__04113);
            rule__Button__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Button__Group__1_in_rule__Button__Group__04116);
            rule__Button__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group__0


    // $ANTLR start rule__Button__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2053:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2057:1: ( ( 'button' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2058:1: ( 'button' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2058:1: ( 'button' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2059:1: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Button__Group__0__Impl4144); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group__0__Impl


    // $ANTLR start rule__Button__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2072:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2076:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2077:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__14175);
            rule__Button__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Button__Group__2_in_rule__Button__Group__14178);
            rule__Button__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group__1


    // $ANTLR start rule__Button__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2084:1: rule__Button__Group__1__Impl : ( () ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2088:1: ( ( () ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2089:1: ( () )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2089:1: ( () )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2090:1: ()
            {
             before(grammarAccess.getButtonAccess().getButtonAction_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2091:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2093:1: 
            {
            }

             after(grammarAccess.getButtonAccess().getButtonAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group__1__Impl


    // $ANTLR start rule__Button__Group__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2103:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2107:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2108:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__24236);
            rule__Button__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Button__Group__3_in_rule__Button__Group__24239);
            rule__Button__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group__2


    // $ANTLR start rule__Button__Group__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2115:1: rule__Button__Group__2__Impl : ( ( rule__Button__Group_2__0 )? ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2119:1: ( ( ( rule__Button__Group_2__0 )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2120:1: ( ( rule__Button__Group_2__0 )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2120:1: ( ( rule__Button__Group_2__0 )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2121:1: ( rule__Button__Group_2__0 )?
            {
             before(grammarAccess.getButtonAccess().getGroup_2()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2122:1: ( rule__Button__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2122:2: rule__Button__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Button__Group_2__0_in_rule__Button__Group__2__Impl4266);
                    rule__Button__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group__2__Impl


    // $ANTLR start rule__Button__Group__3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2132:1: rule__Button__Group__3 : rule__Button__Group__3__Impl ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2136:1: ( rule__Button__Group__3__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2137:2: rule__Button__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__34297);
            rule__Button__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group__3


    // $ANTLR start rule__Button__Group__3__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2143:1: rule__Button__Group__3__Impl : ( ( rule__Button__LabelAssignment_3 ) ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2147:1: ( ( ( rule__Button__LabelAssignment_3 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2148:1: ( ( rule__Button__LabelAssignment_3 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2148:1: ( ( rule__Button__LabelAssignment_3 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2149:1: ( rule__Button__LabelAssignment_3 )
            {
             before(grammarAccess.getButtonAccess().getLabelAssignment_3()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2150:1: ( rule__Button__LabelAssignment_3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2150:2: rule__Button__LabelAssignment_3
            {
            pushFollow(FOLLOW_rule__Button__LabelAssignment_3_in_rule__Button__Group__3__Impl4324);
            rule__Button__LabelAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getButtonAccess().getLabelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group__3__Impl


    // $ANTLR start rule__Button__Group_2__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2168:1: rule__Button__Group_2__0 : rule__Button__Group_2__0__Impl rule__Button__Group_2__1 ;
    public final void rule__Button__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2172:1: ( rule__Button__Group_2__0__Impl rule__Button__Group_2__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2173:2: rule__Button__Group_2__0__Impl rule__Button__Group_2__1
            {
            pushFollow(FOLLOW_rule__Button__Group_2__0__Impl_in_rule__Button__Group_2__04362);
            rule__Button__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Button__Group_2__1_in_rule__Button__Group_2__04365);
            rule__Button__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group_2__0


    // $ANTLR start rule__Button__Group_2__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2180:1: rule__Button__Group_2__0__Impl : ( '<' ) ;
    public final void rule__Button__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2184:1: ( ( '<' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2185:1: ( '<' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2185:1: ( '<' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2186:1: '<'
            {
             before(grammarAccess.getButtonAccess().getLessThanSignKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Button__Group_2__0__Impl4393); 
             after(grammarAccess.getButtonAccess().getLessThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group_2__0__Impl


    // $ANTLR start rule__Button__Group_2__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2199:1: rule__Button__Group_2__1 : rule__Button__Group_2__1__Impl rule__Button__Group_2__2 ;
    public final void rule__Button__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2203:1: ( rule__Button__Group_2__1__Impl rule__Button__Group_2__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2204:2: rule__Button__Group_2__1__Impl rule__Button__Group_2__2
            {
            pushFollow(FOLLOW_rule__Button__Group_2__1__Impl_in_rule__Button__Group_2__14424);
            rule__Button__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Button__Group_2__2_in_rule__Button__Group_2__14427);
            rule__Button__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group_2__1


    // $ANTLR start rule__Button__Group_2__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2211:1: rule__Button__Group_2__1__Impl : ( ( rule__Button__IdAssignment_2_1 ) ) ;
    public final void rule__Button__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2215:1: ( ( ( rule__Button__IdAssignment_2_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2216:1: ( ( rule__Button__IdAssignment_2_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2216:1: ( ( rule__Button__IdAssignment_2_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2217:1: ( rule__Button__IdAssignment_2_1 )
            {
             before(grammarAccess.getButtonAccess().getIdAssignment_2_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2218:1: ( rule__Button__IdAssignment_2_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2218:2: rule__Button__IdAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Button__IdAssignment_2_1_in_rule__Button__Group_2__1__Impl4454);
            rule__Button__IdAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getButtonAccess().getIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group_2__1__Impl


    // $ANTLR start rule__Button__Group_2__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2228:1: rule__Button__Group_2__2 : rule__Button__Group_2__2__Impl ;
    public final void rule__Button__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2232:1: ( rule__Button__Group_2__2__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2233:2: rule__Button__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group_2__2__Impl_in_rule__Button__Group_2__24484);
            rule__Button__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group_2__2


    // $ANTLR start rule__Button__Group_2__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2239:1: rule__Button__Group_2__2__Impl : ( '>' ) ;
    public final void rule__Button__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2243:1: ( ( '>' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2244:1: ( '>' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2244:1: ( '>' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2245:1: '>'
            {
             before(grammarAccess.getButtonAccess().getGreaterThanSignKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__Button__Group_2__2__Impl4512); 
             after(grammarAccess.getButtonAccess().getGreaterThanSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group_2__2__Impl


    // $ANTLR start rule__Spinner__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2264:1: rule__Spinner__Group__0 : rule__Spinner__Group__0__Impl rule__Spinner__Group__1 ;
    public final void rule__Spinner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2268:1: ( rule__Spinner__Group__0__Impl rule__Spinner__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2269:2: rule__Spinner__Group__0__Impl rule__Spinner__Group__1
            {
            pushFollow(FOLLOW_rule__Spinner__Group__0__Impl_in_rule__Spinner__Group__04549);
            rule__Spinner__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Spinner__Group__1_in_rule__Spinner__Group__04552);
            rule__Spinner__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group__0


    // $ANTLR start rule__Spinner__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2276:1: rule__Spinner__Group__0__Impl : ( 'spinner' ) ;
    public final void rule__Spinner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2280:1: ( ( 'spinner' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2281:1: ( 'spinner' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2281:1: ( 'spinner' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2282:1: 'spinner'
            {
             before(grammarAccess.getSpinnerAccess().getSpinnerKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Spinner__Group__0__Impl4580); 
             after(grammarAccess.getSpinnerAccess().getSpinnerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group__0__Impl


    // $ANTLR start rule__Spinner__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2295:1: rule__Spinner__Group__1 : rule__Spinner__Group__1__Impl rule__Spinner__Group__2 ;
    public final void rule__Spinner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2299:1: ( rule__Spinner__Group__1__Impl rule__Spinner__Group__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2300:2: rule__Spinner__Group__1__Impl rule__Spinner__Group__2
            {
            pushFollow(FOLLOW_rule__Spinner__Group__1__Impl_in_rule__Spinner__Group__14611);
            rule__Spinner__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Spinner__Group__2_in_rule__Spinner__Group__14614);
            rule__Spinner__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group__1


    // $ANTLR start rule__Spinner__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2307:1: rule__Spinner__Group__1__Impl : ( () ) ;
    public final void rule__Spinner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2311:1: ( ( () ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2312:1: ( () )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2312:1: ( () )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2313:1: ()
            {
             before(grammarAccess.getSpinnerAccess().getSpinnerAction_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2314:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2316:1: 
            {
            }

             after(grammarAccess.getSpinnerAccess().getSpinnerAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group__1__Impl


    // $ANTLR start rule__Spinner__Group__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2326:1: rule__Spinner__Group__2 : rule__Spinner__Group__2__Impl rule__Spinner__Group__3 ;
    public final void rule__Spinner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2330:1: ( rule__Spinner__Group__2__Impl rule__Spinner__Group__3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2331:2: rule__Spinner__Group__2__Impl rule__Spinner__Group__3
            {
            pushFollow(FOLLOW_rule__Spinner__Group__2__Impl_in_rule__Spinner__Group__24672);
            rule__Spinner__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Spinner__Group__3_in_rule__Spinner__Group__24675);
            rule__Spinner__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group__2


    // $ANTLR start rule__Spinner__Group__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2338:1: rule__Spinner__Group__2__Impl : ( ( rule__Spinner__Group_2__0 )? ) ;
    public final void rule__Spinner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2342:1: ( ( ( rule__Spinner__Group_2__0 )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2343:1: ( ( rule__Spinner__Group_2__0 )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2343:1: ( ( rule__Spinner__Group_2__0 )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2344:1: ( rule__Spinner__Group_2__0 )?
            {
             before(grammarAccess.getSpinnerAccess().getGroup_2()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2345:1: ( rule__Spinner__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2345:2: rule__Spinner__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Spinner__Group_2__0_in_rule__Spinner__Group__2__Impl4702);
                    rule__Spinner__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpinnerAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group__2__Impl


    // $ANTLR start rule__Spinner__Group__3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2355:1: rule__Spinner__Group__3 : rule__Spinner__Group__3__Impl ;
    public final void rule__Spinner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2359:1: ( rule__Spinner__Group__3__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2360:2: rule__Spinner__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Spinner__Group__3__Impl_in_rule__Spinner__Group__34733);
            rule__Spinner__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group__3


    // $ANTLR start rule__Spinner__Group__3__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2366:1: rule__Spinner__Group__3__Impl : ( ( rule__Spinner__LabelAssignment_3 ) ) ;
    public final void rule__Spinner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2370:1: ( ( ( rule__Spinner__LabelAssignment_3 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2371:1: ( ( rule__Spinner__LabelAssignment_3 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2371:1: ( ( rule__Spinner__LabelAssignment_3 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2372:1: ( rule__Spinner__LabelAssignment_3 )
            {
             before(grammarAccess.getSpinnerAccess().getLabelAssignment_3()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2373:1: ( rule__Spinner__LabelAssignment_3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2373:2: rule__Spinner__LabelAssignment_3
            {
            pushFollow(FOLLOW_rule__Spinner__LabelAssignment_3_in_rule__Spinner__Group__3__Impl4760);
            rule__Spinner__LabelAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getLabelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group__3__Impl


    // $ANTLR start rule__Spinner__Group_2__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2391:1: rule__Spinner__Group_2__0 : rule__Spinner__Group_2__0__Impl rule__Spinner__Group_2__1 ;
    public final void rule__Spinner__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2395:1: ( rule__Spinner__Group_2__0__Impl rule__Spinner__Group_2__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2396:2: rule__Spinner__Group_2__0__Impl rule__Spinner__Group_2__1
            {
            pushFollow(FOLLOW_rule__Spinner__Group_2__0__Impl_in_rule__Spinner__Group_2__04798);
            rule__Spinner__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Spinner__Group_2__1_in_rule__Spinner__Group_2__04801);
            rule__Spinner__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group_2__0


    // $ANTLR start rule__Spinner__Group_2__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2403:1: rule__Spinner__Group_2__0__Impl : ( '<' ) ;
    public final void rule__Spinner__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2407:1: ( ( '<' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2408:1: ( '<' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2408:1: ( '<' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2409:1: '<'
            {
             before(grammarAccess.getSpinnerAccess().getLessThanSignKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Spinner__Group_2__0__Impl4829); 
             after(grammarAccess.getSpinnerAccess().getLessThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group_2__0__Impl


    // $ANTLR start rule__Spinner__Group_2__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2422:1: rule__Spinner__Group_2__1 : rule__Spinner__Group_2__1__Impl rule__Spinner__Group_2__2 ;
    public final void rule__Spinner__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2426:1: ( rule__Spinner__Group_2__1__Impl rule__Spinner__Group_2__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2427:2: rule__Spinner__Group_2__1__Impl rule__Spinner__Group_2__2
            {
            pushFollow(FOLLOW_rule__Spinner__Group_2__1__Impl_in_rule__Spinner__Group_2__14860);
            rule__Spinner__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Spinner__Group_2__2_in_rule__Spinner__Group_2__14863);
            rule__Spinner__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group_2__1


    // $ANTLR start rule__Spinner__Group_2__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2434:1: rule__Spinner__Group_2__1__Impl : ( ( rule__Spinner__IdAssignment_2_1 ) ) ;
    public final void rule__Spinner__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2438:1: ( ( ( rule__Spinner__IdAssignment_2_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2439:1: ( ( rule__Spinner__IdAssignment_2_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2439:1: ( ( rule__Spinner__IdAssignment_2_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2440:1: ( rule__Spinner__IdAssignment_2_1 )
            {
             before(grammarAccess.getSpinnerAccess().getIdAssignment_2_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2441:1: ( rule__Spinner__IdAssignment_2_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2441:2: rule__Spinner__IdAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Spinner__IdAssignment_2_1_in_rule__Spinner__Group_2__1__Impl4890);
            rule__Spinner__IdAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group_2__1__Impl


    // $ANTLR start rule__Spinner__Group_2__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2451:1: rule__Spinner__Group_2__2 : rule__Spinner__Group_2__2__Impl ;
    public final void rule__Spinner__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2455:1: ( rule__Spinner__Group_2__2__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2456:2: rule__Spinner__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Spinner__Group_2__2__Impl_in_rule__Spinner__Group_2__24920);
            rule__Spinner__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group_2__2


    // $ANTLR start rule__Spinner__Group_2__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2462:1: rule__Spinner__Group_2__2__Impl : ( '>' ) ;
    public final void rule__Spinner__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2466:1: ( ( '>' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2467:1: ( '>' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2467:1: ( '>' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2468:1: '>'
            {
             before(grammarAccess.getSpinnerAccess().getGreaterThanSignKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__Spinner__Group_2__2__Impl4948); 
             after(grammarAccess.getSpinnerAccess().getGreaterThanSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group_2__2__Impl


    // $ANTLR start rule__EditText__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2487:1: rule__EditText__Group__0 : rule__EditText__Group__0__Impl rule__EditText__Group__1 ;
    public final void rule__EditText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2491:1: ( rule__EditText__Group__0__Impl rule__EditText__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2492:2: rule__EditText__Group__0__Impl rule__EditText__Group__1
            {
            pushFollow(FOLLOW_rule__EditText__Group__0__Impl_in_rule__EditText__Group__04985);
            rule__EditText__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EditText__Group__1_in_rule__EditText__Group__04988);
            rule__EditText__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__Group__0


    // $ANTLR start rule__EditText__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2499:1: rule__EditText__Group__0__Impl : ( 'editText' ) ;
    public final void rule__EditText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2503:1: ( ( 'editText' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2504:1: ( 'editText' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2504:1: ( 'editText' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2505:1: 'editText'
            {
             before(grammarAccess.getEditTextAccess().getEditTextKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__EditText__Group__0__Impl5016); 
             after(grammarAccess.getEditTextAccess().getEditTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__Group__0__Impl


    // $ANTLR start rule__EditText__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2518:1: rule__EditText__Group__1 : rule__EditText__Group__1__Impl rule__EditText__Group__2 ;
    public final void rule__EditText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2522:1: ( rule__EditText__Group__1__Impl rule__EditText__Group__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2523:2: rule__EditText__Group__1__Impl rule__EditText__Group__2
            {
            pushFollow(FOLLOW_rule__EditText__Group__1__Impl_in_rule__EditText__Group__15047);
            rule__EditText__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EditText__Group__2_in_rule__EditText__Group__15050);
            rule__EditText__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__Group__1


    // $ANTLR start rule__EditText__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2530:1: rule__EditText__Group__1__Impl : ( () ) ;
    public final void rule__EditText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2534:1: ( ( () ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2535:1: ( () )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2535:1: ( () )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2536:1: ()
            {
             before(grammarAccess.getEditTextAccess().getEditTextAction_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2537:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2539:1: 
            {
            }

             after(grammarAccess.getEditTextAccess().getEditTextAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__Group__1__Impl


    // $ANTLR start rule__EditText__Group__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2549:1: rule__EditText__Group__2 : rule__EditText__Group__2__Impl rule__EditText__Group__3 ;
    public final void rule__EditText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2553:1: ( rule__EditText__Group__2__Impl rule__EditText__Group__3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2554:2: rule__EditText__Group__2__Impl rule__EditText__Group__3
            {
            pushFollow(FOLLOW_rule__EditText__Group__2__Impl_in_rule__EditText__Group__25108);
            rule__EditText__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EditText__Group__3_in_rule__EditText__Group__25111);
            rule__EditText__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__Group__2


    // $ANTLR start rule__EditText__Group__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2561:1: rule__EditText__Group__2__Impl : ( ( rule__EditText__Group_2__0 )? ) ;
    public final void rule__EditText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2565:1: ( ( ( rule__EditText__Group_2__0 )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2566:1: ( ( rule__EditText__Group_2__0 )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2566:1: ( ( rule__EditText__Group_2__0 )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2567:1: ( rule__EditText__Group_2__0 )?
            {
             before(grammarAccess.getEditTextAccess().getGroup_2()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2568:1: ( rule__EditText__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2568:2: rule__EditText__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EditText__Group_2__0_in_rule__EditText__Group__2__Impl5138);
                    rule__EditText__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEditTextAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__Group__2__Impl


    // $ANTLR start rule__EditText__Group__3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2578:1: rule__EditText__Group__3 : rule__EditText__Group__3__Impl ;
    public final void rule__EditText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2582:1: ( rule__EditText__Group__3__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2583:2: rule__EditText__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EditText__Group__3__Impl_in_rule__EditText__Group__35169);
            rule__EditText__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__Group__3


    // $ANTLR start rule__EditText__Group__3__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2589:1: rule__EditText__Group__3__Impl : ( ( rule__EditText__LabelAssignment_3 ) ) ;
    public final void rule__EditText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2593:1: ( ( ( rule__EditText__LabelAssignment_3 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2594:1: ( ( rule__EditText__LabelAssignment_3 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2594:1: ( ( rule__EditText__LabelAssignment_3 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2595:1: ( rule__EditText__LabelAssignment_3 )
            {
             before(grammarAccess.getEditTextAccess().getLabelAssignment_3()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2596:1: ( rule__EditText__LabelAssignment_3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2596:2: rule__EditText__LabelAssignment_3
            {
            pushFollow(FOLLOW_rule__EditText__LabelAssignment_3_in_rule__EditText__Group__3__Impl5196);
            rule__EditText__LabelAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getEditTextAccess().getLabelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__Group__3__Impl


    // $ANTLR start rule__EditText__Group_2__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2614:1: rule__EditText__Group_2__0 : rule__EditText__Group_2__0__Impl rule__EditText__Group_2__1 ;
    public final void rule__EditText__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2618:1: ( rule__EditText__Group_2__0__Impl rule__EditText__Group_2__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2619:2: rule__EditText__Group_2__0__Impl rule__EditText__Group_2__1
            {
            pushFollow(FOLLOW_rule__EditText__Group_2__0__Impl_in_rule__EditText__Group_2__05234);
            rule__EditText__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EditText__Group_2__1_in_rule__EditText__Group_2__05237);
            rule__EditText__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__Group_2__0


    // $ANTLR start rule__EditText__Group_2__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2626:1: rule__EditText__Group_2__0__Impl : ( '<' ) ;
    public final void rule__EditText__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2630:1: ( ( '<' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2631:1: ( '<' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2631:1: ( '<' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2632:1: '<'
            {
             before(grammarAccess.getEditTextAccess().getLessThanSignKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__EditText__Group_2__0__Impl5265); 
             after(grammarAccess.getEditTextAccess().getLessThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__Group_2__0__Impl


    // $ANTLR start rule__EditText__Group_2__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2645:1: rule__EditText__Group_2__1 : rule__EditText__Group_2__1__Impl rule__EditText__Group_2__2 ;
    public final void rule__EditText__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2649:1: ( rule__EditText__Group_2__1__Impl rule__EditText__Group_2__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2650:2: rule__EditText__Group_2__1__Impl rule__EditText__Group_2__2
            {
            pushFollow(FOLLOW_rule__EditText__Group_2__1__Impl_in_rule__EditText__Group_2__15296);
            rule__EditText__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EditText__Group_2__2_in_rule__EditText__Group_2__15299);
            rule__EditText__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__Group_2__1


    // $ANTLR start rule__EditText__Group_2__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2657:1: rule__EditText__Group_2__1__Impl : ( ( rule__EditText__IdAssignment_2_1 ) ) ;
    public final void rule__EditText__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2661:1: ( ( ( rule__EditText__IdAssignment_2_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2662:1: ( ( rule__EditText__IdAssignment_2_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2662:1: ( ( rule__EditText__IdAssignment_2_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2663:1: ( rule__EditText__IdAssignment_2_1 )
            {
             before(grammarAccess.getEditTextAccess().getIdAssignment_2_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2664:1: ( rule__EditText__IdAssignment_2_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2664:2: rule__EditText__IdAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EditText__IdAssignment_2_1_in_rule__EditText__Group_2__1__Impl5326);
            rule__EditText__IdAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getEditTextAccess().getIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__Group_2__1__Impl


    // $ANTLR start rule__EditText__Group_2__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2674:1: rule__EditText__Group_2__2 : rule__EditText__Group_2__2__Impl ;
    public final void rule__EditText__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2678:1: ( rule__EditText__Group_2__2__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2679:2: rule__EditText__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__EditText__Group_2__2__Impl_in_rule__EditText__Group_2__25356);
            rule__EditText__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__Group_2__2


    // $ANTLR start rule__EditText__Group_2__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2685:1: rule__EditText__Group_2__2__Impl : ( '>' ) ;
    public final void rule__EditText__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2689:1: ( ( '>' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2690:1: ( '>' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2690:1: ( '>' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2691:1: '>'
            {
             before(grammarAccess.getEditTextAccess().getGreaterThanSignKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__EditText__Group_2__2__Impl5384); 
             after(grammarAccess.getEditTextAccess().getGreaterThanSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__Group_2__2__Impl


    // $ANTLR start rule__TextView__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2710:1: rule__TextView__Group__0 : rule__TextView__Group__0__Impl rule__TextView__Group__1 ;
    public final void rule__TextView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2714:1: ( rule__TextView__Group__0__Impl rule__TextView__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2715:2: rule__TextView__Group__0__Impl rule__TextView__Group__1
            {
            pushFollow(FOLLOW_rule__TextView__Group__0__Impl_in_rule__TextView__Group__05421);
            rule__TextView__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextView__Group__1_in_rule__TextView__Group__05424);
            rule__TextView__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__Group__0


    // $ANTLR start rule__TextView__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2722:1: rule__TextView__Group__0__Impl : ( 'textView' ) ;
    public final void rule__TextView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2726:1: ( ( 'textView' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2727:1: ( 'textView' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2727:1: ( 'textView' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2728:1: 'textView'
            {
             before(grammarAccess.getTextViewAccess().getTextViewKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__TextView__Group__0__Impl5452); 
             after(grammarAccess.getTextViewAccess().getTextViewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__Group__0__Impl


    // $ANTLR start rule__TextView__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2741:1: rule__TextView__Group__1 : rule__TextView__Group__1__Impl rule__TextView__Group__2 ;
    public final void rule__TextView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2745:1: ( rule__TextView__Group__1__Impl rule__TextView__Group__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2746:2: rule__TextView__Group__1__Impl rule__TextView__Group__2
            {
            pushFollow(FOLLOW_rule__TextView__Group__1__Impl_in_rule__TextView__Group__15483);
            rule__TextView__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextView__Group__2_in_rule__TextView__Group__15486);
            rule__TextView__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__Group__1


    // $ANTLR start rule__TextView__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2753:1: rule__TextView__Group__1__Impl : ( () ) ;
    public final void rule__TextView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2757:1: ( ( () ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2758:1: ( () )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2758:1: ( () )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2759:1: ()
            {
             before(grammarAccess.getTextViewAccess().getTextViewAction_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2760:1: ()
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2762:1: 
            {
            }

             after(grammarAccess.getTextViewAccess().getTextViewAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__Group__1__Impl


    // $ANTLR start rule__TextView__Group__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2772:1: rule__TextView__Group__2 : rule__TextView__Group__2__Impl rule__TextView__Group__3 ;
    public final void rule__TextView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2776:1: ( rule__TextView__Group__2__Impl rule__TextView__Group__3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2777:2: rule__TextView__Group__2__Impl rule__TextView__Group__3
            {
            pushFollow(FOLLOW_rule__TextView__Group__2__Impl_in_rule__TextView__Group__25544);
            rule__TextView__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextView__Group__3_in_rule__TextView__Group__25547);
            rule__TextView__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__Group__2


    // $ANTLR start rule__TextView__Group__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2784:1: rule__TextView__Group__2__Impl : ( ( rule__TextView__Group_2__0 )? ) ;
    public final void rule__TextView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2788:1: ( ( ( rule__TextView__Group_2__0 )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2789:1: ( ( rule__TextView__Group_2__0 )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2789:1: ( ( rule__TextView__Group_2__0 )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2790:1: ( rule__TextView__Group_2__0 )?
            {
             before(grammarAccess.getTextViewAccess().getGroup_2()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2791:1: ( rule__TextView__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2791:2: rule__TextView__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TextView__Group_2__0_in_rule__TextView__Group__2__Impl5574);
                    rule__TextView__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextViewAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__Group__2__Impl


    // $ANTLR start rule__TextView__Group__3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2801:1: rule__TextView__Group__3 : rule__TextView__Group__3__Impl ;
    public final void rule__TextView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2805:1: ( rule__TextView__Group__3__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2806:2: rule__TextView__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TextView__Group__3__Impl_in_rule__TextView__Group__35605);
            rule__TextView__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__Group__3


    // $ANTLR start rule__TextView__Group__3__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2812:1: rule__TextView__Group__3__Impl : ( ( rule__TextView__LabelAssignment_3 ) ) ;
    public final void rule__TextView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2816:1: ( ( ( rule__TextView__LabelAssignment_3 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2817:1: ( ( rule__TextView__LabelAssignment_3 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2817:1: ( ( rule__TextView__LabelAssignment_3 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2818:1: ( rule__TextView__LabelAssignment_3 )
            {
             before(grammarAccess.getTextViewAccess().getLabelAssignment_3()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2819:1: ( rule__TextView__LabelAssignment_3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2819:2: rule__TextView__LabelAssignment_3
            {
            pushFollow(FOLLOW_rule__TextView__LabelAssignment_3_in_rule__TextView__Group__3__Impl5632);
            rule__TextView__LabelAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getTextViewAccess().getLabelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__Group__3__Impl


    // $ANTLR start rule__TextView__Group_2__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2837:1: rule__TextView__Group_2__0 : rule__TextView__Group_2__0__Impl rule__TextView__Group_2__1 ;
    public final void rule__TextView__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2841:1: ( rule__TextView__Group_2__0__Impl rule__TextView__Group_2__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2842:2: rule__TextView__Group_2__0__Impl rule__TextView__Group_2__1
            {
            pushFollow(FOLLOW_rule__TextView__Group_2__0__Impl_in_rule__TextView__Group_2__05670);
            rule__TextView__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextView__Group_2__1_in_rule__TextView__Group_2__05673);
            rule__TextView__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__Group_2__0


    // $ANTLR start rule__TextView__Group_2__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2849:1: rule__TextView__Group_2__0__Impl : ( '<' ) ;
    public final void rule__TextView__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2853:1: ( ( '<' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2854:1: ( '<' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2854:1: ( '<' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2855:1: '<'
            {
             before(grammarAccess.getTextViewAccess().getLessThanSignKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__TextView__Group_2__0__Impl5701); 
             after(grammarAccess.getTextViewAccess().getLessThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__Group_2__0__Impl


    // $ANTLR start rule__TextView__Group_2__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2868:1: rule__TextView__Group_2__1 : rule__TextView__Group_2__1__Impl rule__TextView__Group_2__2 ;
    public final void rule__TextView__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2872:1: ( rule__TextView__Group_2__1__Impl rule__TextView__Group_2__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2873:2: rule__TextView__Group_2__1__Impl rule__TextView__Group_2__2
            {
            pushFollow(FOLLOW_rule__TextView__Group_2__1__Impl_in_rule__TextView__Group_2__15732);
            rule__TextView__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextView__Group_2__2_in_rule__TextView__Group_2__15735);
            rule__TextView__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__Group_2__1


    // $ANTLR start rule__TextView__Group_2__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2880:1: rule__TextView__Group_2__1__Impl : ( ( rule__TextView__IdAssignment_2_1 ) ) ;
    public final void rule__TextView__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2884:1: ( ( ( rule__TextView__IdAssignment_2_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2885:1: ( ( rule__TextView__IdAssignment_2_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2885:1: ( ( rule__TextView__IdAssignment_2_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2886:1: ( rule__TextView__IdAssignment_2_1 )
            {
             before(grammarAccess.getTextViewAccess().getIdAssignment_2_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2887:1: ( rule__TextView__IdAssignment_2_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2887:2: rule__TextView__IdAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TextView__IdAssignment_2_1_in_rule__TextView__Group_2__1__Impl5762);
            rule__TextView__IdAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getTextViewAccess().getIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__Group_2__1__Impl


    // $ANTLR start rule__TextView__Group_2__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2897:1: rule__TextView__Group_2__2 : rule__TextView__Group_2__2__Impl ;
    public final void rule__TextView__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2901:1: ( rule__TextView__Group_2__2__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2902:2: rule__TextView__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TextView__Group_2__2__Impl_in_rule__TextView__Group_2__25792);
            rule__TextView__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__Group_2__2


    // $ANTLR start rule__TextView__Group_2__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2908:1: rule__TextView__Group_2__2__Impl : ( '>' ) ;
    public final void rule__TextView__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2912:1: ( ( '>' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2913:1: ( '>' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2913:1: ( '>' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2914:1: '>'
            {
             before(grammarAccess.getTextViewAccess().getGreaterThanSignKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__TextView__Group_2__2__Impl5820); 
             after(grammarAccess.getTextViewAccess().getGreaterThanSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__Group_2__2__Impl


    // $ANTLR start rule__GenericActivity__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2933:1: rule__GenericActivity__Group__0 : rule__GenericActivity__Group__0__Impl rule__GenericActivity__Group__1 ;
    public final void rule__GenericActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2937:1: ( rule__GenericActivity__Group__0__Impl rule__GenericActivity__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2938:2: rule__GenericActivity__Group__0__Impl rule__GenericActivity__Group__1
            {
            pushFollow(FOLLOW_rule__GenericActivity__Group__0__Impl_in_rule__GenericActivity__Group__05857);
            rule__GenericActivity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GenericActivity__Group__1_in_rule__GenericActivity__Group__05860);
            rule__GenericActivity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericActivity__Group__0


    // $ANTLR start rule__GenericActivity__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2945:1: rule__GenericActivity__Group__0__Impl : ( 'activity' ) ;
    public final void rule__GenericActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2949:1: ( ( 'activity' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2950:1: ( 'activity' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2950:1: ( 'activity' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2951:1: 'activity'
            {
             before(grammarAccess.getGenericActivityAccess().getActivityKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__GenericActivity__Group__0__Impl5888); 
             after(grammarAccess.getGenericActivityAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericActivity__Group__0__Impl


    // $ANTLR start rule__GenericActivity__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2964:1: rule__GenericActivity__Group__1 : rule__GenericActivity__Group__1__Impl rule__GenericActivity__Group__2 ;
    public final void rule__GenericActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2968:1: ( rule__GenericActivity__Group__1__Impl rule__GenericActivity__Group__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2969:2: rule__GenericActivity__Group__1__Impl rule__GenericActivity__Group__2
            {
            pushFollow(FOLLOW_rule__GenericActivity__Group__1__Impl_in_rule__GenericActivity__Group__15919);
            rule__GenericActivity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GenericActivity__Group__2_in_rule__GenericActivity__Group__15922);
            rule__GenericActivity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericActivity__Group__1


    // $ANTLR start rule__GenericActivity__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2976:1: rule__GenericActivity__Group__1__Impl : ( ( rule__GenericActivity__NameAssignment_1 ) ) ;
    public final void rule__GenericActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2980:1: ( ( ( rule__GenericActivity__NameAssignment_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2981:1: ( ( rule__GenericActivity__NameAssignment_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2981:1: ( ( rule__GenericActivity__NameAssignment_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2982:1: ( rule__GenericActivity__NameAssignment_1 )
            {
             before(grammarAccess.getGenericActivityAccess().getNameAssignment_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2983:1: ( rule__GenericActivity__NameAssignment_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2983:2: rule__GenericActivity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GenericActivity__NameAssignment_1_in_rule__GenericActivity__Group__1__Impl5949);
            rule__GenericActivity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getGenericActivityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericActivity__Group__1__Impl


    // $ANTLR start rule__GenericActivity__Group__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2993:1: rule__GenericActivity__Group__2 : rule__GenericActivity__Group__2__Impl rule__GenericActivity__Group__3 ;
    public final void rule__GenericActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2997:1: ( rule__GenericActivity__Group__2__Impl rule__GenericActivity__Group__3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:2998:2: rule__GenericActivity__Group__2__Impl rule__GenericActivity__Group__3
            {
            pushFollow(FOLLOW_rule__GenericActivity__Group__2__Impl_in_rule__GenericActivity__Group__25979);
            rule__GenericActivity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GenericActivity__Group__3_in_rule__GenericActivity__Group__25982);
            rule__GenericActivity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericActivity__Group__2


    // $ANTLR start rule__GenericActivity__Group__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3005:1: rule__GenericActivity__Group__2__Impl : ( '{' ) ;
    public final void rule__GenericActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3009:1: ( ( '{' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3010:1: ( '{' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3010:1: ( '{' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3011:1: '{'
            {
             before(grammarAccess.getGenericActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__GenericActivity__Group__2__Impl6010); 
             after(grammarAccess.getGenericActivityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericActivity__Group__2__Impl


    // $ANTLR start rule__GenericActivity__Group__3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3024:1: rule__GenericActivity__Group__3 : rule__GenericActivity__Group__3__Impl rule__GenericActivity__Group__4 ;
    public final void rule__GenericActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3028:1: ( rule__GenericActivity__Group__3__Impl rule__GenericActivity__Group__4 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3029:2: rule__GenericActivity__Group__3__Impl rule__GenericActivity__Group__4
            {
            pushFollow(FOLLOW_rule__GenericActivity__Group__3__Impl_in_rule__GenericActivity__Group__36041);
            rule__GenericActivity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GenericActivity__Group__4_in_rule__GenericActivity__Group__36044);
            rule__GenericActivity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericActivity__Group__3


    // $ANTLR start rule__GenericActivity__Group__3__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3036:1: rule__GenericActivity__Group__3__Impl : ( ( rule__GenericActivity__ActionsAssignment_3 )* ) ;
    public final void rule__GenericActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3040:1: ( ( ( rule__GenericActivity__ActionsAssignment_3 )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3041:1: ( ( rule__GenericActivity__ActionsAssignment_3 )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3041:1: ( ( rule__GenericActivity__ActionsAssignment_3 )* )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3042:1: ( rule__GenericActivity__ActionsAssignment_3 )*
            {
             before(grammarAccess.getGenericActivityAccess().getActionsAssignment_3()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3043:1: ( rule__GenericActivity__ActionsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=33 && LA18_0<=37)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3043:2: rule__GenericActivity__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__GenericActivity__ActionsAssignment_3_in_rule__GenericActivity__Group__3__Impl6071);
            	    rule__GenericActivity__ActionsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getGenericActivityAccess().getActionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericActivity__Group__3__Impl


    // $ANTLR start rule__GenericActivity__Group__4
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3053:1: rule__GenericActivity__Group__4 : rule__GenericActivity__Group__4__Impl ;
    public final void rule__GenericActivity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3057:1: ( rule__GenericActivity__Group__4__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3058:2: rule__GenericActivity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__GenericActivity__Group__4__Impl_in_rule__GenericActivity__Group__46102);
            rule__GenericActivity__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericActivity__Group__4


    // $ANTLR start rule__GenericActivity__Group__4__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3064:1: rule__GenericActivity__Group__4__Impl : ( '}' ) ;
    public final void rule__GenericActivity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3068:1: ( ( '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3069:1: ( '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3069:1: ( '}' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3070:1: '}'
            {
             before(grammarAccess.getGenericActivityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__GenericActivity__Group__4__Impl6130); 
             after(grammarAccess.getGenericActivityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericActivity__Group__4__Impl


    // $ANTLR start rule__ListActivity__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3093:1: rule__ListActivity__Group__0 : rule__ListActivity__Group__0__Impl rule__ListActivity__Group__1 ;
    public final void rule__ListActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3097:1: ( rule__ListActivity__Group__0__Impl rule__ListActivity__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3098:2: rule__ListActivity__Group__0__Impl rule__ListActivity__Group__1
            {
            pushFollow(FOLLOW_rule__ListActivity__Group__0__Impl_in_rule__ListActivity__Group__06171);
            rule__ListActivity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListActivity__Group__1_in_rule__ListActivity__Group__06174);
            rule__ListActivity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__0


    // $ANTLR start rule__ListActivity__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3105:1: rule__ListActivity__Group__0__Impl : ( 'list activity' ) ;
    public final void rule__ListActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3109:1: ( ( 'list activity' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3110:1: ( 'list activity' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3110:1: ( 'list activity' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3111:1: 'list activity'
            {
             before(grammarAccess.getListActivityAccess().getListActivityKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ListActivity__Group__0__Impl6202); 
             after(grammarAccess.getListActivityAccess().getListActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__0__Impl


    // $ANTLR start rule__ListActivity__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3124:1: rule__ListActivity__Group__1 : rule__ListActivity__Group__1__Impl rule__ListActivity__Group__2 ;
    public final void rule__ListActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3128:1: ( rule__ListActivity__Group__1__Impl rule__ListActivity__Group__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3129:2: rule__ListActivity__Group__1__Impl rule__ListActivity__Group__2
            {
            pushFollow(FOLLOW_rule__ListActivity__Group__1__Impl_in_rule__ListActivity__Group__16233);
            rule__ListActivity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListActivity__Group__2_in_rule__ListActivity__Group__16236);
            rule__ListActivity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__1


    // $ANTLR start rule__ListActivity__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3136:1: rule__ListActivity__Group__1__Impl : ( ( rule__ListActivity__NameAssignment_1 ) ) ;
    public final void rule__ListActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3140:1: ( ( ( rule__ListActivity__NameAssignment_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3141:1: ( ( rule__ListActivity__NameAssignment_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3141:1: ( ( rule__ListActivity__NameAssignment_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3142:1: ( rule__ListActivity__NameAssignment_1 )
            {
             before(grammarAccess.getListActivityAccess().getNameAssignment_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3143:1: ( rule__ListActivity__NameAssignment_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3143:2: rule__ListActivity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ListActivity__NameAssignment_1_in_rule__ListActivity__Group__1__Impl6263);
            rule__ListActivity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getListActivityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__1__Impl


    // $ANTLR start rule__ListActivity__Group__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3153:1: rule__ListActivity__Group__2 : rule__ListActivity__Group__2__Impl rule__ListActivity__Group__3 ;
    public final void rule__ListActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3157:1: ( rule__ListActivity__Group__2__Impl rule__ListActivity__Group__3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3158:2: rule__ListActivity__Group__2__Impl rule__ListActivity__Group__3
            {
            pushFollow(FOLLOW_rule__ListActivity__Group__2__Impl_in_rule__ListActivity__Group__26293);
            rule__ListActivity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListActivity__Group__3_in_rule__ListActivity__Group__26296);
            rule__ListActivity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__2


    // $ANTLR start rule__ListActivity__Group__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3165:1: rule__ListActivity__Group__2__Impl : ( '{' ) ;
    public final void rule__ListActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3169:1: ( ( '{' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3170:1: ( '{' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3170:1: ( '{' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3171:1: '{'
            {
             before(grammarAccess.getListActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__ListActivity__Group__2__Impl6324); 
             after(grammarAccess.getListActivityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__2__Impl


    // $ANTLR start rule__ListActivity__Group__3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3184:1: rule__ListActivity__Group__3 : rule__ListActivity__Group__3__Impl rule__ListActivity__Group__4 ;
    public final void rule__ListActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3188:1: ( rule__ListActivity__Group__3__Impl rule__ListActivity__Group__4 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3189:2: rule__ListActivity__Group__3__Impl rule__ListActivity__Group__4
            {
            pushFollow(FOLLOW_rule__ListActivity__Group__3__Impl_in_rule__ListActivity__Group__36355);
            rule__ListActivity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListActivity__Group__4_in_rule__ListActivity__Group__36358);
            rule__ListActivity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__3


    // $ANTLR start rule__ListActivity__Group__3__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3196:1: rule__ListActivity__Group__3__Impl : ( 'data' ) ;
    public final void rule__ListActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3200:1: ( ( 'data' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3201:1: ( 'data' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3201:1: ( 'data' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3202:1: 'data'
            {
             before(grammarAccess.getListActivityAccess().getDataKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__ListActivity__Group__3__Impl6386); 
             after(grammarAccess.getListActivityAccess().getDataKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__3__Impl


    // $ANTLR start rule__ListActivity__Group__4
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3215:1: rule__ListActivity__Group__4 : rule__ListActivity__Group__4__Impl rule__ListActivity__Group__5 ;
    public final void rule__ListActivity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3219:1: ( rule__ListActivity__Group__4__Impl rule__ListActivity__Group__5 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3220:2: rule__ListActivity__Group__4__Impl rule__ListActivity__Group__5
            {
            pushFollow(FOLLOW_rule__ListActivity__Group__4__Impl_in_rule__ListActivity__Group__46417);
            rule__ListActivity__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListActivity__Group__5_in_rule__ListActivity__Group__46420);
            rule__ListActivity__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__4


    // $ANTLR start rule__ListActivity__Group__4__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3227:1: rule__ListActivity__Group__4__Impl : ( ( rule__ListActivity__DataSourceAssignment_4 ) ) ;
    public final void rule__ListActivity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3231:1: ( ( ( rule__ListActivity__DataSourceAssignment_4 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3232:1: ( ( rule__ListActivity__DataSourceAssignment_4 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3232:1: ( ( rule__ListActivity__DataSourceAssignment_4 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3233:1: ( rule__ListActivity__DataSourceAssignment_4 )
            {
             before(grammarAccess.getListActivityAccess().getDataSourceAssignment_4()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3234:1: ( rule__ListActivity__DataSourceAssignment_4 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3234:2: rule__ListActivity__DataSourceAssignment_4
            {
            pushFollow(FOLLOW_rule__ListActivity__DataSourceAssignment_4_in_rule__ListActivity__Group__4__Impl6447);
            rule__ListActivity__DataSourceAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getListActivityAccess().getDataSourceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__4__Impl


    // $ANTLR start rule__ListActivity__Group__5
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3244:1: rule__ListActivity__Group__5 : rule__ListActivity__Group__5__Impl rule__ListActivity__Group__6 ;
    public final void rule__ListActivity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3248:1: ( rule__ListActivity__Group__5__Impl rule__ListActivity__Group__6 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3249:2: rule__ListActivity__Group__5__Impl rule__ListActivity__Group__6
            {
            pushFollow(FOLLOW_rule__ListActivity__Group__5__Impl_in_rule__ListActivity__Group__56477);
            rule__ListActivity__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListActivity__Group__6_in_rule__ListActivity__Group__56480);
            rule__ListActivity__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__5


    // $ANTLR start rule__ListActivity__Group__5__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3256:1: rule__ListActivity__Group__5__Impl : ( ( rule__ListActivity__Group_5__0 )? ) ;
    public final void rule__ListActivity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3260:1: ( ( ( rule__ListActivity__Group_5__0 )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3261:1: ( ( rule__ListActivity__Group_5__0 )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3261:1: ( ( rule__ListActivity__Group_5__0 )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3262:1: ( rule__ListActivity__Group_5__0 )?
            {
             before(grammarAccess.getListActivityAccess().getGroup_5()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3263:1: ( rule__ListActivity__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3263:2: rule__ListActivity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ListActivity__Group_5__0_in_rule__ListActivity__Group__5__Impl6507);
                    rule__ListActivity__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListActivityAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__5__Impl


    // $ANTLR start rule__ListActivity__Group__6
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3273:1: rule__ListActivity__Group__6 : rule__ListActivity__Group__6__Impl rule__ListActivity__Group__7 ;
    public final void rule__ListActivity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3277:1: ( rule__ListActivity__Group__6__Impl rule__ListActivity__Group__7 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3278:2: rule__ListActivity__Group__6__Impl rule__ListActivity__Group__7
            {
            pushFollow(FOLLOW_rule__ListActivity__Group__6__Impl_in_rule__ListActivity__Group__66538);
            rule__ListActivity__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListActivity__Group__7_in_rule__ListActivity__Group__66541);
            rule__ListActivity__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__6


    // $ANTLR start rule__ListActivity__Group__6__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3285:1: rule__ListActivity__Group__6__Impl : ( 'item' ) ;
    public final void rule__ListActivity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3289:1: ( ( 'item' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3290:1: ( 'item' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3290:1: ( 'item' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3291:1: 'item'
            {
             before(grammarAccess.getListActivityAccess().getItemKeyword_6()); 
            match(input,31,FOLLOW_31_in_rule__ListActivity__Group__6__Impl6569); 
             after(grammarAccess.getListActivityAccess().getItemKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__6__Impl


    // $ANTLR start rule__ListActivity__Group__7
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3304:1: rule__ListActivity__Group__7 : rule__ListActivity__Group__7__Impl rule__ListActivity__Group__8 ;
    public final void rule__ListActivity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3308:1: ( rule__ListActivity__Group__7__Impl rule__ListActivity__Group__8 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3309:2: rule__ListActivity__Group__7__Impl rule__ListActivity__Group__8
            {
            pushFollow(FOLLOW_rule__ListActivity__Group__7__Impl_in_rule__ListActivity__Group__76600);
            rule__ListActivity__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListActivity__Group__8_in_rule__ListActivity__Group__76603);
            rule__ListActivity__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__7


    // $ANTLR start rule__ListActivity__Group__7__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3316:1: rule__ListActivity__Group__7__Impl : ( ( rule__ListActivity__ItemLayoutAssignment_7 ) ) ;
    public final void rule__ListActivity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3320:1: ( ( ( rule__ListActivity__ItemLayoutAssignment_7 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3321:1: ( ( rule__ListActivity__ItemLayoutAssignment_7 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3321:1: ( ( rule__ListActivity__ItemLayoutAssignment_7 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3322:1: ( rule__ListActivity__ItemLayoutAssignment_7 )
            {
             before(grammarAccess.getListActivityAccess().getItemLayoutAssignment_7()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3323:1: ( rule__ListActivity__ItemLayoutAssignment_7 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3323:2: rule__ListActivity__ItemLayoutAssignment_7
            {
            pushFollow(FOLLOW_rule__ListActivity__ItemLayoutAssignment_7_in_rule__ListActivity__Group__7__Impl6630);
            rule__ListActivity__ItemLayoutAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getListActivityAccess().getItemLayoutAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__7__Impl


    // $ANTLR start rule__ListActivity__Group__8
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3333:1: rule__ListActivity__Group__8 : rule__ListActivity__Group__8__Impl rule__ListActivity__Group__9 ;
    public final void rule__ListActivity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3337:1: ( rule__ListActivity__Group__8__Impl rule__ListActivity__Group__9 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3338:2: rule__ListActivity__Group__8__Impl rule__ListActivity__Group__9
            {
            pushFollow(FOLLOW_rule__ListActivity__Group__8__Impl_in_rule__ListActivity__Group__86660);
            rule__ListActivity__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListActivity__Group__9_in_rule__ListActivity__Group__86663);
            rule__ListActivity__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__8


    // $ANTLR start rule__ListActivity__Group__8__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3345:1: rule__ListActivity__Group__8__Impl : ( ( rule__ListActivity__ActionsAssignment_8 )* ) ;
    public final void rule__ListActivity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3349:1: ( ( ( rule__ListActivity__ActionsAssignment_8 )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3350:1: ( ( rule__ListActivity__ActionsAssignment_8 )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3350:1: ( ( rule__ListActivity__ActionsAssignment_8 )* )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3351:1: ( rule__ListActivity__ActionsAssignment_8 )*
            {
             before(grammarAccess.getListActivityAccess().getActionsAssignment_8()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3352:1: ( rule__ListActivity__ActionsAssignment_8 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=33 && LA20_0<=37)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3352:2: rule__ListActivity__ActionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__ListActivity__ActionsAssignment_8_in_rule__ListActivity__Group__8__Impl6690);
            	    rule__ListActivity__ActionsAssignment_8();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getListActivityAccess().getActionsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__8__Impl


    // $ANTLR start rule__ListActivity__Group__9
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3362:1: rule__ListActivity__Group__9 : rule__ListActivity__Group__9__Impl ;
    public final void rule__ListActivity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3366:1: ( rule__ListActivity__Group__9__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3367:2: rule__ListActivity__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__ListActivity__Group__9__Impl_in_rule__ListActivity__Group__96721);
            rule__ListActivity__Group__9__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__9


    // $ANTLR start rule__ListActivity__Group__9__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3373:1: rule__ListActivity__Group__9__Impl : ( '}' ) ;
    public final void rule__ListActivity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3377:1: ( ( '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3378:1: ( '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3378:1: ( '}' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3379:1: '}'
            {
             before(grammarAccess.getListActivityAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_13_in_rule__ListActivity__Group__9__Impl6749); 
             after(grammarAccess.getListActivityAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group__9__Impl


    // $ANTLR start rule__ListActivity__Group_5__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3412:1: rule__ListActivity__Group_5__0 : rule__ListActivity__Group_5__0__Impl rule__ListActivity__Group_5__1 ;
    public final void rule__ListActivity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3416:1: ( rule__ListActivity__Group_5__0__Impl rule__ListActivity__Group_5__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3417:2: rule__ListActivity__Group_5__0__Impl rule__ListActivity__Group_5__1
            {
            pushFollow(FOLLOW_rule__ListActivity__Group_5__0__Impl_in_rule__ListActivity__Group_5__06800);
            rule__ListActivity__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListActivity__Group_5__1_in_rule__ListActivity__Group_5__06803);
            rule__ListActivity__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group_5__0


    // $ANTLR start rule__ListActivity__Group_5__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3424:1: rule__ListActivity__Group_5__0__Impl : ( 'layout' ) ;
    public final void rule__ListActivity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3428:1: ( ( 'layout' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3429:1: ( 'layout' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3429:1: ( 'layout' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3430:1: 'layout'
            {
             before(grammarAccess.getListActivityAccess().getLayoutKeyword_5_0()); 
            match(input,15,FOLLOW_15_in_rule__ListActivity__Group_5__0__Impl6831); 
             after(grammarAccess.getListActivityAccess().getLayoutKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group_5__0__Impl


    // $ANTLR start rule__ListActivity__Group_5__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3443:1: rule__ListActivity__Group_5__1 : rule__ListActivity__Group_5__1__Impl ;
    public final void rule__ListActivity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3447:1: ( rule__ListActivity__Group_5__1__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3448:2: rule__ListActivity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ListActivity__Group_5__1__Impl_in_rule__ListActivity__Group_5__16862);
            rule__ListActivity__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group_5__1


    // $ANTLR start rule__ListActivity__Group_5__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3454:1: rule__ListActivity__Group_5__1__Impl : ( ( rule__ListActivity__LayoutAssignment_5_1 ) ) ;
    public final void rule__ListActivity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3458:1: ( ( ( rule__ListActivity__LayoutAssignment_5_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3459:1: ( ( rule__ListActivity__LayoutAssignment_5_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3459:1: ( ( rule__ListActivity__LayoutAssignment_5_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3460:1: ( rule__ListActivity__LayoutAssignment_5_1 )
            {
             before(grammarAccess.getListActivityAccess().getLayoutAssignment_5_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3461:1: ( rule__ListActivity__LayoutAssignment_5_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3461:2: rule__ListActivity__LayoutAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ListActivity__LayoutAssignment_5_1_in_rule__ListActivity__Group_5__1__Impl6889);
            rule__ListActivity__LayoutAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getListActivityAccess().getLayoutAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__Group_5__1__Impl


    // $ANTLR start rule__TabActivity__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3475:1: rule__TabActivity__Group__0 : rule__TabActivity__Group__0__Impl rule__TabActivity__Group__1 ;
    public final void rule__TabActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3479:1: ( rule__TabActivity__Group__0__Impl rule__TabActivity__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3480:2: rule__TabActivity__Group__0__Impl rule__TabActivity__Group__1
            {
            pushFollow(FOLLOW_rule__TabActivity__Group__0__Impl_in_rule__TabActivity__Group__06923);
            rule__TabActivity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabActivity__Group__1_in_rule__TabActivity__Group__06926);
            rule__TabActivity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabActivity__Group__0


    // $ANTLR start rule__TabActivity__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3487:1: rule__TabActivity__Group__0__Impl : ( 'tab activity' ) ;
    public final void rule__TabActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3491:1: ( ( 'tab activity' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3492:1: ( 'tab activity' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3492:1: ( 'tab activity' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3493:1: 'tab activity'
            {
             before(grammarAccess.getTabActivityAccess().getTabActivityKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__TabActivity__Group__0__Impl6954); 
             after(grammarAccess.getTabActivityAccess().getTabActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabActivity__Group__0__Impl


    // $ANTLR start rule__TabActivity__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3506:1: rule__TabActivity__Group__1 : rule__TabActivity__Group__1__Impl rule__TabActivity__Group__2 ;
    public final void rule__TabActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3510:1: ( rule__TabActivity__Group__1__Impl rule__TabActivity__Group__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3511:2: rule__TabActivity__Group__1__Impl rule__TabActivity__Group__2
            {
            pushFollow(FOLLOW_rule__TabActivity__Group__1__Impl_in_rule__TabActivity__Group__16985);
            rule__TabActivity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabActivity__Group__2_in_rule__TabActivity__Group__16988);
            rule__TabActivity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabActivity__Group__1


    // $ANTLR start rule__TabActivity__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3518:1: rule__TabActivity__Group__1__Impl : ( ( rule__TabActivity__NameAssignment_1 ) ) ;
    public final void rule__TabActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3522:1: ( ( ( rule__TabActivity__NameAssignment_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3523:1: ( ( rule__TabActivity__NameAssignment_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3523:1: ( ( rule__TabActivity__NameAssignment_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3524:1: ( rule__TabActivity__NameAssignment_1 )
            {
             before(grammarAccess.getTabActivityAccess().getNameAssignment_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3525:1: ( rule__TabActivity__NameAssignment_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3525:2: rule__TabActivity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TabActivity__NameAssignment_1_in_rule__TabActivity__Group__1__Impl7015);
            rule__TabActivity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTabActivityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabActivity__Group__1__Impl


    // $ANTLR start rule__TabActivity__Group__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3535:1: rule__TabActivity__Group__2 : rule__TabActivity__Group__2__Impl rule__TabActivity__Group__3 ;
    public final void rule__TabActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3539:1: ( rule__TabActivity__Group__2__Impl rule__TabActivity__Group__3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3540:2: rule__TabActivity__Group__2__Impl rule__TabActivity__Group__3
            {
            pushFollow(FOLLOW_rule__TabActivity__Group__2__Impl_in_rule__TabActivity__Group__27045);
            rule__TabActivity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabActivity__Group__3_in_rule__TabActivity__Group__27048);
            rule__TabActivity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabActivity__Group__2


    // $ANTLR start rule__TabActivity__Group__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3547:1: rule__TabActivity__Group__2__Impl : ( '{' ) ;
    public final void rule__TabActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3551:1: ( ( '{' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3552:1: ( '{' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3552:1: ( '{' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3553:1: '{'
            {
             before(grammarAccess.getTabActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__TabActivity__Group__2__Impl7076); 
             after(grammarAccess.getTabActivityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabActivity__Group__2__Impl


    // $ANTLR start rule__TabActivity__Group__3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3566:1: rule__TabActivity__Group__3 : rule__TabActivity__Group__3__Impl rule__TabActivity__Group__4 ;
    public final void rule__TabActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3570:1: ( rule__TabActivity__Group__3__Impl rule__TabActivity__Group__4 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3571:2: rule__TabActivity__Group__3__Impl rule__TabActivity__Group__4
            {
            pushFollow(FOLLOW_rule__TabActivity__Group__3__Impl_in_rule__TabActivity__Group__37107);
            rule__TabActivity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabActivity__Group__4_in_rule__TabActivity__Group__37110);
            rule__TabActivity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabActivity__Group__3


    // $ANTLR start rule__TabActivity__Group__3__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3578:1: rule__TabActivity__Group__3__Impl : ( ( rule__TabActivity__ActionsAssignment_3 )* ) ;
    public final void rule__TabActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3582:1: ( ( ( rule__TabActivity__ActionsAssignment_3 )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3583:1: ( ( rule__TabActivity__ActionsAssignment_3 )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3583:1: ( ( rule__TabActivity__ActionsAssignment_3 )* )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3584:1: ( rule__TabActivity__ActionsAssignment_3 )*
            {
             before(grammarAccess.getTabActivityAccess().getActionsAssignment_3()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3585:1: ( rule__TabActivity__ActionsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=33 && LA21_0<=37)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3585:2: rule__TabActivity__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__TabActivity__ActionsAssignment_3_in_rule__TabActivity__Group__3__Impl7137);
            	    rule__TabActivity__ActionsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTabActivityAccess().getActionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabActivity__Group__3__Impl


    // $ANTLR start rule__TabActivity__Group__4
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3595:1: rule__TabActivity__Group__4 : rule__TabActivity__Group__4__Impl ;
    public final void rule__TabActivity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3599:1: ( rule__TabActivity__Group__4__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3600:2: rule__TabActivity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TabActivity__Group__4__Impl_in_rule__TabActivity__Group__47168);
            rule__TabActivity__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabActivity__Group__4


    // $ANTLR start rule__TabActivity__Group__4__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3606:1: rule__TabActivity__Group__4__Impl : ( '}' ) ;
    public final void rule__TabActivity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3610:1: ( ( '}' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3611:1: ( '}' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3611:1: ( '}' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3612:1: '}'
            {
             before(grammarAccess.getTabActivityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__TabActivity__Group__4__Impl7196); 
             after(grammarAccess.getTabActivityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabActivity__Group__4__Impl


    // $ANTLR start rule__GenericAction__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3635:1: rule__GenericAction__Group__0 : rule__GenericAction__Group__0__Impl rule__GenericAction__Group__1 ;
    public final void rule__GenericAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3639:1: ( rule__GenericAction__Group__0__Impl rule__GenericAction__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3640:2: rule__GenericAction__Group__0__Impl rule__GenericAction__Group__1
            {
            pushFollow(FOLLOW_rule__GenericAction__Group__0__Impl_in_rule__GenericAction__Group__07237);
            rule__GenericAction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GenericAction__Group__1_in_rule__GenericAction__Group__07240);
            rule__GenericAction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericAction__Group__0


    // $ANTLR start rule__GenericAction__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3647:1: rule__GenericAction__Group__0__Impl : ( 'action' ) ;
    public final void rule__GenericAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3651:1: ( ( 'action' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3652:1: ( 'action' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3652:1: ( 'action' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3653:1: 'action'
            {
             before(grammarAccess.getGenericActionAccess().getActionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__GenericAction__Group__0__Impl7268); 
             after(grammarAccess.getGenericActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericAction__Group__0__Impl


    // $ANTLR start rule__GenericAction__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3666:1: rule__GenericAction__Group__1 : rule__GenericAction__Group__1__Impl ;
    public final void rule__GenericAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3670:1: ( rule__GenericAction__Group__1__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3671:2: rule__GenericAction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericAction__Group__1__Impl_in_rule__GenericAction__Group__17299);
            rule__GenericAction__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericAction__Group__1


    // $ANTLR start rule__GenericAction__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3677:1: rule__GenericAction__Group__1__Impl : ( ( rule__GenericAction__NameAssignment_1 ) ) ;
    public final void rule__GenericAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3681:1: ( ( ( rule__GenericAction__NameAssignment_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3682:1: ( ( rule__GenericAction__NameAssignment_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3682:1: ( ( rule__GenericAction__NameAssignment_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3683:1: ( rule__GenericAction__NameAssignment_1 )
            {
             before(grammarAccess.getGenericActionAccess().getNameAssignment_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3684:1: ( rule__GenericAction__NameAssignment_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3684:2: rule__GenericAction__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GenericAction__NameAssignment_1_in_rule__GenericAction__Group__1__Impl7326);
            rule__GenericAction__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getGenericActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericAction__Group__1__Impl


    // $ANTLR start rule__GoToURLAction__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3698:1: rule__GoToURLAction__Group__0 : rule__GoToURLAction__Group__0__Impl rule__GoToURLAction__Group__1 ;
    public final void rule__GoToURLAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3702:1: ( rule__GoToURLAction__Group__0__Impl rule__GoToURLAction__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3703:2: rule__GoToURLAction__Group__0__Impl rule__GoToURLAction__Group__1
            {
            pushFollow(FOLLOW_rule__GoToURLAction__Group__0__Impl_in_rule__GoToURLAction__Group__07360);
            rule__GoToURLAction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GoToURLAction__Group__1_in_rule__GoToURLAction__Group__07363);
            rule__GoToURLAction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GoToURLAction__Group__0


    // $ANTLR start rule__GoToURLAction__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3710:1: rule__GoToURLAction__Group__0__Impl : ( 'go to' ) ;
    public final void rule__GoToURLAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3714:1: ( ( 'go to' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3715:1: ( 'go to' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3715:1: ( 'go to' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3716:1: 'go to'
            {
             before(grammarAccess.getGoToURLActionAccess().getGoToKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__GoToURLAction__Group__0__Impl7391); 
             after(grammarAccess.getGoToURLActionAccess().getGoToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GoToURLAction__Group__0__Impl


    // $ANTLR start rule__GoToURLAction__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3729:1: rule__GoToURLAction__Group__1 : rule__GoToURLAction__Group__1__Impl ;
    public final void rule__GoToURLAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3733:1: ( rule__GoToURLAction__Group__1__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3734:2: rule__GoToURLAction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GoToURLAction__Group__1__Impl_in_rule__GoToURLAction__Group__17422);
            rule__GoToURLAction__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GoToURLAction__Group__1


    // $ANTLR start rule__GoToURLAction__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3740:1: rule__GoToURLAction__Group__1__Impl : ( ( rule__GoToURLAction__UrlAssignment_1 ) ) ;
    public final void rule__GoToURLAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3744:1: ( ( ( rule__GoToURLAction__UrlAssignment_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3745:1: ( ( rule__GoToURLAction__UrlAssignment_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3745:1: ( ( rule__GoToURLAction__UrlAssignment_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3746:1: ( rule__GoToURLAction__UrlAssignment_1 )
            {
             before(grammarAccess.getGoToURLActionAccess().getUrlAssignment_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3747:1: ( rule__GoToURLAction__UrlAssignment_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3747:2: rule__GoToURLAction__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__GoToURLAction__UrlAssignment_1_in_rule__GoToURLAction__Group__1__Impl7449);
            rule__GoToURLAction__UrlAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getGoToURLActionAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GoToURLAction__Group__1__Impl


    // $ANTLR start rule__ShowLayoutAction__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3761:1: rule__ShowLayoutAction__Group__0 : rule__ShowLayoutAction__Group__0__Impl rule__ShowLayoutAction__Group__1 ;
    public final void rule__ShowLayoutAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3765:1: ( rule__ShowLayoutAction__Group__0__Impl rule__ShowLayoutAction__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3766:2: rule__ShowLayoutAction__Group__0__Impl rule__ShowLayoutAction__Group__1
            {
            pushFollow(FOLLOW_rule__ShowLayoutAction__Group__0__Impl_in_rule__ShowLayoutAction__Group__07483);
            rule__ShowLayoutAction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ShowLayoutAction__Group__1_in_rule__ShowLayoutAction__Group__07486);
            rule__ShowLayoutAction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ShowLayoutAction__Group__0


    // $ANTLR start rule__ShowLayoutAction__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3773:1: rule__ShowLayoutAction__Group__0__Impl : ( 'show' ) ;
    public final void rule__ShowLayoutAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3777:1: ( ( 'show' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3778:1: ( 'show' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3778:1: ( 'show' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3779:1: 'show'
            {
             before(grammarAccess.getShowLayoutActionAccess().getShowKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__ShowLayoutAction__Group__0__Impl7514); 
             after(grammarAccess.getShowLayoutActionAccess().getShowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ShowLayoutAction__Group__0__Impl


    // $ANTLR start rule__ShowLayoutAction__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3792:1: rule__ShowLayoutAction__Group__1 : rule__ShowLayoutAction__Group__1__Impl ;
    public final void rule__ShowLayoutAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3796:1: ( rule__ShowLayoutAction__Group__1__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3797:2: rule__ShowLayoutAction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ShowLayoutAction__Group__1__Impl_in_rule__ShowLayoutAction__Group__17545);
            rule__ShowLayoutAction__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ShowLayoutAction__Group__1


    // $ANTLR start rule__ShowLayoutAction__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3803:1: rule__ShowLayoutAction__Group__1__Impl : ( ( rule__ShowLayoutAction__LayoutAssignment_1 ) ) ;
    public final void rule__ShowLayoutAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3807:1: ( ( ( rule__ShowLayoutAction__LayoutAssignment_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3808:1: ( ( rule__ShowLayoutAction__LayoutAssignment_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3808:1: ( ( rule__ShowLayoutAction__LayoutAssignment_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3809:1: ( rule__ShowLayoutAction__LayoutAssignment_1 )
            {
             before(grammarAccess.getShowLayoutActionAccess().getLayoutAssignment_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3810:1: ( rule__ShowLayoutAction__LayoutAssignment_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3810:2: rule__ShowLayoutAction__LayoutAssignment_1
            {
            pushFollow(FOLLOW_rule__ShowLayoutAction__LayoutAssignment_1_in_rule__ShowLayoutAction__Group__1__Impl7572);
            rule__ShowLayoutAction__LayoutAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getShowLayoutActionAccess().getLayoutAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ShowLayoutAction__Group__1__Impl


    // $ANTLR start rule__InvokeActivityAction__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3824:1: rule__InvokeActivityAction__Group__0 : rule__InvokeActivityAction__Group__0__Impl rule__InvokeActivityAction__Group__1 ;
    public final void rule__InvokeActivityAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3828:1: ( rule__InvokeActivityAction__Group__0__Impl rule__InvokeActivityAction__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3829:2: rule__InvokeActivityAction__Group__0__Impl rule__InvokeActivityAction__Group__1
            {
            pushFollow(FOLLOW_rule__InvokeActivityAction__Group__0__Impl_in_rule__InvokeActivityAction__Group__07606);
            rule__InvokeActivityAction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InvokeActivityAction__Group__1_in_rule__InvokeActivityAction__Group__07609);
            rule__InvokeActivityAction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InvokeActivityAction__Group__0


    // $ANTLR start rule__InvokeActivityAction__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3836:1: rule__InvokeActivityAction__Group__0__Impl : ( 'invoke' ) ;
    public final void rule__InvokeActivityAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3840:1: ( ( 'invoke' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3841:1: ( 'invoke' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3841:1: ( 'invoke' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3842:1: 'invoke'
            {
             before(grammarAccess.getInvokeActivityActionAccess().getInvokeKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__InvokeActivityAction__Group__0__Impl7637); 
             after(grammarAccess.getInvokeActivityActionAccess().getInvokeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InvokeActivityAction__Group__0__Impl


    // $ANTLR start rule__InvokeActivityAction__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3855:1: rule__InvokeActivityAction__Group__1 : rule__InvokeActivityAction__Group__1__Impl ;
    public final void rule__InvokeActivityAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3859:1: ( rule__InvokeActivityAction__Group__1__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3860:2: rule__InvokeActivityAction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InvokeActivityAction__Group__1__Impl_in_rule__InvokeActivityAction__Group__17668);
            rule__InvokeActivityAction__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InvokeActivityAction__Group__1


    // $ANTLR start rule__InvokeActivityAction__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3866:1: rule__InvokeActivityAction__Group__1__Impl : ( ( rule__InvokeActivityAction__ActivityAssignment_1 ) ) ;
    public final void rule__InvokeActivityAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3870:1: ( ( ( rule__InvokeActivityAction__ActivityAssignment_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3871:1: ( ( rule__InvokeActivityAction__ActivityAssignment_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3871:1: ( ( rule__InvokeActivityAction__ActivityAssignment_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3872:1: ( rule__InvokeActivityAction__ActivityAssignment_1 )
            {
             before(grammarAccess.getInvokeActivityActionAccess().getActivityAssignment_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3873:1: ( rule__InvokeActivityAction__ActivityAssignment_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3873:2: rule__InvokeActivityAction__ActivityAssignment_1
            {
            pushFollow(FOLLOW_rule__InvokeActivityAction__ActivityAssignment_1_in_rule__InvokeActivityAction__Group__1__Impl7695);
            rule__InvokeActivityAction__ActivityAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getInvokeActivityActionAccess().getActivityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InvokeActivityAction__Group__1__Impl


    // $ANTLR start rule__LoadResourceAction__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3887:1: rule__LoadResourceAction__Group__0 : rule__LoadResourceAction__Group__0__Impl rule__LoadResourceAction__Group__1 ;
    public final void rule__LoadResourceAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3891:1: ( rule__LoadResourceAction__Group__0__Impl rule__LoadResourceAction__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3892:2: rule__LoadResourceAction__Group__0__Impl rule__LoadResourceAction__Group__1
            {
            pushFollow(FOLLOW_rule__LoadResourceAction__Group__0__Impl_in_rule__LoadResourceAction__Group__07729);
            rule__LoadResourceAction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LoadResourceAction__Group__1_in_rule__LoadResourceAction__Group__07732);
            rule__LoadResourceAction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group__0


    // $ANTLR start rule__LoadResourceAction__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3899:1: rule__LoadResourceAction__Group__0__Impl : ( 'load' ) ;
    public final void rule__LoadResourceAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3903:1: ( ( 'load' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3904:1: ( 'load' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3904:1: ( 'load' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3905:1: 'load'
            {
             before(grammarAccess.getLoadResourceActionAccess().getLoadKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__LoadResourceAction__Group__0__Impl7760); 
             after(grammarAccess.getLoadResourceActionAccess().getLoadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group__0__Impl


    // $ANTLR start rule__LoadResourceAction__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3918:1: rule__LoadResourceAction__Group__1 : rule__LoadResourceAction__Group__1__Impl rule__LoadResourceAction__Group__2 ;
    public final void rule__LoadResourceAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3922:1: ( rule__LoadResourceAction__Group__1__Impl rule__LoadResourceAction__Group__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3923:2: rule__LoadResourceAction__Group__1__Impl rule__LoadResourceAction__Group__2
            {
            pushFollow(FOLLOW_rule__LoadResourceAction__Group__1__Impl_in_rule__LoadResourceAction__Group__17791);
            rule__LoadResourceAction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LoadResourceAction__Group__2_in_rule__LoadResourceAction__Group__17794);
            rule__LoadResourceAction__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group__1


    // $ANTLR start rule__LoadResourceAction__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3930:1: rule__LoadResourceAction__Group__1__Impl : ( ( rule__LoadResourceAction__ResourceAssignment_1 ) ) ;
    public final void rule__LoadResourceAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3934:1: ( ( ( rule__LoadResourceAction__ResourceAssignment_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3935:1: ( ( rule__LoadResourceAction__ResourceAssignment_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3935:1: ( ( rule__LoadResourceAction__ResourceAssignment_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3936:1: ( rule__LoadResourceAction__ResourceAssignment_1 )
            {
             before(grammarAccess.getLoadResourceActionAccess().getResourceAssignment_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3937:1: ( rule__LoadResourceAction__ResourceAssignment_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3937:2: rule__LoadResourceAction__ResourceAssignment_1
            {
            pushFollow(FOLLOW_rule__LoadResourceAction__ResourceAssignment_1_in_rule__LoadResourceAction__Group__1__Impl7821);
            rule__LoadResourceAction__ResourceAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLoadResourceActionAccess().getResourceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group__1__Impl


    // $ANTLR start rule__LoadResourceAction__Group__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3947:1: rule__LoadResourceAction__Group__2 : rule__LoadResourceAction__Group__2__Impl rule__LoadResourceAction__Group__3 ;
    public final void rule__LoadResourceAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3951:1: ( rule__LoadResourceAction__Group__2__Impl rule__LoadResourceAction__Group__3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3952:2: rule__LoadResourceAction__Group__2__Impl rule__LoadResourceAction__Group__3
            {
            pushFollow(FOLLOW_rule__LoadResourceAction__Group__2__Impl_in_rule__LoadResourceAction__Group__27851);
            rule__LoadResourceAction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LoadResourceAction__Group__3_in_rule__LoadResourceAction__Group__27854);
            rule__LoadResourceAction__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group__2


    // $ANTLR start rule__LoadResourceAction__Group__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3959:1: rule__LoadResourceAction__Group__2__Impl : ( ( rule__LoadResourceAction__Group_2__0 )? ) ;
    public final void rule__LoadResourceAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3963:1: ( ( ( rule__LoadResourceAction__Group_2__0 )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3964:1: ( ( rule__LoadResourceAction__Group_2__0 )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3964:1: ( ( rule__LoadResourceAction__Group_2__0 )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3965:1: ( rule__LoadResourceAction__Group_2__0 )?
            {
             before(grammarAccess.getLoadResourceActionAccess().getGroup_2()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3966:1: ( rule__LoadResourceAction__Group_2__0 )?
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
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3966:2: rule__LoadResourceAction__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__LoadResourceAction__Group_2__0_in_rule__LoadResourceAction__Group__2__Impl7881);
                    rule__LoadResourceAction__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadResourceActionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group__2__Impl


    // $ANTLR start rule__LoadResourceAction__Group__3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3976:1: rule__LoadResourceAction__Group__3 : rule__LoadResourceAction__Group__3__Impl ;
    public final void rule__LoadResourceAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3980:1: ( rule__LoadResourceAction__Group__3__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3981:2: rule__LoadResourceAction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LoadResourceAction__Group__3__Impl_in_rule__LoadResourceAction__Group__37912);
            rule__LoadResourceAction__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group__3


    // $ANTLR start rule__LoadResourceAction__Group__3__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3987:1: rule__LoadResourceAction__Group__3__Impl : ( ( rule__LoadResourceAction__Group_3__0 )? ) ;
    public final void rule__LoadResourceAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3991:1: ( ( ( rule__LoadResourceAction__Group_3__0 )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3992:1: ( ( rule__LoadResourceAction__Group_3__0 )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3992:1: ( ( rule__LoadResourceAction__Group_3__0 )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3993:1: ( rule__LoadResourceAction__Group_3__0 )?
            {
             before(grammarAccess.getLoadResourceActionAccess().getGroup_3()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3994:1: ( rule__LoadResourceAction__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:3994:2: rule__LoadResourceAction__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__LoadResourceAction__Group_3__0_in_rule__LoadResourceAction__Group__3__Impl7939);
                    rule__LoadResourceAction__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadResourceActionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group__3__Impl


    // $ANTLR start rule__LoadResourceAction__Group_2__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4012:1: rule__LoadResourceAction__Group_2__0 : rule__LoadResourceAction__Group_2__0__Impl rule__LoadResourceAction__Group_2__1 ;
    public final void rule__LoadResourceAction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4016:1: ( rule__LoadResourceAction__Group_2__0__Impl rule__LoadResourceAction__Group_2__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4017:2: rule__LoadResourceAction__Group_2__0__Impl rule__LoadResourceAction__Group_2__1
            {
            pushFollow(FOLLOW_rule__LoadResourceAction__Group_2__0__Impl_in_rule__LoadResourceAction__Group_2__07978);
            rule__LoadResourceAction__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LoadResourceAction__Group_2__1_in_rule__LoadResourceAction__Group_2__07981);
            rule__LoadResourceAction__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group_2__0


    // $ANTLR start rule__LoadResourceAction__Group_2__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4024:1: rule__LoadResourceAction__Group_2__0__Impl : ( '->' ) ;
    public final void rule__LoadResourceAction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4028:1: ( ( '->' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4029:1: ( '->' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4029:1: ( '->' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4030:1: '->'
            {
             before(grammarAccess.getLoadResourceActionAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__LoadResourceAction__Group_2__0__Impl8009); 
             after(grammarAccess.getLoadResourceActionAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group_2__0__Impl


    // $ANTLR start rule__LoadResourceAction__Group_2__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4043:1: rule__LoadResourceAction__Group_2__1 : rule__LoadResourceAction__Group_2__1__Impl ;
    public final void rule__LoadResourceAction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4047:1: ( rule__LoadResourceAction__Group_2__1__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4048:2: rule__LoadResourceAction__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__LoadResourceAction__Group_2__1__Impl_in_rule__LoadResourceAction__Group_2__18040);
            rule__LoadResourceAction__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group_2__1


    // $ANTLR start rule__LoadResourceAction__Group_2__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4054:1: rule__LoadResourceAction__Group_2__1__Impl : ( ( rule__LoadResourceAction__ToVarAssignment_2_1 ) ) ;
    public final void rule__LoadResourceAction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4058:1: ( ( ( rule__LoadResourceAction__ToVarAssignment_2_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4059:1: ( ( rule__LoadResourceAction__ToVarAssignment_2_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4059:1: ( ( rule__LoadResourceAction__ToVarAssignment_2_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4060:1: ( rule__LoadResourceAction__ToVarAssignment_2_1 )
            {
             before(grammarAccess.getLoadResourceActionAccess().getToVarAssignment_2_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4061:1: ( rule__LoadResourceAction__ToVarAssignment_2_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4061:2: rule__LoadResourceAction__ToVarAssignment_2_1
            {
            pushFollow(FOLLOW_rule__LoadResourceAction__ToVarAssignment_2_1_in_rule__LoadResourceAction__Group_2__1__Impl8067);
            rule__LoadResourceAction__ToVarAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getLoadResourceActionAccess().getToVarAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group_2__1__Impl


    // $ANTLR start rule__LoadResourceAction__Group_3__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4075:1: rule__LoadResourceAction__Group_3__0 : rule__LoadResourceAction__Group_3__0__Impl rule__LoadResourceAction__Group_3__1 ;
    public final void rule__LoadResourceAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4079:1: ( rule__LoadResourceAction__Group_3__0__Impl rule__LoadResourceAction__Group_3__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4080:2: rule__LoadResourceAction__Group_3__0__Impl rule__LoadResourceAction__Group_3__1
            {
            pushFollow(FOLLOW_rule__LoadResourceAction__Group_3__0__Impl_in_rule__LoadResourceAction__Group_3__08101);
            rule__LoadResourceAction__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LoadResourceAction__Group_3__1_in_rule__LoadResourceAction__Group_3__08104);
            rule__LoadResourceAction__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group_3__0


    // $ANTLR start rule__LoadResourceAction__Group_3__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4087:1: rule__LoadResourceAction__Group_3__0__Impl : ( '=>' ) ;
    public final void rule__LoadResourceAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4091:1: ( ( '=>' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4092:1: ( '=>' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4092:1: ( '=>' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4093:1: '=>'
            {
             before(grammarAccess.getLoadResourceActionAccess().getEqualsSignGreaterThanSignKeyword_3_0()); 
            match(input,38,FOLLOW_38_in_rule__LoadResourceAction__Group_3__0__Impl8132); 
             after(grammarAccess.getLoadResourceActionAccess().getEqualsSignGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group_3__0__Impl


    // $ANTLR start rule__LoadResourceAction__Group_3__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4106:1: rule__LoadResourceAction__Group_3__1 : rule__LoadResourceAction__Group_3__1__Impl ;
    public final void rule__LoadResourceAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4110:1: ( rule__LoadResourceAction__Group_3__1__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4111:2: rule__LoadResourceAction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__LoadResourceAction__Group_3__1__Impl_in_rule__LoadResourceAction__Group_3__18163);
            rule__LoadResourceAction__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group_3__1


    // $ANTLR start rule__LoadResourceAction__Group_3__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4117:1: rule__LoadResourceAction__Group_3__1__Impl : ( ( rule__LoadResourceAction__AfterLoadAssignment_3_1 ) ) ;
    public final void rule__LoadResourceAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4121:1: ( ( ( rule__LoadResourceAction__AfterLoadAssignment_3_1 ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4122:1: ( ( rule__LoadResourceAction__AfterLoadAssignment_3_1 ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4122:1: ( ( rule__LoadResourceAction__AfterLoadAssignment_3_1 ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4123:1: ( rule__LoadResourceAction__AfterLoadAssignment_3_1 )
            {
             before(grammarAccess.getLoadResourceActionAccess().getAfterLoadAssignment_3_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4124:1: ( rule__LoadResourceAction__AfterLoadAssignment_3_1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4124:2: rule__LoadResourceAction__AfterLoadAssignment_3_1
            {
            pushFollow(FOLLOW_rule__LoadResourceAction__AfterLoadAssignment_3_1_in_rule__LoadResourceAction__Group_3__1__Impl8190);
            rule__LoadResourceAction__AfterLoadAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getLoadResourceActionAccess().getAfterLoadAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__Group_3__1__Impl


    // $ANTLR start rule__QualifiedName__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4138:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4142:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4143:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08224);
            rule__QualifiedName__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08227);
            rule__QualifiedName__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group__0


    // $ANTLR start rule__QualifiedName__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4150:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4154:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4155:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4155:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4156:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8254); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group__0__Impl


    // $ANTLR start rule__QualifiedName__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4167:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4171:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4172:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18283);
            rule__QualifiedName__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group__1


    // $ANTLR start rule__QualifiedName__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4178:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4182:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4183:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4183:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4184:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4185:1: ( rule__QualifiedName__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4185:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8310);
            	    rule__QualifiedName__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group__1__Impl


    // $ANTLR start rule__QualifiedName__Group_1__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4199:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4203:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4204:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08345);
            rule__QualifiedName__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08348);
            rule__QualifiedName__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group_1__0


    // $ANTLR start rule__QualifiedName__Group_1__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4211:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4215:1: ( ( '.' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4216:1: ( '.' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4216:1: ( '.' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4217:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__QualifiedName__Group_1__0__Impl8376); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group_1__0__Impl


    // $ANTLR start rule__QualifiedName__Group_1__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4230:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4234:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4235:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18407);
            rule__QualifiedName__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group_1__1


    // $ANTLR start rule__QualifiedName__Group_1__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4241:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4245:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4246:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4246:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4247:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8434); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group_1__1__Impl


    // $ANTLR start rule__URL__Group__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4262:1: rule__URL__Group__0 : rule__URL__Group__0__Impl rule__URL__Group__1 ;
    public final void rule__URL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4266:1: ( rule__URL__Group__0__Impl rule__URL__Group__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4267:2: rule__URL__Group__0__Impl rule__URL__Group__1
            {
            pushFollow(FOLLOW_rule__URL__Group__0__Impl_in_rule__URL__Group__08467);
            rule__URL__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__URL__Group__1_in_rule__URL__Group__08470);
            rule__URL__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group__0


    // $ANTLR start rule__URL__Group__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4274:1: rule__URL__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__URL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4278:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4279:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4279:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4280:1: RULE_ID
            {
             before(grammarAccess.getURLAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URL__Group__0__Impl8497); 
             after(grammarAccess.getURLAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group__0__Impl


    // $ANTLR start rule__URL__Group__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4291:1: rule__URL__Group__1 : rule__URL__Group__1__Impl rule__URL__Group__2 ;
    public final void rule__URL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4295:1: ( rule__URL__Group__1__Impl rule__URL__Group__2 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4296:2: rule__URL__Group__1__Impl rule__URL__Group__2
            {
            pushFollow(FOLLOW_rule__URL__Group__1__Impl_in_rule__URL__Group__18526);
            rule__URL__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__URL__Group__2_in_rule__URL__Group__18529);
            rule__URL__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group__1


    // $ANTLR start rule__URL__Group__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4303:1: rule__URL__Group__1__Impl : ( '://' ) ;
    public final void rule__URL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4307:1: ( ( '://' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4308:1: ( '://' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4308:1: ( '://' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4309:1: '://'
            {
             before(grammarAccess.getURLAccess().getColonSolidusSolidusKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__URL__Group__1__Impl8557); 
             after(grammarAccess.getURLAccess().getColonSolidusSolidusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group__1__Impl


    // $ANTLR start rule__URL__Group__2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4322:1: rule__URL__Group__2 : rule__URL__Group__2__Impl rule__URL__Group__3 ;
    public final void rule__URL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4326:1: ( rule__URL__Group__2__Impl rule__URL__Group__3 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4327:2: rule__URL__Group__2__Impl rule__URL__Group__3
            {
            pushFollow(FOLLOW_rule__URL__Group__2__Impl_in_rule__URL__Group__28588);
            rule__URL__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__URL__Group__3_in_rule__URL__Group__28591);
            rule__URL__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group__2


    // $ANTLR start rule__URL__Group__2__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4334:1: rule__URL__Group__2__Impl : ( ruleQualifiedName ) ;
    public final void rule__URL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4338:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4339:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4339:1: ( ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4340:1: ruleQualifiedName
            {
             before(grammarAccess.getURLAccess().getQualifiedNameParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__URL__Group__2__Impl8618);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getURLAccess().getQualifiedNameParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group__2__Impl


    // $ANTLR start rule__URL__Group__3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4351:1: rule__URL__Group__3 : rule__URL__Group__3__Impl ;
    public final void rule__URL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4355:1: ( rule__URL__Group__3__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4356:2: rule__URL__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__URL__Group__3__Impl_in_rule__URL__Group__38647);
            rule__URL__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group__3


    // $ANTLR start rule__URL__Group__3__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4362:1: rule__URL__Group__3__Impl : ( ( rule__URL__Group_3__0 )? ) ;
    public final void rule__URL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4366:1: ( ( ( rule__URL__Group_3__0 )? ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4367:1: ( ( rule__URL__Group_3__0 )? )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4367:1: ( ( rule__URL__Group_3__0 )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4368:1: ( rule__URL__Group_3__0 )?
            {
             before(grammarAccess.getURLAccess().getGroup_3()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4369:1: ( rule__URL__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4369:2: rule__URL__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__URL__Group_3__0_in_rule__URL__Group__3__Impl8674);
                    rule__URL__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getURLAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group__3__Impl


    // $ANTLR start rule__URL__Group_3__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4387:1: rule__URL__Group_3__0 : rule__URL__Group_3__0__Impl rule__URL__Group_3__1 ;
    public final void rule__URL__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4391:1: ( rule__URL__Group_3__0__Impl rule__URL__Group_3__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4392:2: rule__URL__Group_3__0__Impl rule__URL__Group_3__1
            {
            pushFollow(FOLLOW_rule__URL__Group_3__0__Impl_in_rule__URL__Group_3__08713);
            rule__URL__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__URL__Group_3__1_in_rule__URL__Group_3__08716);
            rule__URL__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group_3__0


    // $ANTLR start rule__URL__Group_3__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4399:1: rule__URL__Group_3__0__Impl : ( '/' ) ;
    public final void rule__URL__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4403:1: ( ( '/' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4404:1: ( '/' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4404:1: ( '/' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4405:1: '/'
            {
             before(grammarAccess.getURLAccess().getSolidusKeyword_3_0()); 
            match(input,41,FOLLOW_41_in_rule__URL__Group_3__0__Impl8744); 
             after(grammarAccess.getURLAccess().getSolidusKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group_3__0__Impl


    // $ANTLR start rule__URL__Group_3__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4418:1: rule__URL__Group_3__1 : rule__URL__Group_3__1__Impl ;
    public final void rule__URL__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4422:1: ( rule__URL__Group_3__1__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4423:2: rule__URL__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__URL__Group_3__1__Impl_in_rule__URL__Group_3__18775);
            rule__URL__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group_3__1


    // $ANTLR start rule__URL__Group_3__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4429:1: rule__URL__Group_3__1__Impl : ( ( rule__URL__Group_3_1__0 )* ) ;
    public final void rule__URL__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4433:1: ( ( ( rule__URL__Group_3_1__0 )* ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4434:1: ( ( rule__URL__Group_3_1__0 )* )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4434:1: ( ( rule__URL__Group_3_1__0 )* )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4435:1: ( rule__URL__Group_3_1__0 )*
            {
             before(grammarAccess.getURLAccess().getGroup_3_1()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4436:1: ( rule__URL__Group_3_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4436:2: rule__URL__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__URL__Group_3_1__0_in_rule__URL__Group_3__1__Impl8802);
            	    rule__URL__Group_3_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getURLAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group_3__1__Impl


    // $ANTLR start rule__URL__Group_3_1__0
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4450:1: rule__URL__Group_3_1__0 : rule__URL__Group_3_1__0__Impl rule__URL__Group_3_1__1 ;
    public final void rule__URL__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4454:1: ( rule__URL__Group_3_1__0__Impl rule__URL__Group_3_1__1 )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4455:2: rule__URL__Group_3_1__0__Impl rule__URL__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__URL__Group_3_1__0__Impl_in_rule__URL__Group_3_1__08837);
            rule__URL__Group_3_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__URL__Group_3_1__1_in_rule__URL__Group_3_1__08840);
            rule__URL__Group_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group_3_1__0


    // $ANTLR start rule__URL__Group_3_1__0__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4462:1: rule__URL__Group_3_1__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__URL__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4466:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4467:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4467:1: ( ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4468:1: ruleQualifiedName
            {
             before(grammarAccess.getURLAccess().getQualifiedNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__URL__Group_3_1__0__Impl8867);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getURLAccess().getQualifiedNameParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group_3_1__0__Impl


    // $ANTLR start rule__URL__Group_3_1__1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4479:1: rule__URL__Group_3_1__1 : rule__URL__Group_3_1__1__Impl ;
    public final void rule__URL__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4483:1: ( rule__URL__Group_3_1__1__Impl )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4484:2: rule__URL__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__URL__Group_3_1__1__Impl_in_rule__URL__Group_3_1__18896);
            rule__URL__Group_3_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group_3_1__1


    // $ANTLR start rule__URL__Group_3_1__1__Impl
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4490:1: rule__URL__Group_3_1__1__Impl : ( '/' ) ;
    public final void rule__URL__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4494:1: ( ( '/' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4495:1: ( '/' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4495:1: ( '/' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4496:1: '/'
            {
             before(grammarAccess.getURLAccess().getSolidusKeyword_3_1_1()); 
            match(input,41,FOLLOW_41_in_rule__URL__Group_3_1__1__Impl8924); 
             after(grammarAccess.getURLAccess().getSolidusKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URL__Group_3_1__1__Impl


    // $ANTLR start rule__Application__NameAssignment_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4514:1: rule__Application__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4518:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4519:1: ( RULE_STRING )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4519:1: ( RULE_STRING )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4520:1: RULE_STRING
            {
             before(grammarAccess.getApplicationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Application__NameAssignment_18964); 
             after(grammarAccess.getApplicationAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__NameAssignment_1


    // $ANTLR start rule__Application__PackageAssignment_2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4529:1: rule__Application__PackageAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Application__PackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4533:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4534:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4534:1: ( ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4535:1: ruleQualifiedName
            {
             before(grammarAccess.getApplicationAccess().getPackageQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Application__PackageAssignment_28995);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getApplicationAccess().getPackageQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__PackageAssignment_2


    // $ANTLR start rule__Application__ManifestAssignment_4
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4544:1: rule__Application__ManifestAssignment_4 : ( ruleManifestFile ) ;
    public final void rule__Application__ManifestAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4548:1: ( ( ruleManifestFile ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4549:1: ( ruleManifestFile )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4549:1: ( ruleManifestFile )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4550:1: ruleManifestFile
            {
             before(grammarAccess.getApplicationAccess().getManifestManifestFileParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleManifestFile_in_rule__Application__ManifestAssignment_49026);
            ruleManifestFile();
            _fsp--;

             after(grammarAccess.getApplicationAccess().getManifestManifestFileParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__ManifestAssignment_4


    // $ANTLR start rule__Application__LayoutsAssignment_5
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4559:1: rule__Application__LayoutsAssignment_5 : ( ruleLayout ) ;
    public final void rule__Application__LayoutsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4563:1: ( ( ruleLayout ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4564:1: ( ruleLayout )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4564:1: ( ruleLayout )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4565:1: ruleLayout
            {
             before(grammarAccess.getApplicationAccess().getLayoutsLayoutParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleLayout_in_rule__Application__LayoutsAssignment_59057);
            ruleLayout();
            _fsp--;

             after(grammarAccess.getApplicationAccess().getLayoutsLayoutParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__LayoutsAssignment_5


    // $ANTLR start rule__Application__ActivitiesAssignment_6
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4574:1: rule__Application__ActivitiesAssignment_6 : ( ruleActivity ) ;
    public final void rule__Application__ActivitiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4578:1: ( ( ruleActivity ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4579:1: ( ruleActivity )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4579:1: ( ruleActivity )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4580:1: ruleActivity
            {
             before(grammarAccess.getApplicationAccess().getActivitiesActivityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleActivity_in_rule__Application__ActivitiesAssignment_69088);
            ruleActivity();
            _fsp--;

             after(grammarAccess.getApplicationAccess().getActivitiesActivityParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__ActivitiesAssignment_6


    // $ANTLR start rule__Layout__NameAssignment_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4589:1: rule__Layout__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Layout__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4593:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4594:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4594:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4595:1: RULE_ID
            {
             before(grammarAccess.getLayoutAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Layout__NameAssignment_19119); 
             after(grammarAccess.getLayoutAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Layout__NameAssignment_1


    // $ANTLR start rule__Layout__WidgetsAssignment_3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4604:1: rule__Layout__WidgetsAssignment_3 : ( ruleWidget ) ;
    public final void rule__Layout__WidgetsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4608:1: ( ( ruleWidget ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4609:1: ( ruleWidget )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4609:1: ( ruleWidget )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4610:1: ruleWidget
            {
             before(grammarAccess.getLayoutAccess().getWidgetsWidgetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleWidget_in_rule__Layout__WidgetsAssignment_39150);
            ruleWidget();
            _fsp--;

             after(grammarAccess.getLayoutAccess().getWidgetsWidgetParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Layout__WidgetsAssignment_3


    // $ANTLR start rule__Widget__TopAssignment_1_2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4619:1: rule__Widget__TopAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__Widget__TopAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4623:1: ( ( RULE_INT ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4624:1: ( RULE_INT )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4624:1: ( RULE_INT )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4625:1: RULE_INT
            {
             before(grammarAccess.getWidgetAccess().getTopINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Widget__TopAssignment_1_29181); 
             after(grammarAccess.getWidgetAccess().getTopINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__TopAssignment_1_2


    // $ANTLR start rule__Widget__LeftAssignment_2_2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4634:1: rule__Widget__LeftAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__Widget__LeftAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4638:1: ( ( RULE_INT ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4639:1: ( RULE_INT )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4639:1: ( RULE_INT )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4640:1: RULE_INT
            {
             before(grammarAccess.getWidgetAccess().getLeftINTTerminalRuleCall_2_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Widget__LeftAssignment_2_29212); 
             after(grammarAccess.getWidgetAccess().getLeftINTTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__LeftAssignment_2_2


    // $ANTLR start rule__Widget__WidthAssignment_3_2
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4649:1: rule__Widget__WidthAssignment_3_2 : ( RULE_INT ) ;
    public final void rule__Widget__WidthAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4653:1: ( ( RULE_INT ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4654:1: ( RULE_INT )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4654:1: ( RULE_INT )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4655:1: RULE_INT
            {
             before(grammarAccess.getWidgetAccess().getWidthINTTerminalRuleCall_3_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Widget__WidthAssignment_3_29243); 
             after(grammarAccess.getWidgetAccess().getWidthINTTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__WidthAssignment_3_2


    // $ANTLR start rule__Widget__ActionsAssignment_4_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4664:1: rule__Widget__ActionsAssignment_4_1 : ( ruleAction ) ;
    public final void rule__Widget__ActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4668:1: ( ( ruleAction ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4669:1: ( ruleAction )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4669:1: ( ruleAction )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4670:1: ruleAction
            {
             before(grammarAccess.getWidgetAccess().getActionsActionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__Widget__ActionsAssignment_4_19274);
            ruleAction();
            _fsp--;

             after(grammarAccess.getWidgetAccess().getActionsActionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__ActionsAssignment_4_1


    // $ANTLR start rule__GenericWidget__IdAssignment_2_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4679:1: rule__GenericWidget__IdAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__GenericWidget__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4683:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4684:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4684:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4685:1: RULE_ID
            {
             before(grammarAccess.getGenericWidgetAccess().getIdIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GenericWidget__IdAssignment_2_19305); 
             after(grammarAccess.getGenericWidgetAccess().getIdIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__IdAssignment_2_1


    // $ANTLR start rule__GenericWidget__NameAssignment_3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4694:1: rule__GenericWidget__NameAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__GenericWidget__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4698:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4699:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4699:1: ( ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4700:1: ruleQualifiedName
            {
             before(grammarAccess.getGenericWidgetAccess().getNameQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__GenericWidget__NameAssignment_39336);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getGenericWidgetAccess().getNameQualifiedNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericWidget__NameAssignment_3


    // $ANTLR start rule__Button__IdAssignment_2_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4709:1: rule__Button__IdAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Button__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4713:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4714:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4714:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4715:1: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getIdIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Button__IdAssignment_2_19367); 
             after(grammarAccess.getButtonAccess().getIdIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__IdAssignment_2_1


    // $ANTLR start rule__Button__LabelAssignment_3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4724:1: rule__Button__LabelAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Button__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4728:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4729:1: ( RULE_STRING )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4729:1: ( RULE_STRING )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4730:1: RULE_STRING
            {
             before(grammarAccess.getButtonAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Button__LabelAssignment_39398); 
             after(grammarAccess.getButtonAccess().getLabelSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__LabelAssignment_3


    // $ANTLR start rule__Spinner__IdAssignment_2_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4739:1: rule__Spinner__IdAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Spinner__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4743:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4744:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4744:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4745:1: RULE_ID
            {
             before(grammarAccess.getSpinnerAccess().getIdIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Spinner__IdAssignment_2_19429); 
             after(grammarAccess.getSpinnerAccess().getIdIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__IdAssignment_2_1


    // $ANTLR start rule__Spinner__LabelAssignment_3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4754:1: rule__Spinner__LabelAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Spinner__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4758:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4759:1: ( RULE_STRING )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4759:1: ( RULE_STRING )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4760:1: RULE_STRING
            {
             before(grammarAccess.getSpinnerAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Spinner__LabelAssignment_39460); 
             after(grammarAccess.getSpinnerAccess().getLabelSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__LabelAssignment_3


    // $ANTLR start rule__EditText__IdAssignment_2_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4769:1: rule__EditText__IdAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__EditText__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4773:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4774:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4774:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4775:1: RULE_ID
            {
             before(grammarAccess.getEditTextAccess().getIdIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EditText__IdAssignment_2_19491); 
             after(grammarAccess.getEditTextAccess().getIdIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__IdAssignment_2_1


    // $ANTLR start rule__EditText__LabelAssignment_3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4784:1: rule__EditText__LabelAssignment_3 : ( RULE_STRING ) ;
    public final void rule__EditText__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4788:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4789:1: ( RULE_STRING )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4789:1: ( RULE_STRING )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4790:1: RULE_STRING
            {
             before(grammarAccess.getEditTextAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EditText__LabelAssignment_39522); 
             after(grammarAccess.getEditTextAccess().getLabelSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EditText__LabelAssignment_3


    // $ANTLR start rule__TextView__IdAssignment_2_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4799:1: rule__TextView__IdAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__TextView__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4803:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4804:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4804:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4805:1: RULE_ID
            {
             before(grammarAccess.getTextViewAccess().getIdIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextView__IdAssignment_2_19553); 
             after(grammarAccess.getTextViewAccess().getIdIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__IdAssignment_2_1


    // $ANTLR start rule__TextView__LabelAssignment_3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4814:1: rule__TextView__LabelAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TextView__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4818:1: ( ( RULE_STRING ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4819:1: ( RULE_STRING )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4819:1: ( RULE_STRING )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4820:1: RULE_STRING
            {
             before(grammarAccess.getTextViewAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextView__LabelAssignment_39584); 
             after(grammarAccess.getTextViewAccess().getLabelSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextView__LabelAssignment_3


    // $ANTLR start rule__GenericActivity__NameAssignment_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4829:1: rule__GenericActivity__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__GenericActivity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4833:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4834:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4834:1: ( ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4835:1: ruleQualifiedName
            {
             before(grammarAccess.getGenericActivityAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__GenericActivity__NameAssignment_19615);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getGenericActivityAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericActivity__NameAssignment_1


    // $ANTLR start rule__GenericActivity__ActionsAssignment_3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4844:1: rule__GenericActivity__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__GenericActivity__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4848:1: ( ( ruleAction ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4849:1: ( ruleAction )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4849:1: ( ruleAction )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4850:1: ruleAction
            {
             before(grammarAccess.getGenericActivityAccess().getActionsActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__GenericActivity__ActionsAssignment_39646);
            ruleAction();
            _fsp--;

             after(grammarAccess.getGenericActivityAccess().getActionsActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericActivity__ActionsAssignment_3


    // $ANTLR start rule__ListActivity__NameAssignment_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4859:1: rule__ListActivity__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ListActivity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4863:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4864:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4864:1: ( ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4865:1: ruleQualifiedName
            {
             before(grammarAccess.getListActivityAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ListActivity__NameAssignment_19677);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getListActivityAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__NameAssignment_1


    // $ANTLR start rule__ListActivity__DataSourceAssignment_4
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4874:1: rule__ListActivity__DataSourceAssignment_4 : ( RULE_ID ) ;
    public final void rule__ListActivity__DataSourceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4878:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4879:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4879:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4880:1: RULE_ID
            {
             before(grammarAccess.getListActivityAccess().getDataSourceIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListActivity__DataSourceAssignment_49708); 
             after(grammarAccess.getListActivityAccess().getDataSourceIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__DataSourceAssignment_4


    // $ANTLR start rule__ListActivity__LayoutAssignment_5_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4889:1: rule__ListActivity__LayoutAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListActivity__LayoutAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4893:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4894:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4894:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4895:1: ( RULE_ID )
            {
             before(grammarAccess.getListActivityAccess().getLayoutLayoutCrossReference_5_1_0()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4896:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4897:1: RULE_ID
            {
             before(grammarAccess.getListActivityAccess().getLayoutLayoutIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListActivity__LayoutAssignment_5_19743); 
             after(grammarAccess.getListActivityAccess().getLayoutLayoutIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getListActivityAccess().getLayoutLayoutCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__LayoutAssignment_5_1


    // $ANTLR start rule__ListActivity__ItemLayoutAssignment_7
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4908:1: rule__ListActivity__ItemLayoutAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ListActivity__ItemLayoutAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4912:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4913:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4913:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4914:1: ( RULE_ID )
            {
             before(grammarAccess.getListActivityAccess().getItemLayoutLayoutCrossReference_7_0()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4915:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4916:1: RULE_ID
            {
             before(grammarAccess.getListActivityAccess().getItemLayoutLayoutIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListActivity__ItemLayoutAssignment_79782); 
             after(grammarAccess.getListActivityAccess().getItemLayoutLayoutIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getListActivityAccess().getItemLayoutLayoutCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__ItemLayoutAssignment_7


    // $ANTLR start rule__ListActivity__ActionsAssignment_8
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4927:1: rule__ListActivity__ActionsAssignment_8 : ( ruleAction ) ;
    public final void rule__ListActivity__ActionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4931:1: ( ( ruleAction ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4932:1: ( ruleAction )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4932:1: ( ruleAction )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4933:1: ruleAction
            {
             before(grammarAccess.getListActivityAccess().getActionsActionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__ListActivity__ActionsAssignment_89817);
            ruleAction();
            _fsp--;

             after(grammarAccess.getListActivityAccess().getActionsActionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListActivity__ActionsAssignment_8


    // $ANTLR start rule__TabActivity__NameAssignment_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4942:1: rule__TabActivity__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__TabActivity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4946:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4947:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4947:1: ( ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4948:1: ruleQualifiedName
            {
             before(grammarAccess.getTabActivityAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TabActivity__NameAssignment_19848);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getTabActivityAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabActivity__NameAssignment_1


    // $ANTLR start rule__TabActivity__ActionsAssignment_3
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4957:1: rule__TabActivity__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__TabActivity__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4961:1: ( ( ruleAction ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4962:1: ( ruleAction )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4962:1: ( ruleAction )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4963:1: ruleAction
            {
             before(grammarAccess.getTabActivityAccess().getActionsActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__TabActivity__ActionsAssignment_39879);
            ruleAction();
            _fsp--;

             after(grammarAccess.getTabActivityAccess().getActionsActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabActivity__ActionsAssignment_3


    // $ANTLR start rule__GenericAction__NameAssignment_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4972:1: rule__GenericAction__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__GenericAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4976:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4977:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4977:1: ( ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4978:1: ruleQualifiedName
            {
             before(grammarAccess.getGenericActionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__GenericAction__NameAssignment_19910);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getGenericActionAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GenericAction__NameAssignment_1


    // $ANTLR start rule__GoToURLAction__UrlAssignment_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4987:1: rule__GoToURLAction__UrlAssignment_1 : ( ruleURL ) ;
    public final void rule__GoToURLAction__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4991:1: ( ( ruleURL ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4992:1: ( ruleURL )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4992:1: ( ruleURL )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:4993:1: ruleURL
            {
             before(grammarAccess.getGoToURLActionAccess().getUrlURLParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleURL_in_rule__GoToURLAction__UrlAssignment_19941);
            ruleURL();
            _fsp--;

             after(grammarAccess.getGoToURLActionAccess().getUrlURLParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GoToURLAction__UrlAssignment_1


    // $ANTLR start rule__ShowLayoutAction__LayoutAssignment_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5002:1: rule__ShowLayoutAction__LayoutAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ShowLayoutAction__LayoutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5006:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5007:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5007:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5008:1: ( RULE_ID )
            {
             before(grammarAccess.getShowLayoutActionAccess().getLayoutLayoutCrossReference_1_0()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5009:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5010:1: RULE_ID
            {
             before(grammarAccess.getShowLayoutActionAccess().getLayoutLayoutIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ShowLayoutAction__LayoutAssignment_19976); 
             after(grammarAccess.getShowLayoutActionAccess().getLayoutLayoutIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getShowLayoutActionAccess().getLayoutLayoutCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ShowLayoutAction__LayoutAssignment_1


    // $ANTLR start rule__InvokeActivityAction__ActivityAssignment_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5021:1: rule__InvokeActivityAction__ActivityAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__InvokeActivityAction__ActivityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5025:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5026:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5026:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5027:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInvokeActivityActionAccess().getActivityActivityCrossReference_1_0()); 
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5028:1: ( ruleQualifiedName )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5029:1: ruleQualifiedName
            {
             before(grammarAccess.getInvokeActivityActionAccess().getActivityActivityQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__InvokeActivityAction__ActivityAssignment_110015);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getInvokeActivityActionAccess().getActivityActivityQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getInvokeActivityActionAccess().getActivityActivityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InvokeActivityAction__ActivityAssignment_1


    // $ANTLR start rule__LoadResourceAction__ResourceAssignment_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5040:1: rule__LoadResourceAction__ResourceAssignment_1 : ( RULE_ID ) ;
    public final void rule__LoadResourceAction__ResourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5044:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5045:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5045:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5046:1: RULE_ID
            {
             before(grammarAccess.getLoadResourceActionAccess().getResourceIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LoadResourceAction__ResourceAssignment_110050); 
             after(grammarAccess.getLoadResourceActionAccess().getResourceIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__ResourceAssignment_1


    // $ANTLR start rule__LoadResourceAction__ToVarAssignment_2_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5055:1: rule__LoadResourceAction__ToVarAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__LoadResourceAction__ToVarAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5059:1: ( ( RULE_ID ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5060:1: ( RULE_ID )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5060:1: ( RULE_ID )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5061:1: RULE_ID
            {
             before(grammarAccess.getLoadResourceActionAccess().getToVarIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LoadResourceAction__ToVarAssignment_2_110081); 
             after(grammarAccess.getLoadResourceActionAccess().getToVarIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__ToVarAssignment_2_1


    // $ANTLR start rule__LoadResourceAction__AfterLoadAssignment_3_1
    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5070:1: rule__LoadResourceAction__AfterLoadAssignment_3_1 : ( ruleAction ) ;
    public final void rule__LoadResourceAction__AfterLoadAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5074:1: ( ( ruleAction ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5075:1: ( ruleAction )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5075:1: ( ruleAction )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:5076:1: ruleAction
            {
             before(grammarAccess.getLoadResourceActionAccess().getAfterLoadActionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__LoadResourceAction__AfterLoadAssignment_3_110112);
            ruleAction();
            _fsp--;

             after(grammarAccess.getLoadResourceActionAccess().getAfterLoadActionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LoadResourceAction__AfterLoadAssignment_3_1


 

    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0_in_ruleApplication94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManifestFile_in_entryRuleManifestFile123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManifestFile130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManifestFile__Group__0_in_ruleManifestFile156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__Group__0_in_ruleLayout216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group__0_in_ruleWidget276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericWidget_in_entryRuleGenericWidget303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericWidget310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericWidget__Group__0_in_ruleGenericWidget336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0_in_ruleButton396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinner_in_entryRuleSpinner423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpinner430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spinner__Group__0_in_ruleSpinner456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditText_in_entryRuleEditText483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditText490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditText__Group__0_in_ruleEditText516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextView_in_entryRuleTextView543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextView550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextView__Group__0_in_ruleTextView576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Alternatives_in_ruleActivity636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericActivity_in_entryRuleGenericActivity663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericActivity670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericActivity__Group__0_in_ruleGenericActivity696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListActivity_in_entryRuleListActivity723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListActivity730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__0_in_ruleListActivity756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabActivity_in_entryRuleTabActivity783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabActivity790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabActivity__Group__0_in_ruleTabActivity816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Alternatives_in_ruleAction876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericAction_in_entryRuleGenericAction903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericAction910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericAction__Group__0_in_ruleGenericAction936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoToURLAction_in_entryRuleGoToURLAction963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoToURLAction970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoToURLAction__Group__0_in_ruleGoToURLAction996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShowLayoutAction_in_entryRuleShowLayoutAction1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShowLayoutAction1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShowLayoutAction__Group__0_in_ruleShowLayoutAction1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeActivityAction_in_entryRuleInvokeActivityAction1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvokeActivityAction1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InvokeActivityAction__Group__0_in_ruleInvokeActivityAction1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadResourceAction_in_entryRuleLoadResourceAction1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadResourceAction1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group__0_in_ruleLoadResourceAction1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURL_in_entryRuleURL1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURL1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URL__Group__0_in_ruleURL1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericWidget_in_rule__Widget__Alternatives_01333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_rule__Widget__Alternatives_01350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpinner_in_rule__Widget__Alternatives_01367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditText_in_rule__Widget__Alternatives_01384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextView_in_rule__Widget__Alternatives_01401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericActivity_in_rule__Activity__Alternatives1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListActivity_in_rule__Activity__Alternatives1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabActivity_in_rule__Activity__Alternatives1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericAction_in_rule__Action__Alternatives1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoToURLAction_in_rule__Action__Alternatives1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShowLayoutAction_in_rule__Action__Alternatives1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeActivityAction_in_rule__Action__Alternatives1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadResourceAction_in_rule__Action__Alternatives1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__01597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__01600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Application__Group__0__Impl1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__11659 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__11662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__21719 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__21722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__PackageAssignment_2_in_rule__Application__Group__2__Impl1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__31780 = new BitSet(new long[]{0x000000013000C000L});
    public static final BitSet FOLLOW_rule__Application__Group__4_in_rule__Application__Group__31783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Application__Group__3__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__41842 = new BitSet(new long[]{0x0000000130008000L});
    public static final BitSet FOLLOW_rule__Application__Group__5_in_rule__Application__Group__41845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__ManifestAssignment_4_in_rule__Application__Group__4__Impl1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__51903 = new BitSet(new long[]{0x0000000130000000L});
    public static final BitSet FOLLOW_rule__Application__Group__6_in_rule__Application__Group__51906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__LayoutsAssignment_5_in_rule__Application__Group__5__Impl1933 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Application__Group__6__Impl_in_rule__Application__Group__61964 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Application__Group__7_in_rule__Application__Group__61967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__ActivitiesAssignment_6_in_rule__Application__Group__6__Impl1996 = new BitSet(new long[]{0x0000000130000002L});
    public static final BitSet FOLLOW_rule__Application__ActivitiesAssignment_6_in_rule__Application__Group__6__Impl2008 = new BitSet(new long[]{0x0000000130000002L});
    public static final BitSet FOLLOW_rule__Application__Group__7__Impl_in_rule__Application__Group__72041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Application__Group__7__Impl2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManifestFile__Group__0__Impl_in_rule__ManifestFile__Group__02116 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ManifestFile__Group__1_in_rule__ManifestFile__Group__02119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManifestFile__Group__1__Impl_in_rule__ManifestFile__Group__12177 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ManifestFile__Group__2_in_rule__ManifestFile__Group__12180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ManifestFile__Group__1__Impl2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManifestFile__Group__2__Impl_in_rule__ManifestFile__Group__22239 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ManifestFile__Group__3_in_rule__ManifestFile__Group__22242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ManifestFile__Group__2__Impl2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ManifestFile__Group__3__Impl_in_rule__ManifestFile__Group__32301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ManifestFile__Group__3__Impl2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__02368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__02371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Layout__Group__0__Impl2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__12430 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__12433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__NameAssignment_1_in_rule__Layout__Group__1__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__22490 = new BitSet(new long[]{0x000000000F202000L});
    public static final BitSet FOLLOW_rule__Layout__Group__3_in_rule__Layout__Group__22493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Layout__Group__2__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__Group__3__Impl_in_rule__Layout__Group__32552 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Layout__Group__4_in_rule__Layout__Group__32555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__WidgetsAssignment_3_in_rule__Layout__Group__3__Impl2582 = new BitSet(new long[]{0x000000000F200002L});
    public static final BitSet FOLLOW_rule__Layout__Group__4__Impl_in_rule__Layout__Group__42613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Layout__Group__4__Impl2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group__0__Impl_in_rule__Widget__Group__02682 = new BitSet(new long[]{0x00000000001D0002L});
    public static final BitSet FOLLOW_rule__Widget__Group__1_in_rule__Widget__Group__02685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Alternatives_0_in_rule__Widget__Group__0__Impl2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group__1__Impl_in_rule__Widget__Group__12742 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_rule__Widget__Group__2_in_rule__Widget__Group__12745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group_1__0_in_rule__Widget__Group__1__Impl2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group__2__Impl_in_rule__Widget__Group__22803 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_rule__Widget__Group__3_in_rule__Widget__Group__22806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group_2__0_in_rule__Widget__Group__2__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group__3__Impl_in_rule__Widget__Group__32864 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Widget__Group__4_in_rule__Widget__Group__32867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group_3__0_in_rule__Widget__Group__3__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group__4__Impl_in_rule__Widget__Group__42925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group_4__0_in_rule__Widget__Group__4__Impl2952 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Widget__Group_1__0__Impl_in_rule__Widget__Group_1__02993 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Widget__Group_1__1_in_rule__Widget__Group_1__02996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Widget__Group_1__0__Impl3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group_1__1__Impl_in_rule__Widget__Group_1__13055 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Widget__Group_1__2_in_rule__Widget__Group_1__13058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Widget__Group_1__1__Impl3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group_1__2__Impl_in_rule__Widget__Group_1__23117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__TopAssignment_1_2_in_rule__Widget__Group_1__2__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group_2__0__Impl_in_rule__Widget__Group_2__03180 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Widget__Group_2__1_in_rule__Widget__Group_2__03183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Widget__Group_2__0__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group_2__1__Impl_in_rule__Widget__Group_2__13242 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Widget__Group_2__2_in_rule__Widget__Group_2__13245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Widget__Group_2__1__Impl3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group_2__2__Impl_in_rule__Widget__Group_2__23304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__LeftAssignment_2_2_in_rule__Widget__Group_2__2__Impl3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group_3__0__Impl_in_rule__Widget__Group_3__03367 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Widget__Group_3__1_in_rule__Widget__Group_3__03370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Widget__Group_3__0__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group_3__1__Impl_in_rule__Widget__Group_3__13429 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Widget__Group_3__2_in_rule__Widget__Group_3__13432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Widget__Group_3__1__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group_3__2__Impl_in_rule__Widget__Group_3__23491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__WidthAssignment_3_2_in_rule__Widget__Group_3__2__Impl3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group_4__0__Impl_in_rule__Widget__Group_4__03554 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_rule__Widget__Group_4__1_in_rule__Widget__Group_4__03557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Widget__Group_4__0__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group_4__1__Impl_in_rule__Widget__Group_4__13616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__ActionsAssignment_4_1_in_rule__Widget__Group_4__1__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericWidget__Group__0__Impl_in_rule__GenericWidget__Group__03677 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__GenericWidget__Group__1_in_rule__GenericWidget__Group__03680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__GenericWidget__Group__0__Impl3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericWidget__Group__1__Impl_in_rule__GenericWidget__Group__13739 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__GenericWidget__Group__2_in_rule__GenericWidget__Group__13742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericWidget__Group__2__Impl_in_rule__GenericWidget__Group__23800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GenericWidget__Group__3_in_rule__GenericWidget__Group__23803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericWidget__Group_2__0_in_rule__GenericWidget__Group__2__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericWidget__Group__3__Impl_in_rule__GenericWidget__Group__33861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericWidget__NameAssignment_3_in_rule__GenericWidget__Group__3__Impl3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericWidget__Group_2__0__Impl_in_rule__GenericWidget__Group_2__03926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GenericWidget__Group_2__1_in_rule__GenericWidget__Group_2__03929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__GenericWidget__Group_2__0__Impl3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericWidget__Group_2__1__Impl_in_rule__GenericWidget__Group_2__13988 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__GenericWidget__Group_2__2_in_rule__GenericWidget__Group_2__13991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericWidget__IdAssignment_2_1_in_rule__GenericWidget__Group_2__1__Impl4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericWidget__Group_2__2__Impl_in_rule__GenericWidget__Group_2__24048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__GenericWidget__Group_2__2__Impl4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__04113 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__Button__Group__1_in_rule__Button__Group__04116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Button__Group__0__Impl4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__14175 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__Button__Group__2_in_rule__Button__Group__14178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__24236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Button__Group__3_in_rule__Button__Group__24239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_2__0_in_rule__Button__Group__2__Impl4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__34297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__LabelAssignment_3_in_rule__Button__Group__3__Impl4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_2__0__Impl_in_rule__Button__Group_2__04362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Button__Group_2__1_in_rule__Button__Group_2__04365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Button__Group_2__0__Impl4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_2__1__Impl_in_rule__Button__Group_2__14424 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Button__Group_2__2_in_rule__Button__Group_2__14427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__IdAssignment_2_1_in_rule__Button__Group_2__1__Impl4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_2__2__Impl_in_rule__Button__Group_2__24484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Button__Group_2__2__Impl4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spinner__Group__0__Impl_in_rule__Spinner__Group__04549 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__Spinner__Group__1_in_rule__Spinner__Group__04552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Spinner__Group__0__Impl4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spinner__Group__1__Impl_in_rule__Spinner__Group__14611 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__Spinner__Group__2_in_rule__Spinner__Group__14614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spinner__Group__2__Impl_in_rule__Spinner__Group__24672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Spinner__Group__3_in_rule__Spinner__Group__24675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spinner__Group_2__0_in_rule__Spinner__Group__2__Impl4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spinner__Group__3__Impl_in_rule__Spinner__Group__34733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spinner__LabelAssignment_3_in_rule__Spinner__Group__3__Impl4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spinner__Group_2__0__Impl_in_rule__Spinner__Group_2__04798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Spinner__Group_2__1_in_rule__Spinner__Group_2__04801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Spinner__Group_2__0__Impl4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spinner__Group_2__1__Impl_in_rule__Spinner__Group_2__14860 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Spinner__Group_2__2_in_rule__Spinner__Group_2__14863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spinner__IdAssignment_2_1_in_rule__Spinner__Group_2__1__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spinner__Group_2__2__Impl_in_rule__Spinner__Group_2__24920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Spinner__Group_2__2__Impl4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditText__Group__0__Impl_in_rule__EditText__Group__04985 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__EditText__Group__1_in_rule__EditText__Group__04988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EditText__Group__0__Impl5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditText__Group__1__Impl_in_rule__EditText__Group__15047 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__EditText__Group__2_in_rule__EditText__Group__15050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditText__Group__2__Impl_in_rule__EditText__Group__25108 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EditText__Group__3_in_rule__EditText__Group__25111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditText__Group_2__0_in_rule__EditText__Group__2__Impl5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditText__Group__3__Impl_in_rule__EditText__Group__35169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditText__LabelAssignment_3_in_rule__EditText__Group__3__Impl5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditText__Group_2__0__Impl_in_rule__EditText__Group_2__05234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EditText__Group_2__1_in_rule__EditText__Group_2__05237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EditText__Group_2__0__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditText__Group_2__1__Impl_in_rule__EditText__Group_2__15296 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EditText__Group_2__2_in_rule__EditText__Group_2__15299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditText__IdAssignment_2_1_in_rule__EditText__Group_2__1__Impl5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditText__Group_2__2__Impl_in_rule__EditText__Group_2__25356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EditText__Group_2__2__Impl5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextView__Group__0__Impl_in_rule__TextView__Group__05421 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__TextView__Group__1_in_rule__TextView__Group__05424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TextView__Group__0__Impl5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextView__Group__1__Impl_in_rule__TextView__Group__15483 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__TextView__Group__2_in_rule__TextView__Group__15486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextView__Group__2__Impl_in_rule__TextView__Group__25544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TextView__Group__3_in_rule__TextView__Group__25547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextView__Group_2__0_in_rule__TextView__Group__2__Impl5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextView__Group__3__Impl_in_rule__TextView__Group__35605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextView__LabelAssignment_3_in_rule__TextView__Group__3__Impl5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextView__Group_2__0__Impl_in_rule__TextView__Group_2__05670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextView__Group_2__1_in_rule__TextView__Group_2__05673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TextView__Group_2__0__Impl5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextView__Group_2__1__Impl_in_rule__TextView__Group_2__15732 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TextView__Group_2__2_in_rule__TextView__Group_2__15735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextView__IdAssignment_2_1_in_rule__TextView__Group_2__1__Impl5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextView__Group_2__2__Impl_in_rule__TextView__Group_2__25792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TextView__Group_2__2__Impl5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericActivity__Group__0__Impl_in_rule__GenericActivity__Group__05857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GenericActivity__Group__1_in_rule__GenericActivity__Group__05860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__GenericActivity__Group__0__Impl5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericActivity__Group__1__Impl_in_rule__GenericActivity__Group__15919 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__GenericActivity__Group__2_in_rule__GenericActivity__Group__15922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericActivity__NameAssignment_1_in_rule__GenericActivity__Group__1__Impl5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericActivity__Group__2__Impl_in_rule__GenericActivity__Group__25979 = new BitSet(new long[]{0x0000003E00002000L});
    public static final BitSet FOLLOW_rule__GenericActivity__Group__3_in_rule__GenericActivity__Group__25982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GenericActivity__Group__2__Impl6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericActivity__Group__3__Impl_in_rule__GenericActivity__Group__36041 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GenericActivity__Group__4_in_rule__GenericActivity__Group__36044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericActivity__ActionsAssignment_3_in_rule__GenericActivity__Group__3__Impl6071 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_rule__GenericActivity__Group__4__Impl_in_rule__GenericActivity__Group__46102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__GenericActivity__Group__4__Impl6130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__0__Impl_in_rule__ListActivity__Group__06171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__1_in_rule__ListActivity__Group__06174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ListActivity__Group__0__Impl6202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__1__Impl_in_rule__ListActivity__Group__16233 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__2_in_rule__ListActivity__Group__16236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__NameAssignment_1_in_rule__ListActivity__Group__1__Impl6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__2__Impl_in_rule__ListActivity__Group__26293 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__3_in_rule__ListActivity__Group__26296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ListActivity__Group__2__Impl6324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__3__Impl_in_rule__ListActivity__Group__36355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__4_in_rule__ListActivity__Group__36358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ListActivity__Group__3__Impl6386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__4__Impl_in_rule__ListActivity__Group__46417 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__5_in_rule__ListActivity__Group__46420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__DataSourceAssignment_4_in_rule__ListActivity__Group__4__Impl6447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__5__Impl_in_rule__ListActivity__Group__56477 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__6_in_rule__ListActivity__Group__56480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__Group_5__0_in_rule__ListActivity__Group__5__Impl6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__6__Impl_in_rule__ListActivity__Group__66538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__7_in_rule__ListActivity__Group__66541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ListActivity__Group__6__Impl6569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__7__Impl_in_rule__ListActivity__Group__76600 = new BitSet(new long[]{0x0000003E00002000L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__8_in_rule__ListActivity__Group__76603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__ItemLayoutAssignment_7_in_rule__ListActivity__Group__7__Impl6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__8__Impl_in_rule__ListActivity__Group__86660 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__9_in_rule__ListActivity__Group__86663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__ActionsAssignment_8_in_rule__ListActivity__Group__8__Impl6690 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_rule__ListActivity__Group__9__Impl_in_rule__ListActivity__Group__96721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ListActivity__Group__9__Impl6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__Group_5__0__Impl_in_rule__ListActivity__Group_5__06800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ListActivity__Group_5__1_in_rule__ListActivity__Group_5__06803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ListActivity__Group_5__0__Impl6831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__Group_5__1__Impl_in_rule__ListActivity__Group_5__16862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListActivity__LayoutAssignment_5_1_in_rule__ListActivity__Group_5__1__Impl6889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabActivity__Group__0__Impl_in_rule__TabActivity__Group__06923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TabActivity__Group__1_in_rule__TabActivity__Group__06926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TabActivity__Group__0__Impl6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabActivity__Group__1__Impl_in_rule__TabActivity__Group__16985 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__TabActivity__Group__2_in_rule__TabActivity__Group__16988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabActivity__NameAssignment_1_in_rule__TabActivity__Group__1__Impl7015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabActivity__Group__2__Impl_in_rule__TabActivity__Group__27045 = new BitSet(new long[]{0x0000003E00002000L});
    public static final BitSet FOLLOW_rule__TabActivity__Group__3_in_rule__TabActivity__Group__27048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__TabActivity__Group__2__Impl7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabActivity__Group__3__Impl_in_rule__TabActivity__Group__37107 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__TabActivity__Group__4_in_rule__TabActivity__Group__37110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabActivity__ActionsAssignment_3_in_rule__TabActivity__Group__3__Impl7137 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_rule__TabActivity__Group__4__Impl_in_rule__TabActivity__Group__47168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TabActivity__Group__4__Impl7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericAction__Group__0__Impl_in_rule__GenericAction__Group__07237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GenericAction__Group__1_in_rule__GenericAction__Group__07240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__GenericAction__Group__0__Impl7268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericAction__Group__1__Impl_in_rule__GenericAction__Group__17299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericAction__NameAssignment_1_in_rule__GenericAction__Group__1__Impl7326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoToURLAction__Group__0__Impl_in_rule__GoToURLAction__Group__07360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GoToURLAction__Group__1_in_rule__GoToURLAction__Group__07363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__GoToURLAction__Group__0__Impl7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoToURLAction__Group__1__Impl_in_rule__GoToURLAction__Group__17422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoToURLAction__UrlAssignment_1_in_rule__GoToURLAction__Group__1__Impl7449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShowLayoutAction__Group__0__Impl_in_rule__ShowLayoutAction__Group__07483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ShowLayoutAction__Group__1_in_rule__ShowLayoutAction__Group__07486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ShowLayoutAction__Group__0__Impl7514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShowLayoutAction__Group__1__Impl_in_rule__ShowLayoutAction__Group__17545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShowLayoutAction__LayoutAssignment_1_in_rule__ShowLayoutAction__Group__1__Impl7572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InvokeActivityAction__Group__0__Impl_in_rule__InvokeActivityAction__Group__07606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InvokeActivityAction__Group__1_in_rule__InvokeActivityAction__Group__07609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__InvokeActivityAction__Group__0__Impl7637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InvokeActivityAction__Group__1__Impl_in_rule__InvokeActivityAction__Group__17668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InvokeActivityAction__ActivityAssignment_1_in_rule__InvokeActivityAction__Group__1__Impl7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group__0__Impl_in_rule__LoadResourceAction__Group__07729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group__1_in_rule__LoadResourceAction__Group__07732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__LoadResourceAction__Group__0__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group__1__Impl_in_rule__LoadResourceAction__Group__17791 = new BitSet(new long[]{0x0000004000100002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group__2_in_rule__LoadResourceAction__Group__17794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__ResourceAssignment_1_in_rule__LoadResourceAction__Group__1__Impl7821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group__2__Impl_in_rule__LoadResourceAction__Group__27851 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group__3_in_rule__LoadResourceAction__Group__27854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group_2__0_in_rule__LoadResourceAction__Group__2__Impl7881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group__3__Impl_in_rule__LoadResourceAction__Group__37912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group_3__0_in_rule__LoadResourceAction__Group__3__Impl7939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group_2__0__Impl_in_rule__LoadResourceAction__Group_2__07978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group_2__1_in_rule__LoadResourceAction__Group_2__07981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__LoadResourceAction__Group_2__0__Impl8009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group_2__1__Impl_in_rule__LoadResourceAction__Group_2__18040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__ToVarAssignment_2_1_in_rule__LoadResourceAction__Group_2__1__Impl8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group_3__0__Impl_in_rule__LoadResourceAction__Group_3__08101 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group_3__1_in_rule__LoadResourceAction__Group_3__08104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__LoadResourceAction__Group_3__0__Impl8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__Group_3__1__Impl_in_rule__LoadResourceAction__Group_3__18163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadResourceAction__AfterLoadAssignment_3_1_in_rule__LoadResourceAction__Group_3__1__Impl8190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08224 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8310 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__QualifiedName__Group_1__0__Impl8376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URL__Group__0__Impl_in_rule__URL__Group__08467 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__URL__Group__1_in_rule__URL__Group__08470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URL__Group__0__Impl8497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URL__Group__1__Impl_in_rule__URL__Group__18526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__URL__Group__2_in_rule__URL__Group__18529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__URL__Group__1__Impl8557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URL__Group__2__Impl_in_rule__URL__Group__28588 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__URL__Group__3_in_rule__URL__Group__28591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__URL__Group__2__Impl8618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URL__Group__3__Impl_in_rule__URL__Group__38647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URL__Group_3__0_in_rule__URL__Group__3__Impl8674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URL__Group_3__0__Impl_in_rule__URL__Group_3__08713 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__URL__Group_3__1_in_rule__URL__Group_3__08716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__URL__Group_3__0__Impl8744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URL__Group_3__1__Impl_in_rule__URL__Group_3__18775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URL__Group_3_1__0_in_rule__URL__Group_3__1__Impl8802 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__URL__Group_3_1__0__Impl_in_rule__URL__Group_3_1__08837 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__URL__Group_3_1__1_in_rule__URL__Group_3_1__08840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__URL__Group_3_1__0__Impl8867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URL__Group_3_1__1__Impl_in_rule__URL__Group_3_1__18896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__URL__Group_3_1__1__Impl8924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Application__NameAssignment_18964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Application__PackageAssignment_28995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManifestFile_in_rule__Application__ManifestAssignment_49026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_rule__Application__LayoutsAssignment_59057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Application__ActivitiesAssignment_69088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Layout__NameAssignment_19119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_rule__Layout__WidgetsAssignment_39150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Widget__TopAssignment_1_29181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Widget__LeftAssignment_2_29212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Widget__WidthAssignment_3_29243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__Widget__ActionsAssignment_4_19274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GenericWidget__IdAssignment_2_19305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__GenericWidget__NameAssignment_39336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Button__IdAssignment_2_19367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Button__LabelAssignment_39398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Spinner__IdAssignment_2_19429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Spinner__LabelAssignment_39460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EditText__IdAssignment_2_19491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EditText__LabelAssignment_39522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextView__IdAssignment_2_19553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextView__LabelAssignment_39584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__GenericActivity__NameAssignment_19615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__GenericActivity__ActionsAssignment_39646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ListActivity__NameAssignment_19677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListActivity__DataSourceAssignment_49708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListActivity__LayoutAssignment_5_19743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListActivity__ItemLayoutAssignment_79782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__ListActivity__ActionsAssignment_89817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TabActivity__NameAssignment_19848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__TabActivity__ActionsAssignment_39879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__GenericAction__NameAssignment_19910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURL_in_rule__GoToURLAction__UrlAssignment_19941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ShowLayoutAction__LayoutAssignment_19976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__InvokeActivityAction__ActivityAssignment_110015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LoadResourceAction__ResourceAssignment_110050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LoadResourceAction__ToVarAssignment_2_110081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__LoadResourceAction__AfterLoadAssignment_3_110112 = new BitSet(new long[]{0x0000000000000002L});

}