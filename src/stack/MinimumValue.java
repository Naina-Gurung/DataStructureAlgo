package stack;
import java.util.Stack;
 /**
 * Created by z002gh2 on 2/10/19.
 */
public class MinimumValue {


        Stack<Integer> st = new Stack<>();
        Stack<Integer> minst = new Stack<>();


   public void push(int data){
       st.push(data);
       if(minst.isEmpty()){
           minst.push(data);
       }else{
           int temp=minst.peek();
           if(data<temp){
               minst.push(data);
           }
       }

   }

   public int pop(){
       int data = st.pop();
       if(data == minst.peek()){
           minst.pop();
       }
       return data;
   }

   public int getMin(){
       return minst.peek();
   }

    public static void main(String[] args) {
        MinimumValue getMin = new MinimumValue();

        int[] arr = {1,2,4,-1,0,5};
        //int[] arr = {1,0,7,6,-1,9,10};

        for (int i=0; i<arr.length;i++){
            getMin.push(arr[i]);
        }
        System.out.println(getMin.getMin());
        getMin.pop();
        getMin.pop();
        getMin.pop();
        System.out.println(getMin.getMin());
    }
    /*int len = arr.length;
        for(int i=0; i<len;i++){
            st.push(arr[i]);
            if(minst.isEmpty()){
                minst.push(arr[i]);
            }else{

            }

        }**/


}
