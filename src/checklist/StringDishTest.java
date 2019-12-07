package checklist;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class StringDishTest {
    public static void main(String[] args) {

        StringDish pasta=new StringDish("Pasta",new String[]{"Tomato Sauce","Onions","Garlic"});
        StringDish chicken= new StringDish("Chicken Curry", new String[]{"Chicken","Curry Sauce"});
        StringDish friedRice = new StringDish("Fried Rice", new String[]{"Rice","Onions","Nuts"});
        StringDish salad = new StringDish("Salad", new String[]{"Spinach", "Nuts"});
        StringDish sandwich= new StringDish("Sandwich", new String[]{"Cheese", "Bread"});
        StringDish quesadilla= new StringDish("Quesadilla", new String[]{"Chicken", "Cheese"});

        ArrayList<StringDish> arr = new ArrayList<StringDish>();
        arr.add(pasta);
        arr.add(chicken);
        arr.add(friedRice);
        arr.add(salad);
        arr.add(sandwich);
        arr.add(quesadilla);

        HashMap<String,HashMap<String,String>> hs = new HashMap<String,HashMap<String, String>>();
        StringDish row;
        for (int i =0;i<arr.size();i++){
            row=(StringDish)arr.get(i);
            setSpices(row,hs);
            row=null;
        }
        Set hSet=hs.keySet();
        Iterator it=hSet.iterator();
        while(it.hasNext()) {
            String key = (String) it.next();
            HashMap hsMap = hs.get(key);
            if (isMulitpleFood(hsMap))
                System.out.println(hsMap.keySet());
        }

    }

    private static boolean isMulitpleFood(HashMap hsMap) {
        Set hSet = hsMap.keySet();
        if ( hSet.size() > 1){
        return true;
    }
        return false;
    }
    private static void setSpices(StringDish row, HashMap<String,HashMap<String,String>> hs) {
        HashMap dish= null;

        for(int i=0;i<row.getSpices().length;i++){
            if(!hs.containsKey(row.getSpices()[i].toString())){
                dish= new HashMap();
                dish.put(row.getName(), row.getName());
                hs.put(row.getSpices()[i].toString(), dish);
            }else{
                HashMap dishInc=hs.get(row.getSpices()[i].toString());
                if(!dishInc.containsKey(row.getName())){
                    dishInc.put(row.getName(), row.getName());
                    hs.put(row.getSpices()[i].toString(), dishInc);

                }
            }
        }
    }
}