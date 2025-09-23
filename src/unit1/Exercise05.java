package unit1;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		// Creation of the scanner
		Scanner sc = new Scanner(System.in);
		// Declaration of variable to ask the radius
		double radius;
		// Ask the user for the radius
		System.out.println("Introduce el radio de tu circunferencia: ");
		// Read the console input of the radius
		radius = sc.nextDouble();
		// Close the scanner
		sc.close();
		// Calculate the length and declare variable
		double length = 2 * Math.PI * radius;
		// Calculate the area and declare variable
		double area = Math.PI * Math.pow(radius, 2);
		// Show the results
		System.out.println("El área de tu circunferencia es: " + area );
		System.out.println("La longitud de tu circunferencia es: " + length );
	}
}
