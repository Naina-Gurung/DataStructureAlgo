package Sorting;

/**
 * Created by z002gh2 on 4/20/19.
 */
public class InsertionSort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []arr = {6,8,1,4,5,3,7,2};
        insertionSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void insertionSort(int[] arr){
        int i,j,temp;
        for (i=1;i<=arr.length-1;i++){
            j=i;
            int v= arr[i];
            while( j>=1 && arr[j-1]>v){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j] = v;
        }
    }
}
