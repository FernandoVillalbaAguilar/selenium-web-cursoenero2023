package com.java;

import java.util.Scanner;

public class Es_Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numYear=0;
		Scanner leerValor = new Scanner(System.in);
		System.out.println("Captura el año");
		numYear=leerValor.nextInt();
		boolean isLeap=isLeapYear(numYear);
		System.out.println("El año "+numYear+" es bisiesto? \n" + isLeap);
	}

	public static boolean isLeapYear(int year) {
		boolean esBis = false;
		if (year >= 1 && year <= 9999) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				esBis = true;
			}
		} else {
			esBis = false;
		}
		return esBis;
	}
}
