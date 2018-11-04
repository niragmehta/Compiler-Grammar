grammar A3_grammar;

@header {
import java.io.*;
import java.util.*;
}

@parser::members{

public enum Types {INT, CHAR, BOOL, STR, VOID, LABEL, INVALID}; //symbol type
public enum Scope {GLOBAL, LOCAL, CONST, INVALID}; //symbol scope
enum opcode {ADD, SUB, MUL, DIV, NEG, READ, WRITE, ASSIGN, GOTO, LT, GT, LE, GE, EQ, NE, PARAM, CALL, RET, LABEL};

public static class Symbol
{
    public static int idCounter = 0;
    public static Types multiType;

    public int id;
    public int tabid;
    public String name;
    public boolean isArray;
    public boolean isInited;
    public String arrSize;
    public Types type;
    public Scope scope;

    public static List<Symbol> list = new ArrayList();

    public Symbol()
    {
        id = ++idCounter;
        tabid=0;
        name="";
        isArray=false;
        isInited=false;
        arrSize="0";
    }

    public static void addSymbol(Symbol symbol)
    {
        list.add(symbol);
    }

//    public union initVal {
//    	int i;
//    	boolean b;
//    } in; //initial value, if applicable
}

public static class Symtables
{
    public static int idCounter = 0;
    public static Stack<Symtables> stack = new Stack();
    public static List<Symtables> list = new ArrayList();

    public int id;
    public int parentId;
    public List<Symbol> symbols;

    Symtables()
    {
        id = ++idCounter;
        parentId=0;
        symbols = new ArrayList();
    }

    public void add(Symbol symbol)
    {
        symbols.add(symbol);
    }

    public static void addSymTableToList(Symtables symtable)
    {
        list.add(symtable);
    }

}
public static class instructions
{
    public int id;
    public int res;
    public enum opc;
    public int op1;
    public int op2;

    public static int idCounter = 0;
    public static List<instructions> list = new ArrayList();

    intructions(){
        id=++idCounter;
    }

}

public static class Csv
{
    public static void createSymbols() throws IOException
    {
        FileWriter writer = new FileWriter("symbols.csv");
        List<Symbol> list = Symbol.list;
        writer.append("id"+","+"tabid"+","+"name"+","+"type"+","+"scope"+","+"isArray"+","+"isInited"+","+"arrSize\n");
        for(int i=0;i<list.size();i++)
        {
            writer.append(list.get(i).id+",");
            writer.append(list.get(i).tabid+",");
            writer.append(list.get(i).name+",");
            writer.append(list.get(i).type+",");
            writer.append(list.get(i).scope+",");
            writer.append(list.get(i).isArray+",");
            writer.append(list.get(i).isInited+",");
            writer.append(list.get(i).arrSize+"\n");
        }
        writer.flush();
        writer.close();
    }
    public static void createSymTable() throws IOException
    {
        FileWriter writer = new FileWriter("symtables.csv");
        List<Symtables> list = Symtables.list;
        writer.append("id"+","+"parent\n");
        for(int i=0;i<list.size();i++)
        {
            writer.append(list.get(i).id+",");
            writer.append(list.get(i).parentId+"\n");
        }
        writer.flush();
        writer.close();
    }

}

}

prog returns [Symtables symtable]
: Class Program
{ $symtable = new Symtables(); Symtables.stack.push($symtable); Symtables.addSymTableToList($symtable);}
'{' field_decls method_decls '}'
{
    Symtables.stack.pop();
    try{Csv.createSymbols(); Csv.createSymTable();}
    catch(Exception e){}
}
;

field_decls
: field_decls field_decl ';'
| field_decls inited_field_decl ';'
| 
;

field_decl returns [Symbol symbol]
: field_decl ',' Ident
{
    $symbol = new Symbol();
    $symbol.tabid = Symtables.stack.peek().id;
    $symbol.name = $Ident.text;
    $symbol.type=Symbol.multiType;
    $symbol.scope=Scope.GLOBAL;
    Symtables.stack.peek().add($symbol);

    Symbol.addSymbol($symbol);
}
| field_decl ',' Ident '[' num ']'
{
    $symbol = new Symbol();
    $symbol.tabid = Symtables.stack.peek().id;
    $symbol.name = $Ident.text;
    $symbol.type=Symbol.multiType;
    $symbol.scope=Scope.GLOBAL;

    $symbol.isArray=true;
    $symbol.arrSize=$num.text;

    Symtables.stack.peek().add($symbol);
    Symbol.addSymbol($symbol);
}
| Type Ident
{

    $symbol = new Symbol();
    $symbol.tabid = Symtables.stack.peek().id;
    $symbol.name = $Ident.text;
    if($Type.text.equals("int")){
        $symbol.type=Types.INT;
        Symbol.multiType=Types.INT;
        }
    else if($Type.text.equals("boolean")){
        $symbol.type=Types.BOOL;
        Symbol.multiType=Types.BOOL;
        }
    else{
        $symbol.type=Types.INVALID;
        Symbol.multiType=Types.INVALID;
        }

    $symbol.scope=Scope.GLOBAL;

    Symtables.stack.peek().add($symbol);
    Symbol.addSymbol($symbol);
}
| Type Ident '[' num ']'
{
    $symbol = new Symbol();
    $symbol.tabid = Symtables.stack.peek().id;
    $symbol.name = $Ident.text;
    if($Type.text.equals("int")){
        $symbol.type=Types.INT;
        Symbol.multiType=Types.INT;
        }
    else if($Type.text.equals("boolean")){
        $symbol.type=Types.BOOL;
        Symbol.multiType=Types.BOOL;
        }
    else{
        $symbol.type=Types.INVALID;
        Symbol.multiType=Types.INVALID;
        }

    $symbol.scope=Scope.GLOBAL;
    $symbol.isArray=true;
    $symbol.arrSize=$num.text;

    Symtables.stack.peek().add($symbol);
    Symbol.addSymbol($symbol);
}
;

