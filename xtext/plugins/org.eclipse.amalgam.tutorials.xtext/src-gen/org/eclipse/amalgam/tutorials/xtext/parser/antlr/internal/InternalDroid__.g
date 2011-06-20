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
T89 : 'image:' ;
T90 : 'link:' ;
T91 : 'to' ;
T92 : 'spinner:' ;
T93 : 'editText:' ;
T94 : 'string' ;
T95 : '=' ;
T96 : 'integer' ;
T97 : 'bool' ;
T98 : 'color' ;
T99 : 'dimension' ;
T100 : 'array' ;
T101 : '(integer)' ;
T102 : '[' ;
T103 : ',' ;
T104 : ']' ;
T105 : '(string)' ;
T106 : 'bitmap' ;
T107 : 'transition' ;
T108 : '<->' ;
T109 : 'menu' ;
T110 : 'item' ;
T111 : 'group' ;
T112 : 'submenu' ;
T113 : 'set' ;
T114 : 'shared' ;
T115 : 'fade:' ;
T116 : 'from' ;
T117 : 'scale:' ;
T118 : 'translate:' ;
T119 : 'rotate:' ;
T120 : 'tweenAnimation' ;
T121 : 'oneShot' ;
T122 : 'frameAnimation' ;
T123 : 'frame:' ;
T124 : '->' ;
T125 : '@string' ;
T126 : '@integer' ;
T127 : '@bool' ;
T128 : '@color' ;
T129 : '@dimen' ;
T130 : '@drawable' ;
T131 : '@anim' ;
T132 : '@interpolator' ;
T133 : '.' ;
T134 : 'dp' ;
T135 : 'sp' ;
T136 : 'pt' ;
T137 : 'px' ;
T138 : 'mm' ;
T139 : 'in' ;
T140 : 'accelerate_decelerate' ;
T141 : 'accelerate' ;
T142 : 'anticipate' ;
T143 : 'anticipate_overshoot' ;
T144 : 'bounce' ;
T145 : 'cycle' ;
T146 : 'decelerate' ;
T147 : 'overshoot' ;
T148 : 'fill_parent' ;
T149 : 'match_parent' ;
T150 : 'wrap_content' ;
T151 : 'top' ;
T152 : 'bottom' ;
T153 : 'left' ;
T154 : 'right' ;
T155 : 'center' ;
T156 : 'center_vertical' ;
T157 : 'center_horizontal' ;
T158 : 'fill' ;
T159 : 'fill_vertical' ;
T160 : 'fill_horizontal' ;
T161 : 'clip_vertical' ;
T162 : 'clip_horizontal' ;
T163 : 'horizontal' ;
T164 : 'vertical' ;
T165 : 'visible' ;
T166 : 'invisible' ;
T167 : 'gone' ;
T168 : 'normal' ;
T169 : 'sans' ;
T170 : 'serif' ;
T171 : 'monospace' ;
T172 : 'bold' ;
T173 : 'italic' ;
T174 : 'none' ;
T175 : 'web' ;
T176 : 'email' ;
T177 : 'phone' ;
T178 : 'map' ;
T179 : 'all' ;
T180 : 'sentences' ;
T181 : 'words' ;
T182 : 'characters' ;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15275
RULE_BOOL : ('TRUE'|'FALSE');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15277
RULE_FLOAT : RULE_INT '.' RULE_INT;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15279
RULE_HEX_COLOR : '#' ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') (('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f'))?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15281
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15283
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15285
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15287
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15289
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15291
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15293
RULE_ANY_OTHER : .;


