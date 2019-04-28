package com.daytwo;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] theSimpsons = {"Bart", "Lisa", "Homer", "Marge", "Maggie"};
		
		//Print out the first name in the list.
		System.out.println(theSimpsons[0]);
		
		//Print out the last name in the list.
		System.out.println(theSimpsons[theSimpsons.length - 1]);
		
		//Print out all of the names in the same order.
		for (int i = 0; i < theSimpsons.length; ++i) {
			System.out.println(theSimpsons[i]);
		}
	}
}
