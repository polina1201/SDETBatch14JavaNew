package Class02NonPrimitive;

public class Variables {

	public static void main(String[] args) {
		
		/* Task A
		 * My name is _and my last name is_
		 * I am A/B student
		 * I live in city_and state_
		 * And my phone number is_
		 * Task B
		 * Change student's city, state, phone number and grade
		 * and print those updated values
		 * My name is _and I moved to new city_and new state_.
		 * My new phone number is_
		 * 
		 */
		String name = "Polina";
		String lastname = "Melvin";
		char letter = 'A';
		String city = "Poolesville";
		String state = "Maryland";
		String phone = "555-555-5555";
		
		System.out.println("My name is "+name+" and my last name is "+lastname);
		System.out.println("I am "+letter+" student");
		System.out.println("I live in "+city +", "+state);
		System.out.println("My phone number is " +phone);
		
	
	//Changes
		city = "San Diego";
		state = "California";
		phone = "666-666-6666";
	
		
		System.out.println("My name is " +name);
		System.out.println("I moved to the new city "+city+", "+state);
		System.out.println("My new phone number is "+phone);
		
		//Rules for Identifiers = names (variables, methods, classes)
		//1. cannot use keywords as identifiers
		//String new = "Hello"; -> error
		
		//2. cannot have spaces in identifiers
		//String last name="Smith"; -> error bc space between last and name
		
		//3. identifiers cannot start with numbers
		//int 1number=123; -> error bc number before letters. 
		//number can be anywhere after the letters
		
		//4. identifiers cannot contain any special characters
		//except $ or _
		//boolean hello!=true; -> error
		
		double $price=9.98;
		float _price1=1.99F;
		
		/*
		 * Naming Conventions
		 * 
		 * Class should start with Uppercase and follow camel casing
		 */
		
		String Weather="hot"; //not preferred
		String myWeather="cold"; //preferred
		
	}

}
