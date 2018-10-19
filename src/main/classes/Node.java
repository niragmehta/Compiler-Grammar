package main.classes;

import java.util.ArrayList;
import java.util.List;

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
}
