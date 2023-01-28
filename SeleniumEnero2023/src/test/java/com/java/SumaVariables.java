package com.java;

import java.util.Scanner;

public class SumaVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int variable1, variable2, suma;
		Scanner LeerValor = new Scanner(System.in);
		System.out.println("Escribe el primer número que desea sumar");
		variable1 = LeerValor.nextInt();
		System.out.println("Escribe el segundo número que desea sumar");
		variable2 = LeerValor.nextInt();
		suma = variable1 + variable2;
		System.out.println("La suma del número " + variable1 + " más el número " + variable2 + " es: " + suma);
	}

}
