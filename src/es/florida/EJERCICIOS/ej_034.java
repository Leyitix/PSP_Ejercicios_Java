package es.florida.EJERCICIOS;

public class ej_034 {
	
//	34. Escribe el código necesario para calcular el factorial del número 15, en menos de 5 
//	instrucciones.

	public static void main(String[] args) {
		
		// variable que define el factorial 
		// y la que marca el número sobre el que lo calculamos
		double factorial = 1;
		double numero = 15;
		
		// decrementamos el número y lo multiplicamos por el valor factorial
		while(numero != 0) {
			factorial = factorial * numero;
			numero--;
		}
		
		// mostramos el valor
		System.out.println(factorial);

		// factorial: multiplicación de los números que van del 1 a dicho número
		
	}

}
