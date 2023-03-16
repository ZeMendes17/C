grammar PrefixCalculator;

program: stat* EOF; // Zero or more repetition of stat

stat: expr? NEWLINE; // Optative expr followed by am end-of-line

expr:
        op=('*' | '/' | '+' | '-') expr expr    #ExprSuffix
    |   Number                                  #ExprNumber
;

Number: [0-9]+('.'[0-9]+)?; // fixed point real number
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;