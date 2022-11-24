package es.florida.EJERCICIOS;

import java.util.Scanner;

public class ej_005 {

//	 Realiza un programa que lea dos números desde teclado en un bucle repetitivo. El bucle 
//	 deberá finalizar cuando los números leídos sean iguales.

	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
		do {
			System.out.println("Introduce el primer número: ");
			num1 = teclado.nextInt();
			
			System.out.println("Introduce el segundo número: ");
			num2 = teclado.nextInt();
			
			if (num1 > num2) {
				System.out.println("El " + num1 + " es mayor que el " + num2);
			} else if(num1 < num2) {
				System.out.println("El " + num2 + " es mayor que el " + num1);
			} else {
				System.out.println("Los dos números son iguales, fin del bucle!!");
			}
			
		} while (num1 != num2);
		
		teclado.close();

	}

}
