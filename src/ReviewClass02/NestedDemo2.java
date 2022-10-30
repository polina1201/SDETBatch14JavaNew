package ReviewClass02;

public class NestedDemo2 {

	public static void main(String[] args) {
		 /*
         * Nested if-conditions are conditions which are dependent on each other if outer condition is
         * not true inner-condition is never checked inner-condition is only checked when 
         * outer-condition is passed 
         */

        int money=12;

        if(money>10) {  //outer conditions

            System.out.println("Lets buy some eggs");
            int noOfEggs=2;

            if(noOfEggs>0) {
                System.out.println("lets boil the eggs");
            }

        }

	}

}
