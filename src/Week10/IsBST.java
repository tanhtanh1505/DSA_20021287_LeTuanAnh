package Week10;

import Week9.Node;

public class IsBST {
    boolean checkNode(Node n,int min,int max) {
        if (n == null) return true;
        if (n.data <= min || n.data >= max) return false;
        return checkNode(n.left, min, n.data) && checkNode(n.right, n.data, max);
    }

    boolean checkBST(Node root) {
        return checkNode(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
