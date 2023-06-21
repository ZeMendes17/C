grammar FracLang;

program: (command? ';')* EOF;

command: 
		print		
	|	assignment	
	;

print: 'display' expression;

assignment: ID '<=' expression;

expression:
		op=('+'|'-') expression				#UnaryExpr
	|	expression op=('*'|':') expression	#MultDivExpr
	|	expression op=('+'|'-') expression	#SumSubExpr
	|	'(' expression ')'					#ParentExpr
	|	'read' STRING						#ReadExpr
	|	'reduce' expression					#ReduceExpr
	|	FRACTION							#FractionExpr
	|	ID									#IdExpr
	;

FRACTION: [0-9]+ ('/' [0-9]+)?;
ID: [a-z]+;
STRING: '"' .*? '"';
WS: [ \t\r\n] -> skip;
COMMENT: '--' .*? '\n' -> skip;
ERROR: .;