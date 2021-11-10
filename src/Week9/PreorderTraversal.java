package Week9;

import java.util.Stack;

public class PreorderTraversal {
    public static void preOrder(Node root) {
        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()){
            Node n = st.pop();
            System.out.print(n.data + " ");
            if(n.right != null)
                st.push(n.right);
            if(n.left != null)
                st.push(n.left);
        }
    }

//    public static void preOrder(Node root) {
//        Stack<Node> s
//        System.out.print(root.data + " ");
//        if(root.left != null)
//            preOrder(root.left);
//        if(root.right != null)
//            preOrder(root.right);
//
//    }
}
