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
    public static final int T114=114;
    public static final int T115=115;
    public static final int RULE_ID=6;
    public static final int T116=116;
    public static final int T117=117;
    public static final int T118=118;
    public static final int T119=119;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_HEX_COLOR=9;
    public static final int EOF=-1;
    public static final int T120=120;
    public static final int T122=122;
    public static final int T121=121;
    public static final int T124=124;
    public static final int T123=123;
    public static final int T127=127;
    public static final int T128=128;
    public static final int T125=125;
    public static final int T126=126;
    public static final int T129=129;
    public static final int T131=131;
    public static final int T130=130;
    public static final int T135=135;
    public static final int T134=134;
    public static final int T133=133;
    public static final int T132=132;
    public static final int T202=202;
    public static final int T203=203;
    public static final int T204=204;
    public static final int T205=205;
    public static final int T206=206;
    public static final int T100=100;
    public static final int T102=102;
    public static final int T101=101;
    public static final int RULE_ML_COMMENT=10;
    public static final int T109=109;
    public static final int T107=107;
    public static final int RULE_STRING=7;
    public static final int T108=108;
    public static final int T105=105;
    public static final int T106=106;
    public static final int T103=103;
    public static final int T104=104;
    public static final int T113=113;
    public static final int T112=112;
    public static final int T111=111;
    public static final int T110=110;
    public static final int T201=201;
    public static final int T200=200;
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int T159=159;
    public static final int T158=158;
    public static final int T161=161;
    public static final int T162=162;
    public static final int T163=163;
    public static final int T164=164;
    public static final int T165=165;
    public static final int T166=166;
    public static final int T167=167;
    public static final int T168=168;
    public static final int T72=72;
    public static final int T71=71;
    public static final int T70=70;
    public static final int T160=160;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int T169=169;
    public static final int T174=174;
    public static final int T175=175;
    public static final int T172=172;
    public static final int T173=173;
    public static final int T178=178;
    public static final int T179=179;
    public static final int T176=176;
    public static final int T177=177;
    public static final int T170=170;
    public static final int T171=171;
    public static final int T61=61;
    public static final int T60=60;
    public static final int T99=99;
    public static final int T97=97;
    public static final int T98=98;
    public static final int T95=95;
    public static final int T96=96;
    public static final int T137=137;
    public static final int T136=136;
    public static final int T139=139;
    public static final int T138=138;
    public static final int T143=143;
    public static final int T144=144;
    public static final int T145=145;
    public static final int T146=146;
    public static final int T140=140;
    public static final int T141=141;
    public static final int T142=142;
    public static final int T94=94;
    public static final int Tokens=207;
    public static final int RULE_SL_COMMENT=11;
    public static final int T93=93;
    public static final int T92=92;
    public static final int T91=91;
    public static final int T90=90;
    public static final int T88=88;
    public static final int T89=89;
    public static final int T84=84;
    public static final int T85=85;
    public static final int T86=86;
    public static final int T87=87;
    public static final int T149=149;
    public static final int T148=148;
    public static final int T147=147;
    public static final int T156=156;
    public static final int T157=157;
    public static final int T154=154;
    public static final int T155=155;
    public static final int T152=152;
    public static final int T153=153;
    public static final int T150=150;
    public static final int T151=151;
    public static final int T81=81;
    public static final int T80=80;
    public static final int T83=83;
    public static final int T82=82;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T191=191;
    public static final int T190=190;
    public static final int T193=193;
    public static final int T192=192;
    public static final int T195=195;
    public static final int T194=194;
    public static final int T197=197;
    public static final int T196=196;
    public static final int T199=199;
    public static final int T198=198;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int T44=44;
    public static final int T182=182;
    public static final int T181=181;
    public static final int T180=180;
    public static final int T50=50;
    public static final int T186=186;
    public static final int T185=185;
    public static final int T184=184;
    public static final int T183=183;
    public static final int T189=189;
    public static final int T188=188;
    public static final int T187=187;
    public static final int T59=59;
    public static final int T52=52;
    public static final int T51=51;
    public static final int T54=54;
    public static final int T53=53;
    public static final int T56=56;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public static final int RULE_BOOL=8;
    public static final int RULE_INT=5;
    public static final int RULE_FLOAT=4;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=12;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalDroidLexer() {;} 
    public InternalDroidLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g"; }

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:10:5: ( 'dp' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:10:7: 'dp'
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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:11:5: ( 'sp' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:11:7: 'sp'
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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:12:5: ( 'pt' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:12:7: 'pt'
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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:13:5: ( 'px' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:13:7: 'px'
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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:14:5: ( 'mm' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:14:7: 'mm'
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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:15:5: ( 'in' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:15:7: 'in'
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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:16:5: ( 'accelerate_decelerate' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:16:7: 'accelerate_decelerate'
            {
            match("accelerate_decelerate"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:17:5: ( 'accelerate' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:17:7: 'accelerate'
            {
            match("accelerate"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18:5: ( 'anticipate' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:18:7: 'anticipate'
            {
            match("anticipate"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:19:5: ( 'anticipate_overshoot' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:19:7: 'anticipate_overshoot'
            {
            match("anticipate_overshoot"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:20:5: ( 'bounce' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:20:7: 'bounce'
            {
            match("bounce"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:21:5: ( 'cycle' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:21:7: 'cycle'
            {
            match("cycle"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:22:5: ( 'decelerate' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:22:7: 'decelerate'
            {
            match("decelerate"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:23:5: ( 'linear' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:23:7: 'linear'
            {
            match("linear"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:24:5: ( 'overshoot' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:24:7: 'overshoot'
            {
            match("overshoot"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:25:5: ( 'fill_parent' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:25:7: 'fill_parent'
            {
            match("fill_parent"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:26:5: ( 'match_parent' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:26:7: 'match_parent'
            {
            match("match_parent"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:27:5: ( 'wrap_content' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:27:7: 'wrap_content'
            {
            match("wrap_content"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:28:5: ( 'top' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:28:7: 'top'
            {
            match("top"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:29:5: ( 'bottom' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:29:7: 'bottom'
            {
            match("bottom"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:30:5: ( 'left' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:30:7: 'left'
            {
            match("left"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:31:5: ( 'right' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:31:7: 'right'
            {
            match("right"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:32:5: ( 'center' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:32:7: 'center'
            {
            match("center"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:33:5: ( 'center_vertical' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:33:7: 'center_vertical'
            {
            match("center_vertical"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:34:5: ( 'center_horizontal' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:34:7: 'center_horizontal'
            {
            match("center_horizontal"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:35:5: ( 'fill' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:35:7: 'fill'
            {
            match("fill"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:36:5: ( 'fill_vertical' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:36:7: 'fill_vertical'
            {
            match("fill_vertical"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:37:5: ( 'fill_horizontal' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:37:7: 'fill_horizontal'
            {
            match("fill_horizontal"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:38:5: ( 'clip_vertical' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:38:7: 'clip_vertical'
            {
            match("clip_vertical"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:39:5: ( 'clip_horizontal' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:39:7: 'clip_horizontal'
            {
            match("clip_horizontal"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:40:5: ( 'horizontal' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:40:7: 'horizontal'
            {
            match("horizontal"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:41:5: ( 'vertical' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:41:7: 'vertical'
            {
            match("vertical"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:42:5: ( 'visible' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:42:7: 'visible'
            {
            match("visible"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:43:5: ( 'invisible' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:43:7: 'invisible'
            {
            match("invisible"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:44:5: ( 'gone' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:44:7: 'gone'
            {
            match("gone"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45:5: ( 'normal' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45:7: 'normal'
            {
            match("normal"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:46:5: ( 'sans' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:46:7: 'sans'
            {
            match("sans"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:47:5: ( 'serif' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:47:7: 'serif'
            {
            match("serif"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:48:5: ( 'monospace' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:48:7: 'monospace'
            {
            match("monospace"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:49:5: ( 'bold' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:49:7: 'bold'
            {
            match("bold"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:50:5: ( 'italic' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:50:7: 'italic'
            {
            match("italic"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:51:5: ( 'none' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:51:7: 'none'
            {
            match("none"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:52:5: ( 'web' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:52:7: 'web'
            {
            match("web"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:53:5: ( 'email' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:53:7: 'email'
            {
            match("email"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:54:5: ( 'phone' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:54:7: 'phone'
            {
            match("phone"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:55:5: ( 'map' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:55:7: 'map'
            {
            match("map"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:56:5: ( 'all' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:56:7: 'all'
            {
            match("all"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:57:5: ( 'sentences' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:57:7: 'sentences'
            {
            match("sentences"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:58:5: ( 'words' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:58:7: 'words'
            {
            match("words"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:59:5: ( 'characters' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:59:7: 'characters'
            {
            match("characters"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:60:5: ( 'application' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:60:7: 'application'
            {
            match("application"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:61:5: ( '=>' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:61:7: '=>'
            {
            match("=>"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:62:5: ( '{' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:62:7: '{'
            {
            match('{'); 

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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:63:5: ( '}' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:63:7: '}'
            {
            match('}'); 

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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:64:5: ( 'version:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:64:7: 'version:'
            {
            match("version:"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:65:5: ( 'sdk:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:65:7: 'sdk:'
            {
            match("sdk:"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:66:5: ( 'min:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:66:7: 'min:'
            {
            match("min:"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:67:5: ( ';' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:67:7: ';'
            {
            match(';'); 

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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:68:5: ( 'max:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:68:7: 'max:'
            {
            match("max:"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:69:5: ( 'target:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:69:7: 'target:'
            {
            match("target:"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:70:5: ( 'screen' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:70:7: 'screen'
            {
            match("screen"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:71:5: ( 'layout:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:71:7: 'layout:'
            {
            match("layout:"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:72:5: ( '#' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:72:7: '#'
            {
            match('#'); 

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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:73:5: ( 'listActivity' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:73:7: 'listActivity'
            {
            match("listActivity"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:74:5: ( 'data:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:74:7: 'data:'
            {
            match("data:"); 


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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:75:5: ( 'item:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:75:7: 'item:'
            {
            match("item:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:76:5: ( 'tabActivity' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:76:7: 'tabActivity'
            {
            match("tabActivity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:77:5: ( 'tab:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:77:7: 'tab:'
            {
            match("tab:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:78:5: ( 'icon:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:78:7: 'icon:'
            {
            match("icon:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:79:5: ( 'selectedIcon:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:79:7: 'selectedIcon:'
            {
            match("selectedIcon:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:80:5: ( 'activity:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:80:7: 'activity:'
            {
            match("activity:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:81:5: ( 'goTo' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:81:7: 'goTo'
            {
            match("goTo"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:82:5: ( 'show' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:82:7: 'show'
            {
            match("show"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:83:5: ( 'invoke' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:83:7: 'invoke'
            {
            match("invoke"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:84:5: ( 'layout' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:84:7: 'layout'
            {
            match("layout"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:85:5: ( 'alpha:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:85:7: 'alpha:'
            {
            match("alpha:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public final void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:86:5: ( 'background:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:86:7: 'background:'
            {
            match("background:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start T91
    public final void mT91() throws RecognitionException {
        try {
            int _type = T91;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:87:5: ( 'minHeight:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:87:7: 'minHeight:'
            {
            match("minHeight:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T91

    // $ANTLR start T92
    public final void mT92() throws RecognitionException {
        try {
            int _type = T92;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:88:5: ( 'minWidth:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:88:7: 'minWidth:'
            {
            match("minWidth:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T92

    // $ANTLR start T93
    public final void mT93() throws RecognitionException {
        try {
            int _type = T93;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:89:5: ( 'nextFocusDown:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:89:7: 'nextFocusDown:'
            {
            match("nextFocusDown:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T93

    // $ANTLR start T94
    public final void mT94() throws RecognitionException {
        try {
            int _type = T94;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:90:5: ( 'nextFocusLeft:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:90:7: 'nextFocusLeft:'
            {
            match("nextFocusLeft:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T94

    // $ANTLR start T95
    public final void mT95() throws RecognitionException {
        try {
            int _type = T95;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:91:5: ( 'nextFocusRight:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:91:7: 'nextFocusRight:'
            {
            match("nextFocusRight:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T95

    // $ANTLR start T96
    public final void mT96() throws RecognitionException {
        try {
            int _type = T96;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:92:5: ( 'nextFocusUp:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:92:7: 'nextFocusUp:'
            {
            match("nextFocusUp:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T96

    // $ANTLR start T97
    public final void mT97() throws RecognitionException {
        try {
            int _type = T97;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:93:5: ( 'onClick:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:93:7: 'onClick:'
            {
            match("onClick:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T97

    // $ANTLR start T98
    public final void mT98() throws RecognitionException {
        try {
            int _type = T98;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:94:5: ( 'padding:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:94:7: 'padding:'
            {
            match("padding:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T98

    // $ANTLR start T99
    public final void mT99() throws RecognitionException {
        try {
            int _type = T99;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:95:5: ( 'paddingBottom:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:95:7: 'paddingBottom:'
            {
            match("paddingBottom:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T99

    // $ANTLR start T100
    public final void mT100() throws RecognitionException {
        try {
            int _type = T100;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:96:6: ( 'paddingLeft:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:96:8: 'paddingLeft:'
            {
            match("paddingLeft:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T100

    // $ANTLR start T101
    public final void mT101() throws RecognitionException {
        try {
            int _type = T101;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:97:6: ( 'paddingRight:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:97:8: 'paddingRight:'
            {
            match("paddingRight:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T101

    // $ANTLR start T102
    public final void mT102() throws RecognitionException {
        try {
            int _type = T102;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:98:6: ( 'paddingTop:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:98:8: 'paddingTop:'
            {
            match("paddingTop:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T102

    // $ANTLR start T103
    public final void mT103() throws RecognitionException {
        try {
            int _type = T103;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:99:6: ( 'scrollbars:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:99:8: 'scrollbars:'
            {
            match("scrollbars:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T103

    // $ANTLR start T104
    public final void mT104() throws RecognitionException {
        try {
            int _type = T104;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:100:6: ( 'visibility:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:100:8: 'visibility:'
            {
            match("visibility:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T104

    // $ANTLR start T105
    public final void mT105() throws RecognitionException {
        try {
            int _type = T105;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:101:6: ( 'animation:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:101:8: 'animation:'
            {
            match("animation:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T105

    // $ANTLR start T106
    public final void mT106() throws RecognitionException {
        try {
            int _type = T106;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:102:6: ( 'orientation:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:102:8: 'orientation:'
            {
            match("orientation:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T106

    // $ANTLR start T107
    public final void mT107() throws RecognitionException {
        try {
            int _type = T107;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:103:6: ( 'relative' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:103:8: 'relative'
            {
            match("relative"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T107

    // $ANTLR start T108
    public final void mT108() throws RecognitionException {
        try {
            int _type = T108;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:104:6: ( 'tab' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:104:8: 'tab'
            {
            match("tab"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T108

    // $ANTLR start T109
    public final void mT109() throws RecognitionException {
        try {
            int _type = T109;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:105:6: ( 'tabWidget' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:105:8: 'tabWidget'
            {
            match("tabWidget"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T109

    // $ANTLR start T110
    public final void mT110() throws RecognitionException {
        try {
            int _type = T110;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:106:6: ( 'gravity:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:106:8: 'gravity:'
            {
            match("gravity:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T110

    // $ANTLR start T111
    public final void mT111() throws RecognitionException {
        try {
            int _type = T111;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:107:6: ( '|' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:107:8: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T111

    // $ANTLR start T112
    public final void mT112() throws RecognitionException {
        try {
            int _type = T112;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:108:6: ( 'divider:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:108:8: 'divider:'
            {
            match("divider:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T112

    // $ANTLR start T113
    public final void mT113() throws RecognitionException {
        try {
            int _type = T113;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:109:6: ( 'tabStrip:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:109:8: 'tabStrip:'
            {
            match("tabStrip:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T113

    // $ANTLR start T114
    public final void mT114() throws RecognitionException {
        try {
            int _type = T114;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:110:6: ( 'tabStripLeft:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:110:8: 'tabStripLeft:'
            {
            match("tabStripLeft:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T114

    // $ANTLR start T115
    public final void mT115() throws RecognitionException {
        try {
            int _type = T115;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:111:6: ( 'tabStripRight:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:111:8: 'tabStripRight:'
            {
            match("tabStripRight:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T115

    // $ANTLR start T116
    public final void mT116() throws RecognitionException {
        try {
            int _type = T116;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:112:6: ( 'frame' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:112:8: 'frame'
            {
            match("frame"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T116

    // $ANTLR start T117
    public final void mT117() throws RecognitionException {
        try {
            int _type = T117;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:113:6: ( 'height:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:113:8: 'height:'
            {
            match("height:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T117

    // $ANTLR start T118
    public final void mT118() throws RecognitionException {
        try {
            int _type = T118;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:114:6: ( 'width:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:114:8: 'width:'
            {
            match("width:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T118

    // $ANTLR start T119
    public final void mT119() throws RecognitionException {
        try {
            int _type = T119;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:115:6: ( 'weight:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:115:8: 'weight:'
            {
            match("weight:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T119

    // $ANTLR start T120
    public final void mT120() throws RecognitionException {
        try {
            int _type = T120;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:116:6: ( 'marginBottom:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:116:8: 'marginBottom:'
            {
            match("marginBottom:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T120

    // $ANTLR start T121
    public final void mT121() throws RecognitionException {
        try {
            int _type = T121;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:117:6: ( 'marginLeft:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:117:8: 'marginLeft:'
            {
            match("marginLeft:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T121

    // $ANTLR start T122
    public final void mT122() throws RecognitionException {
        try {
            int _type = T122;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:118:6: ( 'marginRight:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:118:8: 'marginRight:'
            {
            match("marginRight:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T122

    // $ANTLR start T123
    public final void mT123() throws RecognitionException {
        try {
            int _type = T123;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:119:6: ( 'marginTop:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:119:8: 'marginTop:'
            {
            match("marginTop:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T123

    // $ANTLR start T124
    public final void mT124() throws RecognitionException {
        try {
            int _type = T124;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:120:6: ( 'above:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:120:8: 'above:'
            {
            match("above:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T124

    // $ANTLR start T125
    public final void mT125() throws RecognitionException {
        try {
            int _type = T125;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:121:6: ( 'alignBaseline:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:121:8: 'alignBaseline:'
            {
            match("alignBaseline:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T125

    // $ANTLR start T126
    public final void mT126() throws RecognitionException {
        try {
            int _type = T126;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:122:6: ( 'alignBottom:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:122:8: 'alignBottom:'
            {
            match("alignBottom:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T126

    // $ANTLR start T127
    public final void mT127() throws RecognitionException {
        try {
            int _type = T127;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:123:6: ( 'alignLeft:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:123:8: 'alignLeft:'
            {
            match("alignLeft:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T127

    // $ANTLR start T128
    public final void mT128() throws RecognitionException {
        try {
            int _type = T128;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:124:6: ( 'alignParentBottom:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:124:8: 'alignParentBottom:'
            {
            match("alignParentBottom:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T128

    // $ANTLR start T129
    public final void mT129() throws RecognitionException {
        try {
            int _type = T129;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:125:6: ( 'alignParentLeft:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:125:8: 'alignParentLeft:'
            {
            match("alignParentLeft:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T129

    // $ANTLR start T130
    public final void mT130() throws RecognitionException {
        try {
            int _type = T130;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:126:6: ( 'alignParentRight:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:126:8: 'alignParentRight:'
            {
            match("alignParentRight:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T130

    // $ANTLR start T131
    public final void mT131() throws RecognitionException {
        try {
            int _type = T131;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:127:6: ( 'alignParentTop:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:127:8: 'alignParentTop:'
            {
            match("alignParentTop:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T131

    // $ANTLR start T132
    public final void mT132() throws RecognitionException {
        try {
            int _type = T132;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:128:6: ( 'alignTop:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:128:8: 'alignTop:'
            {
            match("alignTop:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T132

    // $ANTLR start T133
    public final void mT133() throws RecognitionException {
        try {
            int _type = T133;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:129:6: ( 'alignWithParentIfMissing:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:129:8: 'alignWithParentIfMissing:'
            {
            match("alignWithParentIfMissing:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T133

    // $ANTLR start T134
    public final void mT134() throws RecognitionException {
        try {
            int _type = T134;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:130:6: ( 'below:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:130:8: 'below:'
            {
            match("below:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T134

    // $ANTLR start T135
    public final void mT135() throws RecognitionException {
        try {
            int _type = T135;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:131:6: ( 'centerHorizontal:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:131:8: 'centerHorizontal:'
            {
            match("centerHorizontal:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T135

    // $ANTLR start T136
    public final void mT136() throws RecognitionException {
        try {
            int _type = T136;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:132:6: ( 'centerInParent:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:132:8: 'centerInParent:'
            {
            match("centerInParent:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T136

    // $ANTLR start T137
    public final void mT137() throws RecognitionException {
        try {
            int _type = T137;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:133:6: ( 'centerVertical:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:133:8: 'centerVertical:'
            {
            match("centerVertical:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T137

    // $ANTLR start T138
    public final void mT138() throws RecognitionException {
        try {
            int _type = T138;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:134:6: ( 'toLeftOf:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:134:8: 'toLeftOf:'
            {
            match("toLeftOf:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T138

    // $ANTLR start T139
    public final void mT139() throws RecognitionException {
        try {
            int _type = T139;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:135:6: ( 'toRightOf:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:135:8: 'toRightOf:'
            {
            match("toRightOf:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T139

    // $ANTLR start T140
    public final void mT140() throws RecognitionException {
        try {
            int _type = T140;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:136:6: ( 'textView:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:136:8: 'textView:'
            {
            match("textView:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T140

    // $ANTLR start T141
    public final void mT141() throws RecognitionException {
        try {
            int _type = T141;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:137:6: ( '<' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:137:8: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T141

    // $ANTLR start T142
    public final void mT142() throws RecognitionException {
        try {
            int _type = T142;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:138:6: ( '>' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:138:8: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T142

    // $ANTLR start T143
    public final void mT143() throws RecognitionException {
        try {
            int _type = T143;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:139:6: ( 'top:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:139:8: 'top:'
            {
            match("top:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T143

    // $ANTLR start T144
    public final void mT144() throws RecognitionException {
        try {
            int _type = T144;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:140:6: ( 'left:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:140:8: 'left:'
            {
            match("left:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T144

    // $ANTLR start T145
    public final void mT145() throws RecognitionException {
        try {
            int _type = T145;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:141:6: ( 'clickable:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:141:8: 'clickable:'
            {
            match("clickable:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T145

    // $ANTLR start T146
    public final void mT146() throws RecognitionException {
        try {
            int _type = T146;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:142:6: ( 'fadeScrollBars:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:142:8: 'fadeScrollBars:'
            {
            match("fadeScrollBars:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T146

    // $ANTLR start T147
    public final void mT147() throws RecognitionException {
        try {
            int _type = T147;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:143:6: ( 'isScrollContainer:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:143:8: 'isScrollContainer:'
            {
            match("isScrollContainer:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T147

    // $ANTLR start T148
    public final void mT148() throws RecognitionException {
        try {
            int _type = T148;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:144:6: ( 'autoLink:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:144:8: 'autoLink:'
            {
            match("autoLink:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T148

    // $ANTLR start T149
    public final void mT149() throws RecognitionException {
        try {
            int _type = T149;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:145:6: ( 'autoText:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:145:8: 'autoText:'
            {
            match("autoText:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T149

    // $ANTLR start T150
    public final void mT150() throws RecognitionException {
        try {
            int _type = T150;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:146:6: ( 'capitalize:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:146:8: 'capitalize:'
            {
            match("capitalize:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T150

    // $ANTLR start T151
    public final void mT151() throws RecognitionException {
        try {
            int _type = T151;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:147:6: ( 'digits:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:147:8: 'digits:'
            {
            match("digits:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T151

    // $ANTLR start T152
    public final void mT152() throws RecognitionException {
        try {
            int _type = T152;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:148:6: ( 'editable:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:148:8: 'editable:'
            {
            match("editable:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T152

    // $ANTLR start T153
    public final void mT153() throws RecognitionException {
        try {
            int _type = T153;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:149:6: ( 'hint:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:149:8: 'hint:'
            {
            match("hint:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T153

    // $ANTLR start T154
    public final void mT154() throws RecognitionException {
        try {
            int _type = T154;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:150:6: ( 'numeric:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:150:8: 'numeric:'
            {
            match("numeric:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T154

    // $ANTLR start T155
    public final void mT155() throws RecognitionException {
        try {
            int _type = T155;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:151:6: ( 'password:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:151:8: 'password:'
            {
            match("password:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T155

    // $ANTLR start T156
    public final void mT156() throws RecognitionException {
        try {
            int _type = T156;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:152:6: ( 'phoneNumber:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:152:8: 'phoneNumber:'
            {
            match("phoneNumber:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T156

    // $ANTLR start T157
    public final void mT157() throws RecognitionException {
        try {
            int _type = T157;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:153:6: ( 'singleLine:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:153:8: 'singleLine:'
            {
            match("singleLine:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T157

    // $ANTLR start T158
    public final void mT158() throws RecognitionException {
        try {
            int _type = T158;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:154:6: ( 'textColor:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:154:8: 'textColor:'
            {
            match("textColor:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T158

    // $ANTLR start T159
    public final void mT159() throws RecognitionException {
        try {
            int _type = T159;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:155:6: ( 'typeface:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:155:8: 'typeface:'
            {
            match("typeface:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T159

    // $ANTLR start T160
    public final void mT160() throws RecognitionException {
        try {
            int _type = T160;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:156:6: ( 'textSize:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:156:8: 'textSize:'
            {
            match("textSize:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T160

    // $ANTLR start T161
    public final void mT161() throws RecognitionException {
        try {
            int _type = T161;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:157:6: ( 'textStyle:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:157:8: 'textStyle:'
            {
            match("textStyle:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T161

    // $ANTLR start T162
    public final void mT162() throws RecognitionException {
        try {
            int _type = T162;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:158:6: ( 'imageView:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:158:8: 'imageView:'
            {
            match("imageView:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T162

    // $ANTLR start T163
    public final void mT163() throws RecognitionException {
        try {
            int _type = T163;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:159:6: ( 'button:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:159:8: 'button:'
            {
            match("button:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T163

    // $ANTLR start T164
    public final void mT164() throws RecognitionException {
        try {
            int _type = T164;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:160:6: ( 'to' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:160:8: 'to'
            {
            match("to"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T164

    // $ANTLR start T165
    public final void mT165() throws RecognitionException {
        try {
            int _type = T165;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:161:6: ( 'spinner:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:161:8: 'spinner:'
            {
            match("spinner:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T165

    // $ANTLR start T166
    public final void mT166() throws RecognitionException {
        try {
            int _type = T166;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:162:6: ( 'editText:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:162:8: 'editText:'
            {
            match("editText:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T166

    // $ANTLR start T167
    public final void mT167() throws RecognitionException {
        try {
            int _type = T167;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:163:6: ( 'string' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:163:8: 'string'
            {
            match("string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T167

    // $ANTLR start T168
    public final void mT168() throws RecognitionException {
        try {
            int _type = T168;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:164:6: ( '=' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:164:8: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T168

    // $ANTLR start T169
    public final void mT169() throws RecognitionException {
        try {
            int _type = T169;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:165:6: ( 'integer' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:165:8: 'integer'
            {
            match("integer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T169

    // $ANTLR start T170
    public final void mT170() throws RecognitionException {
        try {
            int _type = T170;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:166:6: ( 'bool' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:166:8: 'bool'
            {
            match("bool"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T170

    // $ANTLR start T171
    public final void mT171() throws RecognitionException {
        try {
            int _type = T171;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:167:6: ( 'color' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:167:8: 'color'
            {
            match("color"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T171

    // $ANTLR start T172
    public final void mT172() throws RecognitionException {
        try {
            int _type = T172;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:168:6: ( 'dimension' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:168:8: 'dimension'
            {
            match("dimension"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T172

    // $ANTLR start T173
    public final void mT173() throws RecognitionException {
        try {
            int _type = T173;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:169:6: ( 'array' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:169:8: 'array'
            {
            match("array"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T173

    // $ANTLR start T174
    public final void mT174() throws RecognitionException {
        try {
            int _type = T174;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:170:6: ( '(integer)' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:170:8: '(integer)'
            {
            match("(integer)"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T174

    // $ANTLR start T175
    public final void mT175() throws RecognitionException {
        try {
            int _type = T175;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:171:6: ( '[' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:171:8: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T175

    // $ANTLR start T176
    public final void mT176() throws RecognitionException {
        try {
            int _type = T176;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:172:6: ( ']' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:172:8: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T176

    // $ANTLR start T177
    public final void mT177() throws RecognitionException {
        try {
            int _type = T177;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:173:6: ( ',' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:173:8: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T177

    // $ANTLR start T178
    public final void mT178() throws RecognitionException {
        try {
            int _type = T178;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:174:6: ( '(string)' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:174:8: '(string)'
            {
            match("(string)"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T178

    // $ANTLR start T179
    public final void mT179() throws RecognitionException {
        try {
            int _type = T179;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:175:6: ( 'bitmap' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:175:8: 'bitmap'
            {
            match("bitmap"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T179

    // $ANTLR start T180
    public final void mT180() throws RecognitionException {
        try {
            int _type = T180;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:176:6: ( 'transition' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:176:8: 'transition'
            {
            match("transition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T180

    // $ANTLR start T181
    public final void mT181() throws RecognitionException {
        try {
            int _type = T181;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:177:6: ( '<->' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:177:8: '<->'
            {
            match("<->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T181

    // $ANTLR start T182
    public final void mT182() throws RecognitionException {
        try {
            int _type = T182;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:178:6: ( 'menu' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:178:8: 'menu'
            {
            match("menu"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T182

    // $ANTLR start T183
    public final void mT183() throws RecognitionException {
        try {
            int _type = T183;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:179:6: ( 'item' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:179:8: 'item'
            {
            match("item"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T183

    // $ANTLR start T184
    public final void mT184() throws RecognitionException {
        try {
            int _type = T184;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:180:6: ( 'group' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:180:8: 'group'
            {
            match("group"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T184

    // $ANTLR start T185
    public final void mT185() throws RecognitionException {
        try {
            int _type = T185;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:181:6: ( 'submenu' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:181:8: 'submenu'
            {
            match("submenu"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T185

    // $ANTLR start T186
    public final void mT186() throws RecognitionException {
        try {
            int _type = T186;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:182:6: ( 'set' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:182:8: 'set'
            {
            match("set"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T186

    // $ANTLR start T187
    public final void mT187() throws RecognitionException {
        try {
            int _type = T187;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:183:6: ( 'fade:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:183:8: 'fade:'
            {
            match("fade:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T187

    // $ANTLR start T188
    public final void mT188() throws RecognitionException {
        try {
            int _type = T188;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:184:6: ( 'from' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:184:8: 'from'
            {
            match("from"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T188

    // $ANTLR start T189
    public final void mT189() throws RecognitionException {
        try {
            int _type = T189;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:185:6: ( 'scale:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:185:8: 'scale:'
            {
            match("scale:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T189

    // $ANTLR start T190
    public final void mT190() throws RecognitionException {
        try {
            int _type = T190;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:186:6: ( 'translate:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:186:8: 'translate:'
            {
            match("translate:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T190

    // $ANTLR start T191
    public final void mT191() throws RecognitionException {
        try {
            int _type = T191;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:187:6: ( 'rotate:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:187:8: 'rotate:'
            {
            match("rotate:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T191

    // $ANTLR start T192
    public final void mT192() throws RecognitionException {
        try {
            int _type = T192;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:188:6: ( 'tweenAnimation' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:188:8: 'tweenAnimation'
            {
            match("tweenAnimation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T192

    // $ANTLR start T193
    public final void mT193() throws RecognitionException {
        try {
            int _type = T193;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:189:6: ( 'frameAnimation' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:189:8: 'frameAnimation'
            {
            match("frameAnimation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T193

    // $ANTLR start T194
    public final void mT194() throws RecognitionException {
        try {
            int _type = T194;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:190:6: ( 'frame:' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:190:8: 'frame:'
            {
            match("frame:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T194

    // $ANTLR start T195
    public final void mT195() throws RecognitionException {
        try {
            int _type = T195;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:191:6: ( '->' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:191:8: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T195

    // $ANTLR start T196
    public final void mT196() throws RecognitionException {
        try {
            int _type = T196;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:192:6: ( '@string' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:192:8: '@string'
            {
            match("@string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T196

    // $ANTLR start T197
    public final void mT197() throws RecognitionException {
        try {
            int _type = T197;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:193:6: ( '@integer' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:193:8: '@integer'
            {
            match("@integer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T197

    // $ANTLR start T198
    public final void mT198() throws RecognitionException {
        try {
            int _type = T198;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:194:6: ( '@bool' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:194:8: '@bool'
            {
            match("@bool"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T198

    // $ANTLR start T199
    public final void mT199() throws RecognitionException {
        try {
            int _type = T199;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:195:6: ( '@color' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:195:8: '@color'
            {
            match("@color"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T199

    // $ANTLR start T200
    public final void mT200() throws RecognitionException {
        try {
            int _type = T200;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:196:6: ( '@dimen' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:196:8: '@dimen'
            {
            match("@dimen"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T200

    // $ANTLR start T201
    public final void mT201() throws RecognitionException {
        try {
            int _type = T201;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:197:6: ( '@drawable' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:197:8: '@drawable'
            {
            match("@drawable"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T201

    // $ANTLR start T202
    public final void mT202() throws RecognitionException {
        try {
            int _type = T202;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:198:6: ( '@anim' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:198:8: '@anim'
            {
            match("@anim"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T202

    // $ANTLR start T203
    public final void mT203() throws RecognitionException {
        try {
            int _type = T203;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:199:6: ( '@interpolator' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:199:8: '@interpolator'
            {
            match("@interpolator"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T203

    // $ANTLR start T204
    public final void mT204() throws RecognitionException {
        try {
            int _type = T204;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:200:6: ( '.' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:200:8: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T204

    // $ANTLR start T205
    public final void mT205() throws RecognitionException {
        try {
            int _type = T205;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:201:6: ( 'shared' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:201:8: 'shared'
            {
            match("shared"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T205

    // $ANTLR start T206
    public final void mT206() throws RecognitionException {
        try {
            int _type = T206;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:202:6: ( 'oneShot' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:202:8: 'oneShot'
            {
            match("oneShot"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T206

    // $ANTLR start RULE_BOOL
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45352:11: ( ( 'TRUE' | 'FALSE' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45352:13: ( 'TRUE' | 'FALSE' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45352:13: ( 'TRUE' | 'FALSE' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='T') ) {
                alt1=1;
            }
            else if ( (LA1_0=='F') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("45352:13: ( 'TRUE' | 'FALSE' )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45352:14: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45352:21: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_BOOL

    // $ANTLR start RULE_FLOAT
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45354:12: ( RULE_INT '.' RULE_INT )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45354:14: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_FLOAT

    // $ANTLR start RULE_HEX_COLOR
    public final void mRULE_HEX_COLOR() throws RecognitionException {
        try {
            int _type = RULE_HEX_COLOR;
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45356:16: ( '#' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45356:18: '#' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )?
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

            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45356:196: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||(LA2_0>='a' && LA2_0<='f')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45356:197: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45358:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45358:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45358:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45358:11: '^'
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

            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45358:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45360:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45360:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45360:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45360:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45362:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45362:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45362:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("45362:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45362:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45362:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45362:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45362:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45362:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45362:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45362:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45362:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45364:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45364:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45364:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFE')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45364:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45366:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45366:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45366:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45366:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45366:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45366:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45366:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45366:41: '\\r'
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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45368:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45368:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45368:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45370:16: ( . )
            // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:45370:18: .
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
        // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:8: ( T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | T122 | T123 | T124 | T125 | T126 | T127 | T128 | T129 | T130 | T131 | T132 | T133 | T134 | T135 | T136 | T137 | T138 | T139 | T140 | T141 | T142 | T143 | T144 | T145 | T146 | T147 | T148 | T149 | T150 | T151 | T152 | T153 | T154 | T155 | T156 | T157 | T158 | T159 | T160 | T161 | T162 | T163 | T164 | T165 | T166 | T167 | T168 | T169 | T170 | T171 | T172 | T173 | T174 | T175 | T176 | T177 | T178 | T179 | T180 | T181 | T182 | T183 | T184 | T185 | T186 | T187 | T188 | T189 | T190 | T191 | T192 | T193 | T194 | T195 | T196 | T197 | T198 | T199 | T200 | T201 | T202 | T203 | T204 | T205 | T206 | RULE_BOOL | RULE_FLOAT | RULE_HEX_COLOR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=203;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:10: T14
                {
                mT14(); 

                }
                break;
            case 2 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:14: T15
                {
                mT15(); 

                }
                break;
            case 3 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:18: T16
                {
                mT16(); 

                }
                break;
            case 4 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:22: T17
                {
                mT17(); 

                }
                break;
            case 5 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:26: T18
                {
                mT18(); 

                }
                break;
            case 6 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:30: T19
                {
                mT19(); 

                }
                break;
            case 7 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:34: T20
                {
                mT20(); 

                }
                break;
            case 8 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:38: T21
                {
                mT21(); 

                }
                break;
            case 9 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:42: T22
                {
                mT22(); 

                }
                break;
            case 10 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:46: T23
                {
                mT23(); 

                }
                break;
            case 11 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:50: T24
                {
                mT24(); 

                }
                break;
            case 12 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:54: T25
                {
                mT25(); 

                }
                break;
            case 13 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:58: T26
                {
                mT26(); 

                }
                break;
            case 14 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:62: T27
                {
                mT27(); 

                }
                break;
            case 15 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:66: T28
                {
                mT28(); 

                }
                break;
            case 16 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:70: T29
                {
                mT29(); 

                }
                break;
            case 17 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:74: T30
                {
                mT30(); 

                }
                break;
            case 18 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:78: T31
                {
                mT31(); 

                }
                break;
            case 19 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:82: T32
                {
                mT32(); 

                }
                break;
            case 20 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:86: T33
                {
                mT33(); 

                }
                break;
            case 21 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:90: T34
                {
                mT34(); 

                }
                break;
            case 22 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:94: T35
                {
                mT35(); 

                }
                break;
            case 23 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:98: T36
                {
                mT36(); 

                }
                break;
            case 24 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:102: T37
                {
                mT37(); 

                }
                break;
            case 25 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:106: T38
                {
                mT38(); 

                }
                break;
            case 26 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:110: T39
                {
                mT39(); 

                }
                break;
            case 27 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:114: T40
                {
                mT40(); 

                }
                break;
            case 28 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:118: T41
                {
                mT41(); 

                }
                break;
            case 29 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:122: T42
                {
                mT42(); 

                }
                break;
            case 30 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:126: T43
                {
                mT43(); 

                }
                break;
            case 31 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:130: T44
                {
                mT44(); 

                }
                break;
            case 32 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:134: T45
                {
                mT45(); 

                }
                break;
            case 33 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:138: T46
                {
                mT46(); 

                }
                break;
            case 34 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:142: T47
                {
                mT47(); 

                }
                break;
            case 35 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:146: T48
                {
                mT48(); 

                }
                break;
            case 36 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:150: T49
                {
                mT49(); 

                }
                break;
            case 37 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:154: T50
                {
                mT50(); 

                }
                break;
            case 38 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:158: T51
                {
                mT51(); 

                }
                break;
            case 39 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:162: T52
                {
                mT52(); 

                }
                break;
            case 40 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:166: T53
                {
                mT53(); 

                }
                break;
            case 41 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:170: T54
                {
                mT54(); 

                }
                break;
            case 42 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:174: T55
                {
                mT55(); 

                }
                break;
            case 43 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:178: T56
                {
                mT56(); 

                }
                break;
            case 44 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:182: T57
                {
                mT57(); 

                }
                break;
            case 45 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:186: T58
                {
                mT58(); 

                }
                break;
            case 46 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:190: T59
                {
                mT59(); 

                }
                break;
            case 47 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:194: T60
                {
                mT60(); 

                }
                break;
            case 48 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:198: T61
                {
                mT61(); 

                }
                break;
            case 49 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:202: T62
                {
                mT62(); 

                }
                break;
            case 50 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:206: T63
                {
                mT63(); 

                }
                break;
            case 51 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:210: T64
                {
                mT64(); 

                }
                break;
            case 52 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:214: T65
                {
                mT65(); 

                }
                break;
            case 53 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:218: T66
                {
                mT66(); 

                }
                break;
            case 54 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:222: T67
                {
                mT67(); 

                }
                break;
            case 55 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:226: T68
                {
                mT68(); 

                }
                break;
            case 56 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:230: T69
                {
                mT69(); 

                }
                break;
            case 57 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:234: T70
                {
                mT70(); 

                }
                break;
            case 58 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:238: T71
                {
                mT71(); 

                }
                break;
            case 59 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:242: T72
                {
                mT72(); 

                }
                break;
            case 60 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:246: T73
                {
                mT73(); 

                }
                break;
            case 61 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:250: T74
                {
                mT74(); 

                }
                break;
            case 62 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:254: T75
                {
                mT75(); 

                }
                break;
            case 63 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:258: T76
                {
                mT76(); 

                }
                break;
            case 64 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:262: T77
                {
                mT77(); 

                }
                break;
            case 65 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:266: T78
                {
                mT78(); 

                }
                break;
            case 66 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:270: T79
                {
                mT79(); 

                }
                break;
            case 67 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:274: T80
                {
                mT80(); 

                }
                break;
            case 68 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:278: T81
                {
                mT81(); 

                }
                break;
            case 69 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:282: T82
                {
                mT82(); 

                }
                break;
            case 70 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:286: T83
                {
                mT83(); 

                }
                break;
            case 71 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:290: T84
                {
                mT84(); 

                }
                break;
            case 72 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:294: T85
                {
                mT85(); 

                }
                break;
            case 73 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:298: T86
                {
                mT86(); 

                }
                break;
            case 74 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:302: T87
                {
                mT87(); 

                }
                break;
            case 75 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:306: T88
                {
                mT88(); 

                }
                break;
            case 76 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:310: T89
                {
                mT89(); 

                }
                break;
            case 77 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:314: T90
                {
                mT90(); 

                }
                break;
            case 78 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:318: T91
                {
                mT91(); 

                }
                break;
            case 79 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:322: T92
                {
                mT92(); 

                }
                break;
            case 80 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:326: T93
                {
                mT93(); 

                }
                break;
            case 81 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:330: T94
                {
                mT94(); 

                }
                break;
            case 82 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:334: T95
                {
                mT95(); 

                }
                break;
            case 83 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:338: T96
                {
                mT96(); 

                }
                break;
            case 84 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:342: T97
                {
                mT97(); 

                }
                break;
            case 85 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:346: T98
                {
                mT98(); 

                }
                break;
            case 86 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:350: T99
                {
                mT99(); 

                }
                break;
            case 87 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:354: T100
                {
                mT100(); 

                }
                break;
            case 88 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:359: T101
                {
                mT101(); 

                }
                break;
            case 89 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:364: T102
                {
                mT102(); 

                }
                break;
            case 90 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:369: T103
                {
                mT103(); 

                }
                break;
            case 91 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:374: T104
                {
                mT104(); 

                }
                break;
            case 92 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:379: T105
                {
                mT105(); 

                }
                break;
            case 93 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:384: T106
                {
                mT106(); 

                }
                break;
            case 94 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:389: T107
                {
                mT107(); 

                }
                break;
            case 95 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:394: T108
                {
                mT108(); 

                }
                break;
            case 96 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:399: T109
                {
                mT109(); 

                }
                break;
            case 97 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:404: T110
                {
                mT110(); 

                }
                break;
            case 98 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:409: T111
                {
                mT111(); 

                }
                break;
            case 99 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:414: T112
                {
                mT112(); 

                }
                break;
            case 100 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:419: T113
                {
                mT113(); 

                }
                break;
            case 101 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:424: T114
                {
                mT114(); 

                }
                break;
            case 102 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:429: T115
                {
                mT115(); 

                }
                break;
            case 103 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:434: T116
                {
                mT116(); 

                }
                break;
            case 104 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:439: T117
                {
                mT117(); 

                }
                break;
            case 105 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:444: T118
                {
                mT118(); 

                }
                break;
            case 106 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:449: T119
                {
                mT119(); 

                }
                break;
            case 107 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:454: T120
                {
                mT120(); 

                }
                break;
            case 108 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:459: T121
                {
                mT121(); 

                }
                break;
            case 109 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:464: T122
                {
                mT122(); 

                }
                break;
            case 110 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:469: T123
                {
                mT123(); 

                }
                break;
            case 111 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:474: T124
                {
                mT124(); 

                }
                break;
            case 112 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:479: T125
                {
                mT125(); 

                }
                break;
            case 113 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:484: T126
                {
                mT126(); 

                }
                break;
            case 114 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:489: T127
                {
                mT127(); 

                }
                break;
            case 115 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:494: T128
                {
                mT128(); 

                }
                break;
            case 116 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:499: T129
                {
                mT129(); 

                }
                break;
            case 117 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:504: T130
                {
                mT130(); 

                }
                break;
            case 118 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:509: T131
                {
                mT131(); 

                }
                break;
            case 119 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:514: T132
                {
                mT132(); 

                }
                break;
            case 120 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:519: T133
                {
                mT133(); 

                }
                break;
            case 121 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:524: T134
                {
                mT134(); 

                }
                break;
            case 122 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:529: T135
                {
                mT135(); 

                }
                break;
            case 123 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:534: T136
                {
                mT136(); 

                }
                break;
            case 124 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:539: T137
                {
                mT137(); 

                }
                break;
            case 125 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:544: T138
                {
                mT138(); 

                }
                break;
            case 126 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:549: T139
                {
                mT139(); 

                }
                break;
            case 127 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:554: T140
                {
                mT140(); 

                }
                break;
            case 128 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:559: T141
                {
                mT141(); 

                }
                break;
            case 129 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:564: T142
                {
                mT142(); 

                }
                break;
            case 130 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:569: T143
                {
                mT143(); 

                }
                break;
            case 131 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:574: T144
                {
                mT144(); 

                }
                break;
            case 132 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:579: T145
                {
                mT145(); 

                }
                break;
            case 133 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:584: T146
                {
                mT146(); 

                }
                break;
            case 134 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:589: T147
                {
                mT147(); 

                }
                break;
            case 135 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:594: T148
                {
                mT148(); 

                }
                break;
            case 136 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:599: T149
                {
                mT149(); 

                }
                break;
            case 137 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:604: T150
                {
                mT150(); 

                }
                break;
            case 138 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:609: T151
                {
                mT151(); 

                }
                break;
            case 139 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:614: T152
                {
                mT152(); 

                }
                break;
            case 140 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:619: T153
                {
                mT153(); 

                }
                break;
            case 141 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:624: T154
                {
                mT154(); 

                }
                break;
            case 142 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:629: T155
                {
                mT155(); 

                }
                break;
            case 143 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:634: T156
                {
                mT156(); 

                }
                break;
            case 144 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:639: T157
                {
                mT157(); 

                }
                break;
            case 145 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:644: T158
                {
                mT158(); 

                }
                break;
            case 146 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:649: T159
                {
                mT159(); 

                }
                break;
            case 147 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:654: T160
                {
                mT160(); 

                }
                break;
            case 148 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:659: T161
                {
                mT161(); 

                }
                break;
            case 149 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:664: T162
                {
                mT162(); 

                }
                break;
            case 150 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:669: T163
                {
                mT163(); 

                }
                break;
            case 151 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:674: T164
                {
                mT164(); 

                }
                break;
            case 152 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:679: T165
                {
                mT165(); 

                }
                break;
            case 153 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:684: T166
                {
                mT166(); 

                }
                break;
            case 154 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:689: T167
                {
                mT167(); 

                }
                break;
            case 155 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:694: T168
                {
                mT168(); 

                }
                break;
            case 156 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:699: T169
                {
                mT169(); 

                }
                break;
            case 157 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:704: T170
                {
                mT170(); 

                }
                break;
            case 158 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:709: T171
                {
                mT171(); 

                }
                break;
            case 159 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:714: T172
                {
                mT172(); 

                }
                break;
            case 160 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:719: T173
                {
                mT173(); 

                }
                break;
            case 161 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:724: T174
                {
                mT174(); 

                }
                break;
            case 162 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:729: T175
                {
                mT175(); 

                }
                break;
            case 163 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:734: T176
                {
                mT176(); 

                }
                break;
            case 164 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:739: T177
                {
                mT177(); 

                }
                break;
            case 165 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:744: T178
                {
                mT178(); 

                }
                break;
            case 166 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:749: T179
                {
                mT179(); 

                }
                break;
            case 167 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:754: T180
                {
                mT180(); 

                }
                break;
            case 168 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:759: T181
                {
                mT181(); 

                }
                break;
            case 169 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:764: T182
                {
                mT182(); 

                }
                break;
            case 170 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:769: T183
                {
                mT183(); 

                }
                break;
            case 171 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:774: T184
                {
                mT184(); 

                }
                break;
            case 172 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:779: T185
                {
                mT185(); 

                }
                break;
            case 173 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:784: T186
                {
                mT186(); 

                }
                break;
            case 174 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:789: T187
                {
                mT187(); 

                }
                break;
            case 175 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:794: T188
                {
                mT188(); 

                }
                break;
            case 176 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:799: T189
                {
                mT189(); 

                }
                break;
            case 177 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:804: T190
                {
                mT190(); 

                }
                break;
            case 178 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:809: T191
                {
                mT191(); 

                }
                break;
            case 179 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:814: T192
                {
                mT192(); 

                }
                break;
            case 180 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:819: T193
                {
                mT193(); 

                }
                break;
            case 181 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:824: T194
                {
                mT194(); 

                }
                break;
            case 182 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:829: T195
                {
                mT195(); 

                }
                break;
            case 183 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:834: T196
                {
                mT196(); 

                }
                break;
            case 184 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:839: T197
                {
                mT197(); 

                }
                break;
            case 185 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:844: T198
                {
                mT198(); 

                }
                break;
            case 186 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:849: T199
                {
                mT199(); 

                }
                break;
            case 187 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:854: T200
                {
                mT200(); 

                }
                break;
            case 188 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:859: T201
                {
                mT201(); 

                }
                break;
            case 189 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:864: T202
                {
                mT202(); 

                }
                break;
            case 190 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:869: T203
                {
                mT203(); 

                }
                break;
            case 191 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:874: T204
                {
                mT204(); 

                }
                break;
            case 192 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:879: T205
                {
                mT205(); 

                }
                break;
            case 193 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:884: T206
                {
                mT206(); 

                }
                break;
            case 194 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:889: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 195 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:899: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 196 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:910: RULE_HEX_COLOR
                {
                mRULE_HEX_COLOR(); 

                }
                break;
            case 197 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:925: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 198 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:933: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 199 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:942: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 200 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:954: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 201 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:970: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 202 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:986: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 203 :
                // ../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g:1:994: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\23\61\1\176\3\uffff\1\u0083\1\uffff\1\u0086\1\uffff\1\54"+
        "\3\uffff\2\54\1\uffff\2\61\1\u0097\1\54\1\uffff\3\54\2\uffff\2\61"+
        "\1\u00a2\1\61\1\uffff\1\u00a5\11\61\1\u00b5\1\u00b6\2\61\1\u00bc"+
        "\4\61\1\u00c3\42\61\1\u00f5\24\61\30\uffff\2\61\1\uffff\1\u0097"+
        "\5\uffff\4\61\1\uffff\2\61\1\uffff\7\61\1\u0121\7\61\2\uffff\2\61"+
        "\1\u012b\2\61\1\uffff\6\61\1\uffff\5\61\1\u013c\44\61\1\u0162\5"+
        "\61\1\u0169\1\uffff\1\u016e\27\61\3\uffff\12\61\1\u0192\4\61\2\uffff"+
        "\4\61\1\u019b\4\61\2\uffff\1\61\1\u01a1\2\61\1\uffff\6\61\1\u01ab"+
        "\3\61\1\uffff\13\61\1\u01bb\1\u01bc\13\61\1\u01c9\10\61\1\u01d2"+
        "\1\61\1\u01d6\1\61\1\uffff\5\61\3\uffff\3\61\1\uffff\20\61\1\u01f2"+
        "\1\u01f3\2\61\1\u01f6\3\61\1\uffff\1\u01fc\5\61\1\uffff\3\61\1\uffff"+
        "\4\61\1\u0209\3\61\1\uffff\2\61\1\u0210\2\61\1\uffff\10\61\2\uffff"+
        "\1\61\1\uffff\3\61\1\u0223\11\61\2\uffff\5\61\1\u0232\2\61\1\u0236"+
        "\2\61\2\uffff\7\61\1\u0242\2\uffff\2\61\1\uffff\3\61\1\u024a\14"+
        "\61\1\u0259\3\61\1\uffff\4\61\1\u0262\1\61\2\uffff\2\61\1\uffff"+
        "\3\61\1\u0269\2\uffff\1\u01fc\5\61\1\u0271\1\61\1\u0273\1\u0274"+
        "\1\61\2\uffff\6\61\1\uffff\7\61\1\u0286\2\61\1\u0289\5\61\3\uffff"+
        "\7\61\1\uffff\1\61\1\u0298\1\u0299\1\u029a\1\61\1\u02a0\1\uffff"+
        "\3\61\1\uffff\2\61\1\u02a6\1\61\1\u02a9\5\61\2\uffff\4\61\1\uffff"+
        "\2\61\1\uffff\16\61\1\uffff\10\61\1\uffff\2\61\1\u02cd\3\61\3\uffff"+
        "\2\61\1\uffff\2\61\1\uffff\1\61\2\uffff\3\61\1\u02d9\15\61\1\uffff"+
        "\1\u02eb\1\61\1\uffff\15\61\4\uffff\5\61\1\uffff\5\61\1\uffff\1"+
        "\61\2\uffff\1\u0306\10\61\1\uffff\6\61\1\uffff\10\61\1\uffff\1\61"+
        "\1\uffff\3\61\1\u0321\3\61\1\uffff\4\61\1\uffff\1\61\1\uffff\4\61"+
        "\1\uffff\1\61\1\uffff\17\61\1\uffff\32\61\2\uffff\25\61\1\u036f"+
        "\1\61\1\uffff\1\u0371\1\uffff\1\61\2\uffff\3\61\1\u0376\3\61\1\u037a"+
        "\1\61\1\uffff\12\61\1\u0386\1\61\1\uffff\1\61\1\u0389\1\61\1\uffff"+
        "\7\61\1\uffff\1\61\2\uffff\15\61\1\u03a0\10\61\1\uffff\2\61\1\uffff"+
        "\1\u03ab\2\61\1\uffff\1\61\2\uffff\3\61\1\uffff\1\61\1\uffff\2\61"+
        "\3\uffff\1\u03b8\2\61\1\uffff\7\61\1\uffff\3\61\4\uffff\3\61\1\uffff"+
        "\2\61\1\u03cb\1\uffff\1\u03cd\7\61\1\uffff\3\61\1\u03d8\1\61\1\uffff"+
        "\7\61\1\uffff\2\61\1\uffff\1\61\3\uffff\1\u03e4\1\61\1\u03e6\5\61"+
        "\3\uffff\1\61\1\uffff\4\61\1\uffff\11\61\1\uffff\1\61\1\uffff\1"+
        "\u03fe\1\uffff\7\61\2\uffff\5\61\1\u040b\4\61\1\u0410\1\uffff\1"+
        "\61\2\uffff\5\61\1\uffff\2\61\1\uffff\1\61\1\uffff\1\u041a\2\61"+
        "\1\uffff\7\61\1\uffff\7\61\1\u042b\1\uffff\3\61\1\uffff\1\61\1\u0430"+
        "\2\61\1\uffff\4\61\2\uffff\1\61\3\uffff\17\61\1\u0447\1\uffff\3"+
        "\61\1\u044b\1\uffff\1\61\1\uffff\4\61\1\uffff\1\61\1\uffff\15\61"+
        "\1\uffff\1\u045f\2\61\2\uffff\1\u0462\1\61\2\uffff\4\61\1\uffff"+
        "\3\61\1\uffff\1\u046b\2\61\1\uffff\1\u046e\2\uffff\1\u046f\2\uffff"+
        "\3\61\1\uffff\3\61\1\uffff\2\61\2\uffff\1\61\1\uffff\4\61\1\u047d"+
        "\3\uffff\3\61\1\uffff\4\61\1\u0485\2\61\1\uffff\1\u0488\1\61\1\uffff"+
        "\2\61\1\uffff";
    static final String DFA14_eofS =
        "\u048c\uffff";
    static final String DFA14_minS =
        "\1\0\4\141\1\143\1\142\3\141\1\156\1\141\1\145\1\141\3\145\1\157"+
        "\1\145\1\144\1\76\3\uffff\1\60\1\uffff\1\55\1\uffff\1\151\3\uffff"+
        "\1\76\1\141\1\uffff\1\122\1\101\1\56\1\101\1\uffff\2\0\1\52\2\uffff"+
        "\1\147\1\143\1\60\1\164\1\uffff\1\60\1\162\1\156\2\141\1\153\1\154"+
        "\1\142\1\156\1\144\2\60\1\157\1\160\1\60\3\156\1\141\1\60\1\123"+
        "\1\141\1\157\1\151\1\157\1\162\1\151\1\143\1\164\1\160\1\154\1\164"+
        "\1\154\1\164\1\143\1\156\1\154\1\151\1\143\1\160\1\141\1\146\1\156"+
        "\1\171\1\103\1\145\1\151\1\141\1\144\1\154\1\144\1\142\1\141\1\162"+
        "\1\60\1\142\1\170\1\160\1\141\1\145\1\147\1\164\1\154\1\151\1\156"+
        "\2\162\1\163\1\141\1\124\1\155\1\156\1\170\1\151\1\141\22\uffff"+
        "\1\156\1\uffff\1\151\3\uffff\1\125\1\114\1\uffff\1\56\5\uffff\1"+
        "\145\2\151\1\145\1\uffff\1\141\1\156\1\uffff\1\151\1\147\1\167\1"+
        "\162\1\145\1\154\1\72\1\60\1\151\1\164\1\145\1\155\2\163\1\144\2"+
        "\uffff\1\156\1\147\1\60\1\72\1\143\1\uffff\1\165\1\157\1\72\1\147"+
        "\1\151\1\145\1\uffff\1\143\1\155\1\154\1\156\1\147\1\60\1\150\1"+
        "\166\1\141\1\151\1\155\1\151\1\145\1\157\1\154\1\157\1\164\1\154"+
        "\1\144\1\164\1\156\1\155\1\153\1\164\1\157\1\143\1\154\1\151\1\162"+
        "\1\164\1\145\1\164\1\157\1\123\1\154\1\162\1\145\2\155\1\145\1\154"+
        "\1\164\1\60\1\147\1\160\1\144\1\151\1\145\1\60\1\uffff\1\60\1\147"+
        "\1\164\1\145\1\156\1\145\1\150\2\141\1\147\1\164\1\151\1\163\1\151"+
        "\1\165\1\166\1\145\1\157\1\145\1\155\1\145\2\164\1\151\1\164\2\uffff"+
        "\1\105\1\123\1\156\1\144\1\164\1\154\1\72\2\156\1\154\1\60\2\145"+
        "\1\154\1\145\2\uffff\1\146\1\145\1\143\1\145\1\60\1\167\1\151\1"+
        "\145\1\151\2\uffff\1\150\1\60\1\163\1\145\1\uffff\1\151\1\145\1"+
        "\163\1\153\1\147\1\162\1\60\1\151\1\72\1\156\1\uffff\1\141\1\145"+
        "\1\171\1\143\1\141\1\166\1\154\1\114\1\151\1\167\1\157\2\60\1\157"+
        "\1\143\1\141\1\147\1\145\1\162\1\153\1\137\1\145\1\164\1\141\1\60"+
        "\1\141\1\101\1\165\1\150\1\151\1\163\1\156\1\145\1\60\1\72\1\60"+
        "\1\150\1\uffff\1\150\1\137\1\163\1\147\1\146\3\uffff\1\164\1\151"+
        "\1\143\1\uffff\1\145\1\103\1\146\1\163\1\156\3\164\1\150\1\72\1"+
        "\172\2\151\1\142\1\160\1\151\2\60\1\162\1\141\1\60\1\106\1\124\1"+
        "\154\1\145\1\60\1\105\1\163\1\145\1\163\1\145\1\uffff\1\145\1\147"+
        "\1\145\1\uffff\1\144\1\156\1\154\1\72\1\60\1\156\1\164\1\156\1\uffff"+
        "\1\157\1\156\1\60\1\156\1\137\1\uffff\1\160\1\151\1\144\1\126\1"+
        "\151\2\145\1\157\2\uffff\1\143\1\uffff\1\102\2\72\1\60\1\151\1\164"+
        "\1\151\1\145\1\151\1\145\1\143\1\72\1\156\2\uffff\1\155\1\145\1"+
        "\160\2\162\1\60\1\141\1\150\1\60\1\141\1\143\2\uffff\1\162\1\143"+
        "\1\164\1\157\1\143\1\150\1\164\1\60\2\uffff\1\143\1\150\1\uffff"+
        "\1\72\1\164\1\143\1\60\1\150\1\164\1\162\1\144\2\164\1\151\1\157"+
        "\1\151\1\141\1\151\1\101\1\60\1\145\1\151\1\164\1\uffff\2\157\1"+
        "\143\1\151\1\60\1\164\2\uffff\1\151\1\154\1\uffff\1\157\1\145\1"+
        "\142\1\60\1\147\1\uffff\1\60\1\151\1\162\1\72\2\162\1\60\1\114\2"+
        "\60\1\142\2\uffff\1\143\1\145\1\165\1\162\1\147\1\165\1\uffff\1"+
        "\102\1\160\1\141\1\147\1\164\1\151\1\142\1\60\1\162\1\154\1\60\1"+
        "\157\1\141\1\145\1\141\1\151\3\uffff\1\160\1\151\1\164\1\162\1\156"+
        "\1\170\1\141\1\uffff\1\72\3\60\1\157\1\60\1\uffff\1\142\1\157\1"+
        "\145\1\uffff\1\154\1\164\1\60\1\164\1\60\1\164\1\153\1\157\1\141"+
        "\1\156\2\uffff\1\162\1\157\1\141\1\145\1\uffff\1\72\1\157\1\uffff"+
        "\1\164\1\117\1\151\1\147\1\151\1\72\1\171\1\172\1\154\1\145\1\143"+
        "\1\141\1\164\1\156\1\uffff\1\72\1\166\1\72\2\156\1\141\1\145\1\154"+
        "\1\uffff\1\171\1\143\1\60\1\143\1\170\1\154\3\uffff\1\157\1\72\1"+
        "\uffff\1\141\1\72\1\uffff\1\151\2\uffff\1\141\1\145\1\144\1\60\1"+
        "\144\1\72\1\155\1\145\2\157\1\151\1\141\1\143\2\150\1\145\1\154"+
        "\1\uffff\1\60\1\154\1\uffff\1\160\1\163\1\164\1\146\1\162\1\164"+
        "\1\141\1\157\1\171\1\141\1\153\2\164\4\uffff\1\165\1\145\1\150\1"+
        "\157\1\156\1\uffff\1\154\2\162\1\151\1\145\1\uffff\1\151\2\uffff"+
        "\1\60\1\72\1\157\1\164\1\151\1\157\3\162\1\uffff\1\156\1\117\1\146"+
        "\1\160\1\145\1\166\1\uffff\1\154\1\145\1\157\1\167\1\145\1\164\2"+
        "\151\1\uffff\1\145\1\uffff\1\164\1\72\1\154\1\60\1\151\2\72\1\uffff"+
        "\1\165\1\164\1\145\1\156\1\uffff\1\164\1\uffff\1\156\1\162\1\163"+
        "\1\111\1\uffff\1\72\1\uffff\1\157\1\145\1\157\1\151\1\142\1\146"+
        "\1\160\1\164\1\147\1\162\1\145\1\164\1\72\1\167\1\145\1\uffff\1"+
        "\103\1\72\1\145\2\164\1\145\1\150\1\164\1\156\1\72\1\164\2\72\1"+
        "\151\1\156\1\162\1\145\1\157\1\162\1\120\1\145\1\151\1\164\1\172"+
        "\1\162\1\166\2\uffff\1\164\1\151\1\155\1\154\1\151\1\145\2\164\1"+
        "\146\2\72\1\164\1\151\1\145\1\72\1\162\2\72\1\145\1\157\1\155\1"+
        "\60\1\141\1\uffff\1\60\1\uffff\1\164\2\uffff\1\163\2\72\1\60\2\145"+
        "\1\163\1\60\1\143\1\uffff\1\160\1\146\1\164\1\147\1\145\1\164\1"+
        "\72\1\164\1\150\1\145\1\60\1\72\1\uffff\1\72\1\60\1\157\1\uffff"+
        "\1\154\1\157\1\72\1\156\1\120\1\145\1\72\1\uffff\1\145\2\uffff\1"+
        "\157\1\144\1\164\2\162\1\151\1\141\1\72\1\172\1\151\1\145\1\163"+
        "\1\151\1\60\1\157\1\141\1\154\1\172\1\156\1\151\1\145\1\72\1\uffff"+
        "\1\151\1\145\1\uffff\1\60\1\164\1\72\1\uffff\1\72\2\uffff\1\72\1"+
        "\156\1\141\1\uffff\1\154\1\uffff\1\171\1\104\3\uffff\1\60\2\72\1"+
        "\uffff\1\157\1\72\2\164\1\150\1\162\1\72\1\uffff\1\157\1\164\1\156"+
        "\4\uffff\1\156\1\151\1\155\1\uffff\1\164\1\141\1\60\1\uffff\1\60"+
        "\1\156\1\72\1\151\1\164\1\151\1\172\1\162\1\uffff\1\157\1\143\1"+
        "\72\1\60\1\164\1\uffff\1\156\1\164\1\102\1\157\1\164\1\143\1\156"+
        "\1\uffff\1\147\1\146\1\uffff\1\171\3\uffff\1\60\1\164\1\60\1\72"+
        "\1\151\1\145\1\157\1\160\3\uffff\1\156\1\uffff\1\72\1\157\1\164"+
        "\1\72\1\uffff\1\155\1\72\2\164\1\156\1\72\1\102\1\162\1\157\1\uffff"+
        "\1\144\1\uffff\1\60\1\uffff\1\143\1\151\1\172\1\157\1\145\1\156"+
        "\1\141\2\uffff\1\171\1\72\1\151\1\141\1\156\1\60\1\141\1\164\1\150"+
        "\1\164\1\60\1\uffff\1\151\2\uffff\1\147\1\146\1\167\2\72\1\uffff"+
        "\1\155\1\72\1\uffff\1\72\1\uffff\1\60\1\141\1\145\1\uffff\1\151"+
        "\1\157\1\145\1\157\1\145\1\166\1\145\1\uffff\1\141\1\143\1\157\2"+
        "\156\1\164\1\154\1\60\1\uffff\1\157\1\162\1\164\1\uffff\1\154\1"+
        "\60\1\164\1\72\1\uffff\1\157\1\150\1\164\1\156\2\uffff\1\72\3\uffff"+
        "\1\151\1\72\1\147\1\164\1\146\1\160\1\156\1\145\1\143\1\154\1\141"+
        "\1\156\2\164\1\141\1\60\1\uffff\1\156\1\163\1\141\1\60\1\uffff\1"+
        "\72\1\uffff\1\156\1\164\2\72\1\uffff\1\156\1\uffff\1\150\2\164\1"+
        "\72\1\164\1\162\1\145\1\72\1\154\1\164\1\141\1\72\1\154\1\uffff"+
        "\1\60\1\72\1\154\2\uffff\1\60\1\72\2\uffff\1\145\1\164\1\157\1\72"+
        "\1\uffff\1\111\1\163\1\154\1\uffff\1\60\1\141\1\154\1\uffff\1\60"+
        "\2\uffff\1\60\2\uffff\1\162\1\72\1\155\1\uffff\1\146\1\150\1\145"+
        "\1\uffff\1\154\1\72\2\uffff\1\72\1\uffff\1\72\1\115\1\157\1\162"+
        "\1\60\3\uffff\1\151\1\157\1\141\1\uffff\1\163\2\164\1\163\1\60\1"+
        "\145\1\151\1\uffff\1\60\1\156\1\uffff\1\147\1\72\1\uffff";
    static final String DFA14_maxS =
        "\1\ufffe\1\160\1\165\1\170\1\157\1\164\2\165\1\171\1\151\1\166\2"+
        "\162\1\171\2\157\1\151\1\162\1\165\1\155\1\76\3\uffff\1\146\1\uffff"+
        "\1\55\1\uffff\1\163\3\uffff\1\76\1\163\1\uffff\1\122\1\101\1\71"+
        "\1\172\1\uffff\2\ufffe\1\57\2\uffff\1\166\1\143\1\172\1\164\1\uffff"+
        "\1\172\1\162\1\156\1\157\1\162\1\153\1\164\1\142\1\156\1\163\2\172"+
        "\1\157\1\170\1\172\3\156\1\141\1\172\1\123\1\145\1\157\1\160\1\157"+
        "\1\162\3\164\1\160\1\154\1\164\1\165\1\164\1\143\1\156\1\154\1\151"+
        "\1\143\1\160\1\141\1\146\1\163\1\171\2\145\1\151\1\157\1\144\1\154"+
        "\1\144\1\151\1\141\1\162\1\172\1\162\1\170\1\160\1\141\1\145\1\147"+
        "\1\164\1\154\1\151\1\156\2\162\1\163\1\157\1\156\1\155\1\162\1\170"+
        "\1\151\1\141\22\uffff\1\156\1\uffff\1\162\3\uffff\1\125\1\114\1"+
        "\uffff\1\71\5\uffff\1\145\2\151\1\145\1\uffff\1\141\1\156\1\uffff"+
        "\1\151\1\147\1\167\1\162\1\157\1\154\1\72\1\172\1\151\1\164\1\145"+
        "\1\155\2\163\1\144\2\uffff\1\156\1\147\1\172\1\72\1\143\1\uffff"+
        "\1\165\1\157\1\127\1\147\1\157\1\145\1\uffff\1\143\1\155\1\154\1"+
        "\156\1\147\1\172\1\150\1\166\1\141\1\151\1\155\1\151\1\145\1\157"+
        "\1\154\1\157\1\164\1\154\1\144\1\164\1\156\1\155\1\153\1\164\1\157"+
        "\1\160\1\154\1\151\1\162\1\164\1\145\1\164\1\157\1\123\1\154\1\162"+
        "\1\145\2\155\1\145\1\154\1\164\1\172\1\147\1\160\1\144\1\151\1\145"+
        "\1\172\1\uffff\1\172\1\147\1\164\1\145\1\156\1\145\1\150\2\141\1"+
        "\147\1\164\1\151\1\164\1\151\1\165\1\166\1\145\1\157\1\145\1\155"+
        "\1\145\2\164\1\151\1\164\2\uffff\1\105\1\123\1\156\1\144\1\164\1"+
        "\154\1\72\2\156\1\154\1\172\2\145\1\154\1\145\2\uffff\1\146\1\145"+
        "\1\143\1\145\1\172\1\167\1\151\1\145\1\151\2\uffff\1\150\1\172\1"+
        "\163\1\145\1\uffff\1\151\1\145\1\163\1\153\1\147\1\162\1\172\1\151"+
        "\1\72\1\156\1\uffff\1\141\1\145\1\171\1\143\1\141\1\166\1\154\1"+
        "\124\1\151\1\167\1\157\2\172\1\157\1\143\1\141\1\147\1\145\1\162"+
        "\1\153\1\137\1\145\1\164\1\141\1\172\1\141\1\101\1\165\1\150\1\151"+
        "\1\163\1\156\1\145\1\172\1\123\1\172\1\150\1\uffff\1\150\1\137\1"+
        "\163\1\147\1\146\3\uffff\1\164\1\151\1\143\1\uffff\1\145\1\126\1"+
        "\146\1\163\1\156\3\164\1\150\1\72\1\172\2\151\1\142\1\160\1\151"+
        "\2\172\1\162\1\141\1\172\1\106\1\141\1\154\1\145\1\172\1\105\1\163"+
        "\1\145\1\163\1\145\1\uffff\1\145\1\147\1\145\1\uffff\1\144\1\156"+
        "\1\154\1\72\1\172\1\156\1\164\1\156\1\uffff\1\157\1\156\1\172\1"+
        "\156\1\137\1\uffff\1\160\1\151\1\144\1\126\1\151\2\145\1\157\2\uffff"+
        "\1\143\1\uffff\1\127\2\72\1\172\1\151\1\164\1\151\1\145\1\151\1"+
        "\145\1\143\1\72\1\156\2\uffff\1\155\1\145\1\160\2\162\1\172\1\141"+
        "\1\166\1\172\1\141\1\143\2\uffff\1\162\1\143\1\164\1\157\1\143\1"+
        "\150\1\164\1\172\2\uffff\1\143\1\166\1\uffff\1\72\1\164\1\143\1"+
        "\172\1\150\1\164\1\162\1\144\3\164\1\157\1\151\1\141\1\154\1\101"+
        "\1\172\1\145\1\151\1\164\1\uffff\2\157\1\143\1\154\1\172\1\164\2"+
        "\uffff\1\151\1\154\1\uffff\1\157\1\145\1\142\1\172\1\162\1\uffff"+
        "\1\172\1\151\1\162\1\72\2\162\1\172\1\114\2\172\1\142\2\uffff\1"+
        "\143\1\145\1\165\1\162\1\147\1\165\1\uffff\1\124\1\160\1\141\1\147"+
        "\1\164\1\151\1\142\1\172\1\162\1\154\1\172\2\157\1\145\1\141\1\151"+
        "\3\uffff\1\160\1\151\1\164\1\162\1\156\1\170\1\141\1\uffff\1\72"+
        "\3\172\1\157\1\172\1\uffff\1\142\1\157\1\145\1\uffff\1\154\1\164"+
        "\1\172\1\164\1\172\1\164\1\153\1\157\1\141\1\156\2\uffff\1\162\1"+
        "\157\1\141\1\145\1\uffff\1\72\1\157\1\uffff\1\164\1\117\1\151\1"+
        "\147\1\151\1\72\1\171\1\172\1\154\1\145\1\143\1\141\1\164\1\156"+
        "\1\uffff\1\72\1\166\1\72\2\156\1\141\1\145\1\154\1\uffff\1\171\1"+
        "\143\1\172\1\143\1\170\1\154\3\uffff\1\157\1\72\1\uffff\1\141\1"+
        "\72\1\uffff\1\151\2\uffff\1\141\1\145\1\144\1\172\1\144\1\124\1"+
        "\155\1\145\2\157\1\151\1\141\1\143\2\150\1\145\1\154\1\uffff\1\172"+
        "\1\154\1\uffff\1\160\1\163\1\164\1\146\1\162\1\164\1\141\1\157\1"+
        "\171\1\141\1\153\2\164\4\uffff\1\165\1\145\1\166\1\157\1\156\1\uffff"+
        "\1\154\2\162\1\151\1\145\1\uffff\1\151\2\uffff\1\172\1\72\1\157"+
        "\1\164\1\151\1\157\3\162\1\uffff\1\156\1\117\1\146\1\160\1\145\1"+
        "\166\1\uffff\1\154\1\145\1\157\1\167\1\145\1\164\2\151\1\uffff\1"+
        "\145\1\uffff\1\164\1\72\1\154\1\172\1\151\2\72\1\uffff\1\165\1\164"+
        "\1\145\1\156\1\uffff\1\164\1\uffff\1\156\1\162\1\163\1\111\1\uffff"+
        "\1\72\1\uffff\1\157\1\145\1\157\1\151\1\142\1\146\1\160\1\164\1"+
        "\147\1\162\1\145\1\164\1\72\1\167\1\145\1\uffff\1\103\1\72\1\145"+
        "\2\164\1\145\1\150\1\164\1\156\1\72\1\164\2\72\1\151\1\156\1\162"+
        "\1\145\1\157\1\162\1\120\1\145\1\151\1\164\1\172\1\162\1\166\2\uffff"+
        "\1\164\1\151\1\155\1\154\1\151\1\145\2\164\1\146\1\72\1\122\1\164"+
        "\1\151\1\145\1\72\1\162\2\72\1\145\1\157\1\155\1\172\1\141\1\uffff"+
        "\1\172\1\uffff\1\164\2\uffff\1\163\2\72\1\172\2\145\1\163\1\172"+
        "\1\143\1\uffff\1\160\1\146\1\164\1\147\1\145\1\164\1\72\1\164\1"+
        "\150\1\145\1\172\1\72\1\uffff\1\72\1\172\1\157\1\uffff\1\154\1\157"+
        "\1\72\1\156\1\120\1\145\1\72\1\uffff\1\145\2\uffff\1\157\1\144\1"+
        "\164\2\162\1\151\1\141\1\72\1\172\1\151\1\145\1\163\1\151\1\172"+
        "\1\157\1\141\1\154\1\172\1\156\1\151\1\145\1\72\1\uffff\1\151\1"+
        "\145\1\uffff\1\172\1\164\1\72\1\uffff\1\72\2\uffff\1\72\1\156\1"+
        "\141\1\uffff\1\154\1\uffff\1\171\1\125\3\uffff\1\172\2\72\1\uffff"+
        "\1\157\1\72\2\164\1\150\1\162\1\72\1\uffff\1\157\1\164\1\156\4\uffff"+
        "\1\156\1\151\1\155\1\uffff\1\164\1\141\1\172\1\uffff\1\172\1\156"+
        "\1\72\1\151\1\164\1\151\1\172\1\162\1\uffff\1\157\1\143\1\72\1\172"+
        "\1\164\1\uffff\1\156\1\164\1\102\1\157\1\164\1\143\1\156\1\uffff"+
        "\1\147\1\146\1\uffff\1\171\3\uffff\1\172\1\164\1\172\1\72\1\151"+
        "\1\145\1\157\1\160\3\uffff\1\156\1\uffff\1\72\1\157\1\164\1\72\1"+
        "\uffff\1\155\1\72\2\164\1\156\1\72\1\124\1\162\1\157\1\uffff\1\144"+
        "\1\uffff\1\172\1\uffff\1\143\1\151\1\172\1\157\1\145\1\156\1\141"+
        "\2\uffff\1\171\1\72\1\151\1\141\1\156\1\172\1\141\1\164\1\150\1"+
        "\164\1\172\1\uffff\1\151\2\uffff\1\147\1\146\1\167\2\72\1\uffff"+
        "\1\155\1\72\1\uffff\1\72\1\uffff\1\172\1\141\1\145\1\uffff\1\151"+
        "\1\157\1\145\1\157\1\145\1\166\1\145\1\uffff\1\141\1\143\1\157\2"+
        "\156\1\164\1\154\1\172\1\uffff\1\157\1\162\1\164\1\uffff\1\154\1"+
        "\172\1\164\1\72\1\uffff\1\157\1\150\1\164\1\156\2\uffff\1\72\3\uffff"+
        "\1\151\1\72\1\147\1\164\1\146\1\160\1\156\1\145\1\143\1\154\1\141"+
        "\1\156\2\164\1\141\1\172\1\uffff\1\156\1\163\1\141\1\172\1\uffff"+
        "\1\72\1\uffff\1\156\1\164\2\72\1\uffff\1\156\1\uffff\1\150\2\164"+
        "\1\72\1\164\1\162\1\145\1\72\1\154\1\164\1\141\1\72\1\154\1\uffff"+
        "\1\172\1\72\1\154\2\uffff\1\172\1\72\2\uffff\1\145\1\164\1\157\1"+
        "\72\1\uffff\1\111\1\163\1\154\1\uffff\1\172\1\141\1\154\1\uffff"+
        "\1\172\2\uffff\1\172\2\uffff\1\162\1\72\1\155\1\uffff\1\146\1\150"+
        "\1\145\1\uffff\1\154\1\72\2\uffff\1\72\1\uffff\1\72\1\115\1\157"+
        "\1\162\1\172\3\uffff\1\151\1\157\1\141\1\uffff\1\163\2\164\1\163"+
        "\1\172\1\145\1\151\1\uffff\1\172\1\156\1\uffff\1\147\1\72\1\uffff";
    static final String DFA14_acceptS =
        "\25\uffff\1\65\1\66\1\72\1\uffff\1\142\1\uffff\1\u0081\1\uffff\1"+
        "\u00a2\1\u00a3\1\u00a4\2\uffff\1\u00bf\4\uffff\1\u00c5\3\uffff\1"+
        "\u00ca\1\u00cb\4\uffff\1\u00c5\113\uffff\1\64\1\u009b\1\65\1\66"+
        "\1\72\1\u00c4\1\77\1\142\1\u00a8\1\u0080\1\u0081\1\u00a1\1\u00a5"+
        "\1\u00a2\1\u00a3\1\u00a4\1\u00b6\1\u00bd\1\uffff\1\u00ba\1\uffff"+
        "\1\u00b7\1\u00b9\1\u00bf\2\uffff\1\u00c6\1\uffff\1\u00c3\1\u00c7"+
        "\1\u00c9\1\u00c8\1\u00ca\4\uffff\1\1\2\uffff\1\2\17\uffff\1\3\1"+
        "\4\5\uffff\1\5\6\uffff\1\6\61\uffff\1\u0097\31\uffff\1\u00bc\1\u00bb"+
        "\17\uffff\1\70\1\u00ad\11\uffff\1\56\1\73\4\uffff\1\71\12\uffff"+
        "\1\57\45\uffff\1\53\5\uffff\1\u0082\1\23\1\104\3\uffff\1\137\37"+
        "\uffff\1\101\3\uffff\1\111\10\uffff\1\45\5\uffff\1\u00a9\10\uffff"+
        "\1\102\1\u00aa\1\uffff\1\105\15\uffff\1\u009d\1\50\13\uffff\1\u0083"+
        "\1\25\10\uffff\1\u00af\1\u00ae\2\uffff\1\32\24\uffff\1\u008c\6\uffff"+
        "\1\43\1\110\2\uffff\1\52\5\uffff\1\u00c2\13\uffff\1\u00b0\1\46\6"+
        "\uffff\1\55\20\uffff\1\114\1\157\1\u00a0\7\uffff\1\171\6\uffff\1"+
        "\u009e\3\uffff\1\14\12\uffff\1\u00b5\1\147\4\uffff\1\151\2\uffff"+
        "\1\61\16\uffff\1\26\10\uffff\1\u00ab\6\uffff\1\54\1\u00b8\1\u00be"+
        "\2\uffff\1\u008a\2\uffff\1\u009a\1\uffff\1\u00c0\1\75\21\uffff\1"+
        "\112\2\uffff\1\51\15\uffff\1\u0096\1\24\1\13\1\u00a6\5\uffff\1\27"+
        "\5\uffff\1\16\1\uffff\1\76\1\113\11\uffff\1\152\6\uffff\1\74\10"+
        "\uffff\1\u00b2\1\uffff\1\150\7\uffff\1\44\4\uffff\1\143\1\uffff"+
        "\1\u0098\4\uffff\1\u00ac\1\uffff\1\125\17\uffff\1\u009c\32\uffff"+
        "\1\u00c1\1\124\27\uffff\1\67\1\uffff\1\41\1\uffff\1\141\1\u008d"+
        "\11\uffff\1\u008e\14\uffff\1\117\3\uffff\1\167\7\uffff\1\107\1\uffff"+
        "\1\u0087\1\u0088\26\uffff\1\175\2\uffff\1\144\3\uffff\1\u0093\1"+
        "\uffff\1\177\1\u0092\3\uffff\1\136\1\uffff\1\40\2\uffff\1\u0099"+
        "\1\u008b\1\u009f\3\uffff\1\60\7\uffff\1\156\3\uffff\1\47\1\116\1"+
        "\u0095\1\42\3\uffff\1\162\3\uffff\1\134\10\uffff\1\u0084\5\uffff"+
        "\1\17\7\uffff\1\176\2\uffff\1\140\1\uffff\1\u0094\1\u0091\1\u00b1"+
        "\10\uffff\1\15\1\u0090\1\132\1\uffff\1\131\4\uffff\1\154\11\uffff"+
        "\1\11\1\uffff\1\10\1\uffff\1\115\7\uffff\1\u0089\1\62\13\uffff\1"+
        "\u00a7\1\uffff\1\37\1\133\5\uffff\1\127\2\uffff\1\u008f\1\uffff"+
        "\1\155\3\uffff\1\161\7\uffff\1\63\10\uffff\1\135\3\uffff\1\20\4"+
        "\uffff\1\103\4\uffff\1\123\1\106\1\uffff\1\130\1\153\1\21\20\uffff"+
        "\1\100\4\uffff\1\22\1\uffff\1\145\4\uffff\1\126\1\uffff\1\160\15"+
        "\uffff\1\35\3\uffff\1\33\1\146\2\uffff\1\121\1\120\4\uffff\1\166"+
        "\3\uffff\1\174\3\uffff\1\173\1\uffff\1\u00b4\1\u0085\1\uffff\1\u00b3"+
        "\1\122\3\uffff\1\164\3\uffff\1\30\2\uffff\1\36\1\34\1\uffff\1\165"+
        "\5\uffff\1\172\1\u0086\1\163\3\uffff\1\31\7\uffff\1\12\2\uffff\1"+
        "\7\2\uffff\1\170";
    static final String DFA14_specialS =
        "\u048c\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\54\1\50\1\30\3\54\1\51\1"+
            "\34\3\54\1\37\1\40\1\42\1\52\12\45\1\54\1\27\1\32\1\24\1\33"+
            "\1\54\1\41\5\47\1\44\15\47\1\43\6\47\1\35\1\54\1\36\1\46\1\47"+
            "\1\54\1\6\1\7\1\10\1\1\1\23\1\13\1\21\1\17\1\5\2\47\1\11\1\4"+
            "\1\22\1\12\1\3\1\47\1\16\1\2\1\15\1\47\1\20\1\14\3\47\1\25\1"+
            "\31\1\26\uff81\54",
            "\1\60\3\uffff\1\56\3\uffff\1\55\6\uffff\1\57",
            "\1\72\1\uffff\1\66\1\67\1\70\2\uffff\1\65\1\64\6\uffff\1\62"+
            "\3\uffff\1\63\1\71",
            "\1\73\6\uffff\1\76\13\uffff\1\74\3\uffff\1\75",
            "\1\77\3\uffff\1\101\3\uffff\1\103\3\uffff\1\100\1\uffff\1\102",
            "\1\110\11\uffff\1\104\1\105\4\uffff\1\106\1\107",
            "\1\112\1\115\10\uffff\1\111\1\uffff\1\114\1\uffff\1\117\1\uffff"+
            "\1\113\2\uffff\1\116",
            "\1\124\3\uffff\1\120\3\uffff\1\123\5\uffff\1\122\5\uffff\1\121",
            "\1\131\3\uffff\1\125\2\uffff\1\132\3\uffff\1\127\2\uffff\1\126"+
            "\11\uffff\1\130",
            "\1\135\3\uffff\1\133\3\uffff\1\134",
            "\1\136\3\uffff\1\140\3\uffff\1\137",
            "\1\142\7\uffff\1\143\10\uffff\1\141",
            "\1\145\3\uffff\1\144\5\uffff\1\147\2\uffff\1\146",
            "\1\151\3\uffff\1\152\11\uffff\1\150\2\uffff\1\154\4\uffff\1"+
            "\155\1\uffff\1\153",
            "\1\160\3\uffff\1\156\5\uffff\1\157",
            "\1\161\3\uffff\1\162\5\uffff\1\163",
            "\1\164\3\uffff\1\165",
            "\1\167\2\uffff\1\166",
            "\1\172\11\uffff\1\171\5\uffff\1\170",
            "\1\173\10\uffff\1\174",
            "\1\175",
            "",
            "",
            "",
            "\12\u0082\7\uffff\6\u0082\32\uffff\6\u0082",
            "",
            "\1\u0085",
            "",
            "\1\u0088\11\uffff\1\u0089",
            "",
            "",
            "",
            "\1\u008d",
            "\1\u008e\1\u0093\1\u0090\1\u0091\4\uffff\1\u008f\11\uffff\1"+
            "\u0092",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0099\1\uffff\12\u0098",
            "\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\uffff\u009a",
            "\uffff\u009a",
            "\1\u009c\4\uffff\1\u009b",
            "",
            "",
            "\1\u00a0\5\uffff\1\u009e\10\uffff\1\u009f",
            "\1\u00a1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00a3",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00a4\21\61",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a9\15\uffff\1\u00a8",
            "\1\u00ab\20\uffff\1\u00aa",
            "\1\u00ac",
            "\1\u00b0\1\uffff\1\u00af\3\uffff\1\u00ae\1\uffff\1\u00ad",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b4\16\uffff\1\u00b3",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00b7",
            "\1\u00b9\1\uffff\1\u00b8\1\uffff\1\u00bb\3\uffff\1\u00ba",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00c2\1\61"+
            "\1\u00c1\4\61",
            "\1\u00c4",
            "\1\u00c6\3\uffff\1\u00c5",
            "\1\u00c7",
            "\1\u00c8\2\uffff\1\u00c9\3\uffff\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00ce\12\uffff\1\u00cd",
            "\1\u00d0\20\uffff\1\u00cf",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d6\2\uffff\1\u00d5\4\uffff\1\u00d7\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2\4\uffff\1\u00e3",
            "\1\u00e4",
            "\1\u00e6\41\uffff\1\u00e5",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9\15\uffff\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee\6\uffff\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\61\7\uffff\13\61\1\u00f3\5\61\1\u00f2\10\61\4\uffff\1\61"+
            "\1\uffff\17\61\1\u00f4\12\61",
            "\1\u00f6\17\uffff\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0105\15\uffff\1\u0104",
            "\1\u0107\31\uffff\1\u0106",
            "\1\u0108",
            "\1\u010a\3\uffff\1\u0109",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u010e",
            "",
            "\1\u0110\10\uffff\1\u010f",
            "",
            "",
            "",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0099\1\uffff\12\u0098",
            "",
            "",
            "",
            "",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\u0117",
            "\1\u0118",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d\11\uffff\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "",
            "\1\u0129",
            "\1\u012a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u012c",
            "\1\u012d",
            "",
            "\1\u012e",
            "\1\u012f",
            "\1\u0131\15\uffff\1\u0130\16\uffff\1\u0132",
            "\1\u0133",
            "\1\u0134\5\uffff\1\u0135",
            "\1\u0136",
            "",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150\14\uffff\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\12\61\1\u0168\6\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\1\u016a\6\uffff\1\u016d\21\61\1\u016b\3\61\1\u016c\3"+
            "\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "",
            "",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "",
            "",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "",
            "",
            "\1\u01a0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01a2",
            "\1\u01a3",
            "",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\12\61\1\u01aa\6\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6\7\uffff\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\12\61\1\u01c8\6\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01d3\30\uffff\1\u01d4",
            "\12\61\7\uffff\32\61\4\uffff\1\u01d5\1\uffff\32\61",
            "\1\u01d7",
            "",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "",
            "",
            "",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "",
            "\1\u01e0",
            "\1\u01e2\17\uffff\1\u01e1\2\uffff\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01f4",
            "\1\u01f5",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01f7",
            "\1\u01f8\14\uffff\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "",
            "\1\u020d",
            "\1\u020e",
            "\12\61\7\uffff\15\61\1\u020f\14\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0211",
            "\1\u0212",
            "",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "",
            "",
            "\1\u021b",
            "",
            "\1\u021d\11\uffff\1\u021e\3\uffff\1\u021f\3\uffff\1\u021c\2"+
            "\uffff\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "",
            "",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0233",
            "\1\u0234\15\uffff\1\u0235",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0237",
            "\1\u0238",
            "",
            "",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\12\61\1\u0241\6\uffff\1\u0240\31\61\4\uffff\1\61\1\uffff\32"+
            "\61",
            "",
            "",
            "\1\u0243",
            "\1\u0244\7\uffff\1\u0245\5\uffff\1\u0246",
            "",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0252\12\uffff\1\u0251",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0257\2\uffff\1\u0256",
            "\1\u0258",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\1\u0261\2\uffff\1\u0260",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0263",
            "",
            "",
            "\1\u0264",
            "\1\u0265",
            "",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u026a\12\uffff\1\u026b",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0272",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0275",
            "",
            "",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "",
            "\1\u027e\11\uffff\1\u027c\5\uffff\1\u027f\1\uffff\1\u027d",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0287",
            "\1\u0288",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u028a",
            "\1\u028b\15\uffff\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "",
            "",
            "",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "",
            "\1\u0297",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u029b",
            "\12\61\7\uffff\7\61\1\u029e\1\u029f\14\61\1\u029c\4\61\4\uffff"+
            "\1\u029d\1\uffff\32\61",
            "",
            "\1\u02a1",
            "\1\u02a2",
            "\1\u02a3",
            "",
            "\1\u02a4",
            "\1\u02a5",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u02a7",
            "\12\61\1\u02a8\6\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "",
            "",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "",
            "\1\u02b3",
            "\1\u02b4",
            "",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "\1\u02c9",
            "\1\u02ca",
            "",
            "\1\u02cb",
            "\1\u02cc",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "",
            "",
            "",
            "\1\u02d1",
            "\1\u02d2",
            "",
            "\1\u02d3",
            "\1\u02d4",
            "",
            "\1\u02d5",
            "",
            "",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u02da",
            "\1\u02db\7\uffff\1\u02de\11\uffff\1\u02dd\5\uffff\1\u02df\1"+
            "\uffff\1\u02dc",
            "\1\u02e0",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e6",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u02ec",
            "",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\1\u02f1",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f8",
            "\1\u02f9",
            "",
            "",
            "",
            "",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fd\15\uffff\1\u02fc",
            "\1\u02fe",
            "\1\u02ff",
            "",
            "\1\u0300",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "",
            "\1\u0305",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\1\u030c",
            "\1\u030d",
            "\1\u030e",
            "",
            "\1\u030f",
            "\1\u0310",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "",
            "\1\u031d",
            "",
            "\1\u031e",
            "\1\u031f",
            "\1\u0320",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0322",
            "\1\u0323",
            "\1\u0324",
            "",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "\1\u0328",
            "",
            "\1\u0329",
            "",
            "\1\u032a",
            "\1\u032b",
            "\1\u032c",
            "\1\u032d",
            "",
            "\1\u032e",
            "",
            "\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\1\u0335",
            "\1\u0336",
            "\1\u0337",
            "\1\u0338",
            "\1\u0339",
            "\1\u033a",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "",
            "\1\u033e",
            "\1\u033f",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\1\u0346",
            "\1\u0347",
            "\1\u0348",
            "\1\u0349",
            "\1\u034a",
            "\1\u034b",
            "\1\u034c",
            "\1\u034d",
            "\1\u034e",
            "\1\u034f",
            "\1\u0350",
            "\1\u0351",
            "\1\u0352",
            "\1\u0353",
            "\1\u0354",
            "\1\u0355",
            "\1\u0356",
            "\1\u0357",
            "",
            "",
            "\1\u0358",
            "\1\u0359",
            "\1\u035a",
            "\1\u035b",
            "\1\u035c",
            "\1\u035d",
            "\1\u035e",
            "\1\u035f",
            "\1\u0360",
            "\1\u0361",
            "\1\u0364\21\uffff\1\u0363\5\uffff\1\u0362",
            "\1\u0365",
            "\1\u0366",
            "\1\u0367",
            "\1\u0368",
            "\1\u0369",
            "\1\u036a",
            "\1\u036b",
            "\1\u036c",
            "\1\u036d",
            "\1\u036e",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0370",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0372",
            "",
            "",
            "\1\u0373",
            "\1\u0374",
            "\1\u0375",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0377",
            "\1\u0378",
            "\1\u0379",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u037b",
            "",
            "\1\u037c",
            "\1\u037d",
            "\1\u037e",
            "\1\u037f",
            "\1\u0380",
            "\1\u0381",
            "\1\u0382",
            "\1\u0383",
            "\1\u0384",
            "\1\u0385",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0387",
            "",
            "\1\u0388",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u038a",
            "",
            "\1\u038b",
            "\1\u038c",
            "\1\u038d",
            "\1\u038e",
            "\1\u038f",
            "\1\u0390",
            "\1\u0391",
            "",
            "\1\u0392",
            "",
            "",
            "\1\u0393",
            "\1\u0394",
            "\1\u0395",
            "\1\u0396",
            "\1\u0397",
            "\1\u0398",
            "\1\u0399",
            "\1\u039a",
            "\1\u039b",
            "\1\u039c",
            "\1\u039d",
            "\1\u039e",
            "\1\u039f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u03a1",
            "\1\u03a2",
            "\1\u03a3",
            "\1\u03a4",
            "\1\u03a5",
            "\1\u03a6",
            "\1\u03a7",
            "\1\u03a8",
            "",
            "\1\u03a9",
            "\1\u03aa",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u03ac",
            "\1\u03ad",
            "",
            "\1\u03ae",
            "",
            "",
            "\1\u03af",
            "\1\u03b0",
            "\1\u03b1",
            "",
            "\1\u03b2",
            "",
            "\1\u03b3",
            "\1\u03b6\7\uffff\1\u03b5\5\uffff\1\u03b4\2\uffff\1\u03b7",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u03b9",
            "\1\u03ba",
            "",
            "\1\u03bb",
            "\1\u03bc",
            "\1\u03bd",
            "\1\u03be",
            "\1\u03bf",
            "\1\u03c0",
            "\1\u03c1",
            "",
            "\1\u03c2",
            "\1\u03c3",
            "\1\u03c4",
            "",
            "",
            "",
            "",
            "\1\u03c5",
            "\1\u03c6",
            "\1\u03c7",
            "",
            "\1\u03c8",
            "\1\u03c9",
            "\12\61\7\uffff\32\61\4\uffff\1\u03ca\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\u03cc\1\uffff\32\61",
            "\1\u03ce",
            "\1\u03cf",
            "\1\u03d0",
            "\1\u03d1",
            "\1\u03d2",
            "\1\u03d3",
            "\1\u03d4",
            "",
            "\1\u03d5",
            "\1\u03d6",
            "\1\u03d7",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u03d9",
            "",
            "\1\u03da",
            "\1\u03db",
            "\1\u03dc",
            "\1\u03dd",
            "\1\u03de",
            "\1\u03df",
            "\1\u03e0",
            "",
            "\1\u03e1",
            "\1\u03e2",
            "",
            "\1\u03e3",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u03e5",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u03e7",
            "\1\u03e8",
            "\1\u03e9",
            "\1\u03ea",
            "\1\u03eb",
            "",
            "",
            "",
            "\1\u03ec",
            "",
            "\1\u03ed",
            "\1\u03ee",
            "\1\u03ef",
            "\1\u03f0",
            "",
            "\1\u03f1",
            "\1\u03f2",
            "\1\u03f3",
            "\1\u03f4",
            "\1\u03f5",
            "\1\u03f6",
            "\1\u03f8\11\uffff\1\u03f9\5\uffff\1\u03f7\1\uffff\1\u03fa",
            "\1\u03fb",
            "\1\u03fc",
            "",
            "\1\u03fd",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u03ff",
            "\1\u0400",
            "\1\u0401",
            "\1\u0402",
            "\1\u0403",
            "\1\u0404",
            "\1\u0405",
            "",
            "",
            "\1\u0406",
            "\1\u0407",
            "\1\u0408",
            "\1\u0409",
            "\1\u040a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u040c",
            "\1\u040d",
            "\1\u040e",
            "\1\u040f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0411",
            "",
            "",
            "\1\u0412",
            "\1\u0413",
            "\1\u0414",
            "\1\u0415",
            "\1\u0416",
            "",
            "\1\u0417",
            "\1\u0418",
            "",
            "\1\u0419",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u041b",
            "\1\u041c",
            "",
            "\1\u041d",
            "\1\u041e",
            "\1\u041f",
            "\1\u0420",
            "\1\u0421",
            "\1\u0422",
            "\1\u0423",
            "",
            "\1\u0424",
            "\1\u0425",
            "\1\u0426",
            "\1\u0427",
            "\1\u0428",
            "\1\u0429",
            "\1\u042a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u042c",
            "\1\u042d",
            "\1\u042e",
            "",
            "\1\u042f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0431",
            "\1\u0432",
            "",
            "\1\u0433",
            "\1\u0434",
            "\1\u0435",
            "\1\u0436",
            "",
            "",
            "\1\u0437",
            "",
            "",
            "",
            "\1\u0438",
            "\1\u0439",
            "\1\u043a",
            "\1\u043b",
            "\1\u043c",
            "\1\u043d",
            "\1\u043e",
            "\1\u043f",
            "\1\u0440",
            "\1\u0441",
            "\1\u0442",
            "\1\u0443",
            "\1\u0444",
            "\1\u0445",
            "\1\u0446",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0448",
            "\1\u0449",
            "\1\u044a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u044c",
            "",
            "\1\u044d",
            "\1\u044e",
            "\1\u044f",
            "\1\u0450",
            "",
            "\1\u0451",
            "",
            "\1\u0452",
            "\1\u0453",
            "\1\u0454",
            "\1\u0455",
            "\1\u0456",
            "\1\u0457",
            "\1\u0458",
            "\1\u0459",
            "\1\u045a",
            "\1\u045b",
            "\1\u045c",
            "\1\u045d",
            "\1\u045e",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0460",
            "\1\u0461",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0463",
            "",
            "",
            "\1\u0464",
            "\1\u0465",
            "\1\u0466",
            "\1\u0467",
            "",
            "\1\u0468",
            "\1\u0469",
            "\1\u046a",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u046c",
            "\1\u046d",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u0470",
            "\1\u0471",
            "\1\u0472",
            "",
            "\1\u0473",
            "\1\u0474",
            "\1\u0475",
            "",
            "\1\u0476",
            "\1\u0477",
            "",
            "",
            "\1\u0478",
            "",
            "\1\u0479",
            "\1\u047a",
            "\1\u047b",
            "\1\u047c",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "\1\u047e",
            "\1\u047f",
            "\1\u0480",
            "",
            "\1\u0481",
            "\1\u0482",
            "\1\u0483",
            "\1\u0484",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0486",
            "\1\u0487",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0489",
            "",
            "\1\u048a",
            "\1\u048b",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | T122 | T123 | T124 | T125 | T126 | T127 | T128 | T129 | T130 | T131 | T132 | T133 | T134 | T135 | T136 | T137 | T138 | T139 | T140 | T141 | T142 | T143 | T144 | T145 | T146 | T147 | T148 | T149 | T150 | T151 | T152 | T153 | T154 | T155 | T156 | T157 | T158 | T159 | T160 | T161 | T162 | T163 | T164 | T165 | T166 | T167 | T168 | T169 | T170 | T171 | T172 | T173 | T174 | T175 | T176 | T177 | T178 | T179 | T180 | T181 | T182 | T183 | T184 | T185 | T186 | T187 | T188 | T189 | T190 | T191 | T192 | T193 | T194 | T195 | T196 | T197 | T198 | T199 | T200 | T201 | T202 | T203 | T204 | T205 | T206 | RULE_BOOL | RULE_FLOAT | RULE_HEX_COLOR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}