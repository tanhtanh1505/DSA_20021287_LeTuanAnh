package Week4;

class PrintElementLinkedList {
    static void printLinkedList(SinglyLinkedListNode head) {
        for(SinglyLinkedListNode p = head; p != null; p = p.next){
            System.out.println(p.data);
        }

        //if(head != null)
        //System.out.println(head.data);
        //printLinkedList(head.next);
    }
}
