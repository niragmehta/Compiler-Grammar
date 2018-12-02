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

}

public class Node {

    private String name;
    public List<Node> edges ;


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
    public void removeEdge(int i){
        edges.remove(i);
    }


    public void printName(){
        System.out.println(name);
    }


    public void printTree(int spaces)
    {
        if(this.edges.isEmpty() )
        {
            for(int i=0;i<=spaces;i++){
                System.out.print(" ");}
            System.out.print(this.getName()+"\n");
            return;
        }
        for(int i=0;i<=spaces;i++){
            System.out.print(" ");}
        System.out.print(this.getName()+"(\n");
        for(int i=0;i<this.edges.size();i++)
        {
            Node node = this.edges.get(i);

            if(node==null)
                continue;

            node.printTree(++spaces);
        }
        for(int i=0;i<spaces;i++){
                    System.out.print(" ");}
        System.out.print(")\n");
    }

}

}

prog
:'class' 'Program' '{' field_declaration method_declarations'}'
{
    Graph g = new Graph();
    Node root  = g.addRoot("program");
    root.addEdge($field_declaration.node);
    root.addEdge($method_declarations.node);
    int spaces=0;
    root.printTree(spaces);

};

//field_declarations returns [Node node]:
//field_declaration field_declarations
//{
//    $node = new Node("field_declarations");
//    $node.addEdge($field_declaration.node);
//}
//|
//;

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
 Type Ident SemiColon field_declaration
 {
    $node = new Node("field_declaration");

    $node.addEdge(new Node($Type.text));
    $node.addEdge(new Node($Ident.text));
//    $node.addEdge(new Node($SemiColon.text));
    $node.addEdge($field_declaration.node);

 }
| Type Ident'['int_literal']' SemiColon field_declaration
{
    $node = new Node("field_declaration");

    $node.addEdge(new Node($Type.text));
    $node.addEdge(new Node($Ident.text));
//    $node.addEdge(new Node("["));
    $node.addEdge($int_literal.node);
//    $node.addEdge(new Node("]"));
//    $node.addEdge(new Node($SemiColon.text));
    $node.addEdge($field_declaration.node);

}
| Type Ident ( '=' ) literal SemiColon field_declaration
{
    $node = new Node("field_declaration");

    $node.addEdge(new Node($Type.text));
    $node.addEdge(new Node($Ident.text));
    $node.addEdge(new Node("="));
    $node.addEdge($literal.node);
    $node.addEdge(new Node($SemiColon.text));
    $node.addEdge($field_declaration.node);
}
| Type Ident multi_declaration SemiColon field_declaration
{
    $node = new Node("field_declaration");

    $node.addEdge(new Node($Type.text));
    $node.addEdge(new Node($Ident.text));
    $node.addEdge($multi_declaration.node);
//    $node.addEdge(new Node($SemiColon.text));
    $node.addEdge($field_declaration.node);
}
| Type Ident'['int_literal']' multi_declaration SemiColon field_declaration
{
    $node = new Node("field_declaration");

    $node.addEdge(new Node($Type.text));
    $node.addEdge(new Node($Ident.text));
//    $node.addEdge(new Node("["));
    $node.addEdge($int_literal.node);
//    $node.addEdge(new Node("]"));
    $node.addEdge($multi_declaration.node);
//    $node.addEdge(new Node($SemiColon.text));
    $node.addEdge($field_declaration.node);
}
|
;

//multi declaration
multi_declaration returns [Node node]:
',' Ident
{
    $node = new Node("multi_declaration");
    Node node1 = new Node($Ident.text);
    $node.addEdge(node1);
}
| ',' Ident'['int_literal']'
{
    $node = new Node("multi_declaration");

//    $node.addEdge(new Node(","));
    $node.addEdge(new Node($Ident.text));
//    $node.addEdge(new Node("["));
    $node.addEdge($int_literal.node);
//    $node.addEdge(new Node("]"));
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
    $node.addEdge(node1);
    $node.addEdge(node2);
    $node.addEdge($methodParam.node);
    $node.addEdge($block.node);

}
| Void Ident'(' methodParam ')'block
{
    $node = new Node("method_decl");
    Node node1 = new Node($Void.text);
    Node node2 = new Node($Ident.text);

    $node.addEdge(node1);
    $node.addEdge(node2);
    $node.addEdge($methodParam.node);
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
    $node.addEdge(new Node($Type.text));
    $node.addEdge(new Node($Ident.text));
}
|
;

block returns [Node node]
: '{'var_decl statements'}'
{
    $node = new Node("block");
    $node.addEdge($var_decl.node);
    $node.addEdge($statements.node);
};

var_decl returns [Node node]
: Type Ident var_decl_extra ';'
{
    $node = new Node("var_decl");
    $node.addEdge(new Node($Type.text));
    $node.addEdge(new Node($Ident.text));
    $node.addEdge($var_decl_extra.node);
}
| Type Ident var_decl_extra ';' var_decl
{
    $node = new Node("var_decl");

    $node.addEdge(new Node($Type.text));
    $node.addEdge(new Node($Ident.text));
    $node.addEdge($var_decl_extra.node);
    $node.addEdge($var_decl.node);
}
|
;

