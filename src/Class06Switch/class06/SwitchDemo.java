package Class06Switch.class06;

public class SwitchDemo {

	public static void main(String[] args) {
	
//IF STATEMENT IS CONDITION BASED
//IT EXECUTES BLOCK ON TRUE OR FALSE

		int day=1;
		
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
		
		System.out.println("----------------------------");
		
		//SWITCH CASE IS VALUE BASED
		//IT KNOWS THE VALUE -->JUMPS INTO MATCHING CASE
		String name;
		
		switch(day) {
		
		case 1:
			name="Monday";
			break;
		case 2:
			name="Tuesday";
			break;
		case 3:
			name="Wednesday";
			break;
		case 4:
			name="Thursday";
			break;
		case 5:
			name="Friday";
			break;
		case 6:
			name="Satuday";
			break;
		case 7:
			name="Sunday";
			break;
		default:
			name="Invalid";
			break;
		
		}
		System.out.println(name);
	}
}
