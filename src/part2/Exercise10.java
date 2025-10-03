package part2;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		// Declare variable to store the year
		int year;
		// Declare variable to store the century
		int century;
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		// Ask the user for a year
		System.out.println("Introduce el año: ");
		// Scan the input
		year = reader.nextInt();
		// Close the scanner
		reader.close();
		// Calculate the century
		century = ((year - 1) / 100) + 1;
		// Show the result
		System.out.println("El año: " + year + " pertenece al siglo: " + century);
	}
}
