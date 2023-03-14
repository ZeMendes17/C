grammar Distance;

main: stat* EOF;

stat: expr #StatExpr;

expr:
        expr op=('*' | '/') expr #ExprMultDiv
      | expr op=('+' | '-') expr #ExprAddSub
      | '(' expr ')'             #ExprParents
      | distance                 #ExprDistance
      | Number                   #ExprNumber
      ;

distance: 'distance' point point;
point: '(' expr ',' expr ')';

Number: [0-9]+;
WS: [ \t\r\n]+ -> skip; 