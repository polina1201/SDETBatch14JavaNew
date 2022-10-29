package Class07ForDoWhileLoop;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        // 1. Print numbers from 1 to 100 in 1 line with space
        // 2.Print numbers from 100 to 1
        // 3.Print even numbers from 20 to 1 (2 ways)
        // 4. Print odd numbers between 20 and 50 (2 ways)
        // 5.Prompt the user to ask the name 3 times and print "Good afternoon +name...


        // HW #3

        for (int i = 20; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        // OR
        System.out.println("*IF cond inside for loop**");

        for (int i = 20; i >= 1; i--) {
            if (i % 2 == 0) {
            }System.out.print(i + " ");}

        // HW #5
        System.out.println("----------------");

        Scanner input=new Scanner (System.in);

        for (int d=1; d<=3; d++ ) {

            System.out.println("Please write a name");
            String name = input.nextLine();

            System.out.println("Good afternoon "+name);
            System.out.println("-----------------");
        }


    }
}
