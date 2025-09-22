package unit1;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		// Creation of the scanner
		Scanner sc = new Scanner(System.in);
		// Declaration of variables
		double radius;
		double area;
		double length;
		// Ask the user for the radius
		System.out.println("Introduce el radio de tu circunferencia: ");
		// Read the console input of the radius
		radius = sc.nextDouble();
		// Close the scanner
		sc.close();
		// Calculate the area
		area = (2*Math.PI)*(radius*radius);
		// Show the results
		System.out.println("El área de tu circunferencia es: " + area);
		// Calculate the length
	}
}
