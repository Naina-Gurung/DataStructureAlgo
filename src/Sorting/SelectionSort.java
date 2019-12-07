package Sorting;

/**
 * Created by z002gh2 on 4/20/19.
 */
public class SelectionSort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []arr = {8,5,9,10,2,1};
        selectionSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void selectionSort(int[] arr){
        int len,temp,i,j,min;
        len =arr.length;
        for ( i=0;i<len;i++){
            min = i;
            for ( j=i+1;j<len;j++){
                if (arr[min]>arr[j]){
                    min = j;
                }
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
