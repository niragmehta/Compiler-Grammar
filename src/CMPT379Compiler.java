
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CMPT379Compiler
{

    public static File symbolFile;
    public static File instructionFile;
    public static File symtableFile;

    public static List<Symbol> symbols;
    public static List<Instructions> instructions;
    public static List<Symtable> symtables;

    public static HashMap<Integer,Symbol> globalVars;

    public static void main(String args[])
    {
        String  folderLocation = args[0];
        symbolFile = new File(folderLocation + "/symbols.csv");
        instructionFile = new File(folderLocation + "/instructions.csv");
        symtableFile = new File(folderLocation + "/symtables.csv");
        //symtableFile = new File("/Users/niragmehta/IdeaProjects/Assignment1_379/src/main/antlr/symtables.csv");
        symbols = new ArrayList<Symbol>();
        instructions = new ArrayList<Instructions>();
        symtables = new ArrayList<Symtable>();

        globalVars = new HashMap<Integer, Symbol>();

        scan();
        printBeginning();
        printGlobals();
        scanMain();

    }

    public static void printBeginning(){
        System.out.println(".globl main #exports symbol main\n" +
                          ".data #global data section");
    }

    public static void printGlobals()
    {
        for(int i = 0; i< symbols.size();i++)
        {
            Symbol symbol = symbols.get(i);
            //initialized variable eg: int a = 8;
            if(symbol.scope.equals("GLOBAL") && ( symbol.type.equals("INT") || symbol.type.equals("BOOL") ) && symbol.isInited)
            {
                globalVars.put(symbol.id,symbol);
                if(symbol.type.equals("INT"))
                    System.out.print(symbol.name + ": .quad " + symbol.i +"\n");
                else
                    System.out.print(symbol.name + ": .quad " + symbol.b + "\n");
            }
            //array declaration eg: int a[7];
            else if(symbol.scope.equals("GLOBAL") && ( symbol.type.equals("INT") || symbol.type.equals("BOOL")) && symbol.isArray )
            {
                globalVars.put(symbol.id,symbol);
                System.out.print(symbol.name + ": .quad ");
                int size = Integer.parseInt(symbol.arrSize);
                for(int j=0;j<size;j++) {
                    if(j==size-1){
                        System.out.print("0");
                        break;
                    }
                    System.out.print("0, ");
                }
                System.out.println();

            }
            //non initialized variable eg: int a; also prevent from printing function definition
            else if(symbol.scope.equals("GLOBAL") && !symbol.type.equals("LABEL")){
                globalVars.put(symbol.id,symbol);
                System.out.println(symbol.name + ":\t.quad");
            }
        }

        System.out.println("\t.text");

    }

    public static int findMainPosition()
    {
        for(int i=symbols.size()-1;i>=0;i--)
        {
            if(symbols.get(i).name.equals("main"))
                return i;
        }
        return -1;
    }

    public static void scanMain()
    {

        System.out.println("main:");
        int index = findMainPosition();

        //assume there is atleast 1 symbol within main
        int mainTabId = symbols.get(index+1).tabid;

        //starting offset value for all local variables
        int offsetValue = 0;

        HashMap<Symbol,Integer> offset = new HashMap<Symbol, Integer>();
        HashMap<Integer,Symbol> locals = findLocals(index,mainTabId,offset , offsetValue);
        List<Instructions> localInstructions = scanInstructions(locals);

        System.out.println("push %rbp");
        System.out.println("mov %rsp, %rbp");
        System.out.println("sub $" + (locals.size())*16 + ", %rsp");

        //execute instructions
        executeInstructions(localInstructions,locals,offset);



    }

    //to find local variables declared in function block
    public static HashMap<Integer,Symbol> findLocals(int index, int tabid , HashMap<Symbol,Integer> offset, int offsetValue)
    {
        HashMap<Integer,Symbol> locals = new HashMap<Integer, Symbol>();
        for(int i = index ;i<symbols.size();i++)
        {
            if(symbols.get(i).tabid == tabid && (symbols.get(i).scope.equals("LOCAL") || symbols.get(i).scope.equals("CONST")) &&  (symbols.get(i).type.equals("INT") || symbols.get(i).type.equals("BOOL") ) )
            {
                locals.put(symbols.get(i).id,symbols.get(i));

                if(!symbols.get(i).scope.equals("CONST"))
                    offsetValue+=16;
                offset.put(symbols.get(i),offsetValue);
            }
        }

        return locals;
    }

    //to find all local instructions within the function block.
    public static List<Instructions> scanInstructions(HashMap<Integer,Symbol> locals)
    {
        List<Instructions> localInstructions = new ArrayList<Instructions>();

        //we assume the instructionSymbols like T1, T2.. are LABELS and that both hashmaps were populated correctly
        for(int i=0;i<instructions.size();i++)
        {
            if( locals.get(instructions.get(i).op1)!=null )
                localInstructions.add(instructions.get(i));
            else if(locals.get(instructions.get(i).op2)!=null)
                localInstructions.add(instructions.get(i));
            else if(locals.get(instructions.get(i).res)!=null)
                localInstructions.add(instructions.get(i));
            else if(instructions.get(i).opc.equals("CALL"))
                localInstructions.add(instructions.get(i));

        }
        return localInstructions;
    }

    public static void executeInstructions(List<Instructions> localInstructions , HashMap<Integer,Symbol> locals, HashMap<Symbol,Integer> offset)
    {
        for(int i=0;i<localInstructions.size();i++)
        {

            Symbol op1= new Symbol(), op2 = new Symbol(), res = new Symbol();
            //a=1 for local vars, a=2 for literal values like $7, a=3 for global vars like $a
            int a = 0,b = 0, c = 0;
            if(localInstructions.get(i).op1!=-1) {
                if (locals.get(localInstructions.get(i).op1) != null) {
                    op1 = locals.get(localInstructions.get(i).op1);
                    a=1;
                    if(locals.get(localInstructions.get(i).op1).scope.equals("CONST"))
                        a=2;
                }
                else if(globalVars.get(localInstructions.get(i).op1) != null) {
                    op1 = globalVars.get(localInstructions.get(i).op1);
                    a=3;
                }
            }
            if(localInstructions.get(i).op2!=-1) {
                if (locals.get(localInstructions.get(i).op2) != null) {
                    op2 = locals.get(localInstructions.get(i).op2);
                    b=1;
                    if(locals.get(localInstructions.get(i).op2).scope.equals("CONST"))
                        b=2;
                }
                else if(globalVars.get(localInstructions.get(i).op2) != null) {
                    op2 = globalVars.get(localInstructions.get(i).op2);
                    b=3;
                }
            }
            if(localInstructions.get(i).res!=-1) {
                if (locals.get(localInstructions.get(i).res) != null) {
                    res = locals.get(localInstructions.get(i).res);
                    c=1;
                    if(locals.get(localInstructions.get(i).res).scope.equals("CONST"))
                        c=2;
                }
                else if(globalVars.get(localInstructions.get(i).res) != null) {
                    res = globalVars.get(localInstructions.get(i).res);
                    c=3;
                }
            }

            if(localInstructions.get(i).opc.equals("ADD") || localInstructions.get(i).opc.equals("SUB") ||
                    localInstructions.get(i).opc.equals("MUL") || localInstructions.get(i).opc.equals("DIV") )
            {

                if(a==1)
                    System.out.println("mov -" + offset.get(op1) + "(%rbp), %rax");
                else if(a==2 || a==3)
                    System.out.println("mov $"+op1.name + ", %rax");
                if(b==1)
                    System.out.println("mov -"+ offset.get(op2) + "(%rbp), %rbx");
                else if(b==2 || b==3)
                    System.out.println("mov $"+op2.name + ", %rbx");

                if(localInstructions.get(i).opc.equals("ADD"))
                    System.out.println("add %rbx, %rax");
                else if(localInstructions.get(i).opc.equals("SUB"))
                    System.out.println("sub %rbx, %rax");
                else if(localInstructions.get(i).opc.equals("MUL"))
                    System.out.println("mulq %rbx");
                else if(localInstructions.get(i).opc.equals("DIV"))
                    System.out.println("divq %rbx");

                if(c==1){
                    System.out.println("mov %rax, -"+offset.get(res)+"(%rbp)");
                }
                else if(c==2 || c==3){
                    System.out.println("mov %rax, $" + res.name);
                }
            }
            if(localInstructions.get(i).opc.equals("ASSIGN"))
            {
                if(a==1 && c==1) {
                    System.out.println("movq -" + offset.get(op1) + "(%rbp), %rax");
                    System.out.println("movq %rax, -" + offset.get(res) + "(%rbp)");
                }
                else if(a==1 && (c==2 ||c==3)) {
                    System.out.println("movq -" + offset.get(op1) + "(%rbp), %rax");
                    System.out.println("movq %rax, " + res.name);
                }
                else if((a==2||a==3) && c==1) {
                    System.out.println("movq $" + op1.name + ", %rax");
                    System.out.println("movq %rax, -" + offset.get(res) + "(%rbp)");
                }
                else if((a==2||a==3) && (c==2||c==3)) {
                    System.out.println("movq $" + op1.name + ", %rax");
                    System.out.println("movq %rax, " + res.name);
                }
            }
            //we assume op2 is a literal value for array reads
            if(localInstructions.get(i).opc.equals("READ"))
            {
                //we know a/op1 is global (guaranteed)
                System.out.println("movq $"+op1.name+" , %rcx");

                //b is a literal
                if(b==2 && c==1)
                {
                    System.out.println("movq -"+Integer.parseInt(op2.name)*16+"(%rcx), %rax");
                    System.out.println("movq %rax, -" + offset.get(res) + "(%rbp)");
                }
                if(b==2 && c==3)
                {
                    System.out.println("movq -"+Integer.parseInt(op2.name)*16+"(%rcx), " + res.name);
                }
            }
            if(localInstructions.get(i).opc.equals("CALL"))
            {
                //we want to remove the call instruction since we won't be calling it again
                removeCall(localInstructions.get(i).id);
                scanFunction(localInstructions.get(i).op1);

            }
            if(localInstructions.get(i).opc.equals("RET"))
            {
                if(a==1) {
                    System.out.println("add $" + (locals.size())*16 + ", %rsp");
                    System.out.println("pop %rbp");

                    System.out.println("movq -" + offset.get(op1)+"(%rcx) , %rax");
                    System.out.println("ret");
                }
                if(a==2 || a==3)
                {

                    System.out.println("add $" + (locals.size())*16 + ", %rsp");
                    System.out.println("movq $"+op1.name+", %rax");

                    System.out.println("pop %rbp");
                    System.out.println("ret");
                }

            }

        }

    }

    public static void removeCall(int id)
    {
        int index=0;
        for(int i=0;i<instructions.size();i++)
        {
            if(instructions.get(i).id==id)
            {index=i;}
        }
        instructions.remove(index);
    }

    public static int findFuncTabId(int id)
    {
        int index=0;
        for(int i=0;i<symbols.size();i++)
        {
            if(symbols.get(i).id==id)
            {
                ++index;
                break;
            }
            else if(symbols.get(i).scope.equals("GLOBAL") && symbols.get(i).type.equals("LABEL"))
                ++index;
        }
        int tabid = 0;
        for(int i=0;i<symtables.size();i++)
        {
            if(symtables.get(i).parentId>1)
                continue;
            if(symtables.get(i).parentId==1 && index>1)
                --index;
            else if(symtables.get(i).parentId==1 && index==1)
            {
                tabid = symtables.get(i).id;
                return symtables.get(i).id;
            }

        }
        return tabid;

    }

    public static void scanFunction(int index)
    {
        //assume there is atleast 1 symbol within func
        int funcTabId = findFuncTabId(index);

        //starting offset value for all local variables
        int offsetValue = 0;

        HashMap<Symbol,Integer> offset = new HashMap<Symbol, Integer>();
        HashMap<Integer,Symbol> locals = findLocals(index, funcTabId, offset , offsetValue);
        List<Instructions> localInstructions = scanInstructions(locals);

        System.out.println();
        System.out.println("push %rbp");
        System.out.println("mov %rsp, %rbp");
        System.out.println("sub $" + (locals.size())*16 + ", %rsp");

        //execute instructions
        executeInstructions(localInstructions,locals,offset);

//        System.out.println("add $" + (locals.size())*16 + ", %rsp");
//        System.out.println("pop %rbp");
        System.out.println();

    }

    //scans the csv and creates lists of symbols, symtables and instructions
    public static void scan(){

        try {
            Scanner scanSymbols = new Scanner(symbolFile);
            Scanner scanInstructions = new Scanner(instructionFile);
            Scanner scanSymtable = new Scanner(symtableFile);

            //remove when submitting. She wont have first line header in any of the csvs
            scanSymbols.next();
            scanInstructions.next();
            scanSymtable.next();

            while (scanSymbols.hasNext())
            {
                String line = scanSymbols.next();
                String[] array = line.split(",");
                Symbol symbol = new Symbol();

                symbol.id = Integer.parseInt(array[0]);
                symbol.tabid = Integer.parseInt(array[1]);
                symbol.name = array[2];
                symbol.type = array[3];
                symbol.scope = array[4];
                symbol.isArray = Boolean.parseBoolean(array[5]);
                symbol.arrSize = array[6];
                symbol.isInited = Boolean.parseBoolean(array[7]);
                symbol.i = Integer.parseInt(array[8]);

                try {
                    symbol.b = Boolean.parseBoolean(array[9]);
                }catch (Exception e){}
                symbols.add(symbol);
            }

            while (scanInstructions.hasNext())
            {
                String line = scanInstructions.next();

                String[] array = line.split(",");
                Instructions instruction = new Instructions();

                instruction.id = Integer.parseInt(array[0]);
                instruction.res = Integer.parseInt(array[1]);
                instruction.opc = array[2];
                instruction.op1 = Integer.parseInt(array[3]);
                instruction.op2 = Integer.parseInt(array[4]);

                instructions.add(instruction);
            }
            while (scanSymtable.hasNext())
            {
                String line = scanSymtable.next();

                String[] array = line.split(",");
                Symtable symtable = new Symtable();
                symtable.id = Integer.parseInt(array[0]);
                symtable.parentId = Integer.parseInt(array[1]);

                symtables.add(symtable);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }

//end of class
}


//from A3
class Symbol
{
    public int id;
    public int tabid;
    public String name;
    public boolean isArray;
    public boolean isInited;
    public String arrSize;
    public String type;
    public String scope;

    int i;
    boolean b;

    public Symbol(){}

}
class Instructions
{
    public int id;
    public int res;
    public String opc;
    public int op1;
    public int op2;

    Instructions(){}

}

class Symtable
{
    public int id;
    public int parentId;

    Symtable()
    {
    }

}