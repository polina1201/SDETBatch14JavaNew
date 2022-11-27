package Repls;

import java.util.Scanner;

public class rep104First3Letters {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter five names");

        String[] names= new String[5];
        for (int i=0;i<=names.length;i++){
            names[i]=scanner.next();

            System.out.println(names[i].substring(0,3));

        }
    }
}
