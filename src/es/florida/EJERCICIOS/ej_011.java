package es.florida.EJERCICIOS;

import java.util.Scanner;

public class ej_011 {
	
//	 Implementa un programa que dado un DNI (sin letra) por teclado devuelva el DNI con la 
//	 letra correcta.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; 
		char letraDNI;
		
		System.out.println("Introduce tu DNI sin letra: ");
		int dni = teclado.nextInt();
		int resto = dni % 23;
		
		letraDNI = letras[resto];
		
		System.out.println(dni + "-" + letraDNI);
		
		
		teclado.close();

	}

}
