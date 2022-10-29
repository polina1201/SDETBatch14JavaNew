package Review4;

public class Banana extends Fruit {

    String origin;


    Banana (String name, String shape, String color, String origin) {
        super(name, shape, color);
        this.origin=origin;
    }
    void makeSmoothie(){
        System.out.println("from "+name+" we get tasty smoothie");
    }
    /*When child class has same method name as super class-
    overridng - 2 methods with same name BUT inside Different classes
     */

    /*How to Override
        1. Method signature MUST be same
        2. Return type MUST be same
        3. Access modifier/visibility can be same or be higher
     */
    protected void grow(){
        System.out.println(name+" grows fast and fresh");

    }
    public static void havePeel(){
        System.out.println("Banana is very easy to peel");
    }

    public static void main(String[] args) {
        Banana ban=new Banana ("banana", "banana shape","yellow", "Ecuador");

        ban.giveBenefits();//fruit
        ban.makeSmoothie();//banana
        ban.grow();//banana
        Banana.havePeel();//banana

        //runtime polymorphism

        Fruit fruit=new Banana("banana","banan shape", "green", "Africa");
        fruit.grow();
        fruit.giveBenefits();


    }

    }

