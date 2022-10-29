package Class09Arrays;

public class Task {
    public static void main(String[] args) {

        /*Create an array of chars and store
         * grades into it: A,B,C,D. Then print a grade B
         * (use 2 different ways of creating an array).
         */

        char[]grades=new char[4];

        grades[0]='A';
        grades[1]='B';
        grades[2]='C';
        grades[3]='D';

        System.out.println(grades[1]);

        System.out.println("------------------------");

        /*Create an array of names and store all names of your group.
         *  Then print your name from that array. (use 2 different ways
         * of creating an array).
         */

        String[]name=new String[4];

        name[0]="Polina";
        name[1]="Conor";
        name[2]="Allie";
        name[3]="Tommy";

        System.out.println(name[1]);

        //way 2

        String[]names= {"Polina","Connor","Allie","Tommy"};
        System.out.println(names[3]);



        /*Create an array of words: Java, Saturday, day, coding, is.
         * Print the following sentence using elements of array:
         * “Saturday is Java coding Day”.
         *
         */


        String[]word= {"Java","Saturday","day","coding","is"};



        System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);





    }
}
