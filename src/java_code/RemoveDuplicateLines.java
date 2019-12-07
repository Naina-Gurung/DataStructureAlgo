package java_code;


import javax.annotation.Resources;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class RemoveDuplicateLines {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new FileReader("./resources/data.csv"));


        String column[] = new String[2];
        ArrayList<String> arr = new ArrayList<String>();

        String header= sc.nextLine();
        while(sc.hasNext()){
            String line= sc.nextLine();
            column[0]=line.split(",")[0];
            column[1]=line.split(",")[1];
            Arrays.sort(column);
            String rows=column[0]+","+column[1];

            if(!arr.contains(rows)){
                arr.add(rows);
            }


        }
        System.out.println(header);

            for(int i=0;i<arr.size();i++){
                System.out.println(arr.get(i));
            }

    }
}