lexer grammar InternalDroid;
@header {
package org.eclipse.amalgam.tutorials.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'Hello' ;
T12 : '!' ;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 178
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 180
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 182
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 184
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 186
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 188
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 190
RULE_ANY_OTHER : .;


