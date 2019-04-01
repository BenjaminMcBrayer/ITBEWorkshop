package com.dayone;
public class ConditionsDemo {

	public static void main(String[] args) {
		int myTwitterFollowers = 40000;
		int yourTwitterFollowers = 30000;

		if (myTwitterFollowers > yourTwitterFollowers) {
			System.out.print("I'm cooler than you");
		} else if (myTwitterFollowers == yourTwitterFollowers) {
			System.out.print("We're the same (in terms of coolness at least).");
		} else {
			System.out.print("You're cooler than me.");
		}
	}
}