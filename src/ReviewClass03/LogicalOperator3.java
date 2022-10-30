package ReviewClass03;

public class LogicalOperator3 {

	public static void main(String[] args) {
	
		double savings = 20000;
		boolean freeTime= true;
		String season = "Summer";
		
		if(savings>10000&&freeTime&&season.equals("Summer")) {
			System.out.println("Lets go to Bora Bora");
		}else {
			System.out.println("I need time and money");
		}

	}

}
