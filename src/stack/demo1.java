package stack;

/**
 * Created by z002gh2 on 2/3/19.
 */
public class demo1 {
    public static void main(String[] args) {

        int[] arr = {1,2,2,2,1,3,3,4,5,4,5};
        int number = arr [0];

        for (int i=1; i<arr.length;i++){
            number= number^arr[i];
        }
        System.out.print(number);
    }
}
