package com.AreaCalculatorExercise;

import java.util.Scanner;

public class Area {
	// atributos
	double radius, weight, height;

//metodos
	public void mostrarMenu() {
		System.out.println("*****CALCULADORA DE AREAS*****");
		System.out.println("*(1) - CIRCULO               *");
		System.out.println("*(2) - RECTANGULO            *");
		System.out.println("*(3) - SALIR                 *");
		System.out.println("******************************");
	}

	public void leerDatosCirculo() {
		Scanner leerValor = new Scanner(System.in);
		System.out.println("Captura el radio de un Circulo");
		radius = leerValor.nextDouble();
	}

	public void leerDatosRectangulo() {
		Scanner leerValor = new Scanner(System.in);
		System.out.println("Captura el valor de weight");
		weight = leerValor.nextDouble();
		System.out.println("Captura el valor de height");
		height = leerValor.nextDouble();
	}

	public double area(double radius) {
		if (radius < 0) {
			return radius;
		} else {
			return Math.PI * radius * radius;
		}

	}

	public double area(double weight, double height) {
		if (weight < 0) {
			return weight;
		} else if (height < 0) {
			return height;
		} else {
			return weight * height;
		}
	}

	public void mostrarDatosCirculo() {
		if (area(radius) < 0) {
			System.out.println("El radio ingresado " + area(radius) + " no es válido \n");
		} else {
			System.out.println("El area del circulo es: \n" + area(radius));
		}

	}

	public void mostrarDatosRectangulo() {
		if (area(weight, height) < 0) {
			System.out.println("El valor ingresado " + area(weight, height) + " no es válido \n");
		} else {
			System.out.println("El area del circulo es: \n" + area(weight, height));
		}
	}
}