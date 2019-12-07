package checklist;

import java.util.Stack;

public class StackSortUsingStack {
    public static void main(String[] args) {
        String inp="846179";

        Stack<Character> st1 = new Stack<Character>();
        Stack<Character> st2= new Stack<Character>();

        int len=inp.length();

        for(int i=0;i<len;i++){
            char curr=inp.charAt(i);
            if (st2.empty()){
                st2.push(curr);
            }
            else{
                while(!st2.empty()){
                    st1.push(st2.pop());
                }

                while(!st1.empty()){
                    if(curr < st1.peek()){
                        st2.push(curr);
                        while(!st1.empty()){
                            st2.push(st1.pop());
                        }

                    }
                    else{

                        st2.push(st1.pop());


                    }
                }
               if(curr > st2.peek()){
                   st2.push(curr);
               }
            }

        }

        while(!st2.empty()){
            System.out.println(st2.pop());
        }
    }
}
