package part2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Declare constants to store the prices
		final double CHILD_TICKET = 15.50;
		final int ADULT_TICKET = 20;
		// Declare variables to store the number of tickets
		int ticketsAdult;
		double ticketsChild;
		// Declare variable to store the amounts
		int amountAdult;
		double amountChild;
		// Declare variables to store total without discount and with discount
		double totalNoDiscount;
		double total;
		// Create a scanner
		Scanner reader = new Scanner(System.in);
		// Ask the user for the number of tickets
		System.out.println("-- PARQUE ACUÁTICO --");
		System.out.println("Introduce el número de entradas de ADULTO que deseas: ");
		// Read the input with the scanner
		ticketsAdult = reader.nextInt();
		// Ask the user for the number of tickets
		System.out.println("Introduce el número de entradas INFANTILES que deseas: ");
		// Read the input with the scanner
		ticketsChild = reader.nextInt();
		// Close the scanner
		reader.close();
		// Calculate the amount of tickets adults
		amountAdult = ticketsAdult * ADULT_TICKET;
		// Calculate the amount of tickets child
		amountChild = ticketsChild * CHILD_TICKET;
		// Calculate the total without discount
		totalNoDiscount = amountAdult + amountChild;
		// Check if we have a discount
		total = totalNoDiscount >= 100 ? totalNoDiscount * 0.95 : totalNoDiscount;
		// Show the results
		System.out.println("Entradas de Adulto: " + ticketsAdult + " Entradas infantiles: " + ticketsChild);
		System.out.println("Precio total sin descuentos: " + totalNoDiscount + " €");
		System.out.println("PRECIO FINAL: " + total + " €");
	}

}
