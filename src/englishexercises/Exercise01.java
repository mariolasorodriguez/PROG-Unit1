package englishexercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		// Declare variable to store the tax
		int tax;
		// Declare variable to store the price
		int price;
		// Declare variable to store the final price
		double finalPrice;
		// Display program title
		System.out.println("-- TAX CONVERTER --");
		// Ask the user for the price
		System.out.println("Enter a price: ");
		// Scan the input
		price = reader.nextInt();
		// Ask the user for the tax
		System.out.println("Enter the tax: ");
		// Scan the input
		tax = reader.nextInt();
		// Close the scanner
		reader.close();
		// Calculate the new price
		finalPrice = price * (1 + tax / 100.0);
		// Display the new price
		System.out.println("Final price: " + finalPrice + " €");
	}

}
