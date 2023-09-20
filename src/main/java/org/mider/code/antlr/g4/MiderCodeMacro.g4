grammar MiderCodeMacro;



macro_expr: '(' macro_body ')' ;

macro_body
    : macro_define
    | macro_define_expand
    | macro_comment
    | macro_repeat
    | macro_ifdef
    | macro_callable
    | macro_callable_expand
    | macro_velocity
    ;

macro_define:
      'def ' MacroSymbolID '=' macro_common_content  # macro_define_expr
    | 'def ' MacroSymbolID ':' macro_common_content  # macro_define_exec_expr
    | 'def ' MacroSymbolID                           # macro_define_empty_expr
    ;

macro_define_expand: '=' MacroSymbolID;

macro_comment:
      '# '  MacroCommentContent*
    | '#'  MacroCommentContent*
    ;

macro_repeat:
      'repeat ' MacroSymbolID ' ' MacroInteger ':' macro_common_content
    ;

macro_ifdef:
      'ifdef ' MacroSymbolID ':' macro_common_content
    | 'if!def ' MacroSymbolID ':' macro_common_content
    ;

macro_callable:
      'macro ' MacroSymbolID ' ' macro_callable_params ':' macro_callable_body
    ;

macro_callable_params:
      MacroSymbolID
    | MacroSymbolID ',' macro_callable_params
    ;

macro_callable_body:
      macro_common_content
    ;

macro_callable_expand:
      '!' MacroSymbolID ' ' macro_callable_real_params
    ;

macro_callable_real_params:
      'NOTE'
    | 'NOTE' ',' macro_callable_real_params
    ;

macro_velocity:
      'velocity ' macro_velocity_curve_option ' ' MacroInteger '~' MacroInteger ':' macro_common_content
      'velocity ' MacroInteger '~' MacroInteger ':' macro_common_content
    ;

macro_velocity_curve_option:
      'linear'
    ;

macro_common_content:
      ' '
    | macro_body
    ;



MacroInteger: [1-9]*[0-9]+;
MacroSymbolID: [A-Za-z_]([0-9][A-Za-z_])+;
MacroCommentContent: . ;
MacroWhitespace : [ \t\r\n]+ -> skip ;
