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
T91 : 'textView:' ;
T92 : '<' ;
T93 : '>' ;
T94 : 'top:' ;
T95 : 'left:' ;
T96 : 'clickable:' ;
T97 : 'fadeScrollBars:' ;
T98 : 'isScrollContainer:' ;
T99 : 'autoLink:' ;
T100 : 'autoText:' ;
T101 : 'capitalize:' ;
T102 : 'digits:' ;
T103 : 'editable:' ;
T104 : 'hint:' ;
T105 : 'numeric:' ;
T106 : 'password:' ;
T107 : 'phoneNumber:' ;
T108 : 'singleLine:' ;
T109 : 'textColor:' ;
T110 : 'typeface:' ;
T111 : 'textSize:' ;
T112 : 'textStyle:' ;
T113 : 'imageView:' ;
T114 : 'button:' ;
T115 : 'to' ;
T116 : 'spinner:' ;
T117 : 'editText:' ;
T118 : 'string' ;
T119 : '=' ;
T120 : 'integer' ;
T121 : 'bool' ;
T122 : 'color' ;
T123 : 'dimension' ;
T124 : 'array' ;
T125 : '(integer)' ;
T126 : '[' ;
T127 : ',' ;
T128 : ']' ;
T129 : '(string)' ;
T130 : 'bitmap' ;
T131 : 'transition' ;
T132 : '<->' ;
T133 : 'menu' ;
T134 : 'item' ;
T135 : 'group' ;
T136 : 'submenu' ;
T137 : 'set' ;
T138 : 'shared' ;
T139 : 'fade:' ;
T140 : 'from' ;
T141 : 'scale:' ;
T142 : 'translate:' ;
T143 : 'rotate:' ;
T144 : 'tweenAnimation' ;
T145 : 'oneShot' ;
T146 : 'frameAnimation' ;
T147 : 'frame:' ;
T148 : '->' ;
T149 : '@string' ;
T150 : '@integer' ;
T151 : '@bool' ;
T152 : '@color' ;
T153 : '@dimen' ;
T154 : '@drawable' ;
T155 : '@anim' ;
T156 : '@interpolator' ;
T157 : '.' ;
T158 : 'dp' ;
T159 : 'sp' ;
T160 : 'pt' ;
T161 : 'px' ;
T162 : 'mm' ;
T163 : 'in' ;
T164 : 'accelerate_decelerate' ;
T165 : 'accelerate' ;
T166 : 'anticipate' ;
T167 : 'anticipate_overshoot' ;
T168 : 'bounce' ;
T169 : 'cycle' ;
T170 : 'decelerate' ;
T171 : 'overshoot' ;
T172 : 'fill_parent' ;
T173 : 'match_parent' ;
T174 : 'wrap_content' ;
T175 : 'top' ;
T176 : 'bottom' ;
T177 : 'left' ;
T178 : 'right' ;
T179 : 'center' ;
T180 : 'center_vertical' ;
T181 : 'center_horizontal' ;
T182 : 'fill' ;
T183 : 'fill_vertical' ;
T184 : 'fill_horizontal' ;
T185 : 'clip_vertical' ;
T186 : 'clip_horizontal' ;
T187 : 'horizontal' ;
T188 : 'vertical' ;
T189 : 'visible' ;
T190 : 'invisible' ;
T191 : 'gone' ;
T192 : 'normal' ;
T193 : 'sans' ;
T194 : 'serif' ;
T195 : 'monospace' ;
T196 : 'bold' ;
T197 : 'italic' ;
T198 : 'none' ;
T199 : 'web' ;
T200 : 'email' ;
T201 : 'phone' ;
T202 : 'map' ;
T203 : 'all' ;
T204 : 'sentences' ;
T205 : 'words' ;
T206 : 'characters' ;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15595
RULE_BOOL : ('TRUE'|'FALSE');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15597
RULE_FLOAT : RULE_INT '.' RULE_INT;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15599
RULE_HEX_COLOR : '#' ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') (('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f'))?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15601
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15603
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15605
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15607
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15609
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15611
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext/src-gen/org/eclipse/amalgam/tutorials/xtext/parser/antlr/internal/InternalDroid.g" 15613
RULE_ANY_OTHER : .;


