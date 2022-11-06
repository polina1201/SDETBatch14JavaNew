package Class25Wrappers;

import java.util.ArrayList;

public class IteratorDemo4WithLambda {

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

    //var item=iterator.next(); Java11
        beautyProducts.removeIf(item->item.endsWith("B"));
        System.out.println(beautyProducts);


}
}
