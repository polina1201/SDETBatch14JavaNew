package Class11ObjectClass;

public class Person {
    String name;
    int age;
    double weight;
    double height;
    boolean isFunny;
    boolean losingHairs;

    void study(){
        if(name.equalsIgnoreCase("Adam")){
            System.out.println("I will study hard");
        }else if(name.equalsIgnoreCase("Amber")){
            System.out.println("I will workout more");
        }else{
            System.out.println("Please Study harder!!");
        }
    }
    void qualified(){
        if(height<5.6){
            System.out.println("You are not qualified for the Army");
        }else{
            System.out.println("Congrats!! You are Qualified for Army");
        }

    }
    void makeJokes(){
        if(isFunny){
            System.out.println("He cracks joke a lot");
        }else{
            System.out.println("He is not funny");
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.height = 6.5;
        person.name = "Dan";
        person.isFunny = true;
        person.weight = 170;

        person.study();
        person.makeJokes();
        person.qualified();
        System.out.println("--------------------------------");
        Person person1 = new Person();
        person1.height = 5.5;
        person1.name = "Amber";
        person1.isFunny = false;
        person1.weight = 175;

        person1.study();
        person1.makeJokes();
        person1.qualified();
    }
}
