package es.florida.EJERCICIOS;

import java.util.Scanner;

public class ej_006 {
	
//	Realiza un programa que lea cinco números desde teclado y muestre la suma por pantalla. 
//	Sugerencia: utilizar una estructura de bucle.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
		int suma = 0;
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce un número: ");
			num = teclado.nextInt();
			suma+=num;
		}
		
		System.out.println("El resultado de la suma es: " + suma);
		
		teclado.close();

	}

}
