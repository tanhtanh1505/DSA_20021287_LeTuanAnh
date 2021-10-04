package Week4;

public class Reverse {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if(head == null || head.next == null) return head;
        SinglyLinkedListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
