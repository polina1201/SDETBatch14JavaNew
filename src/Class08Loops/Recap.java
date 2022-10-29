package Class08Loops;

import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {

        // Print even numbers from 20 to 1 (2 ways)
        for (int i = 20; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("*IF cond inside for loop**");
        for (int i = 20; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ---------------------  ");
		/*
		 * Prompt the user to ask the name 3 times and print "Good afternoon
		+name...
		 */
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Please write a name");
            String name = input.nextLine();
            System.out.println("Good afternoon " + name);
            System.out.println("---------------------------------");
        }
    }
}
