package com.daytwo;

import java.util.Scanner;

public class MethodDemo {

	private static double calculateRightCylinderVolume(double radius, double height) {		
		return Math.PI*Math.pow(2, radius)*height;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double radius = scnr.nextDouble();
		double height = scnr.nextDouble();
		
		System.out.println(calculateRightCylinderVolume(radius, height));
		
		scnr.close();
	}

}