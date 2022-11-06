package Class26ArrayListAndSets;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        //Create an arrayList of words. Remove every word that ends with “e”.

        ArrayList <String>words=new ArrayList();
        words.add("Java");
        words.add("India");
        words.add("Palestine");
        words.add("USA");
        words.add("France");
        words.add("Ukraine");

        var iterator=words.iterator();
        while (iterator.hasNext()){
            var item=iterator.next();
            if (item.endsWith("e")){
                iterator.remove();
            }
        }

        System.out.println(words);



    }
}
