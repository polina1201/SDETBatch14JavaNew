package Class06Switch.class06;

import java.util.Scanner;

public class EnhanceCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("What time is it?");

		String timeOfTheDay;
		int time = scanner.nextInt();

		if (time >= 1 && time <= 11) {
			timeOfTheDay = "Morning";
		} else if (time >= 12 && time <= 15) {
			timeOfTheDay = "Afternoon";
		} else if (time >= 16 && time <= 20) {
			timeOfTheDay = "Evening";
		} else if (time >= 21 && time <= 24) {
			timeOfTheDay = "Night";
		} else {
			System.out.println("Wrong number is entered");
			timeOfTheDay = "Invalid";
		}
		System.out.println(timeOfTheDay);

	}

}
