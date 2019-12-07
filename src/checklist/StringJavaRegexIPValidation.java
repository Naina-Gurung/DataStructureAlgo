package checklist;

public class StringJavaRegexIPValidation {

    public static void main(String[] args) {

        String ip="123.35.27.999";

        String[] arr =ip.split("\\.");

        Boolean out=checkValidip(arr);
        System.out.println(out);

    }

    public static Boolean checkValidip(String[] arr){
        Boolean result=false;
        System.out.println ("length of array is:" +arr.length);
        // test case 1: check length
        if(arr.length !=4){
            //System.out.println(result);
            System.out.println("Invalid ip");
            return result;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println("length of each of arr["+i+"]"+ arr[i] + " is " + arr[i].length() );
            if(arr[i].split("").length > 3 || arr[i].length()<1 ){
                System.out.println("Invalid ip is at " + "arr["+i+"]" + arr[i]);
                return result;
            }
            int substrLen=arr[i].length();

            for(int j=0;j<substrLen;j++) {
                if (!Character.isDigit(arr[i].charAt(j)))  {
                    return result;
                }
            }

            if(Integer.parseInt(arr[i])<0 || Integer.parseInt(arr[i])>255){
                return result;
            }
        }
        return true;
    }
}
