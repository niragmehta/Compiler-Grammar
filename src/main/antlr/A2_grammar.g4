grammar A2_grammar;


@header {
import java.io.*;
}

@parser::members{
public class Graph {

    private Node root;

    public Graph() {
    }

    public Node GetRoot(){

        return root;
    }


    public Node addRoot(String str){
        root = new Node(str);
        return root;
    }

};

public class Node {

    private String name;
    private List<Node> edges;

    public Node(String string) {
        name = string;
        edges = new ArrayList<Node>();
    }

    public void addEdge(Node node){
        edges.add(node);
    }

    public String getName() {
        return name;
    }

    public List<Node> getEdges() {
        return edges;
    }
};

}

//prog
//:'class Program {'field_decl* method_decl*'}';

prog
:'class Program {'field_declarations method_declarations'}';

field_declarations:
field_decl field_declarations
|
;
method_declarations:
method_decl method_declarations
|
;

//field_decl
//: Type (Ident | Ident'['int_literal']') ';'
//| Type (Ident | Ident'['int_literal']')
//| field_decl ( ',' Ident | Ident'['int_literal']') ';'
//| Type Ident '=' literal SemiColon ;

field_decl
: Type (Ident | Ident'['int_literal']') ';'
| Type Ident '=' literal SemiColon
| Type (Ident | Ident'['int_literal']')
| temp field_decl
| (',' Ident| Ident'['int_literal']') SemiColon
;
temp:
',' Ident
| Ident'['int_literal']'
;

//method_decl
//: (Type | 'void') Ident'('( (Type Ident) ( ','Type Ident)*)? ')'block;

method_decl
: (Type | 'void') Ident'(' tempParam ')'block;

tempParam
: (Type Ident)
| (Type Ident) tempParam
| ( ','Type Ident)
|
;

//block
//: '{'var_decl* statement*'}';

block
: '{'var_decl_temp statements'}';

var_decl_temp:
var_decl var_decl_temp
|
;

//var_decl
//: Type Ident(','Ident)* ';'

var_decl
: Type Ident var_decl_extra ';';

var_decl_extra:
','Ident var_decl_extra
|
;

statement
: location ('='|'+='|'-=') expr SemiColon
| method_call';'
| 'if' OParen'expr' CParen block ('else' block  )?
| 'switch' expr '{'('case' literal ':' statement*)+'}'
| 'while' OParen expr CParen statement
| 'return' (expr)? SemiColon
| 'break' SemiColon
| 'continue' SemiColon
| block;

statements:
statement statements
|
;

expr
: location
| method_call
| literal
| expr binOp expr
| '-' expr
| '!' expr
| '(' expr ')';

//method_call
//: method_name '(' (expr ( ',' expr )*)? ')'
//| Callout '(' Str ( ',' callout_arg )* ')';

method_call
: method_name '(' (expr methodArgs)? ')'
| Callout '(' Str calloutArgs ')';

methodArgs:
( ',' expr ) methodArgs
|
;

calloutArgs:
( ',' callout_arg ) calloutArgs
|
;

callout_arg
: expr
| Str;

method_name
: Ident;

location
: Ident
| Ident '[' expr ']';

literal
: int_literal
| Char
| BoolLit;

binOp:
ArithOp |
Relop |
AssignOp|
CondOp
;

int_literal:
Num |
HexNum
;

//Everything below this is lexer grammar
/////////////////////////////////////////////////////////////

fragment Delim
: ' '
| '\t'
| '\n'
;

fragment Letter
: [a-zA-Z]
;

fragment Digit
: [0-9]
;

fragment HexDigit
: Digit
| [a-f]
| [A-F]
;

fragment Alpha
: Letter
| '_'
;

fragment AlphaNum
: Alpha
| Digit
;


WhiteSpace
: Delim+ -> skip
;


Char
: '\'' ~('\\') '\''
| '\'\\' . '\''
;

Str
:'"' ((~('\\' | '"')) | ('\\'.))* '"'
;

Class
: 'class'
;

Program
: 'Program'
;

Void
: 'Void'
;

If
: 'if'
;

Else
: 'else'
;

While
: 'while'
;

Switch
: 'switch'
;

Case
: 'case'
;

Ret
: 'return'
;

Brk
: 'break'
;

Cnt
: 'continue'
;

Callout
: 'callout'
;

Num
: Digit+
;

HexNum
: '0x'HexDigit+
;

BoolLit
: 'true'
| 'false'
;

Type
: 'int'
| 'boolean'
;


Ident
: Alpha AlphaNum*
;


Relop
: '<='
| '>='
| '<'
| '>'
| '=='
| '!='
;

AssignOp
: '='
| '+='
| '-='
;

ArithOp
: '+'
| '-'
| '*'
| '/'
| '%'
;

CondOp
: '&&'
| '||'
| '!'
;

OParen
: '('
;

CParen
: ')'
;

OBrace
: '{'
;

CBrace
: '}'
;

OBracket
: '['
;

CBracket
: ']'
;

SemiColon
: ';'
;

Comma
: ','
;



