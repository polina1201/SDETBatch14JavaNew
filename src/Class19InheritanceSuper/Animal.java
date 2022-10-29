package Class19InheritanceSuper;

public class Animal {
    String name;
    String breed;
    String color;

    Animal(String name, String breed, String color) {//constructor
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" Color "+color);
    }
}
