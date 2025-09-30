package part2;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		// Declare variable to storage the integer numbers
		int num1;
		int num2;
		// Declare variable to calculate the multiple
		int remains;
		int toNumber;
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		// Ask the user for the number
		System.out.println("Introduce un número entero: ");
		// Scan the input
		num1 = reader.nextInt();
		// Ask the user for the second number
		System.out.println("Introduce un segundo número entero: ");
		// Scan the input
		num2 = reader.nextInt();
		// Close the scanner
		reader.close();
		// Calculate what remains to be a multiple of 7
		remains = num1 % num2;
		toNumber = remains != 0 ? num2 - remains : 0;
		// Show the results
		System.out.println(num1 + " + " + toNumber + " = " + (num1 + toNumber) + " Le faltan " + toNumber + " para ser múltiplo de " + num2);
	}
}
