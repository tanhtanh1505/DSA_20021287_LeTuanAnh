package Week4;

import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class DoublyLinkedListNode {
    public int data;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }

        this.tail = node;
    }
}

class DoublyLinkedListPrintHelper {
    public static void printList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}

class Result {

    /*
     * Complete the 'sortedInsert' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_DOUBLY_LINKED_LIST llist
     *  2. INTEGER data
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
        if(llist.next == null){
            DoublyLinkedListNode p = new DoublyLinkedListNode(data);
            p.next = llist.next;
            p.prev = llist;
            llist.next = p;

        }
        else if(llist.prev == null && data <= llist.data){
            DoublyLinkedListNode p = new DoublyLinkedListNode(data);
            llist.prev = p;
            p.next = llist;
            p.prev = null;
            return p;
        }
        else if(data >= llist.data && data <= llist.next.data){
            DoublyLinkedListNode p = new DoublyLinkedListNode(data);
            p.next = llist.next;
            p.prev = llist;
            llist.next.prev = p;
            llist.next = p;
        }
        else sortedInsert(llist.next, data);
        return llist;

    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                DoublyLinkedList llist = new DoublyLinkedList();

                int llistCount = Integer.parseInt(bufferedReader.readLine().trim());

                IntStream.range(0, llistCount).forEach(i -> {
                    try {
                        int llistItem = Integer.parseInt(bufferedReader.readLine().trim());

                        llist.insertNode(llistItem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int data = Integer.parseInt(bufferedReader.readLine().trim());

                DoublyLinkedListNode llist1 = Result.sortedInsert(llist.head, data);

                DoublyLinkedListPrintHelper.printList(llist1, " ", bufferedWriter);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
