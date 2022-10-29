package Class16DifferObjectMethods;

public class Task1Tester {

    /*Create a Class called SyntaxEmployee: Create 3 variables empID, Salary, and set the CEO to "Sumair".
    -Create 2 objects of the class SyntaxEmployee.
    -Set the value of eID, salary for each of the objects
    -Print out the eID, Salary, and CEO for each of the objects
     */



    public static void main(String[] args) {


        SyntaxEmployee asgharEmp =new SyntaxEmployee();
        asgharEmp.empId="123";
        asgharEmp.salary=100000;

        //SyntaxEmployee.CEO="Asghar"; - we can change the value later on from "Sumair"
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(asgharEmp.empId);
        System.out.println(asgharEmp.salary);

        SyntaxEmployee moazzamEmp =new SyntaxEmployee();
        moazzamEmp.empId="678";
        moazzamEmp.salary=220000;

        System.out.println(SyntaxEmployee.CEO);
        System.out.println(moazzamEmp.empId);
        System.out.println(moazzamEmp.salary);

    }

}

