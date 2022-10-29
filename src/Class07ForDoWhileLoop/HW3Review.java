package Class07ForDoWhileLoop;

import java.util.Scanner;

public class HW3Review {
    public static void main(String[] args) {
        Scanner aaa = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        double num1 = aaa.nextInt();
        System.out.println("Enter 2nd Number");
        double num2 = aaa.nextInt();
        System.out.println("Enter the operator");
        String oper=aaa.nextLine();
        char op = aaa.next().charAt(0);
        double result=0 ;

        if (op == '+') {
            System.out.println("The result is: " + (num1 + num2));
        } else if (op == '-') {
            System.out.println("The result is: " + (num1 - num2));
        } else if (op == '*') {
            System.out.println("The result is: " + (num1 *num2));
        } else if (op == '/') {
            System.out.println("The result is: " + (num1 / num2));
        } else {
            System.out.println("enter valid operator");

        }
        if (result!=0.0) {
            System.out.println(result);}

        switch (op) {

            case '+':
                result = (num1 + num2);
                break;
            case '-':
                result = (num1 - num2);
                break;
            case '*':
                result = (num1 * num2);
                break;
            case '/':
                result = (num1 / num2);
                break;
        }

        }
}
