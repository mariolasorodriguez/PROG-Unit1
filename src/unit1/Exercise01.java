package unit1;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		//Creation of the scanner
		Scanner sc = new Scanner(System.in);
		//Declaration of the variable
		int number;
		// Ask the user for a number
		System.out.println("Escribe un número:");
		// Request number
		number = sc.nextInt();
		//Print the value
		System.out.println("Ha escrito: " + number);
		//Close the scanner
		sc.close();
	}
}
