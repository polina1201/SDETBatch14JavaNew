package Class04InputFromKeyboard;

import java.util.Scanner;

public class InputFromKeyBoard {

	public static void main(String[] args) {
		
		/*
		 * Scanner is a class that helps us take the input from the keyboard.
		 *It contains many different smaller modules called Methods, that 
		 *can help us take Strings, booleans, and all types of 
		 *data from the keyboard.
		 */
		
		Scanner input=new Scanner(System.in);
			//A message will be displayed to the user on the console
			//to enter his/her name
		System.out.println("Please enter your name");
			//Activates the java program to take the input from the 
			//keyboard and store it inside the name variable.
		String name=input.next();
			//Prints whater name user enters on the keyboard on the console
		System.out.println("Hello "+name+" don't be confused");
	}

}
