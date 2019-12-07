package java_code;

import java.io.*;
import java.util.Properties;

/**
 * Created by z002gh2 on 8/13/19.
 */
public class ReadFile {
    public static void main(String[] args) throws Exception{

  //Read a file
        File file= new File("/Users/z002gh2/naina/DataStructureAlgo/abc.txt");
        BufferedReader br =  new BufferedReader(new FileReader(file));
        String st;
        while ((st= br.readLine()) != null ){
            System.out.println(st);
        }

        Properties prop = new Properties();
        String propFileName ="config.properties";
  //Write into a config.properties
        prop.setProperty("project-name","MMO");
        prop.setProperty("Channel-name","CATEGORY_PR");
        prop.setProperty("metric","tgt_div_nat_pub_imp_tot");
        FileWriter wr = new FileWriter(propFileName);
        prop.store(wr,"Naina");
        wr.close();


//Read from a config.properties file
       InputStream inpStream=  new FileInputStream(propFileName);
        prop.load(inpStream);
       String project =prop.getProperty("project-name");
        String channelName= prop.getProperty("Channel-name");
        String metric = prop.getProperty("metric");
        System.out.println(project);
        System.out.println(channelName);
        System.out.println(metric);


    }
}
