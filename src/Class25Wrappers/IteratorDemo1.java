package Class25Wrappers;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
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
        while (iterator.hasNext()){
            String item=iterator.next();  //better approach
            if (item.endsWith("r")){
                iterator.remove();
            }
        }
        System.out.println(beautyProducts);
    }
}
