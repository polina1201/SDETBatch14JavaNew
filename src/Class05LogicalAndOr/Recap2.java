package Class05LogicalAndOr;

public class Recap2 {

	public static void main(String[] args) {
		// to format code use ctrl shift f
		boolean allergy = true;

		String allergyType = "Pollen";

		if (allergy) {
			System.out.println("Let's check what allergy you have");
			if (allergyType.equals("Pollen")) {
				System.out.println("Try to stay indoors when trees are blooming");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Please stay away from peanuts");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy products");
			} else {
				System.out.println("We need to do some test");
			}

		} else {
			System.out.println("You are lucky");
		}

	}

}
