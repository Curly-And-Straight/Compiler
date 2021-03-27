package compiler;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TreeMaker {

    static ArrayList<Node> nodes = new ArrayList<>();
    static ArrayList<Node> queue = new ArrayList<>();


    Node root = new Node("Object");

    public TreeMaker(ArrayList<ArrayList<String>> tree) {

        nodes.add(root);

        for (ArrayList<String> pair : tree) {

            Node visited = isVisited(pair.get(1));
            Node newNode;

            if (visited == null) {
                Node unknown = new Node(nodes.get(0), pair.get(1));
                nodes.add(unknown);
                newNode = new Node(unknown, pair.get(0));
            } else
                newNode = new Node(visited, pair.get(0));

            nodes.add(newNode);
        }

        printTree();
    }

    public static Node isVisited(String arrivedNodeParentName){

        for (Node ele : nodes) {
            if (ele.name.equals(arrivedNodeParentName)){
                return ele;
            }
        }
        return null;
    }

    public static void printTree(){

        Node root = nodes.get(0);

        queue.add(root);

        while (!queue.isEmpty()){

            Node node = queue.get(0);
            queue.remove(0);
            getChildren(node);
        }
    }

    public static void getChildren(Node parent){

        System.out.print("Parent: " + parent.name + "  <------  " + " Children: ");
        for (Node node : nodes) {
            if (node.parent != null && node.parent.name.equals(parent.name)){
                queue.add(node);
                System.out.print(node.name + " ,");
            }
        }
        System.out.println();
    }
}
