package Class28;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo3 {
    public static void main(String[] args) {

        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);

        Set<String> keys=items.keySet(); //keySet method returns a Set that contains all the keys of a map. Can use Collections or Set
        for(String key:keys){
            System.out.println(key);
        }

        //write code to print all the VALUES from a map using a loop

        for (Double value:items.values()){
            System.out.println(value);
        }




        //THIS IS A LONGER WAY
        /*Collection<Double> values=items.values();
        for(Double value:values){
            System.out.println(value);
        }*/
    }
}
