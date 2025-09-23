package unit1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Creation of the scanner
		Scanner sc = new Scanner(System.in);
		// Declare variable to storage the name
		String name;
		// Declare variable to storage the address
		String address;
		// Declare variable to storage phone number
		String phoneNumber;
		// Ask the user for the name
		System.out.println("Introduce tu nombre: ");
		// Scan the input to save in a variable
		name = sc.nextLine();
		// Ask the user for the address
		System.out.println("Introduce tu dirección: ");
		// Scan the input to save address
		address = sc.nextLine();
		// Ask the user for the phone number
		System.out.println("Introduce tu número de teléfono: ");
		// Scan the input to save the phone number
		phoneNumber = sc.nextLine();
		// Close the scanner
		sc.close();
		// Show the results to the user
		System.out.println("Nombre: " + name);
		System.out.println("Dirección: " + address);
		System.out.println("Teléfono: " + phoneNumber);
	}

}
