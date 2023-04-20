grammar Calculator;

program: stat* EOF;

stat:   expr? NEWLINE                   #StatExpr
    |   assignment? NEWLINE             #StatAssign
;


assignment: ID '=' expr;

expr:
        '-' expr                        #ExprMinus
    |   '+' expr                        #ExprPlus
    |   expr op=('*' | '/' | '%') expr  #ExprMultDivMod
    |   expr op=('+' | '-') expr        #ExprSumDiv
    |   Integer                         #ExprInteger
    |   ID                              #ExprID
    |   '(' expr ')'                    #ExprParent
;

Integer: [0-9]+;
ID: [a-zA-Z_]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '//' .*? '\n' -> skip; 