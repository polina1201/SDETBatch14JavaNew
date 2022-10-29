package Class08Loops;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*Write a program to ask a user to enter item they want to buy and the price of that item.
         *  Every time user enters money, accumulate the amount
         *  and tell the user how much is left to pay off.
         *  If user give more money, program should return a change.
         * Whenever user done with payments program should say "Thank you for shopping!"
         */


        Scanner input=new Scanner(System.in);
        System.out.println("What would you like to purchase?");
        String item=input.nextLine();

        System.out.println("What is the price of the item?");
        double price=input.nextDouble();

        double money;
        double total =0;
        System.out.println("Please pay for your "+item);

        do {
            System.out.println("How much money do you have?");
            money=input.nextDouble();

            total+=money; //accumulate all money
            double need;
            double change;

            if(total<price) {
                need=price-total;
                System.out.println("You need to pay $"+need+" more");
            } else if (total>price) {
                change=total-price;
                System.out.println("Here is your change $"+change);
                break;
            }
        }while (total!=price);

        System.out.println("Thank you for shopping");
    }

}
