package compiler;


public class Node {

    public Node parent;
    public String name;

    public Node(Node parent, String name){
        this.parent = parent;
        this.name = name;
    }

    public Node(String name){
        this.name = name;
    }
}
