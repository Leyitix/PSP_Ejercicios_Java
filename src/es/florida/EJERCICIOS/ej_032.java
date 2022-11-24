package es.florida.EJERCICIOS;

import java.util.ArrayList;

public class ej_032 {
	
//	32. Crea un array de elementos que contenga el nombre de 6 compañeros de clase y haz que se 
//	escriban por la consola en líneas consecutivas. Ahora haz lo mismo, pero empleando un 
//	objeto de tipo lista.

	public static void main(String[] args) {
		
		int index = 1;
		int index2 = 1;
		
		String[] nombres = {"Ainhoa", "Adrian", "Christian", "Cesar", "Daniel", "Vanesa"};
		for (String nombre : nombres) {
			System.out.println((index++) + ". " + nombre);
		}
		
		System.out.println("");
		ArrayList<String> nombres2 = new ArrayList<String>();
		nombres2.add("Jose");
		nombres2.add("Rosa");
		nombres2.add("Alejandro");
		nombres2.add("Andrea");
		nombres2.add("Maria");
		nombres2.add("Ramón");
		for (String nombre : nombres2) {
			System.out.println((index2++) + ". " + nombre);
		}
		
	}

}
