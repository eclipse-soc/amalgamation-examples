lexer grammar InternalDroid;
@header {
package org.eclipse.amalgam.tutorials.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T14 : 'application' ;
T15 : '=>' ;
T16 : '{' ;
T17 : '}' ;
T18 : 'screen' ;
T19 : 'layout:' ;
T20 : '#' ;
T21 : 'listActivity' ;
T22 : 'data:' ;
T23 : 'item:' ;
T24 : 'tabActivity' ;
T25 : 'tab:' ;
T26 : 'icon:' ;
T27 : 'selectedIcon:' ;
T28 : 'activity:' ;
T29 : 'goTo' ;
T30 : 'show' ;
T31 : 'invoke' ;
T32 : 'linear' ;
T33 : 'layout' ;
T34 : 'alpha:' ;
T35 : ';' ;
T36 : 'background:' ;
T37 : 'minHeight:' ;
T38 : 'minWidth:' ;
T39 : 'nextFocusDown:' ;
T40 : 'nextFocusLeft:' ;
T41 : 'nextFocusRight:' ;
T42 : 'nextFocusUp:' ;
T43 : 'onClick:' ;
T44 : 'padding:' ;
T45 : 'paddingBottom:' ;
T46 : 'paddingLeft:' ;
T47 : 'paddingRight:' ;
T48 : 'paddingTop:' ;
T49 : 'scrollbars:' ;
T50 : 'visibility:' ;
T51 : 'animation:' ;
T52 : 'orientation:' ;
T53 : 'relative' ;
T54 : 'tab' ;
T55 : 'tabWidget' ;
T56 : 'gravity:' ;
T57 : '|' ;
T58 : 'divider:' ;
T59 : 'tabStrip:' ;
T60 : 'tabStripLeft:' ;
T61 : 'tabStripRight:' ;
T62 : 'frame' ;
T63 : 'textView:' ;
T64 : '<' ;
T65 : '>' ;
T66 : 'top:' ;
T67 : 'left:' ;
T68 : 'width:' ;
T69 : 'height:' ;
T70 : 'clickable:' ;
T71 : 'fadeScrollBars:' ;
T72 : 'isScrollContainer:' ;
T73 : 'autoLink:' ;
T74 : 'autoText:' ;
T75 : 'capitalize:' ;
T76 : 'digits:' ;
T77 : 'editable:' ;
T78 : 'hint:' ;
T79 : 'numeric:' ;
T80 : 'password:' ;
T81 : 'phoneNumber:' ;
T82 : 'singleLine:' ;
T83 : 'textColor:' ;
T84 : 'typeface:' ;
T85 : 'textSize:' ;
T86 : 'textStyle:' ;
T87 : 'imageView:' ;
T88 : 'button:' ;
T89 : 'to' ;
T90 : 'spinner:' ;
T91 : 'editText:' ;
T92 : 'string' ;
T93 : '=' ;
T94 : 'integer' ;
T95 : 'bool' ;
T96 : 'color' ;
T97 : 'dimension' ;
T98 : 'array' ;
T99 : '(integer)' ;
T100 : '[' ;
T101 : ',' ;
T102 : ']' ;
T103 : '(string)' ;
T104 : 'bitmap' ;
T105 : 'transition' ;
T106 : '<->' ;
T107 : 'menu' ;
T108 : 'item' ;
T109 : 'group' ;
T110 : 'submenu' ;
T111 : 'set' ;
T112 : 'shared' ;
T113 : 'fade:' ;
T114 : 'from' ;
T115 : 'scale:' ;
T116 : 'translate:' ;
T117 : 'rotate:' ;
T118 : 'tweenAnimation' ;
T119 : 'oneShot' ;
T120 : 'frameAnimation' ;
T121 : 'frame:' ;
T122 : '->' ;
T123 : '@string' ;
T124 : '@integer' ;
T125 : '@bool' ;
T126 : '@color' ;
T127 : '@dimen' ;
T128 : '@drawable' ;
T129 : '@anim' ;
T130 : '@interpolator' ;
T131 : '.' ;
T132 : 'dp' ;
T133 : 'sp' ;
T134 : 'pt' ;
T135 : 'px' ;
T136 : 'mm' ;
T137 : 'in' ;
T138 : 'accelerate_decelerate' ;
T139 : 'accelerate' ;
T140 : 'anticipate' ;
T141 : 'anticipate_overshoot' ;
T142 : 'bounce' ;
T143 : 'cycle' ;
T144 : 'decelerate' ;
T145 : 'overshoot' ;
T146 : 'fill_parent' ;
T147 : 'match_parent' ;
T148 : 'wrap_content' ;
T149 : 'top' ;
T150 : 'bottom' ;
T151 : 'left' ;
T152 : 'right' ;
T153 : 'center' ;
T154 : 'center_vertical' ;
T155 : 'center_horizontal' ;
T156 : 'fill' ;
T157 : 'fill_vertical' ;
T158 : 'fill_horizontal' ;
T159 : 'clip_vertical' ;
T160 : 'clip_horizontal' ;
T161 : 'horizontal' ;
T162 : 'vertical' ;
T163 : 'visible' ;
T164 : 'invisible' ;
T165 : 'gone' ;
T166 : 'normal' ;
T167 : 'sans' ;
T168 : 'serif' ;
T169 : 'monospace' ;
T170 : 'bold' ;
T171 : 'italic' ;
T172 : 'none' ;
T173 : 'web' ;
T174 : 'email' ;
T175 : 'phone' ;
T176 : 'map' ;
T177 : 'all' ;
T178 : 'sentences' ;
T179 : 'words' ;
T180 : 'characters' ;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 14208
RULE_BOOL : ('TRUE'|'FALSE');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 14210
RULE_FLOAT : RULE_INT '.' RULE_INT;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 14212
RULE_HEX_COLOR : '#' ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') (('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f'))?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 14214
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 14216
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 14218
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 14220
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 14222
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 14224
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 14226
RULE_ANY_OTHER : .;


