package Class06Switch.class06;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		/*Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 */

		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int number = scanner.nextInt();
		
		System.out.println("Please enter second number");
		int number2=scanner.nextInt();
		
		System.out.println("Please enter an operator");
		 char operator=scanner.next().charAt(0);
	      double result;   
	      result = (number+operator+number2);
		
		if (operator==('+')) {
			System.out.println((number+number2));
			
		}else if (operator==('-')) {
			System.out.println(number-number2);
		}else if (operator==('*')) {
			System.out.println(number*number2);
			
		}else if (operator==('/')) {
			System.out.println(number/number2);
		}else {
			System.out.println("Please enter a valid operator and/or number");
		}
		
	}
	

}
