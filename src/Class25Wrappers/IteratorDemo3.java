package Class25Wrappers;

import java.util.ArrayList;

public class IteratorDemo3 {
    public static void main(String[] args) {

        //delete all the products which start with leter B or end with letter a
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Soap");
           /*     var number=10;
        var name="Polina";
        var decimlaNumber=21.5;*/

   var iterator=beautyProducts.iterator();

   while (iterator.hasNext()){
       var item=iterator.next();
       if(item.startsWith("B")||item.endsWith("a")){
           iterator.remove();
       }
   }
        System.out.println(beautyProducts);

    }
}
