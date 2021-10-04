package Week4;

public class insertNodeAtHead {
    static SinglyLinkedListNode InsertNodeAtHead(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode p = new SinglyLinkedListNode(data);
        p.next = head;
        return p;
    }
}
