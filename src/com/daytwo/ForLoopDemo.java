package com.daytwo;

import java.util.Random;
import java.util.Scanner;

public class ForLoopDemo {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random randNumGenerator = new Random();
		int userChoice;
		
		System.out.println("Welcome to the Random Number Generator. How many random numbers would you like to generate?");
		userChoice = scnr.nextInt();
		
		for (int i = 0; i < userChoice; i++) {
			System.out.println(randNumGenerator.nextInt());
		}
		
		System.out.println("Thanks for playing. Goodbye!");
		scnr.close();
	}
}