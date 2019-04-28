package com.daytwo;
import java.util.Random;
import java.util.Scanner;

public class RoshamboDayTwo {

	public static void main(String[] args) {
		// Declare variables.
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();
		String userName;
		String userChoice;
		String userValue;
		String opponentValue;
		String[] opponentNames = {"Watson", "Cerebro", "Hal 9000", "Deep Thought", "C-3PO", "Duotronics", "KITT", "Skynet", "Johnny 5"};
		int numMatches;
		int userWins = 0;
		int computerWins = 0;
		
		// Prompt user to enter name; greet user.
		System.out.println("Please enter your name: ");
		userName = scnr.next();
		System.out.println("Welcome to Roshambo, " + userName + "!");
		
		// Determine opponent name.
		System.out.println("Your opponent is " + opponentNames[rand.nextInt(9) - 1] + ".");
				
		// Play the game.
		do {
			System.out.println("How many matches would you like to play?");
			numMatches = scnr.nextInt();
			for (int i = 0; i < numMatches; i++) {
				// Prompt user to play.
				System.out.println("Rock, paper, or scissors? (R/P/S): ");
				userValue = scnr.next();
				System.out.println(userName + ", you have chosen " + userValue + ".");
				// Randomly determine and assign a value for the computer.
				int random = (int) (Math.random() * 3);
				// Use a control-flow statement to determine the computer's decision.
				switch (random) {

				case 0:
					opponentValue = "R";

				case 1:
					opponentValue = "P";

				case 2:
					opponentValue = "S";

				default:
					opponentValue = "R";
				}
				System.out.println("Your opponent has chosen " + opponentValue + ".");
			} 
			System.out.println("Would you like to play again(Y/N)?");
			userChoice = scnr.next();
			
		} while (userChoice.equalsIgnoreCase("Y"));
		
		
		
		// Determine the winner.
		
		
		// Announce the winner.
		if (userWins == computerWins) {
			System.out.println("It's a DRAW!");
		} else if (userWins > computerWins) {
			System.out.println(userName + " WINS!");
		} else {
			System.out.println(userName + " LOSES!");
		}
		
		scnr.close();
	}
}
