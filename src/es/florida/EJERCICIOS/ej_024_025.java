package es.florida.EJERCICIOS;

import java.util.Scanner;

public class ej_024_025 {

//	24. Escribe un programa que tome como parámetro de entrada (en la llamada al programa) un 
//	número entre 1 y 10, obtenga de forma aleatorio un número (también entre 1 y 10), 
//	compare ambos números, los muestre por pantalla y de un premio (a elegir) si coinciden.
//	25. Ampliar el programa anterior para que permita apostar 3 números a la vez.
	
	public static void main(String[] args) {

		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		
		String premio = "";
		int numero = 0;
		int numeroAleatorio = 0;
		int puntos = 0;

			
			System.out.println("Introduce tres número: ");
			
			for (int i = 0; i < 3; i++) {
				numero = teclado1.nextInt();
				numeroAleatorio = (int)(Math.random()*10+1);
				
				System.out.println(numero + " - " + numeroAleatorio);
				if (numero != numeroAleatorio) {
					System.out.println("No has acertado, intentalo de nuevo");
				} else {
					puntos++;
				}
				
			}
			
			System.out.println("Puntos obtenidos: " + puntos);
		
			
			if (puntos > 0) {
				switch (puntos) {
				case 1: {
					premio = "patinete";
					break;
				}
				case 2: {
					premio = "ordenador";
					break;
				}
				case 3: {
					premio = "coche";
					break;
				}
				default:
					System.out.println("Premio no valido!");
				}
				System.out.println("Enhorabuena, has conseguido un " + premio);
				
			} else {
				System.out.println("Prueba de nuevo!");
			}
		
		teclado2.close();
		teclado1.close();
		
	}
		
}
