package es.florida.EJERCICIOS.ej_037;

import java.util.Scanner;

public class ej_037 {
	
//	37. Escribe un método que pida por teclado el nombre y los años de experiencia como 
//	desarrollador de software y muestre el nivel y el salario en base al siguiente criterio:
//	a. Si lleva menos de 1 año --> “Desarrollador Junior L1 – 15000-18000”
//	b. Si lleva entre 1 y 2 años --> “Desarrollador Junior L2 – 18000-22000”
//	c. Si lleva entre 3 y 5 años --> ”Desarrollador Senior L1 – 22000-28000”
//	d. Si lleva entre 5 y 8 años --> “Desarrollador Senior L2 – 28000-36000”
//	e. Si lleva más de 8 años --> “Analista / Arquitecto. Salario a convenir en base a rol”

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Desarrollador desa001 = new Desarrollador();
		
		System.out.println("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduce los años de experiencia: ");
		float anyos = teclado.nextFloat();
		
		desa001.nivel(nombre, anyos);
		
		teclado.close();
	}

}
