package Class26ArrayListAndSets;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        //Create an arrayList of EVEN numbers from 1 to 500.
        // Remove any number that is divisible by 5 from that arrayList.

        ArrayList<Integer>number=new ArrayList<>();
        for (int i = 2; i <500 ; i=i+2) {
            number.add(i);
        }

        System.out.println(number);

        var it=number.iterator();
        while (it.hasNext()){
            Integer num=it.next();
            if(num%5==0){
                it.remove();
            }
        }
        System.out.println(number);
        }

    }

