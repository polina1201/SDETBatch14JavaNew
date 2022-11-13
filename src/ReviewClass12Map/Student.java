package ReviewClass12Map;

public class Student {
    private String firstname;
    private String lastName;
    private String rollNumber;

    public Student(String firstname, String lastName, String rollNumber) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
    }
    void printname(){
        System.out.println(firstname+lastName);
    }
    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }


}



