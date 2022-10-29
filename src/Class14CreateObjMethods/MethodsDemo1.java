package Class14CreateObjMethods;

public class MethodsDemo1 {

//A Method that does not take any parameters and prints some lines on the console
    void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello Java");
    }
//A Method that takes a single parameter of type String and prints it
    void printWord(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        MethodsDemo1 obj=new MethodsDemo1();
        obj.printHello();
        obj.printWord("Polina Don't worry, it's just Java");
        obj.printWord("no, it makes no sense");
    }


    }

