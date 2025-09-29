package part2;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		// Declare variable to storage the number
		double number;
		// Declare variable to storage the rounded number
		int rounded;
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		// Ask the user for the number
		System.out.println("Introduce el número con decimales a redondear: ");
		// Scan the input
		number = reader.nextDouble();
		// Close the scanner
		reader.close();
		// Calculate rounding
		rounded = (int) (number + 0.5);
		// Show the results
		System.out.println("El número redondeado es: " + rounded);
	}
}
