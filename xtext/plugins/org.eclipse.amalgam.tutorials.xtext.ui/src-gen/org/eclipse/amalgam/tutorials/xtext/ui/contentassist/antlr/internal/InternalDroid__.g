lexer grammar InternalDroid;
@header {
package org.eclipse.amalgam.tutorials.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T14 : 'dp' ;
T15 : 'sp' ;
T16 : 'pt' ;
T17 : 'px' ;
T18 : 'mm' ;
T19 : 'in' ;
T20 : 'accelerate_decelerate' ;
T21 : 'accelerate' ;
T22 : 'anticipate' ;
T23 : 'anticipate_overshoot' ;
T24 : 'bounce' ;
T25 : 'cycle' ;
T26 : 'decelerate' ;
T27 : 'linear' ;
T28 : 'overshoot' ;
T29 : 'fill_parent' ;
T30 : 'match_parent' ;
T31 : 'wrap_content' ;
T32 : 'top' ;
T33 : 'bottom' ;
T34 : 'left' ;
T35 : 'right' ;
T36 : 'center' ;
T37 : 'center_vertical' ;
T38 : 'center_horizontal' ;
T39 : 'fill' ;
T40 : 'fill_vertical' ;
T41 : 'fill_horizontal' ;
T42 : 'clip_vertical' ;
T43 : 'clip_horizontal' ;
T44 : 'horizontal' ;
T45 : 'vertical' ;
T46 : 'visible' ;
T47 : 'invisible' ;
T48 : 'gone' ;
T49 : 'normal' ;
T50 : 'sans' ;
T51 : 'serif' ;
T52 : 'monospace' ;
T53 : 'bold' ;
T54 : 'italic' ;
T55 : 'none' ;
T56 : 'web' ;
T57 : 'email' ;
T58 : 'phone' ;
T59 : 'map' ;
T60 : 'all' ;
T61 : 'sentences' ;
T62 : 'words' ;
T63 : 'characters' ;
T64 : 'application' ;
T65 : '=>' ;
T66 : '{' ;
T67 : '}' ;
T68 : 'screen' ;
T69 : 'layout:' ;
T70 : '#' ;
T71 : 'listActivity' ;
T72 : 'data:' ;
T73 : 'item:' ;
T74 : 'tabActivity' ;
T75 : 'tab:' ;
T76 : 'icon:' ;
T77 : 'selectedIcon:' ;
T78 : 'activity:' ;
T79 : 'goTo' ;
T80 : 'show' ;
T81 : 'invoke' ;
T82 : 'layout' ;
T83 : 'alpha:' ;
T84 : ';' ;
T85 : 'background:' ;
T86 : 'minHeight:' ;
T87 : 'minWidth:' ;
T88 : 'nextFocusDown:' ;
T89 : 'nextFocusLeft:' ;
T90 : 'nextFocusRight:' ;
T91 : 'nextFocusUp:' ;
T92 : 'onClick:' ;
T93 : 'padding:' ;
T94 : 'paddingBottom:' ;
T95 : 'paddingLeft:' ;
T96 : 'paddingRight:' ;
T97 : 'paddingTop:' ;
T98 : 'scrollbars:' ;
T99 : 'visibility:' ;
T100 : 'animation:' ;
T101 : 'orientation:' ;
T102 : 'relative' ;
T103 : 'tab' ;
T104 : 'tabWidget' ;
T105 : 'gravity:' ;
T106 : '|' ;
T107 : 'divider:' ;
T108 : 'tabStrip:' ;
T109 : 'tabStripLeft:' ;
T110 : 'tabStripRight:' ;
T111 : 'frame' ;
T112 : 'textView:' ;
T113 : '<' ;
T114 : '>' ;
T115 : 'top:' ;
T116 : 'left:' ;
T117 : 'width:' ;
T118 : 'height:' ;
T119 : 'clickable:' ;
T120 : 'fadeScrollBars:' ;
T121 : 'isScrollContainer:' ;
T122 : 'autoLink:' ;
T123 : 'autoText:' ;
T124 : 'capitalize:' ;
T125 : 'digits:' ;
T126 : 'editable:' ;
T127 : 'hint:' ;
T128 : 'numeric:' ;
T129 : 'password:' ;
T130 : 'phoneNumber:' ;
T131 : 'singleLine:' ;
T132 : 'textColor:' ;
T133 : 'typeface:' ;
T134 : 'textSize:' ;
T135 : 'textStyle:' ;
T136 : 'imageView:' ;
T137 : 'button:' ;
T138 : 'image:' ;
T139 : 'link:' ;
T140 : 'to' ;
T141 : 'spinner:' ;
T142 : 'editText:' ;
T143 : 'string' ;
T144 : '=' ;
T145 : 'integer' ;
T146 : 'bool' ;
T147 : 'color' ;
T148 : 'dimension' ;
T149 : 'array' ;
T150 : '(integer)' ;
T151 : '[' ;
T152 : ']' ;
T153 : ',' ;
T154 : '(string)' ;
T155 : 'bitmap' ;
T156 : 'transition' ;
T157 : '<->' ;
T158 : 'menu' ;
T159 : 'item' ;
T160 : 'group' ;
T161 : 'submenu' ;
T162 : 'set' ;
T163 : 'fade:' ;
T164 : 'from' ;
T165 : 'scale:' ;
T166 : 'translate:' ;
T167 : 'rotate:' ;
T168 : 'tweenAnimation' ;
T169 : 'frameAnimation' ;
T170 : 'frame:' ;
T171 : '->' ;
T172 : '@string' ;
T173 : '@integer' ;
T174 : '@bool' ;
T175 : '@color' ;
T176 : '@dimen' ;
T177 : '@drawable' ;
T178 : '@anim' ;
T179 : '@interpolator' ;
T180 : '.' ;
T181 : 'shared' ;
T182 : 'oneShot' ;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 44061
RULE_BOOL : ('TRUE'|'FALSE');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 44063
RULE_FLOAT : RULE_INT '.' RULE_INT;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 44065
RULE_HEX_COLOR : '#' ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') (('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f'))?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 44067
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 44069
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 44071
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 44073
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 44075
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 44077
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 44079
RULE_ANY_OTHER : .;


