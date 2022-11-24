package es.florida.EJERCICIOS;

import java.util.Scanner;

public class ej_016 {
	
//	 Escribe un programa que dada la fecha de nacimiento de una persona devuelva su número 
//	 de la suerte (utiliza el algoritmo de cálculo que prefieras).

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu fecha de nacimiento: ");
		String fechadenacimiento = teclado.nextLine();
		int dia = Integer.parseInt((fechadenacimiento.substring(0, 2)));
		int mes = Integer.parseInt((fechadenacimiento.substring(3, 5)));
		int anyomillares = Integer.parseInt((fechadenacimiento.substring(6, 7)));
		int anyocentenas = Integer.parseInt((fechadenacimiento.substring(7, 8)));
		int anyodecenas = Integer.parseInt((fechadenacimiento.substring(8, 9)));
		int anyounidades = Integer.parseInt((fechadenacimiento.substring(9, 10)));
		int sumaaux = dia + mes + anyomillares + anyocentenas + anyodecenas + anyounidades;
		int suma = 0;
		if (sumaaux > 9)
		{
			int decenas = sumaaux / 10;
			int unidades = sumaaux % 10;
			suma = decenas + unidades;
		} else {
			suma = sumaaux;
		}
		
		System.out.println("Tu número de la suerte es (" + dia + "," + mes + "," + anyomillares + "," + anyocentenas + "," + anyodecenas + "," + anyounidades + "): " + suma);
		
		teclado.close();

	}

}
