package com.daytwo;

import java.util.Random;
import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random randNumGenerator = new Random();
		String userChoice;
		
		System.out.println("Would you like to generate a random number? (Y/N)");
		userChoice = scnr.next();
		
		while(userChoice.equalsIgnoreCase("Y")) {
			System.out.println(randNumGenerator.nextInt());
			System.out.println("Play again? (Y/N)");
			userChoice = scnr.next();
		}
		System.out.println("Thanks for playing. Goodbye!");
		scnr.close();
	}
}