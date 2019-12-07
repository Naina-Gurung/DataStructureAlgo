package checklist;

import java.util.Arrays;

public class StringLexicographicalConcatinationString {

    public static void main(String[] args) {

        String firstString="hack";
        String secondString="hacker";
        String thirdString ="hackerrank";
        String result = compareStrings(firstString, secondString,thirdString);
        System.out.println(result);

    }

    public static String compareStrings(String firstString, String secondString, String thirdString) {
        String output ="";

        String arr[] = {firstString,secondString,thirdString};

        Arrays.sort(arr);

        for(int i=0 ; i< arr.length; i++){
            output = output + arr[i];
        }

        return output;
    }
}
