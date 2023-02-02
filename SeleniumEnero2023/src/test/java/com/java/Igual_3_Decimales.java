package com.java;

import java.util.Scanner;

public class Igual_3_Decimales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 0, num2 = 0;
		Scanner leerValorScanner = new Scanner(System.in);
		System.out.println("Escribe el primer valor");
		num1 = leerValorScanner.nextDouble();
		System.out.println("Escribe el segundo valor");
		num2 = leerValorScanner.nextDouble();

		boolean tieneTres = areEqualByThreeDecimalPlaces(num1, num2);
		System.out.println("¿Los números tienen los mismos 3 decimales? " + tieneTres);
	}

	public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
		boolean conTresDecimales = false;

		if ((int) (x * 1000) == (int) (y * 1000)) {
			conTresDecimales = true;
		} else {
			conTresDecimales = false;
		}
		return conTresDecimales;
	}

}
