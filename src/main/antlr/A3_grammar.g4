grammar A3_grammar;

@header {
import java.io.*;
import java.util.*;
}

@parser::members{

public enum Types {INT, CHAR, BOOL, STR, VOID, LABEL, INVALID}; //symbol type
public enum Scope {GLOBAL, LOCAL, CONST, INVALID}; //symbol scope
public enum Opcode {ADD, SUB, MUL, DIV, NEG, READ, AND, OR, WRITE, ASSIGN, GOTO, LT, GT, LE, GE, EQ, NE, PARAM, CALL, RET, LABEL};

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

        scope=Scope.LOCAL;

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
public static class Instructions
{
    public int id;
    public int res;
    public Opcode opc;
    public int op1;
    public int op2;

    public static int idCounter = 0;
    public static List<Instructions> list = new ArrayList();

    Instructions(){
        id=++idCounter;
    }

    public static boolean arrayRead = true;
    public static String arrayAccess = "8";

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
    public static void createInstructionsTable() throws IOException
    {
        FileWriter writer = new FileWriter("instructions.csv");
        List<Instructions> list = Instructions.list;
        writer.append("id"+","+"res"+","+"opcode"+","+"op1"+","+"op2\n");
        for(int i=0;i<list.size();i++)
        {
            writer.append(list.get(i).id+",");
            writer.append(list.get(i).res+",");
            writer.append(list.get(i).opc+",");
            writer.append(list.get(i).op1+",");
            writer.append(list.get(i).op2+"\n");
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
    try{Csv.createSymbols(); Csv.createSymTable(); Csv.createInstructionsTable();}
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
'(' params ')' '{' var_decl statements '}'
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
'(' params ')' '{' var_decl statements '}' {Symtables.stack.pop();}
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
 var_decl statements '}'
 { Symtables.stack.pop(); }
;

//var_decls
//: var_decls var_decl
//|
//;

var_decl returns [Symbol symbol]
: Type Ident var_decl_extra ';' var_decl
{
    $symbol = new Symbol();
    $symbol.tabid = Symtables.stack.peek().id;
    $symbol.name = $Ident.text;

    if($Type.text.equals("int")){
        $symbol.type=Types.INT;
        Symbol.multiType = Types.INT;
        }
    else if($Type.text.equals("boolean")){
        $symbol.type=Types.BOOL;
        Symbol.multiType = Types.BOOL;
        }
    else{
        $symbol.type=Types.INVALID;
        Symbol.multiType = Types.INVALID;
        }

    Symtables.stack.peek().add($symbol);
    Symbol.addSymbol($symbol);

}
|
;

var_decl_extra returns [Symbol symbol]
:',' Ident var_decl_extra
{
    $symbol = new Symbol();
    $symbol.name = $Ident.text;
    $symbol.tabid = Symtables.stack.peek().id;
    $symbol.type = Symbol.multiType;

    Symtables.stack.peek().add($symbol);
    Symbol.addSymbol($symbol);
}
|
;

statements
: statement statements
|
;

statement returns [Instructions instruction]
: {Instructions.arrayRead = false;}
location eqOp expr ';'
{
    $instruction = new Instructions();

    if($location.symbol.isArray)
    {
        $instruction.opc = Opcode.WRITE;
        int offset = 8;
        try{offset = Integer.parseInt(Instructions.arrayAccess); offset*=8;}
        catch(Exception e){}
        $instruction.op1 = offset;
        $instruction.op2 = $expr.symbol.id;
        $instruction.res = $location.symbol.id;
    }
    else
    {
        $instruction.op1 = $expr.symbol.id;
        $instruction.op2 = -1;
        $instruction.opc = Opcode.ASSIGN;
        $instruction.res = $location.symbol.id;
    }

    Instructions.list.add($instruction);

}
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


expr returns [Symbol symbol]
: literal {$symbol = new Symbol(); $symbol.name = $literal.string;}
| location {$symbol = $location.symbol; }
| '(' expr ')' { $symbol = $expr.symbol; }
| SubOp expr
{
   $symbol = new Symbol();
   $symbol.tabid = Symtables.stack.peek().id;
   Instructions instruction = new Instructions();

   instruction.res = $symbol.id;
   instruction.op1 = -1;
   instruction.op2 = $expr.symbol.id;
   instruction.opc = Opcode.SUB;

   Instructions.list.add(instruction);
   Symtables.stack.peek().add($symbol);
   Symbol.addSymbol($symbol);
}
| '!' expr
{
   $symbol = new Symbol();
   $symbol.tabid = Symtables.stack.peek().id;
   Instructions instruction = new Instructions();

   instruction.res = $symbol.id;
   instruction.op1 = -1;
   instruction.op2 = $expr.symbol.id;
   instruction.opc = Opcode.NEG;

   Instructions.list.add(instruction);
   Symtables.stack.peek().add($symbol);
   Symbol.addSymbol($symbol);
}
| e1=expr AddOp e2=expr
{
   $symbol = new Symbol();
   $symbol.tabid = Symtables.stack.peek().id;
   Instructions instruction = new Instructions();

   instruction.res = $symbol.id;
   instruction.op1 = $e1.symbol.id;
   instruction.op2 = $e2.symbol.id;
   instruction.opc = Opcode.ADD;

   Instructions.list.add(instruction);
   Symtables.stack.peek().add($symbol);
   Symbol.addSymbol($symbol);
}
| e1=expr MulDiv e2=expr
{
   $symbol = new Symbol();
   $symbol.tabid = Symtables.stack.peek().id;
   Instructions instruction = new Instructions();

   instruction.res = $symbol.id;
   instruction.op1 = $e1.symbol.id;
   instruction.op2 = $e2.symbol.id;

   if($MulDiv.text.equals("*"))
    instruction.opc = Opcode.MUL;
   else
    instruction.opc = Opcode.DIV;

   Instructions.list.add(instruction);
   Symtables.stack.peek().add($symbol);
   Symbol.addSymbol($symbol);

}
| e1=expr SubOp e2=expr
{
   $symbol = new Symbol();
   $symbol.tabid = Symtables.stack.peek().id;
   Instructions instruction = new Instructions();

   instruction.res = $symbol.id;
   instruction.op1 = $e1.symbol.id;
   instruction.op2 = $e2.symbol.id;
   instruction.opc = Opcode.SUB;

   Instructions.list.add(instruction);
   Symtables.stack.peek().add($symbol);
   Symbol.addSymbol($symbol);
}
| e1=expr RelOp e2=expr
{
   $symbol = new Symbol();
   $symbol.tabid = Symtables.stack.peek().id;
   Instructions instruction = new Instructions();

   instruction.res = $symbol.id;
   instruction.op1 = $e1.symbol.id;
   instruction.op2 = $e2.symbol.id;

   if($MulDiv.text.equals("<="))
        instruction.opc = Opcode.LE;
   if($MulDiv.text.equals(">="))
        instruction.opc = Opcode.GE;
    if($MulDiv.text.equals("<"))
        instruction.opc = Opcode.LT;
    if($MulDiv.text.equals(">"))
        instruction.opc = Opcode.GT;

   Instructions.list.add(instruction);
   Symtables.stack.peek().add($symbol);
   Symbol.addSymbol($symbol);
}
| e1=expr AndOp m e2=expr
{
   $symbol = new Symbol();
   $symbol.tabid = Symtables.stack.peek().id;
   Instructions instruction = new Instructions();

   instruction.res = $symbol.id;
   instruction.op1 = $e1.symbol.id;
   instruction.op2 = $e2.symbol.id;
   instruction.opc = Opcode.AND;

   Instructions.list.add(instruction);
   Symtables.stack.peek().add($symbol);
   Symbol.addSymbol($symbol);

}
| e1=expr OrOp m e2=expr
{

   $symbol = new Symbol();
   $symbol.tabid = Symtables.stack.peek().id;
   Instructions instruction = new Instructions();

   instruction.res = $symbol.id;
   instruction.op1 = $e1.symbol.id;
   instruction.op2 = $e2.symbol.id;
   instruction.opc = Opcode.OR;

   Instructions.list.add(instruction);
   Symtables.stack.peek().add($symbol);
   Symbol.addSymbol($symbol);

}
| methodCall
;

location returns [Symbol symbol]
:Ident
{
    int flag=0;
    Symtables table = Symtables.stack.peek();
    for(int i=0;i<table.symbols.size();i++)
    {
        if(table.symbols.get(i).name.equals($Ident.text))
        {
            $symbol=table.symbols.get(i);
            flag=1;
            break;
        }
    }
    if(flag==0)
    {
        Symtables table2 = Symtables.list.get(0);
        for(int i=0;i<table2.symbols.size();i++)
        {
            if(table2.symbols.get(i).name.equals($Ident.text))
            {
                $symbol=table2.symbols.get(i);
                break;
            }
        }
    }

    Instructions.arrayRead=true;

}
| Ident '[' expr ']'
{
    //first find corresponding symbol
    int flag=0;
    Instructions.arrayAccess = $expr.symbol.name;
    Symtables table = Symtables.stack.peek();
    for(int i=0;i<table.symbols.size();i++)
    {
        if(table.symbols.get(i).name.equals($Ident.text))
        {
            $symbol=table.symbols.get(i);
            flag=1;
            break;
        }
    }
    if(flag==0)
    {
        Symtables table2 = Symtables.list.get(0);
        for(int i=0;i<table2.symbols.size();i++)
        {
            if(table2.symbols.get(i).name.equals($Ident.text))
            {
                $symbol=table2.symbols.get(i);
                break;
            }
        }
    }

    Instructions instruction = new Instructions();

    if(Instructions.arrayRead)
    {
        Symbol symbolTemp = new Symbol();
        symbolTemp.tabid = Symtables.stack.peek().id;
        instruction.opc = Opcode.READ;
        int offset=8;
        try{offset = Integer.parseInt($expr.symbol.name); offset*=8;}
        catch(Exception e){}
        instruction.op1 = $symbol.id;
        instruction.op2 = offset;
        instruction.res = symbolTemp.id;

        $symbol = symbolTemp;
        Symtables.stack.peek().add($symbol);
        Symbol.addSymbol($symbol);
    }

    Instructions.list.add(instruction);
    Instructions.arrayRead=true;

}
;

m returns [Symbol symbol]:
{
    $symbol = new Symbol();
    $symbol.type = Types.LABEL;
    Symtables.stack.peek().add($symbol);
    Symbol.addSymbol($symbol);


}
;

num returns [String string]
: DecNum {$string = $DecNum.text;}
| HexNum {$string = $HexNum.text;}
;

literal returns[String string]
: num{$string = $num.string;}
| Char {$string=$Char.text;}
| BoolLit {$string=$BoolLit.text;}
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




