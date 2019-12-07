package checklist;

public class StringAddPersonWithMaxGap {

    public static void main(String[] args) {

        String inp="010101001010";
        //"010101010100"
        //"00101010100"
        //0001000010001001
        //100000010000010001001

        int strt_indx=0;
        int end_indx=0;
        int maxgap=0;
        int maxstrt_indx=0;

      int gap=0;

        System.out.println(inp.length());
       for(int i=0;i<inp.length();i++){

           if(i == inp.length()-1){
               end_indx = i;
           }

            if(inp.charAt(i)=='1'){
                strt_indx=end_indx+1;
                end_indx=i;

                gap=end_indx-strt_indx;
            }
           if(gap>maxgap){
               maxgap=gap;
               maxstrt_indx=strt_indx;
           }
        }

        System.out.println("Maximum gap:" +maxgap);
        System.out.println("Maximum start index:" +maxstrt_indx);
        System.out.println("end index:" +end_indx);
        int pos=maxgap/2;
        int newpos=0;

        System.out.println("Existing String:" + inp);

        if(maxstrt_indx == 0){
            newpos = 0;
        }else if(inp.charAt(end_indx) == '0'){
            newpos = end_indx+1;
        }else {
            newpos=maxstrt_indx+pos;
        }

        System.out.println("new position"+ newpos);

        System.out.println("New String     :" +
                inp.substring(0,newpos) +'1'+inp.substring(newpos,inp.length())
        );


    }
}
