package Week4;

public class InsertNodeAtTail {
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if(head != null) {
            head.next = insertNodeAtTail(head.next, data);
        }
        else {
            SinglyLinkedListNode p = new SinglyLinkedListNode(data);
            return p;
        }
        return head;
    }
}
