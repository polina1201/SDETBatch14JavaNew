package Class19InheritanceSuper;

public class Bird {
    String name;
    String color;
    int age;
    double weight;

    Bird(String name, String color,int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    void printInfo(){
        System.out.println("Name "+name+" Color "+ color+" Age "+age+" Weight "+weight);
    }
}


class Test{
    public static void main(String[] args) {
        Parrot parrot=new Parrot("Zeki","Green", 2, 1);
        parrot.printInfo();

        Crow Crow=new Crow("Crow","Black", 3,true,1.5);
        Crow.printInfo();

        Sparrow sparrow=new Sparrow("Sparrow","red", 3, 1.5);
        sparrow.printInfo();


    }
}