package checklist;


import linklist.LinkedList;
import linklist.Node;

public class LinkedListMergeTwoLinkedLists {
    public static void main(String[] args) {
        LinkedList list1= new LinkedList();
        list1.insertAtLast("A");
        list1.insertAtLast("B");
        list1.insertAtLast("C");
        list1.insertAtLast("D");
        list1.insertAtLast("E");
        list1.insertAtLast("F");
        list1.insertAtLast("G");

        LinkedList list2 = new LinkedList();
        list2.insertAtLast("B");
        list2.insertAtLast("D");
        list2.insertAtLast("G");
        list2.insertAtLast("K");

        System.out.println("Linked list 1: " );
        list1.printList();
        System.out.println("Linked list 2: " );
        list2.printList();

        Node mergeNode= mergelist(list1.head,list2.head);
        System.out.println("Merge Linked list is:");
        while (mergeNode != null){
            System.out.print(mergeNode.data + " ");
            mergeNode = mergeNode.next;
        }

    }

    public static Node mergelist(Node head1, Node head2){
        Node curr1 = head1;
        Node curr2 = head2;
        Node dummy = new Node("");
        Node tail = dummy;


        while(true){
            if(curr1 == null){
                tail.next=curr2;
                break;
            }
            if(curr2 == null){
                tail.next = curr1;
                break;
            }

            int res= compareList(curr1.data.charAt(0),curr2.data.charAt(0));
            if(res<0){
                tail.next= curr1;
                curr1 = curr1.next;
            }
            else if(res ==0){
                tail.next=curr2;
                curr2= curr2.next;
                tail = tail.next;
                tail.next=curr1;
                curr1=curr1.next;
            }else{
                tail.next=curr2;
                curr2 = curr2.next;
            }
            tail=tail.next;
        }
        return dummy.next;
    }

    public static int compareList(Character c1, Character c2){
        return(Character.toLowerCase(c1)-Character.toLowerCase(c2));
    }
}
