package stack;

import java.util.Scanner;
import java.util.Stack;


/**
 * Created by z002gh2 on 2/17/19.
 */
public class SimpleTextEditor {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int lmt=sc.nextInt();
        String currentString ="";
        Stack<String> st= new Stack<>();

        while(lmt>0){
            int ch=sc.nextInt();
            switch (ch){
                case 1: //append
                    st.push(currentString);
                    String append=sc.next();
                    currentString +=append;
                    break;
                case 2: //erase the last x characters
                    st.push(currentString);
                    int charNum=sc.nextInt();
                    currentString=currentString.substring(0,currentString.length()-charNum);
                    break;
                case 3: //print the kth character of String
                    int k=sc.nextInt();
                    System.out.println(currentString.charAt(k-1));
                    break;
                case 4: //undo
                    currentString= st.pop();
                    break;
                default:
                    break;
            }
    lmt--;
        }
    }



}
