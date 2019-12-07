package queue;

import java.util.Queue;
import java.util.LinkedList;

/**
 * Created by z002gh2 on 2/21/19.
 */
public class StackUsingQueue {

    Queue<Character> q= new LinkedList<>();

    public void enQueue(char data){
        if(q.isEmpty()){
            q.add(data);
        }else{
            int size = q.size();
            q.add(data);
            while(size>0){
                q.add(q.remove());
                size --;
            }

        }
    }

    public char deQueue(){
        return q.remove();
    }

    public static void main(String[] args) {
        StackUsingQueue st= new StackUsingQueue();

        st.enQueue('A');
        st.enQueue('B');
        st.enQueue('C');

        System.out.println(st.deQueue());
        System.out.println(st.deQueue());
        System.out.println(st.deQueue());

    }
}
