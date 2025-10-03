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
		double y;
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
		// Ask the user for the coefficient x
		System.out.println("Introduce el valor de x: ");
		// Scan the input
		x = reader.nextInt();
		// Close the scanner
		reader.close();
		// Calculate the equation
		y = (a * Math.pow(x, 2)) + (b * x) + c;
		// Show the equation
		System.out.println("El valor es igual a y= " + y);
	}

}
