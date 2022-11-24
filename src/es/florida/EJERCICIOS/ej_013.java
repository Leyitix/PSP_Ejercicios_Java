package es.florida.EJERCICIOS;

import java.util.Scanner;

public class ej_013 {
	
//	 Programa que lea un valor de grados centígrados desde teclado y lo muestre en grados 
//	 Fahrenheit con una precisión de 1 decimal.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la temperatura en ºC: ");
		float num = teclado.nextFloat();

		
		float fahrenheit = (num * 9 / 5) + 32;
		System.out.println("La temperatura es de: " + String.format("%.1f", fahrenheit) + " ºF");
		
		teclado.close();

	}

}
