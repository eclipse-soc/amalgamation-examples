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
T68 : 'version:' ;
T69 : 'sdk:' ;
T70 : 'min:' ;
T71 : ';' ;
T72 : 'max:' ;
T73 : 'target:' ;
T74 : 'screen' ;
T75 : 'layout:' ;
T76 : '#' ;
T77 : 'listActivity' ;
T78 : 'data:' ;
T79 : 'item:' ;
T80 : 'tabActivity' ;
T81 : 'tab:' ;
T82 : 'icon:' ;
T83 : 'selectedIcon:' ;
T84 : 'activity:' ;
T85 : 'goTo' ;
T86 : 'show' ;
T87 : 'invoke' ;
T88 : 'layout' ;
T89 : 'alpha:' ;
T90 : 'background:' ;
T91 : 'minHeight:' ;
T92 : 'minWidth:' ;
T93 : 'nextFocusDown:' ;
T94 : 'nextFocusLeft:' ;
T95 : 'nextFocusRight:' ;
T96 : 'nextFocusUp:' ;
T97 : 'onClick:' ;
T98 : 'padding:' ;
T99 : 'paddingBottom:' ;
T100 : 'paddingLeft:' ;
T101 : 'paddingRight:' ;
T102 : 'paddingTop:' ;
T103 : 'scrollbars:' ;
T104 : 'visibility:' ;
T105 : 'animation:' ;
T106 : 'orientation:' ;
T107 : 'relative' ;
T108 : 'tab' ;
T109 : 'tabWidget' ;
T110 : 'gravity:' ;
T111 : '|' ;
T112 : 'divider:' ;
T113 : 'tabStrip:' ;
T114 : 'tabStripLeft:' ;
T115 : 'tabStripRight:' ;
T116 : 'frame' ;
T117 : 'height:' ;
T118 : 'width:' ;
T119 : 'weight:' ;
T120 : 'marginBottom:' ;
T121 : 'marginLeft:' ;
T122 : 'marginRight:' ;
T123 : 'marginTop:' ;
T124 : 'above:' ;
T125 : 'alignBaseline:' ;
T126 : 'alignBottom:' ;
T127 : 'alignLeft:' ;
T128 : 'alignParentBottom:' ;
T129 : 'alignParentLeft:' ;
T130 : 'alignParentRight:' ;
T131 : 'alignParentTop:' ;
T132 : 'alignTop:' ;
T133 : 'alignWithParentIfMissing:' ;
T134 : 'below:' ;
T135 : 'centerHorizontal:' ;
T136 : 'centerInParent:' ;
T137 : 'centerVertical:' ;
T138 : 'toLeftOf:' ;
T139 : 'toRightOf:' ;
T140 : 'textView:' ;
T141 : '<' ;
T142 : '>' ;
T143 : 'top:' ;
T144 : 'left:' ;
T145 : 'clickable:' ;
T146 : 'fadeScrollBars:' ;
T147 : 'isScrollContainer:' ;
T148 : 'autoLink:' ;
T149 : 'autoText:' ;
T150 : 'capitalize:' ;
T151 : 'digits:' ;
T152 : 'editable:' ;
T153 : 'hint:' ;
T154 : 'numeric:' ;
T155 : 'password:' ;
T156 : 'phoneNumber:' ;
T157 : 'singleLine:' ;
T158 : 'textColor:' ;
T159 : 'typeface:' ;
T160 : 'textSize:' ;
T161 : 'textStyle:' ;
T162 : 'imageView:' ;
T163 : 'button:' ;
T164 : 'to' ;
T165 : 'spinner:' ;
T166 : 'editText:' ;
T167 : 'string' ;
T168 : '=' ;
T169 : 'integer' ;
T170 : 'bool' ;
T171 : 'color' ;
T172 : 'dimension' ;
T173 : 'array' ;
T174 : '(integer)' ;
T175 : '[' ;
T176 : ']' ;
T177 : ',' ;
T178 : '(string)' ;
T179 : 'bitmap' ;
T180 : 'transition' ;
T181 : '<->' ;
T182 : 'menu' ;
T183 : 'item' ;
T184 : 'group' ;
T185 : 'submenu' ;
T186 : 'set' ;
T187 : 'fade:' ;
T188 : 'from' ;
T189 : 'scale:' ;
T190 : 'translate:' ;
T191 : 'rotate:' ;
T192 : 'tweenAnimation' ;
T193 : 'frameAnimation' ;
T194 : 'frame:' ;
T195 : '->' ;
T196 : '@string' ;
T197 : '@integer' ;
T198 : '@bool' ;
T199 : '@color' ;
T200 : '@dimen' ;
T201 : '@drawable' ;
T202 : '@anim' ;
T203 : '@interpolator' ;
T204 : '.' ;
T205 : 'shared' ;
T206 : 'oneShot' ;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 45027
RULE_BOOL : ('TRUE'|'FALSE');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 45029
RULE_FLOAT : RULE_INT '.' RULE_INT;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 45031
RULE_HEX_COLOR : '#' ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') (('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f'))?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 45033
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 45035
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 45037
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 45039
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 45041
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 45043
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.amalgam.tutorials.xtext.ui/src-gen/org/eclipse/amalgam/tutorials/xtext/ui/contentassist/antlr/internal/InternalDroid.g" 45045
RULE_ANY_OTHER : .;


