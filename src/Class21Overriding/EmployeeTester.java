package Class21Overriding;

public class EmployeeTester {
    public static void main(String[] args) {

        OfficeBoy officeBoy=new OfficeBoy();
        officeBoy.calculateSalary();

        Tester tester=new Tester();
        tester.calculateSalary();

        Developer developer=new Developer();
        developer.calculateSalary();
    }
}
