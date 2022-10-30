package ReviewClass03;

public class LogicalOperator {

	public static void main(String[] args) {
		
		boolean programmer=true;
		boolean manualTester=true;
		boolean knowFramework=false;
		
		if (programmer && manualTester&&knowFramework) {
			System.out.println("You can be an automation engeneer");
		}else {
			System.out.println("You must know a programming language and manual testing to be an automation engineer");
		}
				

	}

}
