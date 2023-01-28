package com.java;

import java.util.Scanner;

public class Concatena3Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Texto1, Texto2, Texto3, TextoFinal;

		Scanner LeerValor = new Scanner(System.in);
		System.out.println("Escribe la primer palabra a concatenar");
		Texto1 = LeerValor.next();
		System.out.println("Escribe la segunda palabra a concatenar");
		Texto2 = LeerValor.next();
		System.out.println("Escribe la tercer palabra a concatenar");
		Texto3 = LeerValor.next();

		TextoFinal = Texto1 + " " + Texto2 + " " + Texto3;
		System.out.println("La frase final es: " + TextoFinal);
	}

}
