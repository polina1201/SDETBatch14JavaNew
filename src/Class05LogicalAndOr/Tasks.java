package Class05LogicalAndOr;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		/*
		 * . Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: short (under 60 inch) medium(between 60
		 * -72 inch) tall (over 72 inch)
		 */

		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		int height = inp.nextInt();
		int number = 25;
		
		if (height <=60) {
			System.out.println("Short");
		}else if (height > 60 && height <72) {
			System.out.println("Medium");
		}else if (height >72) {
			System.out.println("Tall");
		}
	}
}