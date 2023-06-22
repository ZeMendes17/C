grammar StrLang;

program: command*;

command: 
		display
	|	assignment
	;

display: 'print' expression;

assignment: ID ':' expression;

expression:
		STRING										#StringExpr
	|	ID											#IdExpr
	|	expression op=('+'|'-') expression			#OpExpr
	|	'trim' expression								#TrimExpr
	|	'(' expression ')'							#ParentExpr
	|	expression '/' expression '/' expression	#SubExpr
	|	'input' '(' STRING ')'						#InputExpr
	;

ID: [a-z][a-z0-9]*;
STRING: '"' .*? '"';
COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\r\n] -> skip;
ERROR: .;