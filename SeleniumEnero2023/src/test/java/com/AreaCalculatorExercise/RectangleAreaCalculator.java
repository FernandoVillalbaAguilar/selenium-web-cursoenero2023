package com.AreaCalculatorExercise;


public class RectangleAreaCalculator {
	public static double area(double x, double y) {
		if (x < 0) {
			return x;
		} else if (y < 0) {
			return y;
		} else {
			return x * y;
		}
	}

}
