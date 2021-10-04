package Week4;

public class ReversePrint {
    public static void reversePrint(SinglyLinkedListNode llist) {
        if(llist.next != null){
            reversePrint(llist.next);
        }
        System.out.println(llist.data);
    }
}
