package Class14CreateObjMethods;

public class Math {

    //Write a Java Program to print the first 10 numbers of Fibonacci code
    void add(int num1, int num2){
        System.out.println(num1+num2);
    }

        void printFiboSeries(int size){

            int previous = 0;
            int currentNumber = 1;
            int nextNum = 0;
            System.out.println(previous);
            System.out.println(currentNumber);
            for (int i = 0; i <size; i++) {
                nextNum = previous + currentNumber;
                System.out.println(nextNum);
                previous = currentNumber;
                currentNumber = nextNum;
            }

        }

    public static void main(String[] args) {
        Math obj=new Math(); //Creating an object of the Math class
        obj.printFiboSeries(5);//first 5 Fibonacci numbers. This is how we execute the logic inside the method
        obj.printFiboSeries(10);//first 10 Fibonacci numbers


        obj.add(10,20);//printed from void entered on top
    }
    }

