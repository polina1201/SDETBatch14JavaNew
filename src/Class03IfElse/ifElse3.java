package Class03IfElse;

public class ifElse3 {

	public static void main(String[] args) {
		
		boolean isHungry=true;
		
		if (isHungry)
			System.out.println("Lets eat something yummy");

		if (3>2)
			
			System.out.println("There is a true statement inside paranthesis");
		
		double myBankBalance=2000;
		double theAmountThatIwantToTransfer=2500;
		
		if (myBankBalance>theAmountThatIwantToTransfer)
			System.out.println("Funds transfered succesfully");
	
		else
			System.out.println("Please try again, not enough balance");
	 
	}

}
