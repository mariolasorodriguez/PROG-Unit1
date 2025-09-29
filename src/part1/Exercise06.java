package part1;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Creation of the scanner
		Scanner sc = new Scanner(System.in);
		// Declare variable to storage the first number
		double num1;
		// Declare variable to storage the second number
		double num2;
		// Declare variable to storage the results of operations
		double add;
		double sub;
		double multi;
		double divi;
		// Ask the user for the first number
		System.out.println("Introduce el primer número: ");
		// Read the input with the scanner
		num1 = sc.nextDouble();
		// Ask the user for the second number
		System.out.println("Introduce el segundo número: ");
		// Read the input with the scanner
		num2 = sc.nextDouble();
		// Close the scanner
		sc.close();
		// Make the addition
		add = num1 + num2;
		// Make the subtraction
		sub = num1 - num2;
		// Make the multiplication
		multi = num1 * num2;
		// Make the division
		divi = num1 / num2;
		// Show the results line by line
		System.out.println("La suma de " + num1 + " + " + num2 + " es " + add );
		System.out.println("La resta de " + num1 + " - " + num2 + " es " + sub );
		System.out.println("La multiplicación de " + num1 + " x " + num2 + " es " + multi );
		System.out.println("La división de " + num1 + " / " + num2 + " es " + divi );
	}

}
