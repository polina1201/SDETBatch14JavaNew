package Class13StringMethods;

import java.util.Arrays;
public class StringDemo4 {
    public static void main(String[] args) {

        //To get words out of the string
        String str="Batch 14 is really good";
        String [] arr=str.split("\s");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);

        System.out.println();

        String str2="Today is Sunday. Sunday is good. Java is also good";
        String[] arr2=str2.split("[.]");
        System.out.println(Arrays.toString(arr2));
    }
}



