package com.AreaCalculatorExercise;

import java.util.Scanner;

public class AreaCalculatorMain {

	public static void main(String[] args) {
		double radioCirculo = 0;
		double ladoX = 0;
		double ladoY = 0;
		int opc = 0;
		Scanner leerValor = new Scanner(System.in);
		do {
			System.out.println("*****CALCULADORA DE AREAS*****");
			System.out.println("*(1) - CIRCULO               *");
			System.out.println("*(2) - RECTANGULO            *");
			System.out.println("*(3) - SALIR                 *");
			System.out.println("******************************");
			opc = leerValor.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Captura el radio de un Circulo");
				radioCirculo = leerValor.nextDouble();
				double areaCirculo = CircleAreaCalculator.area(radioCirculo);
				if (areaCirculo < 0) {
					System.out.println("El radio ingresado " + areaCirculo + " no es válido \n");
				} else {
					System.out.println("El area del circulo es: \n" + areaCirculo);
				}
				break;
			case 2:
				System.out.println("Captura el valor del lado X");
				ladoX = leerValor.nextDouble();
				System.out.println("Captura el valor del lado Y");
				ladoY = leerValor.nextDouble();
				double areaRectangulo = RectangleAreaCalculator.area(ladoX, ladoY);
				if (areaRectangulo < 0) {
					System.out.println("El valor ingresado " + areaRectangulo + " no es válido \n");
				} else {
					System.out.println("El area del circulo es: \n" + areaRectangulo);
				}
				break;
			case 3:
				System.out.println("¡GRACIAS POR USAR EL SISTEMA!");
				break;
			default:
				System.out.println("¡VALOR INGRESADO NO VALIDO!");
				break;
			}
		} while (opc != 3);
		leerValor.close();
	}
}
