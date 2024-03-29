grammar MiniSql;

@header {
package interpreter.antlrparser;
}

@members {
    //added component of generated class
}



literal:
    STRING_LITERAL
    | INT_LITERAL
    | FLOAT_LITERAL
    ;

//identifier:
//    INT_LITERAL
//    | type_identifier
//    ;

INT_LITERAL: [+-]? DIGIT+;
FLOAT_LITERAL: [+-]? DIGIT* '.'? DIGIT+;

STRING_LITERAL:
    '\'' (DIGIT | [a-zA-Z:/\\_.~\- \t] | '[' | ']' | '(' | ')' | '&')* '\''
    ;

DIGIT:
    [0-9]
    ;

CREATE:
    'create'
    | 'CREATE';

TABLE:
    'table'
    | 'TABLE'
    ;

PRIMARY:
    'primary'
    | 'PRIMARY'
    ;

KEY:
    'key'
    | 'KEY'
    ;

UNIQUE:
    'unique'
    | 'UNIQUE'
    ;

INT:
    'int'
    | 'INT'
    ;

CHAR:
    'char'
    | 'CHAR'
    ;

FLOAT:
    'float'
    | 'FLOAT'
    ;

DROP:
    'drop'
    | 'DROP'
    ;

INDEX:
    'index'
    | 'INDEX'
    ;

ON:
    'on'
    | 'ON'
    ;

SELECT:
    'select'
    | 'SELECT'
    ;

WHERE:
    'where'
    | 'WHERE'
    ;

FROM:
    'FROM'
    | 'from'
    ;

AND:
    'and'
    | 'AND'
    ;

INSERT:
    'insert'
    | 'INSERT'
    ;

INTO:
    'into'
    | 'INTO'
    ;

DELETE:
    'delete'
    | 'DELETE'
    ;

VALUES:
    'values'
    | 'VALUES'
    ;

QUIT:
    'quit'
    | 'QUIT'
    ;

EXECFILE:
    'execfile'
    | 'EXECFILE'
    ;

OP:
    EQUAL
    | NOT_EQUAL
    | GREATER
    | LESS
    | GREATER_OR_EQUAL
    | LESS_OR_EQUAL
    ;

EQUAL:
    '='
    ;

NOT_EQUAL:
    '<>'
    ;

GREATER:
    '>'
    ;

LESS:
    '<'
    ;

GREATER_OR_EQUAL:
    '>='
    ;

LESS_OR_EQUAL:
    '<='
    ;

NAME_IDENTIFIER:
    [a-zA-Z][a-zA-Z0-9_]*
    ;

type_identifier:
    INT # intType
    | FLOAT # floatType
    | CHAR '(' INT_LITERAL  ')' # charNType
    ;

WHITE_SPACE: [ \t\r\n]+ -> skip;

LINE_COMMENT: ('--'| '#') ~[\r\n]* -> skip;

COMMENT: '/*' .*? '*/' -> skip;

instructionWrap:
    instruction EOF
    ;

instruction:
    createTable
    | dropTable
    | createIndex
    | dropIndex
    | selectInstruction
    | insertTuple
    | deleteTuple
    | quit
    | executeFile
    | EOF
    ;

createTable:
    CREATE TABLE NAME_IDENTIFIER '('
        (columnDefinition ',')+
        primaryKeyDefinition
    ')'
    ;

primaryKeyDefinition:
    PRIMARY KEY '(' NAME_IDENTIFIER ')'
    ;

columnDefinition:
    NAME_IDENTIFIER type_identifier UNIQUE?
    ;


dropTable:
    DROP TABLE NAME_IDENTIFIER
    ;

createIndex:
    CREATE INDEX NAME_IDENTIFIER ON NAME_IDENTIFIER '(' NAME_IDENTIFIER ')'
    ;

dropIndex:
    DROP INDEX NAME_IDENTIFIER ON NAME_IDENTIFIER
    ;

selectInstruction:
    SELECT '*' FROM NAME_IDENTIFIER (WHERE conditions)? # selectAll
    | SELECT columnNames FROM NAME_IDENTIFIER (WHERE conditions)? # selectColumns
    ;

columnNames:
    (NAME_IDENTIFIER ',')* NAME_IDENTIFIER
    ;

condition:
    NAME_IDENTIFIER OP literal
    ;

insertTuple:
    INSERT INTO NAME_IDENTIFIER VALUES '(' (literal ',')* literal ')'
    ;


deleteTuple:
    DELETE FROM NAME_IDENTIFIER ( WHERE conditions )?
    ;

conditions:
    (condition 'and')* condition
    ;

quit:
    QUIT
    ;

executeFile:
    EXECFILE STRING_LITERAL
    ;
