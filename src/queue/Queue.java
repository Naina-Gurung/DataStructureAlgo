package queue;

/**
 * Created by z002gh2 on 2/9/19.
 */
public class Queue {
    int[] arr;
    int rear;
    int front;
    int maxSize;

    Queue(int size) {
        this.rear = -1;
        this.front = 0;
        arr = new int[size];
        this.maxSize = size;
    }

    public void enqueue(int data) {
        if (!isFull()) {
            arr[++rear] = data;
        } else

        {
            System.out.print("Queue is Full");
        }
    }

    public int dequeue() {
        int data = -1;
        if (!isEmpty()) {
            data = arr[front++];

        } else {
            System.out.println("Queue is Empty");
        }
        return data;
    }

    public boolean isEmpty() {
        boolean status = false;
        if ((rear == -1) || (front > rear)) {
            status = true;
        }

        if (front ==maxSize){
            front=0;
            rear=-1;
        }
        return status;

        //return (rear == -1);
    }

    public boolean isFull() {
        return (rear == (maxSize - 1));
    }


    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
        q.dequeue();
    }
}

