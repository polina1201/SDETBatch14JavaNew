package Class06Switch.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */

		Scanner inp = new Scanner(System.in);
		System.out.println("Where are you from?");
		String country = inp.nextLine();
		String language;
		
		switch (country.toUpperCase()) {

		case "Ukraine":
			language = "Ukrainian";
			break;

		case "Italy":
			language = "Italian";
			break;

		case "France":
			language = "Frech";
			break;

		case "Vietnam":
			language = "Vietnamese";
			break;

		case "England":
			language = "English";
			break;

		case "Guatemala":
			language = "Spanish";
			break;
		
		default: //just added and now everything is unknown
			language = "Unknown";
			break;

		}System.out.println("You speak "+language+" language.");

	}

}
