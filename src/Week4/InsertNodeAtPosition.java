package Week4;

public class InsertNodeAtPosition {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        if(position == 0){
            SinglyLinkedListNode p = new SinglyLinkedListNode(data);
            p.next = head;
            return p;
        }
        else{
            head.next = insertNodeAtPosition(head.next, data, position - 1);
        }
        return head;
    }
}
