package com.daytwo;

import java.util.Random;

public class RandomClassRandomNumber {

	public static void main(String[] args) {
		Random randNumGenerator = new Random();
		
		int unboundRand = randNumGenerator.nextInt();
		
		System.out.println(unboundRand);
		
		int boundRand = randNumGenerator.nextInt(6);
		
		System.out.println(boundRand);
	}
}
