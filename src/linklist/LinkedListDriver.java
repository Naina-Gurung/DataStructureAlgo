package linklist;


import linklist.LinkedList;

/**
 * Created by z002gh2 on 2/26/19.
 */
public class LinkedListDriver {

    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        list.insertAtLast("A");
        list.insertAtLast("B");
        list.insertAtLast("C");
        list.insertAtLast("D");
        list.insertAtLast("E");
        list.insertAtLast("F");
        list.insertAtLast("G");
        list.printListReverse();
        /*System.out.println("After deleting the last node, output is:");
        list.deleteAtLast();
        list.printList();
        System.out.println("If we insert R after B, then output is:");
        list.insertAfterCertainNode("B","R");
        list.printList();

        System.out.println("Delete one node after C");
        list.deleteAfterNode("C");
        list.printList();*/
    }

}
