package Class06Switch.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		/*We need to ask a user where he/she is from
		 * based on the country -->define favorite food
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.println("Where are you from?");
		
		String country=in.nextLine();
		String favoriteFood;
		
		switch (country) {
	
		case "USA":
			favoriteFood="Burgers and Fries";
			break;
		case "Kazakhstan":
			favoriteFood="Beshparmak";
			break;
		case "Turkey":
			favoriteFood="Adana kebab";
			break;
		case "Venezuela":
			favoriteFood="Arepa";
			break;
		case "India":
			favoriteFood="Curry";
			break;
		case "Yemen":
			favoriteFood="Mandi";
			break;
		case "Afghanistan":
			favoriteFood="Qaboli Palow";
			break;
		case "Italy":
			favoriteFood="Pasta";
			break;
			default:
				favoriteFood="Unknown";
				break;
		}
				System.out.println("You are from "+country+" "
						+ "and your favorite food is "+favoriteFood);
				
		
	}

}
