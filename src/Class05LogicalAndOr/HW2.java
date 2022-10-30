package Class05LogicalAndOr;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*Write a program for user to enter his/hers birth month.
		 * Based on the month define the season.
		 * if user is born in March, April, May → season =”Spring” 
		 * if user is born in June, July, August → season =”Summer”  etc …
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("What is your birth month?");
		
		String month = input.nextLine();
		if (month.equals("January") || month.equals("February") || month.equals("December")) 
		{
			System.out.println(" You are born in Winter");
		}else if (month.equals("March") || month.equals("April") || month.equals("May")) 
		{
			System.out.println(" You are born in Spring");

		}else if (month.equals("June") || month.equals("July") || month.equals("August")) 
		{
			System.out.println(" You are born in Summer");
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) 
		{
			System.out.println(" You are born in Autumn");
		
		
	
		
	}
	}
	}
