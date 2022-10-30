package Class04InputFromKeyboard;

public class NestedIfCondition {

	public static void main(String[] args) {
		
		int time=9;
		String day="Monday";
		/*
		 * it's called outer, if condition "if" is true, then only inner conditions will be checked.
		 * If it's false, nothing from inner "if" condition will be executed. It's like the main door. 
		 * If main door is closed, we can't enter the building.
		 */
			
		
		//outer "if" conditions
		if (day.equals("Monday")) { //a String is a non primitive, we can't use == sign we have to use equals method
			
		//inner "if" conditions
			
		if (time>7) {
				System.out.println("Lets go to office");
				}
		if(time<6) {
				System.out.println("Lets sleep more");
			}

	}
	}
}
