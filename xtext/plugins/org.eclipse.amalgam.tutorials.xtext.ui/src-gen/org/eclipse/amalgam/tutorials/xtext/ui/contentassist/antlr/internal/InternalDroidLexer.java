package org.eclipse.amalgam.tutorials.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDroidLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int RULE_ID=4;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_HEX_COLOR=7;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T72=72;
    public static final int T21=21;
    public static final int T71=71;
    public static final int T20=20;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_INT=5;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=80;
    public static final int RULE_SL_COMMENT=9;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=8;
    public static final int T44=44;
    public static final int RULE_STRING=6;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=10;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalDroidLexer() {;} 
    public InternalDroidLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:10:5: ( 'YES' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:10:7: 'YES'
            {
            match("YES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:11:5: ( 'NO' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:11:7: 'NO'
            {
            match("NO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:12:5: ( 'dp' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:12:7: 'dp'
            {
            match("dp"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:13:5: ( 'sp' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:13:7: 'sp'
            {
            match("sp"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:14:5: ( 'pt' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:14:7: 'pt'
            {
            match("pt"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:15:5: ( 'px' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:15:7: 'px'
            {
            match("px"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:16:5: ( 'mm' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:16:7: 'mm'
            {
            match("mm"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:17:5: ( 'in' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:17:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18:5: ( 'application' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18:7: 'application'
            {
            match("application"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:19:5: ( '{' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:19:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:20:5: ( '}' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:20:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:21:5: ( 'manifest' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:21:7: 'manifest'
            {
            match("manifest"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:22:5: ( 'resource' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:22:7: 'resource'
            {
            match("resource"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:23:5: ( 'menu' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:23:7: 'menu'
            {
            match("menu"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:24:5: ( 'string' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:24:7: 'string'
            {
            match("string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:25:5: ( '=' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:25:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:26:5: ( 'integer' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:26:7: 'integer'
            {
            match("integer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:27:5: ( 'bool' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:27:7: 'bool'
            {
            match("bool"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:28:5: ( 'color' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:28:7: 'color'
            {
            match("color"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:29:5: ( 'dimension' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:29:7: 'dimension'
            {
            match("dimension"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:30:5: ( 'bitmap' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:30:7: 'bitmap'
            {
            match("bitmap"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:31:5: ( 'transition' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:31:7: 'transition'
            {
            match("transition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:32:5: ( '<->' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:32:7: '<->'
            {
            match("<->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:33:5: ( 'animation' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:33:7: 'animation'
            {
            match("animation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:34:5: ( 'layout' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:34:7: 'layout'
            {
            match("layout"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:35:5: ( 'widget' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:35:7: 'widget'
            {
            match("widget"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:36:5: ( '<' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:36:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:37:5: ( '>' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:37:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:38:5: ( 'top:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:38:7: 'top:'
            {
            match("top:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:39:5: ( 'left:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:39:7: 'left:'
            {
            match("left:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:40:5: ( 'width:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:40:7: 'width:'
            {
            match("width:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:41:5: ( 'height:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:41:7: 'height:'
            {
            match("height:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:42:5: ( 'background:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:42:7: 'background:'
            {
            match("background:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:43:5: ( 'clickable?' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:43:7: 'clickable?'
            {
            match("clickable?"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:44:5: ( 'fadeScrollBars?' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:44:7: 'fadeScrollBars?'
            {
            match("fadeScrollBars?"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45:5: ( 'isScrollContainer?' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45:7: 'isScrollContainer?'
            {
            match("isScrollContainer?"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:46:5: ( '->' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:46:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:47:5: ( 'textView' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:47:7: 'textView'
            {
            match("textView"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:48:5: ( 'hint:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:48:7: 'hint:'
            {
            match("hint:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:49:5: ( 'textColor:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:49:7: 'textColor:'
            {
            match("textColor:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:50:5: ( 'button' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:50:7: 'button'
            {
            match("button"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:51:5: ( 'imageButton' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:51:7: 'imageButton'
            {
            match("imageButton"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:52:5: ( 'link' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:52:7: 'link'
            {
            match("link"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:53:5: ( 'to' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:53:7: 'to'
            {
            match("to"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:54:5: ( 'spinner' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:54:7: 'spinner'
            {
            match("spinner"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:55:5: ( 'prompt:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:55:7: 'prompt:'
            {
            match("prompt:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:56:5: ( 'editText' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:56:7: 'editText'
            {
            match("editText"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:57:5: ( 'editable?' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:57:7: 'editable?'
            {
            match("editable?"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:58:5: ( 'numeric?' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:58:7: 'numeric?'
            {
            match("numeric?"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:59:5: ( 'password?' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:59:7: 'password?'
            {
            match("password?"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:60:5: ( 'phoneNumber?' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:60:7: 'phoneNumber?'
            {
            match("phoneNumber?"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:61:5: ( 'activity' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:61:7: 'activity'
            {
            match("activity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:62:5: ( 'listActivity' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:62:7: 'listActivity'
            {
            match("listActivity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:63:5: ( 'data' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:63:7: 'data'
            {
            match("data"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:64:5: ( 'item' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:64:7: 'item'
            {
            match("item"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:65:5: ( 'tabActivity' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:65:7: 'tabActivity'
            {
            match("tabActivity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:66:5: ( 'tab' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:66:7: 'tab'
            {
            match("tab"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:67:5: ( 'action' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:67:7: 'action'
            {
            match("action"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:68:5: ( 'goTo' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:68:7: 'goTo'
            {
            match("goTo"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:69:5: ( 'show' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:69:7: 'show'
            {
            match("show"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:70:5: ( 'invoke' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:70:7: 'invoke'
            {
            match("invoke"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:71:5: ( 'load' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:71:7: 'load'
            {
            match("load"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:72:5: ( '=>' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:72:7: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:73:5: ( '(' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:73:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:74:5: ( ')' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:74:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:75:5: ( '.' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:75:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:76:5: ( '://' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:76:7: '://'
            {
            match("://"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:77:5: ( '/' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:77:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start RULE_HEX_COLOR
    public final void mRULE_HEX_COLOR() throws RecognitionException {
        try {
            int _type = RULE_HEX_COLOR;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:17999:16: ( '#' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:17999:18: '#' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )?
            {
            match('#'); 
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:17999:196: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:17999:197: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_HEX_COLOR

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18001:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18001:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18001:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18001:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18001:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18003:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18003:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18003:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18003:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18005:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18005:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18005:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("18005:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18005:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18005:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18005:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18005:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18005:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18005:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18005:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18005:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18007:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18007:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18007:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18007:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18009:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18009:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18009:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18009:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18009:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18009:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18009:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18009:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18011:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18011:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18011:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18013:16: ( . )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18013:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | RULE_HEX_COLOR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=76;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='Y') ) {
            int LA13_1 = input.LA(2);

            if ( (LA13_1=='E') ) {
                int LA13_39 = input.LA(3);

                if ( (LA13_39=='S') ) {
                    int LA13_104 = input.LA(4);

                    if ( ((LA13_104>='0' && LA13_104<='9')||(LA13_104>='A' && LA13_104<='Z')||LA13_104=='_'||(LA13_104>='a' && LA13_104<='z')) ) {
                        alt13=70;
                    }
                    else {
                        alt13=1;}
                }
                else {
                    alt13=70;}
            }
            else {
                alt13=70;}
        }
        else if ( (LA13_0=='N') ) {
            int LA13_2 = input.LA(2);

            if ( (LA13_2=='O') ) {
                int LA13_41 = input.LA(3);

                if ( ((LA13_41>='0' && LA13_41<='9')||(LA13_41>='A' && LA13_41<='Z')||LA13_41=='_'||(LA13_41>='a' && LA13_41<='z')) ) {
                    alt13=70;
                }
                else {
                    alt13=2;}
            }
            else {
                alt13=70;}
        }
        else if ( (LA13_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA13_42 = input.LA(3);

                if ( (LA13_42=='m') ) {
                    int LA13_106 = input.LA(4);

                    if ( (LA13_106=='e') ) {
                        int LA13_155 = input.LA(5);

                        if ( (LA13_155=='n') ) {
                            int LA13_198 = input.LA(6);

                            if ( (LA13_198=='s') ) {
                                int LA13_242 = input.LA(7);

                                if ( (LA13_242=='i') ) {
                                    int LA13_276 = input.LA(8);

                                    if ( (LA13_276=='o') ) {
                                        int LA13_308 = input.LA(9);

                                        if ( (LA13_308=='n') ) {
                                            int LA13_331 = input.LA(10);

                                            if ( ((LA13_331>='0' && LA13_331<='9')||(LA13_331>='A' && LA13_331<='Z')||LA13_331=='_'||(LA13_331>='a' && LA13_331<='z')) ) {
                                                alt13=70;
                                            }
                                            else {
                                                alt13=20;}
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'a':
                {
                int LA13_43 = input.LA(3);

                if ( (LA13_43=='t') ) {
                    int LA13_107 = input.LA(4);

                    if ( (LA13_107=='a') ) {
                        int LA13_156 = input.LA(5);

                        if ( ((LA13_156>='0' && LA13_156<='9')||(LA13_156>='A' && LA13_156<='Z')||LA13_156=='_'||(LA13_156>='a' && LA13_156<='z')) ) {
                            alt13=70;
                        }
                        else {
                            alt13=54;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'p':
                {
                int LA13_44 = input.LA(3);

                if ( ((LA13_44>='0' && LA13_44<='9')||(LA13_44>='A' && LA13_44<='Z')||LA13_44=='_'||(LA13_44>='a' && LA13_44<='z')) ) {
                    alt13=70;
                }
                else {
                    alt13=3;}
                }
                break;
            default:
                alt13=70;}

        }
        else if ( (LA13_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA13_45 = input.LA(3);

                if ( (LA13_45=='o') ) {
                    int LA13_109 = input.LA(4);

                    if ( (LA13_109=='w') ) {
                        int LA13_157 = input.LA(5);

                        if ( ((LA13_157>='0' && LA13_157<='9')||(LA13_157>='A' && LA13_157<='Z')||LA13_157=='_'||(LA13_157>='a' && LA13_157<='z')) ) {
                            alt13=70;
                        }
                        else {
                            alt13=60;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 't':
                {
                int LA13_46 = input.LA(3);

                if ( (LA13_46=='r') ) {
                    int LA13_110 = input.LA(4);

                    if ( (LA13_110=='i') ) {
                        int LA13_158 = input.LA(5);

                        if ( (LA13_158=='n') ) {
                            int LA13_201 = input.LA(6);

                            if ( (LA13_201=='g') ) {
                                int LA13_243 = input.LA(7);

                                if ( ((LA13_243>='0' && LA13_243<='9')||(LA13_243>='A' && LA13_243<='Z')||LA13_243=='_'||(LA13_243>='a' && LA13_243<='z')) ) {
                                    alt13=70;
                                }
                                else {
                                    alt13=15;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'p':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA13_111 = input.LA(4);

                    if ( (LA13_111=='n') ) {
                        int LA13_159 = input.LA(5);

                        if ( (LA13_159=='n') ) {
                            int LA13_202 = input.LA(6);

                            if ( (LA13_202=='e') ) {
                                int LA13_244 = input.LA(7);

                                if ( (LA13_244=='r') ) {
                                    int LA13_278 = input.LA(8);

                                    if ( ((LA13_278>='0' && LA13_278<='9')||(LA13_278>='A' && LA13_278<='Z')||LA13_278=='_'||(LA13_278>='a' && LA13_278<='z')) ) {
                                        alt13=70;
                                    }
                                    else {
                                        alt13=45;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt13=70;
                    }
                    break;
                default:
                    alt13=4;}

                }
                break;
            default:
                alt13=70;}

        }
        else if ( (LA13_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA13_48 = input.LA(3);

                if ( (LA13_48=='s') ) {
                    int LA13_113 = input.LA(4);

                    if ( (LA13_113=='s') ) {
                        int LA13_160 = input.LA(5);

                        if ( (LA13_160=='w') ) {
                            int LA13_203 = input.LA(6);

                            if ( (LA13_203=='o') ) {
                                int LA13_245 = input.LA(7);

                                if ( (LA13_245=='r') ) {
                                    int LA13_279 = input.LA(8);

                                    if ( (LA13_279=='d') ) {
                                        int LA13_310 = input.LA(9);

                                        if ( (LA13_310=='?') ) {
                                            alt13=50;
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'h':
                {
                int LA13_49 = input.LA(3);

                if ( (LA13_49=='o') ) {
                    int LA13_114 = input.LA(4);

                    if ( (LA13_114=='n') ) {
                        int LA13_161 = input.LA(5);

                        if ( (LA13_161=='e') ) {
                            int LA13_204 = input.LA(6);

                            if ( (LA13_204=='N') ) {
                                int LA13_246 = input.LA(7);

                                if ( (LA13_246=='u') ) {
                                    int LA13_280 = input.LA(8);

                                    if ( (LA13_280=='m') ) {
                                        int LA13_311 = input.LA(9);

                                        if ( (LA13_311=='b') ) {
                                            int LA13_333 = input.LA(10);

                                            if ( (LA13_333=='e') ) {
                                                int LA13_352 = input.LA(11);

                                                if ( (LA13_352=='r') ) {
                                                    int LA13_364 = input.LA(12);

                                                    if ( (LA13_364=='?') ) {
                                                        alt13=51;
                                                    }
                                                    else {
                                                        alt13=70;}
                                                }
                                                else {
                                                    alt13=70;}
                                            }
                                            else {
                                                alt13=70;}
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'x':
                {
                int LA13_50 = input.LA(3);

                if ( ((LA13_50>='0' && LA13_50<='9')||(LA13_50>='A' && LA13_50<='Z')||LA13_50=='_'||(LA13_50>='a' && LA13_50<='z')) ) {
                    alt13=70;
                }
                else {
                    alt13=6;}
                }
                break;
            case 't':
                {
                int LA13_51 = input.LA(3);

                if ( ((LA13_51>='0' && LA13_51<='9')||(LA13_51>='A' && LA13_51<='Z')||LA13_51=='_'||(LA13_51>='a' && LA13_51<='z')) ) {
                    alt13=70;
                }
                else {
                    alt13=5;}
                }
                break;
            case 'r':
                {
                int LA13_52 = input.LA(3);

                if ( (LA13_52=='o') ) {
                    int LA13_117 = input.LA(4);

                    if ( (LA13_117=='m') ) {
                        int LA13_162 = input.LA(5);

                        if ( (LA13_162=='p') ) {
                            int LA13_205 = input.LA(6);

                            if ( (LA13_205=='t') ) {
                                int LA13_247 = input.LA(7);

                                if ( (LA13_247==':') ) {
                                    alt13=46;
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            default:
                alt13=70;}

        }
        else if ( (LA13_0=='m') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA13_53 = input.LA(3);

                if ( (LA13_53=='n') ) {
                    int LA13_118 = input.LA(4);

                    if ( (LA13_118=='i') ) {
                        int LA13_163 = input.LA(5);

                        if ( (LA13_163=='f') ) {
                            int LA13_206 = input.LA(6);

                            if ( (LA13_206=='e') ) {
                                int LA13_248 = input.LA(7);

                                if ( (LA13_248=='s') ) {
                                    int LA13_282 = input.LA(8);

                                    if ( (LA13_282=='t') ) {
                                        int LA13_312 = input.LA(9);

                                        if ( ((LA13_312>='0' && LA13_312<='9')||(LA13_312>='A' && LA13_312<='Z')||LA13_312=='_'||(LA13_312>='a' && LA13_312<='z')) ) {
                                            alt13=70;
                                        }
                                        else {
                                            alt13=12;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'e':
                {
                int LA13_54 = input.LA(3);

                if ( (LA13_54=='n') ) {
                    int LA13_119 = input.LA(4);

                    if ( (LA13_119=='u') ) {
                        int LA13_164 = input.LA(5);

                        if ( ((LA13_164>='0' && LA13_164<='9')||(LA13_164>='A' && LA13_164<='Z')||LA13_164=='_'||(LA13_164>='a' && LA13_164<='z')) ) {
                            alt13=70;
                        }
                        else {
                            alt13=14;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'm':
                {
                int LA13_55 = input.LA(3);

                if ( ((LA13_55>='0' && LA13_55<='9')||(LA13_55>='A' && LA13_55<='Z')||LA13_55=='_'||(LA13_55>='a' && LA13_55<='z')) ) {
                    alt13=70;
                }
                else {
                    alt13=7;}
                }
                break;
            default:
                alt13=70;}

        }
        else if ( (LA13_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA13_121 = input.LA(4);

                    if ( (LA13_121=='e') ) {
                        int LA13_165 = input.LA(5);

                        if ( (LA13_165=='g') ) {
                            int LA13_208 = input.LA(6);

                            if ( (LA13_208=='e') ) {
                                int LA13_249 = input.LA(7);

                                if ( (LA13_249=='r') ) {
                                    int LA13_283 = input.LA(8);

                                    if ( ((LA13_283>='0' && LA13_283<='9')||(LA13_283>='A' && LA13_283<='Z')||LA13_283=='_'||(LA13_283>='a' && LA13_283<='z')) ) {
                                        alt13=70;
                                    }
                                    else {
                                        alt13=17;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                    }
                    break;
                case 'v':
                    {
                    int LA13_122 = input.LA(4);

                    if ( (LA13_122=='o') ) {
                        int LA13_166 = input.LA(5);

                        if ( (LA13_166=='k') ) {
                            int LA13_209 = input.LA(6);

                            if ( (LA13_209=='e') ) {
                                int LA13_250 = input.LA(7);

                                if ( ((LA13_250>='0' && LA13_250<='9')||(LA13_250>='A' && LA13_250<='Z')||LA13_250=='_'||(LA13_250>='a' && LA13_250<='z')) ) {
                                    alt13=70;
                                }
                                else {
                                    alt13=61;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 'u':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt13=70;
                    }
                    break;
                default:
                    alt13=8;}

                }
                break;
            case 't':
                {
                int LA13_57 = input.LA(3);

                if ( (LA13_57=='e') ) {
                    int LA13_124 = input.LA(4);

                    if ( (LA13_124=='m') ) {
                        int LA13_167 = input.LA(5);

                        if ( ((LA13_167>='0' && LA13_167<='9')||(LA13_167>='A' && LA13_167<='Z')||LA13_167=='_'||(LA13_167>='a' && LA13_167<='z')) ) {
                            alt13=70;
                        }
                        else {
                            alt13=55;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'm':
                {
                int LA13_58 = input.LA(3);

                if ( (LA13_58=='a') ) {
                    int LA13_125 = input.LA(4);

                    if ( (LA13_125=='g') ) {
                        int LA13_168 = input.LA(5);

                        if ( (LA13_168=='e') ) {
                            int LA13_211 = input.LA(6);

                            if ( (LA13_211=='B') ) {
                                int LA13_251 = input.LA(7);

                                if ( (LA13_251=='u') ) {
                                    int LA13_285 = input.LA(8);

                                    if ( (LA13_285=='t') ) {
                                        int LA13_314 = input.LA(9);

                                        if ( (LA13_314=='t') ) {
                                            int LA13_335 = input.LA(10);

                                            if ( (LA13_335=='o') ) {
                                                int LA13_353 = input.LA(11);

                                                if ( (LA13_353=='n') ) {
                                                    int LA13_365 = input.LA(12);

                                                    if ( ((LA13_365>='0' && LA13_365<='9')||(LA13_365>='A' && LA13_365<='Z')||LA13_365=='_'||(LA13_365>='a' && LA13_365<='z')) ) {
                                                        alt13=70;
                                                    }
                                                    else {
                                                        alt13=42;}
                                                }
                                                else {
                                                    alt13=70;}
                                            }
                                            else {
                                                alt13=70;}
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 's':
                {
                int LA13_59 = input.LA(3);

                if ( (LA13_59=='S') ) {
                    int LA13_126 = input.LA(4);

                    if ( (LA13_126=='c') ) {
                        int LA13_169 = input.LA(5);

                        if ( (LA13_169=='r') ) {
                            int LA13_212 = input.LA(6);

                            if ( (LA13_212=='o') ) {
                                int LA13_252 = input.LA(7);

                                if ( (LA13_252=='l') ) {
                                    int LA13_286 = input.LA(8);

                                    if ( (LA13_286=='l') ) {
                                        int LA13_315 = input.LA(9);

                                        if ( (LA13_315=='C') ) {
                                            int LA13_336 = input.LA(10);

                                            if ( (LA13_336=='o') ) {
                                                int LA13_354 = input.LA(11);

                                                if ( (LA13_354=='n') ) {
                                                    int LA13_366 = input.LA(12);

                                                    if ( (LA13_366=='t') ) {
                                                        int LA13_375 = input.LA(13);

                                                        if ( (LA13_375=='a') ) {
                                                            int LA13_380 = input.LA(14);

                                                            if ( (LA13_380=='i') ) {
                                                                int LA13_383 = input.LA(15);

                                                                if ( (LA13_383=='n') ) {
                                                                    int LA13_385 = input.LA(16);

                                                                    if ( (LA13_385=='e') ) {
                                                                        int LA13_387 = input.LA(17);

                                                                        if ( (LA13_387=='r') ) {
                                                                            int LA13_388 = input.LA(18);

                                                                            if ( (LA13_388=='?') ) {
                                                                                alt13=36;
                                                                            }
                                                                            else {
                                                                                alt13=70;}
                                                                        }
                                                                        else {
                                                                            alt13=70;}
                                                                    }
                                                                    else {
                                                                        alt13=70;}
                                                                }
                                                                else {
                                                                    alt13=70;}
                                                            }
                                                            else {
                                                                alt13=70;}
                                                        }
                                                        else {
                                                            alt13=70;}
                                                    }
                                                    else {
                                                        alt13=70;}
                                                }
                                                else {
                                                    alt13=70;}
                                            }
                                            else {
                                                alt13=70;}
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            default:
                alt13=70;}

        }
        else if ( (LA13_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'c':
                {
                int LA13_60 = input.LA(3);

                if ( (LA13_60=='t') ) {
                    int LA13_127 = input.LA(4);

                    if ( (LA13_127=='i') ) {
                        switch ( input.LA(5) ) {
                        case 'o':
                            {
                            int LA13_213 = input.LA(6);

                            if ( (LA13_213=='n') ) {
                                int LA13_253 = input.LA(7);

                                if ( ((LA13_253>='0' && LA13_253<='9')||(LA13_253>='A' && LA13_253<='Z')||LA13_253=='_'||(LA13_253>='a' && LA13_253<='z')) ) {
                                    alt13=70;
                                }
                                else {
                                    alt13=58;}
                            }
                            else {
                                alt13=70;}
                            }
                            break;
                        case 'v':
                            {
                            int LA13_214 = input.LA(6);

                            if ( (LA13_214=='i') ) {
                                int LA13_254 = input.LA(7);

                                if ( (LA13_254=='t') ) {
                                    int LA13_288 = input.LA(8);

                                    if ( (LA13_288=='y') ) {
                                        int LA13_316 = input.LA(9);

                                        if ( ((LA13_316>='0' && LA13_316<='9')||(LA13_316>='A' && LA13_316<='Z')||LA13_316=='_'||(LA13_316>='a' && LA13_316<='z')) ) {
                                            alt13=70;
                                        }
                                        else {
                                            alt13=52;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                            }
                            break;
                        default:
                            alt13=70;}

                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'n':
                {
                int LA13_61 = input.LA(3);

                if ( (LA13_61=='i') ) {
                    int LA13_128 = input.LA(4);

                    if ( (LA13_128=='m') ) {
                        int LA13_171 = input.LA(5);

                        if ( (LA13_171=='a') ) {
                            int LA13_215 = input.LA(6);

                            if ( (LA13_215=='t') ) {
                                int LA13_255 = input.LA(7);

                                if ( (LA13_255=='i') ) {
                                    int LA13_289 = input.LA(8);

                                    if ( (LA13_289=='o') ) {
                                        int LA13_317 = input.LA(9);

                                        if ( (LA13_317=='n') ) {
                                            int LA13_338 = input.LA(10);

                                            if ( ((LA13_338>='0' && LA13_338<='9')||(LA13_338>='A' && LA13_338<='Z')||LA13_338=='_'||(LA13_338>='a' && LA13_338<='z')) ) {
                                                alt13=70;
                                            }
                                            else {
                                                alt13=24;}
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'p':
                {
                int LA13_62 = input.LA(3);

                if ( (LA13_62=='p') ) {
                    int LA13_129 = input.LA(4);

                    if ( (LA13_129=='l') ) {
                        int LA13_172 = input.LA(5);

                        if ( (LA13_172=='i') ) {
                            int LA13_216 = input.LA(6);

                            if ( (LA13_216=='c') ) {
                                int LA13_256 = input.LA(7);

                                if ( (LA13_256=='a') ) {
                                    int LA13_290 = input.LA(8);

                                    if ( (LA13_290=='t') ) {
                                        int LA13_318 = input.LA(9);

                                        if ( (LA13_318=='i') ) {
                                            int LA13_339 = input.LA(10);

                                            if ( (LA13_339=='o') ) {
                                                int LA13_356 = input.LA(11);

                                                if ( (LA13_356=='n') ) {
                                                    int LA13_367 = input.LA(12);

                                                    if ( ((LA13_367>='0' && LA13_367<='9')||(LA13_367>='A' && LA13_367<='Z')||LA13_367=='_'||(LA13_367>='a' && LA13_367<='z')) ) {
                                                        alt13=70;
                                                    }
                                                    else {
                                                        alt13=9;}
                                                }
                                                else {
                                                    alt13=70;}
                                            }
                                            else {
                                                alt13=70;}
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            default:
                alt13=70;}

        }
        else if ( (LA13_0=='{') ) {
            alt13=10;
        }
        else if ( (LA13_0=='}') ) {
            alt13=11;
        }
        else if ( (LA13_0=='r') ) {
            int LA13_11 = input.LA(2);

            if ( (LA13_11=='e') ) {
                int LA13_65 = input.LA(3);

                if ( (LA13_65=='s') ) {
                    int LA13_130 = input.LA(4);

                    if ( (LA13_130=='o') ) {
                        int LA13_173 = input.LA(5);

                        if ( (LA13_173=='u') ) {
                            int LA13_217 = input.LA(6);

                            if ( (LA13_217=='r') ) {
                                int LA13_257 = input.LA(7);

                                if ( (LA13_257=='c') ) {
                                    int LA13_291 = input.LA(8);

                                    if ( (LA13_291=='e') ) {
                                        int LA13_319 = input.LA(9);

                                        if ( ((LA13_319>='0' && LA13_319<='9')||(LA13_319>='A' && LA13_319<='Z')||LA13_319=='_'||(LA13_319>='a' && LA13_319<='z')) ) {
                                            alt13=70;
                                        }
                                        else {
                                            alt13=13;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
            }
            else {
                alt13=70;}
        }
        else if ( (LA13_0=='=') ) {
            int LA13_12 = input.LA(2);

            if ( (LA13_12=='>') ) {
                alt13=63;
            }
            else {
                alt13=16;}
        }
        else if ( (LA13_0=='b') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA13_68 = input.LA(3);

                if ( (LA13_68=='o') ) {
                    int LA13_131 = input.LA(4);

                    if ( (LA13_131=='l') ) {
                        int LA13_174 = input.LA(5);

                        if ( ((LA13_174>='0' && LA13_174<='9')||(LA13_174>='A' && LA13_174<='Z')||LA13_174=='_'||(LA13_174>='a' && LA13_174<='z')) ) {
                            alt13=70;
                        }
                        else {
                            alt13=18;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'i':
                {
                int LA13_69 = input.LA(3);

                if ( (LA13_69=='t') ) {
                    int LA13_132 = input.LA(4);

                    if ( (LA13_132=='m') ) {
                        int LA13_175 = input.LA(5);

                        if ( (LA13_175=='a') ) {
                            int LA13_219 = input.LA(6);

                            if ( (LA13_219=='p') ) {
                                int LA13_258 = input.LA(7);

                                if ( ((LA13_258>='0' && LA13_258<='9')||(LA13_258>='A' && LA13_258<='Z')||LA13_258=='_'||(LA13_258>='a' && LA13_258<='z')) ) {
                                    alt13=70;
                                }
                                else {
                                    alt13=21;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'a':
                {
                int LA13_70 = input.LA(3);

                if ( (LA13_70=='c') ) {
                    int LA13_133 = input.LA(4);

                    if ( (LA13_133=='k') ) {
                        int LA13_176 = input.LA(5);

                        if ( (LA13_176=='g') ) {
                            int LA13_220 = input.LA(6);

                            if ( (LA13_220=='r') ) {
                                int LA13_259 = input.LA(7);

                                if ( (LA13_259=='o') ) {
                                    int LA13_293 = input.LA(8);

                                    if ( (LA13_293=='u') ) {
                                        int LA13_320 = input.LA(9);

                                        if ( (LA13_320=='n') ) {
                                            int LA13_341 = input.LA(10);

                                            if ( (LA13_341=='d') ) {
                                                int LA13_357 = input.LA(11);

                                                if ( (LA13_357==':') ) {
                                                    alt13=33;
                                                }
                                                else {
                                                    alt13=70;}
                                            }
                                            else {
                                                alt13=70;}
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'u':
                {
                int LA13_71 = input.LA(3);

                if ( (LA13_71=='t') ) {
                    int LA13_134 = input.LA(4);

                    if ( (LA13_134=='t') ) {
                        int LA13_177 = input.LA(5);

                        if ( (LA13_177=='o') ) {
                            int LA13_221 = input.LA(6);

                            if ( (LA13_221=='n') ) {
                                int LA13_260 = input.LA(7);

                                if ( ((LA13_260>='0' && LA13_260<='9')||(LA13_260>='A' && LA13_260<='Z')||LA13_260=='_'||(LA13_260>='a' && LA13_260<='z')) ) {
                                    alt13=70;
                                }
                                else {
                                    alt13=41;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            default:
                alt13=70;}

        }
        else if ( (LA13_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA13_72 = input.LA(3);

                if ( (LA13_72=='l') ) {
                    int LA13_135 = input.LA(4);

                    if ( (LA13_135=='o') ) {
                        int LA13_178 = input.LA(5);

                        if ( (LA13_178=='r') ) {
                            int LA13_222 = input.LA(6);

                            if ( ((LA13_222>='0' && LA13_222<='9')||(LA13_222>='A' && LA13_222<='Z')||LA13_222=='_'||(LA13_222>='a' && LA13_222<='z')) ) {
                                alt13=70;
                            }
                            else {
                                alt13=19;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'l':
                {
                int LA13_73 = input.LA(3);

                if ( (LA13_73=='i') ) {
                    int LA13_136 = input.LA(4);

                    if ( (LA13_136=='c') ) {
                        int LA13_179 = input.LA(5);

                        if ( (LA13_179=='k') ) {
                            int LA13_223 = input.LA(6);

                            if ( (LA13_223=='a') ) {
                                int LA13_262 = input.LA(7);

                                if ( (LA13_262=='b') ) {
                                    int LA13_295 = input.LA(8);

                                    if ( (LA13_295=='l') ) {
                                        int LA13_321 = input.LA(9);

                                        if ( (LA13_321=='e') ) {
                                            int LA13_342 = input.LA(10);

                                            if ( (LA13_342=='?') ) {
                                                alt13=34;
                                            }
                                            else {
                                                alt13=70;}
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            default:
                alt13=70;}

        }
        else if ( (LA13_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA13_74 = input.LA(3);

                if ( (LA13_74=='b') ) {
                    switch ( input.LA(4) ) {
                    case 'A':
                        {
                        int LA13_180 = input.LA(5);

                        if ( (LA13_180=='c') ) {
                            int LA13_224 = input.LA(6);

                            if ( (LA13_224=='t') ) {
                                int LA13_263 = input.LA(7);

                                if ( (LA13_263=='i') ) {
                                    int LA13_296 = input.LA(8);

                                    if ( (LA13_296=='v') ) {
                                        int LA13_322 = input.LA(9);

                                        if ( (LA13_322=='i') ) {
                                            int LA13_343 = input.LA(10);

                                            if ( (LA13_343=='t') ) {
                                                int LA13_359 = input.LA(11);

                                                if ( (LA13_359=='y') ) {
                                                    int LA13_369 = input.LA(12);

                                                    if ( ((LA13_369>='0' && LA13_369<='9')||(LA13_369>='A' && LA13_369<='Z')||LA13_369=='_'||(LA13_369>='a' && LA13_369<='z')) ) {
                                                        alt13=70;
                                                    }
                                                    else {
                                                        alt13=56;}
                                                }
                                                else {
                                                    alt13=70;}
                                            }
                                            else {
                                                alt13=70;}
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                        }
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt13=70;
                        }
                        break;
                    default:
                        alt13=57;}

                }
                else {
                    alt13=70;}
                }
                break;
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'p':
                    {
                    int LA13_138 = input.LA(4);

                    if ( (LA13_138==':') ) {
                        alt13=29;
                    }
                    else {
                        alt13=70;}
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt13=70;
                    }
                    break;
                default:
                    alt13=44;}

                }
                break;
            case 'r':
                {
                int LA13_76 = input.LA(3);

                if ( (LA13_76=='a') ) {
                    int LA13_140 = input.LA(4);

                    if ( (LA13_140=='n') ) {
                        int LA13_183 = input.LA(5);

                        if ( (LA13_183=='s') ) {
                            int LA13_225 = input.LA(6);

                            if ( (LA13_225=='i') ) {
                                int LA13_264 = input.LA(7);

                                if ( (LA13_264=='t') ) {
                                    int LA13_297 = input.LA(8);

                                    if ( (LA13_297=='i') ) {
                                        int LA13_323 = input.LA(9);

                                        if ( (LA13_323=='o') ) {
                                            int LA13_344 = input.LA(10);

                                            if ( (LA13_344=='n') ) {
                                                int LA13_360 = input.LA(11);

                                                if ( ((LA13_360>='0' && LA13_360<='9')||(LA13_360>='A' && LA13_360<='Z')||LA13_360=='_'||(LA13_360>='a' && LA13_360<='z')) ) {
                                                    alt13=70;
                                                }
                                                else {
                                                    alt13=22;}
                                            }
                                            else {
                                                alt13=70;}
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'e':
                {
                int LA13_77 = input.LA(3);

                if ( (LA13_77=='x') ) {
                    int LA13_141 = input.LA(4);

                    if ( (LA13_141=='t') ) {
                        switch ( input.LA(5) ) {
                        case 'C':
                            {
                            int LA13_226 = input.LA(6);

                            if ( (LA13_226=='o') ) {
                                int LA13_265 = input.LA(7);

                                if ( (LA13_265=='l') ) {
                                    int LA13_298 = input.LA(8);

                                    if ( (LA13_298=='o') ) {
                                        int LA13_324 = input.LA(9);

                                        if ( (LA13_324=='r') ) {
                                            int LA13_345 = input.LA(10);

                                            if ( (LA13_345==':') ) {
                                                alt13=40;
                                            }
                                            else {
                                                alt13=70;}
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                            }
                            break;
                        case 'V':
                            {
                            int LA13_227 = input.LA(6);

                            if ( (LA13_227=='i') ) {
                                int LA13_266 = input.LA(7);

                                if ( (LA13_266=='e') ) {
                                    int LA13_299 = input.LA(8);

                                    if ( (LA13_299=='w') ) {
                                        int LA13_325 = input.LA(9);

                                        if ( ((LA13_325>='0' && LA13_325<='9')||(LA13_325>='A' && LA13_325<='Z')||LA13_325=='_'||(LA13_325>='a' && LA13_325<='z')) ) {
                                            alt13=70;
                                        }
                                        else {
                                            alt13=38;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                            }
                            break;
                        default:
                            alt13=70;}

                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            default:
                alt13=70;}

        }
        else if ( (LA13_0=='<') ) {
            int LA13_16 = input.LA(2);

            if ( (LA13_16=='-') ) {
                alt13=23;
            }
            else {
                alt13=27;}
        }
        else if ( (LA13_0=='l') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA13_80 = input.LA(3);

                if ( (LA13_80=='a') ) {
                    int LA13_142 = input.LA(4);

                    if ( (LA13_142=='d') ) {
                        int LA13_185 = input.LA(5);

                        if ( ((LA13_185>='0' && LA13_185<='9')||(LA13_185>='A' && LA13_185<='Z')||LA13_185=='_'||(LA13_185>='a' && LA13_185<='z')) ) {
                            alt13=70;
                        }
                        else {
                            alt13=62;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'i':
                {
                switch ( input.LA(3) ) {
                case 's':
                    {
                    int LA13_143 = input.LA(4);

                    if ( (LA13_143=='t') ) {
                        int LA13_186 = input.LA(5);

                        if ( (LA13_186=='A') ) {
                            int LA13_229 = input.LA(6);

                            if ( (LA13_229=='c') ) {
                                int LA13_267 = input.LA(7);

                                if ( (LA13_267=='t') ) {
                                    int LA13_300 = input.LA(8);

                                    if ( (LA13_300=='i') ) {
                                        int LA13_326 = input.LA(9);

                                        if ( (LA13_326=='v') ) {
                                            int LA13_347 = input.LA(10);

                                            if ( (LA13_347=='i') ) {
                                                int LA13_362 = input.LA(11);

                                                if ( (LA13_362=='t') ) {
                                                    int LA13_371 = input.LA(12);

                                                    if ( (LA13_371=='y') ) {
                                                        int LA13_378 = input.LA(13);

                                                        if ( ((LA13_378>='0' && LA13_378<='9')||(LA13_378>='A' && LA13_378<='Z')||LA13_378=='_'||(LA13_378>='a' && LA13_378<='z')) ) {
                                                            alt13=70;
                                                        }
                                                        else {
                                                            alt13=53;}
                                                    }
                                                    else {
                                                        alt13=70;}
                                                }
                                                else {
                                                    alt13=70;}
                                            }
                                            else {
                                                alt13=70;}
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                    }
                    break;
                case 'n':
                    {
                    int LA13_144 = input.LA(4);

                    if ( (LA13_144=='k') ) {
                        int LA13_187 = input.LA(5);

                        if ( ((LA13_187>='0' && LA13_187<='9')||(LA13_187>='A' && LA13_187<='Z')||LA13_187=='_'||(LA13_187>='a' && LA13_187<='z')) ) {
                            alt13=70;
                        }
                        else {
                            alt13=43;}
                    }
                    else {
                        alt13=70;}
                    }
                    break;
                default:
                    alt13=70;}

                }
                break;
            case 'e':
                {
                int LA13_82 = input.LA(3);

                if ( (LA13_82=='f') ) {
                    int LA13_145 = input.LA(4);

                    if ( (LA13_145=='t') ) {
                        int LA13_188 = input.LA(5);

                        if ( (LA13_188==':') ) {
                            alt13=30;
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'a':
                {
                int LA13_83 = input.LA(3);

                if ( (LA13_83=='y') ) {
                    int LA13_146 = input.LA(4);

                    if ( (LA13_146=='o') ) {
                        int LA13_189 = input.LA(5);

                        if ( (LA13_189=='u') ) {
                            int LA13_232 = input.LA(6);

                            if ( (LA13_232=='t') ) {
                                int LA13_268 = input.LA(7);

                                if ( ((LA13_268>='0' && LA13_268<='9')||(LA13_268>='A' && LA13_268<='Z')||LA13_268=='_'||(LA13_268>='a' && LA13_268<='z')) ) {
                                    alt13=70;
                                }
                                else {
                                    alt13=25;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            default:
                alt13=70;}

        }
        else if ( (LA13_0=='w') ) {
            int LA13_18 = input.LA(2);

            if ( (LA13_18=='i') ) {
                int LA13_84 = input.LA(3);

                if ( (LA13_84=='d') ) {
                    switch ( input.LA(4) ) {
                    case 'g':
                        {
                        int LA13_190 = input.LA(5);

                        if ( (LA13_190=='e') ) {
                            int LA13_233 = input.LA(6);

                            if ( (LA13_233=='t') ) {
                                int LA13_269 = input.LA(7);

                                if ( ((LA13_269>='0' && LA13_269<='9')||(LA13_269>='A' && LA13_269<='Z')||LA13_269=='_'||(LA13_269>='a' && LA13_269<='z')) ) {
                                    alt13=70;
                                }
                                else {
                                    alt13=26;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                        }
                        break;
                    case 't':
                        {
                        int LA13_191 = input.LA(5);

                        if ( (LA13_191=='h') ) {
                            int LA13_234 = input.LA(6);

                            if ( (LA13_234==':') ) {
                                alt13=31;
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                        }
                        break;
                    default:
                        alt13=70;}

                }
                else {
                    alt13=70;}
            }
            else {
                alt13=70;}
        }
        else if ( (LA13_0=='>') ) {
            alt13=28;
        }
        else if ( (LA13_0=='h') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA13_86 = input.LA(3);

                if ( (LA13_86=='i') ) {
                    int LA13_148 = input.LA(4);

                    if ( (LA13_148=='g') ) {
                        int LA13_192 = input.LA(5);

                        if ( (LA13_192=='h') ) {
                            int LA13_235 = input.LA(6);

                            if ( (LA13_235=='t') ) {
                                int LA13_271 = input.LA(7);

                                if ( (LA13_271==':') ) {
                                    alt13=32;
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            case 'i':
                {
                int LA13_87 = input.LA(3);

                if ( (LA13_87=='n') ) {
                    int LA13_149 = input.LA(4);

                    if ( (LA13_149=='t') ) {
                        int LA13_193 = input.LA(5);

                        if ( (LA13_193==':') ) {
                            alt13=39;
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
                }
                break;
            default:
                alt13=70;}

        }
        else if ( (LA13_0=='f') ) {
            int LA13_21 = input.LA(2);

            if ( (LA13_21=='a') ) {
                int LA13_88 = input.LA(3);

                if ( (LA13_88=='d') ) {
                    int LA13_150 = input.LA(4);

                    if ( (LA13_150=='e') ) {
                        int LA13_194 = input.LA(5);

                        if ( (LA13_194=='S') ) {
                            int LA13_237 = input.LA(6);

                            if ( (LA13_237=='c') ) {
                                int LA13_272 = input.LA(7);

                                if ( (LA13_272=='r') ) {
                                    int LA13_304 = input.LA(8);

                                    if ( (LA13_304=='o') ) {
                                        int LA13_327 = input.LA(9);

                                        if ( (LA13_327=='l') ) {
                                            int LA13_348 = input.LA(10);

                                            if ( (LA13_348=='l') ) {
                                                int LA13_363 = input.LA(11);

                                                if ( (LA13_363=='B') ) {
                                                    int LA13_372 = input.LA(12);

                                                    if ( (LA13_372=='a') ) {
                                                        int LA13_379 = input.LA(13);

                                                        if ( (LA13_379=='r') ) {
                                                            int LA13_382 = input.LA(14);

                                                            if ( (LA13_382=='s') ) {
                                                                int LA13_384 = input.LA(15);

                                                                if ( (LA13_384=='?') ) {
                                                                    alt13=35;
                                                                }
                                                                else {
                                                                    alt13=70;}
                                                            }
                                                            else {
                                                                alt13=70;}
                                                        }
                                                        else {
                                                            alt13=70;}
                                                    }
                                                    else {
                                                        alt13=70;}
                                                }
                                                else {
                                                    alt13=70;}
                                            }
                                            else {
                                                alt13=70;}
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
            }
            else {
                alt13=70;}
        }
        else if ( (LA13_0=='-') ) {
            int LA13_22 = input.LA(2);

            if ( (LA13_22=='>') ) {
                alt13=37;
            }
            else {
                alt13=76;}
        }
        else if ( (LA13_0=='e') ) {
            int LA13_23 = input.LA(2);

            if ( (LA13_23=='d') ) {
                int LA13_90 = input.LA(3);

                if ( (LA13_90=='i') ) {
                    int LA13_151 = input.LA(4);

                    if ( (LA13_151=='t') ) {
                        switch ( input.LA(5) ) {
                        case 'a':
                            {
                            int LA13_238 = input.LA(6);

                            if ( (LA13_238=='b') ) {
                                int LA13_273 = input.LA(7);

                                if ( (LA13_273=='l') ) {
                                    int LA13_305 = input.LA(8);

                                    if ( (LA13_305=='e') ) {
                                        int LA13_328 = input.LA(9);

                                        if ( (LA13_328=='?') ) {
                                            alt13=48;
                                        }
                                        else {
                                            alt13=70;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                            }
                            break;
                        case 'T':
                            {
                            int LA13_239 = input.LA(6);

                            if ( (LA13_239=='e') ) {
                                int LA13_274 = input.LA(7);

                                if ( (LA13_274=='x') ) {
                                    int LA13_306 = input.LA(8);

                                    if ( (LA13_306=='t') ) {
                                        int LA13_329 = input.LA(9);

                                        if ( ((LA13_329>='0' && LA13_329<='9')||(LA13_329>='A' && LA13_329<='Z')||LA13_329=='_'||(LA13_329>='a' && LA13_329<='z')) ) {
                                            alt13=70;
                                        }
                                        else {
                                            alt13=47;}
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                            }
                            break;
                        default:
                            alt13=70;}

                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
            }
            else {
                alt13=70;}
        }
        else if ( (LA13_0=='n') ) {
            int LA13_24 = input.LA(2);

            if ( (LA13_24=='u') ) {
                int LA13_91 = input.LA(3);

                if ( (LA13_91=='m') ) {
                    int LA13_152 = input.LA(4);

                    if ( (LA13_152=='e') ) {
                        int LA13_196 = input.LA(5);

                        if ( (LA13_196=='r') ) {
                            int LA13_240 = input.LA(6);

                            if ( (LA13_240=='i') ) {
                                int LA13_275 = input.LA(7);

                                if ( (LA13_275=='c') ) {
                                    int LA13_307 = input.LA(8);

                                    if ( (LA13_307=='?') ) {
                                        alt13=49;
                                    }
                                    else {
                                        alt13=70;}
                                }
                                else {
                                    alt13=70;}
                            }
                            else {
                                alt13=70;}
                        }
                        else {
                            alt13=70;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
            }
            else {
                alt13=70;}
        }
        else if ( (LA13_0=='g') ) {
            int LA13_25 = input.LA(2);

            if ( (LA13_25=='o') ) {
                int LA13_92 = input.LA(3);

                if ( (LA13_92=='T') ) {
                    int LA13_153 = input.LA(4);

                    if ( (LA13_153=='o') ) {
                        int LA13_197 = input.LA(5);

                        if ( ((LA13_197>='0' && LA13_197<='9')||(LA13_197>='A' && LA13_197<='Z')||LA13_197=='_'||(LA13_197>='a' && LA13_197<='z')) ) {
                            alt13=70;
                        }
                        else {
                            alt13=59;}
                    }
                    else {
                        alt13=70;}
                }
                else {
                    alt13=70;}
            }
            else {
                alt13=70;}
        }
        else if ( (LA13_0=='(') ) {
            alt13=64;
        }
        else if ( (LA13_0==')') ) {
            alt13=65;
        }
        else if ( (LA13_0=='.') ) {
            alt13=66;
        }
        else if ( (LA13_0==':') ) {
            int LA13_29 = input.LA(2);

            if ( (LA13_29=='/') ) {
                alt13=67;
            }
            else {
                alt13=76;}
        }
        else if ( (LA13_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt13=73;
                }
                break;
            case '/':
                {
                alt13=74;
                }
                break;
            default:
                alt13=68;}

        }
        else if ( (LA13_0=='#') ) {
            int LA13_31 = input.LA(2);

            if ( ((LA13_31>='0' && LA13_31<='9')||(LA13_31>='A' && LA13_31<='F')||(LA13_31>='a' && LA13_31<='f')) ) {
                alt13=69;
            }
            else {
                alt13=76;}
        }
        else if ( (LA13_0=='^') ) {
            int LA13_32 = input.LA(2);

            if ( ((LA13_32>='A' && LA13_32<='Z')||LA13_32=='_'||(LA13_32>='a' && LA13_32<='z')) ) {
                alt13=70;
            }
            else {
                alt13=76;}
        }
        else if ( ((LA13_0>='A' && LA13_0<='M')||(LA13_0>='O' && LA13_0<='X')||LA13_0=='Z'||LA13_0=='_'||(LA13_0>='j' && LA13_0<='k')||LA13_0=='o'||LA13_0=='q'||(LA13_0>='u' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {
            alt13=70;
        }
        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {
            alt13=71;
        }
        else if ( (LA13_0=='\"') ) {
            int LA13_35 = input.LA(2);

            if ( ((LA13_35>='\u0000' && LA13_35<='\uFFFE')) ) {
                alt13=72;
            }
            else {
                alt13=76;}
        }
        else if ( (LA13_0=='\'') ) {
            int LA13_36 = input.LA(2);

            if ( ((LA13_36>='\u0000' && LA13_36<='\uFFFE')) ) {
                alt13=72;
            }
            else {
                alt13=76;}
        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13=75;
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='$' && LA13_0<='&')||(LA13_0>='*' && LA13_0<=',')||LA13_0==';'||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
            alt13=76;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | RULE_HEX_COLOR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

            throw nvae;
        }
        switch (alt13) {
            case 1 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:70: T27
                {
                mT27(); 

                }
                break;
            case 17 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:74: T28
                {
                mT28(); 

                }
                break;
            case 18 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:78: T29
                {
                mT29(); 

                }
                break;
            case 19 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:82: T30
                {
                mT30(); 

                }
                break;
            case 20 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:86: T31
                {
                mT31(); 

                }
                break;
            case 21 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:90: T32
                {
                mT32(); 

                }
                break;
            case 22 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:94: T33
                {
                mT33(); 

                }
                break;
            case 23 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:98: T34
                {
                mT34(); 

                }
                break;
            case 24 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:102: T35
                {
                mT35(); 

                }
                break;
            case 25 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:106: T36
                {
                mT36(); 

                }
                break;
            case 26 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:110: T37
                {
                mT37(); 

                }
                break;
            case 27 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:114: T38
                {
                mT38(); 

                }
                break;
            case 28 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:118: T39
                {
                mT39(); 

                }
                break;
            case 29 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:122: T40
                {
                mT40(); 

                }
                break;
            case 30 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:126: T41
                {
                mT41(); 

                }
                break;
            case 31 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:130: T42
                {
                mT42(); 

                }
                break;
            case 32 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:134: T43
                {
                mT43(); 

                }
                break;
            case 33 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:138: T44
                {
                mT44(); 

                }
                break;
            case 34 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:142: T45
                {
                mT45(); 

                }
                break;
            case 35 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:146: T46
                {
                mT46(); 

                }
                break;
            case 36 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:150: T47
                {
                mT47(); 

                }
                break;
            case 37 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:154: T48
                {
                mT48(); 

                }
                break;
            case 38 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:158: T49
                {
                mT49(); 

                }
                break;
            case 39 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:162: T50
                {
                mT50(); 

                }
                break;
            case 40 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:166: T51
                {
                mT51(); 

                }
                break;
            case 41 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:170: T52
                {
                mT52(); 

                }
                break;
            case 42 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:174: T53
                {
                mT53(); 

                }
                break;
            case 43 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:178: T54
                {
                mT54(); 

                }
                break;
            case 44 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:182: T55
                {
                mT55(); 

                }
                break;
            case 45 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:186: T56
                {
                mT56(); 

                }
                break;
            case 46 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:190: T57
                {
                mT57(); 

                }
                break;
            case 47 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:194: T58
                {
                mT58(); 

                }
                break;
            case 48 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:198: T59
                {
                mT59(); 

                }
                break;
            case 49 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:202: T60
                {
                mT60(); 

                }
                break;
            case 50 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:206: T61
                {
                mT61(); 

                }
                break;
            case 51 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:210: T62
                {
                mT62(); 

                }
                break;
            case 52 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:214: T63
                {
                mT63(); 

                }
                break;
            case 53 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:218: T64
                {
                mT64(); 

                }
                break;
            case 54 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:222: T65
                {
                mT65(); 

                }
                break;
            case 55 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:226: T66
                {
                mT66(); 

                }
                break;
            case 56 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:230: T67
                {
                mT67(); 

                }
                break;
            case 57 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:234: T68
                {
                mT68(); 

                }
                break;
            case 58 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:238: T69
                {
                mT69(); 

                }
                break;
            case 59 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:242: T70
                {
                mT70(); 

                }
                break;
            case 60 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:246: T71
                {
                mT71(); 

                }
                break;
            case 61 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:250: T72
                {
                mT72(); 

                }
                break;
            case 62 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:254: T73
                {
                mT73(); 

                }
                break;
            case 63 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:258: T74
                {
                mT74(); 

                }
                break;
            case 64 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:262: T75
                {
                mT75(); 

                }
                break;
            case 65 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:266: T76
                {
                mT76(); 

                }
                break;
            case 66 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:270: T77
                {
                mT77(); 

                }
                break;
            case 67 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:274: T78
                {
                mT78(); 

                }
                break;
            case 68 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:278: T79
                {
                mT79(); 

                }
                break;
            case 69 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:282: RULE_HEX_COLOR
                {
                mRULE_HEX_COLOR(); 

                }
                break;
            case 70 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:297: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 71 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:305: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 72 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:314: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 73 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:326: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 74 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:342: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 75 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:358: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 76 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:366: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}