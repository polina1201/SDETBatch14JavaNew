package Class07ForDoWhileLoop;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        /*
         * 6.Declare a variable to store a price for a coffee. Ask the user to pay for a
         * coffee. Keep asking to pay for coffee until the user enters the EXACT amount
         * If the user gives more than coffee price --> ask them to give less, if the
         * user gives less money then ask to give more. Once user give EXACT amount
         * print “Please enjoy your coffee
         */

        double price = 2.85;
        double user;
        Scanner in=new Scanner(System.in);


        do {
            System.out.println("Please pay for the coffee");
            user = in.nextDouble();

            if(user>price) {
                System.out.println("Please give lesser price");

            }else if (user<price) {
                System.out.println("Please give more price");
            }

        }while (user!=price);


        System.out.println("Please enjoy your coffee");

    }
}
