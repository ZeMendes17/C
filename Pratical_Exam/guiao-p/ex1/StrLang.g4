grammar StrLang;

program: stat* EOF;

stat:   display
    |   assignment
    ;


display: 'print' expression;

assignment: ID ':' expression;

expression: 
            'input' '(' STRING ')'                              #InputExpr
        |   'trim' STRING                                       #TrimExpr
        |   expression '/' expression '/' expression            #ReplaceExpr
        |   expression op=('+'|'-') expression                  #ConcatRemvExpr
        |   '(' expression ')'                                  #ParenExpr
        |   STRING                                              #StringExpr
        |   ID                                                  #IdExpr
        ;


ID: [a-zA-Z][a-zA-Z0-9]*;
STRING: '"' .*? '"';
COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip;
ERROR: .;