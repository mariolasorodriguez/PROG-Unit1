package englishexercises;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Create a scanner
		Scanner reader = new Scanner(System.in);
		// Declare variables
		int students;
		int sizeTeams;
		int leftStudents;
		int numberTeams;
		// Ask the number of students in class
		System.out.println("Enter the number of students in the class: ");
		// Read the input
		students = reader.nextInt();
		// Ask the size of the group teams
		System.out.println("Enter the size of the teams: ");
		// Scan the input
		sizeTeams = reader.nextInt();
		// Close the scanner
		reader.close();
		// Calculate teams
		numberTeams = students / sizeTeams;
		// Calculate students without team
		leftStudents = students - numberTeams * sizeTeams;
		// Show the results
		System.out.println("Number of teams: " + numberTeams + " of " + sizeTeams + " students");
		System.out.println("Students without team: " + leftStudents);
	}

}
