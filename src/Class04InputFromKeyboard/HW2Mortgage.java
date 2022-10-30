package Class04InputFromKeyboard;

import java.util.Scanner;

public class HW2Mortgage {

	public static void main(String[] args) {
		/*Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a house,
		 * otherwise user will consider buying. Once user decides to buy a house, 
		 * if price of the house is larger than 200,000 than user will take a loan, 
		 * otherwise user will pay cash
		 * 
		 */
		
		Scanner scanner=new Scanner(System.in);
	System.out.println("What is the current rate?");//first sentence
	double rate=scanner.nextDouble(); //user's response
	if(rate<4.5) { //condition of the answer
		System.out.println("You should consider buying the house. How much is it?");//A&Q to the condition
		double house=scanner.nextDouble();//user types second condition
		if (house>200000) { //scenario 
			System.out.println("You should take a loan");
		}else {
			System.out.println("You should pay cash");
		}
		
	}else {
		System.out.println("You should not buy the house");
	}
	
	}

}
