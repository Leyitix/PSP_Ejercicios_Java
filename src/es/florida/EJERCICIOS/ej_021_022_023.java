package es.florida.EJERCICIOS;

import java.util.ArrayList;
import java.util.Scanner;

public class ej_021_022_023 {

//	21. Crea un programa que almacene en una estructura el nombre de 5 personas que se irán 
//	introduciendo por teclado de uno en uno.
//	22. Modifica el programa anterior para que almacene en una estructura el nombre de un 
//	número cualquiera de personas, introducidos por teclado de uno en uno. La condición de 
//	finalización es introducir un 0 por teclado.
//	23. Amplía el programa anterior para que, una vez tenga almacenados los nombres en una 
//	variable, los muestre por pantalla de uno en uno de la siguiente forma: primera línea: “1. 
//	Primer nombre”, segunda línea: “2. Segundo nombre”,…

	
	public static void main(String[] args) {

		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		
		ArrayList<String> nombresPersonas = new ArrayList<String>();
		int contador = 0;
		int index = 0;
		String nombre = "";
		
		System.out.println("Número de nombres que deseas introducir: ");
		int nVeces = teclado1.nextInt();
		
	
		while (nVeces != 0 && contador < nVeces) {
			
			System.out.println("Introduce el nombre de una persona: ");
			nombre = teclado2.nextLine();
			nombresPersonas.add(nombre);
			contador++;
			
		}
		
		if (nVeces == 0) {
			System.out.println("Hasta la próxima!");
		}
		
		for (String n : nombresPersonas) {
			System.out.println((index++)+1 + ". " + n);
		}
		
		teclado2.close();
		teclado1.close();

	}

}