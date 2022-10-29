package Class07ForDoWhileLoop;

import java.util.Scanner;

public class DoWhileExamples {
    public static void main(String[] args) {
        /*
         *
         *
         */
        Scanner sc = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Did you get a job?");
            answer = sc.nextLine();

        } while (!answer.equals("yes"));

        System.out.println("Congrats!");

    }
    }