var_decl_extra returns [Node node]
:','Ident var_decl_extra
{
    $node = new Node("var_decl_extra");
    $node.addEdge(new Node($Ident.text));
    $node.addEdge($var_decl_extra.node);
}
|
;

statement returns [Node node]
: location ('=' |AssignOp ) expr SemiColon
{
    $node = new Node("statement");
    $node.addEdge($location.node);

}
| method_call SemiColon
{
    $node = new Node("statement");
    $node.addEdge($method_call.node);
}
| 'if' OParen expr CParen block ('else' block)
{
    $node = new Node("statement");
    $node.addEdge(new Node("if"));
    $node.addEdge($expr.node);
    $node.addEdge($block.node);
    $node.addEdge(new Node("else"));
    $node.addEdge($block.node);
}
|'if' OParen expr CParen block
{
    $node = new Node("statement");
    $node.addEdge(new Node("if"));
    $node.addEdge($expr.node);
    $node.addEdge($block.node);

}
| 'switch' expr '{' ('case' literal ':' statements) '}'
{
    $node = new Node("statement");

    $node.addEdge(new Node("switch"));
    $node.addEdge($expr.node);
    $node.addEdge(new Node("case"));
    $node.addEdge($literal.node);
    $node.addEdge($statements.node);
}
| 'while' OParen expr CParen statement
{
    $node = new Node("statement");

    $node.addEdge(new Node("while"));
    $node.addEdge($expr.node);
    $node.addEdge($statement.node);
}
| 'return' expr SemiColon
{
    $node = new Node("statement");

    $node.addEdge(new Node("return"));
    $node.addEdge($expr.node);

}
| 'return' SemiColon
{
    $node = new Node("statement");

    $node.addEdge(new Node("return"));
}
| 'break' SemiColon
{
    $node = new Node("statement");

    $node.addEdge(new Node("break"));
}
| 'continue' SemiColon
{
    $node = new Node("statement");

    $node.addEdge(new Node("continue"));
}
| block
{
    $node = new Node("statement");

    $node.addEdge($block.node);
};

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
   $node.addEdge($location.node);
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
| e1=expr binOp e2=expr
{
   $node = new Node("expr");
   $node.addEdge($e1.node);
   $node.addEdge($binOp.node);
   $node.addEdge($e2.node);
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
   $node.addEdge($expr.node);
};

method_call returns [Node node]
: method_name '(' (expr methodArgs) ')'
{
    $node = new Node("method_call");
    $node.addEdge($method_name.node);
    $node.addEdge($expr.node);
    $node.addEdge($methodArgs.node);
}
|method_name '(' ')'
{
   $node.addEdge($method_name.node);
//   $node.addEdge(new Node("("));
//   $node.addEdge(new Node(")"));
}
| Callout '(' Str calloutArgs ')'
{
    $node = new Node("method_call");
    $node.addEdge(new Node($Callout.text));
//    $node.addEdge(new Node("("));
    $node.addEdge(new Node($Str.text));
    $node.addEdge($calloutArgs.node);
//    $node.addEdge(new Node(")"));
};

methodArgs returns [Node node]
:( ',' expr ) methodArgs
{
    $node = new Node("methodArgs");
    $node.addEdge($expr.node);
    $node.addEdge($methodArgs.node);
}
|
;

calloutArgs returns [Node node]
:( ',' callout_arg ) calloutArgs
{
    $node = new Node("calloutArgs");
//    $node.addEdge(new Node(","));
    $node.addEdge($callout_arg.node);
    $node.addEdge($calloutArgs.node);
}
|
;

callout_arg returns [Node node]
: expr
{
  $node = new Node("callout_arg");
  $node.addEdge($expr.node);
}
| Str
{
   $node = new Node("callout_arg");
   $node.addEdge(new Node($Str.text));
};

method_name returns [Node node]
: Ident
{
    $node = new Node("method_name");
    $node.addEdge(new Node($Ident.text));
};

location returns [Node node]
: Ident
{
    $node = new Node("location");
    $node.addEdge(new Node($Ident.text));
}
| Ident '[' expr ']'
{
    $node = new Node("location");
    $node.addEdge(new Node($Ident.text));
//    $node.addEdge(new Node("["));
    $node.addEdge($expr.node);
//    $node.addEdge(new Node("]"));
};

literal returns [Node node]
: int_literal
{
   $node = new Node("literal");
   $node.addEdge($int_literal.node);
}
| Char
{
   $node = new Node("literal");
   $node.addEdge(new Node($Char.text));
}
| BoolLit
{
    $node = new Node("literal");
    $node.addEdge(new Node($BoolLit.text));
};

binOp returns [Node node]:
ArithOp
{
    $node = new Node("binOp");
    $node.addEdge(new Node($ArithOp.text));
}
|Relop
{
   $node = new Node("binOp");
   $node.addEdge(new Node($Relop.text));
}
|AssignOp
{
    $node = new Node("binOp");
    $node.addEdge(new Node($AssignOp.text));
}
|CondOp
{
    $node = new Node("binOp");
    $node.addEdge(new Node($CondOp.text));
}
;

int_literal returns [Node node]:
Num
{
    $node = new Node("int_literal");
    $node.addEdge(new Node($Num.text));
}
| HexNum
{
    $node = new Node("int_literal");
    $node.addEdge(new Node($HexNum.text));
}
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
: '+='
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



