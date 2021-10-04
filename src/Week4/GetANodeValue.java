package Week4;

public class GetANodeValue {
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        SinglyLinkedListNode result = llist;
        for(SinglyLinkedListNode p = llist; p.next != null; p = p.next){
            positionFromTail--;
            if(positionFromTail < 0){
                result = result.next;
            }
        }
        return result.data;
    }
}
