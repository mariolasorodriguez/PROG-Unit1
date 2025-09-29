package part1;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		// Creation of the scanner
		Scanner sc = new Scanner(System.in);
		// Declare variable to storage the number
		int number;
		// Declare variable to check even or odd
		boolean even;
		// Ask the user for the number
		System.out.println("Introduce un número: ");
		// Scan the input
		number = sc.nextInt();
		// Close the scanner
		sc.close();
		// Check if the number is even or odd
		even = number %2 == 0;
		// Print the result
		System.out.println("¿Tú numero es par? " + even);
	}
}
