package java_code;

import java.util.Scanner;

/**
 * Created by z002gh2 on 7/28/19.
 */
public class PrintElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("give no of input:");
        int count = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements :");
        String elem="";
        for (int i = 1; i <= count; i++) {
            elem = elem + sc.nextLine() + " ";

        //System.out.println("count : " + count + " elem : " + elem );
        //String arr[] = elem.split(" ");
    }
        String arr[] = elem.split(" ");
        //System.out.println(arr.length);

        System.out.println(" Printing the elements: ");
        printElements(count, arr);

    }



    public static void printElements(int n, String arr[]){
        for(int i=0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }


}
