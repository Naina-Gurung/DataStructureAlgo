package stack;

import java.util.Stack;

public class BalanceCharSeq {

    public static void main(String[] args) {

        boolean isBalanced = false;

        Stack<Character> st = new Stack<>();

        String str = "{[(])}";

        if (str.isEmpty() || str.length() % 2 != 0) {
            System.out.println("String is not balanced");
        } else {

            int len = str.length();
            for (int i = 0; i < len; i++) {
                char incomingChar = str.charAt(i);

                if (incomingChar == '[' || incomingChar == '(' || incomingChar == '{') {
                    st.push(incomingChar);
                } else {
                    if (st.isEmpty()) {
                        isBalanced = false;
                        break;
                    }

                    char stChar = st.pop();
                    isBalanced = checkBalance(incomingChar, stChar);
                    if ( !isBalanced ){
                        break;
                    }

                }
            }

            if (isBalanced && st.isEmpty()) {
                System.out.println("String is balanced");
            } else {
                System.out.println("String is not balanced");
            }
        }
    }

    static boolean checkBalance(char incomingChar, char stChar) {
        boolean balance = false;
        if (incomingChar == '}' && stChar == '{') {
            balance = true;
        } else if (incomingChar == ')' && stChar == '(') {
            balance = true;
        } else if (incomingChar == ']' && stChar == '[') {
            balance = true;
        }
        return balance;
    }
}
