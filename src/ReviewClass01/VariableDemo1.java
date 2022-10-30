package ReviewClass01;

public class VariableDemo1 {

	public static void main(String[] args) {
		/*
		 *if we want to store whole number, we can  use below data types numbers
		 *without decimal parts like 10, 23, 40000, 1000000 etc but we can't use them 
		 * to store decimal numbers like 12.3, 1.5, etc
		 * byte
		 * short
		 * int
		 * long
		 * although above 4 data types can be used to store whole numbers, but we
		 * will be using int most of the time as it can handle up to billions and does not
		 * waste a lot of space from RAM.
		 * 
		 */
		int box1=12;
				//int=> date type
				//box1=> variable name
				//= is an assignment operator and used to store data in variables
				//12 is the data that we want to store in box1
				// ; is the rule that you must end all the lines with the semicolons 
				int box2; //creating a box, but not storing data right away
		box1=20;
		box1=30; // replacing the value of 12 and 20 stored in box 1 with 30
		box2=45;
		System.out.println(box1);
		System.out.println(box2);
		
	}

}
