package es.florida.EJERCICIOS.ej_026;

import java.util.ArrayList;
import java.util.Scanner;

public class ej_026 {
	
//	26. Realiza una modificación sobre el programa de las notas (ejercicio 12) implemente la 
//	funcionalidad de determinar la calificación (suspenso, aprobado,…) en un método aparte 
//	(fuera del método “main”). 

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> notas = new ArrayList<Integer>();
		
		Notas nota001 = new Notas();
		
		System.out.println("Introduce el numero de alumnos de la clase: ");
		int alumnos = teclado.nextInt();

		
		System.out.println("Introduce la nota de los alumnos: ");
		for (int i = 0; i < alumnos; i++) {
			
			int nota = teclado.nextInt();
			notas.add(nota);
			
		}
		
		nota001.determinarCalificacion(notas);
		
		System.out.println("Total suspensos: " + nota001.getTotalSuspensos());
		System.out.println("Total aprobados: " + nota001.getTotalAprobados());
		System.out.println("Total notables: " + nota001.getTotalNotables());
		System.out.println("Total matriculas: " + nota001.getTotalMatriculas());
		
		teclado.close();
		
		
	}

}
