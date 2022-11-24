package es.florida.EJERCICIOS;

import java.util.Scanner;

public class ej_004 {
	
//	 Programa que lea dos números desde teclado y muestre el menor y el mayor en pantalla. Si 
//	 son iguales deberá mostrar un mensaje indicándolo.


	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("El " + num1 + " es mayor que el " + num2);
		} else if(num1 < num2) {
			System.out.println("El " + num2 + " es mayor que el " + num1);
		} else {
			System.out.println("Los dos números son iguales");
		}
		
		teclado.close();
	}

}
