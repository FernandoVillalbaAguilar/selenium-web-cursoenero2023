package com.java;

import java.util.Scanner;

public class Impresora_Verificadora_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 0, num3 = 0;
		Scanner leerValor = new Scanner(System.in);
		System.out.println("Captura el primer n�mero");
		num1 = leerValor.nextInt();
		System.out.println("Captura el segundo n�mero");
		num2 = leerValor.nextInt();
		System.out.println("Captura el tercer n�mero");
		num3 = leerValor.nextInt();
		String verifica = imprimirVerificadorNumeros(num1, num2, num3);
		System.out.println("El resultado de la verificaci�n es: \n" + "Primer n�mero [" + num1 + "] Segundo N�mero [" + num2
				+ "] Tercer N�mero [" + num3 + "] \n" + verifica);
	}

	public static String imprimirVerificadorNumeros(int x, int y, int z) {
		String Verificador = "";
		if (x < 0 || y < 0 || z < 0) {
			Verificador = "Valor no valido";
		} else if (x == y && y == z) {
			Verificador = "Todos los n�meros son iguales";
		} else if (x!=y && y!=z){
			Verificador = "Todos los n�meros son diferentes";
		}else {
			Verificador="Ni todos son iguales o diferentes";
		}
		return Verificador;
	}
}
