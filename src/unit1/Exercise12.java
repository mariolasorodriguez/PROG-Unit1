package unit1;

import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		// Creation of the scanner
		Scanner sc = new Scanner(System.in);
		// Declare variable to storage the sales of apples
		double appleSales;
		// Declare variable to storage the sales of pears
		double pearSales;
		// Declare variable to storage the profit of apples
		double profitApple;
		// Declare variable to storage the profit of pears
		double profitPears;
		// Declare constant to save the price per kilogram of apples
		final double APPLE_KILOGRAM = 2.35;
		// Declare constant to save the price per kilogram of pears
		final double PEAR_KILOGRAM = 1.95;
		// Ask the seller how many kilograms of apples have been sold
		System.out.println("Introduce la cantidad de kilos de manzana vendidos: ");
		// Scan the input and storage in a variable
		appleSales = sc.nextDouble();
		// Ask the seller how many kilograms of pears have been sold
		System.out.println("Introduce la cantidad de kilos de peras vendidos: ");
		// Scan the input and storage in a variable
		pearSales = sc.nextDouble();
		// Close the scanner
		sc.close();
		// Calculate profits of apples
		profitApple = appleSales * APPLE_KILOGRAM;
		// Calculate profits of pears
		profitPears = pearSales * PEAR_KILOGRAM;
		// Show the results
		System.out.println("Las ganancias de la venta de " + appleSales + "Kg de Manzanas son:  " + profitApple + " €");
		System.out.println("Las ganancias de la venta de " + pearSales + "Kg de Peras son:  " + profitPears + " €");
	}

}
