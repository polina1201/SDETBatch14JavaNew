package Class06Switch.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*Write a program for user to enter his/hers birth month.
		 * Based on the month define the season.
		 * if user is born in March, April, May → season =”Spring” 
		 * if user is born in June, July, August → season =”Summer”  etc …
		 * At the end of the program we should see 1 output as 
		 * “You were born is season __”.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("What is your birth month?");
		String BirthMonth;
		
		String month = input.nextLine();
		if (month.equals("January") || month.equals("February") || month.equals("December")) 
		{
			BirthMonth="Winter";
		}else if (month.equals("March") || month.equals("April") || month.equals("May")) 
		{
			BirthMonth="Spring";

		}else if (month.equals("June") || month.equals("July") || month.equals("August")) 
		{
			BirthMonth="Summer";
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) 
			BirthMonth="Autumn";
		

	}
}