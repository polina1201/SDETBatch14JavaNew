package Class06Switch.class06;

import java.util.Scanner;

public class Task2 {

/*Write a program that will read three inputs of scores 
 * (quiz, mid term, and final scores)
 * and determine the grade based on the following rules: 
 * if the average score >=90 → grade=A
 * if the average score >= 70 and <90 → grade=B
 * if the average score>=50 and <70 → grade=C
 * if the average score<50 → grade=F
 */


	public static void main(String[] args) {
		//
		 Scanner input = new Scanner(System.in);
	        System.out.println("Please Enter your Quiz Score?");
	        double quiz = input.nextDouble();
	        System.out.println("Please Enter your mid term Score?");
	        double midterm = input.nextDouble();
	        System.out.println("Please Enter your Final Score?");
	        double Final = input.nextDouble();
	        double average;
	        average = (quiz+midterm+Final)/3;
	        String grade;

	        if(average>=90 && average<=100) {
	            grade = "A";
	        }else if(average>=70 && average<90) {
	            grade = "B";
	        }else if(average>=50 && average<70) {
	            grade = "C";
	        }else if(average<50 && average>0) {
	            grade = "F";
	        }else {
	            System.out.println("Please enter valid score!");
	            grade ="None";
	        }
	        System.out.println("Grade: "+grade);
		
		
	}

}
