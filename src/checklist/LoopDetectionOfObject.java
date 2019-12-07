package checklist;




public class LoopDetectionOfObject {
    public static void main(String[] args) {

        LinkedList empList= new LinkedList();
        Node t1=empList.insertAtLast(new TreeEmployee(101,"Naina","Senior Engineer"));
        Node t2=empList.insertAtLast(new TreeEmployee(102,"Tushar","Data Engineer"));
        Node t3=empList.insertAtLast(new TreeEmployee(103,"Sikha","Professor"));
        Node t4=empList.insertAtLast(new TreeEmployee(104,"Lambu","Engineer"));
        Node t5=empList.insertAtLast(new TreeEmployee(105,"Sikhar","Manager"));
        t5.next=t3;
        detectLoop(empList.head);

    }

    public static Node detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        Boolean loop = false;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loop = true;
                System.out.println("Loop exists!!");
                break;
            }
        }
        if (loop == true) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            System.out.println("The intersection point is : " + fast.data.e_id + "," + fast.data.e_name + "," + fast.data.designation);
            return fast;

        }
        return fast;
    }
}
