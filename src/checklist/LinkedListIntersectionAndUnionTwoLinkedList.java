package checklist;


import java.util.*;

public class LinkedListIntersectionAndUnionTwoLinkedList {
    LNode head;
    LNode tail;
    public static void main(String[] args) {
        LinkedListIntersectionAndUnionTwoLinkedList list1= new LinkedListIntersectionAndUnionTwoLinkedList();
        list1.insertAtLast(3);
        list1.insertAtLast(2);
        list1.insertAtLast(4);
        list1.insertAtLast(1);
        list1.insertAtLast(5);

        System.out.println("First linked list is : ");
        list1.printList();

        LinkedListIntersectionAndUnionTwoLinkedList list2= new LinkedListIntersectionAndUnionTwoLinkedList();
        list2.insertAtLast(4);
        list2.insertAtLast(2);
        list2.insertAtLast(5);
        list2.insertAtLast(7);
        list2.insertAtLast(5);

        System.out.println("Second Linked list is: ");
        list2.printList();

        LinkedListIntersectionAndUnionTwoLinkedList intr= new LinkedListIntersectionAndUnionTwoLinkedList();

        intr=intr.intersectlist(list1.head,list2.head);
        System.out.println("Intersection of two lists is: ");
        intr.printList();

        LinkedListIntersectionAndUnionTwoLinkedList unin= new LinkedListIntersectionAndUnionTwoLinkedList();

        unin=unin.unionList(list1.head,list2.head);
        System.out.println("Union of two lists is: ");
        unin.printList();


    }

    LinkedListIntersectionAndUnionTwoLinkedList intersectlist(LNode head1, LNode head2){
        LNode curr1= head1;
        LNode curr2= head2;

        LinkedListIntersectionAndUnionTwoLinkedList result= new LinkedListIntersectionAndUnionTwoLinkedList();
        HashSet<Integer> hset=new HashSet<>();

        while(curr1 !=null){
            hset.add(curr1.data);
            curr1=curr1.next;
        }

        while (curr2!=null){
            if(hset.contains(curr2.data)){

                result.insertAtLast(curr2.data);
            }
            curr2=curr2.next;
        }
return result;

    }

    LinkedListIntersectionAndUnionTwoLinkedList unionList(LNode head1, LNode head2){
        LNode curr1= head1;
        LNode curr2= head2;

        LinkedListIntersectionAndUnionTwoLinkedList result= new LinkedListIntersectionAndUnionTwoLinkedList();
        HashMap<Integer,Integer> hmap=new HashMap<>();

        while(curr1!=null){
            hmap.put(curr1.data,1);
            curr1=curr1.next;
        }

        while(curr2!=null){
            hmap.put(curr2.data,1);
            curr2=curr2.next;
        }

       // System.out.println(hmap);
        for(int a:hmap.keySet()){
            result.insertAtLast(a);
        }

        return result;
    }

 LNode insertAtLast(int data){
        LNode temp=new LNode(data);
         if(null == tail){
             tail=temp;
             head=tail;
         }else{
             tail.next=temp;
             tail=tail.next;
         }
         return tail;
    }

 void printList(){
        LNode current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }

    }
}

class LNode{
    int data;
    public LNode next;

    public LNode(int data) {
        super();
        this.data = data;
        this.next = null;
    }
}

/*    First linked list is :
        3
        2
        4
        1
        5
        Second Linked list is:
        4
        2
        5
        7
        5
        Intersection of two lists is:
        4
        2
        5
        5
        Union of two lists is:
        1
        2
        3
        4
        5
        7
*/