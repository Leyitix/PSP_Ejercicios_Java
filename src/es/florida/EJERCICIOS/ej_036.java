package es.florida.EJERCICIOS;

import java.util.ArrayList;
import java.util.Scanner;

public class ej_036 {
	
//	36. Escribe un método que pida 5 números enteros (sin validación de momento), los muestre 
//	por consola en orden inverso y devuelva la suma de todos los números proporcionados.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		ArrayList<Integer> reverseLista = new ArrayList<Integer>();
		int numero;
		int suma = 0;
		
		System.out.println("Introduce 5 numeros: ");
		for (int i = 0; i < 5; i++) {
			numero = teclado.nextInt();
			listaNumeros.add(numero);
		}

		for (int i = listaNumeros.size() -1; i >= 0; i--) {
			reverseLista.add( listaNumeros.get(i) );
		}
		
		for (Integer num : reverseLista) {
			suma+=num;
		}
		
		System.out.println("Suma: " + suma);
		
		teclado.close();

	}

}
