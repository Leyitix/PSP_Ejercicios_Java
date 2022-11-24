package es.florida.EJERCICIOS.ej_038;

import java.util.ArrayList;

public class Numeros {
	
	ArrayList<Integer> numeros = new ArrayList<Integer>();
	int index = 0;

	public void mostrarNumeros(int primerNumero, int segundoNumero) {
		
		try {
			
			long inicio = System.currentTimeMillis();
			Thread.sleep(3000);
			long fin = System.currentTimeMillis();
			double tiempo = (double) ((fin - inicio)/ 1000);
			System.out.println("\n" + "Tiempo consumido: " + tiempo + " segundos");	
			System.out.println("");
			
		} catch (Exception e) {
			e.addSuppressed(e);
		}
		
		if (primerNumero < segundoNumero) {
			for (int i = primerNumero; i <=segundoNumero; i++) {
				
				if (i % 2 == 0) {
					System.out.println("Número primo: " + i);
				} else {
					System.out.println("Número compuesto: " + i);
				}
				
			}
			
			
		} else {
			System.out.println("El primer numero tiene que ser inferior");
		}
		
		
		
	}
	
}
