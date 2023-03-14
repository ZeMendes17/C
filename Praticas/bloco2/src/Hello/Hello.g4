grammar Hello; // define a grammar called Hello
main : top* EOF;
top : greetings | bye;

greetings : 'hello' name; // match keyword hello followed by identifier
bye : 'bye' name;
name : ID+;

ID : [A-Za-z]+; // match lower-case identifiers
WS : [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines, \r (Windows)