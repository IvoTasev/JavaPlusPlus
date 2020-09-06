grammar Javaplusplus;

program: class_declaration EOF;

class_declaration: 'class' IDENTIFIER C_SBRACKET body C_EBRACKET;
body: (var_init | func_init)*;

var_init: VAR_TYPE IDENTIFIER ('=' expression_cmp)? SEMICOLON;
func_init: func_type IDENTIFIER SBRACKET func_vars? EBRACKET C_SBRACKET block (return_statement SEMICOLON)? C_EBRACKET;

expression:
     left=expression_cmp op=('*'|'/') right=expression_cmp          # MultiplicativeExpression
     | left=expression_cmp op=('+'|'-') right=expression_cmp        # AdditiveExpression
     | left=expression_cmp comp=COMPARATORS right=expression_cmp    # ComparatorExpression
     | left=expression_cmp binary=AND_OR right=expression_cmp       # BinaryExpression
     | func_call                                                    # ExMethodInvocation
     | ask                                                          # AskExpression
     | IDENTIFIER                                                   # ExIdentifier
     | IDENTIFIER '=' expression                                    # ExEqualsExpression
     | IDENTIFIER op=INC_DEC                                        # UnaryExpression
     ;

expression_cmp:
     left=expression_cmp op=('*'|'/') right=expression_cmp
     | left=expression_cmp op=('+'|'-') right=expression_cmp
     | left=expression_cmp comp=COMPARATORS right=expression_cmp
     | left=expression_cmp binary=AND_OR right=expression_cmp
     | func_call
     | ask
     | IDENTIFIER
     | IDENTIFIER '=' expression
     | IDENTIFIER op=INC_DEC
     | BOOL
     | INT
     | STRING
     ;

func_vars: func_var (COMMA func_var)*;
block: statement *;

statement: var_init | func_call SEMICOLON| loop | print SEMICOLON | check | expression SEMICOLON;
func_type: 'void' | VAR_TYPE;
return_statement: ('return' expression_cmp);
func_var: VAR_TYPE IDENTIFIER ('=' expression_cmp)?;
ask: 'ask' SBRACKET VAR_TYPE EBRACKET;
check: 'check' SBRACKET expression_cmp EBRACKET C_SBRACKET block C_EBRACKET;
loop: 'loop' SBRACKET expression_cmp EBRACKET C_SBRACKET block C_EBRACKET;
print: 'dump' SBRACKET IDENTIFIER EBRACKET;

func_call: IDENTIFIER SBRACKET params? EBRACKET ;

params: (expression_cmp (COMMA expression_cmp)*);
SPACE:[ \n\t\r] -> skip;


MATH_OPERATORS: '+'| '-'| '*'| '/';
COMPARATORS: '<' | '>' | '<=' | '>=' | '==' | '!=';
AND_OR: '&&' | '||';
SEMICOLON: ';';
INT: '0' | [1-9][0-9]*;
BOOL: 'true' | 'false';
COMMA: ',';
SBRACKET: '(';
EBRACKET: ')';
C_SBRACKET: '<<';
C_EBRACKET: '>>';
VAR_TYPE: 'int' | 'bool' | 'String' | 'auto' ;
STRING: '"' ~('\n'|'\r')* '"';
IDENTIFIER:CHAR+;
CHAR: [a-zA-Z0-9];
INC_DEC: '++' | '--';


/*

class xts<<
    int number = fzzxzxca(5);
    void foo()<<
        int a = fooo();
        loop(5)<<
            dump(ask(int));
            check(a < 3 && 3 > b)<<
            dump(ask(int));
            >>
        >>
    >>
    int f(int value)<<
        return value+24;
    >>
>>

*/