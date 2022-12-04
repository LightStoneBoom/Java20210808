package com.bmi;

public class BMIUtil {
	public static void calcBMI(double height, double weight) {
		double bmi = weight/Math.pow(height/100, 2);
		System.out.printf("height: %.1f weight: %.1f BMI: %.2f\n", weight, height, bmi);
	}
	
	
}
