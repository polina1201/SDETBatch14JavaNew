package Class25Wrappers;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String>makeUpitems=new ArrayList<>();
        makeUpitems.add("Blush");
        makeUpitems.add("Base");
        makeUpitems.add("Concealer");
        makeUpitems.add("Mascara");
        makeUpitems.add("Eye Liner");

        ArrayList<String>cosmetics=new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("Lotion");

        ArrayList<String>beautyProducts=new ArrayList<>();
        beautyProducts.addAll(makeUpitems);
        beautyProducts.addAll(cosmetics);
        System.out.println(beautyProducts);
        beautyProducts.remove("Shampoo");//removes only one item
        System.out.println(beautyProducts);
        beautyProducts.removeAll(cosmetics);
        System.out.println(beautyProducts);
        beautyProducts.clear();//removes everything
        System.out.println(beautyProducts);

    }
}
