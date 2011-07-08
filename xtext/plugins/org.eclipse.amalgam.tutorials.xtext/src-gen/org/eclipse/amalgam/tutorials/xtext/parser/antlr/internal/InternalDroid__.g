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
T17 : 'version:' ;
T18 : '}' ;
T19 : 'sdk:' ;
T20 : 'min:' ;
T21 : ';' ;
T22 : 'max:' ;
T23 : 'target:' ;
T24 : 'screen' ;
T25 : 'layout:' ;
T26 : '#' ;
T27 : 'listActivity' ;
T28 : 'data:' ;
T29 : 'item:' ;
T30 : 'tabActivity' ;
T31 : 'tab:' ;
T32 : 'icon:' ;
T33 : 'selectedIcon:' ;
T34 : 'activity:' ;
T35 : 'goTo' ;
T36 : 'show' ;
T37 : 'invoke' ;
T38 : 'linear' ;
T39 : 'layout' ;
T40 : 'alpha:' ;
T41 : 'background:' ;
T42 : 'minHeight:' ;
T43 : 'minWidth:' ;
T44 : 'nextFocusDown:' ;
T45 : 'nextFocusLeft:' ;
T46 : 'nextFocusRight:' ;
T47 : 'nextFocusUp:' ;
T48 : 'onClick:' ;
T49 : 'padding:' ;
T50 : 'paddingBottom:' ;
T51 : 'paddingLeft:' ;
T52 : 'paddingRight:' ;
T53 : 'paddingTop:' ;
T54 : 'scrollbars:' ;
T55 : 'visibility:' ;
T56 : 'animation:' ;
T57 : 'orientation:' ;
T58 : 'relative' ;
T59 : 'tab' ;
T60 : 'tabWidget' ;
T61 : 'gravity:' ;
T62 : '|' ;
T63 : 'divider:' ;
T64 : 'tabStrip:' ;
T65 : 'tabStripLeft:' ;
T66 : 'tabStripRight:' ;
T67 : 'frame' ;
T68 : 'height:' ;
T69 : 'width:' ;
T70 : 'weight:' ;
T71 : 'marginBottom:' ;
T72 : 'marginLeft:' ;
T73 : 'marginRight:' ;
T74 : 'marginTop:' ;
T75 : 'above:' ;
T76 : 'alignBaseline:' ;
T77 : 'alignBottom:' ;
T78 : 'alignLeft:' ;
T79 : 'alignParentBottom:' ;
T80 : 'alignParentLeft:' ;
T81 : 'alignParentRight:' ;
T82 : 'alignParentTop:' ;
T83 : 'alignTop:' ;
T84 : 'alignWithParentIfMissing:' ;
T85 : 'below:' ;
T86 : 'centerHorizontal:' ;
T87 : 'centerInParent:' ;
T88 : 'centerVertical:' ;
T89 : 'toLeftOf:' ;
T90 : 'toRightOf:' ;
T91 : 'textView' ;
T92 : 'top:' ;
T93 : 'left:' ;
T94 : 'clickable:' ;
T95 : 'fadeScrollBars:' ;
T96 : 'isScrollContainer:' ;
T97 : 'autoLink:' ;
T98 : 'autoText:' ;
T99 : 'capitalize:' ;
T100 : 'digits:' ;
T101 : 'editable:' ;
T102 : 'hint:' ;
T103 : 'numeric:' ;
T104 : 'password:' ;
T105 : 'phoneNumber:' ;
T106 : 'singleLine:' ;
T107 : 'textColor:' ;
T108 : 'typeface:' ;
T109 : 'textSize:' ;
T110 : 'textStyle:' ;
T111 : 'imageView' ;
T112 : 'button' ;
T113 : 'to' ;
T114 : 'spinner' ;
T115 : 'editText' ;
T116 : 'string' ;
T117 : '=' ;
T118 : 'integer' ;
T119 : 'bool' ;
T120 : 'color' ;
T121 : 'dimension' ;
T122 : 'array' ;
T123 : '(integer)' ;
T124 : '[' ;
T125 : ',' ;
T126 : ']' ;
T127 : '(string)' ;
T128 : 'bitmap' ;
T129 : 'transition' ;
T130 : '<->' ;
T131 : 'menu' ;
T132 : 'item' ;
T133 : 'group' ;
T134 : 'submenu' ;
T135 : 'set' ;
T136 : 'shared' ;
T137 : 'fade:' ;
T138 : 'from' ;
T139 : 'scale:' ;
T140 : 'translate:' ;
T141 : 'rotate:' ;
T142 : 'tweenAnimation' ;
T143 : 'oneShot' ;
T144 : 'frameAnimation' ;
T145 : 'frame:' ;
T146 : '->' ;
T147 : '@string' ;
T148 : '@integer' ;
T149 : '@bool' ;
T150 : '@color' ;
T151 : '@dimen' ;
T152 : '@drawable' ;
T153 : '@anim' ;
T154 : '@interpolator' ;
T155 : '.' ;
T156 : 'dp' ;
T157 : 'sp' ;
T158 : 'pt' ;
T159 : 'px' ;
T160 : 'mm' ;
T161 : 'in' ;
T162 : 'accelerate_decelerate' ;
T163 : 'accelerate' ;
T164 : 'anticipate' ;
T165 : 'anticipate_overshoot' ;
T166 : 'bounce' ;
T167 : 'cycle' ;
T168 : 'decelerate' ;
T169 : 'overshoot' ;
T170 : 'fill_parent' ;
T171 : 'match_parent' ;
T172 : 'wrap_content' ;
T173 : 'top' ;
T174 : 'bottom' ;
T175 : 'left' ;
T176 : 'right' ;
T177 : 'center' ;
T178 : 'center_vertical' ;
T179 : 'center_horizontal' ;
T180 : 'fill' ;
T181 : 'fill_vertical' ;
T182 : 'fill_horizontal' ;
T183 : 'clip_vertical' ;
T184 : 'clip_horizontal' ;
T185 : 'horizontal' ;
T186 : 'vertical' ;
T187 : 'visible' ;
T188 : 'invisible' ;
T189 : 'gone' ;
T190 : 'normal' ;
T191 : 'sans' ;
T192 : 'serif' ;
T193 : 'monospace' ;
T194 : 'bold' ;
T195 : 'italic' ;
T196 : 'none' ;
T197 : 'web' ;
T198 : 'email' ;
T199 : 'phone' ;
T200 : 'map' ;
T201 : 'all' ;
T202 : 'sentences' ;
T203 : 'words' ;
T204 : 'characters' ;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 16373
RULE_BOOL : ('TRUE'|'FALSE');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 16375
RULE_FLOAT : RULE_INT '.' RULE_INT;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 16377
RULE_HEX_COLOR : '#' ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') (('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f'))?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 16379
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 16381
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 16383
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 16385
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 16387
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 16389
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 16391
RULE_ANY_OTHER : .;


