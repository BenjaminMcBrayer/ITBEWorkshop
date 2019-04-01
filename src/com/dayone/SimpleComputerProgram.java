package com.dayone;

import java.util.Scanner;

public class SimpleComputerProgram {

	public static void main(String[] args) {
		// Scanner makes it possible to get input from keyboard.
		Scanner scnr = new Scanner(System.in);

		// Variables make it possible to store input.
		int x;
		int y;
		int sum;

		// Get value (from keyboard) and store in x.
		x = scnr.nextInt();

		// Get value (from keyboard) and store in y.
		y = scnr.nextInt();

		// Compute sum of x and y.
		sum = x + y;

		// Output sum to console.
		System.out.println(sum);

		scnr.close();
	}
}
