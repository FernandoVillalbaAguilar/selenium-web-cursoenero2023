package com.OrdenarNumerosyNombresenArray;

import java.util.Arrays;
import java.util.Collections;

import com.google.common.primitives.Ints;

public class OrdenarArraysIntAndString {

	public static void main(String[] args) {
		// Menor a mayor y de Mayor a Menor

		int[] a = { 7, 2, 4, 8, 3, 9, 1, 5, 10, 6 };
		String[] nameStrings= {"Armando","Rodrigo","Alex","Bautista","Miguel"};
		
		Arrays.sort(a);
		for (int n : a) {
			System.out.println(n);
		}
		
		Arrays.sort(nameStrings);
		for (String n : nameStrings) {
			System.out.println(n);
		}
		
		Ints.asList(a).sort(Collections.reverseOrder());
		for (int n : a) {
			System.out.println(n);
		}
	
		Arrays.sort(nameStrings,Collections.reverseOrder());
		for (String n : nameStrings) {
			System.out.println(n);
		}
	}
}