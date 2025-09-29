package part1;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		// Create Scanner object to read input
		Scanner sc = new Scanner(System.in);
		// Declare variables
		double pesetas;
		// Declare a variable to show the conversion
		double euros;
		// Declare a constant with the rate of pesetas
		final double CONVERSION_RATE = 166.0; // 1€ = 166 pesetas
		// Ask user for the value in pesetas
		System.out.print("Introduce la cantidad de pesetas a convertir: ");
		pesetas = sc.nextDouble();
		// Convert pesetas to euros
		euros = pesetas / CONVERSION_RATE;
		// Show result
		System.out.println("Equivalente en euros: " + euros);
		// Close the scanner
		sc.close();
	}
}
