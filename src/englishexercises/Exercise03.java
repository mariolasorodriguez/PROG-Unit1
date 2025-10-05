package englishexercises;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		// Declare variable for the length
		double length;
		// Declare variable for the height
		double height;
		// Declare variable to calculate the area
		double area;
		// Declare variable to calculate the perimeter
		double perimeter;
		// Ask the user for the length
		System.out.println("Enter the length of the rectangle: ");
		// Scan the input
		length = reader.nextDouble();
		// Ask the user for the height
		System.out.println("Enter the height of the rectangle: ");
		// Scan the input
		height = reader.nextDouble();
		// Close the scanner
		reader.close();
		// Calculate the area
		area = length * height;
		// Calculate the perimeter
		perimeter = 2 * (length + height);
		// Show the results
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}
}
