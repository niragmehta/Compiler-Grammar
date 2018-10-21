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
    private List<Node> edges ;

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

    public void printName(){
        System.out.println(name);
    }
};

}

//prog
//:'class Program {'field_decl* method_decl*'}';

prog
:'class Program {'field_declarations method_declarations'}'
{
    Graph g = new Graph();
    Node root  = g.addRoot("program");

    root.addEdge($field_declarations.node);
    root.addEdge($method_declarations.node);

};

field_declarations returns [Node node]:
field_declaration field_declarations
{
    $node = new Node("field_declarations");
    $node.addEdge($field_declaration.node);
}
|
;

method_declarations returns [Node node]:
method_decl method_declarations
{
    $node = new Node("method_declarations");
    $node.addEdge($method_decl.node);
}
|
;

//field_decl
//: Type (Ident | Ident'['int_literal']') ';'
//| Type (Ident | Ident'['int_literal']')
//| field_decl ( ',' Ident | Ident'['int_literal']') ';'
//| Type Ident '=' literal SemiColon ;

field_declaration returns [Node node]:
 Type Ident ';'
 {
    $node = new Node("field_declaration");
    Node node1 = new Node($Type.text);
    Node node2 = new Node($Ident.text);
    Node node3 = new Node(";");

    $node.addEdge(node1);
    $node.addEdge(node2);
    $node.addEdge(node3);

 }
| Type Ident'['int_literal']' ';'
{
    $node = new Node("field_declaration");
    Node node1 = new Node($Type.text);
    Node node2 = new Node($Ident.text);
    Node node3 = new Node("[");
    Node node4 = new Node("]");
    Node node5 = new Node(";");

    $node.addEdge(node1);
    $node.addEdge(node2);
    $node.addEdge(node3);
    $node.addEdge($int_literal.node);
    $node.addEdge(node4);
    $node.addEdge(node5);

}
| Type Ident '=' literal SemiColon
{
    $node = new Node("field_declaration");
    Node node1 = new Node($Type.text);
    Node node2 = new Node($Ident.text);
    Node node3 = new Node("=");
    Node node4 = new Node(";");

    $node.addEdge(node1);
    $node.addEdge(node2);
    $node.addEdge(node3);
    $node.addEdge($literal.node);
    $node.addEdge(node4);
}
| Type Ident
{
    $node = new Node("field_declaration");

    Node node1 = new Node($Type.text);
    Node node2 = new Node($Ident.text);
    $node.addEdge(node1);
    $node.addEdge(node2);
}
| Type Ident'['int_literal']'
{
    $node = new Node("field_declaration");

    Node node1 = new Node($Type.text);
    Node node2 = new Node($Ident.text);
    Node node3 = new Node("[");
    Node node4 = new Node("]");

    $node.addEdge(node1);
    $node.addEdge(node2);
    $node.addEdge(node3);
    $node.addEdge($int_literal.node);
    $node.addEdge(node4);
}
| multi_declaration field_declaration
{
    $node = new Node("field_declaration");

   $node.addEdge($multi_declaration.node);
   $node.addEdge($field_declaration.node);
}
| (',' Ident ';')
{
    $node = new Node("field_declaration");

    Node node1 = new Node(",");
    Node node2 = new Node($Ident.text);
    Node node3 = new Node(";");

     $node.addEdge(node1);
     $node.addEdge(node2);
     $node.addEdge(node3);

}
| ',' Ident'['int_literal']' ';'
{
    $node = new Node("field_declaration");

    Node node1 = new Node(",");
    Node node2 = new Node($Ident.text);
    Node node3 = new Node("[");
    Node node4 = new Node("]");
    Node node5 = new Node(";");

    $node.addEdge(node1);
    $node.addEdge(node2);
    $node.addEdge(node3);
    $node.addEdge($int_literal.node);
    $node.addEdge(node4);
    $node.addEdge(node5);
}
;

//multi declaration
multi_declaration returns [Node node]:
',' Ident
{
    $node = new Node("multi_declaration");
    Node node1 = new Node(",");
    Node node2 = new Node($Ident.text);
    $node.addEdge(node1);
    $node.addEdge(node2);
}
| Ident'['int_literal']'
{
    $node = new Node("multi_declaration");
    Node node1 = new Node($Ident.text);
    Node node2 = new Node("[");
    Node node3 = new Node("]");
    $node.addEdge(node1);
    $node.addEdge(node2);
    $node.addEdge($int_literal.node);
    $node.addEdge(node3);
}
;

//method_decl
//: (Type | 'void') Ident'('( (Type Ident) ( ','Type Ident)*)? ')'block;

