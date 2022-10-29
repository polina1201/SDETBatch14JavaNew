package Class14CreateObjMethods;

public class MethodsDemo2 {
    void printManyTimes(int times){
        for (int i=0; i<times; i++){
            System.out.println("Hello Java");
        }
    }

    //In Parameters sequence and data type matters

    void printCustomWordManyTimes(String word, int times){
        for (int i = 0; i <times ; i++) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        MethodsDemo2 md=new MethodsDemo2();
        md.printManyTimes(2);  //This is to print Hello Java

        md.printCustomWordManyTimes("Syntax Easy",3); //This is to print printCustomWordManyTimes
    }


}
