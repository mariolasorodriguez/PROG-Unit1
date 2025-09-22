package unit1;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		// Creation of the scanner
		Scanner sc = new Scanner(System.in);
		// Declaration of the variable to storage the age
		int age;
		// Ask the user for her age
		System.out.println("Escribe tu edad:");
		// Request age
		age = sc.nextInt();
		// Year addition
		age++;
		// Print the age 
		System.out.println("El año que viene tendrás: " + age + " años");
		// Close the scanner
		sc.close();
	}
}