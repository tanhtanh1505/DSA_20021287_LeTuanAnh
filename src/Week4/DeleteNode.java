package Week4;

public class DeleteNode {
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(head == null) return null;
        if(position == 0){
            return head.next;
        }
        if(position == 1){
            head.next = head.next.next;
        }
        else{
            deleteNode(head.next, position - 1);
        }
        return head;

    }
}
