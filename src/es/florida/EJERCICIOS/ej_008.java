package es.florida.EJERCICIOS;

import java.util.Scanner;

public class ej_008 {

//	 Desarrolla un programa que lea por teclado un número del 1 al 12 e indique por pantalla a 
//	 qué mes del año en texto corresponde. Sugerencia: utilizar una estructura de programación 
//	 if … else.

	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num = 1;
		String mes = "";
		
		while (num != 0) {
			System.out.println("Introduce un número (0 para salir): ");
			num = teclado.nextInt();
			if (num == 1) {
				mes = "Enero";
			} else if (num == 2) {
				mes = "Febrero";
			} else if (num == 3) {
				mes = "Marzo";
			} else if (num == 4) {
				mes = "Abril";
			} else if (num == 5) {
				mes = "Mayo";
			} else if (num == 6) {
				mes = "Junio";
			} else if (num == 7) {
				mes = "Julio";
			} else if (num == 8) {
				mes = "Agosto";
			} else if (num == 9) {
				mes = "Septiembre";
			} else if (num == 10) {
				mes = "Octubre";
			} else if (num == 11) {
				mes = "Noviembre";
			} else if (num == 22) {
				mes = "Diciembre";
			} else {
				mes = "el numero no es válido";
			}

			if (num == 0) {
				System.out.println("Hasta la próxima!");
			} else {
				System.out.println("Mes: " + mes);				
			}
		}
		
		
		teclado.close();

	}

}
