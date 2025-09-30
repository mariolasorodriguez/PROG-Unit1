package part2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Declare variables to save the numbers
		int a;
		int b;
		int c;
		int x;
		// Declare variable to show the equation
		int y;
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		// Ask the user for the coefficient a
		System.out.println("Introduce el valor de a: ");
		// Scan the input
		a = reader.nextInt();
		// Ask the user for the coefficient b
		System.out.println("Introduce el valor de b: ");
		// Scan the input
		b = reader.nextInt();
		// Ask the user for the coefficient c
		System.out.println("Introduce el valor de c: ");
		// Scan the input
		c = reader.nextInt();
		// Ask the user for the value x
		System.out.println("Introduce el valor de x: ");
		// Scan the input
		x = reader.nextInt();
		// Show the equation
		System.out.println("");
	}

}
