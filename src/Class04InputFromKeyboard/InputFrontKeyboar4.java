package Class04InputFromKeyboard;

import java.util.Scanner;

public class InputFrontKeyboar4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Did you solve any Repl Assignments. Please enter true or fase");
		boolean solvedAnyRepls=scanner.nextBoolean();
		
		if (solvedAnyRepls) {
			System.out.println("How many Repls you solved?");
			int noOfReplsSolved=scanner.nextInt();
			
			if(noOfReplsSolved>17) {
				System.out.println("You are doing great!");
			}else if (noOfReplsSolved>10){
				System.out.println("You are doing ok. Please complete them ASAP");
			}else {
				System.out.println("You should solve some more repls");
			}
			
		}else {
			System.out.println("They are very important to learn java. Please solve them");
			
		}

	}

}
