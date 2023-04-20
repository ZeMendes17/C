grammar FractionCalc;

program: stat* EOF;

stat: ((write | assignment) ';');

write: 'print' expr;

assignment: expr '->' Var;

expr:
        '(' expr ')' '^' minus='-'? Integer #ExprPow
    |   '(' expr ')'                        #ExprParent
    |   '-' expr                            #ExprNegative
    |   Integer '/' Integer                 #ExprFraction
    |   'reduce' expr                       #ExprReduce
    |   'read'  String                      #ExprRead
    |   expr op=('*'|':') expr              #ExprMultDiv
    |   expr op=('+'|'-') expr              #ExprSumSub
    |   Integer                             #ExprInteger
    |   Var                                 #ExprVar
    ;

Integer: [0-9]+;
String: '"' .*? '"';
Var: [a-zA-Z_]+;
// NEWLINE: '\r'? '\n';
WS: [ \n\r\t]+ -> skip;
COMMENT: '//' .*? '\r'? '\n' -> skip;