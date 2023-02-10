package com.PintorExercise;

import java.util.Scanner;

public class PintorMain {

	public static void main(String[] args) {
		int opc;
		Pintar menuPintar = new Pintar();
		Pintar botesnecesariosPintar = new Pintar();
		Scanner leerValor = new Scanner(System.in);

		do {
			menuPintar.mostrarMenu();
			opc = leerValor.nextInt();
			switch (opc) {
			case 1:
				botesnecesariosPintar.leerDatosPintor1();
				botesnecesariosPintar.getBucketCount(0, 0, 0, 0);
				botesnecesariosPintar.mostrarDatosPintor1();
				break;
			case 2:
				botesnecesariosPintar.leerDatosPintor2();
				botesnecesariosPintar.getBucketCount(0, 0, 0);
				botesnecesariosPintar.mostrarDatosPintor2();
				break;
			case 3:
				botesnecesariosPintar.leerDatosPintor3();
				botesnecesariosPintar.getBucketCount(0, 0);
				botesnecesariosPintar.mostrarDatosPintor3();
				break;
			case 4:
				System.out.println("¡GRACIAS POR USAR EL SISTEMA!");
				break;
			default:
				System.out.println("¡VALOR INGRESADO NO VALIDO!");
				break;
			}
		} while (opc != 4);
		leerValor.close();
	}

}
