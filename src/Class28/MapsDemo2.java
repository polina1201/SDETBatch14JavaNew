package Class28;

import java.util.HashMap;

public class MapsDemo2 {
    public static void main(String[] args) {

        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);

        //I want to remove letter "e". Using Lambda

        items.keySet().removeIf(name->name.contains("e")); //If name contains "e", I want to remove it

        System.out.println(items);

    }
}
