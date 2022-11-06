package Class25Wrappers;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        /*Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
*/

ArrayList<String>names=new ArrayList<>(1);
names.add("Polina");
names.add("Connor");
names.add("Allie");
names.add("Rachel");
names.add("Jamo");
        System.out.println(names.isEmpty());//given ArrayList is empty or not?
        System.out.println(names.contains("Jam"));
        System.out.println(names.contains("Dam"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
