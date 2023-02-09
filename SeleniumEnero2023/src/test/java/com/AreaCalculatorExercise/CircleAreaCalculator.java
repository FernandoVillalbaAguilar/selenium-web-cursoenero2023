package com.AreaCalculatorExercise;

public class CircleAreaCalculator {

	public static double area(double radius) {
		if (radius < 0) {
			return radius;
		} else {
			return Math.PI * radius * radius;
		}
	}

}
