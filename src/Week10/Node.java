package Week10;

import java.util.List;

public class Node {
    int data;
    boolean visited;
    Node parent;
    List<Node> children;

    public Node(int data, Node parent, List<Node> children) {
        this.data = data;
        this.parent = parent;
        this.children = children;
        this.visited = false;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
