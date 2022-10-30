package Class24EncapsArrayList;

import java.util.ArrayList;

public class ArraylistDemo4 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Tymur");
        names.add("Polina");
        names.add("Josh");
        names.add("MJ");
        names.set(0, "Josh");//set is to replace the context, not add
        System.out.println(names);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(1, 30);
        numbers.set(0, 589);
        System.out.println(numbers);
        numbers.clear();//deletes all the elements from the list
        System.out.println(numbers);
    }
}
