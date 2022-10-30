package Class05LogicalAndOr;

public class LogicalOr {

	public static void main(String[] args) {

		String day = "sunday";

		if (day.equals("saturday") || day.equals("sunday")) {
			System.out.println("I have Java class at Syntax - using logical ||");

		}
		System.out.println("--------------------");
		if (day.equals("saturday") && day.equals("sunday")) {
			System.out.println("I have JAva class at Syntax - using logical &");
		}
		System.out.println("---------------");
		
		double money = 120000;
		
		String title = "Manual Tester";
		
		if(title.equals("Automation Tester") || money ==120000) {
			System.out.println("Happy");
		}
		

	}

}
