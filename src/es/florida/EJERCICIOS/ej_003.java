package es.florida.EJERCICIOS;

import java.util.Scanner;

public class ej_003 {
	
//	 Realiza un programa que lea dos números desde teclado y muestre la suma por pantalla.

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Introduce el primer número: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int num2 = teclado.nextInt();
		
		int suma = num1 + num2;
		System.out.println("El resultado de la suma es: " + suma);
		
		teclado.close();
		

	}

}
