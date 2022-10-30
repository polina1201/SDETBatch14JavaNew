package Class04InputFromKeyboard;

import java.util.Scanner;

public class HW6CreditCard {

	public static void main(String[] args) {
		/*Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them.
		 *  If they do have one ask what is balance on the card?
		 *  If balance of the card is larger than 1000, tell them to pay off immediately, 
		 *  otherwise you can tell them that they can spend more.
		 */
		
		Scanner scanner=new Scanner (System.in);
		System.out.println("Do you have a credit card? Please type True or False.");
		boolean card=scanner.nextBoolean();
		if (card) {
			System.out.println("What is the balance on the card?");
		double score=scanner.nextDouble ();
		if (score>=1000) {
			System.out.println("Please pay your card off immediately!");
		}else {
			System.out.println("You can spend some more moeny");
		
		}
		}else {
			System.out.println("Would you like to apply for a card?");
			}
	}
}	
		
		
		


