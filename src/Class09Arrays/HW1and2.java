package Class09Arrays;

public class HW1and2 {
    public static void main(String[] args) {
        /*
         * Create an array of cars and store 6 elements into it. Using 2 different loops
         * print all values from the array.
         */


        String[] cars = { "Acura", "Porsche", "Honda", "Toyota", "Subaru", "VW" };
        for (String models:cars) {
            System.out.println(models);
        }

//2nd way

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
        System.out.println("---------------------------");



        /*
         * Create an array of animals and store 5 elements into it. Using 2 different
         * loops print all elements from the array.
         */

        String[] animals = { "Tiger", "Lion", "Bear", "Dog", "Wolf" };

        for(String floofs:animals) {
            System.out.println(floofs);
        }

// 2nd way

        for(int i=0; i<animals.length; i++) {
            System.out.print(animals[i]+" ");
        }

    }

}
