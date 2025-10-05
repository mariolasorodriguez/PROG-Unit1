package englishexercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Create a scanner
		Scanner reader = new Scanner(System.in);
		// Declare variable to store the actual year
		int actualYear;
		// Declare variable to store the age
		int age;
		// Declare variable to calculate the year of birth
		int birth;
		// Ask the user for the actual year
		System.out.println("What is the actual year?: ");
		// Scan the input
		actualYear = reader.nextInt();
		// Ask the user for age
		System.out.println("What is your age?: ");
		// Scan the input
		age = reader.nextInt();
		// Close the scanner
		reader.close();
		// Calculate the birth year
		birth = actualYear - age;
		// Show the result
		System.out.println("Your birth age is: " + birth);
	}

}
