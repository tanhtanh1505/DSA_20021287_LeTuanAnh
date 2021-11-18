package Week10;

import Week9.Node;

public class HeightOfBinaryTree {
    public static int height(Node root) {
        return h(root) -1;
    }

    private static int h(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(h(root.left), h(root.right)) + 1;
    }
}
