package unit1;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {

		// Create the scanner
		Scanner sc = new Scanner(System.in);
		// Declare a variable to storage the age
		int age;
		// Declare a variable to storage the name
		String name;
		// Ask the user for the name
		System.out.println("Introduce tu nombre: ");
		// Scan the input
		name = sc.nextLine();
		// Ask the user for the age
		System.out.println("Introduce tu edad: ");
		// Scan the input
		age = sc.nextInt();
		// Close the scanner
		sc.close();
		// Show the age with the message
		System.out.println("Hola " + name + ", tienes " + age + " años, ¡qué mayor eres!");
	}
}
