package part2;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		// Declare variable to store the problem
		int problem;
		// Declare variable to calculate the volume
		int volume;
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		// Ask the user for the problem
		System.out.println("Introduce el número de problema: ");
		// Read the input
		problem = reader.nextInt();
		// Close the scanner
		reader.close();
		// Calculate the volume
		volume = (int) problem / 100;
		// Show the input
		System.out.println("Tu problema pertenece al volumen: " + volume);
	}
}
