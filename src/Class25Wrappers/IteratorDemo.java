package Class25Wrappers;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {


        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("Shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("Concealer");
        beautyProducts.add("EyeLiner");

        Iterator<String>iterator=beautyProducts.iterator();
        System.out.println(iterator.hasNext()); //we have one item
        System.out.println(iterator.next());//it gives us the item ad also removes the items from iterator
        System.out.println(iterator.hasNext());
        iterator.next();
        iterator.next();
        System.out.println(iterator.next());

    }
}
