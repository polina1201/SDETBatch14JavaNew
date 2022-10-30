package Class04InputFromKeyboard;

import java.util.Scanner;

public class HW4DMV {

	public static void main(String[] args) {
		/*You are DMV rep and you need to ask customer their age.
		 * If they are 18 and older, you will issue a driver license.
		 * Otherwise, you will offer them go get a lerners permit.
		 */

		Scanner scanner=new Scanner(System.in);
		System.out.println("How old are you?");
		double age=scanner.nextDouble ();
		if (age>=18) {
			System.out.println("We can issue you a Driver's license");
			
		}else {System.out.println("Would you like a Learner's permit?");
		}
		
	}

}