method_decl returns [Node node]
: Type Ident'(' methodParam ')'block
{
    $node = new Node("method_decl");

    Node node1 = new Node($Type.text);
    Node node2 = new Node($Ident.text);
    Node node3 = new Node("(");
    Node node4 = new Node(")");
    $node.addEdge(node1);
    $node.addEdge(node2);
    $node.addEdge(node3);
    $node.addEdge($methodParam.node);
    $node.addEdge(node4);
    $node.addEdge($block.node);

}
| Void Ident'(' methodParam ')'block
{
    $node = new Node("method_decl");
    Node node1 = new Node($Void.text);
    Node node2 = new Node("void");
    Node node3 = new Node("(");
    Node node4 = new Node(")");

    $node.addEdge(node1);
    $node.addEdge(node2);
    $node.addEdge(node3);
    $node.addEdge($methodParam.node);
    $node.addEdge(node4);
    $node.addEdge($block.node);

};

methodParam returns [Node node]
:(Type Ident)
{
    $node = new Node("methodParam");
    $node.addEdge(new Node($Type.text));
    $node.addEdge(new Node($Ident.text));
}
| (Type Ident) methodParam
{
    $node = new Node("methodParam");
    $node.addEdge(new Node($Type.text));
    $node.addEdge(new Node($Ident.text));
}
| ( ','Type Ident)
{
    $node = new Node("methodParam");
    $node.addEdge(new Node(","));
    $node.addEdge(new Node($Type.text));
    $node.addEdge(new Node($Ident.text));
}
|
;

//block
//: '{'var_decl* statement*'}';

block returns [Node node]
: '{'multi_var_decl statements'}'
{
    $node = new Node("block");
    $node.addEdge(new Node("{"));
    $node.addEdge($multi_var_decl.node);
    $node.addEdge($statements.node);
    $node.addEdge(new Node("}"));
};

multi_var_decl returns [Node node]
:var_decl multi_var_decl
{
    $node = new Node("multi_var_decl");
    $node.addEdge($var_decl.node);
    $node.addEdge($multi_var_decl.node);
}
|
;

//var_decl
//: Type Ident(','Ident)* ';'

var_decl returns [Node node]
: Type Ident var_decl_extra ';'
{
    $node = new Node("multi_var_decl");
    $node.addEdge(new Node($Type.text));
    $node.addEdge(new Node($Ident.text));
    $node.addEdge($var_decl_extra.node);
    $node.addEdge(new Node(";"));

};

var_decl_extra returns [Node node]
:','Ident var_decl_extra
{
    $node = new Node("var_decl_extra");

    $node.addEdge(new Node(","));
    $node.addEdge(new Node($Ident.text));
    $node.addEdge($var_decl_extra.node);
}
|
;

statement returns [Node node]
: location ('='|'+='|'-=') expr SemiColon
| method_call';'
| 'if' OParen'expr' CParen block ('else' block  )?
| 'switch' expr '{'('case' literal ':' statement*)+'}'
| 'while' OParen expr CParen statement
| 'return' (expr)? SemiColon
| 'break' SemiColon
| 'continue' SemiColon
| block;

statements returns [Node node]
:statement statements
{
    $node = new Node("statements");
    $node.addEdge($statement.node);
    $node.addEdge($statements.node);
}
|
;

expr returns [Node node]
: location
{
   $node = new Node("expr");
   $node.addEdge($expr.node);
}
| method_call
{
   $node = new Node("expr");
   $node.addEdge($method_call.node);
}
| literal
{
   $node = new Node("expr");
   $node.addEdge($literal.node);
}
| expr binOp expr
{
   $node = new Node("expr");
   $node.addEdge($expr.node);
   $node.addEdge($binOp.node);
   $node.addEdge($expr.node);
}
| '-' expr
{
   $node = new Node("expr");
   $node.addEdge(new Node("-"));
   $node.addEdge($expr.node);
}
| '!' expr
{
   $node = new Node("expr");
   $node.addEdge(new Node("!"));
   $node.addEdge($expr.node);
}
| '(' expr ')'
{
   $node = new Node("expr");
   $node.addEdge(new Node("("));
   $node.addEdge($expr.node);
   $node.addEdge(new Node(")"));
};

//method_call
//: method_name '(' (expr ( ',' expr )*)? ')'
//| Callout '(' Str ( ',' callout_arg )* ')';

method_call returns [Node node]
: method_name '(' (expr methodArgs)? ')'
{
    $node = new Node("method_call");

}
| Callout '(' Str calloutArgs ')'
{
    $node = new Node("method_call");
};

methodArgs returns [Node node]
:( ',' expr ) methodArgs
|
;

calloutArgs returns [Node node]
:( ',' callout_arg ) calloutArgs
|
;

callout_arg returns [Node node]
: expr
| Str;

method_name returns [Node node]
: Ident;

location returns [Node node]
: Ident
| Ident '[' expr ']';

literal returns [Node node]
: int_literal
| Char
| BoolLit;

binOp returns [Node node]:
ArithOp |
Relop |
AssignOp|
CondOp
;

int_literal returns [Node node]:
Num |
HexNum
;


/////////////////////////////////////////////////////////////
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



