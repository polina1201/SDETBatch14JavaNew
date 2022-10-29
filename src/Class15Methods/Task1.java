package Class15Methods;

public class Task1 {

    //Create a method that will take 2 parameters as a numbers and prints which number is larger.

    void printLarger (int num1, int num2){
        if(num1>num2){
            System.out.println("Number 1 is larger "+num1);
        }else if(num2>num1){
            System.out.println("Number 2 is larger "+num2);
        }else {
            System.out.println("Numbers are equal");
        }
    }

    public static void main(String[] args) {

       //Scanner scanner=new Scanner (System.in);     ----------If we want to use scanner and have them type numbers
       //System.out.println("Please enter the first number");
       //int num1=scanner.nextInt();
       // System.out.println("Please enter the second number");
        // int num2=scanner.nextInt();
        //task1.printLarger(num1,num2);
        Task1 task1=new Task1();
        task1.printLarger(12,36);
        task1.printLarger(50,12);
    }
}
