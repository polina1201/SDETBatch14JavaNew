package Class03IfElse;

public class ifElse6 {

	public static void main(String[] args) {
		
		int number=3;
		
		if(number!=18) {
			System.out.println("This number is not 18");
		}
		
		int day=9;
		
		if(day==1) {
			System.out.println("Monday");
		}else if (day==2) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thursdya");
		}else if (day==5) {
			System.out.println("Friday");
		}else if(day==6) {
	        System.out.println("Saturday");
	    }else if(day==7) {
	        System.out.println("Sunday");
	    }else {
	    	System.out.println("Please enter a valid day number (1-7)");
	    }
	}
}