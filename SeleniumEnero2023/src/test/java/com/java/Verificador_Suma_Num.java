package com.java;

import java.util.Scanner;

public class Verificador_Suma_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primer = 0, segundo = 0, tercero = 0;
		Scanner LeerValor = new Scanner(System.in);
		System.out.println("¿Cual es el primer número?");
		primer = LeerValor.nextInt();
		System.out.println("¿Cual es el segundo número?");
		segundo = LeerValor.nextInt();
		System.out.println("¿Cual es el tercer número?");
		tercero = LeerValor.nextInt();

		boolean esMayor = hasEqualSum(primer, segundo, tercero);

		System.out.println("¿El número " + primer + " + " + segundo + " es igual a " + tercero + "? \n" + esMayor);

	}

	public static boolean hasEqualSum(int x, int y, int z) {
		boolean isMayor = false;
		if (x + y == z) {
			isMayor = true;
		} else {
			isMayor = false;
		}
		return isMayor;
	}

}
