package Class28;

import java.util.HashMap;

public class MapsDemo5 {
    String name;
    //var lastname; doesn't work with instance variable as Java can't figure out the data type
    //value is not assigned, so Java is not able to figure out which dataType it is

    public static void main(String[] args) {

        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);

        //Set<Map.Entry<String,Double>>entrySet =items.entrySet();
       var entrySet=items.entrySet();
        System.out.println(entrySet);

        for (var item:entrySet){
            System.out.println(item.getKey()+" "+ item.getValue());
        }
    }
}
