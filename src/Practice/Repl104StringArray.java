package Practice;

import java.util.Scanner;

public class Repl104StringArray {


    /*Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.

    * */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String arr[] = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=inp.next();
        }
for(String array:arr){
    System.out.println(array.substring(0,3));
}
        }
    }


