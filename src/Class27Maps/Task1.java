package Class27Maps;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
         /* Create a class Insurance that will have an attribute as insuranceName and unimplemented
    behaviour as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
    Car class has its own attribute as carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
    */


        ArrayList<Insurance>insurances=new ArrayList<>();
        insurances.add(new Car("Adam", "Tesla"));
        insurances.add(new Pet("Bingo", "Dog"));
        insurances.add(new Health("StateLife"));
        System.out.println(insurances);


        for (Insurance i:insurances
        ) {
            i.getQuote();
            i.cancelInsurance();
        }
    }
}
