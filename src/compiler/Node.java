public class Node {


    private String name;
    private String parent;

    public Node(){
    }

    public Node(String name){
    }

    public Node(String name , String parent){
        this.name = name;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}
