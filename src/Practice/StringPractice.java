package Practice;

import java.util.Scanner;

public class StringPractice {
    /*
Inputs:
String word;
Write a for loop that will print out every other letter in a String, starting with
the first letter. These letters should be printed all on one line with no space in
between.
Sample input/outputs
In: hello
hlo
In: SSyynnttaaxxTTeecchhnnoollooggiieess
SyntaxTechnologies
 */

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String word = inp.nextLine();
            //write your code below
            for (int i = 0; i < word.length(); i += 2) {
                String letter = word.replaceAll("\\s", "");
                System.out.print(letter.charAt(i));
            }
        }
    /*

Write a for loop that will loop through every character of a word and print out
each character, each on a separate line
Sample inputs/outputs:
In: hello
h
e
l
l
o
*/
    /* Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String word = inp.nextLine();
            //write your code below
            for (int i = 0; i < word.length(); i++) {
                System.out.println(word.charAt(i));*/
            }


