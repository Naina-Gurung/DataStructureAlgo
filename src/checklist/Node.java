package checklist;

public class Node {
    public TreeEmployee data;
    public Node next;


    public void setData(TreeEmployee data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(TreeEmployee data) {
        super();
        this.data = data;
        this.next = null;
    }
}
