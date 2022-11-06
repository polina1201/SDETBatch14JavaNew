package Class25Wrappers;

import java.util.ArrayList;

public class RemoveAllDemo {
    public static void main(String[] args) {

        ArrayList<String> makeUpitems = new ArrayList<>();
        makeUpitems.add("Blush");
        makeUpitems.add("Base");
        makeUpitems.add("Concealer");
        makeUpitems.add("Mascara");
        makeUpitems.add("Eye Liner");
        makeUpitems.add("Lipstick");

        ArrayList<String>itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Blush");
        itemsToBeRemoved.add("Base");
        itemsToBeRemoved.add("Concealer");

        makeUpitems.removeAll(itemsToBeRemoved);
        //makeUpitems.clear(); -->everything will be removed
        System.out.println(makeUpitems);

    }
    }
