package checklist;

import linklist.LinkedList;
import linklist.Node;

public class LinkedListDeleteNodeGreaterThanX {

    public static void main(String[] args) {
        LinkedList list= new LinkedList();

        list.addNodeBeginning("5");
        list.addNodeBeginning("2");
        list.addNodeBeginning("6");
        list.addNodeBeginning("3");
        list.addNodeBeginning("8");

        System.out.println("Current List is:");
        list.printList();

        Node newHead = deleteNodeGrtX(list.head , 4);

        System.out.println("Head is: " + newHead.data);

    }

    public static  Node deleteNodeGrtX( Node head, int X){

        Node current= head;
        Node prev=head;
        int i=0;
        while(current != null){

            if(Integer.parseInt(current.data) > X){
                prev.next = current.next;
                current= current.next;

                if(i==0){
                    head=current;
                }
            }
            else {
                prev= current;
                current=current.next;
                i++;
            }
        }
        return head;
    }
}
