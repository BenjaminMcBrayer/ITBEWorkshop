package com.daytwo;
import java.util.Random;
import java.util.Scanner;

public class RoshamboDayTwoWithoutPlayerClass {

	public static void main(String[] args) {
		// Declare variables.
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();
		String username;
		String userChoice;
		String userValue;
		String opponentName;
		String opponentValue;
		String[] opponentNames = {"Watson", "Cerebro", "Hal 9000", "Deep Thought", "C-3PO", "Duotronics", "KITT", "Skynet", "Johnny 5"};
		String matchResult;
		int numMatches;
		int userWins = 0;
		int opponentWins = 0;
		
		// Prompt user to enter name; greet user.
		System.out.println("Please enter your name: ");
		username = scnr.next();
		System.out.println("Welcome to Roshambo, " + username + "!");
		
		// Determine opponent name.
		opponentName = opponentNames[rand.nextInt(8)];
		System.out.println("Your opponent is " + opponentName + ".");
				
		// Play the game. Allow user to choose number of matches. Optional: set a limit on the number of matches that can be played.
		do {
			System.out.println("How many matches would you like to play?");
			numMatches = scnr.nextInt();
			for (int i = 0; i < numMatches; i++) {
				
				// Prompt user to play.
				System.out.println("Rock, paper, or scissors? (R/P/S): ");
				userValue = scnr.next();
				System.out.println(username + ", you have chosen " + userValue + ".");
				
				// Randomly determine and assign a value for the computer.
				int random = (int) (Math.random() * 3);
				
				// Use a control-flow statement to determine the computer's decision.
				switch (random) {

				case 0:
					opponentValue = "R";
					break;
				case 1:
					opponentValue = "P";
					break;
				case 2:
					opponentValue = "S";
					break;
				default:
					opponentValue = "R";
				}
				System.out.println("Your opponent has chosen " + opponentValue + ".");
				
				// Determine the winner of each match.
				matchResult = determineMatchResult(username, userValue, opponentName, opponentValue);
				System.out.println(matchResult);
				
				// Tally results.
				if (matchResult.contains(username)) {
					++userWins;
				} else if (matchResult.contains(opponentName)) {
					++opponentWins;
				}
			} 
			// Announce the overall winner.
			if (userWins == opponentWins) {
				System.out.println("It's a DRAW!");
			} else if (userWins > opponentWins) {
				System.out.println(username + " WINS!");
			} else {
				System.out.println(username + " LOSES!");
			}
			System.out.println("Would you like to play again(Y/N)?");
			userChoice = scnr.next();
			
		} while (userChoice.equalsIgnoreCase("Y"));		
		System.out.println("Thanks for playing, " + username + "!");
		scnr.close();
	}
	
	/**
	 * Determines the winner of a match of Roshambo
	 * 
	 * @param username	the name of the user
	 * @param userValue	the user's choice of Roshambo value
	 * @param opponentName	the name of the user's opponent
	 * @param opponentValue	the opponent's choice of Roshambo value
	 * @return a declaration of the winner of a match
	 */
	public static String determineMatchResult(String username, String userValue, String opponentName, String opponentValue) {
		if (userValue.equalsIgnoreCase(opponentValue)) {
			return "It's a draw!";
		} else if ((userValue.equalsIgnoreCase("R") && opponentValue.equalsIgnoreCase("P"))
				|| (userValue.equalsIgnoreCase("P") && opponentValue.equalsIgnoreCase("S"))
				|| (userValue.equalsIgnoreCase("S") && opponentValue.equalsIgnoreCase("R"))) {
			return opponentName + " wins!";
		} else {
			return username + " wins!";
		}
	}
}
