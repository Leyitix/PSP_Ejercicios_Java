package es.florida.EJERCICIOS.ej_038;

import java.util.Scanner;

public class ej_038 {
	
//	38. Escribe un método que pida por teclado 2 números como extremos de un intervalo. Luego 
//	imprime por pantalla todos los números entre ese intervalo, indicando junto al número si es
//	un número primo o no. Al terminar de mostrar los números por pantalla, debe mostrar un 
//	mensaje indicando el tiempo consumido en la ejecución del método. 

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero: ");
		int primerNumero = teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int segundoNumero = teclado.nextInt();
		
		Numeros num001 = new Numeros();
		num001.mostrarNumeros(primerNumero, segundoNumero);
		
		teclado.close();

	}

}
