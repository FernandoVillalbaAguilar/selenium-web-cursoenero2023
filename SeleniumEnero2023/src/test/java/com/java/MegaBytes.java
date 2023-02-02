package com.java;

import java.util.Scanner;

public class MegaBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kb = 0;
		Scanner leerValorScanner = new Scanner(System.in);
		System.out.println("Captura la cantidad en kilobytes");
		kb = leerValorScanner.nextInt();
		printMegaBytesAndKiloBytes(kb);

	}

	public static void printMegaBytesAndKiloBytes(int kilobytes) {
		if (kilobytes < 0) {
			System.out.println("Invalid Value");
		} else {

			System.out.println(kilobytes + "KB = " + kilobytes / 1024 + "MB and " + kilobytes % 1024 + "KB");
		}
	}
}
