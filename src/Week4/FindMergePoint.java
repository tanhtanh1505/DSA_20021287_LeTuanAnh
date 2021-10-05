package Week4;

public class FindMergePoint {
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode p1 = head1;
        while(p1 != null){
            SinglyLinkedListNode p2 = head2;
            while(p2 != null){
                if(p2 == p1) return p2.data;
                p2 = p2.next;
            }
            p1 = p1.next;
        }
        return 0;
    }
}
