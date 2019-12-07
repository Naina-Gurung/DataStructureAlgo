package linklist;

/**
 * Created by z002gh2 on 3/11/19.
 */
public class CircularLinkList {
   // static Node tail;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node t1 = list.insertAtLastWithoutTail("A");
        Node t2 = list.insertAtLastWithoutTail("B");
        Node t3 = list.insertAtLastWithoutTail("C");
        Node t4 = list.insertAtLastWithoutTail("D");
        Node t5 = list.insertAtLastWithoutTail("E");
        Node t6 = list.insertAtLastWithoutTail("F");
        t6.next=t1;
         Node tail=t6;
        //System.out.println("circular link list is: ");
        //list.printList();
        tail = insertNode(t6,"Y");
        System.out.println("After adding one node, circular link list is: ");
        printListCircular(tail);
    }

    public static  void printListCircular(Node tail){
        System.out.println("Tail passed in this method is "+tail.data);
        Node current = tail.next;
        while(current != tail){
            System.out.println(current.data);
            current= current.next;
        }
        System.out.println(current.data);
    }

    public static Node insertNode(Node tail,String data){
        Node newNode = new Node(data);
        Node head = tail.next;
        tail.next = newNode;
        newNode.next = head;
        tail= newNode;
        System.out.println("Tail after adding a node is :"+ tail.data);

        //tail.next = newNode ;
        //tail.next = newNode;
        //tail = newNode;
        //tail.next = newNode;

        //newwtail.next
return tail;
    }



}
