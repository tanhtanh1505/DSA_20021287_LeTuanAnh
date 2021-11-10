package Week9;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node current =queue.poll();
            System.out.print(current.data+" ");
            if(current.left!=null)
                queue.add(current.left);
            if(current.right!=null)
                queue.add(current.right);
        }

    }
}
