package Class05LogicalAndOr;

import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {

		/*
		 * Write a program that will ask user to input inputs the current time (use 24
		 * hour format). 
		 * if hour is between 1-11 --> Morning 
		 * if hour between 12-15 --> Afternoon 
		 * if hour between 16-20 --> Evening 
		 * if hour between 21-24 --> Night
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("What time is it?");

		int time = input.nextInt();

		if (time>=1 && time <=11) {
			System.out.println("It's currently morning");
		}else if (time>=12 && time <=15) {
			System.out.println("It's currently afternoon");
		}else if (time>=16 && time <=20) {
			System.out.println("It's currently evening");
	}else if (time >=21 && time <=24) {
		System.out.println("It's currently night");
	}
}
	
}