inited_field_decl returns [Symbol symbol]
: Type Ident '=' literal
{
    $symbol = new Symbol();
    $symbol.tabid = Symtables.stack.peek().id;
    $symbol.name = $Ident.text;
    if($Type.text.equals("int")){
        $symbol.type=Types.INT;
        Symbol.multiType=Types.INT;
        }
    else if($Type.text.equals("boolean")){
        $symbol.type=Types.BOOL;
        Symbol.multiType=Types.BOOL;
        }
    else{
        $symbol.type=Types.INVALID;
        Symbol.multiType=Types.INVALID;
        }
    $symbol.scope=Scope.GLOBAL;

    Symtables.stack.peek().add($symbol);
    Symbol.addSymbol($symbol);
}
;

method_decls
: method_decls method_decl
|
;

method_decl returns [Symbol symbol]
: Void Ident {
                 $symbol = new Symbol();
                 $symbol.tabid = Symtables.stack.peek().id;
                 $symbol.name = $Ident.text;
                 $symbol.type=Types.VOID;
                 $symbol.scope = Scope.GLOBAL;
                 Symtables.stack.peek().add($symbol);

                 Symtables symtable = new Symtables();
                 symtable.parentId=Symtables.stack.peek().id;
                 Symtables.stack.push(symtable);

                 Symbol.addSymbol($symbol);
                 Symtables.addSymTableToList(symtable);

             }
'(' params ')' '{' var_decls statements '}'
{
    Symtables.stack.pop();
}
| Type Ident
{
     $symbol = new Symbol();
     $symbol.tabid = Symtables.stack.peek().id;
     $symbol.name = $Ident.text;
     $symbol.scope = Scope.GLOBAL;

     if($Type.text.equals("int")){
        $symbol.type=Types.INT;
        }
     else if($Type.text.equals("boolean")){
        $symbol.type=Types.BOOL;
        }
     else{
        $symbol.type=Types.INVALID;
        }
     Symtables.stack.peek().add($symbol);

     Symtables symtable = new Symtables();
     symtable.parentId=Symtables.stack.peek().id;
     Symtables.stack.push(symtable);

     Symbol.addSymbol($symbol);
     Symtables.addSymTableToList(symtable);

}
'(' params ')' '{' var_decls statements '}' {Symtables.stack.pop();}
;


params returns [Symbol symbol]
: Type Ident nextParams
{
    $symbol = new Symbol();
    $symbol.tabid = Symtables.stack.peek().id;
    $symbol.name = $Ident.text;
    if($Type.text.equals("int")){
        $symbol.type=Types.INT;
        Symbol.multiType=Types.INT;
        }
    else if($Type.text.equals("boolean")){
        $symbol.type=Types.BOOL;
        Symbol.multiType=Types.BOOL;
        }
    else{
        $symbol.type=Types.INVALID;
        Symbol.multiType=Types.INVALID;
        }

    $symbol.scope=Scope.LOCAL;
    Symtables.stack.peek().add($symbol);
    Symbol.addSymbol($symbol);

}
|
;

nextParams returns [Symbol symbol]
: ',' Type Ident nextParams
{
    $symbol = new Symbol();
    $symbol.tabid = Symtables.stack.peek().id;
    $symbol.name = $Ident.text;
    $symbol.type=Symbol.multiType;
    $symbol.scope=Scope.LOCAL;
    Symtables.stack.peek().add($symbol);
    Symbol.addSymbol($symbol);

}
|
;

block returns [Symtables symtable]
: '{' {      Symtables symtable = new Symtables();
             symtable.parentId=Symtables.stack.peek().id;
             Symtables.stack.push(symtable);
             Symtables.addSymTableToList(symtable);
             }
 var_decls statements '}'
 { Symtables.stack.pop(); }
;

var_decls
: var_decls var_decl 
| 
;


var_decl returns [Symbol symbol]
: Type Ident ';'
{
    $symbol = new Symbol();
    $symbol.tabid = Symtables.stack.peek().id;
    $symbol.name = $Ident.text;
    if($Type.text.equals("int"))
        $symbol.type=Types.INT;
    else if($Type.text.equals("boolean"))
        $symbol.type=Types.BOOL;
    else
        $symbol.type=Types.INVALID;

    $symbol.scope=Scope.LOCAL;
    Symtables.stack.peek().add($symbol);
    Symbol.addSymbol($symbol);
}
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


expr returns [Instruction instruction]
: literal
| location
| '(' expr ')'
| SubOp expr
| '!' expr
| e1=expr AddOp e2=expr
{
    $instruction = new Instruction();

}
| e1=expr MulDiv e2=expr
| e1=expr SubOp e2=expr
| e1=expr RelOp e2=expr
| e1=expr AndOp e2=expr
| e1=expr OrOp e2=expr
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




