package englishexercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		// Declare variable to store the pounds
		double pound;
		// Declare variable to calculate the kilograms
		double kilo;
		// Ask the user for a value in pounds
		System.out.println("Enter value in pounds: ");
		// Scan the input
		pound = reader.nextDouble();
		// Close the scanner
		reader.close();
		// Calculate in kilograms
		kilo = pound / 2.2;
		// Display value in kilograms
		System.out.println(kilo + " kilograms");
	}

}
