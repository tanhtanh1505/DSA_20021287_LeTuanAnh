package Week4;

public class DeleteDuplicate {
    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        SinglyLinkedListNode p = llist;
        if(p != null){
            while ( p.next != null) {
                if (p.data == p.next.data) {
                    p.next = p.next.next;
                }
                else p = p.next;
            }
        }
        return llist;
    }
}
