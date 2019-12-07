package checklist;


public class StringRepeatedSubstringPattern {
    public static void main(String[] args) {
        String s="abab";
        System.out.println(repeatedSubstringPattern(s));
    }
    static boolean repeatedSubstringPattern(String s){
        String str=s+s;
        return str.substring(1,str.length()-1).contains(s);
    }
}
