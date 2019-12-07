package linklist;

/**
 * Created by z002gh2 on 3/7/19.
 */
public class RotateList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtLast("A");
        list.insertAtLast("B");
        list.insertAtLast("C");
        list.insertAtLast("D");
        list.insertAtLast("E");
        list.insertAtLast("F");
        list.insertAtLast("G");
        System.out.println("Given linked list is:");
        list.printList();
        rotateList(list, 4);
        System.out.println("After rotation from the 4th node, the new list is:");
        list.printList();
    }

    public static LinkedList rotateList(LinkedList list, int pos){
        Node curr1 = list.head;
        int i=1;
        while(i != pos){
            curr1=curr1.next;
            i++;
        }
        Node curr2=curr1;
        while(curr2.next != null){
            curr2=curr2.next;
        }
        curr2.next=list.head;
        list.head=curr1.next;
        curr1.next=null;


        return list;
    }
}
