package com.java;

import java.util.Scanner;

public class SumaVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int variable1, variable2, suma;
		Scanner LeerValor = new Scanner(System.in);
		System.out.println("Escribe el primer n�mero que desea sumar");
		variable1 = LeerValor.nextInt();
		System.out.println("Escribe el segundo n�mero que desea sumar");
		variable2 = LeerValor.nextInt();
		suma = variable1 + variable2;
		System.out.println("La suma del n�mero " + variable1 + " m�s el n�mero " + variable2 + " es: " + suma);
	}

}
