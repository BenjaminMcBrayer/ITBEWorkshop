package com.daytwo;

public class SwitchDemo {

	public static void main(String[] args) {
		int stopLightState = 2;
		
		switch (stopLightState) {
		case 0: 
			System.out.println("GREEN");
		break;
		case 1:
			System.out.println("YELLOW");
			break;
		case 2:
			System.out.println("RED");
			break;
		default:
			System.out.println("OFF");
		}
	}
}