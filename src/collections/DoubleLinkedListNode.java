package collections;

public class DoubleLinkedListNode {
    private DoubleLinkedListNode prev;
    private DoubleLinkedListNode next;

    public static DoubleLinkedListNode reverse(DoubleLinkedListNode llist) {
        DoubleLinkedListNode current = llist;
        DoubleLinkedListNode temp = null;
        //1
        // 1 <-> 2 <-> 3 <-> 4 <-> 5
        // 5 <-> 4 <-> 3 <-> 2 <->1

        while(current!=null) {
            temp= current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if(temp != null) {
            return temp.prev;
        }
        return llist;
    }
}
