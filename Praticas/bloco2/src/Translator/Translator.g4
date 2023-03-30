grammar Translator;

program: stat* EOF;

stat: Num '-' Word NEWLINE;


Word: [a-zA-Z]+;
Num: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '//' .*? '\n' -> skip;