package checklist;

import linklist.LinkedList;
import linklist.Node;

//import java.util.LinkedList;


public class LinkedListReverseListWithoutUsingCollections {
    /*public static void main(String[] args) {
        String str="";
        LinkedList<String> list= new java.util.LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        System.out.println(list.size());
        Iterator it= list.iterator();
        while(it.hasNext()){
            str +=it.next();
        }
        System.out.println("String is: " + str);
        System.out.println("Reverse list is:");
        for(int i=str.length()-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }

*/
   /* public static void main(String[] args) {
      LinkedList mylist= new LinkedList();
        mylist.insertAtLast("A");
        mylist.insertAtLast("B");
        mylist.insertAtLast("C");
        mylist.insertAtLast("D");
        mylist.insertAtLast("E");
        mylist.insertAtLast("F");
        System.out.println("Current List is:");
        mylist.printList();
        System.out.println("Reverse List is:");
        reverseprint(mylist.head);
    }
    public static void reverseprint(Node head){
        Node curr=head;
        if(curr==null){
            System.out.println("List has ended");
            return;
        }
        else{
            if(curr.next==null){

            }
            else{
                reverseprint(curr.next);
            }
        }
        System.out.println(curr.data);
    }
    */

    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();
        mylist.insertAtLast("A");
        mylist.insertAtLast("B");
        mylist.insertAtLast("C");
        mylist.insertAtLast("D");
        mylist.insertAtLast("E");
        mylist.insertAtLast("F");
        System.out.println("Current List is:");
        printlist(mylist.head);

        Node newhead = reverselist(mylist.head);
        System.out.println("reverse List is:");
        printlist(newhead);

    }


    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static Node reverselist(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node following = curr.next;
            curr.next = prev;
            prev = curr;
            curr = following;

        }
        return prev;
    }
}
