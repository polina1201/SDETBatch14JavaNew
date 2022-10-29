package Class07ForDoWhileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner aaa = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        double num1 = aaa.nextInt();
        System.out.println("Enter 2nd Number");
        double num2 = aaa.nextInt();
        System.out.println("Enter the operator");
        String oper = aaa.nextLine();
        char op = aaa.next().charAt(0);
        double result = 0;
        boolean wrongOperator=false;
        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else if (op == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Enter valid operator");
            wrongOperator=true;
        }
        if (!wrongOperator) {
            System.out.println(result);
        }
    }
}
