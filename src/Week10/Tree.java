package Week10;

import Week10.Node;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    static void insertNode(Node root, int parent, int newInt) {
        if(root.data ==parent){
            if(root.children == null){
                root.children = new ArrayList<>();
                root.children.add(new Node(root.data, root, null));
            } else{
                root.children.add(new Node(root.data, root, null));
            }

        } else {
            root.children.forEach(node -> insertNode(node, root.data, parent));
        }
    }

    static void delete(Node root, int key) {
        if(root.data == key){
            if(root.children == null){
                root.parent.children.remove(root);
            } else {
                root.data = root.children.get(0).data;
                root.children.addAll(root.children.get(0).children);
                root.children.remove(root.children.get(0));
            }
        }
        else {
            for(int i = 0; i < root.children.size(); i++){
                delete(root.children.get(i), key);
            }
        }
    }

    static boolean isBinaryTree(Node root) {
        if(root == null)
            return false;
        if(root.children != null){
            if(root.children.size() > 2){
                return false;
            }
            for(int i = 0; i < root.children.size(); i++){
                if(!isBinarySearchTree(root.children.get(i)))
                    return false;
            }
        }
        return true;
    }

    static boolean checkBST(Node n, int min, int max) {
        if (n == null) return true;
        if(n.children.size() > 2)
            return false;
        if(n.children.size() == 1)
            return checkBST(n.children.get(0), min, n.data);
        if (n.data <= min || n.data >= max) return false;
        return checkBST(n.children.get(0), min, n.data) && checkBST(n.children.get(1), n.data, max);
    }

    static boolean isBinarySearchTree(Node root) {
        return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    static public void preorder(Node root) {
        System.out.println(root + " ");
        root.children.forEach(Tree::preorder);
    }

    static public void postorder(Node root) {
        root.children.forEach(Tree::postorder);
        System.out.println(root + " ");
    }

    static boolean isMaxBinaryHeap(Node root) {
        return false;
    }

    static int height(Node root) {
        return 0;
    }

    static void print(Node root) {
        // In cây theo từng tầng một
    }

    public static void main(String[] args) {
    }
}