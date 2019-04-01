package com.dayone;
import java.util.Scanner;

public class RoshamboDayOne {

	public static void main(String[] args) {
		// Declare variables.
		Scanner scnr = new Scanner(System.in);
		String userName;
		String userValue;
		String computerValue;
		int userWins = 0;
		int computerWins = 0;
		
		// Prompt user to enter name; greet user.
		System.out.println("Please enter your name: ");
		userName = scnr.next();
		System.out.println("Welcome to Roshambo, " + userName + "!");
		
		// Prompt user to play.
		System.out.println("Rock, paper, or scissors? (R/P/S): ");
		userValue = scnr.next();
		System.out.println(userName + ", you have chosen " + userValue + ".");
		
		// Hard code the computer's choice.
		computerValue = "R";
		
		// Assume the user will choose "P" and increment number of user wins.
		++userWins;
		
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
