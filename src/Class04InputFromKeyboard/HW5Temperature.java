package Class04InputFromKeyboard;

import java.util.Scanner;

public class HW5Temperature {

	public static void main(String[] args) {
		/*Create a program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into
		 * Celsius and print "The temperature in the city is"
		 */

		Scanner scanner =new Scanner(System.in);
		System.out.println("Where do you live?");
		String city=scanner.nextLine();
		System.out.println("What is the current temperature in Fahrenheit?");
		double Fahrenheit =scanner.nextDouble();
	Fahrenheit=((Fahrenheit-32)*5/9);
	{ System.out.println("The temperature in " + city + " is "+ Fahrenheit);
	}
	}
		
		
		
		
	}


