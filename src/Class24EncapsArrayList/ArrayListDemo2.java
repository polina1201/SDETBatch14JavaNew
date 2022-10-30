package Class24EncapsArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);

        int a=34; //variable a is type int. Even though we can't store primitive with ArrayList
                    // and have to name Integer, instead of int,
                    // Java is still automatically translates int to Integer
        numbers.add(a);
        System.out.println(numbers);

        System.out.println("**************");

      for (Integer num:numbers){
          System.out.println(num);
      }
        //int-->Integer
        //boolean-->Boolean
        //float-->Float
        //double-->Double
        //char-->Character
    }
}
