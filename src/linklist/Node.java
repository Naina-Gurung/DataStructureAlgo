package linklist;

/**
 * Created by z002gh2 on 2/26/19.
 */
public class Node {
    public String data;
    public Node next;


    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(String data) {
        super();
        this.data = data;
        this.next = null;
    }
}
