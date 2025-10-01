package part2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// We declare variables to store the seconds entered.
		int totalSeconds;
		// We declare another variables to store the hours, minutes and seconds.
		int minutes;
		int hours;
		int seconds;
		// Create a scanner
		Scanner reader = new Scanner(System.in);
		// Ask the user for the seconds
		System.out.println("Introduce una cantidad de segundos: ");
		// We read the input
		totalSeconds = reader.nextInt();
		// Close the scanner
		reader.close();
		// Calculate the seconds in hours
		hours = totalSeconds / 3600;
		// Calculate the seconds in minutes
		minutes = (totalSeconds % 3600) / 60;
		// Calculate the seconds
		seconds = totalSeconds % 60;
		// Show the results
		System.out.println(totalSeconds + " segundos equivalen a:");
		System.out.println(hours + " horas, " + minutes + " minutos y " + seconds + " segundos.");
	}

}
