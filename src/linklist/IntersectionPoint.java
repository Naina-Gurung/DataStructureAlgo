package linklist;


public class IntersectionPoint {


    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        Node t1 = list1.insertAtLast("A");
        Node t2 = list1.insertAtLast("B");
        Node t3 = list1.insertAtLast("C");
        Node t4 = list1.insertAtLast("D");
        Node t5 = list1.insertAtLast("E");
        Node t6 = list1.insertAtLast("F");

        list2.insertAtLast("G");
        Node x1=list2.insertAtLast("Y");
        x1.next=t4;
        intersectPoint(list1.head,list2.head);
    }


    public static Node intersectPoint( Node head1,  Node head2) {
        int len1 = 0;
        int len2 = 0;
        int diff = 0;


        Node curr1 = head1;
        Node curr2 = head2;

        while(curr1 != null){
            len1++;
            curr1 = curr1.next;

        }

        while(curr2 != null){
            len2++;
            curr2 = curr2.next;

        }

        System.out.println("length of list1 is " + len1);
        System.out.println("length of list2 is " + len2);

        if(len1>len2){
            curr1= head1;
            curr2= head2;
            diff = len1-len2;
        }else{
            curr1= head2;
            curr2=head1;
            diff= len2-len1;
        }


        System.out.println("difference in length:" + diff);

        for(int i=0; i<diff;i++){
            curr1= curr1.next;
        }

        while(curr1 != curr2 && curr1 !=null && curr2 !=null){
            curr1=curr1.next;
            curr2=curr2.next;
        }
        System.out.println("Intersection Point is : " + curr2.data);
        return curr2;
    }


}
