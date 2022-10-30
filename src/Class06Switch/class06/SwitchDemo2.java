package Class06Switch.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {

		//matching cases must be of same data type as variable 
		//no duplicate cases in switches allowed
		
		
		char choice = 'Y';
		String answer;

		switch (choice) {

		case 'Y':
			answer = "Yes";
			break;
		case 'N':
			answer = "No";
			break;
		case 'M':
			answer = "Maybe";
			break;
		default:
			answer = "Unknown";
			break;
		}
System.out.println(answer);

//Limitations of SWITCH CASE
/*
 * switch case cannot use logical operators
 * switch case cannot use relational operators
 */

/*
 * CANNOT work with boolean values
 * Compiler Error (CE): Cannot switch on a value of type boolean
 * boolean boo=true;
 * switch(boo){
 * }
 * 
 * 
 * CANNOT work with float/double and long (decimals)
 * 
 * 
 * 
 */

	}

}
