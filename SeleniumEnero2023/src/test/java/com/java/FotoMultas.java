package com.java;

import java.util.Scanner;

public class FotoMultas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int VelocidadAuto = 0, VelocidadLimite = 60; // Se asignan variables para definir la velocidad inicial del auto
														// y velocidad limite permitido
		String Respuesta1, Respuesta2; // Se asignan las variables que guardaran las respuestas de las preguntas en
										// string
		boolean Carretera = false, ZonaEscolar = false; // Se asignan las variables iniciandolas con false.

		Scanner LeerValor = new Scanner(System.in); // Permite crear un objeto que leera un valor ingresado
		System.out.println("¿Cual es la velocidad del auto?"); // Se manda la primer pregunta para asignar un valor a la
																// variable VelocidadAuto
		VelocidadAuto = LeerValor.nextInt(); // Se guarda el valor capturado en la variable ValocidadAuto
		System.out.println("¿El auto se encuentra manejando en zona de Carretera? S/N"); // Se muestra la siguiente
																							// pregunta.
		Respuesta1 = LeerValor.next(); // Se guarda el valor en la variable Respuesta1
		if (Respuesta1.equals("S") || Respuesta1.equals("s")) { // Se valida si el valor de la variable Respuesta1 es
																// igual a "S" o "s"
			Carretera = true; // Al cumplirse la condición se cambia el valor de la variable Carretera
			VelocidadLimite = 100; // Al cumplirse la condición se cambia el valir de la variable VelocidadLimite
			if (VelocidadAuto > VelocidadLimite) {
				System.out.println("La velocidad limite para ir en Carretera es de " + VelocidadLimite
						+ " Tu velocidad es de " + VelocidadAuto + " ¡TIENES UNA MULTA!");
			} else if (VelocidadAuto == VelocidadLimite) {
				System.out.println("Tu velocidad está justo al limite");
			} else {
				System.out.println("Tu velocidad está por debajo del limite ¡Bien Hecho!");
			}
		} else if (Respuesta1.equals("N") || Respuesta1.equals("n")) {
			System.out.println("¿El auto se encuentra manejando en zona Escolar? S/N");
			Respuesta2 = LeerValor.next();
			if (Respuesta2.equals("S") || Respuesta2.equals("s")) {
				ZonaEscolar = true;
				VelocidadLimite = 30;
				if (VelocidadAuto > VelocidadLimite) {
					System.out.println("La velocidad limite para ir en Zona Escolar es de " + VelocidadLimite
							+ " Tu velocidad es de " + VelocidadAuto + " ¡TIENES UNA MULTA!");
				} else if (VelocidadAuto == VelocidadLimite) {
					System.out.println("Tu velocidad está justo al limite");
				} else {
					System.out.println("Tu velocidad está por debajo del limite ¡Bien Hecho!");
				}
			} else if (VelocidadAuto > VelocidadLimite) {
				System.out.println("La velocidad limite para ir en calle es de " + VelocidadLimite
						+ " Tu velocidad es de " + VelocidadAuto + " ¡TIENES UNA MULTA!");
			} else if (VelocidadAuto == VelocidadLimite) {
				System.out.println("Tu velocidad está justo al limite");
			} else {
				System.out.println("Tu velocidad está por debajo del limite ¡Bien Hecho!");
			}
		}
	}

}
