package queue;
import java.util.Stack;

public class QueueUsingStack {

    Stack<Character> st1 = new Stack<>();
    Stack<Character> st2 = new Stack<>();


    public void push(char data){
        if(st1.isEmpty()){
            st1.push(data);
        }else {
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            st1.push(data);
        }
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }

    public char pop(){
        return st1.pop();
    }

    public static void main(String[] args) {
        QueueUsingStack st = new QueueUsingStack();
        st.push('A');
        st.push('B');
        st.push('C');

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
