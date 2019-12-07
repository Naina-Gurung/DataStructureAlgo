package stack;

import java.util.*;
import java.util.Stack;
/**
 * Created by z002gh2 on 2/17/19.
 */
public class MaximumElement {


    Stack<Integer> st= new Stack<>();
    Stack<Integer> maxst= new Stack<>();

    public void push(int data){
        st.push(data);
        if(maxst.isEmpty()){
            maxst.push(data);
        }else {
            int temp = maxst.peek();
            if(data >= temp){
                maxst.push(data);
            }
        }
    }

    public int pop(){
        int data = st.pop();
        if(data == maxst.peek()){
            maxst.pop();
        }
        return data;
    }

    public int maxm(){
        return maxst.peek();
    }


    public static void main(String[] args) {

        MaximumElement obj = new MaximumElement();


            Scanner sc= new Scanner(System.in);
            System.out.println("Enter no of  input: ");
            int n = sc.nextInt();

        while(n>0){
            int choice = sc.nextInt();
            if (choice == 1) {
                int data = sc.nextInt();
                obj.push(data);
                    }
            else if(choice ==2){
                obj.pop();

            }
            else if(choice ==3){
                System.out.println(obj.maxm());
            }
            else{
                System.out.println("should have input from 1,2 and 3");
            }
            n--;
            }
        }

}
