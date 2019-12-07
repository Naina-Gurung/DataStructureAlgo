package checklist;
class LinkedListAddNumToLinkedList {

    // To store the carry
    private static int carry = 0;

    // Function that calls the recursive method
    // addNewValue to add a digit to the
    // number represented as the linked list
    public static ListNode addValue(ListNode head, int addValue)
    {

        // Add the digit recursively
        addNewValue(head, addValue);

        // If there is a carry after the addition
        if (carry != 0) {

            // Create a new node
            ListNode newHead = new ListNode();

            // Assign it with carry
            newHead.value = carry;

            // Make it point to the head of
            // the linked list
            newHead.next = head;
            carry = 0;

            // Make it the new head
            return newHead;
        }

        // If there's not carry then
        // return the previous head
        else {
            return head;
        }
    }

    // Recursive function to add a digit to the number
    // represented as the given linked list
    private static void addNewValue(ListNode head, int addValue)
    {

        // If it is the last node in the list
        if (head.next == null) {

            // Add the digit
            int val = head.value + addValue;

            // Find the carry if any
            head.value = val % 10;
            carry = val / 10;
        }
        else {

            // Preserve the current node's value and call
            // the recursive function for the next node
            int val = head.value;
            addNewValue(head.next, addValue);
            val = val + carry;
            head.value = val % 10;
            carry = val / 10;
        }
    }

    // Utility function to print the linked list
    private static void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("NULL");
    }

    // Driver code
    public static void main(String[] args)
    {

        // Create the linked list 9 -> 9 -> 3 -> NULL
        ListNode head = new ListNode();
        head.value = 9;
        head.next =  new ListNode();
        head.next.value = 7;
        head.next.next = null;/*new ListNode();
        head.next.next.value = 3;
        head.next.next.next = null;*/

        // Digit to be added
        int n = 5;
        head = addValue(head, n);

        printList(head);
    }
}
class ListNode {
    int value;
    ListNode next;
}

