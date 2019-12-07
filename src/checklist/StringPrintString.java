package checklist;


import java.util.Scanner;

public class StringPrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:" );
        int num= sc.nextInt();
        if(num % 4 == 0 && num % 6 ==0){
            System.out.println("TargetAs");
        }
        else if (num % 4 == 0){
            System.out.println("Target");
        }
        else if(num % 6 == 0){
            System.out.println("As");
        }
        else
            System.out.println("No numbers eligible");
    }
}
