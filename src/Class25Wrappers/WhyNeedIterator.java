package Class25Wrappers;

import java.util.ArrayList;

public class WhyNeedIterator {
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


        for (int i = 0; i <beautyProducts.size(); i++) {
            if (beautyProducts.get(i).endsWith("r")){
                beautyProducts.remove(i);
            }
        }
        /*for (String item:beautyProducts){
            if(item.endsWith("r")){
                beautyProducts.remove(item);
            }
        }*/


        System.out.println(beautyProducts);

    }
}
