grammar CMPT379Compiler;

@header {
import java.io.*;
import java.util.*;
}

@parser::members{

public enum Types {INT, CHAR, BOOL, STR, VOID, LABEL, INVALID}; //symbol type
public enum Scope {GLOBAL, LOCAL, CONST, INVALID}; //symbol scope
public enum Opcode {ADD, SUB, MUL, DIV, NEG, READ, WRITE, ASSIGN, GOTO, LT, GT, LE, GE, EQ, NE, PARAM, CALL, RET, LABEL};

public static class Symbol
{
    public static int idCounter = 0;
    public static Types multiType;
    public static List<Symbol> list = new ArrayList();

    public int id;
    public int tabid;
    public String name;
    public boolean isArray;
    public boolean isInited;
    public String arrSize;
    public Types type;
    public Scope scope;

    int i;
    boolean b;

    public List<Instructions> truelist;
    public List<Instructions> falselist;

    public Symbol()
    {
        id = ++idCounter;
        tabid=0;
        name="";
        isArray=false;
        isInited=false;
        arrSize="0";

        truelist = new ArrayList();
        falselist = new ArrayList();

        scope=Scope.LOCAL;

    }

    public static void add(Symbol symbol)
    {
        list.add(symbol);
    }

    public static void backpatch(List<Instructions> list, int id)
    {
        for(int i=0;i<list.size();i++)
        {if(list.get(i).res == -1)
            list.get(i).res = id;
        }
    }

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

    Instructions(int op1, int op2,int res, Opcode opc)
    {
        id=++idCounter;
        this.op1=op1;
        this.op2=op2;
        this.res = res;
        this.opc = opc;
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
        writer.append("id"+","+"tabid"+","+"name"+","+"type"+","+"scope"+","+"isArray"+"," + "arrSize" + "," + "isInited" + "," + "int_val" + "," + "bool_val" + "\n");
        for(int i=0;i<list.size();i++)
        {
            writer.append(list.get(i).id+",");
            writer.append(list.get(i).tabid+",");
            writer.append(list.get(i).name+",");
            writer.append(list.get(i).type+",");
            writer.append(list.get(i).scope+",");
            writer.append(list.get(i).isArray+",");
            writer.append(list.get(i).arrSize+",");
            writer.append(list.get(i).isInited+",");

            writer.append(list.get(i).i+",");
            writer.append(list.get(i).b+"\n");

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

int count = 0;
int symbolCount = 0;

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

    Symbol.add($symbol);
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
    Symbol.add($symbol);
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
    Symbol.add($symbol);
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
    Symbol.add($symbol);
}
;

inited_field_decl returns [Symbol symbol]
: Type Ident '=' literal
{
    $symbol = new Symbol();
    $symbol.tabid = Symtables.stack.peek().id;
    $symbol.name = $Ident.text;
    $symbol.isInited = true;
    $symbol.scope=Scope.GLOBAL;
    if($Type.text.equals("int")){
        $symbol.type=Types.INT;
        Symbol.multiType=Types.INT;
        int value = 0;
        try{value = Integer.parseInt($literal.text);}
        catch(Exception e){}
        $symbol.i = value;
        }
    else if($Type.text.equals("boolean")){
        $symbol.type=Types.BOOL;
        Symbol.multiType=Types.BOOL;
        boolean value = true;
        try{value = Boolean.parseBoolean($literal.text);}
        catch(Exception e){}
        $symbol.b = value;
        }
    else{
        $symbol.type=Types.INVALID;
        Symbol.multiType=Types.INVALID;
        }

    Instructions instruction = new Instructions($symbol.id,$literal.symbol.id,-1,Opcode.ASSIGN);
    Instructions.list.add(instruction);

    Symtables.stack.peek().add($symbol);
    Symbol.add($symbol);
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
     $symbol.type=Types.LABEL;
     $symbol.scope = Scope.GLOBAL;

     Symtables.stack.peek().add($symbol);
     Symtables symtable = new Symtables();
     symtable.parentId=Symtables.stack.peek().id;
     Symtables.stack.push(symtable);

     Symbol.add($symbol);
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

     $symbol.type=Types.LABEL;
     Symtables.stack.peek().add($symbol);
     Symtables symtable = new Symtables();
     symtable.parentId=Symtables.stack.peek().id;
     Symtables.stack.push(symtable);

     Symbol.add($symbol);
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
    Symbol.add($symbol);

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
    Symbol.add($symbol);

}
|
;

block returns [Symtables symtable, List<Instructions> nextlist]
: '{' {
             Symtables symtable = new Symtables();
             symtable.parentId=Symtables.stack.peek().id;
             Symtables.stack.push(symtable);
             Symtables.addSymTableToList(symtable);
      }
 var_decl statements
 '}'

 {
  $nextlist = $statements.nextlist;
  Symtables.stack.pop();
  }
;

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
    Symbol.add($symbol);
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
    Symbol.add($symbol);
}
|
;

statements returns[List<Instructions> nextlist, List<Instructions> breaklist, List<Instructions> continuelist]
: statement k statements
{
    Symbol.backpatch($statement.nextlist,$k.symbol.id);
    $nextlist = $statements.nextlist;

    $breaklist = new ArrayList();
    $continuelist = new ArrayList();
}
|
{
    $nextlist = new ArrayList();
    $breaklist = new ArrayList();
    $continuelist = new ArrayList();
}
;

statement returns [Instructions instruction, List<Instructions> nextlist , List<Instructions> breaklist, List<Instructions> continuelist]
: {Instructions.arrayRead = false;}
location eqOp expr ';'
{
    $nextlist = new ArrayList();
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

    $breaklist = new ArrayList();
    $continuelist = new ArrayList();

}
| If '(' expr ')' m block
{
   Symbol.backpatch($expr.symbol.truelist , $m.symbol.id);
   List<Instructions> mergelist = new ArrayList();
   mergelist.addAll($expr.symbol.falselist);
   mergelist.addAll($block.nextlist);
   $nextlist = mergelist;

   $breaklist = new ArrayList();
   $continuelist = new ArrayList();
}
| If '(' expr ')' m1=m b1=block n Else m2=m b2=block
{
    Symbol.backpatch($expr.symbol.truelist,$m1.symbol.id);
    Symbol.backpatch($expr.symbol.falselist,$m2.symbol.id);
    List<Instructions> list = new ArrayList();
    list.addAll($b1.nextlist);
    list.addAll($n.nextlist);
    list.addAll($b2.nextlist);
    $nextlist=list;

    $breaklist = new ArrayList();
    $continuelist = new ArrayList();
}
| While m1=m '(' expr ')' m2=m s=statement
{
    $nextlist = new ArrayList();
    Symbol.backpatch($expr.symbol.truelist,$m2.symbol.id);
    Symbol.backpatch($s.nextlist,$m1.symbol.id);

    $nextlist = $expr.symbol.falselist;
    Instructions instruction = new Instructions(-1,-1,$m1.symbol.id,Opcode.GOTO);
    Instructions.list.add(instruction);

    $breaklist = new ArrayList();
    $continuelist = new ArrayList();
}
| Switch expr m '{' cases '}'
{
    $nextlist = new ArrayList();
    Symbol.backpatch($expr.symbol.truelist,$m.symbol.id);

    List<Instructions> mergedlist = new ArrayList();
    mergedlist.addAll($expr.symbol.falselist);
    mergedlist.addAll($cases.nextlist);
    $nextlist = mergedlist;

    $breaklist = $cases.breaklist;
    $continuelist = $cases.continuelist;

}
| Ret expr ';' {Instructions instruction = new Instructions($expr.symbol.id,-1,-1,Opcode.RET);Instructions.list.add(instruction);
                $nextlist = new ArrayList();
                $breaklist = new ArrayList();
                $continuelist = new ArrayList();
                }
| Ret '(' expr ')' ';' {Instructions instruction = new Instructions($expr.symbol.id,-1,-1,Opcode.RET);Instructions.list.add(instruction);
                       $nextlist = new ArrayList();
                       $breaklist = new ArrayList();
                       $continuelist = new ArrayList();
                       }
| Brk ';'
{       Instructions instruction = new Instructions(-1,-1,-1,Opcode.GOTO);Instructions.list.add(instruction);
        $nextlist = new ArrayList();
        $breaklist = new ArrayList();
        $breaklist.add(instruction);

        $continuelist = new ArrayList();
          }
| Cnt ';' {Instructions instruction = new Instructions(-1,-1,-1,Opcode.GOTO);Instructions.list.add(instruction);
           $nextlist = new ArrayList();

           $continuelist = new ArrayList();
           $continuelist.add(instruction);
           $breaklist = new ArrayList();
           }
| block
 {
$nextlist = $block.nextlist;
    $breaklist = new ArrayList();
    $continuelist = new ArrayList();
}
| methodCall ';'
{
    $nextlist = new ArrayList();

    Symbol symbol = new Symbol();
    symbol.name = Integer.toString($methodCall.paramCount);
    symbol.tabid = Symtables.stack.peek().id;

    Symtables.stack.peek().add(symbol);
    Symbol.add(symbol);

    Instructions instruction = new Instructions($methodCall.symbol.id,symbol.id,-1,Opcode.CALL);
    Instructions.list.add(instruction);

        $breaklist = new ArrayList();
        $continuelist = new ArrayList();
}
;

cases returns [List<Instructions> nextlist, , List<Instructions> breaklist, List<Instructions> continuelist]
: Case literal ':' statements m cases
{
    Symbol.backpatch($statements.nextlist,$m.symbol.id);

    List<Instructions> mergedlist =new ArrayList();
    mergedlist.addAll($statements.nextlist);
    mergedlist.addAll($cases.nextlist);
    $nextlist = mergedlist;

    List<Instructions> bl = new ArrayList();
    List<Instructions> cl = new ArrayList();

    bl.addAll($statements.breaklist);
    bl.addAll($cases.breaklist);

    cl.addAll($statements.breaklist);
    cl.addAll($cases.breaklist);

    $breaklist = bl;
    $continuelist = cl;
}
| Case literal ':' statements
{
    $nextlist = $statements.nextlist;
    $breaklist = $statements.breaklist;
    $continuelist = $statements.continuelist;
}
;


methodCall returns [Symbol symbol, int paramCount]
: Ident '(' args ')'
{
    $paramCount = $args.count;
    for(int i=0;i<Symbol.list.size();i++)
    {
        if(Symbol.list.get(i).name.equals($Ident.text))
            {$symbol = Symbol.list.get(i); break;}
    }
}
| Callout '(' Str calloutArgs ')'
{
    $paramCount = $calloutArgs.count;
    $symbol = new Symbol();
    $symbol.name = $Str.text;
    $symbol.type = Types.STR;
    $symbol.tabid = Symtables.stack.peek().id;

    Symtables.stack.peek().add($symbol);
    Symbol.add($symbol);

}
;

args returns [int count]
: someArgs{ $count = $someArgs.count;}
| {$count = 0;}
;

someArgs returns [int count]
: someArgs ',' expr {$count = $count +1;}
| expr {$count = 1;}
;

calloutArgs returns [int count, Symbol symbol]
: calloutArgs ',' expr
{

    $count = $count + 1;
    $symbol = $expr.symbol;
    Instructions instruction = new Instructions($symbol.id,-1,-1,Opcode.PARAM);
    Instructions.list.add(instruction);
}
| calloutArgs ',' Str
{
    $count = $count + 1;
    $symbol = new Symbol();
    $symbol.name = $Str.text;
    $symbol.type = Types.STR;
    $symbol.tabid = Symtables.stack.peek().id;
    Instructions instruction = new Instructions($symbol.id,-1,-1,Opcode.PARAM);

    Symtables.stack.peek().add($symbol);
    Symbol.add($symbol);
    Instructions.list.add(instruction);
}
| {$count =  0;}
;


expr returns [Symbol symbol]
: literal {$symbol = $literal.symbol;}
| location {$symbol = $location.symbol; }
| '(' expr ')' { $symbol = $expr.symbol; }
| SubOp expr
{
   $symbol = new Symbol();
   $symbol.name = "T"+ (++symbolCount);
   $symbol.type = Types.INT;
   $symbol.scope = Scope.LOCAL;
   $symbol.tabid = Symtables.stack.peek().id;
   Instructions instruction = new Instructions();

   instruction.res = $symbol.id;
   instruction.op1 = -1;
   instruction.op2 = $expr.symbol.id;
   instruction.opc = Opcode.SUB;

   Instructions.list.add(instruction);
   Symtables.stack.peek().add($symbol);
   Symbol.add($symbol);
}
| '!' expr
{
   $symbol = new Symbol();
   $symbol.name = "T"+ (++symbolCount);
   $symbol.type = Types.BOOL;
   $symbol.scope = Scope.LOCAL;
   $symbol.tabid = Symtables.stack.peek().id;
   Instructions instruction = new Instructions();

   instruction.res = $symbol.id;
   instruction.op1 = -1;
   instruction.op2 = $expr.symbol.id;
   instruction.opc = Opcode.NEG;

   Instructions.list.add(instruction);
   Symtables.stack.peek().add($symbol);
   Symbol.add($symbol);
}
| e1=expr AddOp e2=expr
{
   $symbol = new Symbol();
   $symbol.name = "T"+ (++symbolCount);
   $symbol.type = Types.INT;
   $symbol.scope = Scope.LOCAL;
   $symbol.tabid = Symtables.stack.peek().id;
   Instructions instruction = new Instructions();

   instruction.res = $symbol.id;
   instruction.op1 = $e1.symbol.id;
   instruction.op2 = $e2.symbol.id;
   instruction.opc = Opcode.ADD;

   Instructions.list.add(instruction);
   Symtables.stack.peek().add($symbol);
   Symbol.add($symbol);
}
| e1=expr MulDiv e2=expr
{
   $symbol = new Symbol();
   $symbol.name = "T"+ (++symbolCount);
   $symbol.type = Types.INT;
   $symbol.scope = Scope.LOCAL;
   $symbol.tabid = Symtables.stack.peek().id;

   if($MulDiv.text.equals("*"))
   {
      Instructions instruction = new Instructions($e1.symbol.id,$e2.symbol.id,$symbol.id,Opcode.MUL);
      Instructions.list.add(instruction);
      Symtables.stack.peek().add($symbol);
      Symbol.add($symbol);
   }
   else if($MulDiv.text.equals("/")){
      Instructions instruction = new Instructions($e1.symbol.id,$e2.symbol.id,$symbol.id,Opcode.DIV);
      Instructions.list.add(instruction);
      Symtables.stack.peek().add($symbol);
      Symbol.add($symbol);
   }
   else
   {
       Symbol sym1 = new Symbol(); sym1.name = "T"+ (++symbolCount); sym1.type = Types.INT;
       Symbol sym2 = new Symbol(); sym2.name = "T"+ (++symbolCount); sym2.type = Types.INT;
       Instructions instruction1 = new Instructions($e1.symbol.id,$e2.symbol.id,sym1.id,Opcode.DIV);
       Instructions instruction2 = new Instructions(sym1.id,$e2.symbol.id,sym2.id,Opcode.MUL);
       Instructions instruction3 = new Instructions($e2.symbol.id,sym2.id,$symbol.id,Opcode.SUB);

       Symbol.add(sym1);
       Symbol.add(sym2);
       Symbol.add($symbol);
       Instructions.list.add(instruction1);
       Instructions.list.add(instruction2);
       Instructions.list.add(instruction3);
   }

}
| e1=expr SubOp e2=expr
{
   $symbol = new Symbol();
   $symbol.name = "T"+ (++symbolCount);
   $symbol.type = Types.INT;
   $symbol.scope = Scope.LOCAL;
   $symbol.tabid = Symtables.stack.peek().id;
   Instructions instruction = new Instructions();

   instruction.res = $symbol.id;
   instruction.op1 = $e1.symbol.id;
   instruction.op2 = $e2.symbol.id;
   instruction.opc = Opcode.SUB;

   Instructions.list.add(instruction);
   Symtables.stack.peek().add($symbol);
   Symbol.add($symbol);
}
| e1=expr RelOp e2=expr
{
   $symbol = new Symbol();
   $symbol.name = "T"+ (++symbolCount);
   $symbol.type = Types.BOOL;
   $symbol.scope = Scope.LOCAL;
   $symbol.tabid = Symtables.stack.peek().id;

   Instructions instruction1 = new Instructions();
   Instructions instruction2 = new Instructions();

   if($RelOp.text.equals("<=")){
        instruction1 = new Instructions($e1.symbol.id,$e2.symbol.id,-1,Opcode.LE);
        instruction2 = new Instructions($e1.symbol.id,$e2.symbol.id,-1,Opcode.GT);}
   if($RelOp.text.equals(">=")){
       instruction1 = new Instructions($e1.symbol.id,$e2.symbol.id,-1,Opcode.GE);
       instruction2 = new Instructions($e1.symbol.id,$e2.symbol.id,-1,Opcode.LT);}
    if($RelOp.text.equals("<")){
        instruction1 = new Instructions($e1.symbol.id,$e2.symbol.id,-1,Opcode.LT);
        instruction2 = new Instructions($e1.symbol.id,$e2.symbol.id,-1,Opcode.GE);}
    if($RelOp.text.equals(">")){
           instruction1 = new Instructions($e1.symbol.id,$e2.symbol.id,-1,Opcode.GT);
           instruction2 = new Instructions($e1.symbol.id,$e2.symbol.id,-1,Opcode.LE);}
    if($RelOp.text.equals("==")){
          instruction1 = new Instructions($e1.symbol.id,$e2.symbol.id,-1,Opcode.EQ);
          instruction2 = new Instructions($e1.symbol.id,$e2.symbol.id,-1,Opcode.NE);}
    if($RelOp.text.equals("!=")){
         instruction1 = new Instructions($e1.symbol.id,$e2.symbol.id,-1,Opcode.NE);
         instruction2 = new Instructions($e1.symbol.id,$e2.symbol.id,-1,Opcode.EQ);}

   $symbol.truelist.add(instruction1);
   $symbol.falselist.add(instruction2);

   Instructions.list.add(instruction1);
   Instructions.list.add(instruction2);

   Symtables.stack.peek().add($symbol);
   Symbol.add($symbol);
}
| e1=expr AndOp m e2=expr
{
   $symbol = new Symbol();
   $symbol.name = "T"+ (++symbolCount);
   $symbol.type = Types.BOOL;
   $symbol.scope = Scope.LOCAL;
   $symbol.tabid = Symtables.stack.peek().id;

   //back patch
   if($e1.symbol.truelist.isEmpty())
   {
      Instructions  instruction = new Instructions($e1.symbol.id,-1,-1,Opcode.GOTO);
      Instructions.list.add(instruction);
      $e1.symbol.truelist.add(instruction);
   }
   Symbol.backpatch($e1.symbol.truelist ,$m.symbol.id );
   $symbol.truelist = $e2.symbol.truelist;


   //merge lists
   for(int i = 0;i<$e1.symbol.falselist.size();i++)
   {$symbol.falselist.add($e1.symbol.falselist.get(i));}

   for(int i = 0;i<$e2.symbol.falselist.size();i++)
   {$symbol.falselist.add($e2.symbol.falselist.get(i));}

   Symtables.stack.peek().add($symbol);
   Symbol.add($symbol);

}
| e1=expr OrOp m e2=expr
{

   $symbol = new Symbol();
   $symbol.name = "T"+ (++symbolCount);
   $symbol.type = Types.BOOL;
   $symbol.scope = Scope.LOCAL;
   $symbol.tabid = Symtables.stack.peek().id;

  //back patch
  if($e1.symbol.falselist.isEmpty())
  {
       Instructions instruction = new Instructions($e1.symbol.id,-1,-1,Opcode.GOTO);
       Instructions.list.add(instruction);
       $e1.symbol.falselist.add(instruction);
  }
  for(int i=0 ; i < $e1.symbol.falselist.size();i++)
  {
       if($e1.symbol.falselist.get(i).res == -1)
           {$e1.symbol.falselist.get(i).res = $m.symbol.id;}
  }

  $symbol.falselist = $e2.symbol.falselist;

  //merge lists
  for(int i = 0;i < $e1.symbol.truelist.size();i++)
  {$symbol.truelist.add($e1.symbol.truelist.get(i));}

  for(int i = 0;i < $e2.symbol.truelist.size();i++)
  {$symbol.truelist.add($e2.symbol.truelist.get(i));}

   Symtables.stack.peek().add($symbol);
   Symbol.add($symbol);

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
        Symbol.add($symbol);
    }

    Instructions.list.add(instruction);
    Instructions.arrayRead=true;

}
;

m returns [Symbol symbol]:
{
    $symbol = new Symbol();
    $symbol.type = Types.LABEL;
    $symbol.name = "L"+ (++count);
    Symtables.stack.peek().add($symbol);
    Symbol.add($symbol);
}
;

n returns [List<Instructions> nextlist]:
{
    $nextlist = new ArrayList();
    Instructions instruction = new Instructions(-1,-1,-1,Opcode.GOTO);
    Instructions.list.add(instruction);
    $nextlist.add(instruction);
};

k returns [Symbol symbol]:
{
    $symbol = new Symbol();
};

num returns [String string]
: DecNum {$string = $DecNum.text;}
| HexNum {$string = $HexNum.text;}
;

literal returns[String string, Symbol symbol]
: num{$string = $num.string;
    $symbol = new Symbol();
    $symbol.name = $num.string;
    $symbol.scope = Scope.CONST;
    $symbol.type=Types.INT;
    $symbol.tabid = Symtables.stack.peek().id;

    Symtables.stack.peek().add($symbol);
    Symbol.add($symbol);
}
| Char {$string=$Char.text;
    $symbol = new Symbol();
    $symbol.name = $Char.text;
    $symbol.scope = Scope.CONST;
    $symbol.type=Types.CHAR;
    $symbol.tabid = Symtables.stack.peek().id;

    Symtables.stack.peek().add($symbol);
    Symbol.add($symbol);
}
| BoolLit {$string=$BoolLit.text;
    $symbol = new Symbol();
    $symbol.name = $BoolLit.text;
    $symbol.scope = Scope.CONST;
    $symbol.type=Types.BOOL;
    $symbol.tabid = Symtables.stack.peek().id;

    Symtables.stack.peek().add($symbol);
    Symbol.add($symbol);
}
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




