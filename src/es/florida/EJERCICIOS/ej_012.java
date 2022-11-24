package es.florida.EJERCICIOS;

import java.util.Scanner;

public class ej_012 {
	
//	Realiza un programa en Java que dadas 10 notas introducidas por teclado (valores de 0 a 
//			10), las agrupe en suspensos, aprobados, notables, sobresalientes y matrícula, y muestre 
//			por pantalla cuantas notas hay en cada grupo.


	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double nota = 0;
		int alumnos = 10;
		
		int totalSuspensos = 0;
		int totalAprobados = 0;
		int totalNotables = 0;
		int totalSobresalientes = 0;
		int totalMatriculas = 0;

		
		System.out.println("Introduce la nota de 10 alumnos: ");
		for (int i = 0; i < alumnos; i++) {
			nota = teclado.nextDouble();
			
			if (nota < 5) {
				totalSuspensos++;
			} else if (nota >= 5 && nota < 7) {
				totalAprobados++;
			} else if (nota >= 7 && nota < 9) {
				totalNotables++;
			} else if (nota >= 9 && nota < 10) {
				totalSobresalientes++;
			} else if (nota == 10) {
				totalMatriculas++;
			}	
		}
		
		System.out.println("Total suspendidos: " + totalSuspensos);
		System.out.println("Total aprobados: " +  totalAprobados);
		System.out.println("Total notables: " + totalNotables);
		System.out.println("Total sobresalientes: " +  totalSobresalientes);
		System.out.println("Total matrículas: " +  totalMatriculas);
		
		teclado.close();

	}

}
