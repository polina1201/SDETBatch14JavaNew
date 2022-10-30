package ReviewClass03;

import java.util.Scanner;

public class LogicalOperator4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter if you are comfortable with java logical operators now");

		boolean goodWithOp = scanner.nextBoolean();
		
		if (!goodWithOp) {
			System.out.println("Do some more research, solve more repls, and take some rest");
		}
		
	}

}
