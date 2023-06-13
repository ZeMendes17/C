grammar StrLang;

program: stat* EOF;

stat:   display
    |   assignment
    ;


display: 'print' expression;

assignment: ID ':' expression;

expression: 
                STRING
            |   ID
            ;


ID: [a-zA-Z][a-zA-Z0-9]*;
STRING: '"' .*? '"';
COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip;
ERROR: .;