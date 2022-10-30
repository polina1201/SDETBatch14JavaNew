package Class04InputFromKeyboard;

import java.util.Scanner;

public class HW3Loan {

	public static void main(String[] args) {
		/*You are a loan specialist and you need to ask user what is the amount of loan is needed
		 * If loan is less or equal to 200,000 then you would lend the money.
		 * Otherwise, you would reject the client
		 */

		Scanner scanner=new Scanner(System.in);
		System.out.println("How much would you like to borrow?");
		double loan=scanner.nextDouble();
		if (loan<=200000) {
			System.out.println("Congratulations! You are approved");
		}else {
			System.out.println("I'm sorry, you do not qualify");
		}
		
		
		
		
	}

}
