package com.PintorExercise;

import java.util.Scanner;

public class Pintar {
//Atributos
	double width, height, areaPerBucket, area;
	int extraCubos;

// metodos
	public void mostrarMenu() {
		System.out.println("***********CALCULADOR DE CUBETAS DE PINTURA***********");
		System.out.println("*(1) - CALCULAR CON TODOS LOS PARAMETROS             *");
		System.out.println("*(2) - CALCULAR SIN TENER EXTRACUBOS                 *");
		System.out.println("*(3) - CALCULAR CON AREA DE PARED Y AREA POR CUBO    *");
		System.out.println("*(4) - SALIR                                         *");
		System.out.println("******************************************************");
	}

	public void leerDatosPintor1() {
		Scanner leerValor = new Scanner(System.in);
		System.out.println("Captura el valor de width");
		width = leerValor.nextDouble();
		System.out.println("Captura el valor de height");
		height = leerValor.nextDouble();
		System.out.println("Captura el valor del area que se cubre por cubeta");
		areaPerBucket = leerValor.nextDouble();
		System.out.println("Captura el valor de los cubos extra en casa");
		extraCubos = leerValor.nextInt();
	}

	public void leerDatosPintor2() {
		Scanner leerValor = new Scanner(System.in);
		System.out.println("Captura el valor de width");
		width = leerValor.nextDouble();
		System.out.println("Captura el valor de height");
		height = leerValor.nextDouble();
		System.out.println("Captura el valor del area que se cubre por cubeta");
		areaPerBucket = leerValor.nextDouble();
	}

	public void leerDatosPintor3() {
		Scanner leerValor = new Scanner(System.in);
		System.out.println("Captura el valor del area de la pared");
		area = leerValor.nextDouble();
		System.out.println("Captura el valor del area que se cubre por cubeta");
		areaPerBucket = leerValor.nextDouble();
	}

	public int getBucketCount(double width, double height, double areaPerBucket, int extraCubos) {
		int totalcubetas;
		if (width < 0) {
			totalcubetas = (int) width;
		} else if (height < 0) {
			totalcubetas = (int) height;
		} else if (areaPerBucket < 0) {
			totalcubetas = (int) areaPerBucket;
		} else if (extraCubos < 0) {
			totalcubetas = extraCubos;
		} else if (width * height <= areaPerBucket * extraCubos) {
			totalcubetas = (int) Math.round(areaPerBucket * extraCubos);
		} else {
			totalcubetas = (int) Math.round(((width * height) / areaPerBucket) - extraCubos);
		}
		return totalcubetas;
	}

	public int getBucketCount(double width, double height, double areaPerBucket) {
		int totalcubetas = 0;
		if (width < 0) {
			totalcubetas = (int) width;
		} else if (height < 0) {
			totalcubetas = (int) height;
		} else if (areaPerBucket < 0) {
			totalcubetas = (int) areaPerBucket;
		} else {
			totalcubetas = (int) Math.round(((width * height) / areaPerBucket));
		}
		return totalcubetas;
	}

	public int getBucketCount(double area, double areaPerBucket) {
		int totalcubetas = 0;
		if (area < 0) {
			totalcubetas = (int) area;
		} else if (areaPerBucket < 0) {
			totalcubetas = (int) areaPerBucket;
		} else {
			totalcubetas = (int) Math.ceil(area / areaPerBucket);
		}
		return totalcubetas;
	}

	public void mostrarDatosPintor1() {
		if (getBucketCount(width, height, areaPerBucket, extraCubos) < 0) {
			System.out.println("El valor ingresado " + getBucketCount(width, height, areaPerBucket, extraCubos)
					+ " no es válido \n");
		} else {
			System.out.println("Se necesitan " + getBucketCount(width, height, areaPerBucket, extraCubos)
					+ " cubetas para cubrir " + width * height + " metros de area de pared");
		}
	}

	public void mostrarDatosPintor2() {
		if (getBucketCount(width, height, areaPerBucket) < 0) {
			System.out
					.println("El valor ingresado " + getBucketCount(width, height, areaPerBucket) + " no es válido \n");
		} else {
			System.out.println("Se necesitan " + getBucketCount(width, height, areaPerBucket) + " cubetas para cubrir "
					+ width * height + " metros de area de pared");
		}
	}

	public void mostrarDatosPintor3() {
		if (getBucketCount(area, areaPerBucket) < 0) {
			System.out.println("El valor ingresado " + getBucketCount(area, areaPerBucket) + " no es válido \n");
		} else {
			System.out.println("Se necesitan " + getBucketCount(area, areaPerBucket) + " cubetas para cubrir " + area
					+ " metros de area de pared");
		}
	}
}
