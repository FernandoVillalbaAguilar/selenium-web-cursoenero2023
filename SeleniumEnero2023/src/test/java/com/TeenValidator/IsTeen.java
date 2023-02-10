package com.TeenValidator;

import java.util.Scanner;

public class IsTeen {
//atributos
	int num1, num2, num3;

	// metodos
	public void mostrarMenu() {
		System.out.println("******VALIDAR SI ES TEEN******");
		System.out.println("*(1) - 3 VALORES             *");
		System.out.println("*(2) - 1 VALOR               *");
		System.out.println("*(3) - SALIR                 *");
		System.out.println("******************************");
	}

	public void leerDatos1() {
		Scanner leerValorScanner = new Scanner(System.in);
		System.out.println("Captura el primer valor");
		num1 = leerValorScanner.nextInt();
		System.out.println("Captura el segundo valor");
		num2 = leerValorScanner.nextInt();
		System.out.println("Captura el tercer valor");
		num3 = leerValorScanner.nextInt();
	}

	public void leerDatos2() {
		Scanner leerValorScanner = new Scanner(System.in);
		System.out.println("Captura el primer valor");
		num1 = leerValorScanner.nextInt();
	}

	public boolean hasTeen(int num1, int num2, int num3) {

		if (num1 >= 13 && num1 <= 19 || num2 >= 13 && num2 <= 19 || num3 >= 13 && num3 <= 19) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isTeen(int num1) {
		if (num1 >= 13 && num1 <= 19) {
			return true;
		} else {
			return false;
		}
	}

	public void mostrarRespuesta1() {
		boolean valor = hasTeen(num1, num2, num3);
		System.out.println("¿Unos de los valores ingresados es Teen? " + valor);
	}

	public void mostrarRespuesta2() {
		boolean valor = isTeen(num1);
		System.out.println("¿Unos de los valores ingresados es Teen? " + valor);
	}
}
