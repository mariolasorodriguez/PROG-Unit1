package part2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Declare variables to store the distances
		int millimeters;
		int centimeters;
		int meters;
		// Declare variables to store the changed distances
		int c1;
		int c2;
		// Declare a variable to store the amount
		int amount;
		// Create a scanner
		Scanner reader = new Scanner(System.in);
		// Ask the user for the distance in millimeters
		System.out.println("Introduce una distancia en milimetros: ");
		// Read the input and store in a variable
		millimeters = reader.nextInt();
		// Ask the user for the distance in centimeters
		System.out.println("Introduce una distancia en centimetros: ");
		// Read the input and store in a variable
		centimeters = reader.nextInt();
		// Ask the user for the distance in meters
		System.out.println("Introduce una distancia en metros: ");
		// Read the input and store in a variable
		meters = reader.nextInt();
		// Close the scanner
		reader.close();
		// Move millimeters to centimeters
		c1 = millimeters / 10;
		// Move meters to millimeters
		c2 = (meters * 10) * 10;
		// Calculate the amount
		amount = centimeters + c1 + c2;
		// Show the result
		System.out.println("Distancia sumada en centimetros: " + amount);
	}

}
