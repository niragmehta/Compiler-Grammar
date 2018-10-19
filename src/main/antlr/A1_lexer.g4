lexer grammar A1_lexer;

Class:'class';
Program:'program';

Type
: 'int'
| 'boolean';

Id
: Alpha Alpha_num*;

If:'if';
Else:'else';
Switch:'switch';
Case:'case';
While:'while';
Return:'return';
Break:'break';
Continue:'continue';

//Brackets
OpenBracket
:'{';
CloseBracket
:'}';

//Parenthesis
OpenParenthesis
: '(' ;
CloseParenthesis
:')';

OpenSquare
: '[';

CloseSquare
: ']';

Void
: 'void';

Newline: '\r'? '\n' ->skip ;

WhiteSpace: [ \t]+ -> skip ;

Bin_op
: Arith_op
| Rel_op
| Eq_op
| Cond_op;

Assign_op
: '='
| '+='
| '-=';

Comma
: ',';

Semicolon
:';';

Arith_op
: '+'
| '-'
| '*'
| '/'
| '%';

Rel_op
: '<'
| '>'
| '<='
| '>=';

Eq_op
: '=='
| '!=';

Cond_op
: '&&'
| '||';

fragment Alpha
: [a-zA-Z];

fragment Alpha_num
: Alpha
| Digit;

Int_literal
: Decimal_literal
| Hex_literal;

Hex_digit
: Digit
| [a-fA-F];

Hex_literal
: '0' 'x' Hex_digit+;

Digit
: [0-9];

Decimal_literal
: Digit+;

Bool_literal
: True
| False;

True:'true';
False:'false';

Char_literal
: '\''Char'\'';

String_literal
: '"'Char*?'"';

fragment Char: (.);

