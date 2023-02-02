package com.java;

import java.util.Scanner;

public class Gato_Jugando_Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean esVerano = false;
		int temp = 0;
		Scanner LeerValor = new Scanner(System.in);
		System.out.println("¿Es verano?");
		esVerano = LeerValor.nextBoolean();
		System.out.print("¿Cual es la temperatura actual?");
		temp = LeerValor.nextInt();
		boolean isVerano = isCatPlaying(esVerano, temp);
		System.out.println("¿El gato está jugando? " + isVerano);
	}

	public static boolean isCatPlaying(boolean verano, int temperatura) {
		if (verano == true) {
			if (temperatura >= 25 && temperatura <= 45) {
				return true;
			} else {
				return false;
			}
		} else if (temperatura >= 25 && temperatura <= 35) {
			return true;
		} else {
			return false;
		}
	}

}
