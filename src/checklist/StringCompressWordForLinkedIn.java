package checklist;
import java.util.*;

public class StringCompressWordForLinkedIn {

    public static void main(String[] args) {

        String word="abbcccb";
        int k =3;
        String result = compressWord(word,k);
        System.out.println(result);
    }

    static class element {
        char character;
        int occurence;
        element(char c, int o)
        {
            character = c;
            occurence = o;
        }
    }

    public static String compressWord(String word, int k){
        Stack<element> st = new Stack<element>();
        int n = word.length();

        int i = 0;
        for (i = 0; i < n; i++) {
            char x = word.charAt(i);

            if (st.size() > 0 && st.peek().occurence == k) {
                char curr = st.peek().character;
                while (st.size() > 0 && st.peek().character == curr)
                    st.pop();
            }

            if (st.size() > 0 && st.peek().character == x) {
                element latest = new element(x, st.peek().occurence + 1);
                st.push(latest);
            }
            else {
                element latest = new element(x, 1);
                st.push(latest);
            }
        }


        //------------

        if (st.size() > 0 && st.peek().occurence == k) {
            char curr = st.peek().character;
            while (st.size() > 0 && st.peek().character == curr)
                st.pop();
        }
        String midString = "";
        while (st.size() > 0)
            midString += st.pop().character;

        String finalString = "";
        for (i = midString.length() - 1; i >= 0; i--)
            finalString += midString.charAt(i);

        return finalString;
    }
}
