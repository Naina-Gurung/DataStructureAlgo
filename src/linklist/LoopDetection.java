package linklist;



public class LoopDetection {


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        Node t1 = list.insertAtLast("A");
        Node t2 = list.insertAtLast("B");
        Node t3 = list.insertAtLast("C");
        Node t4 = list.insertAtLast("D");
        Node t5 = list.insertAtLast("E");
        t5.next = t3;
        detectLoopAndReturnaNode(list.head);

    }

    public static Node detectLoopAndReturnaNode(Node head) {
        Node slow = head;
        Node fast = head;
        Boolean loop = false;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
             loop = true;
                System.out.println("Loop exists!!");
                break;
            }
        }
        if(loop == true){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            System.out.println("The intersection point is : " +fast.data);
            return fast;

        }
        return fast;
    }
}
