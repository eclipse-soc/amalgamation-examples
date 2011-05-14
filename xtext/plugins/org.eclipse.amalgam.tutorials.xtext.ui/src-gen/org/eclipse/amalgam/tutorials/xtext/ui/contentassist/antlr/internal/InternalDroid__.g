lexer grammar InternalDroid;
@header {
package org.eclipse.amalgam.tutorials.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'YES' ;
T13 : 'NO' ;
T14 : 'dp' ;
T15 : 'sp' ;
T16 : 'pt' ;
T17 : 'px' ;
T18 : 'mm' ;
T19 : 'in' ;
T20 : 'application' ;
T21 : '{' ;
T22 : '}' ;
T23 : 'manifest' ;
T24 : 'resource' ;
T25 : 'menu' ;
T26 : 'string' ;
T27 : '=' ;
T28 : 'integer' ;
T29 : 'bool' ;
T30 : 'color' ;
T31 : 'dimension' ;
T32 : 'bitmap' ;
T33 : 'transition' ;
T34 : '<->' ;
T35 : 'animation' ;
T36 : 'layout' ;
T37 : 'widget' ;
T38 : '<' ;
T39 : '>' ;
T40 : 'top:' ;
T41 : 'left:' ;
T42 : 'width:' ;
T43 : 'height:' ;
T44 : 'background:' ;
T45 : 'clickable?' ;
T46 : 'fadeScrollBars?' ;
T47 : 'isScrollContainer?' ;
T48 : '->' ;
T49 : 'textView' ;
T50 : 'hint:' ;
T51 : 'textColor:' ;
T52 : 'button' ;
T53 : 'imageButton' ;
T54 : 'link' ;
T55 : 'to' ;
T56 : 'spinner' ;
T57 : 'prompt:' ;
T58 : 'editText' ;
T59 : 'editable?' ;
T60 : 'numeric?' ;
T61 : 'password?' ;
T62 : 'phoneNumber?' ;
T63 : 'activity' ;
T64 : 'listActivity' ;
T65 : 'data' ;
T66 : 'item' ;
T67 : 'tabActivity' ;
T68 : 'tab' ;
T69 : 'action' ;
T70 : 'goTo' ;
T71 : 'show' ;
T72 : 'invoke' ;
T73 : 'load' ;
T74 : '=>' ;
T75 : '(' ;
T76 : ')' ;
T77 : '.' ;
T78 : '://' ;
T79 : '/' ;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 17999
RULE_HEX_COLOR : '#' ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') (('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f'))?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 18001
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 18003
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 18005
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 18007
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 18009
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 18011
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 18013
RULE_ANY_OTHER : .;


