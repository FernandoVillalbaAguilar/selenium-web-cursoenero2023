package com.java;

import java.util.Scanner;

public class Switch_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Texto1,Opcion;
		do {
		Scanner LeerValor = new Scanner(System.in);
		System.out.println("Escribe Prueba");
		Texto1 = LeerValor.next();

		switch (Texto1.toLowerCase()) {  // El .toLowerCase permite cambiar el texto a minusculas
		case "prueba":
			System.out.println("La prueba fue un exito\n");
			break;
		default:
			System.out.println("Hay una falla\n");
			break;
		}
		System.out.println("¿Desea probar nuevamente?\n-S = Si\n-N = No");
		Opcion = LeerValor.next();
}while(Opcion.toLowerCase().equals("s"));
		System.out.println("¡Gracias por usar!");
	}

}
