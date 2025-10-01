package part2;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		// Declare variable to storage the distance in meters
		double distanceMeters;
		// Declare variable to storage the distance in centimeters
		double distanceCm;
		// Declare a variable to storage the final distance
		int finalDistance;
		// Create a scanner
		Scanner reader = new Scanner(System.in);
		// Ask to the user for the distance in meters
		System.out.println("Introduce la distancia realizada en metros: ");
		// Read the input
		distanceMeters = reader.nextDouble();
		// Close the scanner
		reader.close();
		// Convert the distance to centimeters
		distanceCm = (distanceMeters * 10) * 10;
		// Calculate the final distance in centimeters without decimals
		finalDistance = (int) distanceCm;
		// Show the results
		System.out.println("Distancia del lanzamiento: " + finalDistance + " cm");
	}
}
