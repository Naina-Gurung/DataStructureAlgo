package checklist;

public class StringRestructuredArray {

    public static void main(String[] args) {
        String inp = "4 98 20 -26 88 75 4 -18 85 23 45 61 95";
        String query= "3 3";
        String output= " ";

        String[] arr = inp.split(" ");
        int i=Integer.parseInt(query.split(" ")[0]);
        int j=Integer.parseInt(query.split(" ")[1]);

        int pos=(i-1)*Integer.parseInt(arr[0])+j;

        System.out.println("Position of the" + "("+query+") in the array is :" + pos);

        System.out.println("Output for the" + "("+query+")  is:" + arr[pos]);
       /* for(int i=0;i< arr.length; i++){
            System.out.println(arr[i]);
        }*/





    }


}
