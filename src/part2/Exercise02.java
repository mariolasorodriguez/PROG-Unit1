package part2;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		// Declare variable to storage the integer number
		int number;
		// Declare variable to calculate the multiple
		int remains;
		int toSeven;
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		// Ask the user for the number
		System.out.println("Introduce un número entero: ");
		// Scan the input
		number = reader.nextInt();
		// Close the scanner
		reader.close();
		// Calculate what remains to be a multiple of 7
		remains = number % 7;
		toSeven = remains != 0 ? 7 - remains : 0;
		// Show the results
		System.out.println(number + " + " + toSeven + " = " + (number + toSeven) + " Le faltan " + toSeven + " para ser múltiplo de 7");
	}
}
