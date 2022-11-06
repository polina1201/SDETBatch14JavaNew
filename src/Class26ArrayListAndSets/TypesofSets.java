package Class26ArrayListAndSets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypesofSets {
    public static void main(String[] args) {
        //3 Types of Sets
        //HashSet - Upside: It's the fastest type of Set
        //          Downside: It doesn't care about the insertion order

        HashSet<String>hashSet=new HashSet<String>();
        hashSet.add("Mango");
        hashSet.add("Apple");
        hashSet.add("Kiwi");
        hashSet.add("Orange");
        System.out.println("HashSet");
        System.out.println(hashSet);

        //insertion speed (the speed with which we can insert the data) is the same as HashSet,
        // but retrieval speed is the worst
        LinkedHashSet<String>linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Mango");
        System.out.println("linkedHashSet");
        System.out.println(linkedHashSet);

        //TreeSet alphabetizes your data
        TreeSet<String>treeSet=new TreeSet<>();
        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Kiwi");
        treeSet.add("Orange");
        treeSet.add("Mango");
        treeSet.add("Banana");
        System.out.println("treeSet");
        System.out.println(treeSet);


    }
}
