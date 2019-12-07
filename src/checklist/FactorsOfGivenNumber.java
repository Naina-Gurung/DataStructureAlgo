package checklist;


import java.util.Scanner;
import java.util.Vector;

public class FactorsOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        System.out.println("The factors of a the num "+ num + " is : ");
        findFactors( num);
    }

     static void findFactors(int num){

         Vector<Integer> v= new Vector<>();
         for(int i=1; i<=Math.sqrt(num); i++){
             if(num%i == 0){
                 if(num%i ==i)
                     System.out.printf("%d ",i);
                 else {
                     System.out.printf("%d ", i, num / i);
                     v.add(num / i);
                 }
             }
         }

         for(int i=v.size()-1;i>=0;i--){
             System.out.printf("%d ",v.get(i));
         }

    }
}
