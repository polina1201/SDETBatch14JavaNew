package Practice;

public class Animal {
    String name;
    int age;
   static boolean tricks=false;

   public static void trick(){
       tricks=true;
       }
   public static void noTrick(){
       System.out.println("I can't do any tricks");
   }
    public void eat(){
        System.out.println("I can eat");
    }

}
class Dog extends Animal{
    public void display(){

        System.out.println("My name is "+name+" and I am "+age+" years old");

    }
}
class Main {
    public static void main(String[] args) {
        Dog Lab=new Dog();
        Lab.name="Blue";
        Lab.age=5;
        Lab.display();
        Lab.eat();
        Lab.noTrick();



    }
}
