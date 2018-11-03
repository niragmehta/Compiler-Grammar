grammar A3_grammar;

@header {
import java.io.*;
}

@parser::members{

public enum Types {INT, CHAR, BOOL, STR, VOID, LABEL, INVALID}; //symbol type
public enum Scope {GLOBAL, LOCAL, CONST, INVALID}; //symbol scope

public static class Symbol
{
    public static int idCounter = 0;
    public int id;
    public int tabid;
    public String name;
    public boolean isArray;
    public boolean isInited;
    public int arrSize;

    public Types type;
    public Scope scope;

    public Symbol()
    {
        id = ++idCounter;
        tabid=0;
        name="";
        isArray=false;
        isInited=false;
        arrSize=0;
    }

//    public union initVal {
//    	int i;
//    	boolean b;
//    } in; //initial value, if applicable
}

public class Symtables
{

}


}

prog
: Class Program '{' field_decls method_decls '}'
;

field_decls
: field_decls field_decl ';'
| field_decls inited_field_decl ';'
| 
;

field_decl returns [Symbol symbol]
: field_decl ',' Ident
| field_decl ',' Ident '[' num ']'
| Type Ident
{
    $symbol = new Symbol();
    $symbol.name = $Ident.text;
    if($Type.text.equals("int"))
        $symbol.type=Types.INT;
    else
        $symbol.type=Types.BOOL;


}
| Type Ident '[' num ']'
;

inited_field_decl
: Type Ident '=' literal 
;

method_decls
: method_decls method_decl
|
;

method_decl
: Void Ident '(' params ')' block
| Type Ident '(' params ')' block
;


params
: Type Ident nextParams
|
;

nextParams
: ',' Type Ident nextParams
|
;

block
: '{' var_decls statements '}'
;

var_decls
: var_decls var_decl 
| 
;


var_decl
: Type Ident ';'
;

statements
: statement statements
|
;

statement
: location eqOp expr ';'
| If '(' expr ')' block
| If '(' expr ')' block Else block
| While '(' expr ')' statement 
| Switch expr '{' cases '}' 
| Ret expr ';'
| Ret '(' expr ')' ';'
| Brk ';'
| Cnt ';'
| block
| methodCall ';'
;

cases
: Case literal ':' statements cases
| Case literal ':' statements
;


methodCall
: Ident '(' args ')'
| Callout '(' Str calloutArgs ')'
;

args
: someArgs
|
;

someArgs
: someArgs ',' expr
| expr
;

calloutArgs
: calloutArgs ',' expr
| calloutArgs ',' Str
|
;


expr
: literal
| location
| '(' expr ')'
| SubOp expr
| '!' expr
| expr AddOp expr
| expr MulDiv expr
| expr SubOp expr
| expr RelOp expr
| expr AndOp expr
| expr OrOp expr
| methodCall
;

location
:Ident
| Ident '[' expr ']'
;


num
: DecNum
| HexNum
;

literal
: num
| Char
| BoolLit
;

eqOp
: '='
| AssignOp
;

//-----------------------------------------------------------------------------------------------------------
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
: 'void'
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

DecNum
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

RelOp
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

MulDiv
: '*'
| '/'
| '%'
;

AddOp
: '+'
;

SubOp
: '-'
;

AndOp
: '&&'
;

OrOp
: '||'
;




