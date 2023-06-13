grammar FracLang;

program: statList EOF;

statList: (stat ';')*;

stat:
        show
    |   assign
    ;

show: 'display' expr;

assign: ID '<=' expr;

expr:
        unop=('+'|'-') expr         #UnaryExpr
    |   '(' expr ')'                #ParensExpr
    |   expr op=('*'|':') expr      #MulDivExpr
    |   expr op=('+'|'-') expr      #AddSubExpr
    |   INT '/' INT                 #FractionExpr
    |   ID                          #IdExpr
    |   INT                         #IntExpr
    ;


ID: [a-zA-Z][a-zA-Z0-9]*;
INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;
COMMENT: '--' ~[\r\n]* -> skip;
ERROR: .;