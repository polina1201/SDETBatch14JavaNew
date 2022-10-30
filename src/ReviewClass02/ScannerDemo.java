package ReviewClass02;

import java.util.Scanner;

public class ScannerDemo {
	

	public static void main(String[] args) {
		
		/*
		 * nextLine is a special method that can capture spaces and enters as well
		 * when we use any method like nextInt() or nextBoolean(), nextDouble() and after that if we use
		 * nextLine() we need to discard that enter by using an extra nextLine() call
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter Your Name");
		String name=scanner.nextLine();
		System.out.println("Please Enter Your Age");
		int age=scanner.nextInt();
		System.out.println(name+" is "+age+" years old");

	}

}
