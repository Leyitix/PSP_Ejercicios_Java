package es.florida.EJERCICIOS;

import java.util.Scanner;

public class ej_007 {
	
//	Resolver el ejercicio anterior empleando otra estructura de bucle

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
		int suma = 0;
		int nVeces = 0;
		
		while (nVeces < 5) {
			System.out.println("Introduce un número: ");
			num = teclado.nextInt();
			suma+=num;			
			nVeces++;
		}
		
		System.out.println("El resultado de la suma es: " + suma);
		
		teclado.close();

	}

}
