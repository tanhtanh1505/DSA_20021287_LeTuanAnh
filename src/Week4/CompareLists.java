package Week4;

public class CompareLists {
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1 == null && head2 == null) return true;
        else if(head1 == null || head2 == null) return false;

        if(head1.data == head2.data) return compareLists(head1.next, head2.next);
        else return false;
    }
}
