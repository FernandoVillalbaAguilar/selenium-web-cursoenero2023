package com.TeenValidator;

import java.util.Scanner;

public class TeenMain {

	public static void main(String[] args) {
		int opc = 0;
		IsTeen esTenn = new IsTeen();
		IsTeen menuIsTeen = new IsTeen();
		Scanner leerValor = new Scanner(System.in);
		do {
			menuIsTeen.mostrarMenu();
			opc = leerValor.nextInt();
			switch (opc) {
			case 1:
				esTenn.leerDatos1();
				esTenn.hasTeen(0, 0, 0);
				esTenn.mostrarRespuesta1();
				break;
			case 2:
				esTenn.leerDatos2();
				esTenn.isTeen(0);
				esTenn.mostrarRespuesta2();
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
