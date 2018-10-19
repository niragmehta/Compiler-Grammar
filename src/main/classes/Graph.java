package main.classes;

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



//    public void printGraph(Node node)
//    {
//        System.out.println(node.getName()+"(");
//        if(node.getEdges().isEmpty())
//            return;
//
//        for(int i=0;i<root.getEdges().size();i++)
//        {
//            printGraph(node.getEdges().get(i));
//        }
//        System.out.println(")");
//    }

}
