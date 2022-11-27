package Repls;

import java.util.Scanner;

public class Rep105Vowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        System.out.print(word.toLowerCase().replaceAll("[^aeiou]",""));

    }
}
