package Class06Switch.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 * At the end your program should print 
		 * which grade was entered by a user with explanation.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
	System.out.println("What is your grade?");
	
	String grade=scanner.nextLine();
	String explanation;
	
	switch(grade) {
	
	case "A":
		explanation="Excellent";
		break;
	case "B":
		explanation="Good";
		break;
	case "C":
		explanation = "Average";
		break;
	case "D":
		explanation="Bad";
			break;
	default:
		explanation = "Not acceptable";
		break;
	}System.out.println("Your grade is "+grade+" and its "+explanation);
			
			
		}
		
		
		
		
		
		
	}


