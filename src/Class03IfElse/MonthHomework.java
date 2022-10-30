package Class03IfElse;

public class MonthHomework {

	public static void main(String[] args) {
		/*Create a Java program and declare int variable that will hold a month.
		 * Based on the value of the variable your program should print the name of the month.
		 */

		int month=3;
		
		if (month==1) {
			System.out.println("January");
		}else if (month==2) {
			System.out.println("February");
		}else if (month==3) {
			System.out.println("March");
		}else if (month==4) {
			System.out.println("April");
		}else if (month==5) {
			System.out.println("May");
		}else if (month==6) {
			System.out.println("June");
		}else if(month == 7) {
            System.out.println("July");
        }else if(month == 8) {
            System.out.println("August");
        }else if(month == 9) {
            System.out.println("September");
        }else if(month == 10) {
            System.out.println("October");
        }else if(month == 11) {
            System.out.println("November");
        }else if(month == 12) {
            System.out.println("December");
        }else {
        	System.out.println("Please enter a valid number between 1-12");
        }
		
		
		
		//Write a program to check whether number is positive or negative.
		
		int num1= 0;
				if (num1>0) {
					System.out.println("This number is Positive");
				}else if (num1<0){
					System.out.println("This number is Negative");
				}	else {
					System.out.println("Number is neither positive nor negative");
				}
	
	
				
				
				//Write a Java Program to check whether number is Even or Odd.
				
				int num2=36;
						 //if we take the modulus of a number by2 and answer is 0, it's always an Even number
							//otherwise, it's an odd number
				if (num2%2==0){
							System.out.println("This number is Even");
						}else {
							System.out.println("This number is Odd");
					
						}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
	
	}


