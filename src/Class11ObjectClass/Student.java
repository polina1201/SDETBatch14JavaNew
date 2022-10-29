package Class11ObjectClass;

public class Student {
    String name;
    String id;
    int age;
    double weight;
    char gender;

    void study() {
        System.out.println("Sudent is studying");
    }

    void deleteMessages() {
        System.out.println("Deleteing messages from Discord");
    }

    void eat() {
        System.out.println("Eating pizza..");
    }

    public static void main(String[] args) {
        //new Student()=> Creates the object of Student Class
        Student friadoonObject=new Student();
        friadoonObject.name="Friadoon";
        friadoonObject.id="123";
        friadoonObject.age=22;

        System.out.println(friadoonObject.name);
        System.out.println(friadoonObject.age);
        friadoonObject.deleteMessages();

        System.out.println("---------------------");

        Student student2=new Student(); //creating new class student2
        student2.name="Asma";
        student2.age=16;
        student2.weight=30;
        student2.gender='F';

        System.out.println(student2.name);
        student2.eat();

    }
}
