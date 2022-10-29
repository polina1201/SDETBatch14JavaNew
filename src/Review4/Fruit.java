package Review4;
//there are 4 instance variables
public class Fruit {

    protected String name;
    String shape;
    private String color;
    public static boolean fresh;

    //now we are building constractor
    public Fruit (String name){
        this.name=name;
    }
    //now we are initializing constractor name, shape, and color
    Fruit(String name, String shape, String color){
        this (name);
        this.shape=shape;
        this.color=color;
    }
     void grow(){
        System.out.println("All fruits grow "+fresh);
    }

    public static void havePeel(){
        System.out.println("All fruit need to be peeled");
    }
    protected void giveBenefits(){
        System.out.println("All fruits have benefits");
    }
}
