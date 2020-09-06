grammar Javaplusplus;

program: class_declaration EOF;

class_declaration: 'class' IDENTIFIER C_SBRACKET body C_EBRACKET;
body: (var_init | func_init)*;

var_init: VAR_TYPE IDENTIFIER ('=' expression)? SEMICOLON;
func_init: func_type IDENTIFIER SBRACKET func_vars? EBRACKET C_SBRACKET block (return_statement SEMICOLON)? C_EBRACKET;

expression:
     left=expression op=('*'|'/') right=expression        # MultiplicativeExpression
     | left=expression op=('+'|'-') right=expression        # AdditiveExpression
     | left=expression comp=COMPARATORS right=expression    # ComparatorExpression
     | left=expression binary=AND_OR right=expression       # BinaryExpression
     | func_call                                            # ExMethodInvocation
     | ask                                                  # AskExpression
     | IDENTIFIER                                           # ExIdentifier
     | IDENTIFIER '=' expression                            # ExEqualsExpression
     | IDENTIFIER op=INC_DEC                                # UnaryExpression
     | BOOL                                                 # BoolExpression
     | INT                                                  # ExIntLiteral
     | STRING                                               # ExStrLiteral
       ;
func_vars: func_var (COMMA func_var)*;
block: statement*;

statement: var_init | func_call SEMICOLON| loop | print SEMICOLON | check | expression SEMICOLON;

func_type: 'void' | VAR_TYPE;
return_statement: ('return' expression);
func_var: VAR_TYPE IDENTIFIER ('=' expression)?;
ask: 'ask' SBRACKET VAR_TYPE EBRACKET;
check: 'check' SBRACKET expression EBRACKET C_SBRACKET block C_EBRACKET;
loop: 'loop' SBRACKET expression EBRACKET C_SBRACKET block C_EBRACKET;
print: 'dump' SBRACKET IDENTIFIER EBRACKET;

func_call: IDENTIFIER SBRACKET params? EBRACKET ;

params: (expression (COMMA expression)*);
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