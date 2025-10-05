package englishexercises;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		// Declare variable to store the weight
		double weight;
		// Declare variable to store the height
		double height;
		// Declare variable to calculate the BMI
		double bmi;
		// Ask the user for the weight
		System.out.println("Enter your weight: ");
		// Scan the input
		weight = reader.nextDouble();
		// Ask the user for the height with decimals (1,75)
		System.out.println("Enter your height: ");
		// Scan the input
		height = reader.nextDouble();
		// Close the scanner
		reader.close();
		// Calculate the BMI
		bmi = weight / Math.pow(height, 2);
		// Show the results
		System.out.println("Your BMI is: " + bmi);
	}

}
