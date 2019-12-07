package checklist;

import linklist.LinkedList;
import linklist.Node;

public class LinkedListReverseLastXnodes {

    public static void main(String[] args) {
        LinkedList ls= new LinkedList();
        ls.insertAtLast("1");
        ls.insertAtLast("2");
        ls.insertAtLast("3");
        ls.insertAtLast("4");
        ls.insertAtLast("5");
        ls.insertAtLast("6");
        ls.insertAtLast("7");
        System.out.println("the current list is:");
        printlist(ls.head);
        Node newNode=reverseLastX(ls.head,5);
        System.out.println("reverse list is:");
        printlist(ls.head);
    }

    public static void printlist(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    public static Node reverseLastX(Node head, int X){
        Node curr1=head;
        int length=0;
        //finding the length of the list
        while (curr1 != null) {
            curr1 = curr1.next;
            length=length+1;
        }
        //re-initializing to head as we got the counter
        curr1=head;
       // System.out.println("length of the current list is:" + length);
        //move curr1 to length -X node
        for(int i=0;i<length-X-1;i++){
            curr1=curr1.next;
        }
        System.out.println("curr1 is:" +curr1.data);
        Node prev=null;
        Node curr2=curr1.next;
        Node following=curr2;

        while(curr2 !=null){
            following=following.next;
            curr2.next=prev;
            prev=curr2;
            curr2=following;
        }

        curr1.next=prev;

        return head;
    }

}
