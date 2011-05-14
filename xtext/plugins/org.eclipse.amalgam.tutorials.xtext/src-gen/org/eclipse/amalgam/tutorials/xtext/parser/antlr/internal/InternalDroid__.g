lexer grammar InternalDroid;
@header {
package org.eclipse.amalgam.tutorials.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'application' ;
T13 : '{' ;
T14 : '}' ;
T15 : 'manifest' ;
T16 : 'resource' ;
T17 : 'menu' ;
T18 : 'string' ;
T19 : '=' ;
T20 : 'integer' ;
T21 : 'bool' ;
T22 : 'color' ;
T23 : 'dimension' ;
T24 : 'bitmap' ;
T25 : 'transition' ;
T26 : '<->' ;
T27 : 'animation' ;
T28 : 'layout' ;
T29 : 'widget' ;
T30 : '<' ;
T31 : '>' ;
T32 : 'top:' ;
T33 : 'left:' ;
T34 : 'width:' ;
T35 : 'height:' ;
T36 : 'background:' ;
T37 : 'clickable?' ;
T38 : 'fadeScrollBars?' ;
T39 : 'isScrollContainer?' ;
T40 : '->' ;
T41 : 'textView' ;
T42 : 'hint:' ;
T43 : 'textColor:' ;
T44 : 'button' ;
T45 : 'imageButton' ;
T46 : 'link' ;
T47 : 'to' ;
T48 : 'spinner' ;
T49 : 'prompt:' ;
T50 : 'editText' ;
T51 : 'editable?' ;
T52 : 'numeric?' ;
T53 : 'password?' ;
T54 : 'phoneNumber?' ;
T55 : 'activity' ;
T56 : 'listActivity' ;
T57 : 'data' ;
T58 : 'item' ;
T59 : 'tabActivity' ;
T60 : 'tab' ;
T61 : 'action' ;
T62 : 'goTo' ;
T63 : 'show' ;
T64 : 'invoke' ;
T65 : 'load' ;
T66 : '=>' ;
T67 : '(' ;
T68 : ')' ;
T69 : '.' ;
T70 : 'YES' ;
T71 : 'NO' ;
T72 : '://' ;
T73 : '/' ;
T74 : 'dp' ;
T75 : 'sp' ;
T76 : 'pt' ;
T77 : 'px' ;
T78 : 'mm' ;
T79 : 'in' ;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 6837
RULE_HEX_COLOR : '#' ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') (('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f'))?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 6839
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 6841
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 6843
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 6845
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 6847
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 6849
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 6851
RULE_ANY_OTHER : .;


