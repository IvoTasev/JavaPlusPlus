grammar Javaplusplus;

program: expression* EOF;
expression: print | variable_init | function_call | check | function_decl | loop | ask ;

variable_init: VAR_TYPE? var_name '=' (value SEMICOLON | function_call | ask) | VAR_TYPE var_name SEMICOLON ; // variable declaration
variable_method_init: VAR_TYPE var_name (COMMA VAR_TYPE var_name)*; // variable init for methods (methods, etc)

function_decl: return_type var_name SBRACKET variable_method_init* EBRACKET C_SBRACKET expression* ('return' value)? SEMICOLON C_EBRACKET; // function declaration
function_call: var_name SBRACKET (value (COMMA value)*)* EBRACKET SEMICOLON; //function call
function_call_method: var_name SBRACKET (value (COMMA value)*)* EBRACKET; //function call


loop: 'loop' (SBRACKET variable_init var_name COMPARATORS (var_name | INT) SEMICOLON (var_name'++')? EBRACKET C_SBRACKET expression* C_EBRACKET //regular for
     | SBRACKET var_name COMPARATORS (var_name | INT) (AND_OR var_name COMPARATORS (var_name | INT))* EBRACKET C_SBRACKET expression* C_EBRACKET); //for with boolean

print: 'dump' SBRACKET (value | function_call_method) EBRACKET SEMICOLON; //print function
check: 'check' SBRACKET comparable_statement (AND_OR comparable_statement)* EBRACKET C_SBRACKET expression* C_EBRACKET ('otherwise' C_SBRACKET expression* C_EBRACKET)?; //if statement
ask: 'ask' SBRACKET VAR_TYPE EBRACKET SEMICOLON;



comparable_statement: comparables (COMPARATORS (comparables))*;

return_type: 'void' | VAR_TYPE;
comparables: function_call | var_name | INT;
value: (INT | STRING | BOOL ) (MATH_OPERATORS INT | STRING | BOOL)*;
var_name: STRING;

MATH_OPERATORS: '+'| '-'| '*'| '/';
COMPARATORS: '<' | '>' | '<=' | '>=' | '==' | '!=';
AND_OR: '&&' | '||';
SEMICOLON: ';';
INT: [0-9]+;
BOOL: 'true' | 'false';
COMMA: ',';
SBRACKET: '(';
EBRACKET: ')';
C_SBRACKET: '<<';
C_EBRACKET: '>>';
VAR_TYPE: 'int' | 'bool' | 'String';
STRING: CHAR+;
CHAR: [a-zA-Z0-9];


WS: [ \r\n\t]+ -> skip;

/*
int f(int value)<<
    return value+24;
>>

int number = ask(int);

loop(number <= 2 && number >= 10)<<
	number = ask(int);
>>

loop(int i = 0; i < number; i++)<<
	check (i < 5)<<
		dump(f(i));
	>> otherwise <<
		dump(i);
	>>
>>
dump(Done);

*/