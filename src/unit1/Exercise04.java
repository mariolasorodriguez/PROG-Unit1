package unit1;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		// Creation of the scanner
		Scanner sc = new Scanner(System.in);
		// Declaration of variables to storage two grades and the average
		int gra1;
		int gra2;
		double avg;
		// Ask the user for the first grade
		System.out.println("Introduce la primera nota: ");
		// Read the input and storage in the variable gra1
		gra1 = sc.nextInt();
		// Ask the user for the second grade
		System.out.println("Introduce la segunda nota: ");
		// Read the input and storage in the variable gra2
		gra2 = sc.nextInt();
		// Calculate the average
		avg = gra1+gra2/2;
		// Show the average to the user
		System.out.println("Tu nota media es: " + avg);
		// Close the scanner
		sc.close();
	}
}
